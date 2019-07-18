// Generated from com/github/palindromicity/syslog/dsl/generated/Rfc5424.g4 by ANTLR 4.5
package com.github.palindromicity.syslog.dsl.generated;

//CHECKSTYLE:OFF
/*
 * Copyright 2018 simple-syslog authors
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
public class Rfc5424Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

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
		U_00FE=255, U_00FF=256;
	public static final int
		RULE_syslog_msg = 0, RULE_header = 1, RULE_pri = 2, RULE_prival = 3, RULE_version = 4, 
		RULE_hostname = 5, RULE_app_name = 6, RULE_procid = 7, RULE_msgid = 8, 
		RULE_timestamp = 9, RULE_full_date = 10, RULE_date_fullyear = 11, RULE_date_month = 12, 
		RULE_date_mday = 13, RULE_full_time = 14, RULE_partial_time = 15, RULE_time_hour = 16, 
		RULE_time_minute = 17, RULE_time_second = 18, RULE_time_secfrac = 19, 
		RULE_time_offset = 20, RULE_time_numoffset = 21, RULE_structured_data = 22, 
		RULE_sd_element = 23, RULE_sd_param = 24, RULE_sd_id = 25, RULE_param_name = 26, 
		RULE_param_value = 27, RULE_sd_name = 28, RULE_msg = 29, RULE_msg_any = 30, 
		RULE_msg_utf8 = 31, RULE_bom = 32, RULE_utf_8_string = 33, RULE_octet = 34, 
		RULE_sp = 35, RULE_printusascii = 36, RULE_printusasciinospecials = 37, 
		RULE_nonzero_digit = 38, RULE_digit = 39, RULE_nilvalue = 40;
	public static final String[] ruleNames = {
		"syslog_msg", "header", "pri", "prival", "version", "hostname", "app_name", 
		"procid", "msgid", "timestamp", "full_date", "date_fullyear", "date_month", 
		"date_mday", "full_time", "partial_time", "time_hour", "time_minute", 
		"time_second", "time_secfrac", "time_offset", "time_numoffset", "structured_data", 
		"sd_element", "sd_param", "sd_id", "param_name", "param_value", "sd_name", 
		"msg", "msg_any", "msg_utf8", "bom", "utf_8_string", "octet", "sp", "printusascii", 
		"printusasciinospecials", "nonzero_digit", "digit", "nilvalue"
	};

	private static final String[] _LITERAL_NAMES = {
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
		"'~'", "'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", 
		"'\\u0005'", "'\\u0006'", "'\\u0007'", "'\\u0008'", "'\\u000B'", "'\\u000C'", 
		"'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", "'\\u0013'", 
		"'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", "'\\u0019'", 
		"'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", "'\\u001F'", 
		"'\\u007F'", "'\\u0080'", "'\\u0081'", "'\\u0082'", "'\\u0083'", "'\\u0084'", 
		"'\\u0085'", "'\\u0086'", "'\\u0087'", "'\\u0088'", "'\\u0089'", "'\\u008A'", 
		"'\\u008B'", "'\\u008C'", "'\\u008D'", "'\\u008E'", "'\\u008F'", "'\\u0090'", 
		"'\\u0091'", "'\\u0092'", "'\\u0093'", "'\\u0094'", "'\\u0095'", "'\\u0096'", 
		"'\\u0097'", "'\\u0098'", "'\\u0099'", "'\\u009A'", "'\\u009B'", "'\\u009C'", 
		"'\\u009D'", "'\\u009E'", "'\\u009F'", "'\\u00A0'", "'\\u00A1'", "'\\u00A2'", 
		"'\\u00A3'", "'\\u00A4'", "'\\u00A5'", "'\\u00A6'", "'\\u00A7'", "'\\u00A8'", 
		"'\\u00A9'", "'\\u00AA'", "'\\u00AB'", "'\\u00AC'", "'\\u00AD'", "'\\u00AE'", 
		"'\\u00AF'", "'\\u00B0'", "'\\u00B1'", "'\\u00B2'", "'\\u00B3'", "'\\u00B4'", 
		"'\\u00B5'", "'\\u00B6'", "'\\u00B7'", "'\\u00B8'", "'\\u00B9'", "'\\u00BA'", 
		"'\\u00BB'", "'\\u00BC'", "'\\u00BD'", "'\\u00BE'", "'\\u00BF'", "'\\u00C0'", 
		"'\\u00C1'", "'\\u00C2'", "'\\u00C3'", "'\\u00C4'", "'\\u00C5'", "'\\u00C6'", 
		"'\\u00C7'", "'\\u00C8'", "'\\u00C9'", "'\\u00CA'", "'\\u00CB'", "'\\u00CC'", 
		"'\\u00CD'", "'\\u00CE'", "'\\u00CF'", "'\\u00D0'", "'\\u00D1'", "'\\u00D2'", 
		"'\\u00D3'", "'\\u00D4'", "'\\u00D5'", "'\\u00D6'", "'\\u00D7'", "'\\u00D8'", 
		"'\\u00D9'", "'\\u00DA'", "'\\u00DB'", "'\\u00DC'", "'\\u00DD'", "'\\u00DE'", 
		"'\\u00DF'", "'\\u00E0'", "'\\u00E1'", "'\\u00E2'", "'\\u00E3'", "'\\u00E4'", 
		"'\\u00E5'", "'\\u00E6'", "'\\u00E7'", "'\\u00E8'", "'\\u00E9'", "'\\u00EA'", 
		"'\\u00EB'", "'\\u00EC'", "'\\u00ED'", "'\\u00EE'", "'\\u00EF'", "'\\u00F0'", 
		"'\\u00F1'", "'\\u00F2'", "'\\u00F3'", "'\\u00F4'", "'\\u00F5'", "'\\u00F6'", 
		"'\\u00F7'", "'\\u00F8'", "'\\u00F9'", "'\\u00FA'", "'\\u00FB'", "'\\u00FC'", 
		"'\\u00FD'", "'\\u00FE'", "'\\u00FF'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
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
		"U_00F9", "U_00FA", "U_00FB", "U_00FC", "U_00FD", "U_00FE", "U_00FF"
	};
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
	public String getGrammarFileName() { return "Rfc5424.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Rfc5424Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
		public List<SpContext> sp() {
			return getRuleContexts(SpContext.class);
		}
		public SpContext sp(int i) {
			return getRuleContext(SpContext.class,i);
		}
		public Structured_dataContext structured_data() {
			return getRuleContext(Structured_dataContext.class,0);
		}
		public MsgContext msg() {
			return getRuleContext(MsgContext.class,0);
		}
		public SyslogMsgContext(Syslog_msgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterSyslogMsg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitSyslogMsg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitSyslogMsg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Syslog_msgContext syslog_msg() throws RecognitionException {
		Syslog_msgContext _localctx = new Syslog_msgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_syslog_msg);
		try {
			_localctx = new SyslogMsgContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			header();
			setState(83);
			sp();
			setState(84);
			structured_data();
			setState(86);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(85);
				sp();
				}
				break;
			}
			setState(89);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(88);
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
		public App_nameContext app_name() {
			return getRuleContext(App_nameContext.class,0);
		}
		public ProcidContext procid() {
			return getRuleContext(ProcidContext.class,0);
		}
		public MsgidContext msgid() {
			return getRuleContext(MsgidContext.class,0);
		}
		public PriContext pri() {
			return getRuleContext(PriContext.class,0);
		}
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public SyslogHeaderContext(HeaderContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterSyslogHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitSyslogHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitSyslogHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		int _la;
		try {
			_localctx = new SyslogHeaderContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if (_la==LESS_THAN) {
				{
				setState(91);
				pri();
				}
			}

			setState(95);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(94);
				version();
				}
				break;
			}
			setState(98);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(97);
				sp();
				}
			}

			setState(100);
			timestamp();
			setState(101);
			sp();
			setState(102);
			hostname();
			setState(103);
			sp();
			setState(104);
			app_name();
			setState(105);
			sp();
			setState(106);
			procid();
			setState(107);
			sp();
			setState(108);
			msgid();
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
		public TerminalNode LESS_THAN() { return getToken(Rfc5424Parser.LESS_THAN, 0); }
		public PrivalContext prival() {
			return getRuleContext(PrivalContext.class,0);
		}
		public TerminalNode GREATER_THAN() { return getToken(Rfc5424Parser.GREATER_THAN, 0); }
		public HeaderPriorityContext(PriContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterHeaderPriority(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitHeaderPriority(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitHeaderPriority(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PriContext pri() throws RecognitionException {
		PriContext _localctx = new PriContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pri);
		try {
			_localctx = new HeaderPriorityContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(LESS_THAN);
			setState(111);
			prival();
			setState(112);
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
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterHeaderPriorityValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitHeaderPriorityValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitHeaderPriorityValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivalContext prival() throws RecognitionException {
		PrivalContext _localctx = new PrivalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_prival);
		int _la;
		try {
			_localctx = new HeaderPriorityValueContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			digit();
			setState(121);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(116);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE))) != 0)) {
					{
					setState(115);
					digit();
					}
				}

				}
				break;
			case 2:
				{
				{
				setState(118);
				digit();
				setState(119);
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

	public static class VersionContext extends ParserRuleContext {
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
	 
		public VersionContext() { }
		public void copyFrom(VersionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HeaderVersionContext extends VersionContext {
		public Nonzero_digitContext nonzero_digit() {
			return getRuleContext(Nonzero_digitContext.class,0);
		}
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public HeaderVersionContext(VersionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterHeaderVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitHeaderVersion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitHeaderVersion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_version);
		try {
			_localctx = new HeaderVersionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			nonzero_digit();
			setState(130);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(125);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(124);
					digit();
					}
					break;
				}
				}
				break;
			case 2:
				{
				{
				setState(127);
				digit();
				setState(128);
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
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterHeaderHostName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitHeaderHostName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitHeaderHostName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HeaderNilHostNameContext extends HostnameContext {
		public NilvalueContext nilvalue() {
			return getRuleContext(NilvalueContext.class,0);
		}
		public HeaderNilHostNameContext(HostnameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterHeaderNilHostName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitHeaderNilHostName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitHeaderNilHostName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HostnameContext hostname() throws RecognitionException {
		HostnameContext _localctx = new HostnameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_hostname);
		int _la;
		try {
			setState(139);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new HeaderNilHostNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				nilvalue();
				}
				break;
			case 2:
				_localctx = new HeaderHostNameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXCLAMATION) | (1L << QUOTE) | (1L << POUND) | (1L << DOLLAR) | (1L << PERCENT) | (1L << AMPERSAND) | (1L << APOSTROPHE) | (1L << LEFT_PAREN) | (1L << RIGHT_PAREN) | (1L << ASTERISK) | (1L << PLUS) | (1L << COMMA) | (1L << DASH) | (1L << PERIOD) | (1L << SLASH) | (1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE) | (1L << COLON) | (1L << SEMICOLON) | (1L << LESS_THAN) | (1L << EQUALS) | (1L << GREATER_THAN) | (1L << QUESTION) | (1L << AT) | (1L << CAP_A) | (1L << CAP_B) | (1L << CAP_C) | (1L << CAP_D) | (1L << CAP_E) | (1L << CAP_F) | (1L << CAP_G) | (1L << CAP_H) | (1L << CAP_I) | (1L << CAP_J) | (1L << CAP_K) | (1L << CAP_L) | (1L << CAP_M) | (1L << CAP_N) | (1L << CAP_O) | (1L << CAP_P) | (1L << CAP_Q) | (1L << CAP_R) | (1L << CAP_S) | (1L << CAP_T) | (1L << CAP_U) | (1L << CAP_V) | (1L << CAP_W) | (1L << CAP_X) | (1L << CAP_Y) | (1L << CAP_Z) | (1L << LEFT_BRACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BACKSLASH - 64)) | (1L << (RIGHT_BRACE - 64)) | (1L << (CARAT - 64)) | (1L << (UNDERSCORE - 64)) | (1L << (ACCENT - 64)) | (1L << (A - 64)) | (1L << (B - 64)) | (1L << (C - 64)) | (1L << (D - 64)) | (1L << (E - 64)) | (1L << (F - 64)) | (1L << (G - 64)) | (1L << (H - 64)) | (1L << (I - 64)) | (1L << (J - 64)) | (1L << (K - 64)) | (1L << (L - 64)) | (1L << (M - 64)) | (1L << (N - 64)) | (1L << (O - 64)) | (1L << (P - 64)) | (1L << (Q - 64)) | (1L << (R - 64)) | (1L << (S - 64)) | (1L << (T - 64)) | (1L << (U - 64)) | (1L << (V - 64)) | (1L << (W - 64)) | (1L << (X - 64)) | (1L << (Y - 64)) | (1L << (Z - 64)) | (1L << (LEFT_CURLY_BRACE - 64)) | (1L << (PIPE - 64)) | (1L << (RIGHT_CURLY_BRACE - 64)) | (1L << (TILDE - 64)))) != 0)) {
					{
					{
					setState(133);
					printusascii();
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class App_nameContext extends ParserRuleContext {
		public App_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_app_name; }
	 
		public App_nameContext() { }
		public void copyFrom(App_nameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HeaderNilAppNameContext extends App_nameContext {
		public NilvalueContext nilvalue() {
			return getRuleContext(NilvalueContext.class,0);
		}
		public HeaderNilAppNameContext(App_nameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterHeaderNilAppName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitHeaderNilAppName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitHeaderNilAppName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HeaderAppNameContext extends App_nameContext {
		public List<PrintusasciiContext> printusascii() {
			return getRuleContexts(PrintusasciiContext.class);
		}
		public PrintusasciiContext printusascii(int i) {
			return getRuleContext(PrintusasciiContext.class,i);
		}
		public HeaderAppNameContext(App_nameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterHeaderAppName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitHeaderAppName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitHeaderAppName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final App_nameContext app_name() throws RecognitionException {
		App_nameContext _localctx = new App_nameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_app_name);
		int _la;
		try {
			setState(148);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new HeaderNilAppNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				nilvalue();
				}
				break;
			case 2:
				_localctx = new HeaderAppNameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXCLAMATION) | (1L << QUOTE) | (1L << POUND) | (1L << DOLLAR) | (1L << PERCENT) | (1L << AMPERSAND) | (1L << APOSTROPHE) | (1L << LEFT_PAREN) | (1L << RIGHT_PAREN) | (1L << ASTERISK) | (1L << PLUS) | (1L << COMMA) | (1L << DASH) | (1L << PERIOD) | (1L << SLASH) | (1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE) | (1L << COLON) | (1L << SEMICOLON) | (1L << LESS_THAN) | (1L << EQUALS) | (1L << GREATER_THAN) | (1L << QUESTION) | (1L << AT) | (1L << CAP_A) | (1L << CAP_B) | (1L << CAP_C) | (1L << CAP_D) | (1L << CAP_E) | (1L << CAP_F) | (1L << CAP_G) | (1L << CAP_H) | (1L << CAP_I) | (1L << CAP_J) | (1L << CAP_K) | (1L << CAP_L) | (1L << CAP_M) | (1L << CAP_N) | (1L << CAP_O) | (1L << CAP_P) | (1L << CAP_Q) | (1L << CAP_R) | (1L << CAP_S) | (1L << CAP_T) | (1L << CAP_U) | (1L << CAP_V) | (1L << CAP_W) | (1L << CAP_X) | (1L << CAP_Y) | (1L << CAP_Z) | (1L << LEFT_BRACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BACKSLASH - 64)) | (1L << (RIGHT_BRACE - 64)) | (1L << (CARAT - 64)) | (1L << (UNDERSCORE - 64)) | (1L << (ACCENT - 64)) | (1L << (A - 64)) | (1L << (B - 64)) | (1L << (C - 64)) | (1L << (D - 64)) | (1L << (E - 64)) | (1L << (F - 64)) | (1L << (G - 64)) | (1L << (H - 64)) | (1L << (I - 64)) | (1L << (J - 64)) | (1L << (K - 64)) | (1L << (L - 64)) | (1L << (M - 64)) | (1L << (N - 64)) | (1L << (O - 64)) | (1L << (P - 64)) | (1L << (Q - 64)) | (1L << (R - 64)) | (1L << (S - 64)) | (1L << (T - 64)) | (1L << (U - 64)) | (1L << (V - 64)) | (1L << (W - 64)) | (1L << (X - 64)) | (1L << (Y - 64)) | (1L << (Z - 64)) | (1L << (LEFT_CURLY_BRACE - 64)) | (1L << (PIPE - 64)) | (1L << (RIGHT_CURLY_BRACE - 64)) | (1L << (TILDE - 64)))) != 0)) {
					{
					{
					setState(142);
					printusascii();
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ProcidContext extends ParserRuleContext {
		public ProcidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procid; }
	 
		public ProcidContext() { }
		public void copyFrom(ProcidContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HeaderNilProcIdContext extends ProcidContext {
		public NilvalueContext nilvalue() {
			return getRuleContext(NilvalueContext.class,0);
		}
		public HeaderNilProcIdContext(ProcidContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterHeaderNilProcId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitHeaderNilProcId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitHeaderNilProcId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HeaderProcIdContext extends ProcidContext {
		public List<PrintusasciiContext> printusascii() {
			return getRuleContexts(PrintusasciiContext.class);
		}
		public PrintusasciiContext printusascii(int i) {
			return getRuleContext(PrintusasciiContext.class,i);
		}
		public HeaderProcIdContext(ProcidContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterHeaderProcId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitHeaderProcId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitHeaderProcId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcidContext procid() throws RecognitionException {
		ProcidContext _localctx = new ProcidContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_procid);
		int _la;
		try {
			setState(157);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new HeaderNilProcIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				nilvalue();
				}
				break;
			case 2:
				_localctx = new HeaderProcIdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXCLAMATION) | (1L << QUOTE) | (1L << POUND) | (1L << DOLLAR) | (1L << PERCENT) | (1L << AMPERSAND) | (1L << APOSTROPHE) | (1L << LEFT_PAREN) | (1L << RIGHT_PAREN) | (1L << ASTERISK) | (1L << PLUS) | (1L << COMMA) | (1L << DASH) | (1L << PERIOD) | (1L << SLASH) | (1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE) | (1L << COLON) | (1L << SEMICOLON) | (1L << LESS_THAN) | (1L << EQUALS) | (1L << GREATER_THAN) | (1L << QUESTION) | (1L << AT) | (1L << CAP_A) | (1L << CAP_B) | (1L << CAP_C) | (1L << CAP_D) | (1L << CAP_E) | (1L << CAP_F) | (1L << CAP_G) | (1L << CAP_H) | (1L << CAP_I) | (1L << CAP_J) | (1L << CAP_K) | (1L << CAP_L) | (1L << CAP_M) | (1L << CAP_N) | (1L << CAP_O) | (1L << CAP_P) | (1L << CAP_Q) | (1L << CAP_R) | (1L << CAP_S) | (1L << CAP_T) | (1L << CAP_U) | (1L << CAP_V) | (1L << CAP_W) | (1L << CAP_X) | (1L << CAP_Y) | (1L << CAP_Z) | (1L << LEFT_BRACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BACKSLASH - 64)) | (1L << (RIGHT_BRACE - 64)) | (1L << (CARAT - 64)) | (1L << (UNDERSCORE - 64)) | (1L << (ACCENT - 64)) | (1L << (A - 64)) | (1L << (B - 64)) | (1L << (C - 64)) | (1L << (D - 64)) | (1L << (E - 64)) | (1L << (F - 64)) | (1L << (G - 64)) | (1L << (H - 64)) | (1L << (I - 64)) | (1L << (J - 64)) | (1L << (K - 64)) | (1L << (L - 64)) | (1L << (M - 64)) | (1L << (N - 64)) | (1L << (O - 64)) | (1L << (P - 64)) | (1L << (Q - 64)) | (1L << (R - 64)) | (1L << (S - 64)) | (1L << (T - 64)) | (1L << (U - 64)) | (1L << (V - 64)) | (1L << (W - 64)) | (1L << (X - 64)) | (1L << (Y - 64)) | (1L << (Z - 64)) | (1L << (LEFT_CURLY_BRACE - 64)) | (1L << (PIPE - 64)) | (1L << (RIGHT_CURLY_BRACE - 64)) | (1L << (TILDE - 64)))) != 0)) {
					{
					{
					setState(151);
					printusascii();
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class MsgidContext extends ParserRuleContext {
		public MsgidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_msgid; }
	 
		public MsgidContext() { }
		public void copyFrom(MsgidContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HeaderNilMsgIdContext extends MsgidContext {
		public NilvalueContext nilvalue() {
			return getRuleContext(NilvalueContext.class,0);
		}
		public HeaderNilMsgIdContext(MsgidContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterHeaderNilMsgId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitHeaderNilMsgId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitHeaderNilMsgId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HeaderMsgIdContext extends MsgidContext {
		public List<PrintusasciiContext> printusascii() {
			return getRuleContexts(PrintusasciiContext.class);
		}
		public PrintusasciiContext printusascii(int i) {
			return getRuleContext(PrintusasciiContext.class,i);
		}
		public HeaderMsgIdContext(MsgidContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterHeaderMsgId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitHeaderMsgId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitHeaderMsgId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MsgidContext msgid() throws RecognitionException {
		MsgidContext _localctx = new MsgidContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_msgid);
		int _la;
		try {
			setState(166);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new HeaderNilMsgIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				nilvalue();
				}
				break;
			case 2:
				_localctx = new HeaderMsgIdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXCLAMATION) | (1L << QUOTE) | (1L << POUND) | (1L << DOLLAR) | (1L << PERCENT) | (1L << AMPERSAND) | (1L << APOSTROPHE) | (1L << LEFT_PAREN) | (1L << RIGHT_PAREN) | (1L << ASTERISK) | (1L << PLUS) | (1L << COMMA) | (1L << DASH) | (1L << PERIOD) | (1L << SLASH) | (1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE) | (1L << COLON) | (1L << SEMICOLON) | (1L << LESS_THAN) | (1L << EQUALS) | (1L << GREATER_THAN) | (1L << QUESTION) | (1L << AT) | (1L << CAP_A) | (1L << CAP_B) | (1L << CAP_C) | (1L << CAP_D) | (1L << CAP_E) | (1L << CAP_F) | (1L << CAP_G) | (1L << CAP_H) | (1L << CAP_I) | (1L << CAP_J) | (1L << CAP_K) | (1L << CAP_L) | (1L << CAP_M) | (1L << CAP_N) | (1L << CAP_O) | (1L << CAP_P) | (1L << CAP_Q) | (1L << CAP_R) | (1L << CAP_S) | (1L << CAP_T) | (1L << CAP_U) | (1L << CAP_V) | (1L << CAP_W) | (1L << CAP_X) | (1L << CAP_Y) | (1L << CAP_Z) | (1L << LEFT_BRACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BACKSLASH - 64)) | (1L << (RIGHT_BRACE - 64)) | (1L << (CARAT - 64)) | (1L << (UNDERSCORE - 64)) | (1L << (ACCENT - 64)) | (1L << (A - 64)) | (1L << (B - 64)) | (1L << (C - 64)) | (1L << (D - 64)) | (1L << (E - 64)) | (1L << (F - 64)) | (1L << (G - 64)) | (1L << (H - 64)) | (1L << (I - 64)) | (1L << (J - 64)) | (1L << (K - 64)) | (1L << (L - 64)) | (1L << (M - 64)) | (1L << (N - 64)) | (1L << (O - 64)) | (1L << (P - 64)) | (1L << (Q - 64)) | (1L << (R - 64)) | (1L << (S - 64)) | (1L << (T - 64)) | (1L << (U - 64)) | (1L << (V - 64)) | (1L << (W - 64)) | (1L << (X - 64)) | (1L << (Y - 64)) | (1L << (Z - 64)) | (1L << (LEFT_CURLY_BRACE - 64)) | (1L << (PIPE - 64)) | (1L << (RIGHT_CURLY_BRACE - 64)) | (1L << (TILDE - 64)))) != 0)) {
					{
					{
					setState(160);
					printusascii();
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class HeaderNilTimestampContext extends TimestampContext {
		public NilvalueContext nilvalue() {
			return getRuleContext(NilvalueContext.class,0);
		}
		public HeaderNilTimestampContext(TimestampContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterHeaderNilTimestamp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitHeaderNilTimestamp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitHeaderNilTimestamp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HeaderTimeStampContext extends TimestampContext {
		public Full_dateContext full_date() {
			return getRuleContext(Full_dateContext.class,0);
		}
		public TerminalNode CAP_T() { return getToken(Rfc5424Parser.CAP_T, 0); }
		public Full_timeContext full_time() {
			return getRuleContext(Full_timeContext.class,0);
		}
		public HeaderTimeStampContext(TimestampContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterHeaderTimeStamp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitHeaderTimeStamp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitHeaderTimeStamp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimestampContext timestamp() throws RecognitionException {
		TimestampContext _localctx = new TimestampContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_timestamp);
		try {
			setState(173);
			switch (_input.LA(1)) {
			case DASH:
				_localctx = new HeaderNilTimestampContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				nilvalue();
				}
				break;
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
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(169);
				full_date();
				setState(170);
				match(CAP_T);
				setState(171);
				full_time();
				}
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

	public static class Full_dateContext extends ParserRuleContext {
		public Date_fullyearContext date_fullyear() {
			return getRuleContext(Date_fullyearContext.class,0);
		}
		public List<TerminalNode> DASH() { return getTokens(Rfc5424Parser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(Rfc5424Parser.DASH, i);
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
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterFull_date(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitFull_date(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitFull_date(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Full_dateContext full_date() throws RecognitionException {
		Full_dateContext _localctx = new Full_dateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_full_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			date_fullyear();
			setState(176);
			match(DASH);
			setState(177);
			date_month();
			setState(178);
			match(DASH);
			setState(179);
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
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterDate_fullyear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitDate_fullyear(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitDate_fullyear(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_fullyearContext date_fullyear() throws RecognitionException {
		Date_fullyearContext _localctx = new Date_fullyearContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_date_fullyear);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			digit();
			setState(182);
			digit();
			setState(183);
			digit();
			setState(184);
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
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterDate_month(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitDate_month(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitDate_month(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_monthContext date_month() throws RecognitionException {
		Date_monthContext _localctx = new Date_monthContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_date_month);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			digit();
			setState(187);
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
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterDate_mday(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitDate_mday(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitDate_mday(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_mdayContext date_mday() throws RecognitionException {
		Date_mdayContext _localctx = new Date_mdayContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_date_mday);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			digit();
			setState(190);
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
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterFull_time(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitFull_time(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitFull_time(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Full_timeContext full_time() throws RecognitionException {
		Full_timeContext _localctx = new Full_timeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_full_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			partial_time();
			setState(193);
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
		public List<TerminalNode> COLON() { return getTokens(Rfc5424Parser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(Rfc5424Parser.COLON, i);
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
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterPartial_time(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitPartial_time(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitPartial_time(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partial_timeContext partial_time() throws RecognitionException {
		Partial_timeContext _localctx = new Partial_timeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_partial_time);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			time_hour();
			setState(196);
			match(COLON);
			setState(197);
			time_minute();
			setState(198);
			match(COLON);
			setState(199);
			time_second();
			setState(201);
			_la = _input.LA(1);
			if (_la==PERIOD) {
				{
				setState(200);
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
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterTime_hour(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitTime_hour(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitTime_hour(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_hourContext time_hour() throws RecognitionException {
		Time_hourContext _localctx = new Time_hourContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_time_hour);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			digit();
			setState(204);
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
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterTime_minute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitTime_minute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitTime_minute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_minuteContext time_minute() throws RecognitionException {
		Time_minuteContext _localctx = new Time_minuteContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_time_minute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			digit();
			setState(207);
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
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterTime_second(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitTime_second(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitTime_second(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_secondContext time_second() throws RecognitionException {
		Time_secondContext _localctx = new Time_secondContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_time_second);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			digit();
			setState(210);
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
		public TerminalNode PERIOD() { return getToken(Rfc5424Parser.PERIOD, 0); }
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
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterTime_secfrac(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitTime_secfrac(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitTime_secfrac(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_secfracContext time_secfrac() throws RecognitionException {
		Time_secfracContext _localctx = new Time_secfracContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_time_secfrac);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(PERIOD);
			setState(213);
			digit();
			setState(235);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(215);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE))) != 0)) {
					{
					setState(214);
					digit();
					}
				}

				}
				break;
			case 2:
				{
				{
				setState(217);
				digit();
				setState(218);
				digit();
				}
				}
				break;
			case 3:
				{
				{
				setState(220);
				digit();
				setState(221);
				digit();
				setState(222);
				digit();
				}
				}
				break;
			case 4:
				{
				{
				setState(224);
				digit();
				setState(225);
				digit();
				setState(226);
				digit();
				setState(227);
				digit();
				}
				}
				break;
			case 5:
				{
				{
				setState(229);
				digit();
				setState(230);
				digit();
				setState(231);
				digit();
				setState(232);
				digit();
				setState(233);
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
		public TerminalNode CAP_Z() { return getToken(Rfc5424Parser.CAP_Z, 0); }
		public Time_numoffsetContext time_numoffset() {
			return getRuleContext(Time_numoffsetContext.class,0);
		}
		public Time_offsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_offset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterTime_offset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitTime_offset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitTime_offset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_offsetContext time_offset() throws RecognitionException {
		Time_offsetContext _localctx = new Time_offsetContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_time_offset);
		try {
			setState(239);
			switch (_input.LA(1)) {
			case CAP_Z:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(CAP_Z);
				}
				break;
			case PLUS:
			case DASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
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
		public TerminalNode COLON() { return getToken(Rfc5424Parser.COLON, 0); }
		public Time_minuteContext time_minute() {
			return getRuleContext(Time_minuteContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(Rfc5424Parser.PLUS, 0); }
		public TerminalNode DASH() { return getToken(Rfc5424Parser.DASH, 0); }
		public Time_numoffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_numoffset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterTime_numoffset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitTime_numoffset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitTime_numoffset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_numoffsetContext time_numoffset() throws RecognitionException {
		Time_numoffsetContext _localctx = new Time_numoffsetContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_time_numoffset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==DASH) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(242);
			time_hour();
			setState(243);
			match(COLON);
			setState(244);
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

	public static class Structured_dataContext extends ParserRuleContext {
		public NilvalueContext nilvalue() {
			return getRuleContext(NilvalueContext.class,0);
		}
		public List<TerminalNode> LEFT_BRACE() { return getTokens(Rfc5424Parser.LEFT_BRACE); }
		public TerminalNode LEFT_BRACE(int i) {
			return getToken(Rfc5424Parser.LEFT_BRACE, i);
		}
		public List<Sd_elementContext> sd_element() {
			return getRuleContexts(Sd_elementContext.class);
		}
		public Sd_elementContext sd_element(int i) {
			return getRuleContext(Sd_elementContext.class,i);
		}
		public List<TerminalNode> RIGHT_BRACE() { return getTokens(Rfc5424Parser.RIGHT_BRACE); }
		public TerminalNode RIGHT_BRACE(int i) {
			return getToken(Rfc5424Parser.RIGHT_BRACE, i);
		}
		public Structured_dataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structured_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterStructured_data(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitStructured_data(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitStructured_data(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Structured_dataContext structured_data() throws RecognitionException {
		Structured_dataContext _localctx = new Structured_dataContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_structured_data);
		try {
			int _alt;
			setState(259);
			switch (_input.LA(1)) {
			case DASH:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				nilvalue();
				}
				break;
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(LEFT_BRACE);
				setState(248);
				sd_element();
				setState(249);
				match(RIGHT_BRACE);
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(250);
						match(LEFT_BRACE);
						setState(251);
						sd_element();
						setState(252);
						match(RIGHT_BRACE);
						}
						} 
					}
					setState(258);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
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

	public static class Sd_elementContext extends ParserRuleContext {
		public Sd_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sd_element; }
	 
		public Sd_elementContext() { }
		public void copyFrom(Sd_elementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SdElementContext extends Sd_elementContext {
		public Sd_idContext sd_id() {
			return getRuleContext(Sd_idContext.class,0);
		}
		public List<SpContext> sp() {
			return getRuleContexts(SpContext.class);
		}
		public SpContext sp(int i) {
			return getRuleContext(SpContext.class,i);
		}
		public List<Sd_paramContext> sd_param() {
			return getRuleContexts(Sd_paramContext.class);
		}
		public Sd_paramContext sd_param(int i) {
			return getRuleContext(Sd_paramContext.class,i);
		}
		public SdElementContext(Sd_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterSdElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitSdElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitSdElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sd_elementContext sd_element() throws RecognitionException {
		Sd_elementContext _localctx = new Sd_elementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_sd_element);
		int _la;
		try {
			_localctx = new SdElementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			sd_id();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(262);
				sp();
				setState(263);
				sd_param();
				}
				}
				setState(269);
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

	public static class Sd_paramContext extends ParserRuleContext {
		public Sd_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sd_param; }
	 
		public Sd_paramContext() { }
		public void copyFrom(Sd_paramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SdParamContext extends Sd_paramContext {
		public Param_nameContext param_name() {
			return getRuleContext(Param_nameContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(Rfc5424Parser.EQUALS, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(Rfc5424Parser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(Rfc5424Parser.QUOTE, i);
		}
		public Param_valueContext param_value() {
			return getRuleContext(Param_valueContext.class,0);
		}
		public SdParamContext(Sd_paramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterSdParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitSdParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitSdParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sd_paramContext sd_param() throws RecognitionException {
		Sd_paramContext _localctx = new Sd_paramContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_sd_param);
		try {
			_localctx = new SdParamContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			param_name();
			setState(271);
			match(EQUALS);
			setState(272);
			match(QUOTE);
			setState(273);
			param_value();
			setState(274);
			match(QUOTE);
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

	public static class Sd_idContext extends ParserRuleContext {
		public Sd_nameContext sd_name() {
			return getRuleContext(Sd_nameContext.class,0);
		}
		public Sd_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sd_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterSd_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitSd_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitSd_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sd_idContext sd_id() throws RecognitionException {
		Sd_idContext _localctx = new Sd_idContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_sd_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			sd_name();
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

	public static class Param_nameContext extends ParserRuleContext {
		public Param_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_name; }
	 
		public Param_nameContext() { }
		public void copyFrom(Param_nameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamNameContext extends Param_nameContext {
		public Sd_nameContext sd_name() {
			return getRuleContext(Sd_nameContext.class,0);
		}
		public ParamNameContext(Param_nameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterParamName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitParamName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitParamName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_nameContext param_name() throws RecognitionException {
		Param_nameContext _localctx = new Param_nameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_param_name);
		try {
			_localctx = new ParamNameContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			sd_name();
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

	public static class Param_valueContext extends ParserRuleContext {
		public Param_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_value; }
	 
		public Param_valueContext() { }
		public void copyFrom(Param_valueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamValueContext extends Param_valueContext {
		public ParamValueContext(Param_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterParamValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitParamValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitParamValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_valueContext param_value() throws RecognitionException {
		Param_valueContext _localctx = new Param_valueContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_param_value);
		int _la;
		try {
			_localctx = new ParamValueContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (TAB - 1)) | (1L << (LF - 1)) | (1L << (CR - 1)) | (1L << (SPACE - 1)) | (1L << (EXCLAMATION - 1)) | (1L << (POUND - 1)) | (1L << (DOLLAR - 1)) | (1L << (PERCENT - 1)) | (1L << (AMPERSAND - 1)) | (1L << (APOSTROPHE - 1)) | (1L << (LEFT_PAREN - 1)) | (1L << (RIGHT_PAREN - 1)) | (1L << (ASTERISK - 1)) | (1L << (PLUS - 1)) | (1L << (COMMA - 1)) | (1L << (DASH - 1)) | (1L << (PERIOD - 1)) | (1L << (SLASH - 1)) | (1L << (ZERO - 1)) | (1L << (ONE - 1)) | (1L << (TWO - 1)) | (1L << (THREE - 1)) | (1L << (FOUR - 1)) | (1L << (FIVE - 1)) | (1L << (SIX - 1)) | (1L << (SEVEN - 1)) | (1L << (EIGHT - 1)) | (1L << (NINE - 1)) | (1L << (COLON - 1)) | (1L << (SEMICOLON - 1)) | (1L << (LESS_THAN - 1)) | (1L << (EQUALS - 1)) | (1L << (GREATER_THAN - 1)) | (1L << (QUESTION - 1)) | (1L << (AT - 1)) | (1L << (CAP_A - 1)) | (1L << (CAP_B - 1)) | (1L << (CAP_C - 1)) | (1L << (CAP_D - 1)) | (1L << (CAP_E - 1)) | (1L << (CAP_F - 1)) | (1L << (CAP_G - 1)) | (1L << (CAP_H - 1)) | (1L << (CAP_I - 1)) | (1L << (CAP_J - 1)) | (1L << (CAP_K - 1)) | (1L << (CAP_L - 1)) | (1L << (CAP_M - 1)) | (1L << (CAP_N - 1)) | (1L << (CAP_O - 1)) | (1L << (CAP_P - 1)) | (1L << (CAP_Q - 1)) | (1L << (CAP_R - 1)) | (1L << (CAP_S - 1)) | (1L << (CAP_T - 1)) | (1L << (CAP_U - 1)) | (1L << (CAP_V - 1)) | (1L << (CAP_W - 1)) | (1L << (CAP_X - 1)) | (1L << (CAP_Y - 1)) | (1L << (CAP_Z - 1)) | (1L << (LEFT_BRACE - 1)) | (1L << (BACKSLASH - 1)))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CARAT - 66)) | (1L << (UNDERSCORE - 66)) | (1L << (ACCENT - 66)) | (1L << (A - 66)) | (1L << (B - 66)) | (1L << (C - 66)) | (1L << (D - 66)) | (1L << (E - 66)) | (1L << (F - 66)) | (1L << (G - 66)) | (1L << (H - 66)) | (1L << (I - 66)) | (1L << (J - 66)) | (1L << (K - 66)) | (1L << (L - 66)) | (1L << (M - 66)) | (1L << (N - 66)) | (1L << (O - 66)) | (1L << (P - 66)) | (1L << (Q - 66)) | (1L << (R - 66)) | (1L << (S - 66)) | (1L << (T - 66)) | (1L << (U - 66)) | (1L << (V - 66)) | (1L << (W - 66)) | (1L << (X - 66)) | (1L << (Y - 66)) | (1L << (Z - 66)) | (1L << (LEFT_CURLY_BRACE - 66)) | (1L << (PIPE - 66)) | (1L << (RIGHT_CURLY_BRACE - 66)) | (1L << (TILDE - 66)) | (1L << (U_0000 - 66)) | (1L << (U_0001 - 66)) | (1L << (U_0002 - 66)) | (1L << (U_0003 - 66)) | (1L << (U_0004 - 66)) | (1L << (U_0005 - 66)) | (1L << (U_0006 - 66)) | (1L << (U_0007 - 66)) | (1L << (U_0008 - 66)) | (1L << (U_000B - 66)) | (1L << (U_000C - 66)) | (1L << (U_000E - 66)) | (1L << (U_000F - 66)) | (1L << (U_0010 - 66)) | (1L << (U_0011 - 66)) | (1L << (U_0012 - 66)) | (1L << (U_0013 - 66)) | (1L << (U_0014 - 66)) | (1L << (U_0015 - 66)) | (1L << (U_0016 - 66)) | (1L << (U_0017 - 66)) | (1L << (U_0018 - 66)) | (1L << (U_0019 - 66)) | (1L << (U_001A - 66)) | (1L << (U_001B - 66)) | (1L << (U_001C - 66)) | (1L << (U_001D - 66)) | (1L << (U_001E - 66)) | (1L << (U_001F - 66)) | (1L << (U_007F - 66)) | (1L << (U_0080 - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (U_0081 - 130)) | (1L << (U_0082 - 130)) | (1L << (U_0083 - 130)) | (1L << (U_0084 - 130)) | (1L << (U_0085 - 130)) | (1L << (U_0086 - 130)) | (1L << (U_0087 - 130)) | (1L << (U_0088 - 130)) | (1L << (U_0089 - 130)) | (1L << (U_008A - 130)) | (1L << (U_008B - 130)) | (1L << (U_008C - 130)) | (1L << (U_008D - 130)) | (1L << (U_008E - 130)) | (1L << (U_008F - 130)) | (1L << (U_0090 - 130)) | (1L << (U_0091 - 130)) | (1L << (U_0092 - 130)) | (1L << (U_0093 - 130)) | (1L << (U_0094 - 130)) | (1L << (U_0095 - 130)) | (1L << (U_0096 - 130)) | (1L << (U_0097 - 130)) | (1L << (U_0098 - 130)) | (1L << (U_0099 - 130)) | (1L << (U_009A - 130)) | (1L << (U_009B - 130)) | (1L << (U_009C - 130)) | (1L << (U_009D - 130)) | (1L << (U_009E - 130)) | (1L << (U_009F - 130)) | (1L << (U_00A0 - 130)) | (1L << (U_00A1 - 130)) | (1L << (U_00A2 - 130)) | (1L << (U_00A3 - 130)) | (1L << (U_00A4 - 130)) | (1L << (U_00A5 - 130)) | (1L << (U_00A6 - 130)) | (1L << (U_00A7 - 130)) | (1L << (U_00A8 - 130)) | (1L << (U_00A9 - 130)) | (1L << (U_00AA - 130)) | (1L << (U_00AB - 130)) | (1L << (U_00AC - 130)) | (1L << (U_00AD - 130)) | (1L << (U_00AE - 130)) | (1L << (U_00AF - 130)) | (1L << (U_00B0 - 130)) | (1L << (U_00B1 - 130)) | (1L << (U_00B2 - 130)) | (1L << (U_00B3 - 130)) | (1L << (U_00B4 - 130)) | (1L << (U_00B5 - 130)) | (1L << (U_00B6 - 130)) | (1L << (U_00B7 - 130)) | (1L << (U_00B8 - 130)) | (1L << (U_00B9 - 130)) | (1L << (U_00BA - 130)) | (1L << (U_00BB - 130)) | (1L << (U_00BC - 130)) | (1L << (U_00BD - 130)) | (1L << (U_00BE - 130)) | (1L << (U_00BF - 130)) | (1L << (U_00C0 - 130)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (U_00C1 - 194)) | (1L << (U_00C2 - 194)) | (1L << (U_00C3 - 194)) | (1L << (U_00C4 - 194)) | (1L << (U_00C5 - 194)) | (1L << (U_00C6 - 194)) | (1L << (U_00C7 - 194)) | (1L << (U_00C8 - 194)) | (1L << (U_00C9 - 194)) | (1L << (U_00CA - 194)) | (1L << (U_00CB - 194)) | (1L << (U_00CC - 194)) | (1L << (U_00CD - 194)) | (1L << (U_00CE - 194)) | (1L << (U_00CF - 194)) | (1L << (U_00D0 - 194)) | (1L << (U_00D1 - 194)) | (1L << (U_00D2 - 194)) | (1L << (U_00D3 - 194)) | (1L << (U_00D4 - 194)) | (1L << (U_00D5 - 194)) | (1L << (U_00D6 - 194)) | (1L << (U_00D7 - 194)) | (1L << (U_00D8 - 194)) | (1L << (U_00D9 - 194)) | (1L << (U_00DA - 194)) | (1L << (U_00DB - 194)) | (1L << (U_00DC - 194)) | (1L << (U_00DD - 194)) | (1L << (U_00DE - 194)) | (1L << (U_00DF - 194)) | (1L << (U_00E0 - 194)) | (1L << (U_00E1 - 194)) | (1L << (U_00E2 - 194)) | (1L << (U_00E3 - 194)) | (1L << (U_00E4 - 194)) | (1L << (U_00E5 - 194)) | (1L << (U_00E6 - 194)) | (1L << (U_00E7 - 194)) | (1L << (U_00E8 - 194)) | (1L << (U_00E9 - 194)) | (1L << (U_00EA - 194)) | (1L << (U_00EB - 194)) | (1L << (U_00EC - 194)) | (1L << (U_00ED - 194)) | (1L << (U_00EE - 194)) | (1L << (U_00EF - 194)) | (1L << (U_00F0 - 194)) | (1L << (U_00F1 - 194)) | (1L << (U_00F2 - 194)) | (1L << (U_00F3 - 194)) | (1L << (U_00F4 - 194)) | (1L << (U_00F5 - 194)) | (1L << (U_00F6 - 194)) | (1L << (U_00F7 - 194)) | (1L << (U_00F8 - 194)) | (1L << (U_00F9 - 194)) | (1L << (U_00FA - 194)) | (1L << (U_00FB - 194)) | (1L << (U_00FC - 194)) | (1L << (U_00FD - 194)) | (1L << (U_00FE - 194)) | (1L << (U_00FF - 194)))) != 0)) {
				{
				setState(283);
				switch (_input.LA(1)) {
				case TAB:
				case LF:
				case CR:
				case SPACE:
				case EXCLAMATION:
				case POUND:
				case DOLLAR:
				case PERCENT:
				case AMPERSAND:
				case APOSTROPHE:
				case LEFT_PAREN:
				case RIGHT_PAREN:
				case ASTERISK:
				case PLUS:
				case COMMA:
				case DASH:
				case PERIOD:
				case SLASH:
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
				case COLON:
				case SEMICOLON:
				case LESS_THAN:
				case EQUALS:
				case GREATER_THAN:
				case QUESTION:
				case AT:
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
				case LEFT_BRACE:
				case CARAT:
				case UNDERSCORE:
				case ACCENT:
				case A:
				case B:
				case C:
				case D:
				case E:
				case F:
				case G:
				case H:
				case I:
				case J:
				case K:
				case L:
				case M:
				case N:
				case O:
				case P:
				case Q:
				case R:
				case S:
				case T:
				case U:
				case V:
				case W:
				case X:
				case Y:
				case Z:
				case LEFT_CURLY_BRACE:
				case PIPE:
				case RIGHT_CURLY_BRACE:
				case TILDE:
				case U_0000:
				case U_0001:
				case U_0002:
				case U_0003:
				case U_0004:
				case U_0005:
				case U_0006:
				case U_0007:
				case U_0008:
				case U_000B:
				case U_000C:
				case U_000E:
				case U_000F:
				case U_0010:
				case U_0011:
				case U_0012:
				case U_0013:
				case U_0014:
				case U_0015:
				case U_0016:
				case U_0017:
				case U_0018:
				case U_0019:
				case U_001A:
				case U_001B:
				case U_001C:
				case U_001D:
				case U_001E:
				case U_001F:
				case U_007F:
				case U_0080:
				case U_0081:
				case U_0082:
				case U_0083:
				case U_0084:
				case U_0085:
				case U_0086:
				case U_0087:
				case U_0088:
				case U_0089:
				case U_008A:
				case U_008B:
				case U_008C:
				case U_008D:
				case U_008E:
				case U_008F:
				case U_0090:
				case U_0091:
				case U_0092:
				case U_0093:
				case U_0094:
				case U_0095:
				case U_0096:
				case U_0097:
				case U_0098:
				case U_0099:
				case U_009A:
				case U_009B:
				case U_009C:
				case U_009D:
				case U_009E:
				case U_009F:
				case U_00A0:
				case U_00A1:
				case U_00A2:
				case U_00A3:
				case U_00A4:
				case U_00A5:
				case U_00A6:
				case U_00A7:
				case U_00A8:
				case U_00A9:
				case U_00AA:
				case U_00AB:
				case U_00AC:
				case U_00AD:
				case U_00AE:
				case U_00AF:
				case U_00B0:
				case U_00B1:
				case U_00B2:
				case U_00B3:
				case U_00B4:
				case U_00B5:
				case U_00B6:
				case U_00B7:
				case U_00B8:
				case U_00B9:
				case U_00BA:
				case U_00BB:
				case U_00BC:
				case U_00BD:
				case U_00BE:
				case U_00BF:
				case U_00C0:
				case U_00C1:
				case U_00C2:
				case U_00C3:
				case U_00C4:
				case U_00C5:
				case U_00C6:
				case U_00C7:
				case U_00C8:
				case U_00C9:
				case U_00CA:
				case U_00CB:
				case U_00CC:
				case U_00CD:
				case U_00CE:
				case U_00CF:
				case U_00D0:
				case U_00D1:
				case U_00D2:
				case U_00D3:
				case U_00D4:
				case U_00D5:
				case U_00D6:
				case U_00D7:
				case U_00D8:
				case U_00D9:
				case U_00DA:
				case U_00DB:
				case U_00DC:
				case U_00DD:
				case U_00DE:
				case U_00DF:
				case U_00E0:
				case U_00E1:
				case U_00E2:
				case U_00E3:
				case U_00E4:
				case U_00E5:
				case U_00E6:
				case U_00E7:
				case U_00E8:
				case U_00E9:
				case U_00EA:
				case U_00EB:
				case U_00EC:
				case U_00ED:
				case U_00EE:
				case U_00EF:
				case U_00F0:
				case U_00F1:
				case U_00F2:
				case U_00F3:
				case U_00F4:
				case U_00F5:
				case U_00F6:
				case U_00F7:
				case U_00F8:
				case U_00F9:
				case U_00FA:
				case U_00FB:
				case U_00FC:
				case U_00FD:
				case U_00FE:
				case U_00FF:
					{
					setState(280);
					_la = _input.LA(1);
					if ( _la <= 0 || (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (QUOTE - 6)) | (1L << (BACKSLASH - 6)) | (1L << (RIGHT_BRACE - 6)))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				case BACKSLASH:
					{
					setState(281);
					match(BACKSLASH);
					setState(282);
					_la = _input.LA(1);
					if ( !(((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (QUOTE - 6)) | (1L << (BACKSLASH - 6)) | (1L << (RIGHT_BRACE - 6)))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(287);
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

	public static class Sd_nameContext extends ParserRuleContext {
		public List<PrintusasciinospecialsContext> printusasciinospecials() {
			return getRuleContexts(PrintusasciinospecialsContext.class);
		}
		public PrintusasciinospecialsContext printusasciinospecials(int i) {
			return getRuleContext(PrintusasciinospecialsContext.class,i);
		}
		public Sd_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sd_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterSd_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitSd_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitSd_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sd_nameContext sd_name() throws RecognitionException {
		Sd_nameContext _localctx = new Sd_nameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_sd_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXCLAMATION) | (1L << POUND) | (1L << DOLLAR) | (1L << PERCENT) | (1L << AMPERSAND) | (1L << APOSTROPHE) | (1L << LEFT_PAREN) | (1L << RIGHT_PAREN) | (1L << ASTERISK) | (1L << PLUS) | (1L << COMMA) | (1L << DASH) | (1L << PERIOD) | (1L << SLASH) | (1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE) | (1L << COLON) | (1L << SEMICOLON) | (1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << QUESTION) | (1L << AT) | (1L << CAP_A) | (1L << CAP_B) | (1L << CAP_C) | (1L << CAP_D) | (1L << CAP_E) | (1L << CAP_F) | (1L << CAP_G) | (1L << CAP_H) | (1L << CAP_I) | (1L << CAP_J) | (1L << CAP_K) | (1L << CAP_L) | (1L << CAP_M) | (1L << CAP_N) | (1L << CAP_O) | (1L << CAP_P) | (1L << CAP_Q) | (1L << CAP_R) | (1L << CAP_S) | (1L << CAP_T) | (1L << CAP_U) | (1L << CAP_V) | (1L << CAP_W) | (1L << CAP_X) | (1L << CAP_Y) | (1L << CAP_Z) | (1L << LEFT_BRACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BACKSLASH - 64)) | (1L << (CARAT - 64)) | (1L << (UNDERSCORE - 64)) | (1L << (ACCENT - 64)) | (1L << (A - 64)) | (1L << (B - 64)) | (1L << (C - 64)) | (1L << (D - 64)) | (1L << (E - 64)) | (1L << (F - 64)) | (1L << (G - 64)) | (1L << (H - 64)) | (1L << (I - 64)) | (1L << (J - 64)) | (1L << (K - 64)) | (1L << (L - 64)) | (1L << (M - 64)) | (1L << (N - 64)) | (1L << (O - 64)) | (1L << (P - 64)) | (1L << (Q - 64)) | (1L << (R - 64)) | (1L << (S - 64)) | (1L << (T - 64)) | (1L << (U - 64)) | (1L << (V - 64)) | (1L << (W - 64)) | (1L << (X - 64)) | (1L << (Y - 64)) | (1L << (Z - 64)) | (1L << (LEFT_CURLY_BRACE - 64)) | (1L << (PIPE - 64)) | (1L << (RIGHT_CURLY_BRACE - 64)) | (1L << (TILDE - 64)))) != 0)) {
				{
				{
				setState(288);
				printusasciinospecials();
				}
				}
				setState(293);
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
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterMsgUTF8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitMsgUTF8(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitMsgUTF8(this);
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
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterMsgAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitMsgAny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitMsgAny(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MsgContext msg() throws RecognitionException {
		MsgContext _localctx = new MsgContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_msg);
		try {
			setState(296);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new MsgAnyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				msg_any();
				}
				break;
			case 2:
				_localctx = new MsgUTF8Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
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
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterMsg_any(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitMsg_any(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitMsg_any(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Msg_anyContext msg_any() throws RecognitionException {
		Msg_anyContext _localctx = new Msg_anyContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_msg_any);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (TAB - 1)) | (1L << (LF - 1)) | (1L << (CR - 1)) | (1L << (SPACE - 1)) | (1L << (EXCLAMATION - 1)) | (1L << (QUOTE - 1)) | (1L << (POUND - 1)) | (1L << (DOLLAR - 1)) | (1L << (PERCENT - 1)) | (1L << (AMPERSAND - 1)) | (1L << (APOSTROPHE - 1)) | (1L << (LEFT_PAREN - 1)) | (1L << (RIGHT_PAREN - 1)) | (1L << (ASTERISK - 1)) | (1L << (PLUS - 1)) | (1L << (COMMA - 1)) | (1L << (DASH - 1)) | (1L << (PERIOD - 1)) | (1L << (SLASH - 1)) | (1L << (ZERO - 1)) | (1L << (ONE - 1)) | (1L << (TWO - 1)) | (1L << (THREE - 1)) | (1L << (FOUR - 1)) | (1L << (FIVE - 1)) | (1L << (SIX - 1)) | (1L << (SEVEN - 1)) | (1L << (EIGHT - 1)) | (1L << (NINE - 1)) | (1L << (COLON - 1)) | (1L << (SEMICOLON - 1)) | (1L << (LESS_THAN - 1)) | (1L << (EQUALS - 1)) | (1L << (GREATER_THAN - 1)) | (1L << (QUESTION - 1)) | (1L << (AT - 1)) | (1L << (CAP_A - 1)) | (1L << (CAP_B - 1)) | (1L << (CAP_C - 1)) | (1L << (CAP_D - 1)) | (1L << (CAP_E - 1)) | (1L << (CAP_F - 1)) | (1L << (CAP_G - 1)) | (1L << (CAP_H - 1)) | (1L << (CAP_I - 1)) | (1L << (CAP_J - 1)) | (1L << (CAP_K - 1)) | (1L << (CAP_L - 1)) | (1L << (CAP_M - 1)) | (1L << (CAP_N - 1)) | (1L << (CAP_O - 1)) | (1L << (CAP_P - 1)) | (1L << (CAP_Q - 1)) | (1L << (CAP_R - 1)) | (1L << (CAP_S - 1)) | (1L << (CAP_T - 1)) | (1L << (CAP_U - 1)) | (1L << (CAP_V - 1)) | (1L << (CAP_W - 1)) | (1L << (CAP_X - 1)) | (1L << (CAP_Y - 1)) | (1L << (CAP_Z - 1)) | (1L << (LEFT_BRACE - 1)) | (1L << (BACKSLASH - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (RIGHT_BRACE - 65)) | (1L << (CARAT - 65)) | (1L << (UNDERSCORE - 65)) | (1L << (ACCENT - 65)) | (1L << (A - 65)) | (1L << (B - 65)) | (1L << (C - 65)) | (1L << (D - 65)) | (1L << (E - 65)) | (1L << (F - 65)) | (1L << (G - 65)) | (1L << (H - 65)) | (1L << (I - 65)) | (1L << (J - 65)) | (1L << (K - 65)) | (1L << (L - 65)) | (1L << (M - 65)) | (1L << (N - 65)) | (1L << (O - 65)) | (1L << (P - 65)) | (1L << (Q - 65)) | (1L << (R - 65)) | (1L << (S - 65)) | (1L << (T - 65)) | (1L << (U - 65)) | (1L << (V - 65)) | (1L << (W - 65)) | (1L << (X - 65)) | (1L << (Y - 65)) | (1L << (Z - 65)) | (1L << (LEFT_CURLY_BRACE - 65)) | (1L << (PIPE - 65)) | (1L << (RIGHT_CURLY_BRACE - 65)) | (1L << (TILDE - 65)) | (1L << (U_0000 - 65)) | (1L << (U_0001 - 65)) | (1L << (U_0002 - 65)) | (1L << (U_0003 - 65)) | (1L << (U_0004 - 65)) | (1L << (U_0005 - 65)) | (1L << (U_0006 - 65)) | (1L << (U_0007 - 65)) | (1L << (U_0008 - 65)) | (1L << (U_000B - 65)) | (1L << (U_000C - 65)) | (1L << (U_000E - 65)) | (1L << (U_000F - 65)) | (1L << (U_0010 - 65)) | (1L << (U_0011 - 65)) | (1L << (U_0012 - 65)) | (1L << (U_0013 - 65)) | (1L << (U_0014 - 65)) | (1L << (U_0015 - 65)) | (1L << (U_0016 - 65)) | (1L << (U_0017 - 65)) | (1L << (U_0018 - 65)) | (1L << (U_0019 - 65)) | (1L << (U_001A - 65)) | (1L << (U_001B - 65)) | (1L << (U_001C - 65)) | (1L << (U_001D - 65)) | (1L << (U_001E - 65)) | (1L << (U_001F - 65)) | (1L << (U_007F - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (U_0080 - 129)) | (1L << (U_0081 - 129)) | (1L << (U_0082 - 129)) | (1L << (U_0083 - 129)) | (1L << (U_0084 - 129)) | (1L << (U_0085 - 129)) | (1L << (U_0086 - 129)) | (1L << (U_0087 - 129)) | (1L << (U_0088 - 129)) | (1L << (U_0089 - 129)) | (1L << (U_008A - 129)) | (1L << (U_008B - 129)) | (1L << (U_008C - 129)) | (1L << (U_008D - 129)) | (1L << (U_008E - 129)) | (1L << (U_008F - 129)) | (1L << (U_0090 - 129)) | (1L << (U_0091 - 129)) | (1L << (U_0092 - 129)) | (1L << (U_0093 - 129)) | (1L << (U_0094 - 129)) | (1L << (U_0095 - 129)) | (1L << (U_0096 - 129)) | (1L << (U_0097 - 129)) | (1L << (U_0098 - 129)) | (1L << (U_0099 - 129)) | (1L << (U_009A - 129)) | (1L << (U_009B - 129)) | (1L << (U_009C - 129)) | (1L << (U_009D - 129)) | (1L << (U_009E - 129)) | (1L << (U_009F - 129)) | (1L << (U_00A0 - 129)) | (1L << (U_00A1 - 129)) | (1L << (U_00A2 - 129)) | (1L << (U_00A3 - 129)) | (1L << (U_00A4 - 129)) | (1L << (U_00A5 - 129)) | (1L << (U_00A6 - 129)) | (1L << (U_00A7 - 129)) | (1L << (U_00A8 - 129)) | (1L << (U_00A9 - 129)) | (1L << (U_00AA - 129)) | (1L << (U_00AB - 129)) | (1L << (U_00AC - 129)) | (1L << (U_00AD - 129)) | (1L << (U_00AE - 129)) | (1L << (U_00AF - 129)) | (1L << (U_00B0 - 129)) | (1L << (U_00B1 - 129)) | (1L << (U_00B2 - 129)) | (1L << (U_00B3 - 129)) | (1L << (U_00B4 - 129)) | (1L << (U_00B5 - 129)) | (1L << (U_00B6 - 129)) | (1L << (U_00B7 - 129)) | (1L << (U_00B8 - 129)) | (1L << (U_00B9 - 129)) | (1L << (U_00BA - 129)) | (1L << (U_00BB - 129)) | (1L << (U_00BC - 129)) | (1L << (U_00BD - 129)) | (1L << (U_00BE - 129)) | (1L << (U_00BF - 129)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (U_00C0 - 193)) | (1L << (U_00C1 - 193)) | (1L << (U_00C2 - 193)) | (1L << (U_00C3 - 193)) | (1L << (U_00C4 - 193)) | (1L << (U_00C5 - 193)) | (1L << (U_00C6 - 193)) | (1L << (U_00C7 - 193)) | (1L << (U_00C8 - 193)) | (1L << (U_00C9 - 193)) | (1L << (U_00CA - 193)) | (1L << (U_00CB - 193)) | (1L << (U_00CC - 193)) | (1L << (U_00CD - 193)) | (1L << (U_00CE - 193)) | (1L << (U_00CF - 193)) | (1L << (U_00D0 - 193)) | (1L << (U_00D1 - 193)) | (1L << (U_00D2 - 193)) | (1L << (U_00D3 - 193)) | (1L << (U_00D4 - 193)) | (1L << (U_00D5 - 193)) | (1L << (U_00D6 - 193)) | (1L << (U_00D7 - 193)) | (1L << (U_00D8 - 193)) | (1L << (U_00D9 - 193)) | (1L << (U_00DA - 193)) | (1L << (U_00DB - 193)) | (1L << (U_00DC - 193)) | (1L << (U_00DD - 193)) | (1L << (U_00DE - 193)) | (1L << (U_00DF - 193)) | (1L << (U_00E0 - 193)) | (1L << (U_00E1 - 193)) | (1L << (U_00E2 - 193)) | (1L << (U_00E3 - 193)) | (1L << (U_00E4 - 193)) | (1L << (U_00E5 - 193)) | (1L << (U_00E6 - 193)) | (1L << (U_00E7 - 193)) | (1L << (U_00E8 - 193)) | (1L << (U_00E9 - 193)) | (1L << (U_00EA - 193)) | (1L << (U_00EB - 193)) | (1L << (U_00EC - 193)) | (1L << (U_00ED - 193)) | (1L << (U_00EE - 193)) | (1L << (U_00EF - 193)) | (1L << (U_00F0 - 193)) | (1L << (U_00F1 - 193)) | (1L << (U_00F2 - 193)) | (1L << (U_00F3 - 193)) | (1L << (U_00F4 - 193)) | (1L << (U_00F5 - 193)) | (1L << (U_00F6 - 193)) | (1L << (U_00F7 - 193)) | (1L << (U_00F8 - 193)) | (1L << (U_00F9 - 193)) | (1L << (U_00FA - 193)) | (1L << (U_00FB - 193)) | (1L << (U_00FC - 193)) | (1L << (U_00FD - 193)) | (1L << (U_00FE - 193)) | (1L << (U_00FF - 193)))) != 0)) {
				{
				{
				setState(298);
				octet();
				}
				}
				setState(303);
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
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterMsg_utf8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitMsg_utf8(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitMsg_utf8(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Msg_utf8Context msg_utf8() throws RecognitionException {
		Msg_utf8Context _localctx = new Msg_utf8Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_msg_utf8);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			bom();
			setState(305);
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
		public TerminalNode U_00EF() { return getToken(Rfc5424Parser.U_00EF, 0); }
		public TerminalNode U_00BB() { return getToken(Rfc5424Parser.U_00BB, 0); }
		public TerminalNode U_00BF() { return getToken(Rfc5424Parser.U_00BF, 0); }
		public BomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterBom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitBom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitBom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BomContext bom() throws RecognitionException {
		BomContext _localctx = new BomContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_bom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_la = _input.LA(1);
			if ( !(((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (U_00BB - 188)) | (1L << (U_00BF - 188)) | (1L << (U_00EF - 188)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterUtf_8_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitUtf_8_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitUtf_8_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Utf_8_stringContext utf_8_string() throws RecognitionException {
		Utf_8_stringContext _localctx = new Utf_8_stringContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_utf_8_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (TAB - 1)) | (1L << (LF - 1)) | (1L << (CR - 1)) | (1L << (SPACE - 1)) | (1L << (EXCLAMATION - 1)) | (1L << (QUOTE - 1)) | (1L << (POUND - 1)) | (1L << (DOLLAR - 1)) | (1L << (PERCENT - 1)) | (1L << (AMPERSAND - 1)) | (1L << (APOSTROPHE - 1)) | (1L << (LEFT_PAREN - 1)) | (1L << (RIGHT_PAREN - 1)) | (1L << (ASTERISK - 1)) | (1L << (PLUS - 1)) | (1L << (COMMA - 1)) | (1L << (DASH - 1)) | (1L << (PERIOD - 1)) | (1L << (SLASH - 1)) | (1L << (ZERO - 1)) | (1L << (ONE - 1)) | (1L << (TWO - 1)) | (1L << (THREE - 1)) | (1L << (FOUR - 1)) | (1L << (FIVE - 1)) | (1L << (SIX - 1)) | (1L << (SEVEN - 1)) | (1L << (EIGHT - 1)) | (1L << (NINE - 1)) | (1L << (COLON - 1)) | (1L << (SEMICOLON - 1)) | (1L << (LESS_THAN - 1)) | (1L << (EQUALS - 1)) | (1L << (GREATER_THAN - 1)) | (1L << (QUESTION - 1)) | (1L << (AT - 1)) | (1L << (CAP_A - 1)) | (1L << (CAP_B - 1)) | (1L << (CAP_C - 1)) | (1L << (CAP_D - 1)) | (1L << (CAP_E - 1)) | (1L << (CAP_F - 1)) | (1L << (CAP_G - 1)) | (1L << (CAP_H - 1)) | (1L << (CAP_I - 1)) | (1L << (CAP_J - 1)) | (1L << (CAP_K - 1)) | (1L << (CAP_L - 1)) | (1L << (CAP_M - 1)) | (1L << (CAP_N - 1)) | (1L << (CAP_O - 1)) | (1L << (CAP_P - 1)) | (1L << (CAP_Q - 1)) | (1L << (CAP_R - 1)) | (1L << (CAP_S - 1)) | (1L << (CAP_T - 1)) | (1L << (CAP_U - 1)) | (1L << (CAP_V - 1)) | (1L << (CAP_W - 1)) | (1L << (CAP_X - 1)) | (1L << (CAP_Y - 1)) | (1L << (CAP_Z - 1)) | (1L << (LEFT_BRACE - 1)) | (1L << (BACKSLASH - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (RIGHT_BRACE - 65)) | (1L << (CARAT - 65)) | (1L << (UNDERSCORE - 65)) | (1L << (ACCENT - 65)) | (1L << (A - 65)) | (1L << (B - 65)) | (1L << (C - 65)) | (1L << (D - 65)) | (1L << (E - 65)) | (1L << (F - 65)) | (1L << (G - 65)) | (1L << (H - 65)) | (1L << (I - 65)) | (1L << (J - 65)) | (1L << (K - 65)) | (1L << (L - 65)) | (1L << (M - 65)) | (1L << (N - 65)) | (1L << (O - 65)) | (1L << (P - 65)) | (1L << (Q - 65)) | (1L << (R - 65)) | (1L << (S - 65)) | (1L << (T - 65)) | (1L << (U - 65)) | (1L << (V - 65)) | (1L << (W - 65)) | (1L << (X - 65)) | (1L << (Y - 65)) | (1L << (Z - 65)) | (1L << (LEFT_CURLY_BRACE - 65)) | (1L << (PIPE - 65)) | (1L << (RIGHT_CURLY_BRACE - 65)) | (1L << (TILDE - 65)) | (1L << (U_0000 - 65)) | (1L << (U_0001 - 65)) | (1L << (U_0002 - 65)) | (1L << (U_0003 - 65)) | (1L << (U_0004 - 65)) | (1L << (U_0005 - 65)) | (1L << (U_0006 - 65)) | (1L << (U_0007 - 65)) | (1L << (U_0008 - 65)) | (1L << (U_000B - 65)) | (1L << (U_000C - 65)) | (1L << (U_000E - 65)) | (1L << (U_000F - 65)) | (1L << (U_0010 - 65)) | (1L << (U_0011 - 65)) | (1L << (U_0012 - 65)) | (1L << (U_0013 - 65)) | (1L << (U_0014 - 65)) | (1L << (U_0015 - 65)) | (1L << (U_0016 - 65)) | (1L << (U_0017 - 65)) | (1L << (U_0018 - 65)) | (1L << (U_0019 - 65)) | (1L << (U_001A - 65)) | (1L << (U_001B - 65)) | (1L << (U_001C - 65)) | (1L << (U_001D - 65)) | (1L << (U_001E - 65)) | (1L << (U_001F - 65)) | (1L << (U_007F - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (U_0080 - 129)) | (1L << (U_0081 - 129)) | (1L << (U_0082 - 129)) | (1L << (U_0083 - 129)) | (1L << (U_0084 - 129)) | (1L << (U_0085 - 129)) | (1L << (U_0086 - 129)) | (1L << (U_0087 - 129)) | (1L << (U_0088 - 129)) | (1L << (U_0089 - 129)) | (1L << (U_008A - 129)) | (1L << (U_008B - 129)) | (1L << (U_008C - 129)) | (1L << (U_008D - 129)) | (1L << (U_008E - 129)) | (1L << (U_008F - 129)) | (1L << (U_0090 - 129)) | (1L << (U_0091 - 129)) | (1L << (U_0092 - 129)) | (1L << (U_0093 - 129)) | (1L << (U_0094 - 129)) | (1L << (U_0095 - 129)) | (1L << (U_0096 - 129)) | (1L << (U_0097 - 129)) | (1L << (U_0098 - 129)) | (1L << (U_0099 - 129)) | (1L << (U_009A - 129)) | (1L << (U_009B - 129)) | (1L << (U_009C - 129)) | (1L << (U_009D - 129)) | (1L << (U_009E - 129)) | (1L << (U_009F - 129)) | (1L << (U_00A0 - 129)) | (1L << (U_00A1 - 129)) | (1L << (U_00A2 - 129)) | (1L << (U_00A3 - 129)) | (1L << (U_00A4 - 129)) | (1L << (U_00A5 - 129)) | (1L << (U_00A6 - 129)) | (1L << (U_00A7 - 129)) | (1L << (U_00A8 - 129)) | (1L << (U_00A9 - 129)) | (1L << (U_00AA - 129)) | (1L << (U_00AB - 129)) | (1L << (U_00AC - 129)) | (1L << (U_00AD - 129)) | (1L << (U_00AE - 129)) | (1L << (U_00AF - 129)) | (1L << (U_00B0 - 129)) | (1L << (U_00B1 - 129)) | (1L << (U_00B2 - 129)) | (1L << (U_00B3 - 129)) | (1L << (U_00B4 - 129)) | (1L << (U_00B5 - 129)) | (1L << (U_00B6 - 129)) | (1L << (U_00B7 - 129)) | (1L << (U_00B8 - 129)) | (1L << (U_00B9 - 129)) | (1L << (U_00BA - 129)) | (1L << (U_00BB - 129)) | (1L << (U_00BC - 129)) | (1L << (U_00BD - 129)) | (1L << (U_00BE - 129)) | (1L << (U_00BF - 129)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (U_00C0 - 193)) | (1L << (U_00C1 - 193)) | (1L << (U_00C2 - 193)) | (1L << (U_00C3 - 193)) | (1L << (U_00C4 - 193)) | (1L << (U_00C5 - 193)) | (1L << (U_00C6 - 193)) | (1L << (U_00C7 - 193)) | (1L << (U_00C8 - 193)) | (1L << (U_00C9 - 193)) | (1L << (U_00CA - 193)) | (1L << (U_00CB - 193)) | (1L << (U_00CC - 193)) | (1L << (U_00CD - 193)) | (1L << (U_00CE - 193)) | (1L << (U_00CF - 193)) | (1L << (U_00D0 - 193)) | (1L << (U_00D1 - 193)) | (1L << (U_00D2 - 193)) | (1L << (U_00D3 - 193)) | (1L << (U_00D4 - 193)) | (1L << (U_00D5 - 193)) | (1L << (U_00D6 - 193)) | (1L << (U_00D7 - 193)) | (1L << (U_00D8 - 193)) | (1L << (U_00D9 - 193)) | (1L << (U_00DA - 193)) | (1L << (U_00DB - 193)) | (1L << (U_00DC - 193)) | (1L << (U_00DD - 193)) | (1L << (U_00DE - 193)) | (1L << (U_00DF - 193)) | (1L << (U_00E0 - 193)) | (1L << (U_00E1 - 193)) | (1L << (U_00E2 - 193)) | (1L << (U_00E3 - 193)) | (1L << (U_00E4 - 193)) | (1L << (U_00E5 - 193)) | (1L << (U_00E6 - 193)) | (1L << (U_00E7 - 193)) | (1L << (U_00E8 - 193)) | (1L << (U_00E9 - 193)) | (1L << (U_00EA - 193)) | (1L << (U_00EB - 193)) | (1L << (U_00EC - 193)) | (1L << (U_00ED - 193)) | (1L << (U_00EE - 193)) | (1L << (U_00EF - 193)) | (1L << (U_00F0 - 193)) | (1L << (U_00F1 - 193)) | (1L << (U_00F2 - 193)) | (1L << (U_00F3 - 193)) | (1L << (U_00F4 - 193)) | (1L << (U_00F5 - 193)) | (1L << (U_00F6 - 193)) | (1L << (U_00F7 - 193)) | (1L << (U_00F8 - 193)) | (1L << (U_00F9 - 193)) | (1L << (U_00FA - 193)) | (1L << (U_00FB - 193)) | (1L << (U_00FC - 193)) | (1L << (U_00FD - 193)) | (1L << (U_00FE - 193)) | (1L << (U_00FF - 193)))) != 0)) {
				{
				{
				setState(309);
				octet();
				}
				}
				setState(314);
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
		public TerminalNode U_0000() { return getToken(Rfc5424Parser.U_0000, 0); }
		public TerminalNode U_0001() { return getToken(Rfc5424Parser.U_0001, 0); }
		public TerminalNode U_0002() { return getToken(Rfc5424Parser.U_0002, 0); }
		public TerminalNode U_0003() { return getToken(Rfc5424Parser.U_0003, 0); }
		public TerminalNode U_0004() { return getToken(Rfc5424Parser.U_0004, 0); }
		public TerminalNode U_0005() { return getToken(Rfc5424Parser.U_0005, 0); }
		public TerminalNode U_0006() { return getToken(Rfc5424Parser.U_0006, 0); }
		public TerminalNode U_0007() { return getToken(Rfc5424Parser.U_0007, 0); }
		public TerminalNode U_0008() { return getToken(Rfc5424Parser.U_0008, 0); }
		public TerminalNode TAB() { return getToken(Rfc5424Parser.TAB, 0); }
		public TerminalNode LF() { return getToken(Rfc5424Parser.LF, 0); }
		public TerminalNode U_000B() { return getToken(Rfc5424Parser.U_000B, 0); }
		public TerminalNode U_000C() { return getToken(Rfc5424Parser.U_000C, 0); }
		public TerminalNode CR() { return getToken(Rfc5424Parser.CR, 0); }
		public TerminalNode U_000E() { return getToken(Rfc5424Parser.U_000E, 0); }
		public TerminalNode U_000F() { return getToken(Rfc5424Parser.U_000F, 0); }
		public TerminalNode U_0010() { return getToken(Rfc5424Parser.U_0010, 0); }
		public TerminalNode U_0011() { return getToken(Rfc5424Parser.U_0011, 0); }
		public TerminalNode U_0012() { return getToken(Rfc5424Parser.U_0012, 0); }
		public TerminalNode U_0013() { return getToken(Rfc5424Parser.U_0013, 0); }
		public TerminalNode U_0014() { return getToken(Rfc5424Parser.U_0014, 0); }
		public TerminalNode U_0015() { return getToken(Rfc5424Parser.U_0015, 0); }
		public TerminalNode U_0016() { return getToken(Rfc5424Parser.U_0016, 0); }
		public TerminalNode U_0017() { return getToken(Rfc5424Parser.U_0017, 0); }
		public TerminalNode U_0018() { return getToken(Rfc5424Parser.U_0018, 0); }
		public TerminalNode U_0019() { return getToken(Rfc5424Parser.U_0019, 0); }
		public TerminalNode U_001A() { return getToken(Rfc5424Parser.U_001A, 0); }
		public TerminalNode U_001B() { return getToken(Rfc5424Parser.U_001B, 0); }
		public TerminalNode U_001C() { return getToken(Rfc5424Parser.U_001C, 0); }
		public TerminalNode U_001D() { return getToken(Rfc5424Parser.U_001D, 0); }
		public TerminalNode U_001E() { return getToken(Rfc5424Parser.U_001E, 0); }
		public TerminalNode U_001F() { return getToken(Rfc5424Parser.U_001F, 0); }
		public TerminalNode SPACE() { return getToken(Rfc5424Parser.SPACE, 0); }
		public TerminalNode EXCLAMATION() { return getToken(Rfc5424Parser.EXCLAMATION, 0); }
		public TerminalNode QUOTE() { return getToken(Rfc5424Parser.QUOTE, 0); }
		public TerminalNode POUND() { return getToken(Rfc5424Parser.POUND, 0); }
		public TerminalNode DOLLAR() { return getToken(Rfc5424Parser.DOLLAR, 0); }
		public TerminalNode PERCENT() { return getToken(Rfc5424Parser.PERCENT, 0); }
		public TerminalNode AMPERSAND() { return getToken(Rfc5424Parser.AMPERSAND, 0); }
		public TerminalNode APOSTROPHE() { return getToken(Rfc5424Parser.APOSTROPHE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(Rfc5424Parser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(Rfc5424Parser.RIGHT_PAREN, 0); }
		public TerminalNode ASTERISK() { return getToken(Rfc5424Parser.ASTERISK, 0); }
		public TerminalNode PLUS() { return getToken(Rfc5424Parser.PLUS, 0); }
		public TerminalNode COMMA() { return getToken(Rfc5424Parser.COMMA, 0); }
		public TerminalNode DASH() { return getToken(Rfc5424Parser.DASH, 0); }
		public TerminalNode PERIOD() { return getToken(Rfc5424Parser.PERIOD, 0); }
		public TerminalNode SLASH() { return getToken(Rfc5424Parser.SLASH, 0); }
		public TerminalNode ZERO() { return getToken(Rfc5424Parser.ZERO, 0); }
		public TerminalNode ONE() { return getToken(Rfc5424Parser.ONE, 0); }
		public TerminalNode TWO() { return getToken(Rfc5424Parser.TWO, 0); }
		public TerminalNode THREE() { return getToken(Rfc5424Parser.THREE, 0); }
		public TerminalNode FOUR() { return getToken(Rfc5424Parser.FOUR, 0); }
		public TerminalNode FIVE() { return getToken(Rfc5424Parser.FIVE, 0); }
		public TerminalNode SIX() { return getToken(Rfc5424Parser.SIX, 0); }
		public TerminalNode SEVEN() { return getToken(Rfc5424Parser.SEVEN, 0); }
		public TerminalNode EIGHT() { return getToken(Rfc5424Parser.EIGHT, 0); }
		public TerminalNode NINE() { return getToken(Rfc5424Parser.NINE, 0); }
		public TerminalNode COLON() { return getToken(Rfc5424Parser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(Rfc5424Parser.SEMICOLON, 0); }
		public TerminalNode LESS_THAN() { return getToken(Rfc5424Parser.LESS_THAN, 0); }
		public TerminalNode EQUALS() { return getToken(Rfc5424Parser.EQUALS, 0); }
		public TerminalNode GREATER_THAN() { return getToken(Rfc5424Parser.GREATER_THAN, 0); }
		public TerminalNode QUESTION() { return getToken(Rfc5424Parser.QUESTION, 0); }
		public TerminalNode AT() { return getToken(Rfc5424Parser.AT, 0); }
		public TerminalNode CAP_A() { return getToken(Rfc5424Parser.CAP_A, 0); }
		public TerminalNode CAP_B() { return getToken(Rfc5424Parser.CAP_B, 0); }
		public TerminalNode CAP_C() { return getToken(Rfc5424Parser.CAP_C, 0); }
		public TerminalNode CAP_D() { return getToken(Rfc5424Parser.CAP_D, 0); }
		public TerminalNode CAP_E() { return getToken(Rfc5424Parser.CAP_E, 0); }
		public TerminalNode CAP_F() { return getToken(Rfc5424Parser.CAP_F, 0); }
		public TerminalNode CAP_G() { return getToken(Rfc5424Parser.CAP_G, 0); }
		public TerminalNode CAP_H() { return getToken(Rfc5424Parser.CAP_H, 0); }
		public TerminalNode CAP_I() { return getToken(Rfc5424Parser.CAP_I, 0); }
		public TerminalNode CAP_J() { return getToken(Rfc5424Parser.CAP_J, 0); }
		public TerminalNode CAP_K() { return getToken(Rfc5424Parser.CAP_K, 0); }
		public TerminalNode CAP_L() { return getToken(Rfc5424Parser.CAP_L, 0); }
		public TerminalNode CAP_M() { return getToken(Rfc5424Parser.CAP_M, 0); }
		public TerminalNode CAP_N() { return getToken(Rfc5424Parser.CAP_N, 0); }
		public TerminalNode CAP_O() { return getToken(Rfc5424Parser.CAP_O, 0); }
		public TerminalNode CAP_P() { return getToken(Rfc5424Parser.CAP_P, 0); }
		public TerminalNode CAP_Q() { return getToken(Rfc5424Parser.CAP_Q, 0); }
		public TerminalNode CAP_R() { return getToken(Rfc5424Parser.CAP_R, 0); }
		public TerminalNode CAP_S() { return getToken(Rfc5424Parser.CAP_S, 0); }
		public TerminalNode CAP_T() { return getToken(Rfc5424Parser.CAP_T, 0); }
		public TerminalNode CAP_U() { return getToken(Rfc5424Parser.CAP_U, 0); }
		public TerminalNode CAP_V() { return getToken(Rfc5424Parser.CAP_V, 0); }
		public TerminalNode CAP_W() { return getToken(Rfc5424Parser.CAP_W, 0); }
		public TerminalNode CAP_X() { return getToken(Rfc5424Parser.CAP_X, 0); }
		public TerminalNode CAP_Y() { return getToken(Rfc5424Parser.CAP_Y, 0); }
		public TerminalNode CAP_Z() { return getToken(Rfc5424Parser.CAP_Z, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(Rfc5424Parser.LEFT_BRACE, 0); }
		public TerminalNode BACKSLASH() { return getToken(Rfc5424Parser.BACKSLASH, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(Rfc5424Parser.RIGHT_BRACE, 0); }
		public TerminalNode CARAT() { return getToken(Rfc5424Parser.CARAT, 0); }
		public TerminalNode UNDERSCORE() { return getToken(Rfc5424Parser.UNDERSCORE, 0); }
		public TerminalNode ACCENT() { return getToken(Rfc5424Parser.ACCENT, 0); }
		public TerminalNode A() { return getToken(Rfc5424Parser.A, 0); }
		public TerminalNode B() { return getToken(Rfc5424Parser.B, 0); }
		public TerminalNode C() { return getToken(Rfc5424Parser.C, 0); }
		public TerminalNode D() { return getToken(Rfc5424Parser.D, 0); }
		public TerminalNode E() { return getToken(Rfc5424Parser.E, 0); }
		public TerminalNode F() { return getToken(Rfc5424Parser.F, 0); }
		public TerminalNode G() { return getToken(Rfc5424Parser.G, 0); }
		public TerminalNode H() { return getToken(Rfc5424Parser.H, 0); }
		public TerminalNode I() { return getToken(Rfc5424Parser.I, 0); }
		public TerminalNode J() { return getToken(Rfc5424Parser.J, 0); }
		public TerminalNode K() { return getToken(Rfc5424Parser.K, 0); }
		public TerminalNode L() { return getToken(Rfc5424Parser.L, 0); }
		public TerminalNode M() { return getToken(Rfc5424Parser.M, 0); }
		public TerminalNode N() { return getToken(Rfc5424Parser.N, 0); }
		public TerminalNode O() { return getToken(Rfc5424Parser.O, 0); }
		public TerminalNode P() { return getToken(Rfc5424Parser.P, 0); }
		public TerminalNode Q() { return getToken(Rfc5424Parser.Q, 0); }
		public TerminalNode R() { return getToken(Rfc5424Parser.R, 0); }
		public TerminalNode S() { return getToken(Rfc5424Parser.S, 0); }
		public TerminalNode T() { return getToken(Rfc5424Parser.T, 0); }
		public TerminalNode U() { return getToken(Rfc5424Parser.U, 0); }
		public TerminalNode V() { return getToken(Rfc5424Parser.V, 0); }
		public TerminalNode W() { return getToken(Rfc5424Parser.W, 0); }
		public TerminalNode X() { return getToken(Rfc5424Parser.X, 0); }
		public TerminalNode Y() { return getToken(Rfc5424Parser.Y, 0); }
		public TerminalNode Z() { return getToken(Rfc5424Parser.Z, 0); }
		public TerminalNode LEFT_CURLY_BRACE() { return getToken(Rfc5424Parser.LEFT_CURLY_BRACE, 0); }
		public TerminalNode PIPE() { return getToken(Rfc5424Parser.PIPE, 0); }
		public TerminalNode RIGHT_CURLY_BRACE() { return getToken(Rfc5424Parser.RIGHT_CURLY_BRACE, 0); }
		public TerminalNode TILDE() { return getToken(Rfc5424Parser.TILDE, 0); }
		public TerminalNode U_007F() { return getToken(Rfc5424Parser.U_007F, 0); }
		public TerminalNode U_0080() { return getToken(Rfc5424Parser.U_0080, 0); }
		public TerminalNode U_0081() { return getToken(Rfc5424Parser.U_0081, 0); }
		public TerminalNode U_0082() { return getToken(Rfc5424Parser.U_0082, 0); }
		public TerminalNode U_0083() { return getToken(Rfc5424Parser.U_0083, 0); }
		public TerminalNode U_0084() { return getToken(Rfc5424Parser.U_0084, 0); }
		public TerminalNode U_0085() { return getToken(Rfc5424Parser.U_0085, 0); }
		public TerminalNode U_0086() { return getToken(Rfc5424Parser.U_0086, 0); }
		public TerminalNode U_0087() { return getToken(Rfc5424Parser.U_0087, 0); }
		public TerminalNode U_0088() { return getToken(Rfc5424Parser.U_0088, 0); }
		public TerminalNode U_0089() { return getToken(Rfc5424Parser.U_0089, 0); }
		public TerminalNode U_008A() { return getToken(Rfc5424Parser.U_008A, 0); }
		public TerminalNode U_008B() { return getToken(Rfc5424Parser.U_008B, 0); }
		public TerminalNode U_008C() { return getToken(Rfc5424Parser.U_008C, 0); }
		public TerminalNode U_008D() { return getToken(Rfc5424Parser.U_008D, 0); }
		public TerminalNode U_008E() { return getToken(Rfc5424Parser.U_008E, 0); }
		public TerminalNode U_008F() { return getToken(Rfc5424Parser.U_008F, 0); }
		public TerminalNode U_0090() { return getToken(Rfc5424Parser.U_0090, 0); }
		public TerminalNode U_0091() { return getToken(Rfc5424Parser.U_0091, 0); }
		public TerminalNode U_0092() { return getToken(Rfc5424Parser.U_0092, 0); }
		public TerminalNode U_0093() { return getToken(Rfc5424Parser.U_0093, 0); }
		public TerminalNode U_0094() { return getToken(Rfc5424Parser.U_0094, 0); }
		public TerminalNode U_0095() { return getToken(Rfc5424Parser.U_0095, 0); }
		public TerminalNode U_0096() { return getToken(Rfc5424Parser.U_0096, 0); }
		public TerminalNode U_0097() { return getToken(Rfc5424Parser.U_0097, 0); }
		public TerminalNode U_0098() { return getToken(Rfc5424Parser.U_0098, 0); }
		public TerminalNode U_0099() { return getToken(Rfc5424Parser.U_0099, 0); }
		public TerminalNode U_009A() { return getToken(Rfc5424Parser.U_009A, 0); }
		public TerminalNode U_009B() { return getToken(Rfc5424Parser.U_009B, 0); }
		public TerminalNode U_009C() { return getToken(Rfc5424Parser.U_009C, 0); }
		public TerminalNode U_009D() { return getToken(Rfc5424Parser.U_009D, 0); }
		public TerminalNode U_009E() { return getToken(Rfc5424Parser.U_009E, 0); }
		public TerminalNode U_009F() { return getToken(Rfc5424Parser.U_009F, 0); }
		public TerminalNode U_00A0() { return getToken(Rfc5424Parser.U_00A0, 0); }
		public TerminalNode U_00A1() { return getToken(Rfc5424Parser.U_00A1, 0); }
		public TerminalNode U_00A2() { return getToken(Rfc5424Parser.U_00A2, 0); }
		public TerminalNode U_00A3() { return getToken(Rfc5424Parser.U_00A3, 0); }
		public TerminalNode U_00A4() { return getToken(Rfc5424Parser.U_00A4, 0); }
		public TerminalNode U_00A5() { return getToken(Rfc5424Parser.U_00A5, 0); }
		public TerminalNode U_00A6() { return getToken(Rfc5424Parser.U_00A6, 0); }
		public TerminalNode U_00A7() { return getToken(Rfc5424Parser.U_00A7, 0); }
		public TerminalNode U_00A8() { return getToken(Rfc5424Parser.U_00A8, 0); }
		public TerminalNode U_00A9() { return getToken(Rfc5424Parser.U_00A9, 0); }
		public TerminalNode U_00AA() { return getToken(Rfc5424Parser.U_00AA, 0); }
		public TerminalNode U_00AB() { return getToken(Rfc5424Parser.U_00AB, 0); }
		public TerminalNode U_00AC() { return getToken(Rfc5424Parser.U_00AC, 0); }
		public TerminalNode U_00AD() { return getToken(Rfc5424Parser.U_00AD, 0); }
		public TerminalNode U_00AE() { return getToken(Rfc5424Parser.U_00AE, 0); }
		public TerminalNode U_00AF() { return getToken(Rfc5424Parser.U_00AF, 0); }
		public TerminalNode U_00B0() { return getToken(Rfc5424Parser.U_00B0, 0); }
		public TerminalNode U_00B1() { return getToken(Rfc5424Parser.U_00B1, 0); }
		public TerminalNode U_00B2() { return getToken(Rfc5424Parser.U_00B2, 0); }
		public TerminalNode U_00B3() { return getToken(Rfc5424Parser.U_00B3, 0); }
		public TerminalNode U_00B4() { return getToken(Rfc5424Parser.U_00B4, 0); }
		public TerminalNode U_00B5() { return getToken(Rfc5424Parser.U_00B5, 0); }
		public TerminalNode U_00B6() { return getToken(Rfc5424Parser.U_00B6, 0); }
		public TerminalNode U_00B7() { return getToken(Rfc5424Parser.U_00B7, 0); }
		public TerminalNode U_00B8() { return getToken(Rfc5424Parser.U_00B8, 0); }
		public TerminalNode U_00B9() { return getToken(Rfc5424Parser.U_00B9, 0); }
		public TerminalNode U_00BA() { return getToken(Rfc5424Parser.U_00BA, 0); }
		public TerminalNode U_00BB() { return getToken(Rfc5424Parser.U_00BB, 0); }
		public TerminalNode U_00BC() { return getToken(Rfc5424Parser.U_00BC, 0); }
		public TerminalNode U_00BD() { return getToken(Rfc5424Parser.U_00BD, 0); }
		public TerminalNode U_00BE() { return getToken(Rfc5424Parser.U_00BE, 0); }
		public TerminalNode U_00BF() { return getToken(Rfc5424Parser.U_00BF, 0); }
		public TerminalNode U_00C0() { return getToken(Rfc5424Parser.U_00C0, 0); }
		public TerminalNode U_00C1() { return getToken(Rfc5424Parser.U_00C1, 0); }
		public TerminalNode U_00C2() { return getToken(Rfc5424Parser.U_00C2, 0); }
		public TerminalNode U_00C3() { return getToken(Rfc5424Parser.U_00C3, 0); }
		public TerminalNode U_00C4() { return getToken(Rfc5424Parser.U_00C4, 0); }
		public TerminalNode U_00C5() { return getToken(Rfc5424Parser.U_00C5, 0); }
		public TerminalNode U_00C6() { return getToken(Rfc5424Parser.U_00C6, 0); }
		public TerminalNode U_00C7() { return getToken(Rfc5424Parser.U_00C7, 0); }
		public TerminalNode U_00C8() { return getToken(Rfc5424Parser.U_00C8, 0); }
		public TerminalNode U_00C9() { return getToken(Rfc5424Parser.U_00C9, 0); }
		public TerminalNode U_00CA() { return getToken(Rfc5424Parser.U_00CA, 0); }
		public TerminalNode U_00CB() { return getToken(Rfc5424Parser.U_00CB, 0); }
		public TerminalNode U_00CC() { return getToken(Rfc5424Parser.U_00CC, 0); }
		public TerminalNode U_00CD() { return getToken(Rfc5424Parser.U_00CD, 0); }
		public TerminalNode U_00CE() { return getToken(Rfc5424Parser.U_00CE, 0); }
		public TerminalNode U_00CF() { return getToken(Rfc5424Parser.U_00CF, 0); }
		public TerminalNode U_00D0() { return getToken(Rfc5424Parser.U_00D0, 0); }
		public TerminalNode U_00D1() { return getToken(Rfc5424Parser.U_00D1, 0); }
		public TerminalNode U_00D2() { return getToken(Rfc5424Parser.U_00D2, 0); }
		public TerminalNode U_00D3() { return getToken(Rfc5424Parser.U_00D3, 0); }
		public TerminalNode U_00D4() { return getToken(Rfc5424Parser.U_00D4, 0); }
		public TerminalNode U_00D5() { return getToken(Rfc5424Parser.U_00D5, 0); }
		public TerminalNode U_00D6() { return getToken(Rfc5424Parser.U_00D6, 0); }
		public TerminalNode U_00D7() { return getToken(Rfc5424Parser.U_00D7, 0); }
		public TerminalNode U_00D8() { return getToken(Rfc5424Parser.U_00D8, 0); }
		public TerminalNode U_00D9() { return getToken(Rfc5424Parser.U_00D9, 0); }
		public TerminalNode U_00DA() { return getToken(Rfc5424Parser.U_00DA, 0); }
		public TerminalNode U_00DB() { return getToken(Rfc5424Parser.U_00DB, 0); }
		public TerminalNode U_00DC() { return getToken(Rfc5424Parser.U_00DC, 0); }
		public TerminalNode U_00DD() { return getToken(Rfc5424Parser.U_00DD, 0); }
		public TerminalNode U_00DE() { return getToken(Rfc5424Parser.U_00DE, 0); }
		public TerminalNode U_00DF() { return getToken(Rfc5424Parser.U_00DF, 0); }
		public TerminalNode U_00E0() { return getToken(Rfc5424Parser.U_00E0, 0); }
		public TerminalNode U_00E1() { return getToken(Rfc5424Parser.U_00E1, 0); }
		public TerminalNode U_00E2() { return getToken(Rfc5424Parser.U_00E2, 0); }
		public TerminalNode U_00E3() { return getToken(Rfc5424Parser.U_00E3, 0); }
		public TerminalNode U_00E4() { return getToken(Rfc5424Parser.U_00E4, 0); }
		public TerminalNode U_00E5() { return getToken(Rfc5424Parser.U_00E5, 0); }
		public TerminalNode U_00E6() { return getToken(Rfc5424Parser.U_00E6, 0); }
		public TerminalNode U_00E7() { return getToken(Rfc5424Parser.U_00E7, 0); }
		public TerminalNode U_00E8() { return getToken(Rfc5424Parser.U_00E8, 0); }
		public TerminalNode U_00E9() { return getToken(Rfc5424Parser.U_00E9, 0); }
		public TerminalNode U_00EA() { return getToken(Rfc5424Parser.U_00EA, 0); }
		public TerminalNode U_00EB() { return getToken(Rfc5424Parser.U_00EB, 0); }
		public TerminalNode U_00EC() { return getToken(Rfc5424Parser.U_00EC, 0); }
		public TerminalNode U_00ED() { return getToken(Rfc5424Parser.U_00ED, 0); }
		public TerminalNode U_00EE() { return getToken(Rfc5424Parser.U_00EE, 0); }
		public TerminalNode U_00EF() { return getToken(Rfc5424Parser.U_00EF, 0); }
		public TerminalNode U_00F0() { return getToken(Rfc5424Parser.U_00F0, 0); }
		public TerminalNode U_00F1() { return getToken(Rfc5424Parser.U_00F1, 0); }
		public TerminalNode U_00F2() { return getToken(Rfc5424Parser.U_00F2, 0); }
		public TerminalNode U_00F3() { return getToken(Rfc5424Parser.U_00F3, 0); }
		public TerminalNode U_00F4() { return getToken(Rfc5424Parser.U_00F4, 0); }
		public TerminalNode U_00F5() { return getToken(Rfc5424Parser.U_00F5, 0); }
		public TerminalNode U_00F6() { return getToken(Rfc5424Parser.U_00F6, 0); }
		public TerminalNode U_00F7() { return getToken(Rfc5424Parser.U_00F7, 0); }
		public TerminalNode U_00F8() { return getToken(Rfc5424Parser.U_00F8, 0); }
		public TerminalNode U_00F9() { return getToken(Rfc5424Parser.U_00F9, 0); }
		public TerminalNode U_00FA() { return getToken(Rfc5424Parser.U_00FA, 0); }
		public TerminalNode U_00FB() { return getToken(Rfc5424Parser.U_00FB, 0); }
		public TerminalNode U_00FC() { return getToken(Rfc5424Parser.U_00FC, 0); }
		public TerminalNode U_00FD() { return getToken(Rfc5424Parser.U_00FD, 0); }
		public TerminalNode U_00FE() { return getToken(Rfc5424Parser.U_00FE, 0); }
		public TerminalNode U_00FF() { return getToken(Rfc5424Parser.U_00FF, 0); }
		public OctetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterOctet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitOctet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitOctet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OctetContext octet() throws RecognitionException {
		OctetContext _localctx = new OctetContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_octet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_la = _input.LA(1);
			if ( !(((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (TAB - 1)) | (1L << (LF - 1)) | (1L << (CR - 1)) | (1L << (SPACE - 1)) | (1L << (EXCLAMATION - 1)) | (1L << (QUOTE - 1)) | (1L << (POUND - 1)) | (1L << (DOLLAR - 1)) | (1L << (PERCENT - 1)) | (1L << (AMPERSAND - 1)) | (1L << (APOSTROPHE - 1)) | (1L << (LEFT_PAREN - 1)) | (1L << (RIGHT_PAREN - 1)) | (1L << (ASTERISK - 1)) | (1L << (PLUS - 1)) | (1L << (COMMA - 1)) | (1L << (DASH - 1)) | (1L << (PERIOD - 1)) | (1L << (SLASH - 1)) | (1L << (ZERO - 1)) | (1L << (ONE - 1)) | (1L << (TWO - 1)) | (1L << (THREE - 1)) | (1L << (FOUR - 1)) | (1L << (FIVE - 1)) | (1L << (SIX - 1)) | (1L << (SEVEN - 1)) | (1L << (EIGHT - 1)) | (1L << (NINE - 1)) | (1L << (COLON - 1)) | (1L << (SEMICOLON - 1)) | (1L << (LESS_THAN - 1)) | (1L << (EQUALS - 1)) | (1L << (GREATER_THAN - 1)) | (1L << (QUESTION - 1)) | (1L << (AT - 1)) | (1L << (CAP_A - 1)) | (1L << (CAP_B - 1)) | (1L << (CAP_C - 1)) | (1L << (CAP_D - 1)) | (1L << (CAP_E - 1)) | (1L << (CAP_F - 1)) | (1L << (CAP_G - 1)) | (1L << (CAP_H - 1)) | (1L << (CAP_I - 1)) | (1L << (CAP_J - 1)) | (1L << (CAP_K - 1)) | (1L << (CAP_L - 1)) | (1L << (CAP_M - 1)) | (1L << (CAP_N - 1)) | (1L << (CAP_O - 1)) | (1L << (CAP_P - 1)) | (1L << (CAP_Q - 1)) | (1L << (CAP_R - 1)) | (1L << (CAP_S - 1)) | (1L << (CAP_T - 1)) | (1L << (CAP_U - 1)) | (1L << (CAP_V - 1)) | (1L << (CAP_W - 1)) | (1L << (CAP_X - 1)) | (1L << (CAP_Y - 1)) | (1L << (CAP_Z - 1)) | (1L << (LEFT_BRACE - 1)) | (1L << (BACKSLASH - 1)))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (RIGHT_BRACE - 65)) | (1L << (CARAT - 65)) | (1L << (UNDERSCORE - 65)) | (1L << (ACCENT - 65)) | (1L << (A - 65)) | (1L << (B - 65)) | (1L << (C - 65)) | (1L << (D - 65)) | (1L << (E - 65)) | (1L << (F - 65)) | (1L << (G - 65)) | (1L << (H - 65)) | (1L << (I - 65)) | (1L << (J - 65)) | (1L << (K - 65)) | (1L << (L - 65)) | (1L << (M - 65)) | (1L << (N - 65)) | (1L << (O - 65)) | (1L << (P - 65)) | (1L << (Q - 65)) | (1L << (R - 65)) | (1L << (S - 65)) | (1L << (T - 65)) | (1L << (U - 65)) | (1L << (V - 65)) | (1L << (W - 65)) | (1L << (X - 65)) | (1L << (Y - 65)) | (1L << (Z - 65)) | (1L << (LEFT_CURLY_BRACE - 65)) | (1L << (PIPE - 65)) | (1L << (RIGHT_CURLY_BRACE - 65)) | (1L << (TILDE - 65)) | (1L << (U_0000 - 65)) | (1L << (U_0001 - 65)) | (1L << (U_0002 - 65)) | (1L << (U_0003 - 65)) | (1L << (U_0004 - 65)) | (1L << (U_0005 - 65)) | (1L << (U_0006 - 65)) | (1L << (U_0007 - 65)) | (1L << (U_0008 - 65)) | (1L << (U_000B - 65)) | (1L << (U_000C - 65)) | (1L << (U_000E - 65)) | (1L << (U_000F - 65)) | (1L << (U_0010 - 65)) | (1L << (U_0011 - 65)) | (1L << (U_0012 - 65)) | (1L << (U_0013 - 65)) | (1L << (U_0014 - 65)) | (1L << (U_0015 - 65)) | (1L << (U_0016 - 65)) | (1L << (U_0017 - 65)) | (1L << (U_0018 - 65)) | (1L << (U_0019 - 65)) | (1L << (U_001A - 65)) | (1L << (U_001B - 65)) | (1L << (U_001C - 65)) | (1L << (U_001D - 65)) | (1L << (U_001E - 65)) | (1L << (U_001F - 65)) | (1L << (U_007F - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (U_0080 - 129)) | (1L << (U_0081 - 129)) | (1L << (U_0082 - 129)) | (1L << (U_0083 - 129)) | (1L << (U_0084 - 129)) | (1L << (U_0085 - 129)) | (1L << (U_0086 - 129)) | (1L << (U_0087 - 129)) | (1L << (U_0088 - 129)) | (1L << (U_0089 - 129)) | (1L << (U_008A - 129)) | (1L << (U_008B - 129)) | (1L << (U_008C - 129)) | (1L << (U_008D - 129)) | (1L << (U_008E - 129)) | (1L << (U_008F - 129)) | (1L << (U_0090 - 129)) | (1L << (U_0091 - 129)) | (1L << (U_0092 - 129)) | (1L << (U_0093 - 129)) | (1L << (U_0094 - 129)) | (1L << (U_0095 - 129)) | (1L << (U_0096 - 129)) | (1L << (U_0097 - 129)) | (1L << (U_0098 - 129)) | (1L << (U_0099 - 129)) | (1L << (U_009A - 129)) | (1L << (U_009B - 129)) | (1L << (U_009C - 129)) | (1L << (U_009D - 129)) | (1L << (U_009E - 129)) | (1L << (U_009F - 129)) | (1L << (U_00A0 - 129)) | (1L << (U_00A1 - 129)) | (1L << (U_00A2 - 129)) | (1L << (U_00A3 - 129)) | (1L << (U_00A4 - 129)) | (1L << (U_00A5 - 129)) | (1L << (U_00A6 - 129)) | (1L << (U_00A7 - 129)) | (1L << (U_00A8 - 129)) | (1L << (U_00A9 - 129)) | (1L << (U_00AA - 129)) | (1L << (U_00AB - 129)) | (1L << (U_00AC - 129)) | (1L << (U_00AD - 129)) | (1L << (U_00AE - 129)) | (1L << (U_00AF - 129)) | (1L << (U_00B0 - 129)) | (1L << (U_00B1 - 129)) | (1L << (U_00B2 - 129)) | (1L << (U_00B3 - 129)) | (1L << (U_00B4 - 129)) | (1L << (U_00B5 - 129)) | (1L << (U_00B6 - 129)) | (1L << (U_00B7 - 129)) | (1L << (U_00B8 - 129)) | (1L << (U_00B9 - 129)) | (1L << (U_00BA - 129)) | (1L << (U_00BB - 129)) | (1L << (U_00BC - 129)) | (1L << (U_00BD - 129)) | (1L << (U_00BE - 129)) | (1L << (U_00BF - 129)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (U_00C0 - 193)) | (1L << (U_00C1 - 193)) | (1L << (U_00C2 - 193)) | (1L << (U_00C3 - 193)) | (1L << (U_00C4 - 193)) | (1L << (U_00C5 - 193)) | (1L << (U_00C6 - 193)) | (1L << (U_00C7 - 193)) | (1L << (U_00C8 - 193)) | (1L << (U_00C9 - 193)) | (1L << (U_00CA - 193)) | (1L << (U_00CB - 193)) | (1L << (U_00CC - 193)) | (1L << (U_00CD - 193)) | (1L << (U_00CE - 193)) | (1L << (U_00CF - 193)) | (1L << (U_00D0 - 193)) | (1L << (U_00D1 - 193)) | (1L << (U_00D2 - 193)) | (1L << (U_00D3 - 193)) | (1L << (U_00D4 - 193)) | (1L << (U_00D5 - 193)) | (1L << (U_00D6 - 193)) | (1L << (U_00D7 - 193)) | (1L << (U_00D8 - 193)) | (1L << (U_00D9 - 193)) | (1L << (U_00DA - 193)) | (1L << (U_00DB - 193)) | (1L << (U_00DC - 193)) | (1L << (U_00DD - 193)) | (1L << (U_00DE - 193)) | (1L << (U_00DF - 193)) | (1L << (U_00E0 - 193)) | (1L << (U_00E1 - 193)) | (1L << (U_00E2 - 193)) | (1L << (U_00E3 - 193)) | (1L << (U_00E4 - 193)) | (1L << (U_00E5 - 193)) | (1L << (U_00E6 - 193)) | (1L << (U_00E7 - 193)) | (1L << (U_00E8 - 193)) | (1L << (U_00E9 - 193)) | (1L << (U_00EA - 193)) | (1L << (U_00EB - 193)) | (1L << (U_00EC - 193)) | (1L << (U_00ED - 193)) | (1L << (U_00EE - 193)) | (1L << (U_00EF - 193)) | (1L << (U_00F0 - 193)) | (1L << (U_00F1 - 193)) | (1L << (U_00F2 - 193)) | (1L << (U_00F3 - 193)) | (1L << (U_00F4 - 193)) | (1L << (U_00F5 - 193)) | (1L << (U_00F6 - 193)) | (1L << (U_00F7 - 193)) | (1L << (U_00F8 - 193)) | (1L << (U_00F9 - 193)) | (1L << (U_00FA - 193)) | (1L << (U_00FB - 193)) | (1L << (U_00FC - 193)) | (1L << (U_00FD - 193)) | (1L << (U_00FE - 193)) | (1L << (U_00FF - 193)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
		public TerminalNode SPACE() { return getToken(Rfc5424Parser.SPACE, 0); }
		public SpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterSp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitSp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitSp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpContext sp() throws RecognitionException {
		SpContext _localctx = new SpContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_sp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
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
		public TerminalNode EXCLAMATION() { return getToken(Rfc5424Parser.EXCLAMATION, 0); }
		public TerminalNode QUOTE() { return getToken(Rfc5424Parser.QUOTE, 0); }
		public TerminalNode POUND() { return getToken(Rfc5424Parser.POUND, 0); }
		public TerminalNode DOLLAR() { return getToken(Rfc5424Parser.DOLLAR, 0); }
		public TerminalNode PERCENT() { return getToken(Rfc5424Parser.PERCENT, 0); }
		public TerminalNode AMPERSAND() { return getToken(Rfc5424Parser.AMPERSAND, 0); }
		public TerminalNode APOSTROPHE() { return getToken(Rfc5424Parser.APOSTROPHE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(Rfc5424Parser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(Rfc5424Parser.RIGHT_PAREN, 0); }
		public TerminalNode ASTERISK() { return getToken(Rfc5424Parser.ASTERISK, 0); }
		public TerminalNode PLUS() { return getToken(Rfc5424Parser.PLUS, 0); }
		public TerminalNode COMMA() { return getToken(Rfc5424Parser.COMMA, 0); }
		public TerminalNode DASH() { return getToken(Rfc5424Parser.DASH, 0); }
		public TerminalNode PERIOD() { return getToken(Rfc5424Parser.PERIOD, 0); }
		public TerminalNode SLASH() { return getToken(Rfc5424Parser.SLASH, 0); }
		public TerminalNode ZERO() { return getToken(Rfc5424Parser.ZERO, 0); }
		public TerminalNode ONE() { return getToken(Rfc5424Parser.ONE, 0); }
		public TerminalNode TWO() { return getToken(Rfc5424Parser.TWO, 0); }
		public TerminalNode THREE() { return getToken(Rfc5424Parser.THREE, 0); }
		public TerminalNode FOUR() { return getToken(Rfc5424Parser.FOUR, 0); }
		public TerminalNode FIVE() { return getToken(Rfc5424Parser.FIVE, 0); }
		public TerminalNode SIX() { return getToken(Rfc5424Parser.SIX, 0); }
		public TerminalNode SEVEN() { return getToken(Rfc5424Parser.SEVEN, 0); }
		public TerminalNode EIGHT() { return getToken(Rfc5424Parser.EIGHT, 0); }
		public TerminalNode NINE() { return getToken(Rfc5424Parser.NINE, 0); }
		public TerminalNode COLON() { return getToken(Rfc5424Parser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(Rfc5424Parser.SEMICOLON, 0); }
		public TerminalNode LESS_THAN() { return getToken(Rfc5424Parser.LESS_THAN, 0); }
		public TerminalNode EQUALS() { return getToken(Rfc5424Parser.EQUALS, 0); }
		public TerminalNode GREATER_THAN() { return getToken(Rfc5424Parser.GREATER_THAN, 0); }
		public TerminalNode QUESTION() { return getToken(Rfc5424Parser.QUESTION, 0); }
		public TerminalNode AT() { return getToken(Rfc5424Parser.AT, 0); }
		public TerminalNode CAP_A() { return getToken(Rfc5424Parser.CAP_A, 0); }
		public TerminalNode CAP_B() { return getToken(Rfc5424Parser.CAP_B, 0); }
		public TerminalNode CAP_C() { return getToken(Rfc5424Parser.CAP_C, 0); }
		public TerminalNode CAP_D() { return getToken(Rfc5424Parser.CAP_D, 0); }
		public TerminalNode CAP_E() { return getToken(Rfc5424Parser.CAP_E, 0); }
		public TerminalNode CAP_F() { return getToken(Rfc5424Parser.CAP_F, 0); }
		public TerminalNode CAP_G() { return getToken(Rfc5424Parser.CAP_G, 0); }
		public TerminalNode CAP_H() { return getToken(Rfc5424Parser.CAP_H, 0); }
		public TerminalNode CAP_I() { return getToken(Rfc5424Parser.CAP_I, 0); }
		public TerminalNode CAP_J() { return getToken(Rfc5424Parser.CAP_J, 0); }
		public TerminalNode CAP_K() { return getToken(Rfc5424Parser.CAP_K, 0); }
		public TerminalNode CAP_L() { return getToken(Rfc5424Parser.CAP_L, 0); }
		public TerminalNode CAP_M() { return getToken(Rfc5424Parser.CAP_M, 0); }
		public TerminalNode CAP_N() { return getToken(Rfc5424Parser.CAP_N, 0); }
		public TerminalNode CAP_O() { return getToken(Rfc5424Parser.CAP_O, 0); }
		public TerminalNode CAP_P() { return getToken(Rfc5424Parser.CAP_P, 0); }
		public TerminalNode CAP_Q() { return getToken(Rfc5424Parser.CAP_Q, 0); }
		public TerminalNode CAP_R() { return getToken(Rfc5424Parser.CAP_R, 0); }
		public TerminalNode CAP_S() { return getToken(Rfc5424Parser.CAP_S, 0); }
		public TerminalNode CAP_T() { return getToken(Rfc5424Parser.CAP_T, 0); }
		public TerminalNode CAP_U() { return getToken(Rfc5424Parser.CAP_U, 0); }
		public TerminalNode CAP_V() { return getToken(Rfc5424Parser.CAP_V, 0); }
		public TerminalNode CAP_W() { return getToken(Rfc5424Parser.CAP_W, 0); }
		public TerminalNode CAP_X() { return getToken(Rfc5424Parser.CAP_X, 0); }
		public TerminalNode CAP_Y() { return getToken(Rfc5424Parser.CAP_Y, 0); }
		public TerminalNode CAP_Z() { return getToken(Rfc5424Parser.CAP_Z, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(Rfc5424Parser.LEFT_BRACE, 0); }
		public TerminalNode BACKSLASH() { return getToken(Rfc5424Parser.BACKSLASH, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(Rfc5424Parser.RIGHT_BRACE, 0); }
		public TerminalNode CARAT() { return getToken(Rfc5424Parser.CARAT, 0); }
		public TerminalNode UNDERSCORE() { return getToken(Rfc5424Parser.UNDERSCORE, 0); }
		public TerminalNode ACCENT() { return getToken(Rfc5424Parser.ACCENT, 0); }
		public TerminalNode A() { return getToken(Rfc5424Parser.A, 0); }
		public TerminalNode B() { return getToken(Rfc5424Parser.B, 0); }
		public TerminalNode C() { return getToken(Rfc5424Parser.C, 0); }
		public TerminalNode D() { return getToken(Rfc5424Parser.D, 0); }
		public TerminalNode E() { return getToken(Rfc5424Parser.E, 0); }
		public TerminalNode F() { return getToken(Rfc5424Parser.F, 0); }
		public TerminalNode G() { return getToken(Rfc5424Parser.G, 0); }
		public TerminalNode H() { return getToken(Rfc5424Parser.H, 0); }
		public TerminalNode I() { return getToken(Rfc5424Parser.I, 0); }
		public TerminalNode J() { return getToken(Rfc5424Parser.J, 0); }
		public TerminalNode K() { return getToken(Rfc5424Parser.K, 0); }
		public TerminalNode L() { return getToken(Rfc5424Parser.L, 0); }
		public TerminalNode M() { return getToken(Rfc5424Parser.M, 0); }
		public TerminalNode N() { return getToken(Rfc5424Parser.N, 0); }
		public TerminalNode O() { return getToken(Rfc5424Parser.O, 0); }
		public TerminalNode P() { return getToken(Rfc5424Parser.P, 0); }
		public TerminalNode Q() { return getToken(Rfc5424Parser.Q, 0); }
		public TerminalNode R() { return getToken(Rfc5424Parser.R, 0); }
		public TerminalNode S() { return getToken(Rfc5424Parser.S, 0); }
		public TerminalNode T() { return getToken(Rfc5424Parser.T, 0); }
		public TerminalNode U() { return getToken(Rfc5424Parser.U, 0); }
		public TerminalNode V() { return getToken(Rfc5424Parser.V, 0); }
		public TerminalNode W() { return getToken(Rfc5424Parser.W, 0); }
		public TerminalNode X() { return getToken(Rfc5424Parser.X, 0); }
		public TerminalNode Y() { return getToken(Rfc5424Parser.Y, 0); }
		public TerminalNode Z() { return getToken(Rfc5424Parser.Z, 0); }
		public TerminalNode LEFT_CURLY_BRACE() { return getToken(Rfc5424Parser.LEFT_CURLY_BRACE, 0); }
		public TerminalNode PIPE() { return getToken(Rfc5424Parser.PIPE, 0); }
		public TerminalNode RIGHT_CURLY_BRACE() { return getToken(Rfc5424Parser.RIGHT_CURLY_BRACE, 0); }
		public TerminalNode TILDE() { return getToken(Rfc5424Parser.TILDE, 0); }
		public PrintusasciiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printusascii; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterPrintusascii(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitPrintusascii(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitPrintusascii(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintusasciiContext printusascii() throws RecognitionException {
		PrintusasciiContext _localctx = new PrintusasciiContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_printusascii);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXCLAMATION) | (1L << QUOTE) | (1L << POUND) | (1L << DOLLAR) | (1L << PERCENT) | (1L << AMPERSAND) | (1L << APOSTROPHE) | (1L << LEFT_PAREN) | (1L << RIGHT_PAREN) | (1L << ASTERISK) | (1L << PLUS) | (1L << COMMA) | (1L << DASH) | (1L << PERIOD) | (1L << SLASH) | (1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE) | (1L << COLON) | (1L << SEMICOLON) | (1L << LESS_THAN) | (1L << EQUALS) | (1L << GREATER_THAN) | (1L << QUESTION) | (1L << AT) | (1L << CAP_A) | (1L << CAP_B) | (1L << CAP_C) | (1L << CAP_D) | (1L << CAP_E) | (1L << CAP_F) | (1L << CAP_G) | (1L << CAP_H) | (1L << CAP_I) | (1L << CAP_J) | (1L << CAP_K) | (1L << CAP_L) | (1L << CAP_M) | (1L << CAP_N) | (1L << CAP_O) | (1L << CAP_P) | (1L << CAP_Q) | (1L << CAP_R) | (1L << CAP_S) | (1L << CAP_T) | (1L << CAP_U) | (1L << CAP_V) | (1L << CAP_W) | (1L << CAP_X) | (1L << CAP_Y) | (1L << CAP_Z) | (1L << LEFT_BRACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BACKSLASH - 64)) | (1L << (RIGHT_BRACE - 64)) | (1L << (CARAT - 64)) | (1L << (UNDERSCORE - 64)) | (1L << (ACCENT - 64)) | (1L << (A - 64)) | (1L << (B - 64)) | (1L << (C - 64)) | (1L << (D - 64)) | (1L << (E - 64)) | (1L << (F - 64)) | (1L << (G - 64)) | (1L << (H - 64)) | (1L << (I - 64)) | (1L << (J - 64)) | (1L << (K - 64)) | (1L << (L - 64)) | (1L << (M - 64)) | (1L << (N - 64)) | (1L << (O - 64)) | (1L << (P - 64)) | (1L << (Q - 64)) | (1L << (R - 64)) | (1L << (S - 64)) | (1L << (T - 64)) | (1L << (U - 64)) | (1L << (V - 64)) | (1L << (W - 64)) | (1L << (X - 64)) | (1L << (Y - 64)) | (1L << (Z - 64)) | (1L << (LEFT_CURLY_BRACE - 64)) | (1L << (PIPE - 64)) | (1L << (RIGHT_CURLY_BRACE - 64)) | (1L << (TILDE - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
		public TerminalNode EXCLAMATION() { return getToken(Rfc5424Parser.EXCLAMATION, 0); }
		public TerminalNode POUND() { return getToken(Rfc5424Parser.POUND, 0); }
		public TerminalNode DOLLAR() { return getToken(Rfc5424Parser.DOLLAR, 0); }
		public TerminalNode PERCENT() { return getToken(Rfc5424Parser.PERCENT, 0); }
		public TerminalNode AMPERSAND() { return getToken(Rfc5424Parser.AMPERSAND, 0); }
		public TerminalNode APOSTROPHE() { return getToken(Rfc5424Parser.APOSTROPHE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(Rfc5424Parser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(Rfc5424Parser.RIGHT_PAREN, 0); }
		public TerminalNode ASTERISK() { return getToken(Rfc5424Parser.ASTERISK, 0); }
		public TerminalNode PLUS() { return getToken(Rfc5424Parser.PLUS, 0); }
		public TerminalNode COMMA() { return getToken(Rfc5424Parser.COMMA, 0); }
		public TerminalNode DASH() { return getToken(Rfc5424Parser.DASH, 0); }
		public TerminalNode PERIOD() { return getToken(Rfc5424Parser.PERIOD, 0); }
		public TerminalNode SLASH() { return getToken(Rfc5424Parser.SLASH, 0); }
		public TerminalNode ZERO() { return getToken(Rfc5424Parser.ZERO, 0); }
		public TerminalNode ONE() { return getToken(Rfc5424Parser.ONE, 0); }
		public TerminalNode TWO() { return getToken(Rfc5424Parser.TWO, 0); }
		public TerminalNode THREE() { return getToken(Rfc5424Parser.THREE, 0); }
		public TerminalNode FOUR() { return getToken(Rfc5424Parser.FOUR, 0); }
		public TerminalNode FIVE() { return getToken(Rfc5424Parser.FIVE, 0); }
		public TerminalNode SIX() { return getToken(Rfc5424Parser.SIX, 0); }
		public TerminalNode SEVEN() { return getToken(Rfc5424Parser.SEVEN, 0); }
		public TerminalNode EIGHT() { return getToken(Rfc5424Parser.EIGHT, 0); }
		public TerminalNode NINE() { return getToken(Rfc5424Parser.NINE, 0); }
		public TerminalNode COLON() { return getToken(Rfc5424Parser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(Rfc5424Parser.SEMICOLON, 0); }
		public TerminalNode LESS_THAN() { return getToken(Rfc5424Parser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(Rfc5424Parser.GREATER_THAN, 0); }
		public TerminalNode QUESTION() { return getToken(Rfc5424Parser.QUESTION, 0); }
		public TerminalNode AT() { return getToken(Rfc5424Parser.AT, 0); }
		public TerminalNode CAP_A() { return getToken(Rfc5424Parser.CAP_A, 0); }
		public TerminalNode CAP_B() { return getToken(Rfc5424Parser.CAP_B, 0); }
		public TerminalNode CAP_C() { return getToken(Rfc5424Parser.CAP_C, 0); }
		public TerminalNode CAP_D() { return getToken(Rfc5424Parser.CAP_D, 0); }
		public TerminalNode CAP_E() { return getToken(Rfc5424Parser.CAP_E, 0); }
		public TerminalNode CAP_F() { return getToken(Rfc5424Parser.CAP_F, 0); }
		public TerminalNode CAP_G() { return getToken(Rfc5424Parser.CAP_G, 0); }
		public TerminalNode CAP_H() { return getToken(Rfc5424Parser.CAP_H, 0); }
		public TerminalNode CAP_I() { return getToken(Rfc5424Parser.CAP_I, 0); }
		public TerminalNode CAP_J() { return getToken(Rfc5424Parser.CAP_J, 0); }
		public TerminalNode CAP_K() { return getToken(Rfc5424Parser.CAP_K, 0); }
		public TerminalNode CAP_L() { return getToken(Rfc5424Parser.CAP_L, 0); }
		public TerminalNode CAP_M() { return getToken(Rfc5424Parser.CAP_M, 0); }
		public TerminalNode CAP_N() { return getToken(Rfc5424Parser.CAP_N, 0); }
		public TerminalNode CAP_O() { return getToken(Rfc5424Parser.CAP_O, 0); }
		public TerminalNode CAP_P() { return getToken(Rfc5424Parser.CAP_P, 0); }
		public TerminalNode CAP_Q() { return getToken(Rfc5424Parser.CAP_Q, 0); }
		public TerminalNode CAP_R() { return getToken(Rfc5424Parser.CAP_R, 0); }
		public TerminalNode CAP_S() { return getToken(Rfc5424Parser.CAP_S, 0); }
		public TerminalNode CAP_T() { return getToken(Rfc5424Parser.CAP_T, 0); }
		public TerminalNode CAP_U() { return getToken(Rfc5424Parser.CAP_U, 0); }
		public TerminalNode CAP_V() { return getToken(Rfc5424Parser.CAP_V, 0); }
		public TerminalNode CAP_W() { return getToken(Rfc5424Parser.CAP_W, 0); }
		public TerminalNode CAP_X() { return getToken(Rfc5424Parser.CAP_X, 0); }
		public TerminalNode CAP_Y() { return getToken(Rfc5424Parser.CAP_Y, 0); }
		public TerminalNode CAP_Z() { return getToken(Rfc5424Parser.CAP_Z, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(Rfc5424Parser.LEFT_BRACE, 0); }
		public TerminalNode BACKSLASH() { return getToken(Rfc5424Parser.BACKSLASH, 0); }
		public TerminalNode CARAT() { return getToken(Rfc5424Parser.CARAT, 0); }
		public TerminalNode UNDERSCORE() { return getToken(Rfc5424Parser.UNDERSCORE, 0); }
		public TerminalNode ACCENT() { return getToken(Rfc5424Parser.ACCENT, 0); }
		public TerminalNode A() { return getToken(Rfc5424Parser.A, 0); }
		public TerminalNode B() { return getToken(Rfc5424Parser.B, 0); }
		public TerminalNode C() { return getToken(Rfc5424Parser.C, 0); }
		public TerminalNode D() { return getToken(Rfc5424Parser.D, 0); }
		public TerminalNode E() { return getToken(Rfc5424Parser.E, 0); }
		public TerminalNode F() { return getToken(Rfc5424Parser.F, 0); }
		public TerminalNode G() { return getToken(Rfc5424Parser.G, 0); }
		public TerminalNode H() { return getToken(Rfc5424Parser.H, 0); }
		public TerminalNode I() { return getToken(Rfc5424Parser.I, 0); }
		public TerminalNode J() { return getToken(Rfc5424Parser.J, 0); }
		public TerminalNode K() { return getToken(Rfc5424Parser.K, 0); }
		public TerminalNode L() { return getToken(Rfc5424Parser.L, 0); }
		public TerminalNode M() { return getToken(Rfc5424Parser.M, 0); }
		public TerminalNode N() { return getToken(Rfc5424Parser.N, 0); }
		public TerminalNode O() { return getToken(Rfc5424Parser.O, 0); }
		public TerminalNode P() { return getToken(Rfc5424Parser.P, 0); }
		public TerminalNode Q() { return getToken(Rfc5424Parser.Q, 0); }
		public TerminalNode R() { return getToken(Rfc5424Parser.R, 0); }
		public TerminalNode S() { return getToken(Rfc5424Parser.S, 0); }
		public TerminalNode T() { return getToken(Rfc5424Parser.T, 0); }
		public TerminalNode U() { return getToken(Rfc5424Parser.U, 0); }
		public TerminalNode V() { return getToken(Rfc5424Parser.V, 0); }
		public TerminalNode W() { return getToken(Rfc5424Parser.W, 0); }
		public TerminalNode X() { return getToken(Rfc5424Parser.X, 0); }
		public TerminalNode Y() { return getToken(Rfc5424Parser.Y, 0); }
		public TerminalNode Z() { return getToken(Rfc5424Parser.Z, 0); }
		public TerminalNode LEFT_CURLY_BRACE() { return getToken(Rfc5424Parser.LEFT_CURLY_BRACE, 0); }
		public TerminalNode PIPE() { return getToken(Rfc5424Parser.PIPE, 0); }
		public TerminalNode RIGHT_CURLY_BRACE() { return getToken(Rfc5424Parser.RIGHT_CURLY_BRACE, 0); }
		public TerminalNode TILDE() { return getToken(Rfc5424Parser.TILDE, 0); }
		public PrintusasciinospecialsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printusasciinospecials; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterPrintusasciinospecials(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitPrintusasciinospecials(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitPrintusasciinospecials(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintusasciinospecialsContext printusasciinospecials() throws RecognitionException {
		PrintusasciinospecialsContext _localctx = new PrintusasciinospecialsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_printusasciinospecials);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXCLAMATION) | (1L << POUND) | (1L << DOLLAR) | (1L << PERCENT) | (1L << AMPERSAND) | (1L << APOSTROPHE) | (1L << LEFT_PAREN) | (1L << RIGHT_PAREN) | (1L << ASTERISK) | (1L << PLUS) | (1L << COMMA) | (1L << DASH) | (1L << PERIOD) | (1L << SLASH) | (1L << ZERO) | (1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE) | (1L << COLON) | (1L << SEMICOLON) | (1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << QUESTION) | (1L << AT) | (1L << CAP_A) | (1L << CAP_B) | (1L << CAP_C) | (1L << CAP_D) | (1L << CAP_E) | (1L << CAP_F) | (1L << CAP_G) | (1L << CAP_H) | (1L << CAP_I) | (1L << CAP_J) | (1L << CAP_K) | (1L << CAP_L) | (1L << CAP_M) | (1L << CAP_N) | (1L << CAP_O) | (1L << CAP_P) | (1L << CAP_Q) | (1L << CAP_R) | (1L << CAP_S) | (1L << CAP_T) | (1L << CAP_U) | (1L << CAP_V) | (1L << CAP_W) | (1L << CAP_X) | (1L << CAP_Y) | (1L << CAP_Z) | (1L << LEFT_BRACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (BACKSLASH - 64)) | (1L << (CARAT - 64)) | (1L << (UNDERSCORE - 64)) | (1L << (ACCENT - 64)) | (1L << (A - 64)) | (1L << (B - 64)) | (1L << (C - 64)) | (1L << (D - 64)) | (1L << (E - 64)) | (1L << (F - 64)) | (1L << (G - 64)) | (1L << (H - 64)) | (1L << (I - 64)) | (1L << (J - 64)) | (1L << (K - 64)) | (1L << (L - 64)) | (1L << (M - 64)) | (1L << (N - 64)) | (1L << (O - 64)) | (1L << (P - 64)) | (1L << (Q - 64)) | (1L << (R - 64)) | (1L << (S - 64)) | (1L << (T - 64)) | (1L << (U - 64)) | (1L << (V - 64)) | (1L << (W - 64)) | (1L << (X - 64)) | (1L << (Y - 64)) | (1L << (Z - 64)) | (1L << (LEFT_CURLY_BRACE - 64)) | (1L << (PIPE - 64)) | (1L << (RIGHT_CURLY_BRACE - 64)) | (1L << (TILDE - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
		public TerminalNode ONE() { return getToken(Rfc5424Parser.ONE, 0); }
		public TerminalNode TWO() { return getToken(Rfc5424Parser.TWO, 0); }
		public TerminalNode THREE() { return getToken(Rfc5424Parser.THREE, 0); }
		public TerminalNode FOUR() { return getToken(Rfc5424Parser.FOUR, 0); }
		public TerminalNode FIVE() { return getToken(Rfc5424Parser.FIVE, 0); }
		public TerminalNode SIX() { return getToken(Rfc5424Parser.SIX, 0); }
		public TerminalNode SEVEN() { return getToken(Rfc5424Parser.SEVEN, 0); }
		public TerminalNode EIGHT() { return getToken(Rfc5424Parser.EIGHT, 0); }
		public TerminalNode NINE() { return getToken(Rfc5424Parser.NINE, 0); }
		public Nonzero_digitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonzero_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterNonzero_digit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitNonzero_digit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitNonzero_digit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nonzero_digitContext nonzero_digit() throws RecognitionException {
		Nonzero_digitContext _localctx = new Nonzero_digitContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_nonzero_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ONE) | (1L << TWO) | (1L << THREE) | (1L << FOUR) | (1L << FIVE) | (1L << SIX) | (1L << SEVEN) | (1L << EIGHT) | (1L << NINE))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
		public TerminalNode ZERO() { return getToken(Rfc5424Parser.ZERO, 0); }
		public ZeroDigitContext(DigitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterZeroDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitZeroDigit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitZeroDigit(this);
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
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterNonZeroDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitNonZeroDigit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitNonZeroDigit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_digit);
		try {
			setState(327);
			switch (_input.LA(1)) {
			case ZERO:
				_localctx = new ZeroDigitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
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
				setState(326);
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

	public static class NilvalueContext extends ParserRuleContext {
		public TerminalNode DASH() { return getToken(Rfc5424Parser.DASH, 0); }
		public NilvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nilvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).enterNilvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Rfc5424Listener ) ((Rfc5424Listener)listener).exitNilvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Rfc5424Visitor ) return ((Rfc5424Visitor<? extends T>)visitor).visitNilvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NilvalueContext nilvalue() throws RecognitionException {
		NilvalueContext _localctx = new NilvalueContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_nilvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(DASH);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0102\u014e\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\5\2Y\n\2\3\2\5\2\\\n\2\3\3\5\3_\n\3\3\3\5\3b\n\3\3\3\5\3e\n\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\5\5w"+
		"\n\5\3\5\3\5\3\5\5\5|\n\5\3\6\3\6\5\6\u0080\n\6\3\6\3\6\3\6\5\6\u0085"+
		"\n\6\3\7\3\7\7\7\u0089\n\7\f\7\16\7\u008c\13\7\5\7\u008e\n\7\3\b\3\b\7"+
		"\b\u0092\n\b\f\b\16\b\u0095\13\b\5\b\u0097\n\b\3\t\3\t\7\t\u009b\n\t\f"+
		"\t\16\t\u009e\13\t\5\t\u00a0\n\t\3\n\3\n\7\n\u00a4\n\n\f\n\16\n\u00a7"+
		"\13\n\5\n\u00a9\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u00b0\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00cc\n\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u00da\n\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u00ee\n\25\3\26\3\26\5\26\u00f2\n\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0101\n\30\f\30"+
		"\16\30\u0104\13\30\5\30\u0106\n\30\3\31\3\31\3\31\3\31\7\31\u010c\n\31"+
		"\f\31\16\31\u010f\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\35\7\35\u011e\n\35\f\35\16\35\u0121\13\35\3\36\7\36\u0124"+
		"\n\36\f\36\16\36\u0127\13\36\3\37\3\37\5\37\u012b\n\37\3 \7 \u012e\n "+
		"\f \16 \u0131\13 \3!\3!\3!\3\"\3\"\3#\7#\u0139\n#\f#\16#\u013c\13#\3$"+
		"\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\5)\u014a\n)\3*\3*\3*\2\2+\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPR\2\t"+
		"\4\2\21\21\23\23\4\2\b\bBC\5\2\u00be\u00be\u00c2\u00c2\u00f2\u00f2\3\2"+
		"\3\u0102\3\2\7d\6\2\7\7\t\"$BDd\3\2\27\37\u0147\2T\3\2\2\2\4^\3\2\2\2"+
		"\6p\3\2\2\2\bt\3\2\2\2\n}\3\2\2\2\f\u008d\3\2\2\2\16\u0096\3\2\2\2\20"+
		"\u009f\3\2\2\2\22\u00a8\3\2\2\2\24\u00af\3\2\2\2\26\u00b1\3\2\2\2\30\u00b7"+
		"\3\2\2\2\32\u00bc\3\2\2\2\34\u00bf\3\2\2\2\36\u00c2\3\2\2\2 \u00c5\3\2"+
		"\2\2\"\u00cd\3\2\2\2$\u00d0\3\2\2\2&\u00d3\3\2\2\2(\u00d6\3\2\2\2*\u00f1"+
		"\3\2\2\2,\u00f3\3\2\2\2.\u0105\3\2\2\2\60\u0107\3\2\2\2\62\u0110\3\2\2"+
		"\2\64\u0116\3\2\2\2\66\u0118\3\2\2\28\u011f\3\2\2\2:\u0125\3\2\2\2<\u012a"+
		"\3\2\2\2>\u012f\3\2\2\2@\u0132\3\2\2\2B\u0135\3\2\2\2D\u013a\3\2\2\2F"+
		"\u013d\3\2\2\2H\u013f\3\2\2\2J\u0141\3\2\2\2L\u0143\3\2\2\2N\u0145\3\2"+
		"\2\2P\u0149\3\2\2\2R\u014b\3\2\2\2TU\5\4\3\2UV\5H%\2VX\5.\30\2WY\5H%\2"+
		"XW\3\2\2\2XY\3\2\2\2Y[\3\2\2\2Z\\\5<\37\2[Z\3\2\2\2[\\\3\2\2\2\\\3\3\2"+
		"\2\2]_\5\6\4\2^]\3\2\2\2^_\3\2\2\2_a\3\2\2\2`b\5\n\6\2a`\3\2\2\2ab\3\2"+
		"\2\2bd\3\2\2\2ce\5H%\2dc\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\5\24\13\2gh\5H"+
		"%\2hi\5\f\7\2ij\5H%\2jk\5\16\b\2kl\5H%\2lm\5\20\t\2mn\5H%\2no\5\22\n\2"+
		"o\5\3\2\2\2pq\7\"\2\2qr\5\b\5\2rs\7$\2\2s\7\3\2\2\2t{\5P)\2uw\5P)\2vu"+
		"\3\2\2\2vw\3\2\2\2w|\3\2\2\2xy\5P)\2yz\5P)\2z|\3\2\2\2{v\3\2\2\2{x\3\2"+
		"\2\2|\t\3\2\2\2}\u0084\5N(\2~\u0080\5P)\2\177~\3\2\2\2\177\u0080\3\2\2"+
		"\2\u0080\u0085\3\2\2\2\u0081\u0082\5P)\2\u0082\u0083\5P)\2\u0083\u0085"+
		"\3\2\2\2\u0084\177\3\2\2\2\u0084\u0081\3\2\2\2\u0085\13\3\2\2\2\u0086"+
		"\u008e\5R*\2\u0087\u0089\5J&\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2"+
		"\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a"+
		"\3\2\2\2\u008d\u0086\3\2\2\2\u008d\u008a\3\2\2\2\u008e\r\3\2\2\2\u008f"+
		"\u0097\5R*\2\u0090\u0092\5J&\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2"+
		"\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093"+
		"\3\2\2\2\u0096\u008f\3\2\2\2\u0096\u0093\3\2\2\2\u0097\17\3\2\2\2\u0098"+
		"\u00a0\5R*\2\u0099\u009b\5J&\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2"+
		"\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c"+
		"\3\2\2\2\u009f\u0098\3\2\2\2\u009f\u009c\3\2\2\2\u00a0\21\3\2\2\2\u00a1"+
		"\u00a9\5R*\2\u00a2\u00a4\5J&\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2"+
		"\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5"+
		"\3\2\2\2\u00a8\u00a1\3\2\2\2\u00a8\u00a5\3\2\2\2\u00a9\23\3\2\2\2\u00aa"+
		"\u00b0\5R*\2\u00ab\u00ac\5\26\f\2\u00ac\u00ad\7:\2\2\u00ad\u00ae\5\36"+
		"\20\2\u00ae\u00b0\3\2\2\2\u00af\u00aa\3\2\2\2\u00af\u00ab\3\2\2\2\u00b0"+
		"\25\3\2\2\2\u00b1\u00b2\5\30\r\2\u00b2\u00b3\7\23\2\2\u00b3\u00b4\5\32"+
		"\16\2\u00b4\u00b5\7\23\2\2\u00b5\u00b6\5\34\17\2\u00b6\27\3\2\2\2\u00b7"+
		"\u00b8\5P)\2\u00b8\u00b9\5P)\2\u00b9\u00ba\5P)\2\u00ba\u00bb\5P)\2\u00bb"+
		"\31\3\2\2\2\u00bc\u00bd\5P)\2\u00bd\u00be\5P)\2\u00be\33\3\2\2\2\u00bf"+
		"\u00c0\5P)\2\u00c0\u00c1\5P)\2\u00c1\35\3\2\2\2\u00c2\u00c3\5 \21\2\u00c3"+
		"\u00c4\5*\26\2\u00c4\37\3\2\2\2\u00c5\u00c6\5\"\22\2\u00c6\u00c7\7 \2"+
		"\2\u00c7\u00c8\5$\23\2\u00c8\u00c9\7 \2\2\u00c9\u00cb\5&\24\2\u00ca\u00cc"+
		"\5(\25\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc!\3\2\2\2\u00cd"+
		"\u00ce\5P)\2\u00ce\u00cf\5P)\2\u00cf#\3\2\2\2\u00d0\u00d1\5P)\2\u00d1"+
		"\u00d2\5P)\2\u00d2%\3\2\2\2\u00d3\u00d4\5P)\2\u00d4\u00d5\5P)\2\u00d5"+
		"\'\3\2\2\2\u00d6\u00d7\7\24\2\2\u00d7\u00ed\5P)\2\u00d8\u00da\5P)\2\u00d9"+
		"\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00ee\3\2\2\2\u00db\u00dc\5P"+
		")\2\u00dc\u00dd\5P)\2\u00dd\u00ee\3\2\2\2\u00de\u00df\5P)\2\u00df\u00e0"+
		"\5P)\2\u00e0\u00e1\5P)\2\u00e1\u00ee\3\2\2\2\u00e2\u00e3\5P)\2\u00e3\u00e4"+
		"\5P)\2\u00e4\u00e5\5P)\2\u00e5\u00e6\5P)\2\u00e6\u00ee\3\2\2\2\u00e7\u00e8"+
		"\5P)\2\u00e8\u00e9\5P)\2\u00e9\u00ea\5P)\2\u00ea\u00eb\5P)\2\u00eb\u00ec"+
		"\5P)\2\u00ec\u00ee\3\2\2\2\u00ed\u00d9\3\2\2\2\u00ed\u00db\3\2\2\2\u00ed"+
		"\u00de\3\2\2\2\u00ed\u00e2\3\2\2\2\u00ed\u00e7\3\2\2\2\u00ee)\3\2\2\2"+
		"\u00ef\u00f2\7@\2\2\u00f0\u00f2\5,\27\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0"+
		"\3\2\2\2\u00f2+\3\2\2\2\u00f3\u00f4\t\2\2\2\u00f4\u00f5\5\"\22\2\u00f5"+
		"\u00f6\7 \2\2\u00f6\u00f7\5$\23\2\u00f7-\3\2\2\2\u00f8\u0106\5R*\2\u00f9"+
		"\u00fa\7A\2\2\u00fa\u00fb\5\60\31\2\u00fb\u0102\7C\2\2\u00fc\u00fd\7A"+
		"\2\2\u00fd\u00fe\5\60\31\2\u00fe\u00ff\7C\2\2\u00ff\u0101\3\2\2\2\u0100"+
		"\u00fc\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2"+
		"\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u00f8\3\2\2\2\u0105"+
		"\u00f9\3\2\2\2\u0106/\3\2\2\2\u0107\u010d\5\64\33\2\u0108\u0109\5H%\2"+
		"\u0109\u010a\5\62\32\2\u010a\u010c\3\2\2\2\u010b\u0108\3\2\2\2\u010c\u010f"+
		"\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\61\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0111\5\66\34\2\u0111\u0112\7#\2\2\u0112\u0113\7"+
		"\b\2\2\u0113\u0114\58\35\2\u0114\u0115\7\b\2\2\u0115\63\3\2\2\2\u0116"+
		"\u0117\5:\36\2\u0117\65\3\2\2\2\u0118\u0119\5:\36\2\u0119\67\3\2\2\2\u011a"+
		"\u011e\n\3\2\2\u011b\u011c\7B\2\2\u011c\u011e\t\3\2\2\u011d\u011a\3\2"+
		"\2\2\u011d\u011b\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u01209\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0124\5L\'\2\u0123"+
		"\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2"+
		"\2\2\u0126;\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012b\5> \2\u0129\u012b"+
		"\5@!\2\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b=\3\2\2\2\u012c\u012e"+
		"\5F$\2\u012d\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130?\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\5B\"\2\u0133"+
		"\u0134\5D#\2\u0134A\3\2\2\2\u0135\u0136\t\4\2\2\u0136C\3\2\2\2\u0137\u0139"+
		"\5F$\2\u0138\u0137\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013bE\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e\t\5\2\2"+
		"\u013eG\3\2\2\2\u013f\u0140\7\6\2\2\u0140I\3\2\2\2\u0141\u0142\t\6\2\2"+
		"\u0142K\3\2\2\2\u0143\u0144\t\7\2\2\u0144M\3\2\2\2\u0145\u0146\t\b\2\2"+
		"\u0146O\3\2\2\2\u0147\u014a\7\26\2\2\u0148\u014a\5N(\2\u0149\u0147\3\2"+
		"\2\2\u0149\u0148\3\2\2\2\u014aQ\3\2\2\2\u014b\u014c\7\23\2\2\u014cS\3"+
		"\2\2\2\"X[^adv{\177\u0084\u008a\u008d\u0093\u0096\u009c\u009f\u00a5\u00a8"+
		"\u00af\u00cb\u00d9\u00ed\u00f1\u0102\u0105\u010d\u011d\u011f\u0125\u012a"+
		"\u012f\u013a\u0149";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}