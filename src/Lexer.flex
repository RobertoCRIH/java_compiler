import compilerTools.Token;

%%
%class Lexer
%type Token
%line
%column
%{
    private Token token(String lexeme, String lexicalComp, int line, int column){
        return new Token(lexeme, lexicalComp, line+1, column+1);
    }
%}
/* Variables básicas de comentarios y espacios */
TerminadorDeLinea = \r|\n|\r\n
EntradaDeCaracter = [^\r\n]
EspacioEnBlanco = {TerminadorDeLinea} | [ \t\f]
ComentarioTradicional = "/*" [^*] ~"*/" | "/*" "*"+ "/"
FinDeLineaComentario = "//" {EntradaDeCaracter}* {TerminadorDeLinea}?
ContenidoComentario = ( [^*] | \*+ [^/*] )*
ComentarioDeDocumentacion = "/**" {ContenidoComentario} "*"+ "/"

/* Comentario */
Comentario = {ComentarioTradicional} | {FinDeLineaComentario} | {ComentarioDeDocumentacion}

/* Identificador */
Letra = [A-Za-zÑñ_ÁÉÍÓÚáéíóúÜü]
Digito = [0-9]
Identificador = {Letra}({Letra}|{Digito})*

/* Número */
Numero = 0 | [1-9][0-9]*
%%

/* Comentarios o espacios en blanco */
{Comentario}|{EspacioEnBlanco} { /*Ignorar*/ }

/* Identificador */
\${Identificador} { return token(yytext(), "ID", yyline, yycolumn); }

/* Tipos */
int |
var |
string |
bool { return token(yytext(), "TIPO", yyline, yycolumn); }

/* Número */
{Numero} { return token(yytext(), "NUMERO", yyline, yycolumn); }

/* Colores */
#[{Letra}{Digito}]{6} {return token(yytext(), "COLOR", yyline, yycolumn);}


/* Operadores de agrupacion */ 
"(" {return token(yytext(), "PARENTIZQ", yyline, yycolumn);}
")" {return token(yytext(), "PARENTDER", yyline, yycolumn);}
"{" {return token(yytext(), "LLAVEIZQ", yyline, yycolumn);}
"}" {return token(yytext(), "LLAVEDER", yyline, yycolumn);}

/* Cadena */
\'[{Letra}]*\' {return token(yytext(), "STRING", yyline, yycolumn);}

/* Signos de Puntuacion*/
"," {return token(yytext(), "COMA", yyline, yycolumn);}
";" {return token(yytext(), "PUNTO_COMA", yyline, yycolumn);}

/* Operadores */
\= {return token(yytext(), "ASIGNACION", yyline, yycolumn);}
\> {return token(yytext(), "MAYORQUE", yyline, yycolumn);}
>= {return token(yytext(), "MAYOR_IGUALQUE", yyline, yycolumn);}
\< {return token(yytext(), "MENORQUE", yyline, yycolumn);}
\<= {return token(yytext(), "MENOR_IGUALQUE", yyline, yycolumn);}
== {return token(yytext(), "IGUALQUE", yyline, yycolumn);}


/* ARITMETICOS */
\+ {return token(yytext(), "SUMA", yyline, yycolumn);}
\- {return token(yytext(), "RESTA", yyline, yycolumn);}
\* {return token(yytext(), "MULTI", yyline, yycolumn);}
\/ {return token(yytext(), "DIVISION", yyline, yycolumn);}

/* LOGICA */
\&& {return token(yytext(), "AND", yyline, yycolumn);}
\or {return token(yytext(), "OR", yyline, yycolumn);}
/* PALABRAS RESERVADAS */
init {return token(yytext(), "EMPEZAR", yyline, yycolumn);}
end {return token(yytext(), "TERMINAR", yyline, yycolumn);}
array {return token(yytext(), "ARREGLO", yyline, yycolumn);}
then {return token(yytext(), "DEPUES", yyline, yycolumn);}
endif {return token(yytext(), "TERMINAR_SI", yyline, yycolumn);}
interger {return token(yytext(), "ENTERO", yyline, yycolumn);}
repeat {return token(yytext(), "REPETIR", yyline, yycolumn);}
else {return token(yytext(), "ELSE", yyline, yycolumn);}
until {return token(yytext(), "UNTIL", yyline, yycolumn);}
for {return token(yytext(), "POR", yyline, yycolumn);}
write {return token(yytext(), "ESCRIBIR", yyline, yycolumn);}
do {return token(yytext(), "DO", yyline, yycolumn);}
if {return token(yytext(), "SI", yyline, yycolumn);}
char {return token(yytext(), "CARACTER", yyline, yycolumn);}
while {return token(yytext(), "MIENTRAS", yyline, yycolumn);}
read {return token(yytext(), "LEER", yyline, yycolumn);}
true {return token(yytext(), "VERDADERO", yyline, yycolumn);}
false {return token(yytext(), "FALSO", yyline, yycolumn);}


. { return token(yytext(), "ERROR", yyline, yycolumn); }