/*
 * Copyright: © 2025.  Gregory Higgins <greg.higgins@v12technology.com> - All Rights Reserved
 * This source code is protected under international copyright law.  All rights
 * reserved and protected by the copyright holders.
 * This file is confidential and only available to authorized individuals with the
 * permission of the copyright holders.  If you encounter this file and do not have
 * permission, please contact the copyright holders and delete this file.
 */
package com.telamin.fluxtion.test.performance.generated.validation;

import com.telamin.fluxtion.runtime.CloneableDataFlow;
import com.telamin.fluxtion.runtime.DataFlow;
import com.telamin.fluxtion.runtime.annotations.ExportService;
import com.telamin.fluxtion.runtime.annotations.OnEventHandler;
import com.telamin.fluxtion.runtime.audit.Auditor;
import com.telamin.fluxtion.runtime.audit.EventLogManager;
import com.telamin.fluxtion.runtime.audit.NodeNameAuditor;
import com.telamin.fluxtion.runtime.callback.CallbackDispatcherImpl;
import com.telamin.fluxtion.runtime.callback.ExportFunctionAuditEvent;
import com.telamin.fluxtion.runtime.callback.InternalEventProcessor;
import com.telamin.fluxtion.runtime.context.DataFlowContext;
import com.telamin.fluxtion.runtime.event.Event;
import com.telamin.fluxtion.runtime.input.EventFeed;
import com.telamin.fluxtion.runtime.input.SubscriptionManager;
import com.telamin.fluxtion.runtime.input.SubscriptionManagerNode;
import com.telamin.fluxtion.runtime.lifecycle.BatchHandler;
import com.telamin.fluxtion.runtime.lifecycle.Lifecycle;
import com.telamin.fluxtion.runtime.node.ForkedTriggerTask;
import com.telamin.fluxtion.runtime.node.MutableDataFlowContext;
import com.telamin.fluxtion.runtime.service.ServiceListener;
import com.telamin.fluxtion.runtime.service.ServiceRegistryNode;
import com.telamin.fluxtion.runtime.time.Clock;
import com.telamin.fluxtion.runtime.time.ClockStrategy.ClockStrategyEvent;
import com.telamin.fluxtion.test.performance.validation.events.ValidationControlEvent;
import com.telamin.fluxtion.test.performance.validation.events.ValidationMarketEvent;
import com.telamin.fluxtion.test.performance.validation.events.ValidationTradeEvent;
import com.telamin.fluxtion.test.performance.validation.nodes.DataCollector;
import com.telamin.fluxtion.test.performance.validation.nodes.EventContext;
import com.telamin.fluxtion.test.performance.validation.nodes.ValidationAccumulatorNode;
import com.telamin.fluxtion.test.performance.validation.nodes.ValidationBaseNode;
import com.telamin.fluxtion.test.performance.validation.nodes.ValidationControlRootNode;
import com.telamin.fluxtion.test.performance.validation.nodes.ValidationMarketRootNode;
import com.telamin.fluxtion.test.performance.validation.nodes.ValidationSinkNode;
import com.telamin.fluxtion.test.performance.validation.nodes.ValidationTradeRootNode;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;

