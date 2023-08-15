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



/* Número */
{Numero} { return token(yytext(), "NUMERO", yyline, yycolumn); }

/* Colores */
#[{Letra}{Digito}]{6} {return token(yytext(), "COLOR", yyline, yycolumn);}


/* Operadores de agrupacion */ 
"(" {return token(yytext(), "PARENT. IZQ", yyline, yycolumn);}
")" {return token(yytext(), "PARENT. DER", yyline, yycolumn);}
"{" {return token(yytext(), "LLAVE IZQ", yyline, yycolumn);}
"}" {return token(yytext(), "LLAVE DER", yyline, yycolumn);}

/* Cadena */
\'[{Letra}]*\' {return token(yytext(), "STRING", yyline, yycolumn);}

/* Signos de Puntuacion*/
"," {return token(yytext(), "COMA", yyline, yycolumn);}
";" {return token(yytext(), "PUNTO Y COMA", yyline, yycolumn);}

/* Operadores */
\= {return token(yytext(), "ASIGNACION", yyline, yycolumn);}
\> {return token(yytext(), "MAYOR QUE", yyline, yycolumn);}
>= {return token(yytext(), "MAYOR IGUAL QUE", yyline, yycolumn);}
\< {return token(yytext(), "MENOR QUE", yyline, yycolumn);}
\<= {return token(yytext(), "MENOR IGUAL QUE", yyline, yycolumn);}
== {return token(yytext(), "IGUAL QUE", yyline, yycolumn);}


/* ARITMETICOS */
\+ {return token(yytext(), "SUMA", yyline, yycolumn);}
\- {return token(yytext(), "RESTA", yyline, yycolumn);}
\* {return token(yytext(), "MULTI", yyline, yycolumn);}
\/ {return token(yytext(), "DIVISION", yyline, yycolumn);}



. { return token(yytext(), "ERROR", yyline, yycolumn); }