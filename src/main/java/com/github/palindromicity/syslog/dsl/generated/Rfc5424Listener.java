// Generated from com/github/palindromicity/syslog/dsl/generated/Rfc5424.g4 by ANTLR 4.5
package com.github.palindromicity.syslog.dsl.generated;

//CHECKSTYLE:OFF
/*
 * Copyright 2018-2020 simple-syslog authors
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
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Rfc5424Parser}.
 */
public interface Rfc5424Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code herokuHttpsMsg}
	 * labeled alternative in {@link Rfc5424Parser#heroku_https_log_drain}.
	 * @param ctx the parse tree
	 */
	void enterHerokuHttpsMsg(Rfc5424Parser.HerokuHttpsMsgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code herokuHttpsMsg}
	 * labeled alternative in {@link Rfc5424Parser#heroku_https_log_drain}.
	 * @param ctx the parse tree
	 */
	void exitHerokuHttpsMsg(Rfc5424Parser.HerokuHttpsMsgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc5424Parser#octet_prefixed}.
	 * @param ctx the parse tree
	 */
	void enterOctet_prefixed(Rfc5424Parser.Octet_prefixedContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc5424Parser#octet_prefixed}.
	 * @param ctx the parse tree
	 */
	void exitOctet_prefixed(Rfc5424Parser.Octet_prefixedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code syslogMsg}
	 * labeled alternative in {@link Rfc5424Parser#syslog_msg}.
	 * @param ctx the parse tree
	 */
	void enterSyslogMsg(Rfc5424Parser.SyslogMsgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code syslogMsg}
	 * labeled alternative in {@link Rfc5424Parser#syslog_msg}.
	 * @param ctx the parse tree
	 */
	void exitSyslogMsg(Rfc5424Parser.SyslogMsgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc5424Parser#octet_prefix}.
	 * @param ctx the parse tree
	 */
	void enterOctet_prefix(Rfc5424Parser.Octet_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc5424Parser#octet_prefix}.
	 * @param ctx the parse tree
	 */
	void exitOctet_prefix(Rfc5424Parser.Octet_prefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code syslogHeader}
	 * labeled alternative in {@link Rfc5424Parser#header}.
	 * @param ctx the parse tree
	 */
	void enterSyslogHeader(Rfc5424Parser.SyslogHeaderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code syslogHeader}
	 * labeled alternative in {@link Rfc5424Parser#header}.
	 * @param ctx the parse tree
	 */
	void exitSyslogHeader(Rfc5424Parser.SyslogHeaderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code headerPriority}
	 * labeled alternative in {@link Rfc5424Parser#pri}.
	 * @param ctx the parse tree
	 */
	void enterHeaderPriority(Rfc5424Parser.HeaderPriorityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code headerPriority}
	 * labeled alternative in {@link Rfc5424Parser#pri}.
	 * @param ctx the parse tree
	 */
	void exitHeaderPriority(Rfc5424Parser.HeaderPriorityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code headerPriorityValue}
	 * labeled alternative in {@link Rfc5424Parser#prival}.
	 * @param ctx the parse tree
	 */
	void enterHeaderPriorityValue(Rfc5424Parser.HeaderPriorityValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code headerPriorityValue}
	 * labeled alternative in {@link Rfc5424Parser#prival}.
	 * @param ctx the parse tree
	 */
	void exitHeaderPriorityValue(Rfc5424Parser.HeaderPriorityValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code headerVersion}
	 * labeled alternative in {@link Rfc5424Parser#version}.
	 * @param ctx the parse tree
	 */
	void enterHeaderVersion(Rfc5424Parser.HeaderVersionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code headerVersion}
	 * labeled alternative in {@link Rfc5424Parser#version}.
	 * @param ctx the parse tree
	 */
	void exitHeaderVersion(Rfc5424Parser.HeaderVersionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code headerNilHostName}
	 * labeled alternative in {@link Rfc5424Parser#hostname}.
	 * @param ctx the parse tree
	 */
	void enterHeaderNilHostName(Rfc5424Parser.HeaderNilHostNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code headerNilHostName}
	 * labeled alternative in {@link Rfc5424Parser#hostname}.
	 * @param ctx the parse tree
	 */
	void exitHeaderNilHostName(Rfc5424Parser.HeaderNilHostNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code headerHostName}
	 * labeled alternative in {@link Rfc5424Parser#hostname}.
	 * @param ctx the parse tree
	 */
	void enterHeaderHostName(Rfc5424Parser.HeaderHostNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code headerHostName}
	 * labeled alternative in {@link Rfc5424Parser#hostname}.
	 * @param ctx the parse tree
	 */
	void exitHeaderHostName(Rfc5424Parser.HeaderHostNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code headerNilAppName}
	 * labeled alternative in {@link Rfc5424Parser#app_name}.
	 * @param ctx the parse tree
	 */
	void enterHeaderNilAppName(Rfc5424Parser.HeaderNilAppNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code headerNilAppName}
	 * labeled alternative in {@link Rfc5424Parser#app_name}.
	 * @param ctx the parse tree
	 */
	void exitHeaderNilAppName(Rfc5424Parser.HeaderNilAppNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code headerAppName}
	 * labeled alternative in {@link Rfc5424Parser#app_name}.
	 * @param ctx the parse tree
	 */
	void enterHeaderAppName(Rfc5424Parser.HeaderAppNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code headerAppName}
	 * labeled alternative in {@link Rfc5424Parser#app_name}.
	 * @param ctx the parse tree
	 */
	void exitHeaderAppName(Rfc5424Parser.HeaderAppNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code headerNilProcId}
	 * labeled alternative in {@link Rfc5424Parser#procid}.
	 * @param ctx the parse tree
	 */
	void enterHeaderNilProcId(Rfc5424Parser.HeaderNilProcIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code headerNilProcId}
	 * labeled alternative in {@link Rfc5424Parser#procid}.
	 * @param ctx the parse tree
	 */
	void exitHeaderNilProcId(Rfc5424Parser.HeaderNilProcIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code headerProcId}
	 * labeled alternative in {@link Rfc5424Parser#procid}.
	 * @param ctx the parse tree
	 */
	void enterHeaderProcId(Rfc5424Parser.HeaderProcIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code headerProcId}
	 * labeled alternative in {@link Rfc5424Parser#procid}.
	 * @param ctx the parse tree
	 */
	void exitHeaderProcId(Rfc5424Parser.HeaderProcIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code headerNilMsgId}
	 * labeled alternative in {@link Rfc5424Parser#msgid}.
	 * @param ctx the parse tree
	 */
	void enterHeaderNilMsgId(Rfc5424Parser.HeaderNilMsgIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code headerNilMsgId}
	 * labeled alternative in {@link Rfc5424Parser#msgid}.
	 * @param ctx the parse tree
	 */
	void exitHeaderNilMsgId(Rfc5424Parser.HeaderNilMsgIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code headerMsgId}
	 * labeled alternative in {@link Rfc5424Parser#msgid}.
	 * @param ctx the parse tree
	 */
	void enterHeaderMsgId(Rfc5424Parser.HeaderMsgIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code headerMsgId}
	 * labeled alternative in {@link Rfc5424Parser#msgid}.
	 * @param ctx the parse tree
	 */
	void exitHeaderMsgId(Rfc5424Parser.HeaderMsgIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code headerNilTimestamp}
	 * labeled alternative in {@link Rfc5424Parser#timestamp}.
	 * @param ctx the parse tree
	 */
	void enterHeaderNilTimestamp(Rfc5424Parser.HeaderNilTimestampContext ctx);
	/**
	 * Exit a parse tree produced by the {@code headerNilTimestamp}
	 * labeled alternative in {@link Rfc5424Parser#timestamp}.
	 * @param ctx the parse tree
	 */
	void exitHeaderNilTimestamp(Rfc5424Parser.HeaderNilTimestampContext ctx);
	/**
	 * Enter a parse tree produced by the {@code headerTimeStamp}
	 * labeled alternative in {@link Rfc5424Parser#timestamp}.
	 * @param ctx the parse tree
	 */
	void enterHeaderTimeStamp(Rfc5424Parser.HeaderTimeStampContext ctx);
	/**
	 * Exit a parse tree produced by the {@code headerTimeStamp}
	 * labeled alternative in {@link Rfc5424Parser#timestamp}.
	 * @param ctx the parse tree
	 */
	void exitHeaderTimeStamp(Rfc5424Parser.HeaderTimeStampContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc5424Parser#full_date}.
	 * @param ctx the parse tree
	 */
	void enterFull_date(Rfc5424Parser.Full_dateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc5424Parser#full_date}.
	 * @param ctx the parse tree
	 */
	void exitFull_date(Rfc5424Parser.Full_dateContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc5424Parser#date_fullyear}.
	 * @param ctx the parse tree
	 */
	void enterDate_fullyear(Rfc5424Parser.Date_fullyearContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc5424Parser#date_fullyear}.
	 * @param ctx the parse tree
	 */
	void exitDate_fullyear(Rfc5424Parser.Date_fullyearContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc5424Parser#date_month}.
	 * @param ctx the parse tree
	 */
	void enterDate_month(Rfc5424Parser.Date_monthContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc5424Parser#date_month}.
	 * @param ctx the parse tree
	 */
	void exitDate_month(Rfc5424Parser.Date_monthContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc5424Parser#date_mday}.
	 * @param ctx the parse tree
	 */
	void enterDate_mday(Rfc5424Parser.Date_mdayContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc5424Parser#date_mday}.
	 * @param ctx the parse tree
	 */
	void exitDate_mday(Rfc5424Parser.Date_mdayContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc5424Parser#full_time}.
	 * @param ctx the parse tree
	 */
	void enterFull_time(Rfc5424Parser.Full_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc5424Parser#full_time}.
	 * @param ctx the parse tree
	 */
	void exitFull_time(Rfc5424Parser.Full_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc5424Parser#partial_time}.
	 * @param ctx the parse tree
	 */
	void enterPartial_time(Rfc5424Parser.Partial_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc5424Parser#partial_time}.
	 * @param ctx the parse tree
	 */
	void exitPartial_time(Rfc5424Parser.Partial_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc5424Parser#time_hour}.
	 * @param ctx the parse tree
	 */
	void enterTime_hour(Rfc5424Parser.Time_hourContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc5424Parser#time_hour}.
	 * @param ctx the parse tree
	 */
	void exitTime_hour(Rfc5424Parser.Time_hourContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc5424Parser#time_minute}.
	 * @param ctx the parse tree
	 */
	void enterTime_minute(Rfc5424Parser.Time_minuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc5424Parser#time_minute}.
	 * @param ctx the parse tree
	 */
	void exitTime_minute(Rfc5424Parser.Time_minuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc5424Parser#time_second}.
	 * @param ctx the parse tree
	 */
	void enterTime_second(Rfc5424Parser.Time_secondContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc5424Parser#time_second}.
	 * @param ctx the parse tree
	 */
	void exitTime_second(Rfc5424Parser.Time_secondContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc5424Parser#time_secfrac}.
	 * @param ctx the parse tree
	 */
	void enterTime_secfrac(Rfc5424Parser.Time_secfracContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc5424Parser#time_secfrac}.
	 * @param ctx the parse tree
	 */
	void exitTime_secfrac(Rfc5424Parser.Time_secfracContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc5424Parser#time_offset}.
	 * @param ctx the parse tree
	 */
	void enterTime_offset(Rfc5424Parser.Time_offsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc5424Parser#time_offset}.
	 * @param ctx the parse tree
	 */
	void exitTime_offset(Rfc5424Parser.Time_offsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc5424Parser#time_numoffset}.
	 * @param ctx the parse tree
	 */
	void enterTime_numoffset(Rfc5424Parser.Time_numoffsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc5424Parser#time_numoffset}.
	 * @param ctx the parse tree
	 */
	void exitTime_numoffset(Rfc5424Parser.Time_numoffsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc5424Parser#structured_data}.
	 * @param ctx the parse tree
	 */
	void enterStructured_data(Rfc5424Parser.Structured_dataContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc5424Parser#structured_data}.
	 * @param ctx the parse tree
	 */
	void exitStructured_data(Rfc5424Parser.Structured_dataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sdElement}
	 * labeled alternative in {@link Rfc5424Parser#sd_element}.
	 * @param ctx the parse tree
	 */
	void enterSdElement(Rfc5424Parser.SdElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sdElement}
	 * labeled alternative in {@link Rfc5424Parser#sd_element}.
	 * @param ctx the parse tree
	 */
	void exitSdElement(Rfc5424Parser.SdElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sdParam}
	 * labeled alternative in {@link Rfc5424Parser#sd_param}.
	 * @param ctx the parse tree
	 */
	void enterSdParam(Rfc5424Parser.SdParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sdParam}
	 * labeled alternative in {@link Rfc5424Parser#sd_param}.
	 * @param ctx the parse tree
	 */
	void exitSdParam(Rfc5424Parser.SdParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc5424Parser#sd_id}.
	 * @param ctx the parse tree
	 */
	void enterSd_id(Rfc5424Parser.Sd_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc5424Parser#sd_id}.
	 * @param ctx the parse tree
	 */
	void exitSd_id(Rfc5424Parser.Sd_idContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramName}
	 * labeled alternative in {@link Rfc5424Parser#param_name}.
	 * @param ctx the parse tree
	 */
	void enterParamName(Rfc5424Parser.ParamNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramName}
	 * labeled alternative in {@link Rfc5424Parser#param_name}.
	 * @param ctx the parse tree
	 */
	void exitParamName(Rfc5424Parser.ParamNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramValue}
	 * labeled alternative in {@link Rfc5424Parser#param_value}.
	 * @param ctx the parse tree
	 */
	void enterParamValue(Rfc5424Parser.ParamValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramValue}
	 * labeled alternative in {@link Rfc5424Parser#param_value}.
	 * @param ctx the parse tree
	 */
	void exitParamValue(Rfc5424Parser.ParamValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc5424Parser#sd_name}.
	 * @param ctx the parse tree
	 */
	void enterSd_name(Rfc5424Parser.Sd_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc5424Parser#sd_name}.
	 * @param ctx the parse tree
	 */
	void exitSd_name(Rfc5424Parser.Sd_nameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code msgAny}
	 * labeled alternative in {@link Rfc5424Parser#msg}.
	 * @param ctx the parse tree
	 */
	void enterMsgAny(Rfc5424Parser.MsgAnyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code msgAny}
	 * labeled alternative in {@link Rfc5424Parser#msg}.
	 * @param ctx the parse tree
	 */
	void exitMsgAny(Rfc5424Parser.MsgAnyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code msgUTF8}
	 * labeled alternative in {@link Rfc5424Parser#msg}.
	 * @param ctx the parse tree
	 */
	void enterMsgUTF8(Rfc5424Parser.MsgUTF8Context ctx);
	/**
	 * Exit a parse tree produced by the {@code msgUTF8}
	 * labeled alternative in {@link Rfc5424Parser#msg}.
	 * @param ctx the parse tree
	 */
	void exitMsgUTF8(Rfc5424Parser.MsgUTF8Context ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc5424Parser#msg_any}.
	 * @param ctx the parse tree
	 */
	void enterMsg_any(Rfc5424Parser.Msg_anyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc5424Parser#msg_any}.
	 * @param ctx the parse tree
	 */
	void exitMsg_any(Rfc5424Parser.Msg_anyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc5424Parser#msg_utf8}.
	 * @param ctx the parse tree
	 */
	void enterMsg_utf8(Rfc5424Parser.Msg_utf8Context ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc5424Parser#msg_utf8}.
	 * @param ctx the parse tree
	 */
	void exitMsg_utf8(Rfc5424Parser.Msg_utf8Context ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc5424Parser#bom}.
	 * @param ctx the parse tree
	 */
	void enterBom(Rfc5424Parser.BomContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc5424Parser#bom}.
	 * @param ctx the parse tree
	 */
	void exitBom(Rfc5424Parser.BomContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc5424Parser#utf_8_string}.
	 * @param ctx the parse tree
	 */
	void enterUtf_8_string(Rfc5424Parser.Utf_8_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc5424Parser#utf_8_string}.
	 * @param ctx the parse tree
	 */
	void exitUtf_8_string(Rfc5424Parser.Utf_8_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc5424Parser#octet}.
	 * @param ctx the parse tree
	 */
	void enterOctet(Rfc5424Parser.OctetContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc5424Parser#octet}.
	 * @param ctx the parse tree
	 */
	void exitOctet(Rfc5424Parser.OctetContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc5424Parser#sp}.
	 * @param ctx the parse tree
	 */
	void enterSp(Rfc5424Parser.SpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc5424Parser#sp}.
	 * @param ctx the parse tree
	 */
	void exitSp(Rfc5424Parser.SpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc5424Parser#printusascii}.
	 * @param ctx the parse tree
	 */
	void enterPrintusascii(Rfc5424Parser.PrintusasciiContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc5424Parser#printusascii}.
	 * @param ctx the parse tree
	 */
	void exitPrintusascii(Rfc5424Parser.PrintusasciiContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc5424Parser#printusasciinospecials}.
	 * @param ctx the parse tree
	 */
	void enterPrintusasciinospecials(Rfc5424Parser.PrintusasciinospecialsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc5424Parser#printusasciinospecials}.
	 * @param ctx the parse tree
	 */
	void exitPrintusasciinospecials(Rfc5424Parser.PrintusasciinospecialsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc5424Parser#nonzero_digit}.
	 * @param ctx the parse tree
	 */
	void enterNonzero_digit(Rfc5424Parser.Nonzero_digitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc5424Parser#nonzero_digit}.
	 * @param ctx the parse tree
	 */
	void exitNonzero_digit(Rfc5424Parser.Nonzero_digitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code zeroDigit}
	 * labeled alternative in {@link Rfc5424Parser#digit}.
	 * @param ctx the parse tree
	 */
	void enterZeroDigit(Rfc5424Parser.ZeroDigitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code zeroDigit}
	 * labeled alternative in {@link Rfc5424Parser#digit}.
	 * @param ctx the parse tree
	 */
	void exitZeroDigit(Rfc5424Parser.ZeroDigitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonZeroDigit}
	 * labeled alternative in {@link Rfc5424Parser#digit}.
	 * @param ctx the parse tree
	 */
	void enterNonZeroDigit(Rfc5424Parser.NonZeroDigitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonZeroDigit}
	 * labeled alternative in {@link Rfc5424Parser#digit}.
	 * @param ctx the parse tree
	 */
	void exitNonZeroDigit(Rfc5424Parser.NonZeroDigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rfc5424Parser#nilvalue}.
	 * @param ctx the parse tree
	 */
	void enterNilvalue(Rfc5424Parser.NilvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rfc5424Parser#nilvalue}.
	 * @param ctx the parse tree
	 */
	void exitNilvalue(Rfc5424Parser.NilvalueContext ctx);
}