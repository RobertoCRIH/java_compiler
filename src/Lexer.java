// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: src/Lexer.flex

import compilerTools.Token;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class Lexer {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\1\1\1\4\22\0\1\1"+
    "\2\0\1\5\1\6\1\0\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\0\1\17\1\20\11\21"+
    "\1\0\1\22\1\23\1\24\1\25\2\0\32\26\4\0"+
    "\1\26\1\0\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\2\26\1\40\1\26\1\41\1\42"+
    "\1\43\1\26\1\44\1\45\1\46\1\47\1\50\1\51"+
    "\1\26\1\52\1\26\1\53\1\0\1\54\7\0\1\3"+
    "\73\0\1\26\7\0\1\26\3\0\1\26\3\0\1\26"+
    "\1\0\1\26\6\0\1\26\1\0\1\26\4\0\1\26"+
    "\7\0\1\26\3\0\1\26\3\0\1\26\1\0\1\26"+
    "\6\0\1\26\1\0\1\26\u012b\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\4\1\1\3\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\2\12\1\13\1\14\1\15\1\16"+
    "\16\17\1\20\1\21\1\0\1\22\1\23\1\24\3\0"+
    "\1\2\2\25\1\26\1\27\1\30\3\17\1\31\4\17"+
    "\1\32\11\17\1\0\4\2\4\17\1\33\1\17\1\34"+
    "\10\17\1\35\2\17\1\0\1\17\1\36\1\37\1\40"+
    "\2\17\1\41\1\17\1\42\2\17\1\43\1\44\3\17"+
    "\1\0\1\45\1\46\1\47\3\17\1\50\1\51\1\52"+
    "\1\0\1\17\1\53\1\54\1\55\1\17\1\56";

  private static int [] zzUnpackAction() {
    int [] result = new int[125];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\55\0\55\0\132\0\207\0\264\0\341\0\u010e"+
    "\0\55\0\55\0\55\0\55\0\55\0\55\0\u013b\0\u0168"+
    "\0\u0195\0\55\0\u01c2\0\u01ef\0\u021c\0\u0249\0\u0276\0\u02a3"+
    "\0\u02d0\0\u02fd\0\u032a\0\u0357\0\u0384\0\u03b1\0\u03de\0\u040b"+
    "\0\u0438\0\u0465\0\u0492\0\55\0\55\0\u04bf\0\u04ec\0\55"+
    "\0\55\0\u010e\0\u0519\0\u0546\0\u0573\0\55\0\u05a0\0\55"+
    "\0\55\0\55\0\u05cd\0\u05fa\0\u0627\0\u0249\0\u0654\0\u0681"+
    "\0\u06ae\0\u06db\0\u0249\0\u0708\0\u0735\0\u0762\0\u078f\0\u07bc"+
    "\0\u07e9\0\u0816\0\u0843\0\u0870\0\u089d\0\u08ca\0\u0519\0\u08f7"+
    "\0\u0924\0\u0951\0\u097e\0\u09ab\0\u09d8\0\u0a05\0\u0a32\0\u0249"+
    "\0\u0a5f\0\u0a8c\0\u0ab9\0\u0ae6\0\u0b13\0\u0b40\0\u0b6d\0\u0b9a"+
    "\0\u0249\0\u0bc7\0\u0bf4\0\u0c21\0\u0c4e\0\u0249\0\u0249\0\u0249"+
    "\0\u0c7b\0\u0ca8\0\u0249\0\u0cd5\0\u0249\0\u0d02\0\u0d2f\0\u0249"+
    "\0\u0249\0\u0d5c\0\u0d89\0\u0db6\0\u0de3\0\u0249\0\u0249\0\u0249"+
    "\0\u0e10\0\u0e3d\0\u0e6a\0\u0249\0\u0249\0\u0249\0\u0e97\0\u0ec4"+
    "\0\u0249\0\u0249\0\55\0\u0ef1\0\u0249";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[125];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\0\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\2\26\1\35\4\26\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\1\26\1\44\1\45"+
    "\57\0\1\3\72\0\2\46\4\0\25\46\30\0\25\47"+
    "\11\0\1\50\55\0\1\51\15\0\25\52\2\0\13\53"+
    "\1\54\3\53\1\55\35\53\20\0\1\56\1\57\53\0"+
    "\2\21\57\0\1\60\54\0\1\61\54\0\1\62\50\0"+
    "\2\26\4\0\25\26\22\0\2\26\4\0\16\26\1\63"+
    "\6\26\22\0\2\26\4\0\14\26\1\64\10\26\22\0"+
    "\2\26\4\0\10\26\1\65\14\26\22\0\2\26\4\0"+
    "\14\26\1\66\10\26\22\0\2\26\4\0\12\26\1\67"+
    "\1\70\11\26\22\0\2\26\4\0\1\26\1\71\12\26"+
    "\1\72\10\26\22\0\2\26\4\0\6\26\1\73\4\26"+
    "\1\74\11\26\22\0\2\26\4\0\5\26\1\75\17\26"+
    "\22\0\2\26\4\0\20\26\1\76\4\26\22\0\2\26"+
    "\4\0\10\26\1\77\5\26\1\100\6\26\22\0\2\26"+
    "\4\0\13\26\1\101\11\26\22\0\2\26\4\0\1\26"+
    "\1\102\23\26\22\0\2\26\4\0\10\26\1\103\5\26"+
    "\1\104\6\26\22\0\2\105\4\0\25\105\22\0\2\47"+
    "\4\0\25\47\2\0\17\53\1\3\54\53\1\106\35\53"+
    "\2\55\1\107\1\55\1\110\12\55\1\111\35\55\20\0"+
    "\2\57\53\0\2\26\4\0\16\26\1\112\6\26\22\0"+
    "\2\26\4\0\14\26\1\113\10\26\22\0\2\26\4\0"+
    "\1\26\1\114\23\26\22\0\2\26\4\0\17\26\1\115"+
    "\5\26\22\0\2\26\4\0\4\26\1\116\20\26\22\0"+
    "\2\26\4\0\12\26\1\117\12\26\22\0\2\26\4\0"+
    "\16\26\1\120\6\26\22\0\2\26\4\0\11\26\1\121"+
    "\6\26\1\122\4\26\22\0\2\26\4\0\1\26\1\123"+
    "\13\26\1\124\7\26\22\0\2\26\4\0\16\26\1\125"+
    "\6\26\22\0\2\26\4\0\5\26\1\126\17\26\22\0"+
    "\2\26\4\0\21\26\1\127\3\26\22\0\2\26\4\0"+
    "\20\26\1\130\4\26\22\0\2\26\4\0\16\26\1\131"+
    "\6\26\22\0\2\26\4\0\11\26\1\132\13\26\22\0"+
    "\2\26\4\0\11\26\1\133\13\26\22\0\2\134\4\0"+
    "\25\134\21\0\1\3\35\0\2\53\1\107\14\53\1\3"+
    "\35\53\2\111\1\3\1\111\1\4\50\111\20\0\2\26"+
    "\4\0\1\26\1\135\23\26\22\0\2\26\4\0\12\26"+
    "\1\136\12\26\22\0\2\26\4\0\16\26\1\137\6\26"+
    "\22\0\2\26\4\0\5\26\1\140\17\26\22\0\2\26"+
    "\4\0\11\26\1\141\13\26\22\0\2\26\4\0\17\26"+
    "\1\142\5\26\22\0\2\26\4\0\20\26\1\143\4\26"+
    "\22\0\2\26\4\0\5\26\1\144\17\26\22\0\2\26"+
    "\4\0\4\26\1\145\20\26\22\0\2\26\4\0\5\26"+
    "\1\146\17\26\22\0\2\26\4\0\11\26\1\147\13\26"+
    "\22\0\2\26\4\0\13\26\1\150\11\26\22\0\2\26"+
    "\4\0\5\26\1\151\17\26\22\0\2\26\4\0\11\26"+
    "\1\152\13\26\22\0\2\26\4\0\12\26\1\153\12\26"+
    "\22\0\2\26\4\0\20\26\1\154\4\26\22\0\2\155"+
    "\4\0\25\155\22\0\2\26\4\0\24\26\1\156\22\0"+
    "\2\26\4\0\6\26\1\157\16\26\22\0\2\26\4\0"+
    "\5\26\1\160\17\26\22\0\2\26\4\0\16\26\1\161"+
    "\6\26\22\0\2\26\4\0\1\26\1\162\23\26\22\0"+
    "\2\26\4\0\13\26\1\163\11\26\22\0\2\26\4\0"+
    "\12\26\1\164\12\26\22\0\2\26\4\0\5\26\1\165"+
    "\17\26\22\0\2\26\4\0\5\26\1\166\17\26\22\0"+
    "\2\167\4\0\25\167\22\0\2\26\4\0\7\26\1\170"+
    "\15\26\22\0\2\26\4\0\20\26\1\171\4\26\22\0"+
    "\2\26\4\0\7\26\1\172\15\26\22\0\2\173\4\0"+
    "\25\173\22\0\2\26\4\0\5\26\1\174\17\26\22\0"+
    "\2\26\4\0\16\26\1\175\6\26\2\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3870];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\5\1\6\11\3\1\1\11\21\1\2\11"+
    "\1\0\1\1\2\11\3\0\1\1\1\11\1\1\3\11"+
    "\22\1\1\0\26\1\1\0\20\1\1\0\11\1\1\0"+
    "\3\1\1\11\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[125];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    private Token token(String lexeme, String lexicalComp, int line, int column){
        return new Token(lexeme, lexicalComp, line+1, column+1);
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return token(yytext(), "ERROR", yyline, yycolumn);
            }
            // fall through
          case 47: break;
          case 2:
            { /Ignorar/
            }
            // fall through
          case 48: break;
          case 3:
            { return token(yytext(), "PARENT. IZQ", yyline, yycolumn);
            }
            // fall through
          case 49: break;
          case 4:
            { return token(yytext(), "PARENT. DER", yyline, yycolumn);
            }
            // fall through
          case 50: break;
          case 5:
            { return token(yytext(), "MULTI", yyline, yycolumn);
            }
            // fall through
          case 51: break;
          case 6:
            { return token(yytext(), "SUMA", yyline, yycolumn);
            }
            // fall through
          case 52: break;
          case 7:
            { return token(yytext(), "COMA", yyline, yycolumn);
            }
            // fall through
          case 53: break;
          case 8:
            { return token(yytext(), "RESTA", yyline, yycolumn);
            }
            // fall through
          case 54: break;
          case 9:
            { return token(yytext(), "DIVISION", yyline, yycolumn);
            }
            // fall through
          case 55: break;
          case 10:
            { return token(yytext(), "NUMERO", yyline, yycolumn);
            }
            // fall through
          case 56: break;
          case 11:
            { return token(yytext(), "PUNTO Y COMA", yyline, yycolumn);
            }
            // fall through
          case 57: break;
          case 12:
            { return token(yytext(), "MENOR QUE", yyline, yycolumn);
            }
            // fall through
          case 58: break;
          case 13:
            { return token(yytext(), "ASIGNACION", yyline, yycolumn);
            }
            // fall through
          case 59: break;
          case 14:
            { return token(yytext(), "MAYOR QUE", yyline, yycolumn);
            }
            // fall through
          case 60: break;
          case 15:
            { return token(yytext(), "ERROR_2", yyline, yycolumn);
            }
            // fall through
          case 61: break;
          case 16:
            { return token(yytext(), "LLAVE IZQ", yyline, yycolumn);
            }
            // fall through
          case 62: break;
          case 17:
            { return token(yytext(), "LLAVE DER", yyline, yycolumn);
            }
            // fall through
          case 63: break;
          case 18:
            { return token(yytext(), "ID", yyline, yycolumn);
            }
            // fall through
          case 64: break;
          case 19:
            { return token(yytext(), "AND", yyline, yycolumn);
            }
            // fall through
          case 65: break;
          case 20:
            { return token(yytext(), "STRING", yyline, yycolumn);
            }
            // fall through
          case 66: break;
          case 21:
            { return token(yytext(), "ERROR_1", yyline, yycolumn);
            }
            // fall through
          case 67: break;
          case 22:
            { return token(yytext(), "MENOR IGUAL QUE", yyline, yycolumn);
            }
            // fall through
          case 68: break;
          case 23:
            { return token(yytext(), "IGUAL QUE", yyline, yycolumn);
            }
            // fall through
          case 69: break;
          case 24:
            { return token(yytext(), "MAYOR IGUAL QUE", yyline, yycolumn);
            }
            // fall through
          case 70: break;
          case 25:
            { return token(yytext(), "DO", yyline, yycolumn);
            }
            // fall through
          case 71: break;
          case 26:
            { return token(yytext(), "SI", yyline, yycolumn);
            }
            // fall through
          case 72: break;
          case 27:
            { return token(yytext(), "TERMINAR", yyline, yycolumn);
            }
            // fall through
          case 73: break;
          case 28:
            { return token(yytext(), "POR", yyline, yycolumn);
            }
            // fall through
          case 74: break;
          case 29:
            { return token(yytext(), "VARIABLE", yyline, yycolumn);
            }
            // fall through
          case 75: break;
          case 30:
            { return token(yytext(), "BULEANO", yyline, yycolumn);
            }
            // fall through
          case 76: break;
          case 31:
            { return token(yytext(), "CARACTER", yyline, yycolumn);
            }
            // fall through
          case 77: break;
          case 32:
            { return token(yytext(), "ELSE", yyline, yycolumn);
            }
            // fall through
          case 78: break;
          case 33:
            { return token(yytext(), "EMPEZAR", yyline, yycolumn);
            }
            // fall through
          case 79: break;
          case 34:
            { return token(yytext(), "LEER", yyline, yycolumn);
            }
            // fall through
          case 80: break;
          case 35:
            { return token(yytext(), "DEPUES", yyline, yycolumn);
            }
            // fall through
          case 81: break;
          case 36:
            { return token(yytext(), "VERDADERO", yyline, yycolumn);
            }
            // fall through
          case 82: break;
          case 37:
            { return token(yytext(), "ARREGLO", yyline, yycolumn);
            }
            // fall through
          case 83: break;
          case 38:
            { return token(yytext(), "TERMINAR SI", yyline, yycolumn);
            }
            // fall through
          case 84: break;
          case 39:
            { return token(yytext(), "FALSO", yyline, yycolumn);
            }
            // fall through
          case 85: break;
          case 40:
            { return token(yytext(), "UNTIL", yyline, yycolumn);
            }
            // fall through
          case 86: break;
          case 41:
            { return token(yytext(), "MIENTRAS", yyline, yycolumn);
            }
            // fall through
          case 87: break;
          case 42:
            { return token(yytext(), "ESCRIBIR", yyline, yycolumn);
            }
            // fall through
          case 88: break;
          case 43:
            { return token(yytext(), "REPETIR", yyline, yycolumn);
            }
            // fall through
          case 89: break;
          case 44:
            { return token(yytext(), "STRING FUNC", yyline, yycolumn);
            }
            // fall through
          case 90: break;
          case 45:
            { return token(yytext(), "COLOR", yyline, yycolumn);
            }
            // fall through
          case 91: break;
          case 46:
            { return token(yytext(), "ENTERO", yyline, yycolumn);
            }
            // fall through
          case 92: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
