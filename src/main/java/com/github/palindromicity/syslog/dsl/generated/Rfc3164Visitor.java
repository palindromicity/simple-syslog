// Generated from com/github/palindromicity/syslog/dsl/generated/Rfc3164.g4 by ANTLR 4.5
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


import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Rfc3164Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Rfc3164Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Rfc3164Parser#octet_prefixed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctet_prefixed(Rfc3164Parser.Octet_prefixedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code syslogMsg}
	 * labeled alternative in {@link Rfc3164Parser#syslog_msg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyslogMsg(Rfc3164Parser.SyslogMsgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code syslogHeader}
	 * labeled alternative in {@link Rfc3164Parser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyslogHeader(Rfc3164Parser.SyslogHeaderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code headerPriority}
	 * labeled alternative in {@link Rfc3164Parser#pri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaderPriority(Rfc3164Parser.HeaderPriorityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code headerPriorityValue}
	 * labeled alternative in {@link Rfc3164Parser#prival}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaderPriorityValue(Rfc3164Parser.HeaderPriorityValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code headerHostName}
	 * labeled alternative in {@link Rfc3164Parser#hostname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaderHostName(Rfc3164Parser.HeaderHostNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code headerTimeStamp}
	 * labeled alternative in {@link Rfc3164Parser#timestamp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaderTimeStamp(Rfc3164Parser.HeaderTimeStampContext ctx);
	/**
	 * Visit a parse tree produced by the {@code headerTimeStamp3164}
	 * labeled alternative in {@link Rfc3164Parser#timestamp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaderTimeStamp3164(Rfc3164Parser.HeaderTimeStamp3164Context ctx);
	/**
	 * Visit a parse tree produced by {@link Rfc3164Parser#date_month_short}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_month_short(Rfc3164Parser.Date_month_shortContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rfc3164Parser#date_day_short}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_day_short(Rfc3164Parser.Date_day_shortContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rfc3164Parser#full_date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_date(Rfc3164Parser.Full_dateContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rfc3164Parser#date_fullyear}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_fullyear(Rfc3164Parser.Date_fullyearContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rfc3164Parser#date_month}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_month(Rfc3164Parser.Date_monthContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rfc3164Parser#date_mday}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_mday(Rfc3164Parser.Date_mdayContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rfc3164Parser#full_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_time(Rfc3164Parser.Full_timeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rfc3164Parser#partial_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartial_time(Rfc3164Parser.Partial_timeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rfc3164Parser#time_hour}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_hour(Rfc3164Parser.Time_hourContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rfc3164Parser#time_minute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_minute(Rfc3164Parser.Time_minuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rfc3164Parser#time_second}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_second(Rfc3164Parser.Time_secondContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rfc3164Parser#time_secfrac}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_secfrac(Rfc3164Parser.Time_secfracContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rfc3164Parser#time_offset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_offset(Rfc3164Parser.Time_offsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rfc3164Parser#time_numoffset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_numoffset(Rfc3164Parser.Time_numoffsetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code msgAny}
	 * labeled alternative in {@link Rfc3164Parser#msg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMsgAny(Rfc3164Parser.MsgAnyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code msgUTF8}
	 * labeled alternative in {@link Rfc3164Parser#msg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMsgUTF8(Rfc3164Parser.MsgUTF8Context ctx);
	/**
	 * Visit a parse tree produced by {@link Rfc3164Parser#msg_any}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMsg_any(Rfc3164Parser.Msg_anyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rfc3164Parser#msg_utf8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMsg_utf8(Rfc3164Parser.Msg_utf8Context ctx);
	/**
	 * Visit a parse tree produced by {@link Rfc3164Parser#bom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBom(Rfc3164Parser.BomContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rfc3164Parser#utf_8_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUtf_8_string(Rfc3164Parser.Utf_8_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rfc3164Parser#octet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctet(Rfc3164Parser.OctetContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rfc3164Parser#sp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSp(Rfc3164Parser.SpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rfc3164Parser#printusascii}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintusascii(Rfc3164Parser.PrintusasciiContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rfc3164Parser#printusasciinospecials}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintusasciinospecials(Rfc3164Parser.PrintusasciinospecialsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rfc3164Parser#nonzero_digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonzero_digit(Rfc3164Parser.Nonzero_digitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code zeroDigit}
	 * labeled alternative in {@link Rfc3164Parser#digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeroDigit(Rfc3164Parser.ZeroDigitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonZeroDigit}
	 * labeled alternative in {@link Rfc3164Parser#digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonZeroDigit(Rfc3164Parser.NonZeroDigitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rfc3164Parser#capital}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapital(Rfc3164Parser.CapitalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Rfc3164Parser#lower}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLower(Rfc3164Parser.LowerContext ctx);
}