/**
 *
 *
 * <pre>
 * generation time           : Not available
 * api version               : unknown api version
 * analyser version          : unknown analyser version
 * target generator version  : unknown generator version
 * </pre>
 *
 * Event classes supported:
 *
 * <ul>
 *   <li>com.telamin.fluxtion.runtime.time.ClockStrategy.ClockStrategyEvent
 *   <li>com.telamin.fluxtion.test.performance.validation.events.ValidationControlEvent
 *   <li>com.telamin.fluxtion.test.performance.validation.events.ValidationMarketEvent
 *   <li>com.telamin.fluxtion.test.performance.validation.events.ValidationTradeEvent
 * </ul>
 *
 * @author Greg Higgins
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public class ValidationDiamond10Processor
    implements CloneableDataFlow<ValidationDiamond10Processor>,
        /*--- @ExportService start ---*/
        @ExportService ServiceListener,
        /*--- @ExportService end ---*/
        DataFlow,
        InternalEventProcessor,
        BatchHandler {

  //Node declarations
  private final transient CallbackDispatcherImpl callbackDispatcher = new CallbackDispatcherImpl();
  public final transient Clock clock = new Clock();
  private final transient DataCollector dataCollector_3 = new DataCollector();
  private final transient EventContext eventContext_2 = new EventContext();
  public final transient NodeNameAuditor nodeNameLookup = new NodeNameAuditor();
  private final transient SubscriptionManagerNode subscriptionManager =
      new SubscriptionManagerNode();
  private final transient MutableDataFlowContext context =
      new com.telamin.fluxtion.runtime.node.MutableDataFlowContext(
          nodeNameLookup, callbackDispatcher, subscriptionManager, callbackDispatcher);;
  public final transient ServiceRegistryNode serviceRegistry = new ServiceRegistryNode();
  private final transient ValidationControlRootNode validationControlRootNode_27 =
      new ValidationControlRootNode();
  private final transient ValidationBaseNode validationBaseNode_26 = new ValidationBaseNode();
  public final transient ValidationBaseNode control_sink = new ValidationBaseNode();
  private final transient ValidationMarketRootNode validationMarketRootNode_14 =
      new ValidationMarketRootNode();
  private final transient ValidationBaseNode validationBaseNode_13 = new ValidationBaseNode();
  private final transient ValidationBaseNode validationBaseNode_12 = new ValidationBaseNode();
  private final transient ValidationBaseNode validationBaseNode_11 = new ValidationBaseNode();
  private final transient ValidationBaseNode validationBaseNode_10 = new ValidationBaseNode();
  private final transient ValidationBaseNode validationBaseNode_9 = new ValidationBaseNode();
  private final transient ValidationBaseNode validationBaseNode_8 = new ValidationBaseNode();
  private final transient ValidationBaseNode validationBaseNode_7 = new ValidationBaseNode();
  private final transient ValidationBaseNode validationBaseNode_6 = new ValidationBaseNode();
  private final transient ValidationBaseNode validationBaseNode_5 = new ValidationBaseNode();
  private final transient ValidationBaseNode validationBaseNode_4 = new ValidationBaseNode();
  private final transient ValidationTradeRootNode validationTradeRootNode_25 =
      new ValidationTradeRootNode();
  private final transient ValidationAccumulatorNode validationAccumulatorNode_24 =
      new ValidationAccumulatorNode();
  private final transient ValidationAccumulatorNode validationAccumulatorNode_23 =
      new ValidationAccumulatorNode();
  private final transient ValidationAccumulatorNode validationAccumulatorNode_22 =
      new ValidationAccumulatorNode();
  private final transient ValidationAccumulatorNode validationAccumulatorNode_21 =
      new ValidationAccumulatorNode();
  private final transient ValidationAccumulatorNode validationAccumulatorNode_20 =
      new ValidationAccumulatorNode();
  private final transient ValidationAccumulatorNode validationAccumulatorNode_19 =
      new ValidationAccumulatorNode();
  private final transient ValidationAccumulatorNode validationAccumulatorNode_18 =
      new ValidationAccumulatorNode();
  private final transient ValidationAccumulatorNode validationAccumulatorNode_17 =
      new ValidationAccumulatorNode();
  private final transient ValidationAccumulatorNode validationAccumulatorNode_16 =
      new ValidationAccumulatorNode();
  private final transient ValidationAccumulatorNode validationAccumulatorNode_15 =
      new ValidationAccumulatorNode();
  public final transient ValidationSinkNode sink = new ValidationSinkNode();
  private final transient ExportFunctionAuditEvent functionAudit = new ExportFunctionAuditEvent();
  //Dirty flags
  private boolean initCalled = false;
  private boolean processing = false;
  private boolean buffering = false;
  private final transient IdentityHashMap<Object, BooleanSupplier> dirtyFlagSupplierMap =
      new IdentityHashMap<>(24);
  private final transient IdentityHashMap<Object, Consumer<Boolean>> dirtyFlagUpdateMap =
      new IdentityHashMap<>(24);

  private boolean isDirty_validationAccumulatorNode_15 = false;
  private boolean isDirty_validationAccumulatorNode_16 = false;
  private boolean isDirty_validationAccumulatorNode_17 = false;
  private boolean isDirty_validationAccumulatorNode_18 = false;
  private boolean isDirty_validationAccumulatorNode_19 = false;
  private boolean isDirty_validationAccumulatorNode_20 = false;
  private boolean isDirty_validationAccumulatorNode_21 = false;
  private boolean isDirty_validationAccumulatorNode_22 = false;
  private boolean isDirty_validationAccumulatorNode_23 = false;
  private boolean isDirty_validationAccumulatorNode_24 = false;
  private boolean isDirty_validationBaseNode_4 = false;
  private boolean isDirty_validationBaseNode_5 = false;
  private boolean isDirty_validationBaseNode_6 = false;
  private boolean isDirty_validationBaseNode_7 = false;
  private boolean isDirty_validationBaseNode_8 = false;
  private boolean isDirty_validationBaseNode_9 = false;
  private boolean isDirty_validationBaseNode_10 = false;
  private boolean isDirty_validationBaseNode_11 = false;
  private boolean isDirty_validationBaseNode_12 = false;
  private boolean isDirty_validationBaseNode_13 = false;
  private boolean isDirty_validationBaseNode_26 = false;
  private boolean isDirty_validationControlRootNode_27 = false;
  private boolean isDirty_validationMarketRootNode_14 = false;
  private boolean isDirty_validationTradeRootNode_25 = false;

  //Forked declarations

  //Filter constants

  //unknown event handler
  private Consumer unKnownEventHandler = (e) -> {};

  public ValidationDiamond10Processor(Map<Object, Object> contextMap) {
    if (context != null) {
      context.replaceMappings(contextMap);
    }
    context.setClock(clock);
    serviceRegistry.setDataFlowContext(context);
    validationAccumulatorNode_15.setUpstream1(validationAccumulatorNode_16);
    validationAccumulatorNode_15.setNodeId("t_10");
    validationAccumulatorNode_15.setDataCollector(dataCollector_3);
    validationAccumulatorNode_15.setEventContext(eventContext_2);
    validationAccumulatorNode_15.setUpstream2(validationTradeRootNode_25);
    validationAccumulatorNode_15.value = 0.0;
    validationAccumulatorNode_15.nodeId = "t_10";
    validationAccumulatorNode_15.eventContext = eventContext_2;
    validationAccumulatorNode_15.dataCollector = dataCollector_3;
    validationAccumulatorNode_15.upstream1 = validationAccumulatorNode_16;
    validationAccumulatorNode_15.upstream2 = validationTradeRootNode_25;
    validationAccumulatorNode_16.setUpstream1(validationAccumulatorNode_17);
    validationAccumulatorNode_16.setNodeId("t_9");
    validationAccumulatorNode_16.setDataCollector(dataCollector_3);
    validationAccumulatorNode_16.setEventContext(eventContext_2);
    validationAccumulatorNode_16.setUpstream2(validationTradeRootNode_25);
    validationAccumulatorNode_16.value = 0.0;
    validationAccumulatorNode_16.nodeId = "t_9";
    validationAccumulatorNode_16.eventContext = eventContext_2;
    validationAccumulatorNode_16.dataCollector = dataCollector_3;
    validationAccumulatorNode_16.upstream1 = validationAccumulatorNode_17;
    validationAccumulatorNode_16.upstream2 = validationTradeRootNode_25;
    validationAccumulatorNode_17.setUpstream1(validationAccumulatorNode_18);
    validationAccumulatorNode_17.setNodeId("t_8");
    validationAccumulatorNode_17.setDataCollector(dataCollector_3);
    validationAccumulatorNode_17.setEventContext(eventContext_2);
    validationAccumulatorNode_17.setUpstream2(validationTradeRootNode_25);
    validationAccumulatorNode_17.value = 0.0;
    validationAccumulatorNode_17.nodeId = "t_8";
    validationAccumulatorNode_17.eventContext = eventContext_2;
    validationAccumulatorNode_17.dataCollector = dataCollector_3;
    validationAccumulatorNode_17.upstream1 = validationAccumulatorNode_18;
    validationAccumulatorNode_17.upstream2 = validationTradeRootNode_25;
    validationAccumulatorNode_18.setUpstream1(validationAccumulatorNode_19);
    validationAccumulatorNode_18.setNodeId("t_7");
    validationAccumulatorNode_18.setDataCollector(dataCollector_3);
    validationAccumulatorNode_18.setEventContext(eventContext_2);
    validationAccumulatorNode_18.setUpstream2(validationTradeRootNode_25);
    validationAccumulatorNode_18.value = 0.0;
    validationAccumulatorNode_18.nodeId = "t_7";
    validationAccumulatorNode_18.eventContext = eventContext_2;
    validationAccumulatorNode_18.dataCollector = dataCollector_3;
    validationAccumulatorNode_18.upstream1 = validationAccumulatorNode_19;
    validationAccumulatorNode_18.upstream2 = validationTradeRootNode_25;
    validationAccumulatorNode_19.setUpstream1(validationAccumulatorNode_20);
    validationAccumulatorNode_19.setNodeId("t_6");
    validationAccumulatorNode_19.setDataCollector(dataCollector_3);
    validationAccumulatorNode_19.setEventContext(eventContext_2);
    validationAccumulatorNode_19.setUpstream2(validationTradeRootNode_25);
    validationAccumulatorNode_19.value = 0.0;
    validationAccumulatorNode_19.nodeId = "t_6";
    validationAccumulatorNode_19.eventContext = eventContext_2;
    validationAccumulatorNode_19.dataCollector = dataCollector_3;
    validationAccumulatorNode_19.upstream1 = validationAccumulatorNode_20;
    validationAccumulatorNode_19.upstream2 = validationTradeRootNode_25;
    validationAccumulatorNode_20.setUpstream1(validationAccumulatorNode_21);
    validationAccumulatorNode_20.setNodeId("t_5");
    validationAccumulatorNode_20.setDataCollector(dataCollector_3);
    validationAccumulatorNode_20.setEventContext(eventContext_2);
    validationAccumulatorNode_20.setUpstream2(validationTradeRootNode_25);
    validationAccumulatorNode_20.value = 0.0;
    validationAccumulatorNode_20.nodeId = "t_5";
    validationAccumulatorNode_20.eventContext = eventContext_2;
    validationAccumulatorNode_20.dataCollector = dataCollector_3;
    validationAccumulatorNode_20.upstream1 = validationAccumulatorNode_21;
    validationAccumulatorNode_20.upstream2 = validationTradeRootNode_25;
    validationAccumulatorNode_21.setUpstream1(validationAccumulatorNode_22);
    validationAccumulatorNode_21.setNodeId("t_4");
    validationAccumulatorNode_21.setDataCollector(dataCollector_3);
    validationAccumulatorNode_21.setEventContext(eventContext_2);
    validationAccumulatorNode_21.setUpstream2(validationTradeRootNode_25);
    validationAccumulatorNode_21.value = 0.0;
    validationAccumulatorNode_21.nodeId = "t_4";
    validationAccumulatorNode_21.eventContext = eventContext_2;
    validationAccumulatorNode_21.dataCollector = dataCollector_3;
    validationAccumulatorNode_21.upstream1 = validationAccumulatorNode_22;
    validationAccumulatorNode_21.upstream2 = validationTradeRootNode_25;
    validationAccumulatorNode_22.setUpstream1(validationAccumulatorNode_23);
    validationAccumulatorNode_22.setNodeId("t_3");
    validationAccumulatorNode_22.setDataCollector(dataCollector_3);
    validationAccumulatorNode_22.setEventContext(eventContext_2);
    validationAccumulatorNode_22.setUpstream2(validationTradeRootNode_25);
    validationAccumulatorNode_22.value = 0.0;
    validationAccumulatorNode_22.nodeId = "t_3";
    validationAccumulatorNode_22.eventContext = eventContext_2;
    validationAccumulatorNode_22.dataCollector = dataCollector_3;
    validationAccumulatorNode_22.upstream1 = validationAccumulatorNode_23;
    validationAccumulatorNode_22.upstream2 = validationTradeRootNode_25;
    validationAccumulatorNode_23.setUpstream1(validationAccumulatorNode_24);
    validationAccumulatorNode_23.setNodeId("t_2");
    validationAccumulatorNode_23.setDataCollector(dataCollector_3);
    validationAccumulatorNode_23.setEventContext(eventContext_2);
    validationAccumulatorNode_23.setUpstream2(validationTradeRootNode_25);
    validationAccumulatorNode_23.value = 0.0;
    validationAccumulatorNode_23.nodeId = "t_2";
    validationAccumulatorNode_23.eventContext = eventContext_2;
    validationAccumulatorNode_23.dataCollector = dataCollector_3;
    validationAccumulatorNode_23.upstream1 = validationAccumulatorNode_24;
    validationAccumulatorNode_23.upstream2 = validationTradeRootNode_25;
    validationAccumulatorNode_24.setUpstream1(validationTradeRootNode_25);
    validationAccumulatorNode_24.setNodeId("t_1");
    validationAccumulatorNode_24.setDataCollector(dataCollector_3);
    validationAccumulatorNode_24.setEventContext(eventContext_2);
    validationAccumulatorNode_24.setUpstream2(validationTradeRootNode_25);
    validationAccumulatorNode_24.value = 0.0;
    validationAccumulatorNode_24.nodeId = "t_1";
    validationAccumulatorNode_24.eventContext = eventContext_2;
    validationAccumulatorNode_24.dataCollector = dataCollector_3;
    validationAccumulatorNode_24.upstream1 = validationTradeRootNode_25;
    validationAccumulatorNode_24.upstream2 = validationTradeRootNode_25;
    control_sink.setUpstream1(validationBaseNode_26);
    control_sink.setNodeId("c_2");
    control_sink.setDataCollector(dataCollector_3);
    control_sink.setEventContext(eventContext_2);
    control_sink.value = 0.0;
    control_sink.nodeId = "c_2";
    control_sink.eventContext = eventContext_2;
    control_sink.dataCollector = dataCollector_3;
    control_sink.upstream1 = validationBaseNode_26;
    validationBaseNode_4.setUpstream1(validationBaseNode_5);
    validationBaseNode_4.setNodeId("m_10");
    validationBaseNode_4.setDataCollector(dataCollector_3);
    validationBaseNode_4.setEventContext(eventContext_2);
    validationBaseNode_4.setUpstream2(validationMarketRootNode_14);
    validationBaseNode_4.value = 0.0;
    validationBaseNode_4.nodeId = "m_10";
    validationBaseNode_4.eventContext = eventContext_2;
    validationBaseNode_4.dataCollector = dataCollector_3;
    validationBaseNode_4.upstream1 = validationBaseNode_5;
    validationBaseNode_4.upstream2 = validationMarketRootNode_14;
    validationBaseNode_5.setUpstream1(validationBaseNode_6);
    validationBaseNode_5.setNodeId("m_9");
    validationBaseNode_5.setDataCollector(dataCollector_3);
    validationBaseNode_5.setEventContext(eventContext_2);
    validationBaseNode_5.setUpstream2(validationMarketRootNode_14);
    validationBaseNode_5.value = 0.0;
    validationBaseNode_5.nodeId = "m_9";
    validationBaseNode_5.eventContext = eventContext_2;
    validationBaseNode_5.dataCollector = dataCollector_3;
    validationBaseNode_5.upstream1 = validationBaseNode_6;
    validationBaseNode_5.upstream2 = validationMarketRootNode_14;
    validationBaseNode_6.setUpstream1(validationBaseNode_7);
    validationBaseNode_6.setNodeId("m_8");
    validationBaseNode_6.setDataCollector(dataCollector_3);
    validationBaseNode_6.setEventContext(eventContext_2);
    validationBaseNode_6.setUpstream2(validationMarketRootNode_14);
    validationBaseNode_6.value = 0.0;
    validationBaseNode_6.nodeId = "m_8";
    validationBaseNode_6.eventContext = eventContext_2;
    validationBaseNode_6.dataCollector = dataCollector_3;
    validationBaseNode_6.upstream1 = validationBaseNode_7;
    validationBaseNode_6.upstream2 = validationMarketRootNode_14;
    validationBaseNode_7.setUpstream1(validationBaseNode_8);
    validationBaseNode_7.setNodeId("m_7");
    validationBaseNode_7.setDataCollector(dataCollector_3);
    validationBaseNode_7.setEventContext(eventContext_2);
    validationBaseNode_7.setUpstream2(validationMarketRootNode_14);
    validationBaseNode_7.value = 0.0;
    validationBaseNode_7.nodeId = "m_7";
    validationBaseNode_7.eventContext = eventContext_2;
    validationBaseNode_7.dataCollector = dataCollector_3;
    validationBaseNode_7.upstream1 = validationBaseNode_8;
    validationBaseNode_7.upstream2 = validationMarketRootNode_14;
    validationBaseNode_8.setUpstream1(validationBaseNode_9);
    validationBaseNode_8.setNodeId("m_6");
    validationBaseNode_8.setDataCollector(dataCollector_3);
    validationBaseNode_8.setEventContext(eventContext_2);
    validationBaseNode_8.setUpstream2(validationMarketRootNode_14);
    validationBaseNode_8.value = 0.0;
    validationBaseNode_8.nodeId = "m_6";
    validationBaseNode_8.eventContext = eventContext_2;
    validationBaseNode_8.dataCollector = dataCollector_3;
    validationBaseNode_8.upstream1 = validationBaseNode_9;
    validationBaseNode_8.upstream2 = validationMarketRootNode_14;
    validationBaseNode_9.setUpstream1(validationBaseNode_10);
    validationBaseNode_9.setNodeId("m_5");
    validationBaseNode_9.setDataCollector(dataCollector_3);
    validationBaseNode_9.setEventContext(eventContext_2);
    validationBaseNode_9.setUpstream2(validationMarketRootNode_14);
    validationBaseNode_9.value = 0.0;
    validationBaseNode_9.nodeId = "m_5";
    validationBaseNode_9.eventContext = eventContext_2;
    validationBaseNode_9.dataCollector = dataCollector_3;
    validationBaseNode_9.upstream1 = validationBaseNode_10;
    validationBaseNode_9.upstream2 = validationMarketRootNode_14;
    validationBaseNode_10.setUpstream1(validationBaseNode_11);
    validationBaseNode_10.setNodeId("m_4");
    validationBaseNode_10.setDataCollector(dataCollector_3);
    validationBaseNode_10.setEventContext(eventContext_2);
    validationBaseNode_10.setUpstream2(validationMarketRootNode_14);
    validationBaseNode_10.value = 0.0;
    validationBaseNode_10.nodeId = "m_4";
    validationBaseNode_10.eventContext = eventContext_2;
    validationBaseNode_10.dataCollector = dataCollector_3;
    validationBaseNode_10.upstream1 = validationBaseNode_11;
    validationBaseNode_10.upstream2 = validationMarketRootNode_14;
    validationBaseNode_11.setUpstream1(validationBaseNode_12);
    validationBaseNode_11.setNodeId("m_3");
    validationBaseNode_11.setDataCollector(dataCollector_3);
    validationBaseNode_11.setEventContext(eventContext_2);
    validationBaseNode_11.setUpstream2(validationMarketRootNode_14);
    validationBaseNode_11.value = 0.0;
    validationBaseNode_11.nodeId = "m_3";
    validationBaseNode_11.eventContext = eventContext_2;
    validationBaseNode_11.dataCollector = dataCollector_3;
    validationBaseNode_11.upstream1 = validationBaseNode_12;
    validationBaseNode_11.upstream2 = validationMarketRootNode_14;
    validationBaseNode_12.setUpstream1(validationBaseNode_13);
    validationBaseNode_12.setNodeId("m_2");
    validationBaseNode_12.setDataCollector(dataCollector_3);
    validationBaseNode_12.setEventContext(eventContext_2);
    validationBaseNode_12.setUpstream2(validationMarketRootNode_14);
    validationBaseNode_12.value = 0.0;
    validationBaseNode_12.nodeId = "m_2";
    validationBaseNode_12.eventContext = eventContext_2;
    validationBaseNode_12.dataCollector = dataCollector_3;
    validationBaseNode_12.upstream1 = validationBaseNode_13;
    validationBaseNode_12.upstream2 = validationMarketRootNode_14;
    validationBaseNode_13.setUpstream1(validationMarketRootNode_14);
    validationBaseNode_13.setNodeId("m_1");
    validationBaseNode_13.setDataCollector(dataCollector_3);
    validationBaseNode_13.setEventContext(eventContext_2);
    validationBaseNode_13.setUpstream2(validationMarketRootNode_14);
    validationBaseNode_13.value = 0.0;
    validationBaseNode_13.nodeId = "m_1";
    validationBaseNode_13.eventContext = eventContext_2;
    validationBaseNode_13.dataCollector = dataCollector_3;
    validationBaseNode_13.upstream1 = validationMarketRootNode_14;
    validationBaseNode_13.upstream2 = validationMarketRootNode_14;
    validationBaseNode_26.setUpstream1(validationControlRootNode_27);
    validationBaseNode_26.setNodeId("c_1");
    validationBaseNode_26.setDataCollector(dataCollector_3);
    validationBaseNode_26.setEventContext(eventContext_2);
    validationBaseNode_26.value = 0.0;
    validationBaseNode_26.nodeId = "c_1";
    validationBaseNode_26.eventContext = eventContext_2;
    validationBaseNode_26.dataCollector = dataCollector_3;
    validationBaseNode_26.upstream1 = validationControlRootNode_27;
    validationControlRootNode_27.setNodeId("controlRoot");
    validationControlRootNode_27.setDataCollector(dataCollector_3);
    validationControlRootNode_27.setEventContext(eventContext_2);
    validationControlRootNode_27.value = 0.0;
    validationControlRootNode_27.nodeId = "controlRoot";
    validationControlRootNode_27.eventContext = eventContext_2;
    validationControlRootNode_27.dataCollector = dataCollector_3;
    validationMarketRootNode_14.setNodeId("marketRoot");
    validationMarketRootNode_14.setDataCollector(dataCollector_3);
    validationMarketRootNode_14.setEventContext(eventContext_2);
    validationMarketRootNode_14.value = 0.0;
    validationMarketRootNode_14.nodeId = "marketRoot";
    validationMarketRootNode_14.eventContext = eventContext_2;
    validationMarketRootNode_14.dataCollector = dataCollector_3;
    sink.setUpstream1(validationBaseNode_4);
    sink.setNodeId("sink");
    sink.setDataCollector(dataCollector_3);
    sink.setEventContext(eventContext_2);
    sink.setUpstream2(validationAccumulatorNode_15);
    sink.value = 0.0;
    sink.nodeId = "sink";
    sink.eventContext = eventContext_2;
    sink.dataCollector = dataCollector_3;
    sink.upstream1 = validationBaseNode_4;
    sink.upstream2 = validationAccumulatorNode_15;
    validationTradeRootNode_25.setNodeId("tradeRoot");
    validationTradeRootNode_25.setDataCollector(dataCollector_3);
    validationTradeRootNode_25.setEventContext(eventContext_2);
    validationTradeRootNode_25.value = 0.0;
    validationTradeRootNode_25.nodeId = "tradeRoot";
    validationTradeRootNode_25.eventContext = eventContext_2;
    validationTradeRootNode_25.dataCollector = dataCollector_3;
    //node auditors
    initialiseAuditor(clock);
    initialiseAuditor(nodeNameLookup);
    initialiseAuditor(serviceRegistry);
    if (subscriptionManager != null) {
      subscriptionManager.setSubscribingEventProcessor(this);
    }
    if (context != null) {
      context.setEventProcessorCallback(this);
    }
  }

  public ValidationDiamond10Processor() {
    this(null);
  }

  @Override
  public void init() {
    initCalled = true;
    auditEvent(Lifecycle.LifecycleEvent.Init);
    //initialise dirty lookup map
    isDirty("test");
    clock.init();
    dataCollector_3.onInit();
    eventContext_2.onInit();
    afterEvent();
  }

  @Override
  public void start() {
    if (!initCalled) {
      throw new RuntimeException("init() must be called before start()");
    }
    processing = true;
    auditEvent(Lifecycle.LifecycleEvent.Start);

    afterEvent();
    callbackDispatcher.dispatchQueuedCallbacks();
    processing = false;
  }

  @Override
  public void startComplete() {
    if (!initCalled) {
      throw new RuntimeException("init() must be called before startComplete()");
    }
    processing = true;
    auditEvent(Lifecycle.LifecycleEvent.StartComplete);

    afterEvent();
    callbackDispatcher.dispatchQueuedCallbacks();
    processing = false;
  }

  @Override
  public void stop() {
    if (!initCalled) {
      throw new RuntimeException("init() must be called before stop()");
    }
    processing = true;
    auditEvent(Lifecycle.LifecycleEvent.Stop);

    afterEvent();
    callbackDispatcher.dispatchQueuedCallbacks();
    processing = false;
  }

  @Override
  public void tearDown() {
    initCalled = false;
    auditEvent(Lifecycle.LifecycleEvent.TearDown);
    serviceRegistry.tearDown();
    nodeNameLookup.tearDown();
    clock.tearDown();
    subscriptionManager.tearDown();
    afterEvent();
  }

  @Override
  public void setContextParameterMap(Map<Object, Object> newContextMapping) {
    context.replaceMappings(newContextMapping);
  }

  @Override
  public void addContextParameter(Object key, Object value) {
    context.addMapping(key, value);
  }

  //EVENT DISPATCH - START
  @Override
  @OnEventHandler(failBuildIfMissingBooleanReturn = false)
  public void onEvent(Object event) {
    if (buffering) {
      triggerCalculation();
    }
    if (processing) {
      callbackDispatcher.queueReentrantEvent(event);
    } else {
      processing = true;
      onEventInternal(event);
      callbackDispatcher.dispatchQueuedCallbacks();
      processing = false;
    }
  }

  @Override
  public void onEventInternal(Object event) {
    if (event instanceof ClockStrategyEvent) {
      ClockStrategyEvent typedEvent = (ClockStrategyEvent) event;
      handleEvent(typedEvent);
    } else if (event instanceof ValidationControlEvent) {
      ValidationControlEvent typedEvent = (ValidationControlEvent) event;
      handleEvent(typedEvent);
    } else if (event instanceof ValidationMarketEvent) {
      ValidationMarketEvent typedEvent = (ValidationMarketEvent) event;
      handleEvent(typedEvent);
    } else if (event instanceof ValidationTradeEvent) {
      ValidationTradeEvent typedEvent = (ValidationTradeEvent) event;
      handleEvent(typedEvent);
    } else {
      unKnownEventHandler(event);
    }
  }

  public void handleEvent(ClockStrategyEvent typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    clock.setClockStrategy(typedEvent);
    afterEvent();
  }

  public void handleEvent(ValidationControlEvent typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    isDirty_validationControlRootNode_27 = validationControlRootNode_27.onControlEvent(typedEvent);
    if (guardCheck_validationBaseNode_26()) {
      isDirty_validationBaseNode_26 = validationBaseNode_26.onUpstream();
    }
    if (guardCheck_control_sink()) {
      control_sink.onUpstream();
    }
    afterEvent();
  }

  public void handleEvent(ValidationMarketEvent typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    isDirty_validationMarketRootNode_14 = validationMarketRootNode_14.onMarketEvent(typedEvent);
    if (guardCheck_validationBaseNode_13()) {
      isDirty_validationBaseNode_13 = validationBaseNode_13.onUpstream();
    }
    if (guardCheck_validationBaseNode_12()) {
      isDirty_validationBaseNode_12 = validationBaseNode_12.onUpstream();
    }
    if (guardCheck_validationBaseNode_11()) {
      isDirty_validationBaseNode_11 = validationBaseNode_11.onUpstream();
    }
    if (guardCheck_validationBaseNode_10()) {
      isDirty_validationBaseNode_10 = validationBaseNode_10.onUpstream();
    }
    if (guardCheck_validationBaseNode_9()) {
      isDirty_validationBaseNode_9 = validationBaseNode_9.onUpstream();
    }
    if (guardCheck_validationBaseNode_8()) {
      isDirty_validationBaseNode_8 = validationBaseNode_8.onUpstream();
    }
    if (guardCheck_validationBaseNode_7()) {
      isDirty_validationBaseNode_7 = validationBaseNode_7.onUpstream();
    }
    if (guardCheck_validationBaseNode_6()) {
      isDirty_validationBaseNode_6 = validationBaseNode_6.onUpstream();
    }
    if (guardCheck_validationBaseNode_5()) {
      isDirty_validationBaseNode_5 = validationBaseNode_5.onUpstream();
    }
    if (guardCheck_validationBaseNode_4()) {
      isDirty_validationBaseNode_4 = validationBaseNode_4.onUpstream();
    }
    if (guardCheck_sink()) {
      sink.onUpstream();
    }
    afterEvent();
  }

  public void handleEvent(ValidationTradeEvent typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    isDirty_validationTradeRootNode_25 = validationTradeRootNode_25.onTradeEvent(typedEvent);
    if (guardCheck_validationAccumulatorNode_24()) {
      isDirty_validationAccumulatorNode_24 = validationAccumulatorNode_24.onUpstream();
    }
    if (guardCheck_validationAccumulatorNode_23()) {
      isDirty_validationAccumulatorNode_23 = validationAccumulatorNode_23.onUpstream();
    }
    if (guardCheck_validationAccumulatorNode_22()) {
      isDirty_validationAccumulatorNode_22 = validationAccumulatorNode_22.onUpstream();
    }
    if (guardCheck_validationAccumulatorNode_21()) {
      isDirty_validationAccumulatorNode_21 = validationAccumulatorNode_21.onUpstream();
    }
    if (guardCheck_validationAccumulatorNode_20()) {
      isDirty_validationAccumulatorNode_20 = validationAccumulatorNode_20.onUpstream();
    }
    if (guardCheck_validationAccumulatorNode_19()) {
      isDirty_validationAccumulatorNode_19 = validationAccumulatorNode_19.onUpstream();
    }
    if (guardCheck_validationAccumulatorNode_18()) {
      isDirty_validationAccumulatorNode_18 = validationAccumulatorNode_18.onUpstream();
    }
    if (guardCheck_validationAccumulatorNode_17()) {
      isDirty_validationAccumulatorNode_17 = validationAccumulatorNode_17.onUpstream();
    }
    if (guardCheck_validationAccumulatorNode_16()) {
      isDirty_validationAccumulatorNode_16 = validationAccumulatorNode_16.onUpstream();
    }
    if (guardCheck_validationAccumulatorNode_15()) {
      isDirty_validationAccumulatorNode_15 = validationAccumulatorNode_15.onUpstream();
    }
    if (guardCheck_sink()) {
      sink.onUpstream();
    }
    afterEvent();
  }
  //EVENT DISPATCH - END

  //EXPORTED SERVICE FUNCTIONS - START
  @Override
  public void deRegisterService(com.telamin.fluxtion.runtime.service.Service<?> arg0) {
    beforeServiceCall(
        "@Override\npublic void deRegisterService(com.telamin.fluxtion.runtime.service.Service<?> arg0)");
    ExportFunctionAuditEvent typedEvent = functionAudit;
    serviceRegistry.deRegisterService(arg0);
    afterServiceCall();
  }

  @Override
  public void registerService(com.telamin.fluxtion.runtime.service.Service<?> arg0) {
    beforeServiceCall(
        "@Override\npublic void registerService(com.telamin.fluxtion.runtime.service.Service<?> arg0)");
    ExportFunctionAuditEvent typedEvent = functionAudit;
    serviceRegistry.registerService(arg0);
    afterServiceCall();
  }
  //EXPORTED SERVICE FUNCTIONS - END

  //EVENT BUFFERING - START
  public void bufferEvent(Object event) {
    buffering = true;
    if (event instanceof ClockStrategyEvent) {
      ClockStrategyEvent typedEvent = (ClockStrategyEvent) event;
      auditEvent(typedEvent);
      clock.setClockStrategy(typedEvent);
    } else if (event instanceof ValidationControlEvent) {
      ValidationControlEvent typedEvent = (ValidationControlEvent) event;
      auditEvent(typedEvent);
      isDirty_validationControlRootNode_27 =
          validationControlRootNode_27.onControlEvent(typedEvent);
    } else if (event instanceof ValidationMarketEvent) {
      ValidationMarketEvent typedEvent = (ValidationMarketEvent) event;
      auditEvent(typedEvent);
      isDirty_validationMarketRootNode_14 = validationMarketRootNode_14.onMarketEvent(typedEvent);
    } else if (event instanceof ValidationTradeEvent) {
      ValidationTradeEvent typedEvent = (ValidationTradeEvent) event;
      auditEvent(typedEvent);
      isDirty_validationTradeRootNode_25 = validationTradeRootNode_25.onTradeEvent(typedEvent);
    }
  }

  public void triggerCalculation() {
    buffering = false;
    String typedEvent = "No event information - buffered dispatch";
    if (guardCheck_validationBaseNode_26()) {
      isDirty_validationBaseNode_26 = validationBaseNode_26.onUpstream();
    }
    if (guardCheck_control_sink()) {
      control_sink.onUpstream();
    }
    if (guardCheck_validationBaseNode_13()) {
      isDirty_validationBaseNode_13 = validationBaseNode_13.onUpstream();
    }
    if (guardCheck_validationBaseNode_12()) {
      isDirty_validationBaseNode_12 = validationBaseNode_12.onUpstream();
    }
    if (guardCheck_validationBaseNode_11()) {
      isDirty_validationBaseNode_11 = validationBaseNode_11.onUpstream();
    }
    if (guardCheck_validationBaseNode_10()) {
      isDirty_validationBaseNode_10 = validationBaseNode_10.onUpstream();
    }
    if (guardCheck_validationBaseNode_9()) {
      isDirty_validationBaseNode_9 = validationBaseNode_9.onUpstream();
    }
    if (guardCheck_validationBaseNode_8()) {
      isDirty_validationBaseNode_8 = validationBaseNode_8.onUpstream();
    }
    if (guardCheck_validationBaseNode_7()) {
      isDirty_validationBaseNode_7 = validationBaseNode_7.onUpstream();
    }
    if (guardCheck_validationBaseNode_6()) {
      isDirty_validationBaseNode_6 = validationBaseNode_6.onUpstream();
    }
    if (guardCheck_validationBaseNode_5()) {
      isDirty_validationBaseNode_5 = validationBaseNode_5.onUpstream();
    }
    if (guardCheck_validationBaseNode_4()) {
      isDirty_validationBaseNode_4 = validationBaseNode_4.onUpstream();
    }
    if (guardCheck_validationAccumulatorNode_24()) {
      isDirty_validationAccumulatorNode_24 = validationAccumulatorNode_24.onUpstream();
    }
    if (guardCheck_validationAccumulatorNode_23()) {
      isDirty_validationAccumulatorNode_23 = validationAccumulatorNode_23.onUpstream();
    }
    if (guardCheck_validationAccumulatorNode_22()) {
      isDirty_validationAccumulatorNode_22 = validationAccumulatorNode_22.onUpstream();
    }
    if (guardCheck_validationAccumulatorNode_21()) {
      isDirty_validationAccumulatorNode_21 = validationAccumulatorNode_21.onUpstream();
    }
    if (guardCheck_validationAccumulatorNode_20()) {
      isDirty_validationAccumulatorNode_20 = validationAccumulatorNode_20.onUpstream();
    }
    if (guardCheck_validationAccumulatorNode_19()) {
      isDirty_validationAccumulatorNode_19 = validationAccumulatorNode_19.onUpstream();
    }
    if (guardCheck_validationAccumulatorNode_18()) {
      isDirty_validationAccumulatorNode_18 = validationAccumulatorNode_18.onUpstream();
    }
    if (guardCheck_validationAccumulatorNode_17()) {
      isDirty_validationAccumulatorNode_17 = validationAccumulatorNode_17.onUpstream();
    }
    if (guardCheck_validationAccumulatorNode_16()) {
      isDirty_validationAccumulatorNode_16 = validationAccumulatorNode_16.onUpstream();
    }
    if (guardCheck_validationAccumulatorNode_15()) {
      isDirty_validationAccumulatorNode_15 = validationAccumulatorNode_15.onUpstream();
    }
    if (guardCheck_sink()) {
      sink.onUpstream();
    }
    afterEvent();
  }
  //EVENT BUFFERING - END

  private void auditEvent(Object typedEvent) {
    clock.eventReceived(typedEvent);
    nodeNameLookup.eventReceived(typedEvent);
    serviceRegistry.eventReceived(typedEvent);
  }

  private void auditEvent(Event typedEvent) {
    clock.eventReceived(typedEvent);
    nodeNameLookup.eventReceived(typedEvent);
    serviceRegistry.eventReceived(typedEvent);
  }

  private void initialiseAuditor(Auditor auditor) {
    auditor.init();
    auditor.nodeRegistered(callbackDispatcher, "callbackDispatcher");
    auditor.nodeRegistered(subscriptionManager, "subscriptionManager");
    auditor.nodeRegistered(context, "context");
    auditor.nodeRegistered(dataCollector_3, "dataCollector_3");
    auditor.nodeRegistered(eventContext_2, "eventContext_2");
    auditor.nodeRegistered(validationAccumulatorNode_15, "validationAccumulatorNode_15");
    auditor.nodeRegistered(validationAccumulatorNode_16, "validationAccumulatorNode_16");
    auditor.nodeRegistered(validationAccumulatorNode_17, "validationAccumulatorNode_17");
    auditor.nodeRegistered(validationAccumulatorNode_18, "validationAccumulatorNode_18");
    auditor.nodeRegistered(validationAccumulatorNode_19, "validationAccumulatorNode_19");
    auditor.nodeRegistered(validationAccumulatorNode_20, "validationAccumulatorNode_20");
    auditor.nodeRegistered(validationAccumulatorNode_21, "validationAccumulatorNode_21");
    auditor.nodeRegistered(validationAccumulatorNode_22, "validationAccumulatorNode_22");
    auditor.nodeRegistered(validationAccumulatorNode_23, "validationAccumulatorNode_23");
    auditor.nodeRegistered(validationAccumulatorNode_24, "validationAccumulatorNode_24");
    auditor.nodeRegistered(control_sink, "control_sink");
    auditor.nodeRegistered(validationBaseNode_4, "validationBaseNode_4");
    auditor.nodeRegistered(validationBaseNode_5, "validationBaseNode_5");
    auditor.nodeRegistered(validationBaseNode_6, "validationBaseNode_6");
    auditor.nodeRegistered(validationBaseNode_7, "validationBaseNode_7");
    auditor.nodeRegistered(validationBaseNode_8, "validationBaseNode_8");
    auditor.nodeRegistered(validationBaseNode_9, "validationBaseNode_9");
    auditor.nodeRegistered(validationBaseNode_10, "validationBaseNode_10");
    auditor.nodeRegistered(validationBaseNode_11, "validationBaseNode_11");
    auditor.nodeRegistered(validationBaseNode_12, "validationBaseNode_12");
    auditor.nodeRegistered(validationBaseNode_13, "validationBaseNode_13");
    auditor.nodeRegistered(validationBaseNode_26, "validationBaseNode_26");
    auditor.nodeRegistered(validationControlRootNode_27, "validationControlRootNode_27");
    auditor.nodeRegistered(validationMarketRootNode_14, "validationMarketRootNode_14");
    auditor.nodeRegistered(sink, "sink");
    auditor.nodeRegistered(validationTradeRootNode_25, "validationTradeRootNode_25");
  }

  private void beforeServiceCall(String functionDescription) {
    functionAudit.setFunctionDescription(functionDescription);
    auditEvent(functionAudit);
    if (buffering) {
      triggerCalculation();
    }
    processing = true;
  }

  private void afterServiceCall() {
    afterEvent();
    callbackDispatcher.dispatchQueuedCallbacks();
    processing = false;
  }

  private void afterEvent() {
    clock.processingComplete();
    nodeNameLookup.processingComplete();
    serviceRegistry.processingComplete();
    isDirty_validationAccumulatorNode_15 = false;
    isDirty_validationAccumulatorNode_16 = false;
    isDirty_validationAccumulatorNode_17 = false;
    isDirty_validationAccumulatorNode_18 = false;
    isDirty_validationAccumulatorNode_19 = false;
    isDirty_validationAccumulatorNode_20 = false;
    isDirty_validationAccumulatorNode_21 = false;
    isDirty_validationAccumulatorNode_22 = false;
    isDirty_validationAccumulatorNode_23 = false;
    isDirty_validationAccumulatorNode_24 = false;
    isDirty_validationBaseNode_4 = false;
    isDirty_validationBaseNode_5 = false;
    isDirty_validationBaseNode_6 = false;
    isDirty_validationBaseNode_7 = false;
    isDirty_validationBaseNode_8 = false;
    isDirty_validationBaseNode_9 = false;
    isDirty_validationBaseNode_10 = false;
    isDirty_validationBaseNode_11 = false;
    isDirty_validationBaseNode_12 = false;
    isDirty_validationBaseNode_13 = false;
    isDirty_validationBaseNode_26 = false;
    isDirty_validationControlRootNode_27 = false;
    isDirty_validationMarketRootNode_14 = false;
    isDirty_validationTradeRootNode_25 = false;
  }

  @Override
  public void batchPause() {
    auditEvent(Lifecycle.LifecycleEvent.BatchPause);
    processing = true;

    afterEvent();
    callbackDispatcher.dispatchQueuedCallbacks();
    processing = false;
  }

  @Override
  public void batchEnd() {
    auditEvent(Lifecycle.LifecycleEvent.BatchEnd);
    processing = true;

    afterEvent();
    callbackDispatcher.dispatchQueuedCallbacks();
    processing = false;
  }

  @Override
  public boolean isDirty(Object node) {
    return dirtySupplier(node).getAsBoolean();
  }

  @Override
  public BooleanSupplier dirtySupplier(Object node) {
    if (dirtyFlagSupplierMap.isEmpty()) {
      dirtyFlagSupplierMap.put(
          validationAccumulatorNode_15, () -> isDirty_validationAccumulatorNode_15);
      dirtyFlagSupplierMap.put(
          validationAccumulatorNode_16, () -> isDirty_validationAccumulatorNode_16);
      dirtyFlagSupplierMap.put(
          validationAccumulatorNode_17, () -> isDirty_validationAccumulatorNode_17);
      dirtyFlagSupplierMap.put(
          validationAccumulatorNode_18, () -> isDirty_validationAccumulatorNode_18);
      dirtyFlagSupplierMap.put(
          validationAccumulatorNode_19, () -> isDirty_validationAccumulatorNode_19);
      dirtyFlagSupplierMap.put(
          validationAccumulatorNode_20, () -> isDirty_validationAccumulatorNode_20);
      dirtyFlagSupplierMap.put(
          validationAccumulatorNode_21, () -> isDirty_validationAccumulatorNode_21);
      dirtyFlagSupplierMap.put(
          validationAccumulatorNode_22, () -> isDirty_validationAccumulatorNode_22);
      dirtyFlagSupplierMap.put(
          validationAccumulatorNode_23, () -> isDirty_validationAccumulatorNode_23);
      dirtyFlagSupplierMap.put(
          validationAccumulatorNode_24, () -> isDirty_validationAccumulatorNode_24);
      dirtyFlagSupplierMap.put(validationBaseNode_10, () -> isDirty_validationBaseNode_10);
      dirtyFlagSupplierMap.put(validationBaseNode_11, () -> isDirty_validationBaseNode_11);
      dirtyFlagSupplierMap.put(validationBaseNode_12, () -> isDirty_validationBaseNode_12);
      dirtyFlagSupplierMap.put(validationBaseNode_13, () -> isDirty_validationBaseNode_13);
      dirtyFlagSupplierMap.put(validationBaseNode_26, () -> isDirty_validationBaseNode_26);
      dirtyFlagSupplierMap.put(validationBaseNode_4, () -> isDirty_validationBaseNode_4);
      dirtyFlagSupplierMap.put(validationBaseNode_5, () -> isDirty_validationBaseNode_5);
      dirtyFlagSupplierMap.put(validationBaseNode_6, () -> isDirty_validationBaseNode_6);
      dirtyFlagSupplierMap.put(validationBaseNode_7, () -> isDirty_validationBaseNode_7);
      dirtyFlagSupplierMap.put(validationBaseNode_8, () -> isDirty_validationBaseNode_8);
      dirtyFlagSupplierMap.put(validationBaseNode_9, () -> isDirty_validationBaseNode_9);
      dirtyFlagSupplierMap.put(
          validationControlRootNode_27, () -> isDirty_validationControlRootNode_27);
      dirtyFlagSupplierMap.put(
          validationMarketRootNode_14, () -> isDirty_validationMarketRootNode_14);
      dirtyFlagSupplierMap.put(
          validationTradeRootNode_25, () -> isDirty_validationTradeRootNode_25);
    }
    return dirtyFlagSupplierMap.getOrDefault(node, DataFlow.ALWAYS_FALSE);
  }

  @Override
  public void setDirty(Object node, boolean dirtyFlag) {
    if (dirtyFlagUpdateMap.isEmpty()) {
      dirtyFlagUpdateMap.put(
          validationAccumulatorNode_15, (b) -> isDirty_validationAccumulatorNode_15 = b);
      dirtyFlagUpdateMap.put(
          validationAccumulatorNode_16, (b) -> isDirty_validationAccumulatorNode_16 = b);
      dirtyFlagUpdateMap.put(
          validationAccumulatorNode_17, (b) -> isDirty_validationAccumulatorNode_17 = b);
      dirtyFlagUpdateMap.put(
          validationAccumulatorNode_18, (b) -> isDirty_validationAccumulatorNode_18 = b);
      dirtyFlagUpdateMap.put(
          validationAccumulatorNode_19, (b) -> isDirty_validationAccumulatorNode_19 = b);
      dirtyFlagUpdateMap.put(
          validationAccumulatorNode_20, (b) -> isDirty_validationAccumulatorNode_20 = b);
      dirtyFlagUpdateMap.put(
          validationAccumulatorNode_21, (b) -> isDirty_validationAccumulatorNode_21 = b);
      dirtyFlagUpdateMap.put(
          validationAccumulatorNode_22, (b) -> isDirty_validationAccumulatorNode_22 = b);
      dirtyFlagUpdateMap.put(
          validationAccumulatorNode_23, (b) -> isDirty_validationAccumulatorNode_23 = b);
      dirtyFlagUpdateMap.put(
          validationAccumulatorNode_24, (b) -> isDirty_validationAccumulatorNode_24 = b);
      dirtyFlagUpdateMap.put(validationBaseNode_10, (b) -> isDirty_validationBaseNode_10 = b);
      dirtyFlagUpdateMap.put(validationBaseNode_11, (b) -> isDirty_validationBaseNode_11 = b);
      dirtyFlagUpdateMap.put(validationBaseNode_12, (b) -> isDirty_validationBaseNode_12 = b);
      dirtyFlagUpdateMap.put(validationBaseNode_13, (b) -> isDirty_validationBaseNode_13 = b);
      dirtyFlagUpdateMap.put(validationBaseNode_26, (b) -> isDirty_validationBaseNode_26 = b);
      dirtyFlagUpdateMap.put(validationBaseNode_4, (b) -> isDirty_validationBaseNode_4 = b);
      dirtyFlagUpdateMap.put(validationBaseNode_5, (b) -> isDirty_validationBaseNode_5 = b);
      dirtyFlagUpdateMap.put(validationBaseNode_6, (b) -> isDirty_validationBaseNode_6 = b);
      dirtyFlagUpdateMap.put(validationBaseNode_7, (b) -> isDirty_validationBaseNode_7 = b);
      dirtyFlagUpdateMap.put(validationBaseNode_8, (b) -> isDirty_validationBaseNode_8 = b);
      dirtyFlagUpdateMap.put(validationBaseNode_9, (b) -> isDirty_validationBaseNode_9 = b);
      dirtyFlagUpdateMap.put(
          validationControlRootNode_27, (b) -> isDirty_validationControlRootNode_27 = b);
      dirtyFlagUpdateMap.put(
          validationMarketRootNode_14, (b) -> isDirty_validationMarketRootNode_14 = b);
      dirtyFlagUpdateMap.put(
          validationTradeRootNode_25, (b) -> isDirty_validationTradeRootNode_25 = b);
    }
    dirtyFlagUpdateMap.get(node).accept(dirtyFlag);
  }

  private boolean guardCheck_validationAccumulatorNode_15() {
    return isDirty_validationAccumulatorNode_16 | isDirty_validationTradeRootNode_25;
  }

  private boolean guardCheck_validationAccumulatorNode_16() {
    return isDirty_validationAccumulatorNode_17 | isDirty_validationTradeRootNode_25;
  }

  private boolean guardCheck_validationAccumulatorNode_17() {
    return isDirty_validationAccumulatorNode_18 | isDirty_validationTradeRootNode_25;
  }

  private boolean guardCheck_validationAccumulatorNode_18() {
    return isDirty_validationAccumulatorNode_19 | isDirty_validationTradeRootNode_25;
  }

  private boolean guardCheck_validationAccumulatorNode_19() {
    return isDirty_validationAccumulatorNode_20 | isDirty_validationTradeRootNode_25;
  }

  private boolean guardCheck_validationAccumulatorNode_20() {
    return isDirty_validationAccumulatorNode_21 | isDirty_validationTradeRootNode_25;
  }

  private boolean guardCheck_validationAccumulatorNode_21() {
    return isDirty_validationAccumulatorNode_22 | isDirty_validationTradeRootNode_25;
  }

  private boolean guardCheck_validationAccumulatorNode_22() {
    return isDirty_validationAccumulatorNode_23 | isDirty_validationTradeRootNode_25;
  }

  private boolean guardCheck_validationAccumulatorNode_23() {
    return isDirty_validationAccumulatorNode_24 | isDirty_validationTradeRootNode_25;
  }

  private boolean guardCheck_validationAccumulatorNode_24() {
    return isDirty_validationTradeRootNode_25;
  }

  private boolean guardCheck_control_sink() {
    return isDirty_validationBaseNode_26;
  }

  private boolean guardCheck_validationBaseNode_4() {
    return isDirty_validationBaseNode_5 | isDirty_validationMarketRootNode_14;
  }

  private boolean guardCheck_validationBaseNode_5() {
    return isDirty_validationBaseNode_6 | isDirty_validationMarketRootNode_14;
  }

  private boolean guardCheck_validationBaseNode_6() {
    return isDirty_validationBaseNode_7 | isDirty_validationMarketRootNode_14;
  }

  private boolean guardCheck_validationBaseNode_7() {
    return isDirty_validationBaseNode_8 | isDirty_validationMarketRootNode_14;
  }

  private boolean guardCheck_validationBaseNode_8() {
    return isDirty_validationBaseNode_9 | isDirty_validationMarketRootNode_14;
  }

  private boolean guardCheck_validationBaseNode_9() {
    return isDirty_validationBaseNode_10 | isDirty_validationMarketRootNode_14;
  }

  private boolean guardCheck_validationBaseNode_10() {
    return isDirty_validationBaseNode_11 | isDirty_validationMarketRootNode_14;
  }

  private boolean guardCheck_validationBaseNode_11() {
    return isDirty_validationBaseNode_12 | isDirty_validationMarketRootNode_14;
  }

  private boolean guardCheck_validationBaseNode_12() {
    return isDirty_validationBaseNode_13 | isDirty_validationMarketRootNode_14;
  }

  private boolean guardCheck_validationBaseNode_13() {
    return isDirty_validationMarketRootNode_14;
  }

  private boolean guardCheck_validationBaseNode_26() {
    return isDirty_validationControlRootNode_27;
  }

  private boolean guardCheck_sink() {
    return isDirty_validationAccumulatorNode_15 | isDirty_validationBaseNode_4;
  }

  @Override
  public <T> T getNodeById(String id) throws NoSuchFieldException {
    return nodeNameLookup.getInstanceById(id);
  }

  @Override
  public <A extends Auditor> A getAuditorById(String id)
      throws NoSuchFieldException, IllegalAccessException {
    return (A) this.getClass().getField(id).get(this);
  }

  @Override
  public void addEventFeed(EventFeed eventProcessorFeed) {
    subscriptionManager.addEventProcessorFeed(eventProcessorFeed);
  }

  @Override
  public void removeEventFeed(EventFeed eventProcessorFeed) {
    subscriptionManager.removeEventProcessorFeed(eventProcessorFeed);
  }

  @Override
  public ValidationDiamond10Processor newInstance() {
    return new ValidationDiamond10Processor();
  }

  @Override
  public ValidationDiamond10Processor newInstance(Map<Object, Object> contextMap) {
    return new ValidationDiamond10Processor();
  }

  @Override
  public String getLastAuditLogRecord() {
    try {
      EventLogManager eventLogManager =
          (EventLogManager) this.getClass().getField(EventLogManager.NODE_NAME).get(this);
      return eventLogManager.lastRecordAsString();
    } catch (Throwable e) {
      return "";
    }
  }

  public void unKnownEventHandler(Object object) {
    unKnownEventHandler.accept(object);
  }

  @Override
  public <T> void setUnKnownEventHandler(Consumer<T> consumer) {
    unKnownEventHandler = consumer;
  }

  @Override
  public SubscriptionManager getSubscriptionManager() {
    return subscriptionManager;
  }
}
