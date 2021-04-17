// Generated from com/github/palindromicity/syslog/dsl/generated/Rfc3164.g4 by ANTLR 4.7.2
package com.github.palindromicity.syslog.dsl.generated;

//CHECKSTYLE:OFF
/*
 * Copyright 2018-2021 simple-syslog authors
 * All rights reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Rfc3164Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TAB=1, LF=2, CR=3, SPACE=4, EXCLAMATION=5, QUOTE=6, POUND=7, DOLLAR=8, 
		PERCENT=9, AMPERSAND=10, APOSTROPHE=11, LEFT_PAREN=12, RIGHT_PAREN=13, 
		ASTERISK=14, PLUS=15, COMMA=16, DASH=17, PERIOD=18, SLASH=19, ZERO=20, 
		ONE=21, TWO=22, THREE=23, FOUR=24, FIVE=25, SIX=26, SEVEN=27, EIGHT=28, 
		NINE=29, COLON=30, SEMICOLON=31, LESS_THAN=32, EQUALS=33, GREATER_THAN=34, 
		QUESTION=35, AT=36, CAP_A=37, CAP_B=38, CAP_C=39, CAP_D=40, CAP_E=41, 
		CAP_F=42, CAP_G=43, CAP_H=44, CAP_I=45, CAP_J=46, CAP_K=47, CAP_L=48, 
		CAP_M=49, CAP_N=50, CAP_O=51, CAP_P=52, CAP_Q=53, CAP_R=54, CAP_S=55, 
		CAP_T=56, CAP_U=57, CAP_V=58, CAP_W=59, CAP_X=60, CAP_Y=61, CAP_Z=62, 
		LEFT_BRACE=63, BACKSLASH=64, RIGHT_BRACE=65, CARAT=66, UNDERSCORE=67, 
		ACCENT=68, A=69, B=70, C=71, D=72, E=73, F=74, G=75, H=76, I=77, J=78, 
		K=79, L=80, M=81, N=82, O=83, P=84, Q=85, R=86, S=87, T=88, U=89, V=90, 
		W=91, X=92, Y=93, Z=94, LEFT_CURLY_BRACE=95, PIPE=96, RIGHT_CURLY_BRACE=97, 
		TILDE=98, U_0000=99, U_0001=100, U_0002=101, U_0003=102, U_0004=103, U_0005=104, 
		U_0006=105, U_0007=106, U_0008=107, U_000B=108, U_000C=109, U_000E=110, 
		U_000F=111, U_0010=112, U_0011=113, U_0012=114, U_0013=115, U_0014=116, 
		U_0015=117, U_0016=118, U_0017=119, U_0018=120, U_0019=121, U_001A=122, 
		U_001B=123, U_001C=124, U_001D=125, U_001E=126, U_001F=127, U_007F=128, 
		U_0080=129, U_0081=130, U_0082=131, U_0083=132, U_0084=133, U_0085=134, 
		U_0086=135, U_0087=136, U_0088=137, U_0089=138, U_008A=139, U_008B=140, 
		U_008C=141, U_008D=142, U_008E=143, U_008F=144, U_0090=145, U_0091=146, 
		U_0092=147, U_0093=148, U_0094=149, U_0095=150, U_0096=151, U_0097=152, 
		U_0098=153, U_0099=154, U_009A=155, U_009B=156, U_009C=157, U_009D=158, 
		U_009E=159, U_009F=160, U_00A0=161, U_00A1=162, U_00A2=163, U_00A3=164, 
		U_00A4=165, U_00A5=166, U_00A6=167, U_00A7=168, U_00A8=169, U_00A9=170, 
		U_00AA=171, U_00AB=172, U_00AC=173, U_00AD=174, U_00AE=175, U_00AF=176, 
		U_00B0=177, U_00B1=178, U_00B2=179, U_00B3=180, U_00B4=181, U_00B5=182, 
		U_00B6=183, U_00B7=184, U_00B8=185, U_00B9=186, U_00BA=187, U_00BB=188, 
		U_00BC=189, U_00BD=190, U_00BE=191, U_00BF=192, U_00C0=193, U_00C1=194, 
		U_00C2=195, U_00C3=196, U_00C4=197, U_00C5=198, U_00C6=199, U_00C7=200, 
		U_00C8=201, U_00C9=202, U_00CA=203, U_00CB=204, U_00CC=205, U_00CD=206, 
		U_00CE=207, U_00CF=208, U_00D0=209, U_00D1=210, U_00D2=211, U_00D3=212, 
		U_00D4=213, U_00D5=214, U_00D6=215, U_00D7=216, U_00D8=217, U_00D9=218, 
		U_00DA=219, U_00DB=220, U_00DC=221, U_00DD=222, U_00DE=223, U_00DF=224, 
		U_00E0=225, U_00E1=226, U_00E2=227, U_00E3=228, U_00E4=229, U_00E5=230, 
		U_00E6=231, U_00E7=232, U_00E8=233, U_00E9=234, U_00EA=235, U_00EB=236, 
		U_00EC=237, U_00ED=238, U_00EE=239, U_00EF=240, U_00F0=241, U_00F1=242, 
		U_00F2=243, U_00F3=244, U_00F4=245, U_00F5=246, U_00F6=247, U_00F7=248, 
		U_00F8=249, U_00F9=250, U_00FA=251, U_00FB=252, U_00FC=253, U_00FD=254, 
		U_00FE=255, U_00FF=256, WS=257;
	public static final int
		RULE_octet_prefixed = 0, RULE_syslog_msg = 1, RULE_header = 2, RULE_pri = 3, 
		RULE_prival = 4, RULE_hostname = 5, RULE_timestamp = 6, RULE_date_month_short = 7, 
		RULE_date_day_short = 8, RULE_full_date = 9, RULE_date_fullyear = 10, 
		RULE_date_month = 11, RULE_date_mday = 12, RULE_full_time = 13, RULE_partial_time = 14, 
		RULE_time_hour = 15, RULE_time_minute = 16, RULE_time_second = 17, RULE_time_secfrac = 18, 
		RULE_time_offset = 19, RULE_time_numoffset = 20, RULE_msg = 21, RULE_msg_any = 22, 
		RULE_msg_utf8 = 23, RULE_bom = 24, RULE_utf_8_string = 25, RULE_octet = 26, 
		RULE_sp = 27, RULE_printusascii = 28, RULE_printusasciinospecials = 29, 
		RULE_nonzero_digit = 30, RULE_digit = 31, RULE_capital = 32, RULE_lower = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"octet_prefixed", "syslog_msg", "header", "pri", "prival", "hostname", 
			"timestamp", "date_month_short", "date_day_short", "full_date", "date_fullyear", 
			"date_month", "date_mday", "full_time", "partial_time", "time_hour", 
			"time_minute", "time_second", "time_secfrac", "time_offset", "time_numoffset", 
			"msg", "msg_any", "msg_utf8", "bom", "utf_8_string", "octet", "sp", "printusascii", 
			"printusasciinospecials", "nonzero_digit", "digit", "capital", "lower"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\u0009'", "'\\u000A'", "'\\u000D'", "' '", "'!'", "'\"'", "'#'", 
			"'$'", "'%'", "'&'", "'''", "'('", "')'", "'*'", "'+'", "','", "'-'", 
			"'.'", "'/'", "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", 
			"'8'", "'9'", "':'", "';'", "'<'", "'='", "'>'", "'?'", "'@'", "'A'", 
			"'B'", "'C'", "'D'", "'E'", "'F'", "'G'", "'H'", "'I'", "'J'", "'K'", 
			"'L'", "'M'", "'N'", "'O'", "'P'", "'Q'", "'R'", "'S'", "'T'", "'U'", 
			"'V'", "'W'", "'X'", "'Y'", "'Z'", "'['", "'\\'", "']'", "'^'", "'_'", 
			"'`'", "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'g'", "'h'", "'i'", 
			"'j'", "'k'", "'l'", "'m'", "'n'", "'o'", "'p'", "'q'", "'r'", "'s'", 
			"'t'", "'u'", "'v'", "'w'", "'x'", "'y'", "'z'", "'{'", "'|'", "'}'", 
			"'~'", "'\u0000'", "'\u0001'", "'\u0002'", "'\u0003'", "'\u0004'", "'\u0005'", 
			"'\u0006'", "'\u0007'", "'\u0008'", "'\u000B'", "'\u000C'", "'\u000E'", 
			"'\u000F'", "'\u0010'", "'\u0011'", "'\u0012'", "'\u0013'", "'\u0014'", 
			"'\u0015'", "'\u0016'", "'\u0017'", "'\u0018'", "'\u0019'", "'\u001A'", 
			"'\u001B'", "'\u001C'", "'\u001D'", "'\u001E'", "'\u001F'", "'\u007F'", 
			"'\u0080'", "'\u0081'", "'\u0082'", "'\u0083'", "'\u0084'", "'\u0085'", 
			"'\u0086'", "'\u0087'", "'\u0088'", "'\u0089'", "'\u008A'", "'\u008B'", 
			"'\u008C'", "'\u008D'", "'\u008E'", "'\u008F'", "'\u0090'", "'\u0091'", 
			"'\u0092'", "'\u0093'", "'\u0094'", "'\u0095'", "'\u0096'", "'\u0097'", 
			"'\u0098'", "'\u0099'", "'\u009A'", "'\u009B'", "'\u009C'", "'\u009D'", 
			"'\u009E'", "'\u009F'", "'\u00A0'", "'\u00A1'", "'\u00A2'", "'\u00A3'", 
			"'\u00A4'", "'\u00A5'", "'\u00A6'", "'\u00A7'", "'\u00A8'", "'\u00A9'", 
			"'\u00AA'", "'\u00AB'", "'\u00AC'", "'\u00AD'", "'\u00AE'", "'\u00AF'", 
			"'\u00B0'", "'\u00B1'", "'\u00B2'", "'\u00B3'", "'\u00B4'", "'\u00B5'", 
			"'\u00B6'", "'\u00B7'", "'\u00B8'", "'\u00B9'", "'\u00BA'", "'\u00BB'", 
			"'\u00BC'", "'\u00BD'", "'\u00BE'", "'\u00BF'", "'\u00C0'", "'\u00C1'", 
			"'\u00C2'", "'\u00C3'", "'\u00C4'", "'\u00C5'", "'\u00C6'", "'\u00C7'", 
			"'\u00C8'", "'\u00C9'", "'\u00CA'", "'\u00CB'", "'\u00CC'", "'\u00CD'", 
			"'\u00CE'", "'\u00CF'", "'\u00D0'", "'\u00D1'", "'\u00D2'", "'\u00D3'", 
			"'\u00D4'", "'\u00D5'", "'\u00D6'", "'\u00D7'", "'\u00D8'", "'\u00D9'", 
			"'\u00DA'", "'\u00DB'", "'\u00DC'", "'\u00DD'", "'\u00DE'", "'\u00DF'", 
			"'\u00E0'", "'\u00E1'", "'\u00E2'", "'\u00E3'", "'\u00E4'", "'\u00E5'", 
			"'\u00E6'", "'\u00E7'", "'\u00E8'", "'\u00E9'", "'\u00EA'", "'\u00EB'", 
			"'\u00EC'", "'\u00ED'", "'\u00EE'", "'\u00EF'", "'\u00F0'", "'\u00F1'", 
			"'\u00F2'", "'\u00F3'", "'\u00F4'", "'\u00F5'", "'\u00F6'", "'\u00F7'", 
			"'\u00F8'", "'\u00F9'", "'\u00FA'", "'\u00FB'", "'\u00FC'", "'\u00FD'", 
			"'\u00FE'", "'\u00FF'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TAB", "LF", "CR", "SPACE", "EXCLAMATION", "QUOTE", "POUND", "DOLLAR", 
			"PERCENT", "AMPERSAND", "APOSTROPHE", "LEFT_PAREN", "RIGHT_PAREN", "ASTERISK", 
			"PLUS", "COMMA", "DASH", "PERIOD", "SLASH", "ZERO", "ONE", "TWO", "THREE", 
			"FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "COLON", "SEMICOLON", 
			"LESS_THAN", "EQUALS", "GREATER_THAN", "QUESTION", "AT", "CAP_A", "CAP_B", 
			"CAP_C", "CAP_D", "CAP_E", "CAP_F", "CAP_G", "CAP_H", "CAP_I", "CAP_J", 
			"CAP_K", "CAP_L", "CAP_M", "CAP_N", "CAP_O", "CAP_P", "CAP_Q", "CAP_R", 
			"CAP_S", "CAP_T", "CAP_U", "CAP_V", "CAP_W", "CAP_X", "CAP_Y", "CAP_Z", 
			"LEFT_BRACE", "BACKSLASH", "RIGHT_BRACE", "CARAT", "UNDERSCORE", "ACCENT", 
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "LEFT_CURLY_BRACE", 
			"PIPE", "RIGHT_CURLY_BRACE", "TILDE", "U_0000", "U_0001", "U_0002", "U_0003", 
			"U_0004", "U_0005", "U_0006", "U_0007", "U_0008", "U_000B", "U_000C", 
			"U_000E", "U_000F", "U_0010", "U_0011", "U_0012", "U_0013", "U_0014", 
			"U_0015", "U_0016", "U_0017", "U_0018", "U_0019", "U_001A", "U_001B", 
			"U_001C", "U_001D", "U_001E", "U_001F", "U_007F", "U_0080", "U_0081", 
			"U_0082", "U_0083", "U_0084", "U_0085", "U_0086", "U_0087", "U_0088", 
			"U_0089", "U_008A", "U_008B", "U_008C", "U_008D", "U_008E", "U_008F", 
			"U_0090", "U_0091", "U_0092", "U_0093", "U_0094", "U_0095", "U_0096", 
			"U_0097", "U_0098", "U_0099", "U_009A", "U_009B", "U_009C", "U_009D", 
			"U_009E", "U_009F", "U_00A0", "U_00A1", "U_00A2", "U_00A3", "U_00A4", 
			"U_00A5", "U_00A6", "U_00A7", "U_00A8", "U_00A9", "U_00AA", "U_00AB", 
			"U_00AC", "U_00AD", "U_00AE", "U_00AF", "U_00B0", "U_00B1", "U_00B2", 
			"U_00B3", "U_00B4", "U_00B5", "U_00B6", "U_00B7", "U_00B8", "U_00B9", 
			"U_00BA", "U_00BB", "U_00BC", "U_00BD", "U_00BE", "U_00BF", "U_00C0", 
			"U_00C1", "U_00C2", "U_00C3", "U_00C4", "U_00C5", "U_00C6", "U_00C7", 
			"U_00C8", "U_00C9", "U_00CA", "U_00CB", "U_00CC", "U_00CD", "U_00CE", 
			"U_00CF", "U_00D0", "U_00D1", "U_00D2", "U_00D3", "U_00D4", "U_00D5", 
			"U_00D6", "U_00D7", "U_00D8", "U_00D9", "U_00DA", "U_00DB", "U_00DC", 
			"U_00DD", "U_00DE", "U_00DF", "U_00E0", "U_00E1", "U_00E2", "U_00E3", 
			"U_00E4", "U_00E5", "U_00E6", "U_00E7", "U_00E8", "U_00E9", "U_00EA", 
			"U_00EB", "U_00EC", "U_00ED", "U_00EE", "U_00EF", "U_00F0", "U_00F1", 
			"U_00F2", "U_00F3", "U_00F4", "U_00F5", "U_00F6", "U_00F7", "U_00F8", 
			"U_00F9", "U_00FA", "U_00FB", "U_00FC", "U_00FD", "U_00FE", "U_00FF", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Rfc3164.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Rfc3164Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Octet_prefixedContext extends ParserRuleContext {
		public Nonzero_digitContext nonzero_digit() {
			return getRuleContext(Nonzero_digitContext.class,0);
		}
		public SpContext sp() {
			return getRuleContext(SpContext.class,0);
		}
		public Syslog_msgContext syslog_msg() {
			return getRuleContext(Syslog_msgContext.class,0);
		}
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public Octet_prefixedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octet_prefixed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterOctet_prefixed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitOctet_prefixed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitOctet_prefixed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Octet_prefixedContext octet_prefixed() throws RecognitionException {
		Octet_prefixedContext _localctx = new Octet_prefixedContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_octet_prefixed);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			nonzero_digit();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE))) != 0)) {
				{
				{
				setState(69);
				digit();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			sp();
			setState(76);
			syslog_msg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Syslog_msgContext extends ParserRuleContext {
		public Syslog_msgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syslog_msg; }
	 
		public Syslog_msgContext() { }
		public void copyFrom(Syslog_msgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SyslogMsgContext extends Syslog_msgContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public SpContext sp() {
			return getRuleContext(SpContext.class,0);
		}
		public MsgContext msg() {
			return getRuleContext(MsgContext.class,0);
		}
		public SyslogMsgContext(Syslog_msgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterSyslogMsg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitSyslogMsg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitSyslogMsg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Syslog_msgContext syslog_msg() throws RecognitionException {
		Syslog_msgContext _localctx = new Syslog_msgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_syslog_msg);
		try {
			_localctx = new SyslogMsgContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			header();
			setState(79);
			sp();
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(80);
				msg();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeaderContext extends ParserRuleContext {
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
	 
		public HeaderContext() { }
		public void copyFrom(HeaderContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SyslogHeaderContext extends HeaderContext {
		public TimestampContext timestamp() {
			return getRuleContext(TimestampContext.class,0);
		}
		public List<SpContext> sp() {
			return getRuleContexts(SpContext.class);
		}
		public SpContext sp(int i) {
			return getRuleContext(SpContext.class,i);
		}
		public HostnameContext hostname() {
			return getRuleContext(HostnameContext.class,0);
		}
		public PriContext pri() {
			return getRuleContext(PriContext.class,0);
		}
		public SyslogHeaderContext(HeaderContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterSyslogHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitSyslogHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitSyslogHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_header);
		int _la;
		try {
			_localctx = new SyslogHeaderContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(83);
				pri();
				}
			}

			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(86);
				sp();
				}
			}

			setState(89);
			timestamp();
			setState(90);
			sp();
			setState(91);
			hostname();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PriContext extends ParserRuleContext {
		public PriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pri; }
	 
		public PriContext() { }
		public void copyFrom(PriContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HeaderPriorityContext extends PriContext {
		public TerminalNode LESS_THAN() { return getToken(Rfc3164Parser.LESS_THAN, 0); }
		public PrivalContext prival() {
			return getRuleContext(PrivalContext.class,0);
		}
		public TerminalNode GREATER_THAN() { return getToken(Rfc3164Parser.GREATER_THAN, 0); }
		public HeaderPriorityContext(PriContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterHeaderPriority(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitHeaderPriority(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitHeaderPriority(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PriContext pri() throws RecognitionException {
		PriContext _localctx = new PriContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pri);
		try {
			_localctx = new HeaderPriorityContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(LESS_THAN);
			setState(94);
			prival();
			setState(95);
			match(GREATER_THAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrivalContext extends ParserRuleContext {
		public PrivalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prival; }
	 
		public PrivalContext() { }
		public void copyFrom(PrivalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HeaderPriorityValueContext extends PrivalContext {
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public HeaderPriorityValueContext(PrivalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterHeaderPriorityValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitHeaderPriorityValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitHeaderPriorityValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivalContext prival() throws RecognitionException {
		PrivalContext _localctx = new PrivalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_prival);
		int _la;
		try {
			_localctx = new HeaderPriorityValueContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			digit();
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE))) != 0)) {
					{
					setState(98);
					digit();
					}
				}

				}
				break;
			case 2:
				{
				{
				setState(101);
				digit();
				setState(102);
				digit();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HostnameContext extends ParserRuleContext {
		public HostnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hostname; }
	 
		public HostnameContext() { }
		public void copyFrom(HostnameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HeaderHostNameContext extends HostnameContext {
		public List<PrintusasciiContext> printusascii() {
			return getRuleContexts(PrintusasciiContext.class);
		}
		public PrintusasciiContext printusascii(int i) {
			return getRuleContext(PrintusasciiContext.class,i);
		}
		public HeaderHostNameContext(HostnameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterHeaderHostName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitHeaderHostName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitHeaderHostName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HostnameContext hostname() throws RecognitionException {
		HostnameContext _localctx = new HostnameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_hostname);
		int _la;
		try {
			_localctx = new HeaderHostNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXCLAMATION) | (1L << QUOTE) | (1L << POUND) | (1L << DOLLAR) | (1L << PERCENT) | (1L << AMPERSAND) | (1L << APOSTROPHE) | (1L << LEFT_PAREN) | (1L << RIGHT_PAREN) | (1L << ASTERISK) | (1L << PLUS) | (1L << COMMA) | (1L << DASH) | (1L << PERIOD) | (1L << SLASH) | (1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE) | (1L << COLON) | (1L << SEMICOLON) | (1L << LESS_THAN) | (1L << EQUALS) | (1L << GREATER_THAN) | (1L << QUESTION) | (1L << AT) | (1L << CAP_A) | (1L << CAP_B) | (1L << CAP_C) | (1L << CAP_D) | (1L << CAP_E) | (1L << CAP_F) | (1L << CAP_G) | (1L << CAP_H) | (1L << CAP_I) | (1L << CAP_J) | (1L << CAP_K) | (1L << CAP_L) | (1L << CAP_M) | (1L << CAP_N) | (1L << CAP_O) | (1L << CAP_P) | (1L << CAP_Q) | (1L << CAP_R) | (1L << CAP_S) | (1L << CAP_T) | (1L << CAP_U) | (1L << CAP_V) | (1L << CAP_W) | (1L << CAP_X) | (1L << CAP_Y) | (1L << CAP_Z) | (1L << LEFT_BRACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BACKSLASH - 64)) | (1L << (RIGHT_BRACE - 64)) | (1L << (CARAT - 64)) | (1L << (UNDERSCORE - 64)) | (1L << (ACCENT - 64)) | (1L << (A - 64)) | (1L << (B - 64)) | (1L << (C - 64)) | (1L << (D - 64)) | (1L << (E - 64)) | (1L << (F - 64)) | (1L << (G - 64)) | (1L << (H - 64)) | (1L << (I - 64)) | (1L << (J - 64)) | (1L << (K - 64)) | (1L << (L - 64)) | (1L << (M - 64)) | (1L << (N - 64)) | (1L << (O - 64)) | (1L << (P - 64)) | (1L << (Q - 64)) | (1L << (R - 64)) | (1L << (S - 64)) | (1L << (T - 64)) | (1L << (U - 64)) | (1L << (V - 64)) | (1L << (W - 64)) | (1L << (X - 64)) | (1L << (Y - 64)) | (1L << (Z - 64)) | (1L << (LEFT_CURLY_BRACE - 64)) | (1L << (PIPE - 64)) | (1L << (RIGHT_CURLY_BRACE - 64)) | (1L << (TILDE - 64)))) != 0)) {
				{
				{
				setState(106);
				printusascii();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimestampContext extends ParserRuleContext {
		public TimestampContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestamp; }
	 
		public TimestampContext() { }
		public void copyFrom(TimestampContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HeaderTimeStamp3164Context extends TimestampContext {
		public Date_month_shortContext date_month_short() {
			return getRuleContext(Date_month_shortContext.class,0);
		}
		public Date_day_shortContext date_day_short() {
			return getRuleContext(Date_day_shortContext.class,0);
		}
		public SpContext sp() {
			return getRuleContext(SpContext.class,0);
		}
		public Partial_timeContext partial_time() {
			return getRuleContext(Partial_timeContext.class,0);
		}
		public HeaderTimeStamp3164Context(TimestampContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterHeaderTimeStamp3164(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitHeaderTimeStamp3164(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitHeaderTimeStamp3164(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HeaderTimeStampContext extends TimestampContext {
		public Full_dateContext full_date() {
			return getRuleContext(Full_dateContext.class,0);
		}
		public TerminalNode CAP_T() { return getToken(Rfc3164Parser.CAP_T, 0); }
		public Full_timeContext full_time() {
			return getRuleContext(Full_timeContext.class,0);
		}
		public HeaderTimeStampContext(TimestampContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterHeaderTimeStamp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitHeaderTimeStamp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitHeaderTimeStamp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimestampContext timestamp() throws RecognitionException {
		TimestampContext _localctx = new TimestampContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_timestamp);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ZERO:
			case ONE:
			case TWO:
			case THREE:
			case FOUR:
			case FIVE:
			case SIX:
			case SEVEN:
			case EIGHT:
			case NINE:
				_localctx = new HeaderTimeStampContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(112);
				full_date();
				setState(113);
				match(CAP_T);
				setState(114);
				full_time();
				}
				}
				break;
			case CAP_A:
			case CAP_B:
			case CAP_C:
			case CAP_D:
			case CAP_E:
			case CAP_F:
			case CAP_G:
			case CAP_H:
			case CAP_I:
			case CAP_J:
			case CAP_K:
			case CAP_L:
			case CAP_M:
			case CAP_N:
			case CAP_O:
			case CAP_P:
			case CAP_Q:
			case CAP_R:
			case CAP_S:
			case CAP_T:
			case CAP_U:
			case CAP_V:
			case CAP_W:
			case CAP_X:
			case CAP_Y:
			case CAP_Z:
				_localctx = new HeaderTimeStamp3164Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				date_month_short();
				setState(117);
				date_day_short();
				setState(118);
				sp();
				setState(119);
				partial_time();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date_month_shortContext extends ParserRuleContext {
		public CapitalContext capital() {
			return getRuleContext(CapitalContext.class,0);
		}
		public List<LowerContext> lower() {
			return getRuleContexts(LowerContext.class);
		}
		public LowerContext lower(int i) {
			return getRuleContext(LowerContext.class,i);
		}
		public Date_month_shortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_month_short; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterDate_month_short(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitDate_month_short(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitDate_month_short(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_month_shortContext date_month_short() throws RecognitionException {
		Date_month_shortContext _localctx = new Date_month_shortContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_date_month_short);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			capital();
			setState(124);
			lower();
			setState(125);
			lower();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date_day_shortContext extends ParserRuleContext {
		public List<SpContext> sp() {
			return getRuleContexts(SpContext.class);
		}
		public SpContext sp(int i) {
			return getRuleContext(SpContext.class,i);
		}
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public Date_day_shortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_day_short; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterDate_day_short(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitDate_day_short(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitDate_day_short(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_day_shortContext date_day_short() throws RecognitionException {
		Date_day_shortContext _localctx = new Date_day_shortContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_date_day_short);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			sp();
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(128);
				sp();
				}
			}

			}
			setState(131);
			digit();
			{
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE))) != 0)) {
				{
				setState(132);
				digit();
				}
			}

			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Full_dateContext extends ParserRuleContext {
		public Date_fullyearContext date_fullyear() {
			return getRuleContext(Date_fullyearContext.class,0);
		}
		public List<TerminalNode> DASH() { return getTokens(Rfc3164Parser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(Rfc3164Parser.DASH, i);
		}
		public Date_monthContext date_month() {
			return getRuleContext(Date_monthContext.class,0);
		}
		public Date_mdayContext date_mday() {
			return getRuleContext(Date_mdayContext.class,0);
		}
		public Full_dateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_full_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterFull_date(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitFull_date(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitFull_date(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Full_dateContext full_date() throws RecognitionException {
		Full_dateContext _localctx = new Full_dateContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_full_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			date_fullyear();
			setState(136);
			match(DASH);
			setState(137);
			date_month();
			setState(138);
			match(DASH);
			setState(139);
			date_mday();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date_fullyearContext extends ParserRuleContext {
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public Date_fullyearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_fullyear; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterDate_fullyear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitDate_fullyear(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitDate_fullyear(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_fullyearContext date_fullyear() throws RecognitionException {
		Date_fullyearContext _localctx = new Date_fullyearContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_date_fullyear);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			digit();
			setState(142);
			digit();
			setState(143);
			digit();
			setState(144);
			digit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date_monthContext extends ParserRuleContext {
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public Date_monthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_month; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterDate_month(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitDate_month(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitDate_month(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_monthContext date_month() throws RecognitionException {
		Date_monthContext _localctx = new Date_monthContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_date_month);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			digit();
			setState(147);
			digit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date_mdayContext extends ParserRuleContext {
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public Date_mdayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_mday; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterDate_mday(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitDate_mday(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitDate_mday(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_mdayContext date_mday() throws RecognitionException {
		Date_mdayContext _localctx = new Date_mdayContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_date_mday);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			digit();
			setState(150);
			digit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Full_timeContext extends ParserRuleContext {
		public Partial_timeContext partial_time() {
			return getRuleContext(Partial_timeContext.class,0);
		}
		public Time_offsetContext time_offset() {
			return getRuleContext(Time_offsetContext.class,0);
		}
		public Full_timeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_full_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterFull_time(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitFull_time(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitFull_time(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Full_timeContext full_time() throws RecognitionException {
		Full_timeContext _localctx = new Full_timeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_full_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			partial_time();
			setState(153);
			time_offset();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partial_timeContext extends ParserRuleContext {
		public Time_hourContext time_hour() {
			return getRuleContext(Time_hourContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(Rfc3164Parser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(Rfc3164Parser.COLON, i);
		}
		public Time_minuteContext time_minute() {
			return getRuleContext(Time_minuteContext.class,0);
		}
		public Time_secondContext time_second() {
			return getRuleContext(Time_secondContext.class,0);
		}
		public Time_secfracContext time_secfrac() {
			return getRuleContext(Time_secfracContext.class,0);
		}
		public Partial_timeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partial_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterPartial_time(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitPartial_time(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitPartial_time(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partial_timeContext partial_time() throws RecognitionException {
		Partial_timeContext _localctx = new Partial_timeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_partial_time);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			time_hour();
			setState(156);
			match(COLON);
			setState(157);
			time_minute();
			setState(158);
			match(COLON);
			setState(159);
			time_second();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERIOD) {
				{
				setState(160);
				time_secfrac();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Time_hourContext extends ParserRuleContext {
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public Time_hourContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_hour; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterTime_hour(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitTime_hour(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitTime_hour(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_hourContext time_hour() throws RecognitionException {
		Time_hourContext _localctx = new Time_hourContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_time_hour);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			digit();
			setState(164);
			digit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Time_minuteContext extends ParserRuleContext {
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public Time_minuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_minute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterTime_minute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitTime_minute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitTime_minute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_minuteContext time_minute() throws RecognitionException {
		Time_minuteContext _localctx = new Time_minuteContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_time_minute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			digit();
			setState(167);
			digit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Time_secondContext extends ParserRuleContext {
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public Time_secondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_second; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterTime_second(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitTime_second(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitTime_second(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_secondContext time_second() throws RecognitionException {
		Time_secondContext _localctx = new Time_secondContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_time_second);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			digit();
			setState(170);
			digit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Time_secfracContext extends ParserRuleContext {
		public TerminalNode PERIOD() { return getToken(Rfc3164Parser.PERIOD, 0); }
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public Time_secfracContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_secfrac; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterTime_secfrac(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitTime_secfrac(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitTime_secfrac(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_secfracContext time_secfrac() throws RecognitionException {
		Time_secfracContext _localctx = new Time_secfracContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_time_secfrac);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(PERIOD);
			setState(173);
			digit();
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE))) != 0)) {
					{
					setState(174);
					digit();
					}
				}

				}
				break;
			case 2:
				{
				{
				setState(177);
				digit();
				setState(178);
				digit();
				}
				}
				break;
			case 3:
				{
				{
				setState(180);
				digit();
				setState(181);
				digit();
				setState(182);
				digit();
				}
				}
				break;
			case 4:
				{
				{
				setState(184);
				digit();
				setState(185);
				digit();
				setState(186);
				digit();
				setState(187);
				digit();
				}
				}
				break;
			case 5:
				{
				{
				setState(189);
				digit();
				setState(190);
				digit();
				setState(191);
				digit();
				setState(192);
				digit();
				setState(193);
				digit();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Time_offsetContext extends ParserRuleContext {
		public TerminalNode CAP_Z() { return getToken(Rfc3164Parser.CAP_Z, 0); }
		public Time_numoffsetContext time_numoffset() {
			return getRuleContext(Time_numoffsetContext.class,0);
		}
		public Time_offsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_offset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterTime_offset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitTime_offset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitTime_offset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_offsetContext time_offset() throws RecognitionException {
		Time_offsetContext _localctx = new Time_offsetContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_time_offset);
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CAP_Z:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(CAP_Z);
				}
				break;
			case PLUS:
			case DASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				time_numoffset();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Time_numoffsetContext extends ParserRuleContext {
		public Time_hourContext time_hour() {
			return getRuleContext(Time_hourContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Rfc3164Parser.COLON, 0); }
		public Time_minuteContext time_minute() {
			return getRuleContext(Time_minuteContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(Rfc3164Parser.PLUS, 0); }
		public TerminalNode DASH() { return getToken(Rfc3164Parser.DASH, 0); }
		public Time_numoffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_numoffset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterTime_numoffset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitTime_numoffset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitTime_numoffset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_numoffsetContext time_numoffset() throws RecognitionException {
		Time_numoffsetContext _localctx = new Time_numoffsetContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_time_numoffset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==DASH) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(202);
			time_hour();
			setState(203);
			match(COLON);
			setState(204);
			time_minute();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MsgContext extends ParserRuleContext {
		public MsgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_msg; }
	 
		public MsgContext() { }
		public void copyFrom(MsgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MsgUTF8Context extends MsgContext {
		public Msg_utf8Context msg_utf8() {
			return getRuleContext(Msg_utf8Context.class,0);
		}
		public MsgUTF8Context(MsgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterMsgUTF8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitMsgUTF8(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitMsgUTF8(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MsgAnyContext extends MsgContext {
		public Msg_anyContext msg_any() {
			return getRuleContext(Msg_anyContext.class,0);
		}
		public MsgAnyContext(MsgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterMsgAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitMsgAny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitMsgAny(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MsgContext msg() throws RecognitionException {
		MsgContext _localctx = new MsgContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_msg);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new MsgAnyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				msg_any();
				}
				break;
			case 2:
				_localctx = new MsgUTF8Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				msg_utf8();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Msg_anyContext extends ParserRuleContext {
		public List<OctetContext> octet() {
			return getRuleContexts(OctetContext.class);
		}
		public OctetContext octet(int i) {
			return getRuleContext(OctetContext.class,i);
		}
		public Msg_anyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_msg_any; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterMsg_any(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitMsg_any(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitMsg_any(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Msg_anyContext msg_any() throws RecognitionException {
		Msg_anyContext _localctx = new Msg_anyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_msg_any);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (TAB - 1)) | (1L << (LF - 1)) | (1L << (CR - 1)) | (1L << (SPACE - 1)) | (1L << (EXCLAMATION - 1)) | (1L << (QUOTE - 1)) | (1L << (POUND - 1)) | (1L << (DOLLAR - 1)) | (1L << (PERCENT - 1)) | (1L << (AMPERSAND - 1)) | (1L << (APOSTROPHE - 1)) | (1L << (LEFT_PAREN - 1)) | (1L << (RIGHT_PAREN - 1)) | (1L << (ASTERISK - 1)) | (1L << (PLUS - 1)) | (1L << (COMMA - 1)) | (1L << (DASH - 1)) | (1L << (PERIOD - 1)) | (1L << (SLASH - 1)) | (1L << (ZERO - 1)) | (1L << (ONE - 1)) | (1L << (TWO - 1)) | (1L << (THREE - 1)) | (1L << (FOUR - 1)) | (1L << (FIVE - 1)) | (1L << (SIX - 1)) | (1L << (SEVEN - 1)) | (1L << (EIGHT - 1)) | (1L << (NINE - 1)) | (1L << (COLON - 1)) | (1L << (SEMICOLON - 1)) | (1L << (LESS_THAN - 1)) | (1L << (EQUALS - 1)) | (1L << (GREATER_THAN - 1)) | (1L << (QUESTION - 1)) | (1L << (AT - 1)) | (1L << (CAP_A - 1)) | (1L << (CAP_B - 1)) | (1L << (CAP_C - 1)) | (1L << (CAP_D - 1)) | (1L << (CAP_E - 1)) | (1L << (CAP_F - 1)) | (1L << (CAP_G - 1)) | (1L << (CAP_H - 1)) | (1L << (CAP_I - 1)) | (1L << (CAP_J - 1)) | (1L << (CAP_K - 1)) | (1L << (CAP_L - 1)) | (1L << (CAP_M - 1)) | (1L << (CAP_N - 1)) | (1L << (CAP_O - 1)) | (1L << (CAP_P - 1)) | (1L << (CAP_Q - 1)) | (1L << (CAP_R - 1)) | (1L << (CAP_S - 1)) | (1L << (CAP_T - 1)) | (1L << (CAP_U - 1)) | (1L << (CAP_V - 1)) | (1L << (CAP_W - 1)) | (1L << (CAP_X - 1)) | (1L << (CAP_Y - 1)) | (1L << (CAP_Z - 1)) | (1L << (LEFT_BRACE - 1)) | (1L << (BACKSLASH - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (RIGHT_BRACE - 65)) | (1L << (CARAT - 65)) | (1L << (UNDERSCORE - 65)) | (1L << (ACCENT - 65)) | (1L << (A - 65)) | (1L << (B - 65)) | (1L << (C - 65)) | (1L << (D - 65)) | (1L << (E - 65)) | (1L << (F - 65)) | (1L << (G - 65)) | (1L << (H - 65)) | (1L << (I - 65)) | (1L << (J - 65)) | (1L << (K - 65)) | (1L << (L - 65)) | (1L << (M - 65)) | (1L << (N - 65)) | (1L << (O - 65)) | (1L << (P - 65)) | (1L << (Q - 65)) | (1L << (R - 65)) | (1L << (S - 65)) | (1L << (T - 65)) | (1L << (U - 65)) | (1L << (V - 65)) | (1L << (W - 65)) | (1L << (X - 65)) | (1L << (Y - 65)) | (1L << (Z - 65)) | (1L << (LEFT_CURLY_BRACE - 65)) | (1L << (PIPE - 65)) | (1L << (RIGHT_CURLY_BRACE - 65)) | (1L << (TILDE - 65)) | (1L << (U_0000 - 65)) | (1L << (U_0001 - 65)) | (1L << (U_0002 - 65)) | (1L << (U_0003 - 65)) | (1L << (U_0004 - 65)) | (1L << (U_0005 - 65)) | (1L << (U_0006 - 65)) | (1L << (U_0007 - 65)) | (1L << (U_0008 - 65)) | (1L << (U_000B - 65)) | (1L << (U_000C - 65)) | (1L << (U_000E - 65)) | (1L << (U_000F - 65)) | (1L << (U_0010 - 65)) | (1L << (U_0011 - 65)) | (1L << (U_0012 - 65)) | (1L << (U_0013 - 65)) | (1L << (U_0014 - 65)) | (1L << (U_0015 - 65)) | (1L << (U_0016 - 65)) | (1L << (U_0017 - 65)) | (1L << (U_0018 - 65)) | (1L << (U_0019 - 65)) | (1L << (U_001A - 65)) | (1L << (U_001B - 65)) | (1L << (U_001C - 65)) | (1L << (U_001D - 65)) | (1L << (U_001E - 65)) | (1L << (U_001F - 65)) | (1L << (U_007F - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (U_0080 - 129)) | (1L << (U_0081 - 129)) | (1L << (U_0082 - 129)) | (1L << (U_0083 - 129)) | (1L << (U_0084 - 129)) | (1L << (U_0085 - 129)) | (1L << (U_0086 - 129)) | (1L << (U_0087 - 129)) | (1L << (U_0088 - 129)) | (1L << (U_0089 - 129)) | (1L << (U_008A - 129)) | (1L << (U_008B - 129)) | (1L << (U_008C - 129)) | (1L << (U_008D - 129)) | (1L << (U_008E - 129)) | (1L << (U_008F - 129)) | (1L << (U_0090 - 129)) | (1L << (U_0091 - 129)) | (1L << (U_0092 - 129)) | (1L << (U_0093 - 129)) | (1L << (U_0094 - 129)) | (1L << (U_0095 - 129)) | (1L << (U_0096 - 129)) | (1L << (U_0097 - 129)) | (1L << (U_0098 - 129)) | (1L << (U_0099 - 129)) | (1L << (U_009A - 129)) | (1L << (U_009B - 129)) | (1L << (U_009C - 129)) | (1L << (U_009D - 129)) | (1L << (U_009E - 129)) | (1L << (U_009F - 129)) | (1L << (U_00A0 - 129)) | (1L << (U_00A1 - 129)) | (1L << (U_00A2 - 129)) | (1L << (U_00A3 - 129)) | (1L << (U_00A4 - 129)) | (1L << (U_00A5 - 129)) | (1L << (U_00A6 - 129)) | (1L << (U_00A7 - 129)) | (1L << (U_00A8 - 129)) | (1L << (U_00A9 - 129)) | (1L << (U_00AA - 129)) | (1L << (U_00AB - 129)) | (1L << (U_00AC - 129)) | (1L << (U_00AD - 129)) | (1L << (U_00AE - 129)) | (1L << (U_00AF - 129)) | (1L << (U_00B0 - 129)) | (1L << (U_00B1 - 129)) | (1L << (U_00B2 - 129)) | (1L << (U_00B3 - 129)) | (1L << (U_00B4 - 129)) | (1L << (U_00B5 - 129)) | (1L << (U_00B6 - 129)) | (1L << (U_00B7 - 129)) | (1L << (U_00B8 - 129)) | (1L << (U_00B9 - 129)) | (1L << (U_00BA - 129)) | (1L << (U_00BB - 129)) | (1L << (U_00BC - 129)) | (1L << (U_00BD - 129)) | (1L << (U_00BE - 129)) | (1L << (U_00BF - 129)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (U_00C0 - 193)) | (1L << (U_00C1 - 193)) | (1L << (U_00C2 - 193)) | (1L << (U_00C3 - 193)) | (1L << (U_00C4 - 193)) | (1L << (U_00C5 - 193)) | (1L << (U_00C6 - 193)) | (1L << (U_00C7 - 193)) | (1L << (U_00C8 - 193)) | (1L << (U_00C9 - 193)) | (1L << (U_00CA - 193)) | (1L << (U_00CB - 193)) | (1L << (U_00CC - 193)) | (1L << (U_00CD - 193)) | (1L << (U_00CE - 193)) | (1L << (U_00CF - 193)) | (1L << (U_00D0 - 193)) | (1L << (U_00D1 - 193)) | (1L << (U_00D2 - 193)) | (1L << (U_00D3 - 193)) | (1L << (U_00D4 - 193)) | (1L << (U_00D5 - 193)) | (1L << (U_00D6 - 193)) | (1L << (U_00D7 - 193)) | (1L << (U_00D8 - 193)) | (1L << (U_00D9 - 193)) | (1L << (U_00DA - 193)) | (1L << (U_00DB - 193)) | (1L << (U_00DC - 193)) | (1L << (U_00DD - 193)) | (1L << (U_00DE - 193)) | (1L << (U_00DF - 193)) | (1L << (U_00E0 - 193)) | (1L << (U_00E1 - 193)) | (1L << (U_00E2 - 193)) | (1L << (U_00E3 - 193)) | (1L << (U_00E4 - 193)) | (1L << (U_00E5 - 193)) | (1L << (U_00E6 - 193)) | (1L << (U_00E7 - 193)) | (1L << (U_00E8 - 193)) | (1L << (U_00E9 - 193)) | (1L << (U_00EA - 193)) | (1L << (U_00EB - 193)) | (1L << (U_00EC - 193)) | (1L << (U_00ED - 193)) | (1L << (U_00EE - 193)) | (1L << (U_00EF - 193)) | (1L << (U_00F0 - 193)) | (1L << (U_00F1 - 193)) | (1L << (U_00F2 - 193)) | (1L << (U_00F3 - 193)) | (1L << (U_00F4 - 193)) | (1L << (U_00F5 - 193)) | (1L << (U_00F6 - 193)) | (1L << (U_00F7 - 193)) | (1L << (U_00F8 - 193)) | (1L << (U_00F9 - 193)) | (1L << (U_00FA - 193)) | (1L << (U_00FB - 193)) | (1L << (U_00FC - 193)) | (1L << (U_00FD - 193)) | (1L << (U_00FE - 193)) | (1L << (U_00FF - 193)))) != 0)) {
				{
				{
				setState(210);
				octet();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Msg_utf8Context extends ParserRuleContext {
		public BomContext bom() {
			return getRuleContext(BomContext.class,0);
		}
		public Utf_8_stringContext utf_8_string() {
			return getRuleContext(Utf_8_stringContext.class,0);
		}
		public Msg_utf8Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_msg_utf8; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterMsg_utf8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitMsg_utf8(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitMsg_utf8(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Msg_utf8Context msg_utf8() throws RecognitionException {
		Msg_utf8Context _localctx = new Msg_utf8Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_msg_utf8);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			bom();
			setState(217);
			utf_8_string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BomContext extends ParserRuleContext {
		public TerminalNode U_00EF() { return getToken(Rfc3164Parser.U_00EF, 0); }
		public TerminalNode U_00BB() { return getToken(Rfc3164Parser.U_00BB, 0); }
		public TerminalNode U_00BF() { return getToken(Rfc3164Parser.U_00BF, 0); }
		public BomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterBom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitBom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitBom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BomContext bom() throws RecognitionException {
		BomContext _localctx = new BomContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_bom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_la = _input.LA(1);
			if ( !(((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (U_00BB - 188)) | (1L << (U_00BF - 188)) | (1L << (U_00EF - 188)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Utf_8_stringContext extends ParserRuleContext {
		public List<OctetContext> octet() {
			return getRuleContexts(OctetContext.class);
		}
		public OctetContext octet(int i) {
			return getRuleContext(OctetContext.class,i);
		}
		public Utf_8_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_utf_8_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterUtf_8_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitUtf_8_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitUtf_8_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Utf_8_stringContext utf_8_string() throws RecognitionException {
		Utf_8_stringContext _localctx = new Utf_8_stringContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_utf_8_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (TAB - 1)) | (1L << (LF - 1)) | (1L << (CR - 1)) | (1L << (SPACE - 1)) | (1L << (EXCLAMATION - 1)) | (1L << (QUOTE - 1)) | (1L << (POUND - 1)) | (1L << (DOLLAR - 1)) | (1L << (PERCENT - 1)) | (1L << (AMPERSAND - 1)) | (1L << (APOSTROPHE - 1)) | (1L << (LEFT_PAREN - 1)) | (1L << (RIGHT_PAREN - 1)) | (1L << (ASTERISK - 1)) | (1L << (PLUS - 1)) | (1L << (COMMA - 1)) | (1L << (DASH - 1)) | (1L << (PERIOD - 1)) | (1L << (SLASH - 1)) | (1L << (ZERO - 1)) | (1L << (ONE - 1)) | (1L << (TWO - 1)) | (1L << (THREE - 1)) | (1L << (FOUR - 1)) | (1L << (FIVE - 1)) | (1L << (SIX - 1)) | (1L << (SEVEN - 1)) | (1L << (EIGHT - 1)) | (1L << (NINE - 1)) | (1L << (COLON - 1)) | (1L << (SEMICOLON - 1)) | (1L << (LESS_THAN - 1)) | (1L << (EQUALS - 1)) | (1L << (GREATER_THAN - 1)) | (1L << (QUESTION - 1)) | (1L << (AT - 1)) | (1L << (CAP_A - 1)) | (1L << (CAP_B - 1)) | (1L << (CAP_C - 1)) | (1L << (CAP_D - 1)) | (1L << (CAP_E - 1)) | (1L << (CAP_F - 1)) | (1L << (CAP_G - 1)) | (1L << (CAP_H - 1)) | (1L << (CAP_I - 1)) | (1L << (CAP_J - 1)) | (1L << (CAP_K - 1)) | (1L << (CAP_L - 1)) | (1L << (CAP_M - 1)) | (1L << (CAP_N - 1)) | (1L << (CAP_O - 1)) | (1L << (CAP_P - 1)) | (1L << (CAP_Q - 1)) | (1L << (CAP_R - 1)) | (1L << (CAP_S - 1)) | (1L << (CAP_T - 1)) | (1L << (CAP_U - 1)) | (1L << (CAP_V - 1)) | (1L << (CAP_W - 1)) | (1L << (CAP_X - 1)) | (1L << (CAP_Y - 1)) | (1L << (CAP_Z - 1)) | (1L << (LEFT_BRACE - 1)) | (1L << (BACKSLASH - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (RIGHT_BRACE - 65)) | (1L << (CARAT - 65)) | (1L << (UNDERSCORE - 65)) | (1L << (ACCENT - 65)) | (1L << (A - 65)) | (1L << (B - 65)) | (1L << (C - 65)) | (1L << (D - 65)) | (1L << (E - 65)) | (1L << (F - 65)) | (1L << (G - 65)) | (1L << (H - 65)) | (1L << (I - 65)) | (1L << (J - 65)) | (1L << (K - 65)) | (1L << (L - 65)) | (1L << (M - 65)) | (1L << (N - 65)) | (1L << (O - 65)) | (1L << (P - 65)) | (1L << (Q - 65)) | (1L << (R - 65)) | (1L << (S - 65)) | (1L << (T - 65)) | (1L << (U - 65)) | (1L << (V - 65)) | (1L << (W - 65)) | (1L << (X - 65)) | (1L << (Y - 65)) | (1L << (Z - 65)) | (1L << (LEFT_CURLY_BRACE - 65)) | (1L << (PIPE - 65)) | (1L << (RIGHT_CURLY_BRACE - 65)) | (1L << (TILDE - 65)) | (1L << (U_0000 - 65)) | (1L << (U_0001 - 65)) | (1L << (U_0002 - 65)) | (1L << (U_0003 - 65)) | (1L << (U_0004 - 65)) | (1L << (U_0005 - 65)) | (1L << (U_0006 - 65)) | (1L << (U_0007 - 65)) | (1L << (U_0008 - 65)) | (1L << (U_000B - 65)) | (1L << (U_000C - 65)) | (1L << (U_000E - 65)) | (1L << (U_000F - 65)) | (1L << (U_0010 - 65)) | (1L << (U_0011 - 65)) | (1L << (U_0012 - 65)) | (1L << (U_0013 - 65)) | (1L << (U_0014 - 65)) | (1L << (U_0015 - 65)) | (1L << (U_0016 - 65)) | (1L << (U_0017 - 65)) | (1L << (U_0018 - 65)) | (1L << (U_0019 - 65)) | (1L << (U_001A - 65)) | (1L << (U_001B - 65)) | (1L << (U_001C - 65)) | (1L << (U_001D - 65)) | (1L << (U_001E - 65)) | (1L << (U_001F - 65)) | (1L << (U_007F - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (U_0080 - 129)) | (1L << (U_0081 - 129)) | (1L << (U_0082 - 129)) | (1L << (U_0083 - 129)) | (1L << (U_0084 - 129)) | (1L << (U_0085 - 129)) | (1L << (U_0086 - 129)) | (1L << (U_0087 - 129)) | (1L << (U_0088 - 129)) | (1L << (U_0089 - 129)) | (1L << (U_008A - 129)) | (1L << (U_008B - 129)) | (1L << (U_008C - 129)) | (1L << (U_008D - 129)) | (1L << (U_008E - 129)) | (1L << (U_008F - 129)) | (1L << (U_0090 - 129)) | (1L << (U_0091 - 129)) | (1L << (U_0092 - 129)) | (1L << (U_0093 - 129)) | (1L << (U_0094 - 129)) | (1L << (U_0095 - 129)) | (1L << (U_0096 - 129)) | (1L << (U_0097 - 129)) | (1L << (U_0098 - 129)) | (1L << (U_0099 - 129)) | (1L << (U_009A - 129)) | (1L << (U_009B - 129)) | (1L << (U_009C - 129)) | (1L << (U_009D - 129)) | (1L << (U_009E - 129)) | (1L << (U_009F - 129)) | (1L << (U_00A0 - 129)) | (1L << (U_00A1 - 129)) | (1L << (U_00A2 - 129)) | (1L << (U_00A3 - 129)) | (1L << (U_00A4 - 129)) | (1L << (U_00A5 - 129)) | (1L << (U_00A6 - 129)) | (1L << (U_00A7 - 129)) | (1L << (U_00A8 - 129)) | (1L << (U_00A9 - 129)) | (1L << (U_00AA - 129)) | (1L << (U_00AB - 129)) | (1L << (U_00AC - 129)) | (1L << (U_00AD - 129)) | (1L << (U_00AE - 129)) | (1L << (U_00AF - 129)) | (1L << (U_00B0 - 129)) | (1L << (U_00B1 - 129)) | (1L << (U_00B2 - 129)) | (1L << (U_00B3 - 129)) | (1L << (U_00B4 - 129)) | (1L << (U_00B5 - 129)) | (1L << (U_00B6 - 129)) | (1L << (U_00B7 - 129)) | (1L << (U_00B8 - 129)) | (1L << (U_00B9 - 129)) | (1L << (U_00BA - 129)) | (1L << (U_00BB - 129)) | (1L << (U_00BC - 129)) | (1L << (U_00BD - 129)) | (1L << (U_00BE - 129)) | (1L << (U_00BF - 129)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (U_00C0 - 193)) | (1L << (U_00C1 - 193)) | (1L << (U_00C2 - 193)) | (1L << (U_00C3 - 193)) | (1L << (U_00C4 - 193)) | (1L << (U_00C5 - 193)) | (1L << (U_00C6 - 193)) | (1L << (U_00C7 - 193)) | (1L << (U_00C8 - 193)) | (1L << (U_00C9 - 193)) | (1L << (U_00CA - 193)) | (1L << (U_00CB - 193)) | (1L << (U_00CC - 193)) | (1L << (U_00CD - 193)) | (1L << (U_00CE - 193)) | (1L << (U_00CF - 193)) | (1L << (U_00D0 - 193)) | (1L << (U_00D1 - 193)) | (1L << (U_00D2 - 193)) | (1L << (U_00D3 - 193)) | (1L << (U_00D4 - 193)) | (1L << (U_00D5 - 193)) | (1L << (U_00D6 - 193)) | (1L << (U_00D7 - 193)) | (1L << (U_00D8 - 193)) | (1L << (U_00D9 - 193)) | (1L << (U_00DA - 193)) | (1L << (U_00DB - 193)) | (1L << (U_00DC - 193)) | (1L << (U_00DD - 193)) | (1L << (U_00DE - 193)) | (1L << (U_00DF - 193)) | (1L << (U_00E0 - 193)) | (1L << (U_00E1 - 193)) | (1L << (U_00E2 - 193)) | (1L << (U_00E3 - 193)) | (1L << (U_00E4 - 193)) | (1L << (U_00E5 - 193)) | (1L << (U_00E6 - 193)) | (1L << (U_00E7 - 193)) | (1L << (U_00E8 - 193)) | (1L << (U_00E9 - 193)) | (1L << (U_00EA - 193)) | (1L << (U_00EB - 193)) | (1L << (U_00EC - 193)) | (1L << (U_00ED - 193)) | (1L << (U_00EE - 193)) | (1L << (U_00EF - 193)) | (1L << (U_00F0 - 193)) | (1L << (U_00F1 - 193)) | (1L << (U_00F2 - 193)) | (1L << (U_00F3 - 193)) | (1L << (U_00F4 - 193)) | (1L << (U_00F5 - 193)) | (1L << (U_00F6 - 193)) | (1L << (U_00F7 - 193)) | (1L << (U_00F8 - 193)) | (1L << (U_00F9 - 193)) | (1L << (U_00FA - 193)) | (1L << (U_00FB - 193)) | (1L << (U_00FC - 193)) | (1L << (U_00FD - 193)) | (1L << (U_00FE - 193)) | (1L << (U_00FF - 193)))) != 0)) {
				{
				{
				setState(221);
				octet();
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OctetContext extends ParserRuleContext {
		public TerminalNode U_0000() { return getToken(Rfc3164Parser.U_0000, 0); }
		public TerminalNode U_0001() { return getToken(Rfc3164Parser.U_0001, 0); }
		public TerminalNode U_0002() { return getToken(Rfc3164Parser.U_0002, 0); }
		public TerminalNode U_0003() { return getToken(Rfc3164Parser.U_0003, 0); }
		public TerminalNode U_0004() { return getToken(Rfc3164Parser.U_0004, 0); }
		public TerminalNode U_0005() { return getToken(Rfc3164Parser.U_0005, 0); }
		public TerminalNode U_0006() { return getToken(Rfc3164Parser.U_0006, 0); }
		public TerminalNode U_0007() { return getToken(Rfc3164Parser.U_0007, 0); }
		public TerminalNode U_0008() { return getToken(Rfc3164Parser.U_0008, 0); }
		public TerminalNode TAB() { return getToken(Rfc3164Parser.TAB, 0); }
		public TerminalNode LF() { return getToken(Rfc3164Parser.LF, 0); }
		public TerminalNode U_000B() { return getToken(Rfc3164Parser.U_000B, 0); }
		public TerminalNode U_000C() { return getToken(Rfc3164Parser.U_000C, 0); }
		public TerminalNode CR() { return getToken(Rfc3164Parser.CR, 0); }
		public TerminalNode U_000E() { return getToken(Rfc3164Parser.U_000E, 0); }
		public TerminalNode U_000F() { return getToken(Rfc3164Parser.U_000F, 0); }
		public TerminalNode U_0010() { return getToken(Rfc3164Parser.U_0010, 0); }
		public TerminalNode U_0011() { return getToken(Rfc3164Parser.U_0011, 0); }
		public TerminalNode U_0012() { return getToken(Rfc3164Parser.U_0012, 0); }
		public TerminalNode U_0013() { return getToken(Rfc3164Parser.U_0013, 0); }
		public TerminalNode U_0014() { return getToken(Rfc3164Parser.U_0014, 0); }
		public TerminalNode U_0015() { return getToken(Rfc3164Parser.U_0015, 0); }
		public TerminalNode U_0016() { return getToken(Rfc3164Parser.U_0016, 0); }
		public TerminalNode U_0017() { return getToken(Rfc3164Parser.U_0017, 0); }
		public TerminalNode U_0018() { return getToken(Rfc3164Parser.U_0018, 0); }
		public TerminalNode U_0019() { return getToken(Rfc3164Parser.U_0019, 0); }
		public TerminalNode U_001A() { return getToken(Rfc3164Parser.U_001A, 0); }
		public TerminalNode U_001B() { return getToken(Rfc3164Parser.U_001B, 0); }
		public TerminalNode U_001C() { return getToken(Rfc3164Parser.U_001C, 0); }
		public TerminalNode U_001D() { return getToken(Rfc3164Parser.U_001D, 0); }
		public TerminalNode U_001E() { return getToken(Rfc3164Parser.U_001E, 0); }
		public TerminalNode U_001F() { return getToken(Rfc3164Parser.U_001F, 0); }
		public TerminalNode SPACE() { return getToken(Rfc3164Parser.SPACE, 0); }
		public TerminalNode EXCLAMATION() { return getToken(Rfc3164Parser.EXCLAMATION, 0); }
		public TerminalNode QUOTE() { return getToken(Rfc3164Parser.QUOTE, 0); }
		public TerminalNode POUND() { return getToken(Rfc3164Parser.POUND, 0); }
		public TerminalNode DOLLAR() { return getToken(Rfc3164Parser.DOLLAR, 0); }
		public TerminalNode PERCENT() { return getToken(Rfc3164Parser.PERCENT, 0); }
		public TerminalNode AMPERSAND() { return getToken(Rfc3164Parser.AMPERSAND, 0); }
		public TerminalNode APOSTROPHE() { return getToken(Rfc3164Parser.APOSTROPHE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(Rfc3164Parser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(Rfc3164Parser.RIGHT_PAREN, 0); }
		public TerminalNode ASTERISK() { return getToken(Rfc3164Parser.ASTERISK, 0); }
		public TerminalNode PLUS() { return getToken(Rfc3164Parser.PLUS, 0); }
		public TerminalNode COMMA() { return getToken(Rfc3164Parser.COMMA, 0); }
		public TerminalNode DASH() { return getToken(Rfc3164Parser.DASH, 0); }
		public TerminalNode PERIOD() { return getToken(Rfc3164Parser.PERIOD, 0); }
		public TerminalNode SLASH() { return getToken(Rfc3164Parser.SLASH, 0); }
		public TerminalNode ZERO() { return getToken(Rfc3164Parser.ZERO, 0); }
		public TerminalNode ONE() { return getToken(Rfc3164Parser.ONE, 0); }
		public TerminalNode TWO() { return getToken(Rfc3164Parser.TWO, 0); }
		public TerminalNode THREE() { return getToken(Rfc3164Parser.THREE, 0); }
		public TerminalNode FOUR() { return getToken(Rfc3164Parser.FOUR, 0); }
		public TerminalNode FIVE() { return getToken(Rfc3164Parser.FIVE, 0); }
		public TerminalNode SIX() { return getToken(Rfc3164Parser.SIX, 0); }
		public TerminalNode SEVEN() { return getToken(Rfc3164Parser.SEVEN, 0); }
		public TerminalNode EIGHT() { return getToken(Rfc3164Parser.EIGHT, 0); }
		public TerminalNode NINE() { return getToken(Rfc3164Parser.NINE, 0); }
		public TerminalNode COLON() { return getToken(Rfc3164Parser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(Rfc3164Parser.SEMICOLON, 0); }
		public TerminalNode LESS_THAN() { return getToken(Rfc3164Parser.LESS_THAN, 0); }
		public TerminalNode EQUALS() { return getToken(Rfc3164Parser.EQUALS, 0); }
		public TerminalNode GREATER_THAN() { return getToken(Rfc3164Parser.GREATER_THAN, 0); }
		public TerminalNode QUESTION() { return getToken(Rfc3164Parser.QUESTION, 0); }
		public TerminalNode AT() { return getToken(Rfc3164Parser.AT, 0); }
		public TerminalNode CAP_A() { return getToken(Rfc3164Parser.CAP_A, 0); }
		public TerminalNode CAP_B() { return getToken(Rfc3164Parser.CAP_B, 0); }
		public TerminalNode CAP_C() { return getToken(Rfc3164Parser.CAP_C, 0); }
		public TerminalNode CAP_D() { return getToken(Rfc3164Parser.CAP_D, 0); }
		public TerminalNode CAP_E() { return getToken(Rfc3164Parser.CAP_E, 0); }
		public TerminalNode CAP_F() { return getToken(Rfc3164Parser.CAP_F, 0); }
		public TerminalNode CAP_G() { return getToken(Rfc3164Parser.CAP_G, 0); }
		public TerminalNode CAP_H() { return getToken(Rfc3164Parser.CAP_H, 0); }
		public TerminalNode CAP_I() { return getToken(Rfc3164Parser.CAP_I, 0); }
		public TerminalNode CAP_J() { return getToken(Rfc3164Parser.CAP_J, 0); }
		public TerminalNode CAP_K() { return getToken(Rfc3164Parser.CAP_K, 0); }
		public TerminalNode CAP_L() { return getToken(Rfc3164Parser.CAP_L, 0); }
		public TerminalNode CAP_M() { return getToken(Rfc3164Parser.CAP_M, 0); }
		public TerminalNode CAP_N() { return getToken(Rfc3164Parser.CAP_N, 0); }
		public TerminalNode CAP_O() { return getToken(Rfc3164Parser.CAP_O, 0); }
		public TerminalNode CAP_P() { return getToken(Rfc3164Parser.CAP_P, 0); }
		public TerminalNode CAP_Q() { return getToken(Rfc3164Parser.CAP_Q, 0); }
		public TerminalNode CAP_R() { return getToken(Rfc3164Parser.CAP_R, 0); }
		public TerminalNode CAP_S() { return getToken(Rfc3164Parser.CAP_S, 0); }
		public TerminalNode CAP_T() { return getToken(Rfc3164Parser.CAP_T, 0); }
		public TerminalNode CAP_U() { return getToken(Rfc3164Parser.CAP_U, 0); }
		public TerminalNode CAP_V() { return getToken(Rfc3164Parser.CAP_V, 0); }
		public TerminalNode CAP_W() { return getToken(Rfc3164Parser.CAP_W, 0); }
		public TerminalNode CAP_X() { return getToken(Rfc3164Parser.CAP_X, 0); }
		public TerminalNode CAP_Y() { return getToken(Rfc3164Parser.CAP_Y, 0); }
		public TerminalNode CAP_Z() { return getToken(Rfc3164Parser.CAP_Z, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(Rfc3164Parser.LEFT_BRACE, 0); }
		public TerminalNode BACKSLASH() { return getToken(Rfc3164Parser.BACKSLASH, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(Rfc3164Parser.RIGHT_BRACE, 0); }
		public TerminalNode CARAT() { return getToken(Rfc3164Parser.CARAT, 0); }
		public TerminalNode UNDERSCORE() { return getToken(Rfc3164Parser.UNDERSCORE, 0); }
		public TerminalNode ACCENT() { return getToken(Rfc3164Parser.ACCENT, 0); }
		public TerminalNode A() { return getToken(Rfc3164Parser.A, 0); }
		public TerminalNode B() { return getToken(Rfc3164Parser.B, 0); }
		public TerminalNode C() { return getToken(Rfc3164Parser.C, 0); }
		public TerminalNode D() { return getToken(Rfc3164Parser.D, 0); }
		public TerminalNode E() { return getToken(Rfc3164Parser.E, 0); }
		public TerminalNode F() { return getToken(Rfc3164Parser.F, 0); }
		public TerminalNode G() { return getToken(Rfc3164Parser.G, 0); }
		public TerminalNode H() { return getToken(Rfc3164Parser.H, 0); }
		public TerminalNode I() { return getToken(Rfc3164Parser.I, 0); }
		public TerminalNode J() { return getToken(Rfc3164Parser.J, 0); }
		public TerminalNode K() { return getToken(Rfc3164Parser.K, 0); }
		public TerminalNode L() { return getToken(Rfc3164Parser.L, 0); }
		public TerminalNode M() { return getToken(Rfc3164Parser.M, 0); }
		public TerminalNode N() { return getToken(Rfc3164Parser.N, 0); }
		public TerminalNode O() { return getToken(Rfc3164Parser.O, 0); }
		public TerminalNode P() { return getToken(Rfc3164Parser.P, 0); }
		public TerminalNode Q() { return getToken(Rfc3164Parser.Q, 0); }
		public TerminalNode R() { return getToken(Rfc3164Parser.R, 0); }
		public TerminalNode S() { return getToken(Rfc3164Parser.S, 0); }
		public TerminalNode T() { return getToken(Rfc3164Parser.T, 0); }
		public TerminalNode U() { return getToken(Rfc3164Parser.U, 0); }
		public TerminalNode V() { return getToken(Rfc3164Parser.V, 0); }
		public TerminalNode W() { return getToken(Rfc3164Parser.W, 0); }
		public TerminalNode X() { return getToken(Rfc3164Parser.X, 0); }
		public TerminalNode Y() { return getToken(Rfc3164Parser.Y, 0); }
		public TerminalNode Z() { return getToken(Rfc3164Parser.Z, 0); }
		public TerminalNode LEFT_CURLY_BRACE() { return getToken(Rfc3164Parser.LEFT_CURLY_BRACE, 0); }
		public TerminalNode PIPE() { return getToken(Rfc3164Parser.PIPE, 0); }
		public TerminalNode RIGHT_CURLY_BRACE() { return getToken(Rfc3164Parser.RIGHT_CURLY_BRACE, 0); }
		public TerminalNode TILDE() { return getToken(Rfc3164Parser.TILDE, 0); }
		public TerminalNode U_007F() { return getToken(Rfc3164Parser.U_007F, 0); }
		public TerminalNode U_0080() { return getToken(Rfc3164Parser.U_0080, 0); }
		public TerminalNode U_0081() { return getToken(Rfc3164Parser.U_0081, 0); }
		public TerminalNode U_0082() { return getToken(Rfc3164Parser.U_0082, 0); }
		public TerminalNode U_0083() { return getToken(Rfc3164Parser.U_0083, 0); }
		public TerminalNode U_0084() { return getToken(Rfc3164Parser.U_0084, 0); }
		public TerminalNode U_0085() { return getToken(Rfc3164Parser.U_0085, 0); }
		public TerminalNode U_0086() { return getToken(Rfc3164Parser.U_0086, 0); }
		public TerminalNode U_0087() { return getToken(Rfc3164Parser.U_0087, 0); }
		public TerminalNode U_0088() { return getToken(Rfc3164Parser.U_0088, 0); }
		public TerminalNode U_0089() { return getToken(Rfc3164Parser.U_0089, 0); }
		public TerminalNode U_008A() { return getToken(Rfc3164Parser.U_008A, 0); }
		public TerminalNode U_008B() { return getToken(Rfc3164Parser.U_008B, 0); }
		public TerminalNode U_008C() { return getToken(Rfc3164Parser.U_008C, 0); }
		public TerminalNode U_008D() { return getToken(Rfc3164Parser.U_008D, 0); }
		public TerminalNode U_008E() { return getToken(Rfc3164Parser.U_008E, 0); }
		public TerminalNode U_008F() { return getToken(Rfc3164Parser.U_008F, 0); }
		public TerminalNode U_0090() { return getToken(Rfc3164Parser.U_0090, 0); }
		public TerminalNode U_0091() { return getToken(Rfc3164Parser.U_0091, 0); }
		public TerminalNode U_0092() { return getToken(Rfc3164Parser.U_0092, 0); }
		public TerminalNode U_0093() { return getToken(Rfc3164Parser.U_0093, 0); }
		public TerminalNode U_0094() { return getToken(Rfc3164Parser.U_0094, 0); }
		public TerminalNode U_0095() { return getToken(Rfc3164Parser.U_0095, 0); }
		public TerminalNode U_0096() { return getToken(Rfc3164Parser.U_0096, 0); }
		public TerminalNode U_0097() { return getToken(Rfc3164Parser.U_0097, 0); }
		public TerminalNode U_0098() { return getToken(Rfc3164Parser.U_0098, 0); }
		public TerminalNode U_0099() { return getToken(Rfc3164Parser.U_0099, 0); }
		public TerminalNode U_009A() { return getToken(Rfc3164Parser.U_009A, 0); }
		public TerminalNode U_009B() { return getToken(Rfc3164Parser.U_009B, 0); }
		public TerminalNode U_009C() { return getToken(Rfc3164Parser.U_009C, 0); }
		public TerminalNode U_009D() { return getToken(Rfc3164Parser.U_009D, 0); }
		public TerminalNode U_009E() { return getToken(Rfc3164Parser.U_009E, 0); }
		public TerminalNode U_009F() { return getToken(Rfc3164Parser.U_009F, 0); }
		public TerminalNode U_00A0() { return getToken(Rfc3164Parser.U_00A0, 0); }
		public TerminalNode U_00A1() { return getToken(Rfc3164Parser.U_00A1, 0); }
		public TerminalNode U_00A2() { return getToken(Rfc3164Parser.U_00A2, 0); }
		public TerminalNode U_00A3() { return getToken(Rfc3164Parser.U_00A3, 0); }
		public TerminalNode U_00A4() { return getToken(Rfc3164Parser.U_00A4, 0); }
		public TerminalNode U_00A5() { return getToken(Rfc3164Parser.U_00A5, 0); }
		public TerminalNode U_00A6() { return getToken(Rfc3164Parser.U_00A6, 0); }
		public TerminalNode U_00A7() { return getToken(Rfc3164Parser.U_00A7, 0); }
		public TerminalNode U_00A8() { return getToken(Rfc3164Parser.U_00A8, 0); }
		public TerminalNode U_00A9() { return getToken(Rfc3164Parser.U_00A9, 0); }
		public TerminalNode U_00AA() { return getToken(Rfc3164Parser.U_00AA, 0); }
		public TerminalNode U_00AB() { return getToken(Rfc3164Parser.U_00AB, 0); }
		public TerminalNode U_00AC() { return getToken(Rfc3164Parser.U_00AC, 0); }
		public TerminalNode U_00AD() { return getToken(Rfc3164Parser.U_00AD, 0); }
		public TerminalNode U_00AE() { return getToken(Rfc3164Parser.U_00AE, 0); }
		public TerminalNode U_00AF() { return getToken(Rfc3164Parser.U_00AF, 0); }
		public TerminalNode U_00B0() { return getToken(Rfc3164Parser.U_00B0, 0); }
		public TerminalNode U_00B1() { return getToken(Rfc3164Parser.U_00B1, 0); }
		public TerminalNode U_00B2() { return getToken(Rfc3164Parser.U_00B2, 0); }
		public TerminalNode U_00B3() { return getToken(Rfc3164Parser.U_00B3, 0); }
		public TerminalNode U_00B4() { return getToken(Rfc3164Parser.U_00B4, 0); }
		public TerminalNode U_00B5() { return getToken(Rfc3164Parser.U_00B5, 0); }
		public TerminalNode U_00B6() { return getToken(Rfc3164Parser.U_00B6, 0); }
		public TerminalNode U_00B7() { return getToken(Rfc3164Parser.U_00B7, 0); }
		public TerminalNode U_00B8() { return getToken(Rfc3164Parser.U_00B8, 0); }
		public TerminalNode U_00B9() { return getToken(Rfc3164Parser.U_00B9, 0); }
		public TerminalNode U_00BA() { return getToken(Rfc3164Parser.U_00BA, 0); }
		public TerminalNode U_00BB() { return getToken(Rfc3164Parser.U_00BB, 0); }
		public TerminalNode U_00BC() { return getToken(Rfc3164Parser.U_00BC, 0); }
		public TerminalNode U_00BD() { return getToken(Rfc3164Parser.U_00BD, 0); }
		public TerminalNode U_00BE() { return getToken(Rfc3164Parser.U_00BE, 0); }
		public TerminalNode U_00BF() { return getToken(Rfc3164Parser.U_00BF, 0); }
		public TerminalNode U_00C0() { return getToken(Rfc3164Parser.U_00C0, 0); }
		public TerminalNode U_00C1() { return getToken(Rfc3164Parser.U_00C1, 0); }
		public TerminalNode U_00C2() { return getToken(Rfc3164Parser.U_00C2, 0); }
		public TerminalNode U_00C3() { return getToken(Rfc3164Parser.U_00C3, 0); }
		public TerminalNode U_00C4() { return getToken(Rfc3164Parser.U_00C4, 0); }
		public TerminalNode U_00C5() { return getToken(Rfc3164Parser.U_00C5, 0); }
		public TerminalNode U_00C6() { return getToken(Rfc3164Parser.U_00C6, 0); }
		public TerminalNode U_00C7() { return getToken(Rfc3164Parser.U_00C7, 0); }
		public TerminalNode U_00C8() { return getToken(Rfc3164Parser.U_00C8, 0); }
		public TerminalNode U_00C9() { return getToken(Rfc3164Parser.U_00C9, 0); }
		public TerminalNode U_00CA() { return getToken(Rfc3164Parser.U_00CA, 0); }
		public TerminalNode U_00CB() { return getToken(Rfc3164Parser.U_00CB, 0); }
		public TerminalNode U_00CC() { return getToken(Rfc3164Parser.U_00CC, 0); }
		public TerminalNode U_00CD() { return getToken(Rfc3164Parser.U_00CD, 0); }
		public TerminalNode U_00CE() { return getToken(Rfc3164Parser.U_00CE, 0); }
		public TerminalNode U_00CF() { return getToken(Rfc3164Parser.U_00CF, 0); }
		public TerminalNode U_00D0() { return getToken(Rfc3164Parser.U_00D0, 0); }
		public TerminalNode U_00D1() { return getToken(Rfc3164Parser.U_00D1, 0); }
		public TerminalNode U_00D2() { return getToken(Rfc3164Parser.U_00D2, 0); }
		public TerminalNode U_00D3() { return getToken(Rfc3164Parser.U_00D3, 0); }
		public TerminalNode U_00D4() { return getToken(Rfc3164Parser.U_00D4, 0); }
		public TerminalNode U_00D5() { return getToken(Rfc3164Parser.U_00D5, 0); }
		public TerminalNode U_00D6() { return getToken(Rfc3164Parser.U_00D6, 0); }
		public TerminalNode U_00D7() { return getToken(Rfc3164Parser.U_00D7, 0); }
		public TerminalNode U_00D8() { return getToken(Rfc3164Parser.U_00D8, 0); }
		public TerminalNode U_00D9() { return getToken(Rfc3164Parser.U_00D9, 0); }
		public TerminalNode U_00DA() { return getToken(Rfc3164Parser.U_00DA, 0); }
		public TerminalNode U_00DB() { return getToken(Rfc3164Parser.U_00DB, 0); }
		public TerminalNode U_00DC() { return getToken(Rfc3164Parser.U_00DC, 0); }
		public TerminalNode U_00DD() { return getToken(Rfc3164Parser.U_00DD, 0); }
		public TerminalNode U_00DE() { return getToken(Rfc3164Parser.U_00DE, 0); }
		public TerminalNode U_00DF() { return getToken(Rfc3164Parser.U_00DF, 0); }
		public TerminalNode U_00E0() { return getToken(Rfc3164Parser.U_00E0, 0); }
		public TerminalNode U_00E1() { return getToken(Rfc3164Parser.U_00E1, 0); }
		public TerminalNode U_00E2() { return getToken(Rfc3164Parser.U_00E2, 0); }
		public TerminalNode U_00E3() { return getToken(Rfc3164Parser.U_00E3, 0); }
		public TerminalNode U_00E4() { return getToken(Rfc3164Parser.U_00E4, 0); }
		public TerminalNode U_00E5() { return getToken(Rfc3164Parser.U_00E5, 0); }
		public TerminalNode U_00E6() { return getToken(Rfc3164Parser.U_00E6, 0); }
		public TerminalNode U_00E7() { return getToken(Rfc3164Parser.U_00E7, 0); }
		public TerminalNode U_00E8() { return getToken(Rfc3164Parser.U_00E8, 0); }
		public TerminalNode U_00E9() { return getToken(Rfc3164Parser.U_00E9, 0); }
		public TerminalNode U_00EA() { return getToken(Rfc3164Parser.U_00EA, 0); }
		public TerminalNode U_00EB() { return getToken(Rfc3164Parser.U_00EB, 0); }
		public TerminalNode U_00EC() { return getToken(Rfc3164Parser.U_00EC, 0); }
		public TerminalNode U_00ED() { return getToken(Rfc3164Parser.U_00ED, 0); }
		public TerminalNode U_00EE() { return getToken(Rfc3164Parser.U_00EE, 0); }
		public TerminalNode U_00EF() { return getToken(Rfc3164Parser.U_00EF, 0); }
		public TerminalNode U_00F0() { return getToken(Rfc3164Parser.U_00F0, 0); }
		public TerminalNode U_00F1() { return getToken(Rfc3164Parser.U_00F1, 0); }
		public TerminalNode U_00F2() { return getToken(Rfc3164Parser.U_00F2, 0); }
		public TerminalNode U_00F3() { return getToken(Rfc3164Parser.U_00F3, 0); }
		public TerminalNode U_00F4() { return getToken(Rfc3164Parser.U_00F4, 0); }
		public TerminalNode U_00F5() { return getToken(Rfc3164Parser.U_00F5, 0); }
		public TerminalNode U_00F6() { return getToken(Rfc3164Parser.U_00F6, 0); }
		public TerminalNode U_00F7() { return getToken(Rfc3164Parser.U_00F7, 0); }
		public TerminalNode U_00F8() { return getToken(Rfc3164Parser.U_00F8, 0); }
		public TerminalNode U_00F9() { return getToken(Rfc3164Parser.U_00F9, 0); }
		public TerminalNode U_00FA() { return getToken(Rfc3164Parser.U_00FA, 0); }
		public TerminalNode U_00FB() { return getToken(Rfc3164Parser.U_00FB, 0); }
		public TerminalNode U_00FC() { return getToken(Rfc3164Parser.U_00FC, 0); }
		public TerminalNode U_00FD() { return getToken(Rfc3164Parser.U_00FD, 0); }
		public TerminalNode U_00FE() { return getToken(Rfc3164Parser.U_00FE, 0); }
		public TerminalNode U_00FF() { return getToken(Rfc3164Parser.U_00FF, 0); }
		public OctetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterOctet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitOctet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitOctet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OctetContext octet() throws RecognitionException {
		OctetContext _localctx = new OctetContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_octet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_la = _input.LA(1);
			if ( !(((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (TAB - 1)) | (1L << (LF - 1)) | (1L << (CR - 1)) | (1L << (SPACE - 1)) | (1L << (EXCLAMATION - 1)) | (1L << (QUOTE - 1)) | (1L << (POUND - 1)) | (1L << (DOLLAR - 1)) | (1L << (PERCENT - 1)) | (1L << (AMPERSAND - 1)) | (1L << (APOSTROPHE - 1)) | (1L << (LEFT_PAREN - 1)) | (1L << (RIGHT_PAREN - 1)) | (1L << (ASTERISK - 1)) | (1L << (PLUS - 1)) | (1L << (COMMA - 1)) | (1L << (DASH - 1)) | (1L << (PERIOD - 1)) | (1L << (SLASH - 1)) | (1L << (ZERO - 1)) | (1L << (ONE - 1)) | (1L << (TWO - 1)) | (1L << (THREE - 1)) | (1L << (FOUR - 1)) | (1L << (FIVE - 1)) | (1L << (SIX - 1)) | (1L << (SEVEN - 1)) | (1L << (EIGHT - 1)) | (1L << (NINE - 1)) | (1L << (COLON - 1)) | (1L << (SEMICOLON - 1)) | (1L << (LESS_THAN - 1)) | (1L << (EQUALS - 1)) | (1L << (GREATER_THAN - 1)) | (1L << (QUESTION - 1)) | (1L << (AT - 1)) | (1L << (CAP_A - 1)) | (1L << (CAP_B - 1)) | (1L << (CAP_C - 1)) | (1L << (CAP_D - 1)) | (1L << (CAP_E - 1)) | (1L << (CAP_F - 1)) | (1L << (CAP_G - 1)) | (1L << (CAP_H - 1)) | (1L << (CAP_I - 1)) | (1L << (CAP_J - 1)) | (1L << (CAP_K - 1)) | (1L << (CAP_L - 1)) | (1L << (CAP_M - 1)) | (1L << (CAP_N - 1)) | (1L << (CAP_O - 1)) | (1L << (CAP_P - 1)) | (1L << (CAP_Q - 1)) | (1L << (CAP_R - 1)) | (1L << (CAP_S - 1)) | (1L << (CAP_T - 1)) | (1L << (CAP_U - 1)) | (1L << (CAP_V - 1)) | (1L << (CAP_W - 1)) | (1L << (CAP_X - 1)) | (1L << (CAP_Y - 1)) | (1L << (CAP_Z - 1)) | (1L << (LEFT_BRACE - 1)) | (1L << (BACKSLASH - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (RIGHT_BRACE - 65)) | (1L << (CARAT - 65)) | (1L << (UNDERSCORE - 65)) | (1L << (ACCENT - 65)) | (1L << (A - 65)) | (1L << (B - 65)) | (1L << (C - 65)) | (1L << (D - 65)) | (1L << (E - 65)) | (1L << (F - 65)) | (1L << (G - 65)) | (1L << (H - 65)) | (1L << (I - 65)) | (1L << (J - 65)) | (1L << (K - 65)) | (1L << (L - 65)) | (1L << (M - 65)) | (1L << (N - 65)) | (1L << (O - 65)) | (1L << (P - 65)) | (1L << (Q - 65)) | (1L << (R - 65)) | (1L << (S - 65)) | (1L << (T - 65)) | (1L << (U - 65)) | (1L << (V - 65)) | (1L << (W - 65)) | (1L << (X - 65)) | (1L << (Y - 65)) | (1L << (Z - 65)) | (1L << (LEFT_CURLY_BRACE - 65)) | (1L << (PIPE - 65)) | (1L << (RIGHT_CURLY_BRACE - 65)) | (1L << (TILDE - 65)) | (1L << (U_0000 - 65)) | (1L << (U_0001 - 65)) | (1L << (U_0002 - 65)) | (1L << (U_0003 - 65)) | (1L << (U_0004 - 65)) | (1L << (U_0005 - 65)) | (1L << (U_0006 - 65)) | (1L << (U_0007 - 65)) | (1L << (U_0008 - 65)) | (1L << (U_000B - 65)) | (1L << (U_000C - 65)) | (1L << (U_000E - 65)) | (1L << (U_000F - 65)) | (1L << (U_0010 - 65)) | (1L << (U_0011 - 65)) | (1L << (U_0012 - 65)) | (1L << (U_0013 - 65)) | (1L << (U_0014 - 65)) | (1L << (U_0015 - 65)) | (1L << (U_0016 - 65)) | (1L << (U_0017 - 65)) | (1L << (U_0018 - 65)) | (1L << (U_0019 - 65)) | (1L << (U_001A - 65)) | (1L << (U_001B - 65)) | (1L << (U_001C - 65)) | (1L << (U_001D - 65)) | (1L << (U_001E - 65)) | (1L << (U_001F - 65)) | (1L << (U_007F - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (U_0080 - 129)) | (1L << (U_0081 - 129)) | (1L << (U_0082 - 129)) | (1L << (U_0083 - 129)) | (1L << (U_0084 - 129)) | (1L << (U_0085 - 129)) | (1L << (U_0086 - 129)) | (1L << (U_0087 - 129)) | (1L << (U_0088 - 129)) | (1L << (U_0089 - 129)) | (1L << (U_008A - 129)) | (1L << (U_008B - 129)) | (1L << (U_008C - 129)) | (1L << (U_008D - 129)) | (1L << (U_008E - 129)) | (1L << (U_008F - 129)) | (1L << (U_0090 - 129)) | (1L << (U_0091 - 129)) | (1L << (U_0092 - 129)) | (1L << (U_0093 - 129)) | (1L << (U_0094 - 129)) | (1L << (U_0095 - 129)) | (1L << (U_0096 - 129)) | (1L << (U_0097 - 129)) | (1L << (U_0098 - 129)) | (1L << (U_0099 - 129)) | (1L << (U_009A - 129)) | (1L << (U_009B - 129)) | (1L << (U_009C - 129)) | (1L << (U_009D - 129)) | (1L << (U_009E - 129)) | (1L << (U_009F - 129)) | (1L << (U_00A0 - 129)) | (1L << (U_00A1 - 129)) | (1L << (U_00A2 - 129)) | (1L << (U_00A3 - 129)) | (1L << (U_00A4 - 129)) | (1L << (U_00A5 - 129)) | (1L << (U_00A6 - 129)) | (1L << (U_00A7 - 129)) | (1L << (U_00A8 - 129)) | (1L << (U_00A9 - 129)) | (1L << (U_00AA - 129)) | (1L << (U_00AB - 129)) | (1L << (U_00AC - 129)) | (1L << (U_00AD - 129)) | (1L << (U_00AE - 129)) | (1L << (U_00AF - 129)) | (1L << (U_00B0 - 129)) | (1L << (U_00B1 - 129)) | (1L << (U_00B2 - 129)) | (1L << (U_00B3 - 129)) | (1L << (U_00B4 - 129)) | (1L << (U_00B5 - 129)) | (1L << (U_00B6 - 129)) | (1L << (U_00B7 - 129)) | (1L << (U_00B8 - 129)) | (1L << (U_00B9 - 129)) | (1L << (U_00BA - 129)) | (1L << (U_00BB - 129)) | (1L << (U_00BC - 129)) | (1L << (U_00BD - 129)) | (1L << (U_00BE - 129)) | (1L << (U_00BF - 129)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (U_00C0 - 193)) | (1L << (U_00C1 - 193)) | (1L << (U_00C2 - 193)) | (1L << (U_00C3 - 193)) | (1L << (U_00C4 - 193)) | (1L << (U_00C5 - 193)) | (1L << (U_00C6 - 193)) | (1L << (U_00C7 - 193)) | (1L << (U_00C8 - 193)) | (1L << (U_00C9 - 193)) | (1L << (U_00CA - 193)) | (1L << (U_00CB - 193)) | (1L << (U_00CC - 193)) | (1L << (U_00CD - 193)) | (1L << (U_00CE - 193)) | (1L << (U_00CF - 193)) | (1L << (U_00D0 - 193)) | (1L << (U_00D1 - 193)) | (1L << (U_00D2 - 193)) | (1L << (U_00D3 - 193)) | (1L << (U_00D4 - 193)) | (1L << (U_00D5 - 193)) | (1L << (U_00D6 - 193)) | (1L << (U_00D7 - 193)) | (1L << (U_00D8 - 193)) | (1L << (U_00D9 - 193)) | (1L << (U_00DA - 193)) | (1L << (U_00DB - 193)) | (1L << (U_00DC - 193)) | (1L << (U_00DD - 193)) | (1L << (U_00DE - 193)) | (1L << (U_00DF - 193)) | (1L << (U_00E0 - 193)) | (1L << (U_00E1 - 193)) | (1L << (U_00E2 - 193)) | (1L << (U_00E3 - 193)) | (1L << (U_00E4 - 193)) | (1L << (U_00E5 - 193)) | (1L << (U_00E6 - 193)) | (1L << (U_00E7 - 193)) | (1L << (U_00E8 - 193)) | (1L << (U_00E9 - 193)) | (1L << (U_00EA - 193)) | (1L << (U_00EB - 193)) | (1L << (U_00EC - 193)) | (1L << (U_00ED - 193)) | (1L << (U_00EE - 193)) | (1L << (U_00EF - 193)) | (1L << (U_00F0 - 193)) | (1L << (U_00F1 - 193)) | (1L << (U_00F2 - 193)) | (1L << (U_00F3 - 193)) | (1L << (U_00F4 - 193)) | (1L << (U_00F5 - 193)) | (1L << (U_00F6 - 193)) | (1L << (U_00F7 - 193)) | (1L << (U_00F8 - 193)) | (1L << (U_00F9 - 193)) | (1L << (U_00FA - 193)) | (1L << (U_00FB - 193)) | (1L << (U_00FC - 193)) | (1L << (U_00FD - 193)) | (1L << (U_00FE - 193)) | (1L << (U_00FF - 193)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpContext extends ParserRuleContext {
		public TerminalNode SPACE() { return getToken(Rfc3164Parser.SPACE, 0); }
		public SpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterSp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitSp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitSp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpContext sp() throws RecognitionException {
		SpContext _localctx = new SpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_sp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(SPACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintusasciiContext extends ParserRuleContext {
		public TerminalNode EXCLAMATION() { return getToken(Rfc3164Parser.EXCLAMATION, 0); }
		public TerminalNode QUOTE() { return getToken(Rfc3164Parser.QUOTE, 0); }
		public TerminalNode POUND() { return getToken(Rfc3164Parser.POUND, 0); }
		public TerminalNode DOLLAR() { return getToken(Rfc3164Parser.DOLLAR, 0); }
		public TerminalNode PERCENT() { return getToken(Rfc3164Parser.PERCENT, 0); }
		public TerminalNode AMPERSAND() { return getToken(Rfc3164Parser.AMPERSAND, 0); }
		public TerminalNode APOSTROPHE() { return getToken(Rfc3164Parser.APOSTROPHE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(Rfc3164Parser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(Rfc3164Parser.RIGHT_PAREN, 0); }
		public TerminalNode ASTERISK() { return getToken(Rfc3164Parser.ASTERISK, 0); }
		public TerminalNode PLUS() { return getToken(Rfc3164Parser.PLUS, 0); }
		public TerminalNode COMMA() { return getToken(Rfc3164Parser.COMMA, 0); }
		public TerminalNode DASH() { return getToken(Rfc3164Parser.DASH, 0); }
		public TerminalNode PERIOD() { return getToken(Rfc3164Parser.PERIOD, 0); }
		public TerminalNode SLASH() { return getToken(Rfc3164Parser.SLASH, 0); }
		public TerminalNode ZERO() { return getToken(Rfc3164Parser.ZERO, 0); }
		public TerminalNode ONE() { return getToken(Rfc3164Parser.ONE, 0); }
		public TerminalNode TWO() { return getToken(Rfc3164Parser.TWO, 0); }
		public TerminalNode THREE() { return getToken(Rfc3164Parser.THREE, 0); }
		public TerminalNode FOUR() { return getToken(Rfc3164Parser.FOUR, 0); }
		public TerminalNode FIVE() { return getToken(Rfc3164Parser.FIVE, 0); }
		public TerminalNode SIX() { return getToken(Rfc3164Parser.SIX, 0); }
		public TerminalNode SEVEN() { return getToken(Rfc3164Parser.SEVEN, 0); }
		public TerminalNode EIGHT() { return getToken(Rfc3164Parser.EIGHT, 0); }
		public TerminalNode NINE() { return getToken(Rfc3164Parser.NINE, 0); }
		public TerminalNode COLON() { return getToken(Rfc3164Parser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(Rfc3164Parser.SEMICOLON, 0); }
		public TerminalNode LESS_THAN() { return getToken(Rfc3164Parser.LESS_THAN, 0); }
		public TerminalNode EQUALS() { return getToken(Rfc3164Parser.EQUALS, 0); }
		public TerminalNode GREATER_THAN() { return getToken(Rfc3164Parser.GREATER_THAN, 0); }
		public TerminalNode QUESTION() { return getToken(Rfc3164Parser.QUESTION, 0); }
		public TerminalNode AT() { return getToken(Rfc3164Parser.AT, 0); }
		public TerminalNode CAP_A() { return getToken(Rfc3164Parser.CAP_A, 0); }
		public TerminalNode CAP_B() { return getToken(Rfc3164Parser.CAP_B, 0); }
		public TerminalNode CAP_C() { return getToken(Rfc3164Parser.CAP_C, 0); }
		public TerminalNode CAP_D() { return getToken(Rfc3164Parser.CAP_D, 0); }
		public TerminalNode CAP_E() { return getToken(Rfc3164Parser.CAP_E, 0); }
		public TerminalNode CAP_F() { return getToken(Rfc3164Parser.CAP_F, 0); }
		public TerminalNode CAP_G() { return getToken(Rfc3164Parser.CAP_G, 0); }
		public TerminalNode CAP_H() { return getToken(Rfc3164Parser.CAP_H, 0); }
		public TerminalNode CAP_I() { return getToken(Rfc3164Parser.CAP_I, 0); }
		public TerminalNode CAP_J() { return getToken(Rfc3164Parser.CAP_J, 0); }
		public TerminalNode CAP_K() { return getToken(Rfc3164Parser.CAP_K, 0); }
		public TerminalNode CAP_L() { return getToken(Rfc3164Parser.CAP_L, 0); }
		public TerminalNode CAP_M() { return getToken(Rfc3164Parser.CAP_M, 0); }
		public TerminalNode CAP_N() { return getToken(Rfc3164Parser.CAP_N, 0); }
		public TerminalNode CAP_O() { return getToken(Rfc3164Parser.CAP_O, 0); }
		public TerminalNode CAP_P() { return getToken(Rfc3164Parser.CAP_P, 0); }
		public TerminalNode CAP_Q() { return getToken(Rfc3164Parser.CAP_Q, 0); }
		public TerminalNode CAP_R() { return getToken(Rfc3164Parser.CAP_R, 0); }
		public TerminalNode CAP_S() { return getToken(Rfc3164Parser.CAP_S, 0); }
		public TerminalNode CAP_T() { return getToken(Rfc3164Parser.CAP_T, 0); }
		public TerminalNode CAP_U() { return getToken(Rfc3164Parser.CAP_U, 0); }
		public TerminalNode CAP_V() { return getToken(Rfc3164Parser.CAP_V, 0); }
		public TerminalNode CAP_W() { return getToken(Rfc3164Parser.CAP_W, 0); }
		public TerminalNode CAP_X() { return getToken(Rfc3164Parser.CAP_X, 0); }
		public TerminalNode CAP_Y() { return getToken(Rfc3164Parser.CAP_Y, 0); }
		public TerminalNode CAP_Z() { return getToken(Rfc3164Parser.CAP_Z, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(Rfc3164Parser.LEFT_BRACE, 0); }
		public TerminalNode BACKSLASH() { return getToken(Rfc3164Parser.BACKSLASH, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(Rfc3164Parser.RIGHT_BRACE, 0); }
		public TerminalNode CARAT() { return getToken(Rfc3164Parser.CARAT, 0); }
		public TerminalNode UNDERSCORE() { return getToken(Rfc3164Parser.UNDERSCORE, 0); }
		public TerminalNode ACCENT() { return getToken(Rfc3164Parser.ACCENT, 0); }
		public TerminalNode A() { return getToken(Rfc3164Parser.A, 0); }
		public TerminalNode B() { return getToken(Rfc3164Parser.B, 0); }
		public TerminalNode C() { return getToken(Rfc3164Parser.C, 0); }
		public TerminalNode D() { return getToken(Rfc3164Parser.D, 0); }
		public TerminalNode E() { return getToken(Rfc3164Parser.E, 0); }
		public TerminalNode F() { return getToken(Rfc3164Parser.F, 0); }
		public TerminalNode G() { return getToken(Rfc3164Parser.G, 0); }
		public TerminalNode H() { return getToken(Rfc3164Parser.H, 0); }
		public TerminalNode I() { return getToken(Rfc3164Parser.I, 0); }
		public TerminalNode J() { return getToken(Rfc3164Parser.J, 0); }
		public TerminalNode K() { return getToken(Rfc3164Parser.K, 0); }
		public TerminalNode L() { return getToken(Rfc3164Parser.L, 0); }
		public TerminalNode M() { return getToken(Rfc3164Parser.M, 0); }
		public TerminalNode N() { return getToken(Rfc3164Parser.N, 0); }
		public TerminalNode O() { return getToken(Rfc3164Parser.O, 0); }
		public TerminalNode P() { return getToken(Rfc3164Parser.P, 0); }
		public TerminalNode Q() { return getToken(Rfc3164Parser.Q, 0); }
		public TerminalNode R() { return getToken(Rfc3164Parser.R, 0); }
		public TerminalNode S() { return getToken(Rfc3164Parser.S, 0); }
		public TerminalNode T() { return getToken(Rfc3164Parser.T, 0); }
		public TerminalNode U() { return getToken(Rfc3164Parser.U, 0); }
		public TerminalNode V() { return getToken(Rfc3164Parser.V, 0); }
		public TerminalNode W() { return getToken(Rfc3164Parser.W, 0); }
		public TerminalNode X() { return getToken(Rfc3164Parser.X, 0); }
		public TerminalNode Y() { return getToken(Rfc3164Parser.Y, 0); }
		public TerminalNode Z() { return getToken(Rfc3164Parser.Z, 0); }
		public TerminalNode LEFT_CURLY_BRACE() { return getToken(Rfc3164Parser.LEFT_CURLY_BRACE, 0); }
		public TerminalNode PIPE() { return getToken(Rfc3164Parser.PIPE, 0); }
		public TerminalNode RIGHT_CURLY_BRACE() { return getToken(Rfc3164Parser.RIGHT_CURLY_BRACE, 0); }
		public TerminalNode TILDE() { return getToken(Rfc3164Parser.TILDE, 0); }
		public PrintusasciiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printusascii; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterPrintusascii(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitPrintusascii(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitPrintusascii(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintusasciiContext printusascii() throws RecognitionException {
		PrintusasciiContext _localctx = new PrintusasciiContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_printusascii);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXCLAMATION) | (1L << QUOTE) | (1L << POUND) | (1L << DOLLAR) | (1L << PERCENT) | (1L << AMPERSAND) | (1L << APOSTROPHE) | (1L << LEFT_PAREN) | (1L << RIGHT_PAREN) | (1L << ASTERISK) | (1L << PLUS) | (1L << COMMA) | (1L << DASH) | (1L << PERIOD) | (1L << SLASH) | (1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE) | (1L << COLON) | (1L << SEMICOLON) | (1L << LESS_THAN) | (1L << EQUALS) | (1L << GREATER_THAN) | (1L << QUESTION) | (1L << AT) | (1L << CAP_A) | (1L << CAP_B) | (1L << CAP_C) | (1L << CAP_D) | (1L << CAP_E) | (1L << CAP_F) | (1L << CAP_G) | (1L << CAP_H) | (1L << CAP_I) | (1L << CAP_J) | (1L << CAP_K) | (1L << CAP_L) | (1L << CAP_M) | (1L << CAP_N) | (1L << CAP_O) | (1L << CAP_P) | (1L << CAP_Q) | (1L << CAP_R) | (1L << CAP_S) | (1L << CAP_T) | (1L << CAP_U) | (1L << CAP_V) | (1L << CAP_W) | (1L << CAP_X) | (1L << CAP_Y) | (1L << CAP_Z) | (1L << LEFT_BRACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BACKSLASH - 64)) | (1L << (RIGHT_BRACE - 64)) | (1L << (CARAT - 64)) | (1L << (UNDERSCORE - 64)) | (1L << (ACCENT - 64)) | (1L << (A - 64)) | (1L << (B - 64)) | (1L << (C - 64)) | (1L << (D - 64)) | (1L << (E - 64)) | (1L << (F - 64)) | (1L << (G - 64)) | (1L << (H - 64)) | (1L << (I - 64)) | (1L << (J - 64)) | (1L << (K - 64)) | (1L << (L - 64)) | (1L << (M - 64)) | (1L << (N - 64)) | (1L << (O - 64)) | (1L << (P - 64)) | (1L << (Q - 64)) | (1L << (R - 64)) | (1L << (S - 64)) | (1L << (T - 64)) | (1L << (U - 64)) | (1L << (V - 64)) | (1L << (W - 64)) | (1L << (X - 64)) | (1L << (Y - 64)) | (1L << (Z - 64)) | (1L << (LEFT_CURLY_BRACE - 64)) | (1L << (PIPE - 64)) | (1L << (RIGHT_CURLY_BRACE - 64)) | (1L << (TILDE - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintusasciinospecialsContext extends ParserRuleContext {
		public TerminalNode EXCLAMATION() { return getToken(Rfc3164Parser.EXCLAMATION, 0); }
		public TerminalNode POUND() { return getToken(Rfc3164Parser.POUND, 0); }
		public TerminalNode DOLLAR() { return getToken(Rfc3164Parser.DOLLAR, 0); }
		public TerminalNode PERCENT() { return getToken(Rfc3164Parser.PERCENT, 0); }
		public TerminalNode AMPERSAND() { return getToken(Rfc3164Parser.AMPERSAND, 0); }
		public TerminalNode APOSTROPHE() { return getToken(Rfc3164Parser.APOSTROPHE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(Rfc3164Parser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(Rfc3164Parser.RIGHT_PAREN, 0); }
		public TerminalNode ASTERISK() { return getToken(Rfc3164Parser.ASTERISK, 0); }
		public TerminalNode PLUS() { return getToken(Rfc3164Parser.PLUS, 0); }
		public TerminalNode COMMA() { return getToken(Rfc3164Parser.COMMA, 0); }
		public TerminalNode DASH() { return getToken(Rfc3164Parser.DASH, 0); }
		public TerminalNode PERIOD() { return getToken(Rfc3164Parser.PERIOD, 0); }
		public TerminalNode SLASH() { return getToken(Rfc3164Parser.SLASH, 0); }
		public TerminalNode ZERO() { return getToken(Rfc3164Parser.ZERO, 0); }
		public TerminalNode ONE() { return getToken(Rfc3164Parser.ONE, 0); }
		public TerminalNode TWO() { return getToken(Rfc3164Parser.TWO, 0); }
		public TerminalNode THREE() { return getToken(Rfc3164Parser.THREE, 0); }
		public TerminalNode FOUR() { return getToken(Rfc3164Parser.FOUR, 0); }
		public TerminalNode FIVE() { return getToken(Rfc3164Parser.FIVE, 0); }
		public TerminalNode SIX() { return getToken(Rfc3164Parser.SIX, 0); }
		public TerminalNode SEVEN() { return getToken(Rfc3164Parser.SEVEN, 0); }
		public TerminalNode EIGHT() { return getToken(Rfc3164Parser.EIGHT, 0); }
		public TerminalNode NINE() { return getToken(Rfc3164Parser.NINE, 0); }
		public TerminalNode COLON() { return getToken(Rfc3164Parser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(Rfc3164Parser.SEMICOLON, 0); }
		public TerminalNode LESS_THAN() { return getToken(Rfc3164Parser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(Rfc3164Parser.GREATER_THAN, 0); }
		public TerminalNode QUESTION() { return getToken(Rfc3164Parser.QUESTION, 0); }
		public TerminalNode AT() { return getToken(Rfc3164Parser.AT, 0); }
		public TerminalNode CAP_A() { return getToken(Rfc3164Parser.CAP_A, 0); }
		public TerminalNode CAP_B() { return getToken(Rfc3164Parser.CAP_B, 0); }
		public TerminalNode CAP_C() { return getToken(Rfc3164Parser.CAP_C, 0); }
		public TerminalNode CAP_D() { return getToken(Rfc3164Parser.CAP_D, 0); }
		public TerminalNode CAP_E() { return getToken(Rfc3164Parser.CAP_E, 0); }
		public TerminalNode CAP_F() { return getToken(Rfc3164Parser.CAP_F, 0); }
		public TerminalNode CAP_G() { return getToken(Rfc3164Parser.CAP_G, 0); }
		public TerminalNode CAP_H() { return getToken(Rfc3164Parser.CAP_H, 0); }
		public TerminalNode CAP_I() { return getToken(Rfc3164Parser.CAP_I, 0); }
		public TerminalNode CAP_J() { return getToken(Rfc3164Parser.CAP_J, 0); }
		public TerminalNode CAP_K() { return getToken(Rfc3164Parser.CAP_K, 0); }
		public TerminalNode CAP_L() { return getToken(Rfc3164Parser.CAP_L, 0); }
		public TerminalNode CAP_M() { return getToken(Rfc3164Parser.CAP_M, 0); }
		public TerminalNode CAP_N() { return getToken(Rfc3164Parser.CAP_N, 0); }
		public TerminalNode CAP_O() { return getToken(Rfc3164Parser.CAP_O, 0); }
		public TerminalNode CAP_P() { return getToken(Rfc3164Parser.CAP_P, 0); }
		public TerminalNode CAP_Q() { return getToken(Rfc3164Parser.CAP_Q, 0); }
		public TerminalNode CAP_R() { return getToken(Rfc3164Parser.CAP_R, 0); }
		public TerminalNode CAP_S() { return getToken(Rfc3164Parser.CAP_S, 0); }
		public TerminalNode CAP_T() { return getToken(Rfc3164Parser.CAP_T, 0); }
		public TerminalNode CAP_U() { return getToken(Rfc3164Parser.CAP_U, 0); }
		public TerminalNode CAP_V() { return getToken(Rfc3164Parser.CAP_V, 0); }
		public TerminalNode CAP_W() { return getToken(Rfc3164Parser.CAP_W, 0); }
		public TerminalNode CAP_X() { return getToken(Rfc3164Parser.CAP_X, 0); }
		public TerminalNode CAP_Y() { return getToken(Rfc3164Parser.CAP_Y, 0); }
		public TerminalNode CAP_Z() { return getToken(Rfc3164Parser.CAP_Z, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(Rfc3164Parser.LEFT_BRACE, 0); }
		public TerminalNode BACKSLASH() { return getToken(Rfc3164Parser.BACKSLASH, 0); }
		public TerminalNode CARAT() { return getToken(Rfc3164Parser.CARAT, 0); }
		public TerminalNode UNDERSCORE() { return getToken(Rfc3164Parser.UNDERSCORE, 0); }
		public TerminalNode ACCENT() { return getToken(Rfc3164Parser.ACCENT, 0); }
		public TerminalNode A() { return getToken(Rfc3164Parser.A, 0); }
		public TerminalNode B() { return getToken(Rfc3164Parser.B, 0); }
		public TerminalNode C() { return getToken(Rfc3164Parser.C, 0); }
		public TerminalNode D() { return getToken(Rfc3164Parser.D, 0); }
		public TerminalNode E() { return getToken(Rfc3164Parser.E, 0); }
		public TerminalNode F() { return getToken(Rfc3164Parser.F, 0); }
		public TerminalNode G() { return getToken(Rfc3164Parser.G, 0); }
		public TerminalNode H() { return getToken(Rfc3164Parser.H, 0); }
		public TerminalNode I() { return getToken(Rfc3164Parser.I, 0); }
		public TerminalNode J() { return getToken(Rfc3164Parser.J, 0); }
		public TerminalNode K() { return getToken(Rfc3164Parser.K, 0); }
		public TerminalNode L() { return getToken(Rfc3164Parser.L, 0); }
		public TerminalNode M() { return getToken(Rfc3164Parser.M, 0); }
		public TerminalNode N() { return getToken(Rfc3164Parser.N, 0); }
		public TerminalNode O() { return getToken(Rfc3164Parser.O, 0); }
		public TerminalNode P() { return getToken(Rfc3164Parser.P, 0); }
		public TerminalNode Q() { return getToken(Rfc3164Parser.Q, 0); }
		public TerminalNode R() { return getToken(Rfc3164Parser.R, 0); }
		public TerminalNode S() { return getToken(Rfc3164Parser.S, 0); }
		public TerminalNode T() { return getToken(Rfc3164Parser.T, 0); }
		public TerminalNode U() { return getToken(Rfc3164Parser.U, 0); }
		public TerminalNode V() { return getToken(Rfc3164Parser.V, 0); }
		public TerminalNode W() { return getToken(Rfc3164Parser.W, 0); }
		public TerminalNode X() { return getToken(Rfc3164Parser.X, 0); }
		public TerminalNode Y() { return getToken(Rfc3164Parser.Y, 0); }
		public TerminalNode Z() { return getToken(Rfc3164Parser.Z, 0); }
		public TerminalNode LEFT_CURLY_BRACE() { return getToken(Rfc3164Parser.LEFT_CURLY_BRACE, 0); }
		public TerminalNode PIPE() { return getToken(Rfc3164Parser.PIPE, 0); }
		public TerminalNode RIGHT_CURLY_BRACE() { return getToken(Rfc3164Parser.RIGHT_CURLY_BRACE, 0); }
		public TerminalNode TILDE() { return getToken(Rfc3164Parser.TILDE, 0); }
		public PrintusasciinospecialsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printusasciinospecials; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterPrintusasciinospecials(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitPrintusasciinospecials(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitPrintusasciinospecials(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintusasciinospecialsContext printusasciinospecials() throws RecognitionException {
		PrintusasciinospecialsContext _localctx = new PrintusasciinospecialsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_printusasciinospecials);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXCLAMATION) | (1L << POUND) | (1L << DOLLAR) | (1L << PERCENT) | (1L << AMPERSAND) | (1L << APOSTROPHE) | (1L << LEFT_PAREN) | (1L << RIGHT_PAREN) | (1L << ASTERISK) | (1L << PLUS) | (1L << COMMA) | (1L << DASH) | (1L << PERIOD) | (1L << SLASH) | (1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE) | (1L << COLON) | (1L << SEMICOLON) | (1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << QUESTION) | (1L << AT) | (1L << CAP_A) | (1L << CAP_B) | (1L << CAP_C) | (1L << CAP_D) | (1L << CAP_E) | (1L << CAP_F) | (1L << CAP_G) | (1L << CAP_H) | (1L << CAP_I) | (1L << CAP_J) | (1L << CAP_K) | (1L << CAP_L) | (1L << CAP_M) | (1L << CAP_N) | (1L << CAP_O) | (1L << CAP_P) | (1L << CAP_Q) | (1L << CAP_R) | (1L << CAP_S) | (1L << CAP_T) | (1L << CAP_U) | (1L << CAP_V) | (1L << CAP_W) | (1L << CAP_X) | (1L << CAP_Y) | (1L << CAP_Z) | (1L << LEFT_BRACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BACKSLASH - 64)) | (1L << (CARAT - 64)) | (1L << (UNDERSCORE - 64)) | (1L << (ACCENT - 64)) | (1L << (A - 64)) | (1L << (B - 64)) | (1L << (C - 64)) | (1L << (D - 64)) | (1L << (E - 64)) | (1L << (F - 64)) | (1L << (G - 64)) | (1L << (H - 64)) | (1L << (I - 64)) | (1L << (J - 64)) | (1L << (K - 64)) | (1L << (L - 64)) | (1L << (M - 64)) | (1L << (N - 64)) | (1L << (O - 64)) | (1L << (P - 64)) | (1L << (Q - 64)) | (1L << (R - 64)) | (1L << (S - 64)) | (1L << (T - 64)) | (1L << (U - 64)) | (1L << (V - 64)) | (1L << (W - 64)) | (1L << (X - 64)) | (1L << (Y - 64)) | (1L << (Z - 64)) | (1L << (LEFT_CURLY_BRACE - 64)) | (1L << (PIPE - 64)) | (1L << (RIGHT_CURLY_BRACE - 64)) | (1L << (TILDE - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nonzero_digitContext extends ParserRuleContext {
		public TerminalNode ONE() { return getToken(Rfc3164Parser.ONE, 0); }
		public TerminalNode TWO() { return getToken(Rfc3164Parser.TWO, 0); }
		public TerminalNode THREE() { return getToken(Rfc3164Parser.THREE, 0); }
		public TerminalNode FOUR() { return getToken(Rfc3164Parser.FOUR, 0); }
		public TerminalNode FIVE() { return getToken(Rfc3164Parser.FIVE, 0); }
		public TerminalNode SIX() { return getToken(Rfc3164Parser.SIX, 0); }
		public TerminalNode SEVEN() { return getToken(Rfc3164Parser.SEVEN, 0); }
		public TerminalNode EIGHT() { return getToken(Rfc3164Parser.EIGHT, 0); }
		public TerminalNode NINE() { return getToken(Rfc3164Parser.NINE, 0); }
		public Nonzero_digitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonzero_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterNonzero_digit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitNonzero_digit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitNonzero_digit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nonzero_digitContext nonzero_digit() throws RecognitionException {
		Nonzero_digitContext _localctx = new Nonzero_digitContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_nonzero_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DigitContext extends ParserRuleContext {
		public DigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit; }
	 
		public DigitContext() { }
		public void copyFrom(DigitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ZeroDigitContext extends DigitContext {
		public TerminalNode ZERO() { return getToken(Rfc3164Parser.ZERO, 0); }
		public ZeroDigitContext(DigitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterZeroDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitZeroDigit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitZeroDigit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NonZeroDigitContext extends DigitContext {
		public Nonzero_digitContext nonzero_digit() {
			return getRuleContext(Nonzero_digitContext.class,0);
		}
		public NonZeroDigitContext(DigitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterNonZeroDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitNonZeroDigit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitNonZeroDigit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_digit);
		try {
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ZERO:
				_localctx = new ZeroDigitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(ZERO);
				}
				break;
			case ONE:
			case TWO:
			case THREE:
			case FOUR:
			case FIVE:
			case SIX:
			case SEVEN:
			case EIGHT:
			case NINE:
				_localctx = new NonZeroDigitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				nonzero_digit();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CapitalContext extends ParserRuleContext {
		public TerminalNode CAP_A() { return getToken(Rfc3164Parser.CAP_A, 0); }
		public TerminalNode CAP_B() { return getToken(Rfc3164Parser.CAP_B, 0); }
		public TerminalNode CAP_C() { return getToken(Rfc3164Parser.CAP_C, 0); }
		public TerminalNode CAP_D() { return getToken(Rfc3164Parser.CAP_D, 0); }
		public TerminalNode CAP_E() { return getToken(Rfc3164Parser.CAP_E, 0); }
		public TerminalNode CAP_F() { return getToken(Rfc3164Parser.CAP_F, 0); }
		public TerminalNode CAP_G() { return getToken(Rfc3164Parser.CAP_G, 0); }
		public TerminalNode CAP_H() { return getToken(Rfc3164Parser.CAP_H, 0); }
		public TerminalNode CAP_I() { return getToken(Rfc3164Parser.CAP_I, 0); }
		public TerminalNode CAP_J() { return getToken(Rfc3164Parser.CAP_J, 0); }
		public TerminalNode CAP_K() { return getToken(Rfc3164Parser.CAP_K, 0); }
		public TerminalNode CAP_L() { return getToken(Rfc3164Parser.CAP_L, 0); }
		public TerminalNode CAP_M() { return getToken(Rfc3164Parser.CAP_M, 0); }
		public TerminalNode CAP_N() { return getToken(Rfc3164Parser.CAP_N, 0); }
		public TerminalNode CAP_O() { return getToken(Rfc3164Parser.CAP_O, 0); }
		public TerminalNode CAP_P() { return getToken(Rfc3164Parser.CAP_P, 0); }
		public TerminalNode CAP_Q() { return getToken(Rfc3164Parser.CAP_Q, 0); }
		public TerminalNode CAP_R() { return getToken(Rfc3164Parser.CAP_R, 0); }
		public TerminalNode CAP_S() { return getToken(Rfc3164Parser.CAP_S, 0); }
		public TerminalNode CAP_T() { return getToken(Rfc3164Parser.CAP_T, 0); }
		public TerminalNode CAP_U() { return getToken(Rfc3164Parser.CAP_U, 0); }
		public TerminalNode CAP_V() { return getToken(Rfc3164Parser.CAP_V, 0); }
		public TerminalNode CAP_W() { return getToken(Rfc3164Parser.CAP_W, 0); }
		public TerminalNode CAP_X() { return getToken(Rfc3164Parser.CAP_X, 0); }
		public TerminalNode CAP_Y() { return getToken(Rfc3164Parser.CAP_Y, 0); }
		public TerminalNode CAP_Z() { return getToken(Rfc3164Parser.CAP_Z, 0); }
		public CapitalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capital; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterCapital(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitCapital(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitCapital(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CapitalContext capital() throws RecognitionException {
		CapitalContext _localctx = new CapitalContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_capital);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CAP_A) | (1L << CAP_B) | (1L << CAP_C) | (1L << CAP_D) | (1L << CAP_E) | (1L << CAP_F) | (1L << CAP_G) | (1L << CAP_H) | (1L << CAP_I) | (1L << CAP_J) | (1L << CAP_K) | (1L << CAP_L) | (1L << CAP_M) | (1L << CAP_N) | (1L << CAP_O) | (1L << CAP_P) | (1L << CAP_Q) | (1L << CAP_R) | (1L << CAP_S) | (1L << CAP_T) | (1L << CAP_U) | (1L << CAP_V) | (1L << CAP_W) | (1L << CAP_X) | (1L << CAP_Y) | (1L << CAP_Z))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LowerContext extends ParserRuleContext {
		public TerminalNode A() { return getToken(Rfc3164Parser.A, 0); }
		public TerminalNode B() { return getToken(Rfc3164Parser.B, 0); }
		public TerminalNode C() { return getToken(Rfc3164Parser.C, 0); }
		public TerminalNode D() { return getToken(Rfc3164Parser.D, 0); }
		public TerminalNode E() { return getToken(Rfc3164Parser.E, 0); }
		public TerminalNode F() { return getToken(Rfc3164Parser.F, 0); }
		public TerminalNode G() { return getToken(Rfc3164Parser.G, 0); }
		public TerminalNode H() { return getToken(Rfc3164Parser.H, 0); }
		public TerminalNode I() { return getToken(Rfc3164Parser.I, 0); }
		public TerminalNode J() { return getToken(Rfc3164Parser.J, 0); }
		public TerminalNode K() { return getToken(Rfc3164Parser.K, 0); }
		public TerminalNode L() { return getToken(Rfc3164Parser.L, 0); }
		public TerminalNode M() { return getToken(Rfc3164Parser.M, 0); }
		public TerminalNode N() { return getToken(Rfc3164Parser.N, 0); }
		public TerminalNode O() { return getToken(Rfc3164Parser.O, 0); }
		public TerminalNode P() { return getToken(Rfc3164Parser.P, 0); }
		public TerminalNode Q() { return getToken(Rfc3164Parser.Q, 0); }
		public TerminalNode R() { return getToken(Rfc3164Parser.R, 0); }
		public TerminalNode S() { return getToken(Rfc3164Parser.S, 0); }
		public TerminalNode T() { return getToken(Rfc3164Parser.T, 0); }
		public TerminalNode U() { return getToken(Rfc3164Parser.U, 0); }
		public TerminalNode V() { return getToken(Rfc3164Parser.V, 0); }
		public TerminalNode W() { return getToken(Rfc3164Parser.W, 0); }
		public TerminalNode X() { return getToken(Rfc3164Parser.X, 0); }
		public TerminalNode Y() { return getToken(Rfc3164Parser.Y, 0); }
		public TerminalNode Z() { return getToken(Rfc3164Parser.Z, 0); }
		public LowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lower; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).enterLower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc3164Listener ) ((Rfc3164Listener)listener).exitLower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc3164Visitor ) return ((Rfc3164Visitor<? extends T>)visitor).visitLower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LowerContext lower() throws RecognitionException {
		LowerContext _localctx = new LowerContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_lower);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (A - 69)) | (1L << (B - 69)) | (1L << (C - 69)) | (1L << (D - 69)) | (1L << (E - 69)) | (1L << (F - 69)) | (1L << (G - 69)) | (1L << (H - 69)) | (1L << (I - 69)) | (1L << (J - 69)) | (1L << (K - 69)) | (1L << (L - 69)) | (1L << (M - 69)) | (1L << (N - 69)) | (1L << (O - 69)) | (1L << (P - 69)) | (1L << (Q - 69)) | (1L << (R - 69)) | (1L << (S - 69)) | (1L << (T - 69)) | (1L << (U - 69)) | (1L << (V - 69)) | (1L << (W - 69)) | (1L << (X - 69)) | (1L << (Y - 69)) | (1L << (Z - 69)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0103\u00f8\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\7\2I\n\2\f\2\16\2L\13\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\5\3T\n\3\3\4\5\4W\n\4\3\4\5\4Z\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\5\6f\n\6\3\6\3\6\3\6\5\6k\n\6\3\7\7\7n\n\7\f\7\16\7q\13\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b|\n\b\3\t\3\t\3\t\3\t\3\n\3\n\5"+
		"\n\u0084\n\n\3\n\3\n\5\n\u0088\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00a4\n\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\5\24\u00b2\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00c6\n\24"+
		"\3\25\3\25\5\25\u00ca\n\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\5\27\u00d3"+
		"\n\27\3\30\7\30\u00d6\n\30\f\30\16\30\u00d9\13\30\3\31\3\31\3\31\3\32"+
		"\3\32\3\33\7\33\u00e1\n\33\f\33\16\33\u00e4\13\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\5!\u00f2\n!\3\"\3\"\3#\3#\3#\2\2$\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\n\4"+
		"\2\21\21\23\23\5\2\u00be\u00be\u00c2\u00c2\u00f2\u00f2\3\2\3\u0102\3\2"+
		"\7d\6\2\7\7\t\"$BDd\3\2\27\37\3\2\'@\3\2G`\2\u00ea\2F\3\2\2\2\4P\3\2\2"+
		"\2\6V\3\2\2\2\b_\3\2\2\2\nc\3\2\2\2\fo\3\2\2\2\16{\3\2\2\2\20}\3\2\2\2"+
		"\22\u0081\3\2\2\2\24\u0089\3\2\2\2\26\u008f\3\2\2\2\30\u0094\3\2\2\2\32"+
		"\u0097\3\2\2\2\34\u009a\3\2\2\2\36\u009d\3\2\2\2 \u00a5\3\2\2\2\"\u00a8"+
		"\3\2\2\2$\u00ab\3\2\2\2&\u00ae\3\2\2\2(\u00c9\3\2\2\2*\u00cb\3\2\2\2,"+
		"\u00d2\3\2\2\2.\u00d7\3\2\2\2\60\u00da\3\2\2\2\62\u00dd\3\2\2\2\64\u00e2"+
		"\3\2\2\2\66\u00e5\3\2\2\28\u00e7\3\2\2\2:\u00e9\3\2\2\2<\u00eb\3\2\2\2"+
		">\u00ed\3\2\2\2@\u00f1\3\2\2\2B\u00f3\3\2\2\2D\u00f5\3\2\2\2FJ\5> \2G"+
		"I\5@!\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN"+
		"\58\35\2NO\5\4\3\2O\3\3\2\2\2PQ\5\6\4\2QS\58\35\2RT\5,\27\2SR\3\2\2\2"+
		"ST\3\2\2\2T\5\3\2\2\2UW\5\b\5\2VU\3\2\2\2VW\3\2\2\2WY\3\2\2\2XZ\58\35"+
		"\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\5\16\b\2\\]\58\35\2]^\5\f\7\2^\7\3"+
		"\2\2\2_`\7\"\2\2`a\5\n\6\2ab\7$\2\2b\t\3\2\2\2cj\5@!\2df\5@!\2ed\3\2\2"+
		"\2ef\3\2\2\2fk\3\2\2\2gh\5@!\2hi\5@!\2ik\3\2\2\2je\3\2\2\2jg\3\2\2\2k"+
		"\13\3\2\2\2ln\5:\36\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\r\3\2\2"+
		"\2qo\3\2\2\2rs\5\24\13\2st\7:\2\2tu\5\34\17\2u|\3\2\2\2vw\5\20\t\2wx\5"+
		"\22\n\2xy\58\35\2yz\5\36\20\2z|\3\2\2\2{r\3\2\2\2{v\3\2\2\2|\17\3\2\2"+
		"\2}~\5B\"\2~\177\5D#\2\177\u0080\5D#\2\u0080\21\3\2\2\2\u0081\u0083\5"+
		"8\35\2\u0082\u0084\58\35\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0087\5@!\2\u0086\u0088\5@!\2\u0087\u0086\3\2\2\2"+
		"\u0087\u0088\3\2\2\2\u0088\23\3\2\2\2\u0089\u008a\5\26\f\2\u008a\u008b"+
		"\7\23\2\2\u008b\u008c\5\30\r\2\u008c\u008d\7\23\2\2\u008d\u008e\5\32\16"+
		"\2\u008e\25\3\2\2\2\u008f\u0090\5@!\2\u0090\u0091\5@!\2\u0091\u0092\5"+
		"@!\2\u0092\u0093\5@!\2\u0093\27\3\2\2\2\u0094\u0095\5@!\2\u0095\u0096"+
		"\5@!\2\u0096\31\3\2\2\2\u0097\u0098\5@!\2\u0098\u0099\5@!\2\u0099\33\3"+
		"\2\2\2\u009a\u009b\5\36\20\2\u009b\u009c\5(\25\2\u009c\35\3\2\2\2\u009d"+
		"\u009e\5 \21\2\u009e\u009f\7 \2\2\u009f\u00a0\5\"\22\2\u00a0\u00a1\7 "+
		"\2\2\u00a1\u00a3\5$\23\2\u00a2\u00a4\5&\24\2\u00a3\u00a2\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\37\3\2\2\2\u00a5\u00a6\5@!\2\u00a6\u00a7\5@!\2\u00a7"+
		"!\3\2\2\2\u00a8\u00a9\5@!\2\u00a9\u00aa\5@!\2\u00aa#\3\2\2\2\u00ab\u00ac"+
		"\5@!\2\u00ac\u00ad\5@!\2\u00ad%\3\2\2\2\u00ae\u00af\7\24\2\2\u00af\u00c5"+
		"\5@!\2\u00b0\u00b2\5@!\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00c6\3\2\2\2\u00b3\u00b4\5@!\2\u00b4\u00b5\5@!\2\u00b5\u00c6\3\2\2\2"+
		"\u00b6\u00b7\5@!\2\u00b7\u00b8\5@!\2\u00b8\u00b9\5@!\2\u00b9\u00c6\3\2"+
		"\2\2\u00ba\u00bb\5@!\2\u00bb\u00bc\5@!\2\u00bc\u00bd\5@!\2\u00bd\u00be"+
		"\5@!\2\u00be\u00c6\3\2\2\2\u00bf\u00c0\5@!\2\u00c0\u00c1\5@!\2\u00c1\u00c2"+
		"\5@!\2\u00c2\u00c3\5@!\2\u00c3\u00c4\5@!\2\u00c4\u00c6\3\2\2\2\u00c5\u00b1"+
		"\3\2\2\2\u00c5\u00b3\3\2\2\2\u00c5\u00b6\3\2\2\2\u00c5\u00ba\3\2\2\2\u00c5"+
		"\u00bf\3\2\2\2\u00c6\'\3\2\2\2\u00c7\u00ca\7@\2\2\u00c8\u00ca\5*\26\2"+
		"\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca)\3\2\2\2\u00cb\u00cc\t"+
		"\2\2\2\u00cc\u00cd\5 \21\2\u00cd\u00ce\7 \2\2\u00ce\u00cf\5\"\22\2\u00cf"+
		"+\3\2\2\2\u00d0\u00d3\5.\30\2\u00d1\u00d3\5\60\31\2\u00d2\u00d0\3\2\2"+
		"\2\u00d2\u00d1\3\2\2\2\u00d3-\3\2\2\2\u00d4\u00d6\5\66\34\2\u00d5\u00d4"+
		"\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"/\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\5\62\32\2\u00db\u00dc\5\64\33"+
		"\2\u00dc\61\3\2\2\2\u00dd\u00de\t\3\2\2\u00de\63\3\2\2\2\u00df\u00e1\5"+
		"\66\34\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\65\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\t\4\2"+
		"\2\u00e6\67\3\2\2\2\u00e7\u00e8\7\6\2\2\u00e89\3\2\2\2\u00e9\u00ea\t\5"+
		"\2\2\u00ea;\3\2\2\2\u00eb\u00ec\t\6\2\2\u00ec=\3\2\2\2\u00ed\u00ee\t\7"+
		"\2\2\u00ee?\3\2\2\2\u00ef\u00f2\7\26\2\2\u00f0\u00f2\5> \2\u00f1\u00ef"+
		"\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2A\3\2\2\2\u00f3\u00f4\t\b\2\2\u00f4"+
		"C\3\2\2\2\u00f5\u00f6\t\t\2\2\u00f6E\3\2\2\2\24JSVYejo{\u0083\u0087\u00a3"+
		"\u00b1\u00c5\u00c9\u00d2\u00d7\u00e2\u00f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}