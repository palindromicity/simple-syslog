// Generated from com/github/palindromicity/syslog/dsl/generated/Rfc3164.g4 by ANTLR 4.13.2
package com.github.palindromicity.syslog.dsl.generated;

//CHECKSTYLE:OFF
/*
 * Copyright 2018-2022 simple-syslog authors
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


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Rfc3164Parser}.
 */
public interface Rfc3164Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Rfc3164Parser#octet_prefixed}.
	 * @param ctx the parse tree
	 */
	void enterOctet_prefixed(Rfc3164Parser.Octet_prefixedContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc3164Parser#octet_prefixed}.
	 * @param ctx the parse tree
	 */
	void exitOctet_prefixed(Rfc3164Parser.Octet_prefixedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code syslogMsg}
	 * labeled alternative in {@link Rfc3164Parser#syslog_msg}.
	 * @param ctx the parse tree
	 */
	void enterSyslogMsg(Rfc3164Parser.SyslogMsgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code syslogMsg}
	 * labeled alternative in {@link Rfc3164Parser#syslog_msg}.
	 * @param ctx the parse tree
	 */
	void exitSyslogMsg(Rfc3164Parser.SyslogMsgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code syslogHeader}
	 * labeled alternative in {@link Rfc3164Parser#header}.
	 * @param ctx the parse tree
	 */
	void enterSyslogHeader(Rfc3164Parser.SyslogHeaderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code syslogHeader}
	 * labeled alternative in {@link Rfc3164Parser#header}.
	 * @param ctx the parse tree
	 */
	void exitSyslogHeader(Rfc3164Parser.SyslogHeaderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code headerPriority}
	 * labeled alternative in {@link Rfc3164Parser#pri}.
	 * @param ctx the parse tree
	 */
	void enterHeaderPriority(Rfc3164Parser.HeaderPriorityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code headerPriority}
	 * labeled alternative in {@link Rfc3164Parser#pri}.
	 * @param ctx the parse tree
	 */
	void exitHeaderPriority(Rfc3164Parser.HeaderPriorityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code headerPriorityValue}
	 * labeled alternative in {@link Rfc3164Parser#prival}.
	 * @param ctx the parse tree
	 */
	void enterHeaderPriorityValue(Rfc3164Parser.HeaderPriorityValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code headerPriorityValue}
	 * labeled alternative in {@link Rfc3164Parser#prival}.
	 * @param ctx the parse tree
	 */
	void exitHeaderPriorityValue(Rfc3164Parser.HeaderPriorityValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code headerHostName}
	 * labeled alternative in {@link Rfc3164Parser#hostname}.
	 * @param ctx the parse tree
	 */
	void enterHeaderHostName(Rfc3164Parser.HeaderHostNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code headerHostName}
	 * labeled alternative in {@link Rfc3164Parser#hostname}.
	 * @param ctx the parse tree
	 */
	void exitHeaderHostName(Rfc3164Parser.HeaderHostNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code headerTimeStamp}
	 * labeled alternative in {@link Rfc3164Parser#timestamp}.
	 * @param ctx the parse tree
	 */
	void enterHeaderTimeStamp(Rfc3164Parser.HeaderTimeStampContext ctx);
	/**
	 * Exit a parse tree produced by the {@code headerTimeStamp}
	 * labeled alternative in {@link Rfc3164Parser#timestamp}.
	 * @param ctx the parse tree
	 */
	void exitHeaderTimeStamp(Rfc3164Parser.HeaderTimeStampContext ctx);
	/**
	 * Enter a parse tree produced by the {@code headerTimeStamp3164}
	 * labeled alternative in {@link Rfc3164Parser#timestamp}.
	 * @param ctx the parse tree
	 */
	void enterHeaderTimeStamp3164(Rfc3164Parser.HeaderTimeStamp3164Context ctx);
	/**
	 * Exit a parse tree produced by the {@code headerTimeStamp3164}
	 * labeled alternative in {@link Rfc3164Parser#timestamp}.
	 * @param ctx the parse tree
	 */
	void exitHeaderTimeStamp3164(Rfc3164Parser.HeaderTimeStamp3164Context ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc3164Parser#date_month_short}.
	 * @param ctx the parse tree
	 */
	void enterDate_month_short(Rfc3164Parser.Date_month_shortContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc3164Parser#date_month_short}.
	 * @param ctx the parse tree
	 */
	void exitDate_month_short(Rfc3164Parser.Date_month_shortContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc3164Parser#date_day_short}.
	 * @param ctx the parse tree
	 */
	void enterDate_day_short(Rfc3164Parser.Date_day_shortContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc3164Parser#date_day_short}.
	 * @param ctx the parse tree
	 */
	void exitDate_day_short(Rfc3164Parser.Date_day_shortContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc3164Parser#full_date}.
	 * @param ctx the parse tree
	 */
	void enterFull_date(Rfc3164Parser.Full_dateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc3164Parser#full_date}.
	 * @param ctx the parse tree
	 */
	void exitFull_date(Rfc3164Parser.Full_dateContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc3164Parser#date_fullyear}.
	 * @param ctx the parse tree
	 */
	void enterDate_fullyear(Rfc3164Parser.Date_fullyearContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc3164Parser#date_fullyear}.
	 * @param ctx the parse tree
	 */
	void exitDate_fullyear(Rfc3164Parser.Date_fullyearContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc3164Parser#date_month}.
	 * @param ctx the parse tree
	 */
	void enterDate_month(Rfc3164Parser.Date_monthContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc3164Parser#date_month}.
	 * @param ctx the parse tree
	 */
	void exitDate_month(Rfc3164Parser.Date_monthContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc3164Parser#date_mday}.
	 * @param ctx the parse tree
	 */
	void enterDate_mday(Rfc3164Parser.Date_mdayContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc3164Parser#date_mday}.
	 * @param ctx the parse tree
	 */
	void exitDate_mday(Rfc3164Parser.Date_mdayContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc3164Parser#full_time}.
	 * @param ctx the parse tree
	 */
	void enterFull_time(Rfc3164Parser.Full_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc3164Parser#full_time}.
	 * @param ctx the parse tree
	 */
	void exitFull_time(Rfc3164Parser.Full_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc3164Parser#partial_time}.
	 * @param ctx the parse tree
	 */
	void enterPartial_time(Rfc3164Parser.Partial_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc3164Parser#partial_time}.
	 * @param ctx the parse tree
	 */
	void exitPartial_time(Rfc3164Parser.Partial_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc3164Parser#time_hour}.
	 * @param ctx the parse tree
	 */
	void enterTime_hour(Rfc3164Parser.Time_hourContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc3164Parser#time_hour}.
	 * @param ctx the parse tree
	 */
	void exitTime_hour(Rfc3164Parser.Time_hourContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc3164Parser#time_minute}.
	 * @param ctx the parse tree
	 */
	void enterTime_minute(Rfc3164Parser.Time_minuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc3164Parser#time_minute}.
	 * @param ctx the parse tree
	 */
	void exitTime_minute(Rfc3164Parser.Time_minuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc3164Parser#time_second}.
	 * @param ctx the parse tree
	 */
	void enterTime_second(Rfc3164Parser.Time_secondContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc3164Parser#time_second}.
	 * @param ctx the parse tree
	 */
	void exitTime_second(Rfc3164Parser.Time_secondContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc3164Parser#time_secfrac}.
	 * @param ctx the parse tree
	 */
	void enterTime_secfrac(Rfc3164Parser.Time_secfracContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc3164Parser#time_secfrac}.
	 * @param ctx the parse tree
	 */
	void exitTime_secfrac(Rfc3164Parser.Time_secfracContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc3164Parser#time_offset}.
	 * @param ctx the parse tree
	 */
	void enterTime_offset(Rfc3164Parser.Time_offsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc3164Parser#time_offset}.
	 * @param ctx the parse tree
	 */
	void exitTime_offset(Rfc3164Parser.Time_offsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc3164Parser#time_numoffset}.
	 * @param ctx the parse tree
	 */
	void enterTime_numoffset(Rfc3164Parser.Time_numoffsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc3164Parser#time_numoffset}.
	 * @param ctx the parse tree
	 */
	void exitTime_numoffset(Rfc3164Parser.Time_numoffsetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code msgAny}
	 * labeled alternative in {@link Rfc3164Parser#msg}.
	 * @param ctx the parse tree
	 */
	void enterMsgAny(Rfc3164Parser.MsgAnyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code msgAny}
	 * labeled alternative in {@link Rfc3164Parser#msg}.
	 * @param ctx the parse tree
	 */
	void exitMsgAny(Rfc3164Parser.MsgAnyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code msgUTF8}
	 * labeled alternative in {@link Rfc3164Parser#msg}.
	 * @param ctx the parse tree
	 */
	void enterMsgUTF8(Rfc3164Parser.MsgUTF8Context ctx);
	/**
	 * Exit a parse tree produced by the {@code msgUTF8}
	 * labeled alternative in {@link Rfc3164Parser#msg}.
	 * @param ctx the parse tree
	 */
	void exitMsgUTF8(Rfc3164Parser.MsgUTF8Context ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc3164Parser#msg_any}.
	 * @param ctx the parse tree
	 */
	void enterMsg_any(Rfc3164Parser.Msg_anyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc3164Parser#msg_any}.
	 * @param ctx the parse tree
	 */
	void exitMsg_any(Rfc3164Parser.Msg_anyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc3164Parser#msg_utf8}.
	 * @param ctx the parse tree
	 */
	void enterMsg_utf8(Rfc3164Parser.Msg_utf8Context ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc3164Parser#msg_utf8}.
	 * @param ctx the parse tree
	 */
	void exitMsg_utf8(Rfc3164Parser.Msg_utf8Context ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc3164Parser#bom}.
	 * @param ctx the parse tree
	 */
	void enterBom(Rfc3164Parser.BomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc3164Parser#bom}.
	 * @param ctx the parse tree
	 */
	void exitBom(Rfc3164Parser.BomContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc3164Parser#utf_8_string}.
	 * @param ctx the parse tree
	 */
	void enterUtf_8_string(Rfc3164Parser.Utf_8_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc3164Parser#utf_8_string}.
	 * @param ctx the parse tree
	 */
	void exitUtf_8_string(Rfc3164Parser.Utf_8_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc3164Parser#octet}.
	 * @param ctx the parse tree
	 */
	void enterOctet(Rfc3164Parser.OctetContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc3164Parser#octet}.
	 * @param ctx the parse tree
	 */
	void exitOctet(Rfc3164Parser.OctetContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc3164Parser#sp}.
	 * @param ctx the parse tree
	 */
	void enterSp(Rfc3164Parser.SpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc3164Parser#sp}.
	 * @param ctx the parse tree
	 */
	void exitSp(Rfc3164Parser.SpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc3164Parser#printusascii}.
	 * @param ctx the parse tree
	 */
	void enterPrintusascii(Rfc3164Parser.PrintusasciiContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc3164Parser#printusascii}.
	 * @param ctx the parse tree
	 */
	void exitPrintusascii(Rfc3164Parser.PrintusasciiContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc3164Parser#printusasciinospecials}.
	 * @param ctx the parse tree
	 */
	void enterPrintusasciinospecials(Rfc3164Parser.PrintusasciinospecialsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc3164Parser#printusasciinospecials}.
	 * @param ctx the parse tree
	 */
	void exitPrintusasciinospecials(Rfc3164Parser.PrintusasciinospecialsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc3164Parser#nonzero_digit}.
	 * @param ctx the parse tree
	 */
	void enterNonzero_digit(Rfc3164Parser.Nonzero_digitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc3164Parser#nonzero_digit}.
	 * @param ctx the parse tree
	 */
	void exitNonzero_digit(Rfc3164Parser.Nonzero_digitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code zeroDigit}
	 * labeled alternative in {@link Rfc3164Parser#digit}.
	 * @param ctx the parse tree
	 */
	void enterZeroDigit(Rfc3164Parser.ZeroDigitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code zeroDigit}
	 * labeled alternative in {@link Rfc3164Parser#digit}.
	 * @param ctx the parse tree
	 */
	void exitZeroDigit(Rfc3164Parser.ZeroDigitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonZeroDigit}
	 * labeled alternative in {@link Rfc3164Parser#digit}.
	 * @param ctx the parse tree
	 */
	void enterNonZeroDigit(Rfc3164Parser.NonZeroDigitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonZeroDigit}
	 * labeled alternative in {@link Rfc3164Parser#digit}.
	 * @param ctx the parse tree
	 */
	void exitNonZeroDigit(Rfc3164Parser.NonZeroDigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc3164Parser#capital}.
	 * @param ctx the parse tree
	 */
	void enterCapital(Rfc3164Parser.CapitalContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc3164Parser#capital}.
	 * @param ctx the parse tree
	 */
	void exitCapital(Rfc3164Parser.CapitalContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc3164Parser#lower}.
	 * @param ctx the parse tree
	 */
	void enterLower(Rfc3164Parser.LowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc3164Parser#lower}.
	 * @param ctx the parse tree
	 */
	void exitLower(Rfc3164Parser.LowerContext ctx);
}