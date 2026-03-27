/*
 * Copyright: © 2025.  Gregory Higgins <greg.higgins@v12technology.com> - All Rights Reserved
 * This source code is protected under international copyright law.  All rights
 * reserved and protected by the copyright holders.
 * This file is confidential and only available to authorized individuals with the
 * permission of the copyright holders.  If you encounter this file and do not have
 * permission, please contact the copyright holders and delete this file.
 */
package com.telamin.fluxtion.test.performance.validation.generated;

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
  private final transient DataCollector dataCollector_288 = new DataCollector();
  private final transient EventContext eventContext_287 = new EventContext();
  public final transient ValidationControlRootNode ctrl_root = new ValidationControlRootNode();
  public final transient ValidationBaseNode ctrl_l1_n0 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l1_n1 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l1_n2 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l1_n3 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l1_n4 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l1_n5 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l1_n6 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l1_n7 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l1_n8 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l1_n9 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l2_n0 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l2_n1 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l2_n2 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l2_n3 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l2_n4 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l2_n5 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l2_n6 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l2_n7 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l2_n8 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l2_n9 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l3_n0 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l3_n1 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l3_n2 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l3_n3 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l3_n4 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l3_n5 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l3_n6 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l3_n7 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l3_n8 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l3_n9 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l4_n0 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l4_n1 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l4_n2 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l4_n3 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l4_n4 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l4_n5 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l4_n6 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l4_n7 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l4_n8 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l4_n9 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l5_n0 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l5_n1 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l5_n2 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l5_n3 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l5_n4 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l5_n5 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l5_n6 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l5_n7 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l5_n8 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l5_n9 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l6_n0 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l6_n1 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l6_n2 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l6_n3 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l6_n4 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l6_n5 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l6_n6 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l6_n7 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l6_n8 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l6_n9 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l7_n0 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l7_n1 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l7_n2 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l7_n3 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l7_n4 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l7_n5 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l7_n6 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l7_n7 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l7_n8 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l7_n9 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l8_n0 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l8_n1 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l8_n2 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l8_n3 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l8_n4 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l8_n5 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l8_n6 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l8_n7 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l8_n8 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l8_n9 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l9_n0 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l9_n1 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l9_n2 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l9_n3 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l9_n4 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l9_n5 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l9_n6 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l9_n7 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l9_n8 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_l9_n9 = new ValidationBaseNode();
  public final transient ValidationBaseNode ctrl_sink = new ValidationBaseNode();
  public final transient ValidationMarketRootNode md_root = new ValidationMarketRootNode();
  public final transient ValidationBaseNode md_l1_n0 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l1_n1 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l1_n2 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l1_n3 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l1_n4 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l1_n5 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l1_n6 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l1_n7 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l1_n8 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l1_n9 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l2_n0 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l2_n1 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l2_n2 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l2_n3 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l2_n4 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l2_n5 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l2_n6 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l2_n7 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l2_n8 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l2_n9 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l3_n0 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l3_n1 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l3_n2 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l3_n3 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l3_n4 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l3_n5 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l3_n6 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l3_n7 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l3_n8 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l3_n9 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l4_n0 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l4_n1 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l4_n2 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l4_n3 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l4_n4 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l4_n5 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l4_n6 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l4_n7 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l4_n8 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l4_n9 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l5_n0 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l5_n1 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l5_n2 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l5_n3 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l5_n4 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l5_n5 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l5_n6 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l5_n7 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l5_n8 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l5_n9 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l6_n0 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l6_n1 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l6_n2 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l6_n3 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l6_n4 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l6_n5 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l6_n6 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l6_n7 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l6_n8 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l6_n9 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l7_n0 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l7_n1 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l7_n2 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l7_n3 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l7_n4 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l7_n5 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l7_n6 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l7_n7 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l7_n8 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l7_n9 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l8_n0 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l8_n1 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l8_n2 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l8_n3 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l8_n4 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l8_n5 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l8_n6 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l8_n7 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l8_n8 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l8_n9 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l9_n0 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l9_n1 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l9_n2 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l9_n3 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l9_n4 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l9_n5 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l9_n6 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l9_n7 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l9_n8 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l9_n9 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l10_n0 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l10_n1 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l10_n2 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l10_n3 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l10_n4 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l10_n5 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l10_n6 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l10_n7 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l10_n8 = new ValidationBaseNode();
  public final transient ValidationBaseNode md_l10_n9 = new ValidationBaseNode();
  public final transient ValidationSinkNode md_sink = new ValidationSinkNode();
  public final transient NodeNameAuditor nodeNameLookup = new NodeNameAuditor();
  private final transient SubscriptionManagerNode subscriptionManager =
      new SubscriptionManagerNode();
  private final transient MutableDataFlowContext context =
      new com.telamin.fluxtion.runtime.node.MutableDataFlowContext(
          nodeNameLookup, callbackDispatcher, subscriptionManager, callbackDispatcher);;
  public final transient ServiceRegistryNode serviceRegistry = new ServiceRegistryNode();
  public final transient ValidationTradeRootNode ts_root = new ValidationTradeRootNode();
  public final transient ValidationAccumulatorNode ts_l1_n0 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l1_n1 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l1_n2 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l1_n3 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l1_n4 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l1_n5 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l1_n6 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l1_n7 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l1_n8 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l1_n9 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l2_n0 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l2_n1 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l2_n2 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l2_n3 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l2_n4 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l2_n5 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l2_n6 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l2_n7 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l2_n8 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l2_n9 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l3_n0 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l3_n1 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l3_n2 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l3_n3 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l3_n4 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l3_n5 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l3_n6 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l3_n7 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l3_n8 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l3_n9 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l4_n0 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l4_n1 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l4_n2 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l4_n3 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l4_n4 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l4_n5 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l4_n6 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l4_n7 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l4_n8 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l4_n9 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l5_n0 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l5_n1 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l5_n2 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l5_n3 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l5_n4 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l5_n5 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l5_n6 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l5_n7 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l5_n8 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l5_n9 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l6_n0 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l6_n1 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l6_n2 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l6_n3 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l6_n4 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l6_n5 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l6_n6 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l6_n7 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l6_n8 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l6_n9 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l7_n0 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l7_n1 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l7_n2 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l7_n3 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l7_n4 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l7_n5 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l7_n6 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l7_n7 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l7_n8 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l7_n9 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l8_n0 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l8_n1 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l8_n2 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l8_n3 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l8_n4 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l8_n5 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l8_n6 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l8_n7 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l8_n8 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l8_n9 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l9_n0 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l9_n1 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l9_n2 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l9_n3 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l9_n4 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l9_n5 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l9_n6 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l9_n7 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l9_n8 = new ValidationAccumulatorNode();
  public final transient ValidationAccumulatorNode ts_l9_n9 = new ValidationAccumulatorNode();
  public final transient ValidationSinkNode ts_sink = new ValidationSinkNode();
  public final transient ValidationSinkNode sink = new ValidationSinkNode();
  private final transient ExportFunctionAuditEvent functionAudit = new ExportFunctionAuditEvent();
  //Dirty flags
  private boolean initCalled = false;
  private boolean processing = false;
  private boolean buffering = false;
  private final transient IdentityHashMap<Object, BooleanSupplier> dirtyFlagSupplierMap =
      new IdentityHashMap<>(268);
  private final transient IdentityHashMap<Object, Consumer<Boolean>> dirtyFlagUpdateMap =
      new IdentityHashMap<>(268);

  private boolean isDirty_ctrl_l1_n0 = false;
  private boolean isDirty_ctrl_l1_n1 = false;
  private boolean isDirty_ctrl_l1_n2 = false;
  private boolean isDirty_ctrl_l1_n3 = false;
  private boolean isDirty_ctrl_l1_n4 = false;
  private boolean isDirty_ctrl_l1_n5 = false;
  private boolean isDirty_ctrl_l1_n6 = false;
  private boolean isDirty_ctrl_l1_n7 = false;
  private boolean isDirty_ctrl_l1_n8 = false;
  private boolean isDirty_ctrl_l1_n9 = false;
  private boolean isDirty_ctrl_l2_n0 = false;
  private boolean isDirty_ctrl_l2_n1 = false;
  private boolean isDirty_ctrl_l2_n2 = false;
  private boolean isDirty_ctrl_l2_n3 = false;
  private boolean isDirty_ctrl_l2_n4 = false;
  private boolean isDirty_ctrl_l2_n5 = false;
  private boolean isDirty_ctrl_l2_n6 = false;
  private boolean isDirty_ctrl_l2_n7 = false;
  private boolean isDirty_ctrl_l2_n8 = false;
  private boolean isDirty_ctrl_l2_n9 = false;
  private boolean isDirty_ctrl_l3_n0 = false;
  private boolean isDirty_ctrl_l3_n1 = false;
  private boolean isDirty_ctrl_l3_n2 = false;
  private boolean isDirty_ctrl_l3_n3 = false;
  private boolean isDirty_ctrl_l3_n4 = false;
  private boolean isDirty_ctrl_l3_n5 = false;
  private boolean isDirty_ctrl_l3_n6 = false;
  private boolean isDirty_ctrl_l3_n7 = false;
  private boolean isDirty_ctrl_l3_n8 = false;
  private boolean isDirty_ctrl_l3_n9 = false;
  private boolean isDirty_ctrl_l4_n0 = false;
  private boolean isDirty_ctrl_l4_n1 = false;
  private boolean isDirty_ctrl_l4_n2 = false;
  private boolean isDirty_ctrl_l4_n3 = false;
  private boolean isDirty_ctrl_l4_n4 = false;
  private boolean isDirty_ctrl_l4_n5 = false;
  private boolean isDirty_ctrl_l4_n6 = false;
  private boolean isDirty_ctrl_l4_n7 = false;
  private boolean isDirty_ctrl_l4_n8 = false;
  private boolean isDirty_ctrl_l4_n9 = false;
  private boolean isDirty_ctrl_l5_n0 = false;
  private boolean isDirty_ctrl_l5_n1 = false;
  private boolean isDirty_ctrl_l5_n2 = false;
  private boolean isDirty_ctrl_l5_n3 = false;
  private boolean isDirty_ctrl_l5_n4 = false;
  private boolean isDirty_ctrl_l5_n5 = false;
  private boolean isDirty_ctrl_l5_n6 = false;
  private boolean isDirty_ctrl_l5_n7 = false;
  private boolean isDirty_ctrl_l5_n8 = false;
  private boolean isDirty_ctrl_l5_n9 = false;
  private boolean isDirty_ctrl_l6_n0 = false;
  private boolean isDirty_ctrl_l6_n1 = false;
  private boolean isDirty_ctrl_l6_n2 = false;
  private boolean isDirty_ctrl_l6_n3 = false;
  private boolean isDirty_ctrl_l6_n4 = false;
  private boolean isDirty_ctrl_l6_n5 = false;
  private boolean isDirty_ctrl_l6_n6 = false;
  private boolean isDirty_ctrl_l6_n7 = false;
  private boolean isDirty_ctrl_l6_n8 = false;
  private boolean isDirty_ctrl_l6_n9 = false;
  private boolean isDirty_ctrl_l7_n0 = false;
  private boolean isDirty_ctrl_l7_n1 = false;
  private boolean isDirty_ctrl_l7_n2 = false;
  private boolean isDirty_ctrl_l7_n3 = false;
  private boolean isDirty_ctrl_l7_n4 = false;
  private boolean isDirty_ctrl_l7_n5 = false;
  private boolean isDirty_ctrl_l7_n6 = false;
  private boolean isDirty_ctrl_l7_n7 = false;
  private boolean isDirty_ctrl_l7_n8 = false;
  private boolean isDirty_ctrl_l7_n9 = false;
  private boolean isDirty_ctrl_l8_n0 = false;
  private boolean isDirty_ctrl_l8_n1 = false;
  private boolean isDirty_ctrl_l8_n2 = false;
  private boolean isDirty_ctrl_l8_n3 = false;
  private boolean isDirty_ctrl_l8_n4 = false;
  private boolean isDirty_ctrl_l8_n5 = false;
  private boolean isDirty_ctrl_l8_n6 = false;
  private boolean isDirty_ctrl_l8_n7 = false;
  private boolean isDirty_ctrl_l8_n8 = false;
  private boolean isDirty_ctrl_l8_n9 = false;
  private boolean isDirty_ctrl_l9_n0 = false;
  private boolean isDirty_ctrl_l9_n1 = false;
  private boolean isDirty_ctrl_l9_n2 = false;
  private boolean isDirty_ctrl_root = false;
  private boolean isDirty_md_l1_n0 = false;
  private boolean isDirty_md_l1_n1 = false;
  private boolean isDirty_md_l1_n2 = false;
  private boolean isDirty_md_l1_n3 = false;
  private boolean isDirty_md_l1_n4 = false;
  private boolean isDirty_md_l1_n5 = false;
  private boolean isDirty_md_l1_n6 = false;
  private boolean isDirty_md_l1_n7 = false;
  private boolean isDirty_md_l1_n8 = false;
  private boolean isDirty_md_l1_n9 = false;
  private boolean isDirty_md_l2_n0 = false;
  private boolean isDirty_md_l2_n1 = false;
  private boolean isDirty_md_l2_n2 = false;
  private boolean isDirty_md_l2_n3 = false;
  private boolean isDirty_md_l2_n4 = false;
  private boolean isDirty_md_l2_n5 = false;
  private boolean isDirty_md_l2_n6 = false;
  private boolean isDirty_md_l2_n7 = false;
  private boolean isDirty_md_l2_n8 = false;
  private boolean isDirty_md_l2_n9 = false;
  private boolean isDirty_md_l3_n0 = false;
  private boolean isDirty_md_l3_n1 = false;
  private boolean isDirty_md_l3_n2 = false;
  private boolean isDirty_md_l3_n3 = false;
  private boolean isDirty_md_l3_n4 = false;
  private boolean isDirty_md_l3_n5 = false;
  private boolean isDirty_md_l3_n6 = false;
  private boolean isDirty_md_l3_n7 = false;
  private boolean isDirty_md_l3_n8 = false;
  private boolean isDirty_md_l3_n9 = false;
  private boolean isDirty_md_l4_n0 = false;
  private boolean isDirty_md_l4_n1 = false;
  private boolean isDirty_md_l4_n2 = false;
  private boolean isDirty_md_l4_n3 = false;
  private boolean isDirty_md_l4_n4 = false;
  private boolean isDirty_md_l4_n5 = false;
  private boolean isDirty_md_l4_n6 = false;
  private boolean isDirty_md_l4_n7 = false;
  private boolean isDirty_md_l4_n8 = false;
  private boolean isDirty_md_l4_n9 = false;
  private boolean isDirty_md_l5_n0 = false;
  private boolean isDirty_md_l5_n1 = false;
  private boolean isDirty_md_l5_n2 = false;
  private boolean isDirty_md_l5_n3 = false;
  private boolean isDirty_md_l5_n4 = false;
  private boolean isDirty_md_l5_n5 = false;
  private boolean isDirty_md_l5_n6 = false;
  private boolean isDirty_md_l5_n7 = false;
  private boolean isDirty_md_l5_n8 = false;
  private boolean isDirty_md_l5_n9 = false;
  private boolean isDirty_md_l6_n0 = false;
  private boolean isDirty_md_l6_n1 = false;
  private boolean isDirty_md_l6_n2 = false;
  private boolean isDirty_md_l6_n3 = false;
  private boolean isDirty_md_l6_n4 = false;
  private boolean isDirty_md_l6_n5 = false;
  private boolean isDirty_md_l6_n6 = false;
  private boolean isDirty_md_l6_n7 = false;
  private boolean isDirty_md_l6_n8 = false;
  private boolean isDirty_md_l6_n9 = false;
  private boolean isDirty_md_l7_n0 = false;
  private boolean isDirty_md_l7_n1 = false;
  private boolean isDirty_md_l7_n2 = false;
  private boolean isDirty_md_l7_n3 = false;
  private boolean isDirty_md_l7_n4 = false;
  private boolean isDirty_md_l7_n5 = false;
  private boolean isDirty_md_l7_n6 = false;
  private boolean isDirty_md_l7_n7 = false;
  private boolean isDirty_md_l7_n8 = false;
  private boolean isDirty_md_l7_n9 = false;
  private boolean isDirty_md_l8_n0 = false;
  private boolean isDirty_md_l8_n1 = false;
  private boolean isDirty_md_l8_n2 = false;
  private boolean isDirty_md_l8_n3 = false;
  private boolean isDirty_md_l8_n4 = false;
  private boolean isDirty_md_l8_n5 = false;
  private boolean isDirty_md_l8_n6 = false;
  private boolean isDirty_md_l8_n7 = false;
  private boolean isDirty_md_l8_n8 = false;
  private boolean isDirty_md_l8_n9 = false;
  private boolean isDirty_md_l9_n0 = false;
  private boolean isDirty_md_l9_n1 = false;
  private boolean isDirty_md_l9_n2 = false;
  private boolean isDirty_md_l9_n3 = false;
  private boolean isDirty_md_l9_n4 = false;
  private boolean isDirty_md_l9_n5 = false;
  private boolean isDirty_md_l9_n6 = false;
  private boolean isDirty_md_l9_n7 = false;
  private boolean isDirty_md_l9_n8 = false;
  private boolean isDirty_md_l9_n9 = false;
  private boolean isDirty_md_l10_n0 = false;
  private boolean isDirty_md_l10_n1 = false;
  private boolean isDirty_md_l10_n2 = false;
  private boolean isDirty_md_l10_n3 = false;
  private boolean isDirty_md_l10_n4 = false;
  private boolean isDirty_md_root = false;
  private boolean isDirty_md_sink = false;
  private boolean isDirty_ts_l1_n0 = false;
  private boolean isDirty_ts_l1_n1 = false;
  private boolean isDirty_ts_l1_n2 = false;
  private boolean isDirty_ts_l1_n3 = false;
  private boolean isDirty_ts_l1_n4 = false;
  private boolean isDirty_ts_l1_n5 = false;
  private boolean isDirty_ts_l1_n6 = false;
  private boolean isDirty_ts_l1_n7 = false;
  private boolean isDirty_ts_l1_n8 = false;
  private boolean isDirty_ts_l1_n9 = false;
  private boolean isDirty_ts_l2_n0 = false;
  private boolean isDirty_ts_l2_n1 = false;
  private boolean isDirty_ts_l2_n2 = false;
  private boolean isDirty_ts_l2_n3 = false;
  private boolean isDirty_ts_l2_n4 = false;
  private boolean isDirty_ts_l2_n5 = false;
  private boolean isDirty_ts_l2_n6 = false;
  private boolean isDirty_ts_l2_n7 = false;
  private boolean isDirty_ts_l2_n8 = false;
  private boolean isDirty_ts_l2_n9 = false;
  private boolean isDirty_ts_l3_n0 = false;
  private boolean isDirty_ts_l3_n1 = false;
  private boolean isDirty_ts_l3_n2 = false;
  private boolean isDirty_ts_l3_n3 = false;
  private boolean isDirty_ts_l3_n4 = false;
  private boolean isDirty_ts_l3_n5 = false;
  private boolean isDirty_ts_l3_n6 = false;
  private boolean isDirty_ts_l3_n7 = false;
  private boolean isDirty_ts_l3_n8 = false;
  private boolean isDirty_ts_l3_n9 = false;
  private boolean isDirty_ts_l4_n0 = false;
  private boolean isDirty_ts_l4_n1 = false;
  private boolean isDirty_ts_l4_n2 = false;
  private boolean isDirty_ts_l4_n3 = false;
  private boolean isDirty_ts_l4_n4 = false;
  private boolean isDirty_ts_l4_n5 = false;
  private boolean isDirty_ts_l4_n6 = false;
  private boolean isDirty_ts_l4_n7 = false;
  private boolean isDirty_ts_l4_n8 = false;
  private boolean isDirty_ts_l4_n9 = false;
  private boolean isDirty_ts_l5_n0 = false;
  private boolean isDirty_ts_l5_n1 = false;
  private boolean isDirty_ts_l5_n2 = false;
  private boolean isDirty_ts_l5_n3 = false;
  private boolean isDirty_ts_l5_n4 = false;
  private boolean isDirty_ts_l5_n5 = false;
  private boolean isDirty_ts_l5_n6 = false;
  private boolean isDirty_ts_l5_n7 = false;
  private boolean isDirty_ts_l5_n8 = false;
  private boolean isDirty_ts_l5_n9 = false;
  private boolean isDirty_ts_l6_n0 = false;
  private boolean isDirty_ts_l6_n1 = false;
  private boolean isDirty_ts_l6_n2 = false;
  private boolean isDirty_ts_l6_n3 = false;
  private boolean isDirty_ts_l6_n4 = false;
  private boolean isDirty_ts_l6_n5 = false;
  private boolean isDirty_ts_l6_n6 = false;
  private boolean isDirty_ts_l6_n7 = false;
  private boolean isDirty_ts_l6_n8 = false;
  private boolean isDirty_ts_l6_n9 = false;
  private boolean isDirty_ts_l7_n0 = false;
  private boolean isDirty_ts_l7_n1 = false;
  private boolean isDirty_ts_l7_n2 = false;
  private boolean isDirty_ts_l7_n3 = false;
  private boolean isDirty_ts_l7_n4 = false;
  private boolean isDirty_ts_l7_n5 = false;
  private boolean isDirty_ts_l7_n6 = false;
  private boolean isDirty_ts_l7_n7 = false;
  private boolean isDirty_ts_l7_n8 = false;
  private boolean isDirty_ts_l7_n9 = false;
  private boolean isDirty_ts_l8_n0 = false;
  private boolean isDirty_ts_l8_n1 = false;
  private boolean isDirty_ts_l8_n2 = false;
  private boolean isDirty_ts_l8_n3 = false;
  private boolean isDirty_ts_l8_n4 = false;
  private boolean isDirty_ts_l8_n5 = false;
  private boolean isDirty_ts_l8_n6 = false;
  private boolean isDirty_ts_l8_n7 = false;
  private boolean isDirty_ts_l8_n8 = false;
  private boolean isDirty_ts_l8_n9 = false;
  private boolean isDirty_ts_l9_n0 = false;
  private boolean isDirty_ts_l9_n1 = false;
  private boolean isDirty_ts_l9_n2 = false;
  private boolean isDirty_ts_l9_n3 = false;
  private boolean isDirty_ts_l9_n4 = false;
  private boolean isDirty_ts_root = false;
  private boolean isDirty_ts_sink = false;

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
    ts_l1_n0.setUpstream1(ts_root);
    ts_l1_n0.setNodeId("ts_l1_n0");
    ts_l1_n0.setDataCollector(dataCollector_288);
    ts_l1_n0.setEventContext(eventContext_287);
    ts_l1_n0.value = 0.0;
    ts_l1_n0.nodeId = "ts_l1_n0";
    ts_l1_n0.eventContext = eventContext_287;
    ts_l1_n0.dataCollector = dataCollector_288;
    ts_l1_n0.upstream1 = ts_root;
    ts_l1_n1.setUpstream1(ts_root);
    ts_l1_n1.setNodeId("ts_l1_n1");
    ts_l1_n1.setDataCollector(dataCollector_288);
    ts_l1_n1.setEventContext(eventContext_287);
    ts_l1_n1.value = 0.0;
    ts_l1_n1.nodeId = "ts_l1_n1";
    ts_l1_n1.eventContext = eventContext_287;
    ts_l1_n1.dataCollector = dataCollector_288;
    ts_l1_n1.upstream1 = ts_root;
    ts_l1_n2.setUpstream1(ts_root);
    ts_l1_n2.setNodeId("ts_l1_n2");
    ts_l1_n2.setDataCollector(dataCollector_288);
    ts_l1_n2.setEventContext(eventContext_287);
    ts_l1_n2.value = 0.0;
    ts_l1_n2.nodeId = "ts_l1_n2";
    ts_l1_n2.eventContext = eventContext_287;
    ts_l1_n2.dataCollector = dataCollector_288;
    ts_l1_n2.upstream1 = ts_root;
    ts_l1_n3.setUpstream1(ts_root);
    ts_l1_n3.setNodeId("ts_l1_n3");
    ts_l1_n3.setDataCollector(dataCollector_288);
    ts_l1_n3.setEventContext(eventContext_287);
    ts_l1_n3.value = 0.0;
    ts_l1_n3.nodeId = "ts_l1_n3";
    ts_l1_n3.eventContext = eventContext_287;
    ts_l1_n3.dataCollector = dataCollector_288;
    ts_l1_n3.upstream1 = ts_root;
    ts_l1_n4.setUpstream1(ts_root);
    ts_l1_n4.setNodeId("ts_l1_n4");
    ts_l1_n4.setDataCollector(dataCollector_288);
    ts_l1_n4.setEventContext(eventContext_287);
    ts_l1_n4.value = 0.0;
    ts_l1_n4.nodeId = "ts_l1_n4";
    ts_l1_n4.eventContext = eventContext_287;
    ts_l1_n4.dataCollector = dataCollector_288;
    ts_l1_n4.upstream1 = ts_root;
    ts_l1_n5.setUpstream1(ts_root);
    ts_l1_n5.setNodeId("ts_l1_n5");
    ts_l1_n5.setDataCollector(dataCollector_288);
    ts_l1_n5.setEventContext(eventContext_287);
    ts_l1_n5.value = 0.0;
    ts_l1_n5.nodeId = "ts_l1_n5";
    ts_l1_n5.eventContext = eventContext_287;
    ts_l1_n5.dataCollector = dataCollector_288;
    ts_l1_n5.upstream1 = ts_root;
    ts_l1_n6.setUpstream1(ts_root);
    ts_l1_n6.setNodeId("ts_l1_n6");
    ts_l1_n6.setDataCollector(dataCollector_288);
    ts_l1_n6.setEventContext(eventContext_287);
    ts_l1_n6.value = 0.0;
    ts_l1_n6.nodeId = "ts_l1_n6";
    ts_l1_n6.eventContext = eventContext_287;
    ts_l1_n6.dataCollector = dataCollector_288;
    ts_l1_n6.upstream1 = ts_root;
    ts_l1_n7.setUpstream1(ts_root);
    ts_l1_n7.setNodeId("ts_l1_n7");
    ts_l1_n7.setDataCollector(dataCollector_288);
    ts_l1_n7.setEventContext(eventContext_287);
    ts_l1_n7.value = 0.0;
    ts_l1_n7.nodeId = "ts_l1_n7";
    ts_l1_n7.eventContext = eventContext_287;
    ts_l1_n7.dataCollector = dataCollector_288;
    ts_l1_n7.upstream1 = ts_root;
    ts_l1_n8.setUpstream1(ts_root);
    ts_l1_n8.setNodeId("ts_l1_n8");
    ts_l1_n8.setDataCollector(dataCollector_288);
    ts_l1_n8.setEventContext(eventContext_287);
    ts_l1_n8.value = 0.0;
    ts_l1_n8.nodeId = "ts_l1_n8";
    ts_l1_n8.eventContext = eventContext_287;
    ts_l1_n8.dataCollector = dataCollector_288;
    ts_l1_n8.upstream1 = ts_root;
    ts_l1_n9.setUpstream1(ts_root);
    ts_l1_n9.setNodeId("ts_l1_n9");
    ts_l1_n9.setDataCollector(dataCollector_288);
    ts_l1_n9.setEventContext(eventContext_287);
    ts_l1_n9.value = 0.0;
    ts_l1_n9.nodeId = "ts_l1_n9";
    ts_l1_n9.eventContext = eventContext_287;
    ts_l1_n9.dataCollector = dataCollector_288;
    ts_l1_n9.upstream1 = ts_root;
    ts_l2_n0.setUpstream1(ts_l1_n0);
    ts_l2_n0.setNodeId("ts_l2_n0");
    ts_l2_n0.setDataCollector(dataCollector_288);
    ts_l2_n0.setEventContext(eventContext_287);
    ts_l2_n0.setUpstream2(ts_l1_n1);
    ts_l2_n0.value = 0.0;
    ts_l2_n0.nodeId = "ts_l2_n0";
    ts_l2_n0.eventContext = eventContext_287;
    ts_l2_n0.dataCollector = dataCollector_288;
    ts_l2_n0.upstream1 = ts_l1_n0;
    ts_l2_n0.upstream2 = ts_l1_n1;
    ts_l2_n1.setUpstream1(ts_l1_n1);
    ts_l2_n1.setNodeId("ts_l2_n1");
    ts_l2_n1.setDataCollector(dataCollector_288);
    ts_l2_n1.setEventContext(eventContext_287);
    ts_l2_n1.setUpstream2(ts_l1_n2);
    ts_l2_n1.value = 0.0;
    ts_l2_n1.nodeId = "ts_l2_n1";
    ts_l2_n1.eventContext = eventContext_287;
    ts_l2_n1.dataCollector = dataCollector_288;
    ts_l2_n1.upstream1 = ts_l1_n1;
    ts_l2_n1.upstream2 = ts_l1_n2;
    ts_l2_n2.setUpstream1(ts_l1_n2);
    ts_l2_n2.setNodeId("ts_l2_n2");
    ts_l2_n2.setDataCollector(dataCollector_288);
    ts_l2_n2.setEventContext(eventContext_287);
    ts_l2_n2.setUpstream2(ts_l1_n3);
    ts_l2_n2.value = 0.0;
    ts_l2_n2.nodeId = "ts_l2_n2";
    ts_l2_n2.eventContext = eventContext_287;
    ts_l2_n2.dataCollector = dataCollector_288;
    ts_l2_n2.upstream1 = ts_l1_n2;
    ts_l2_n2.upstream2 = ts_l1_n3;
    ts_l2_n3.setUpstream1(ts_l1_n3);
    ts_l2_n3.setNodeId("ts_l2_n3");
    ts_l2_n3.setDataCollector(dataCollector_288);
    ts_l2_n3.setEventContext(eventContext_287);
    ts_l2_n3.setUpstream2(ts_l1_n4);
    ts_l2_n3.value = 0.0;
    ts_l2_n3.nodeId = "ts_l2_n3";
    ts_l2_n3.eventContext = eventContext_287;
    ts_l2_n3.dataCollector = dataCollector_288;
    ts_l2_n3.upstream1 = ts_l1_n3;
    ts_l2_n3.upstream2 = ts_l1_n4;
    ts_l2_n4.setUpstream1(ts_l1_n4);
    ts_l2_n4.setNodeId("ts_l2_n4");
    ts_l2_n4.setDataCollector(dataCollector_288);
    ts_l2_n4.setEventContext(eventContext_287);
    ts_l2_n4.setUpstream2(ts_l1_n5);
    ts_l2_n4.value = 0.0;
    ts_l2_n4.nodeId = "ts_l2_n4";
    ts_l2_n4.eventContext = eventContext_287;
    ts_l2_n4.dataCollector = dataCollector_288;
    ts_l2_n4.upstream1 = ts_l1_n4;
    ts_l2_n4.upstream2 = ts_l1_n5;
    ts_l2_n5.setUpstream1(ts_l1_n5);
    ts_l2_n5.setNodeId("ts_l2_n5");
    ts_l2_n5.setDataCollector(dataCollector_288);
    ts_l2_n5.setEventContext(eventContext_287);
    ts_l2_n5.setUpstream2(ts_l1_n6);
    ts_l2_n5.value = 0.0;
    ts_l2_n5.nodeId = "ts_l2_n5";
    ts_l2_n5.eventContext = eventContext_287;
    ts_l2_n5.dataCollector = dataCollector_288;
    ts_l2_n5.upstream1 = ts_l1_n5;
    ts_l2_n5.upstream2 = ts_l1_n6;
    ts_l2_n6.setUpstream1(ts_l1_n6);
    ts_l2_n6.setNodeId("ts_l2_n6");
    ts_l2_n6.setDataCollector(dataCollector_288);
    ts_l2_n6.setEventContext(eventContext_287);
    ts_l2_n6.setUpstream2(ts_l1_n7);
    ts_l2_n6.value = 0.0;
    ts_l2_n6.nodeId = "ts_l2_n6";
    ts_l2_n6.eventContext = eventContext_287;
    ts_l2_n6.dataCollector = dataCollector_288;
    ts_l2_n6.upstream1 = ts_l1_n6;
    ts_l2_n6.upstream2 = ts_l1_n7;
    ts_l2_n7.setUpstream1(ts_l1_n7);
    ts_l2_n7.setNodeId("ts_l2_n7");
    ts_l2_n7.setDataCollector(dataCollector_288);
    ts_l2_n7.setEventContext(eventContext_287);
    ts_l2_n7.setUpstream2(ts_l1_n8);
    ts_l2_n7.value = 0.0;
    ts_l2_n7.nodeId = "ts_l2_n7";
    ts_l2_n7.eventContext = eventContext_287;
    ts_l2_n7.dataCollector = dataCollector_288;
    ts_l2_n7.upstream1 = ts_l1_n7;
    ts_l2_n7.upstream2 = ts_l1_n8;
    ts_l2_n8.setUpstream1(ts_l1_n8);
    ts_l2_n8.setNodeId("ts_l2_n8");
    ts_l2_n8.setDataCollector(dataCollector_288);
    ts_l2_n8.setEventContext(eventContext_287);
    ts_l2_n8.setUpstream2(ts_l1_n9);
    ts_l2_n8.value = 0.0;
    ts_l2_n8.nodeId = "ts_l2_n8";
    ts_l2_n8.eventContext = eventContext_287;
    ts_l2_n8.dataCollector = dataCollector_288;
    ts_l2_n8.upstream1 = ts_l1_n8;
    ts_l2_n8.upstream2 = ts_l1_n9;
    ts_l2_n9.setUpstream1(ts_l1_n9);
    ts_l2_n9.setNodeId("ts_l2_n9");
    ts_l2_n9.setDataCollector(dataCollector_288);
    ts_l2_n9.setEventContext(eventContext_287);
    ts_l2_n9.setUpstream2(ts_l1_n0);
    ts_l2_n9.value = 0.0;
    ts_l2_n9.nodeId = "ts_l2_n9";
    ts_l2_n9.eventContext = eventContext_287;
    ts_l2_n9.dataCollector = dataCollector_288;
    ts_l2_n9.upstream1 = ts_l1_n9;
    ts_l2_n9.upstream2 = ts_l1_n0;
    ts_l3_n0.setUpstream1(ts_l2_n0);
    ts_l3_n0.setNodeId("ts_l3_n0");
    ts_l3_n0.setDataCollector(dataCollector_288);
    ts_l3_n0.setEventContext(eventContext_287);
    ts_l3_n0.setUpstream2(ts_l2_n1);
    ts_l3_n0.value = 0.0;
    ts_l3_n0.nodeId = "ts_l3_n0";
    ts_l3_n0.eventContext = eventContext_287;
    ts_l3_n0.dataCollector = dataCollector_288;
    ts_l3_n0.upstream1 = ts_l2_n0;
    ts_l3_n0.upstream2 = ts_l2_n1;
    ts_l3_n1.setUpstream1(ts_l2_n1);
    ts_l3_n1.setNodeId("ts_l3_n1");
    ts_l3_n1.setDataCollector(dataCollector_288);
    ts_l3_n1.setEventContext(eventContext_287);
    ts_l3_n1.setUpstream2(ts_l2_n2);
    ts_l3_n1.value = 0.0;
    ts_l3_n1.nodeId = "ts_l3_n1";
    ts_l3_n1.eventContext = eventContext_287;
    ts_l3_n1.dataCollector = dataCollector_288;
    ts_l3_n1.upstream1 = ts_l2_n1;
    ts_l3_n1.upstream2 = ts_l2_n2;
    ts_l3_n2.setUpstream1(ts_l2_n2);
    ts_l3_n2.setNodeId("ts_l3_n2");
    ts_l3_n2.setDataCollector(dataCollector_288);
    ts_l3_n2.setEventContext(eventContext_287);
    ts_l3_n2.setUpstream2(ts_l2_n3);
    ts_l3_n2.value = 0.0;
    ts_l3_n2.nodeId = "ts_l3_n2";
    ts_l3_n2.eventContext = eventContext_287;
    ts_l3_n2.dataCollector = dataCollector_288;
    ts_l3_n2.upstream1 = ts_l2_n2;
    ts_l3_n2.upstream2 = ts_l2_n3;
    ts_l3_n3.setUpstream1(ts_l2_n3);
    ts_l3_n3.setNodeId("ts_l3_n3");
    ts_l3_n3.setDataCollector(dataCollector_288);
    ts_l3_n3.setEventContext(eventContext_287);
    ts_l3_n3.setUpstream2(ts_l2_n4);
    ts_l3_n3.value = 0.0;
    ts_l3_n3.nodeId = "ts_l3_n3";
    ts_l3_n3.eventContext = eventContext_287;
    ts_l3_n3.dataCollector = dataCollector_288;
    ts_l3_n3.upstream1 = ts_l2_n3;
    ts_l3_n3.upstream2 = ts_l2_n4;
    ts_l3_n4.setUpstream1(ts_l2_n4);
    ts_l3_n4.setNodeId("ts_l3_n4");
    ts_l3_n4.setDataCollector(dataCollector_288);
    ts_l3_n4.setEventContext(eventContext_287);
    ts_l3_n4.setUpstream2(ts_l2_n5);
    ts_l3_n4.value = 0.0;
    ts_l3_n4.nodeId = "ts_l3_n4";
    ts_l3_n4.eventContext = eventContext_287;
    ts_l3_n4.dataCollector = dataCollector_288;
    ts_l3_n4.upstream1 = ts_l2_n4;
    ts_l3_n4.upstream2 = ts_l2_n5;
    ts_l3_n5.setUpstream1(ts_l2_n5);
    ts_l3_n5.setNodeId("ts_l3_n5");
    ts_l3_n5.setDataCollector(dataCollector_288);
    ts_l3_n5.setEventContext(eventContext_287);
    ts_l3_n5.setUpstream2(ts_l2_n6);
    ts_l3_n5.value = 0.0;
    ts_l3_n5.nodeId = "ts_l3_n5";
    ts_l3_n5.eventContext = eventContext_287;
    ts_l3_n5.dataCollector = dataCollector_288;
    ts_l3_n5.upstream1 = ts_l2_n5;
    ts_l3_n5.upstream2 = ts_l2_n6;
    ts_l3_n6.setUpstream1(ts_l2_n6);
    ts_l3_n6.setNodeId("ts_l3_n6");
    ts_l3_n6.setDataCollector(dataCollector_288);
    ts_l3_n6.setEventContext(eventContext_287);
    ts_l3_n6.setUpstream2(ts_l2_n7);
    ts_l3_n6.value = 0.0;
    ts_l3_n6.nodeId = "ts_l3_n6";
    ts_l3_n6.eventContext = eventContext_287;
    ts_l3_n6.dataCollector = dataCollector_288;
    ts_l3_n6.upstream1 = ts_l2_n6;
    ts_l3_n6.upstream2 = ts_l2_n7;
    ts_l3_n7.setUpstream1(ts_l2_n7);
    ts_l3_n7.setNodeId("ts_l3_n7");
    ts_l3_n7.setDataCollector(dataCollector_288);
    ts_l3_n7.setEventContext(eventContext_287);
    ts_l3_n7.setUpstream2(ts_l2_n8);
    ts_l3_n7.value = 0.0;
    ts_l3_n7.nodeId = "ts_l3_n7";
    ts_l3_n7.eventContext = eventContext_287;
    ts_l3_n7.dataCollector = dataCollector_288;
    ts_l3_n7.upstream1 = ts_l2_n7;
    ts_l3_n7.upstream2 = ts_l2_n8;
    ts_l3_n8.setUpstream1(ts_l2_n8);
    ts_l3_n8.setNodeId("ts_l3_n8");
    ts_l3_n8.setDataCollector(dataCollector_288);
    ts_l3_n8.setEventContext(eventContext_287);
    ts_l3_n8.setUpstream2(ts_l2_n9);
    ts_l3_n8.value = 0.0;
    ts_l3_n8.nodeId = "ts_l3_n8";
    ts_l3_n8.eventContext = eventContext_287;
    ts_l3_n8.dataCollector = dataCollector_288;
    ts_l3_n8.upstream1 = ts_l2_n8;
    ts_l3_n8.upstream2 = ts_l2_n9;
    ts_l3_n9.setUpstream1(ts_l2_n9);
    ts_l3_n9.setNodeId("ts_l3_n9");
    ts_l3_n9.setDataCollector(dataCollector_288);
    ts_l3_n9.setEventContext(eventContext_287);
    ts_l3_n9.setUpstream2(ts_l2_n0);
    ts_l3_n9.value = 0.0;
    ts_l3_n9.nodeId = "ts_l3_n9";
    ts_l3_n9.eventContext = eventContext_287;
    ts_l3_n9.dataCollector = dataCollector_288;
    ts_l3_n9.upstream1 = ts_l2_n9;
    ts_l3_n9.upstream2 = ts_l2_n0;
    ts_l4_n0.setUpstream1(ts_l3_n0);
    ts_l4_n0.setNodeId("ts_l4_n0");
    ts_l4_n0.setDataCollector(dataCollector_288);
    ts_l4_n0.setEventContext(eventContext_287);
    ts_l4_n0.setUpstream2(ts_l3_n1);
    ts_l4_n0.value = 0.0;
    ts_l4_n0.nodeId = "ts_l4_n0";
    ts_l4_n0.eventContext = eventContext_287;
    ts_l4_n0.dataCollector = dataCollector_288;
    ts_l4_n0.upstream1 = ts_l3_n0;
    ts_l4_n0.upstream2 = ts_l3_n1;
    ts_l4_n1.setUpstream1(ts_l3_n1);
    ts_l4_n1.setNodeId("ts_l4_n1");
    ts_l4_n1.setDataCollector(dataCollector_288);
    ts_l4_n1.setEventContext(eventContext_287);
    ts_l4_n1.setUpstream2(ts_l3_n2);
    ts_l4_n1.value = 0.0;
    ts_l4_n1.nodeId = "ts_l4_n1";
    ts_l4_n1.eventContext = eventContext_287;
    ts_l4_n1.dataCollector = dataCollector_288;
    ts_l4_n1.upstream1 = ts_l3_n1;
    ts_l4_n1.upstream2 = ts_l3_n2;
    ts_l4_n2.setUpstream1(ts_l3_n2);
    ts_l4_n2.setNodeId("ts_l4_n2");
    ts_l4_n2.setDataCollector(dataCollector_288);
    ts_l4_n2.setEventContext(eventContext_287);
    ts_l4_n2.setUpstream2(ts_l3_n3);
    ts_l4_n2.value = 0.0;
    ts_l4_n2.nodeId = "ts_l4_n2";
    ts_l4_n2.eventContext = eventContext_287;
    ts_l4_n2.dataCollector = dataCollector_288;
    ts_l4_n2.upstream1 = ts_l3_n2;
    ts_l4_n2.upstream2 = ts_l3_n3;
    ts_l4_n3.setUpstream1(ts_l3_n3);
    ts_l4_n3.setNodeId("ts_l4_n3");
    ts_l4_n3.setDataCollector(dataCollector_288);
    ts_l4_n3.setEventContext(eventContext_287);
    ts_l4_n3.setUpstream2(ts_l3_n4);
    ts_l4_n3.value = 0.0;
    ts_l4_n3.nodeId = "ts_l4_n3";
    ts_l4_n3.eventContext = eventContext_287;
    ts_l4_n3.dataCollector = dataCollector_288;
    ts_l4_n3.upstream1 = ts_l3_n3;
    ts_l4_n3.upstream2 = ts_l3_n4;
    ts_l4_n4.setUpstream1(ts_l3_n4);
    ts_l4_n4.setNodeId("ts_l4_n4");
    ts_l4_n4.setDataCollector(dataCollector_288);
    ts_l4_n4.setEventContext(eventContext_287);
    ts_l4_n4.setUpstream2(ts_l3_n5);
    ts_l4_n4.value = 0.0;
    ts_l4_n4.nodeId = "ts_l4_n4";
    ts_l4_n4.eventContext = eventContext_287;
    ts_l4_n4.dataCollector = dataCollector_288;
    ts_l4_n4.upstream1 = ts_l3_n4;
    ts_l4_n4.upstream2 = ts_l3_n5;
    ts_l4_n5.setUpstream1(ts_l3_n5);
    ts_l4_n5.setNodeId("ts_l4_n5");
    ts_l4_n5.setDataCollector(dataCollector_288);
    ts_l4_n5.setEventContext(eventContext_287);
    ts_l4_n5.setUpstream2(ts_l3_n6);
    ts_l4_n5.value = 0.0;
    ts_l4_n5.nodeId = "ts_l4_n5";
    ts_l4_n5.eventContext = eventContext_287;
    ts_l4_n5.dataCollector = dataCollector_288;
    ts_l4_n5.upstream1 = ts_l3_n5;
    ts_l4_n5.upstream2 = ts_l3_n6;
    ts_l4_n6.setUpstream1(ts_l3_n6);
    ts_l4_n6.setNodeId("ts_l4_n6");
    ts_l4_n6.setDataCollector(dataCollector_288);
    ts_l4_n6.setEventContext(eventContext_287);
    ts_l4_n6.setUpstream2(ts_l3_n7);
    ts_l4_n6.value = 0.0;
    ts_l4_n6.nodeId = "ts_l4_n6";
    ts_l4_n6.eventContext = eventContext_287;
    ts_l4_n6.dataCollector = dataCollector_288;
    ts_l4_n6.upstream1 = ts_l3_n6;
    ts_l4_n6.upstream2 = ts_l3_n7;
    ts_l4_n7.setUpstream1(ts_l3_n7);
    ts_l4_n7.setNodeId("ts_l4_n7");
    ts_l4_n7.setDataCollector(dataCollector_288);
    ts_l4_n7.setEventContext(eventContext_287);
    ts_l4_n7.setUpstream2(ts_l3_n8);
    ts_l4_n7.value = 0.0;
    ts_l4_n7.nodeId = "ts_l4_n7";
    ts_l4_n7.eventContext = eventContext_287;
    ts_l4_n7.dataCollector = dataCollector_288;
    ts_l4_n7.upstream1 = ts_l3_n7;
    ts_l4_n7.upstream2 = ts_l3_n8;
    ts_l4_n8.setUpstream1(ts_l3_n8);
    ts_l4_n8.setNodeId("ts_l4_n8");
    ts_l4_n8.setDataCollector(dataCollector_288);
    ts_l4_n8.setEventContext(eventContext_287);
    ts_l4_n8.setUpstream2(ts_l3_n9);
    ts_l4_n8.value = 0.0;
    ts_l4_n8.nodeId = "ts_l4_n8";
    ts_l4_n8.eventContext = eventContext_287;
    ts_l4_n8.dataCollector = dataCollector_288;
    ts_l4_n8.upstream1 = ts_l3_n8;
    ts_l4_n8.upstream2 = ts_l3_n9;
    ts_l4_n9.setUpstream1(ts_l3_n9);
    ts_l4_n9.setNodeId("ts_l4_n9");
    ts_l4_n9.setDataCollector(dataCollector_288);
    ts_l4_n9.setEventContext(eventContext_287);
    ts_l4_n9.setUpstream2(ts_l3_n0);
    ts_l4_n9.value = 0.0;
    ts_l4_n9.nodeId = "ts_l4_n9";
    ts_l4_n9.eventContext = eventContext_287;
    ts_l4_n9.dataCollector = dataCollector_288;
    ts_l4_n9.upstream1 = ts_l3_n9;
    ts_l4_n9.upstream2 = ts_l3_n0;
    ts_l5_n0.setUpstream1(ts_l4_n0);
    ts_l5_n0.setNodeId("ts_l5_n0");
    ts_l5_n0.setDataCollector(dataCollector_288);
    ts_l5_n0.setEventContext(eventContext_287);
    ts_l5_n0.setUpstream2(ts_l4_n1);
    ts_l5_n0.value = 0.0;
    ts_l5_n0.nodeId = "ts_l5_n0";
    ts_l5_n0.eventContext = eventContext_287;
    ts_l5_n0.dataCollector = dataCollector_288;
    ts_l5_n0.upstream1 = ts_l4_n0;
    ts_l5_n0.upstream2 = ts_l4_n1;
    ts_l5_n1.setUpstream1(ts_l4_n1);
    ts_l5_n1.setNodeId("ts_l5_n1");
    ts_l5_n1.setDataCollector(dataCollector_288);
    ts_l5_n1.setEventContext(eventContext_287);
    ts_l5_n1.setUpstream2(ts_l4_n2);
    ts_l5_n1.value = 0.0;
    ts_l5_n1.nodeId = "ts_l5_n1";
    ts_l5_n1.eventContext = eventContext_287;
    ts_l5_n1.dataCollector = dataCollector_288;
    ts_l5_n1.upstream1 = ts_l4_n1;
    ts_l5_n1.upstream2 = ts_l4_n2;
    ts_l5_n2.setUpstream1(ts_l4_n2);
    ts_l5_n2.setNodeId("ts_l5_n2");
    ts_l5_n2.setDataCollector(dataCollector_288);
    ts_l5_n2.setEventContext(eventContext_287);
    ts_l5_n2.setUpstream2(ts_l4_n3);
    ts_l5_n2.value = 0.0;
    ts_l5_n2.nodeId = "ts_l5_n2";
    ts_l5_n2.eventContext = eventContext_287;
    ts_l5_n2.dataCollector = dataCollector_288;
    ts_l5_n2.upstream1 = ts_l4_n2;
    ts_l5_n2.upstream2 = ts_l4_n3;
    ts_l5_n3.setUpstream1(ts_l4_n3);
    ts_l5_n3.setNodeId("ts_l5_n3");
    ts_l5_n3.setDataCollector(dataCollector_288);
    ts_l5_n3.setEventContext(eventContext_287);
    ts_l5_n3.setUpstream2(ts_l4_n4);
    ts_l5_n3.value = 0.0;
    ts_l5_n3.nodeId = "ts_l5_n3";
    ts_l5_n3.eventContext = eventContext_287;
    ts_l5_n3.dataCollector = dataCollector_288;
    ts_l5_n3.upstream1 = ts_l4_n3;
    ts_l5_n3.upstream2 = ts_l4_n4;
    ts_l5_n4.setUpstream1(ts_l4_n4);
    ts_l5_n4.setNodeId("ts_l5_n4");
    ts_l5_n4.setDataCollector(dataCollector_288);
    ts_l5_n4.setEventContext(eventContext_287);
    ts_l5_n4.setUpstream2(ts_l4_n5);
    ts_l5_n4.value = 0.0;
    ts_l5_n4.nodeId = "ts_l5_n4";
    ts_l5_n4.eventContext = eventContext_287;
    ts_l5_n4.dataCollector = dataCollector_288;
    ts_l5_n4.upstream1 = ts_l4_n4;
    ts_l5_n4.upstream2 = ts_l4_n5;
    ts_l5_n5.setUpstream1(ts_l4_n5);
    ts_l5_n5.setNodeId("ts_l5_n5");
    ts_l5_n5.setDataCollector(dataCollector_288);
    ts_l5_n5.setEventContext(eventContext_287);
    ts_l5_n5.setUpstream2(ts_l4_n6);
    ts_l5_n5.value = 0.0;
    ts_l5_n5.nodeId = "ts_l5_n5";
    ts_l5_n5.eventContext = eventContext_287;
    ts_l5_n5.dataCollector = dataCollector_288;
    ts_l5_n5.upstream1 = ts_l4_n5;
    ts_l5_n5.upstream2 = ts_l4_n6;
    ts_l5_n6.setUpstream1(ts_l4_n6);
    ts_l5_n6.setNodeId("ts_l5_n6");
    ts_l5_n6.setDataCollector(dataCollector_288);
    ts_l5_n6.setEventContext(eventContext_287);
    ts_l5_n6.setUpstream2(ts_l4_n7);
    ts_l5_n6.value = 0.0;
    ts_l5_n6.nodeId = "ts_l5_n6";
    ts_l5_n6.eventContext = eventContext_287;
    ts_l5_n6.dataCollector = dataCollector_288;
    ts_l5_n6.upstream1 = ts_l4_n6;
    ts_l5_n6.upstream2 = ts_l4_n7;
    ts_l5_n7.setUpstream1(ts_l4_n7);
    ts_l5_n7.setNodeId("ts_l5_n7");
    ts_l5_n7.setDataCollector(dataCollector_288);
    ts_l5_n7.setEventContext(eventContext_287);
    ts_l5_n7.setUpstream2(ts_l4_n8);
    ts_l5_n7.value = 0.0;
    ts_l5_n7.nodeId = "ts_l5_n7";
    ts_l5_n7.eventContext = eventContext_287;
    ts_l5_n7.dataCollector = dataCollector_288;
    ts_l5_n7.upstream1 = ts_l4_n7;
    ts_l5_n7.upstream2 = ts_l4_n8;
    ts_l5_n8.setUpstream1(ts_l4_n8);
    ts_l5_n8.setNodeId("ts_l5_n8");
    ts_l5_n8.setDataCollector(dataCollector_288);
    ts_l5_n8.setEventContext(eventContext_287);
    ts_l5_n8.setUpstream2(ts_l4_n9);
    ts_l5_n8.value = 0.0;
    ts_l5_n8.nodeId = "ts_l5_n8";
    ts_l5_n8.eventContext = eventContext_287;
    ts_l5_n8.dataCollector = dataCollector_288;
    ts_l5_n8.upstream1 = ts_l4_n8;
    ts_l5_n8.upstream2 = ts_l4_n9;
    ts_l5_n9.setUpstream1(ts_l4_n9);
    ts_l5_n9.setNodeId("ts_l5_n9");
    ts_l5_n9.setDataCollector(dataCollector_288);
    ts_l5_n9.setEventContext(eventContext_287);
    ts_l5_n9.setUpstream2(ts_l4_n0);
    ts_l5_n9.value = 0.0;
    ts_l5_n9.nodeId = "ts_l5_n9";
    ts_l5_n9.eventContext = eventContext_287;
    ts_l5_n9.dataCollector = dataCollector_288;
    ts_l5_n9.upstream1 = ts_l4_n9;
    ts_l5_n9.upstream2 = ts_l4_n0;
    ts_l6_n0.setUpstream1(ts_l5_n0);
    ts_l6_n0.setNodeId("ts_l6_n0");
    ts_l6_n0.setDataCollector(dataCollector_288);
    ts_l6_n0.setEventContext(eventContext_287);
    ts_l6_n0.setUpstream2(ts_l5_n1);
    ts_l6_n0.value = 0.0;
    ts_l6_n0.nodeId = "ts_l6_n0";
    ts_l6_n0.eventContext = eventContext_287;
    ts_l6_n0.dataCollector = dataCollector_288;
    ts_l6_n0.upstream1 = ts_l5_n0;
    ts_l6_n0.upstream2 = ts_l5_n1;
    ts_l6_n1.setUpstream1(ts_l5_n1);
    ts_l6_n1.setNodeId("ts_l6_n1");
    ts_l6_n1.setDataCollector(dataCollector_288);
    ts_l6_n1.setEventContext(eventContext_287);
    ts_l6_n1.setUpstream2(ts_l5_n2);
    ts_l6_n1.value = 0.0;
    ts_l6_n1.nodeId = "ts_l6_n1";
    ts_l6_n1.eventContext = eventContext_287;
    ts_l6_n1.dataCollector = dataCollector_288;
    ts_l6_n1.upstream1 = ts_l5_n1;
    ts_l6_n1.upstream2 = ts_l5_n2;
    ts_l6_n2.setUpstream1(ts_l5_n2);
    ts_l6_n2.setNodeId("ts_l6_n2");
    ts_l6_n2.setDataCollector(dataCollector_288);
    ts_l6_n2.setEventContext(eventContext_287);
    ts_l6_n2.setUpstream2(ts_l5_n3);
    ts_l6_n2.value = 0.0;
    ts_l6_n2.nodeId = "ts_l6_n2";
    ts_l6_n2.eventContext = eventContext_287;
    ts_l6_n2.dataCollector = dataCollector_288;
    ts_l6_n2.upstream1 = ts_l5_n2;
    ts_l6_n2.upstream2 = ts_l5_n3;
    ts_l6_n3.setUpstream1(ts_l5_n3);
    ts_l6_n3.setNodeId("ts_l6_n3");
    ts_l6_n3.setDataCollector(dataCollector_288);
    ts_l6_n3.setEventContext(eventContext_287);
    ts_l6_n3.setUpstream2(ts_l5_n4);
    ts_l6_n3.value = 0.0;
    ts_l6_n3.nodeId = "ts_l6_n3";
    ts_l6_n3.eventContext = eventContext_287;
    ts_l6_n3.dataCollector = dataCollector_288;
    ts_l6_n3.upstream1 = ts_l5_n3;
    ts_l6_n3.upstream2 = ts_l5_n4;
    ts_l6_n4.setUpstream1(ts_l5_n4);
    ts_l6_n4.setNodeId("ts_l6_n4");
    ts_l6_n4.setDataCollector(dataCollector_288);
    ts_l6_n4.setEventContext(eventContext_287);
    ts_l6_n4.setUpstream2(ts_l5_n5);
    ts_l6_n4.value = 0.0;
    ts_l6_n4.nodeId = "ts_l6_n4";
    ts_l6_n4.eventContext = eventContext_287;
    ts_l6_n4.dataCollector = dataCollector_288;
    ts_l6_n4.upstream1 = ts_l5_n4;
    ts_l6_n4.upstream2 = ts_l5_n5;
    ts_l6_n5.setUpstream1(ts_l5_n5);
    ts_l6_n5.setNodeId("ts_l6_n5");
    ts_l6_n5.setDataCollector(dataCollector_288);
    ts_l6_n5.setEventContext(eventContext_287);
    ts_l6_n5.setUpstream2(ts_l5_n6);
    ts_l6_n5.value = 0.0;
    ts_l6_n5.nodeId = "ts_l6_n5";
    ts_l6_n5.eventContext = eventContext_287;
    ts_l6_n5.dataCollector = dataCollector_288;
    ts_l6_n5.upstream1 = ts_l5_n5;
    ts_l6_n5.upstream2 = ts_l5_n6;
    ts_l6_n6.setUpstream1(ts_l5_n6);
    ts_l6_n6.setNodeId("ts_l6_n6");
    ts_l6_n6.setDataCollector(dataCollector_288);
    ts_l6_n6.setEventContext(eventContext_287);
    ts_l6_n6.setUpstream2(ts_l5_n7);
    ts_l6_n6.value = 0.0;
    ts_l6_n6.nodeId = "ts_l6_n6";
    ts_l6_n6.eventContext = eventContext_287;
    ts_l6_n6.dataCollector = dataCollector_288;
    ts_l6_n6.upstream1 = ts_l5_n6;
    ts_l6_n6.upstream2 = ts_l5_n7;
    ts_l6_n7.setUpstream1(ts_l5_n7);
    ts_l6_n7.setNodeId("ts_l6_n7");
    ts_l6_n7.setDataCollector(dataCollector_288);
    ts_l6_n7.setEventContext(eventContext_287);
    ts_l6_n7.setUpstream2(ts_l5_n8);
    ts_l6_n7.value = 0.0;
    ts_l6_n7.nodeId = "ts_l6_n7";
    ts_l6_n7.eventContext = eventContext_287;
    ts_l6_n7.dataCollector = dataCollector_288;
    ts_l6_n7.upstream1 = ts_l5_n7;
    ts_l6_n7.upstream2 = ts_l5_n8;
    ts_l6_n8.setUpstream1(ts_l5_n8);
    ts_l6_n8.setNodeId("ts_l6_n8");
    ts_l6_n8.setDataCollector(dataCollector_288);
    ts_l6_n8.setEventContext(eventContext_287);
    ts_l6_n8.setUpstream2(ts_l5_n9);
    ts_l6_n8.value = 0.0;
    ts_l6_n8.nodeId = "ts_l6_n8";
    ts_l6_n8.eventContext = eventContext_287;
    ts_l6_n8.dataCollector = dataCollector_288;
    ts_l6_n8.upstream1 = ts_l5_n8;
    ts_l6_n8.upstream2 = ts_l5_n9;
    ts_l6_n9.setUpstream1(ts_l5_n9);
    ts_l6_n9.setNodeId("ts_l6_n9");
    ts_l6_n9.setDataCollector(dataCollector_288);
    ts_l6_n9.setEventContext(eventContext_287);
    ts_l6_n9.setUpstream2(ts_l5_n0);
    ts_l6_n9.value = 0.0;
    ts_l6_n9.nodeId = "ts_l6_n9";
    ts_l6_n9.eventContext = eventContext_287;
    ts_l6_n9.dataCollector = dataCollector_288;
    ts_l6_n9.upstream1 = ts_l5_n9;
    ts_l6_n9.upstream2 = ts_l5_n0;
    ts_l7_n0.setUpstream1(ts_l6_n0);
    ts_l7_n0.setNodeId("ts_l7_n0");
    ts_l7_n0.setDataCollector(dataCollector_288);
    ts_l7_n0.setEventContext(eventContext_287);
    ts_l7_n0.setUpstream2(ts_l6_n1);
    ts_l7_n0.value = 0.0;
    ts_l7_n0.nodeId = "ts_l7_n0";
    ts_l7_n0.eventContext = eventContext_287;
    ts_l7_n0.dataCollector = dataCollector_288;
    ts_l7_n0.upstream1 = ts_l6_n0;
    ts_l7_n0.upstream2 = ts_l6_n1;
    ts_l7_n1.setUpstream1(ts_l6_n1);
    ts_l7_n1.setNodeId("ts_l7_n1");
    ts_l7_n1.setDataCollector(dataCollector_288);
    ts_l7_n1.setEventContext(eventContext_287);
    ts_l7_n1.setUpstream2(ts_l6_n2);
    ts_l7_n1.value = 0.0;
    ts_l7_n1.nodeId = "ts_l7_n1";
    ts_l7_n1.eventContext = eventContext_287;
    ts_l7_n1.dataCollector = dataCollector_288;
    ts_l7_n1.upstream1 = ts_l6_n1;
    ts_l7_n1.upstream2 = ts_l6_n2;
    ts_l7_n2.setUpstream1(ts_l6_n2);
    ts_l7_n2.setNodeId("ts_l7_n2");
    ts_l7_n2.setDataCollector(dataCollector_288);
    ts_l7_n2.setEventContext(eventContext_287);
    ts_l7_n2.setUpstream2(ts_l6_n3);
    ts_l7_n2.value = 0.0;
    ts_l7_n2.nodeId = "ts_l7_n2";
    ts_l7_n2.eventContext = eventContext_287;
    ts_l7_n2.dataCollector = dataCollector_288;
    ts_l7_n2.upstream1 = ts_l6_n2;
    ts_l7_n2.upstream2 = ts_l6_n3;
    ts_l7_n3.setUpstream1(ts_l6_n3);
    ts_l7_n3.setNodeId("ts_l7_n3");
    ts_l7_n3.setDataCollector(dataCollector_288);
    ts_l7_n3.setEventContext(eventContext_287);
    ts_l7_n3.setUpstream2(ts_l6_n4);
    ts_l7_n3.value = 0.0;
    ts_l7_n3.nodeId = "ts_l7_n3";
    ts_l7_n3.eventContext = eventContext_287;
    ts_l7_n3.dataCollector = dataCollector_288;
    ts_l7_n3.upstream1 = ts_l6_n3;
    ts_l7_n3.upstream2 = ts_l6_n4;
    ts_l7_n4.setUpstream1(ts_l6_n4);
    ts_l7_n4.setNodeId("ts_l7_n4");
    ts_l7_n4.setDataCollector(dataCollector_288);
    ts_l7_n4.setEventContext(eventContext_287);
    ts_l7_n4.setUpstream2(ts_l6_n5);
    ts_l7_n4.value = 0.0;
    ts_l7_n4.nodeId = "ts_l7_n4";
    ts_l7_n4.eventContext = eventContext_287;
    ts_l7_n4.dataCollector = dataCollector_288;
    ts_l7_n4.upstream1 = ts_l6_n4;
    ts_l7_n4.upstream2 = ts_l6_n5;
    ts_l7_n5.setUpstream1(ts_l6_n5);
    ts_l7_n5.setNodeId("ts_l7_n5");
    ts_l7_n5.setDataCollector(dataCollector_288);
    ts_l7_n5.setEventContext(eventContext_287);
    ts_l7_n5.setUpstream2(ts_l6_n6);
    ts_l7_n5.value = 0.0;
    ts_l7_n5.nodeId = "ts_l7_n5";
    ts_l7_n5.eventContext = eventContext_287;
    ts_l7_n5.dataCollector = dataCollector_288;
    ts_l7_n5.upstream1 = ts_l6_n5;
    ts_l7_n5.upstream2 = ts_l6_n6;
    ts_l7_n6.setUpstream1(ts_l6_n6);
    ts_l7_n6.setNodeId("ts_l7_n6");
    ts_l7_n6.setDataCollector(dataCollector_288);
    ts_l7_n6.setEventContext(eventContext_287);
    ts_l7_n6.setUpstream2(ts_l6_n7);
    ts_l7_n6.value = 0.0;
    ts_l7_n6.nodeId = "ts_l7_n6";
    ts_l7_n6.eventContext = eventContext_287;
    ts_l7_n6.dataCollector = dataCollector_288;
    ts_l7_n6.upstream1 = ts_l6_n6;
    ts_l7_n6.upstream2 = ts_l6_n7;
    ts_l7_n7.setUpstream1(ts_l6_n7);
    ts_l7_n7.setNodeId("ts_l7_n7");
    ts_l7_n7.setDataCollector(dataCollector_288);
    ts_l7_n7.setEventContext(eventContext_287);
    ts_l7_n7.setUpstream2(ts_l6_n8);
    ts_l7_n7.value = 0.0;
    ts_l7_n7.nodeId = "ts_l7_n7";
    ts_l7_n7.eventContext = eventContext_287;
    ts_l7_n7.dataCollector = dataCollector_288;
    ts_l7_n7.upstream1 = ts_l6_n7;
    ts_l7_n7.upstream2 = ts_l6_n8;
    ts_l7_n8.setUpstream1(ts_l6_n8);
    ts_l7_n8.setNodeId("ts_l7_n8");
    ts_l7_n8.setDataCollector(dataCollector_288);
    ts_l7_n8.setEventContext(eventContext_287);
    ts_l7_n8.setUpstream2(ts_l6_n9);
    ts_l7_n8.value = 0.0;
    ts_l7_n8.nodeId = "ts_l7_n8";
    ts_l7_n8.eventContext = eventContext_287;
    ts_l7_n8.dataCollector = dataCollector_288;
    ts_l7_n8.upstream1 = ts_l6_n8;
    ts_l7_n8.upstream2 = ts_l6_n9;
    ts_l7_n9.setUpstream1(ts_l6_n9);
    ts_l7_n9.setNodeId("ts_l7_n9");
    ts_l7_n9.setDataCollector(dataCollector_288);
    ts_l7_n9.setEventContext(eventContext_287);
    ts_l7_n9.setUpstream2(ts_l6_n0);
    ts_l7_n9.value = 0.0;
    ts_l7_n9.nodeId = "ts_l7_n9";
    ts_l7_n9.eventContext = eventContext_287;
    ts_l7_n9.dataCollector = dataCollector_288;
    ts_l7_n9.upstream1 = ts_l6_n9;
    ts_l7_n9.upstream2 = ts_l6_n0;
    ts_l8_n0.setUpstream1(ts_l7_n0);
    ts_l8_n0.setNodeId("ts_l8_n0");
    ts_l8_n0.setDataCollector(dataCollector_288);
    ts_l8_n0.setEventContext(eventContext_287);
    ts_l8_n0.setUpstream2(ts_l7_n1);
    ts_l8_n0.value = 0.0;
    ts_l8_n0.nodeId = "ts_l8_n0";
    ts_l8_n0.eventContext = eventContext_287;
    ts_l8_n0.dataCollector = dataCollector_288;
    ts_l8_n0.upstream1 = ts_l7_n0;
    ts_l8_n0.upstream2 = ts_l7_n1;
    ts_l8_n1.setUpstream1(ts_l7_n1);
    ts_l8_n1.setNodeId("ts_l8_n1");
    ts_l8_n1.setDataCollector(dataCollector_288);
    ts_l8_n1.setEventContext(eventContext_287);
    ts_l8_n1.setUpstream2(ts_l7_n2);
    ts_l8_n1.value = 0.0;
    ts_l8_n1.nodeId = "ts_l8_n1";
    ts_l8_n1.eventContext = eventContext_287;
    ts_l8_n1.dataCollector = dataCollector_288;
    ts_l8_n1.upstream1 = ts_l7_n1;
    ts_l8_n1.upstream2 = ts_l7_n2;
    ts_l8_n2.setUpstream1(ts_l7_n2);
    ts_l8_n2.setNodeId("ts_l8_n2");
    ts_l8_n2.setDataCollector(dataCollector_288);
    ts_l8_n2.setEventContext(eventContext_287);
    ts_l8_n2.setUpstream2(ts_l7_n3);
    ts_l8_n2.value = 0.0;
    ts_l8_n2.nodeId = "ts_l8_n2";
    ts_l8_n2.eventContext = eventContext_287;
    ts_l8_n2.dataCollector = dataCollector_288;
    ts_l8_n2.upstream1 = ts_l7_n2;
    ts_l8_n2.upstream2 = ts_l7_n3;
    ts_l8_n3.setUpstream1(ts_l7_n3);
    ts_l8_n3.setNodeId("ts_l8_n3");
    ts_l8_n3.setDataCollector(dataCollector_288);
    ts_l8_n3.setEventContext(eventContext_287);
    ts_l8_n3.setUpstream2(ts_l7_n4);
    ts_l8_n3.value = 0.0;
    ts_l8_n3.nodeId = "ts_l8_n3";
    ts_l8_n3.eventContext = eventContext_287;
    ts_l8_n3.dataCollector = dataCollector_288;
    ts_l8_n3.upstream1 = ts_l7_n3;
    ts_l8_n3.upstream2 = ts_l7_n4;
    ts_l8_n4.setUpstream1(ts_l7_n4);
    ts_l8_n4.setNodeId("ts_l8_n4");
    ts_l8_n4.setDataCollector(dataCollector_288);
    ts_l8_n4.setEventContext(eventContext_287);
    ts_l8_n4.setUpstream2(ts_l7_n5);
    ts_l8_n4.value = 0.0;
    ts_l8_n4.nodeId = "ts_l8_n4";
    ts_l8_n4.eventContext = eventContext_287;
    ts_l8_n4.dataCollector = dataCollector_288;
    ts_l8_n4.upstream1 = ts_l7_n4;
    ts_l8_n4.upstream2 = ts_l7_n5;
    ts_l8_n5.setUpstream1(ts_l7_n5);
    ts_l8_n5.setNodeId("ts_l8_n5");
    ts_l8_n5.setDataCollector(dataCollector_288);
    ts_l8_n5.setEventContext(eventContext_287);
    ts_l8_n5.setUpstream2(ts_l7_n6);
    ts_l8_n5.value = 0.0;
    ts_l8_n5.nodeId = "ts_l8_n5";
    ts_l8_n5.eventContext = eventContext_287;
    ts_l8_n5.dataCollector = dataCollector_288;
    ts_l8_n5.upstream1 = ts_l7_n5;
    ts_l8_n5.upstream2 = ts_l7_n6;
    ts_l8_n6.setUpstream1(ts_l7_n6);
    ts_l8_n6.setNodeId("ts_l8_n6");
    ts_l8_n6.setDataCollector(dataCollector_288);
    ts_l8_n6.setEventContext(eventContext_287);
    ts_l8_n6.setUpstream2(ts_l7_n7);
    ts_l8_n6.value = 0.0;
    ts_l8_n6.nodeId = "ts_l8_n6";
    ts_l8_n6.eventContext = eventContext_287;
    ts_l8_n6.dataCollector = dataCollector_288;
    ts_l8_n6.upstream1 = ts_l7_n6;
    ts_l8_n6.upstream2 = ts_l7_n7;
    ts_l8_n7.setUpstream1(ts_l7_n7);
    ts_l8_n7.setNodeId("ts_l8_n7");
    ts_l8_n7.setDataCollector(dataCollector_288);
    ts_l8_n7.setEventContext(eventContext_287);
    ts_l8_n7.setUpstream2(ts_l7_n8);
    ts_l8_n7.value = 0.0;
    ts_l8_n7.nodeId = "ts_l8_n7";
    ts_l8_n7.eventContext = eventContext_287;
    ts_l8_n7.dataCollector = dataCollector_288;
    ts_l8_n7.upstream1 = ts_l7_n7;
    ts_l8_n7.upstream2 = ts_l7_n8;
    ts_l8_n8.setUpstream1(ts_l7_n8);
    ts_l8_n8.setNodeId("ts_l8_n8");
    ts_l8_n8.setDataCollector(dataCollector_288);
    ts_l8_n8.setEventContext(eventContext_287);
    ts_l8_n8.setUpstream2(ts_l7_n9);
    ts_l8_n8.value = 0.0;
    ts_l8_n8.nodeId = "ts_l8_n8";
    ts_l8_n8.eventContext = eventContext_287;
    ts_l8_n8.dataCollector = dataCollector_288;
    ts_l8_n8.upstream1 = ts_l7_n8;
    ts_l8_n8.upstream2 = ts_l7_n9;
    ts_l8_n9.setUpstream1(ts_l7_n9);
    ts_l8_n9.setNodeId("ts_l8_n9");
    ts_l8_n9.setDataCollector(dataCollector_288);
    ts_l8_n9.setEventContext(eventContext_287);
    ts_l8_n9.setUpstream2(ts_l7_n0);
    ts_l8_n9.value = 0.0;
    ts_l8_n9.nodeId = "ts_l8_n9";
    ts_l8_n9.eventContext = eventContext_287;
    ts_l8_n9.dataCollector = dataCollector_288;
    ts_l8_n9.upstream1 = ts_l7_n9;
    ts_l8_n9.upstream2 = ts_l7_n0;
    ts_l9_n0.setUpstream1(ts_l8_n0);
    ts_l9_n0.setNodeId("ts_l9_n0");
    ts_l9_n0.setDataCollector(dataCollector_288);
    ts_l9_n0.setEventContext(eventContext_287);
    ts_l9_n0.setUpstream2(ts_l8_n1);
    ts_l9_n0.value = 0.0;
    ts_l9_n0.nodeId = "ts_l9_n0";
    ts_l9_n0.eventContext = eventContext_287;
    ts_l9_n0.dataCollector = dataCollector_288;
    ts_l9_n0.upstream1 = ts_l8_n0;
    ts_l9_n0.upstream2 = ts_l8_n1;
    ts_l9_n1.setUpstream1(ts_l8_n1);
    ts_l9_n1.setNodeId("ts_l9_n1");
    ts_l9_n1.setDataCollector(dataCollector_288);
    ts_l9_n1.setEventContext(eventContext_287);
    ts_l9_n1.setUpstream2(ts_l8_n2);
    ts_l9_n1.value = 0.0;
    ts_l9_n1.nodeId = "ts_l9_n1";
    ts_l9_n1.eventContext = eventContext_287;
    ts_l9_n1.dataCollector = dataCollector_288;
    ts_l9_n1.upstream1 = ts_l8_n1;
    ts_l9_n1.upstream2 = ts_l8_n2;
    ts_l9_n2.setUpstream1(ts_l8_n2);
    ts_l9_n2.setNodeId("ts_l9_n2");
    ts_l9_n2.setDataCollector(dataCollector_288);
    ts_l9_n2.setEventContext(eventContext_287);
    ts_l9_n2.setUpstream2(ts_l8_n3);
    ts_l9_n2.value = 0.0;
    ts_l9_n2.nodeId = "ts_l9_n2";
    ts_l9_n2.eventContext = eventContext_287;
    ts_l9_n2.dataCollector = dataCollector_288;
    ts_l9_n2.upstream1 = ts_l8_n2;
    ts_l9_n2.upstream2 = ts_l8_n3;
    ts_l9_n3.setUpstream1(ts_l8_n3);
    ts_l9_n3.setNodeId("ts_l9_n3");
    ts_l9_n3.setDataCollector(dataCollector_288);
    ts_l9_n3.setEventContext(eventContext_287);
    ts_l9_n3.setUpstream2(ts_l8_n4);
    ts_l9_n3.value = 0.0;
    ts_l9_n3.nodeId = "ts_l9_n3";
    ts_l9_n3.eventContext = eventContext_287;
    ts_l9_n3.dataCollector = dataCollector_288;
    ts_l9_n3.upstream1 = ts_l8_n3;
    ts_l9_n3.upstream2 = ts_l8_n4;
    ts_l9_n4.setUpstream1(ts_l8_n4);
    ts_l9_n4.setNodeId("ts_l9_n4");
    ts_l9_n4.setDataCollector(dataCollector_288);
    ts_l9_n4.setEventContext(eventContext_287);
    ts_l9_n4.setUpstream2(ts_l8_n5);
    ts_l9_n4.value = 0.0;
    ts_l9_n4.nodeId = "ts_l9_n4";
    ts_l9_n4.eventContext = eventContext_287;
    ts_l9_n4.dataCollector = dataCollector_288;
    ts_l9_n4.upstream1 = ts_l8_n4;
    ts_l9_n4.upstream2 = ts_l8_n5;
    ts_l9_n5.setUpstream1(ts_l8_n5);
    ts_l9_n5.setNodeId("ts_l9_n5");
    ts_l9_n5.setDataCollector(dataCollector_288);
    ts_l9_n5.setEventContext(eventContext_287);
    ts_l9_n5.setUpstream2(ts_l8_n6);
    ts_l9_n5.value = 0.0;
    ts_l9_n5.nodeId = "ts_l9_n5";
    ts_l9_n5.eventContext = eventContext_287;
    ts_l9_n5.dataCollector = dataCollector_288;
    ts_l9_n5.upstream1 = ts_l8_n5;
    ts_l9_n5.upstream2 = ts_l8_n6;
    ts_l9_n6.setUpstream1(ts_l8_n6);
    ts_l9_n6.setNodeId("ts_l9_n6");
    ts_l9_n6.setDataCollector(dataCollector_288);
    ts_l9_n6.setEventContext(eventContext_287);
    ts_l9_n6.setUpstream2(ts_l8_n7);
    ts_l9_n6.value = 0.0;
    ts_l9_n6.nodeId = "ts_l9_n6";
    ts_l9_n6.eventContext = eventContext_287;
    ts_l9_n6.dataCollector = dataCollector_288;
    ts_l9_n6.upstream1 = ts_l8_n6;
    ts_l9_n6.upstream2 = ts_l8_n7;
    ts_l9_n7.setUpstream1(ts_l8_n7);
    ts_l9_n7.setNodeId("ts_l9_n7");
    ts_l9_n7.setDataCollector(dataCollector_288);
    ts_l9_n7.setEventContext(eventContext_287);
    ts_l9_n7.setUpstream2(ts_l8_n8);
    ts_l9_n7.value = 0.0;
    ts_l9_n7.nodeId = "ts_l9_n7";
    ts_l9_n7.eventContext = eventContext_287;
    ts_l9_n7.dataCollector = dataCollector_288;
    ts_l9_n7.upstream1 = ts_l8_n7;
    ts_l9_n7.upstream2 = ts_l8_n8;
    ts_l9_n8.setUpstream1(ts_l8_n8);
    ts_l9_n8.setNodeId("ts_l9_n8");
    ts_l9_n8.setDataCollector(dataCollector_288);
    ts_l9_n8.setEventContext(eventContext_287);
    ts_l9_n8.setUpstream2(ts_l8_n9);
    ts_l9_n8.value = 0.0;
    ts_l9_n8.nodeId = "ts_l9_n8";
    ts_l9_n8.eventContext = eventContext_287;
    ts_l9_n8.dataCollector = dataCollector_288;
    ts_l9_n8.upstream1 = ts_l8_n8;
    ts_l9_n8.upstream2 = ts_l8_n9;
    ts_l9_n9.setUpstream1(ts_l8_n9);
    ts_l9_n9.setNodeId("ts_l9_n9");
    ts_l9_n9.setDataCollector(dataCollector_288);
    ts_l9_n9.setEventContext(eventContext_287);
    ts_l9_n9.setUpstream2(ts_l8_n0);
    ts_l9_n9.value = 0.0;
    ts_l9_n9.nodeId = "ts_l9_n9";
    ts_l9_n9.eventContext = eventContext_287;
    ts_l9_n9.dataCollector = dataCollector_288;
    ts_l9_n9.upstream1 = ts_l8_n9;
    ts_l9_n9.upstream2 = ts_l8_n0;
    ctrl_l1_n0.setUpstream1(ctrl_root);
    ctrl_l1_n0.setNodeId("ctrl_l1_n0");
    ctrl_l1_n0.setDataCollector(dataCollector_288);
    ctrl_l1_n0.setEventContext(eventContext_287);
    ctrl_l1_n0.value = 0.0;
    ctrl_l1_n0.nodeId = "ctrl_l1_n0";
    ctrl_l1_n0.eventContext = eventContext_287;
    ctrl_l1_n0.dataCollector = dataCollector_288;
    ctrl_l1_n0.upstream1 = ctrl_root;
    ctrl_l1_n1.setUpstream1(ctrl_root);
    ctrl_l1_n1.setNodeId("ctrl_l1_n1");
    ctrl_l1_n1.setDataCollector(dataCollector_288);
    ctrl_l1_n1.setEventContext(eventContext_287);
    ctrl_l1_n1.value = 0.0;
    ctrl_l1_n1.nodeId = "ctrl_l1_n1";
    ctrl_l1_n1.eventContext = eventContext_287;
    ctrl_l1_n1.dataCollector = dataCollector_288;
    ctrl_l1_n1.upstream1 = ctrl_root;
    ctrl_l1_n2.setUpstream1(ctrl_root);
    ctrl_l1_n2.setNodeId("ctrl_l1_n2");
    ctrl_l1_n2.setDataCollector(dataCollector_288);
    ctrl_l1_n2.setEventContext(eventContext_287);
    ctrl_l1_n2.value = 0.0;
    ctrl_l1_n2.nodeId = "ctrl_l1_n2";
    ctrl_l1_n2.eventContext = eventContext_287;
    ctrl_l1_n2.dataCollector = dataCollector_288;
    ctrl_l1_n2.upstream1 = ctrl_root;
    ctrl_l1_n3.setUpstream1(ctrl_root);
    ctrl_l1_n3.setNodeId("ctrl_l1_n3");
    ctrl_l1_n3.setDataCollector(dataCollector_288);
    ctrl_l1_n3.setEventContext(eventContext_287);
    ctrl_l1_n3.value = 0.0;
    ctrl_l1_n3.nodeId = "ctrl_l1_n3";
    ctrl_l1_n3.eventContext = eventContext_287;
    ctrl_l1_n3.dataCollector = dataCollector_288;
    ctrl_l1_n3.upstream1 = ctrl_root;
    ctrl_l1_n4.setUpstream1(ctrl_root);
    ctrl_l1_n4.setNodeId("ctrl_l1_n4");
    ctrl_l1_n4.setDataCollector(dataCollector_288);
    ctrl_l1_n4.setEventContext(eventContext_287);
    ctrl_l1_n4.value = 0.0;
    ctrl_l1_n4.nodeId = "ctrl_l1_n4";
    ctrl_l1_n4.eventContext = eventContext_287;
    ctrl_l1_n4.dataCollector = dataCollector_288;
    ctrl_l1_n4.upstream1 = ctrl_root;
    ctrl_l1_n5.setUpstream1(ctrl_root);
    ctrl_l1_n5.setNodeId("ctrl_l1_n5");
    ctrl_l1_n5.setDataCollector(dataCollector_288);
    ctrl_l1_n5.setEventContext(eventContext_287);
    ctrl_l1_n5.value = 0.0;
    ctrl_l1_n5.nodeId = "ctrl_l1_n5";
    ctrl_l1_n5.eventContext = eventContext_287;
    ctrl_l1_n5.dataCollector = dataCollector_288;
    ctrl_l1_n5.upstream1 = ctrl_root;
    ctrl_l1_n6.setUpstream1(ctrl_root);
    ctrl_l1_n6.setNodeId("ctrl_l1_n6");
    ctrl_l1_n6.setDataCollector(dataCollector_288);
    ctrl_l1_n6.setEventContext(eventContext_287);
    ctrl_l1_n6.value = 0.0;
    ctrl_l1_n6.nodeId = "ctrl_l1_n6";
    ctrl_l1_n6.eventContext = eventContext_287;
    ctrl_l1_n6.dataCollector = dataCollector_288;
    ctrl_l1_n6.upstream1 = ctrl_root;
    ctrl_l1_n7.setUpstream1(ctrl_root);
    ctrl_l1_n7.setNodeId("ctrl_l1_n7");
    ctrl_l1_n7.setDataCollector(dataCollector_288);
    ctrl_l1_n7.setEventContext(eventContext_287);
    ctrl_l1_n7.value = 0.0;
    ctrl_l1_n7.nodeId = "ctrl_l1_n7";
    ctrl_l1_n7.eventContext = eventContext_287;
    ctrl_l1_n7.dataCollector = dataCollector_288;
    ctrl_l1_n7.upstream1 = ctrl_root;
    ctrl_l1_n8.setUpstream1(ctrl_root);
    ctrl_l1_n8.setNodeId("ctrl_l1_n8");
    ctrl_l1_n8.setDataCollector(dataCollector_288);
    ctrl_l1_n8.setEventContext(eventContext_287);
    ctrl_l1_n8.value = 0.0;
    ctrl_l1_n8.nodeId = "ctrl_l1_n8";
    ctrl_l1_n8.eventContext = eventContext_287;
    ctrl_l1_n8.dataCollector = dataCollector_288;
    ctrl_l1_n8.upstream1 = ctrl_root;
    ctrl_l1_n9.setUpstream1(ctrl_root);
    ctrl_l1_n9.setNodeId("ctrl_l1_n9");
    ctrl_l1_n9.setDataCollector(dataCollector_288);
    ctrl_l1_n9.setEventContext(eventContext_287);
    ctrl_l1_n9.value = 0.0;
    ctrl_l1_n9.nodeId = "ctrl_l1_n9";
    ctrl_l1_n9.eventContext = eventContext_287;
    ctrl_l1_n9.dataCollector = dataCollector_288;
    ctrl_l1_n9.upstream1 = ctrl_root;
    ctrl_l2_n0.setUpstream1(ctrl_l1_n0);
    ctrl_l2_n0.setNodeId("ctrl_l2_n0");
    ctrl_l2_n0.setDataCollector(dataCollector_288);
    ctrl_l2_n0.setEventContext(eventContext_287);
    ctrl_l2_n0.value = 0.0;
    ctrl_l2_n0.nodeId = "ctrl_l2_n0";
    ctrl_l2_n0.eventContext = eventContext_287;
    ctrl_l2_n0.dataCollector = dataCollector_288;
    ctrl_l2_n0.upstream1 = ctrl_l1_n0;
    ctrl_l2_n1.setUpstream1(ctrl_l1_n1);
    ctrl_l2_n1.setNodeId("ctrl_l2_n1");
    ctrl_l2_n1.setDataCollector(dataCollector_288);
    ctrl_l2_n1.setEventContext(eventContext_287);
    ctrl_l2_n1.value = 0.0;
    ctrl_l2_n1.nodeId = "ctrl_l2_n1";
    ctrl_l2_n1.eventContext = eventContext_287;
    ctrl_l2_n1.dataCollector = dataCollector_288;
    ctrl_l2_n1.upstream1 = ctrl_l1_n1;
    ctrl_l2_n2.setUpstream1(ctrl_l1_n2);
    ctrl_l2_n2.setNodeId("ctrl_l2_n2");
    ctrl_l2_n2.setDataCollector(dataCollector_288);
    ctrl_l2_n2.setEventContext(eventContext_287);
    ctrl_l2_n2.value = 0.0;
    ctrl_l2_n2.nodeId = "ctrl_l2_n2";
    ctrl_l2_n2.eventContext = eventContext_287;
    ctrl_l2_n2.dataCollector = dataCollector_288;
    ctrl_l2_n2.upstream1 = ctrl_l1_n2;
    ctrl_l2_n3.setUpstream1(ctrl_l1_n3);
    ctrl_l2_n3.setNodeId("ctrl_l2_n3");
    ctrl_l2_n3.setDataCollector(dataCollector_288);
    ctrl_l2_n3.setEventContext(eventContext_287);
    ctrl_l2_n3.value = 0.0;
    ctrl_l2_n3.nodeId = "ctrl_l2_n3";
    ctrl_l2_n3.eventContext = eventContext_287;
    ctrl_l2_n3.dataCollector = dataCollector_288;
    ctrl_l2_n3.upstream1 = ctrl_l1_n3;
    ctrl_l2_n4.setUpstream1(ctrl_l1_n4);
    ctrl_l2_n4.setNodeId("ctrl_l2_n4");
    ctrl_l2_n4.setDataCollector(dataCollector_288);
    ctrl_l2_n4.setEventContext(eventContext_287);
    ctrl_l2_n4.value = 0.0;
    ctrl_l2_n4.nodeId = "ctrl_l2_n4";
    ctrl_l2_n4.eventContext = eventContext_287;
    ctrl_l2_n4.dataCollector = dataCollector_288;
    ctrl_l2_n4.upstream1 = ctrl_l1_n4;
    ctrl_l2_n5.setUpstream1(ctrl_l1_n5);
    ctrl_l2_n5.setNodeId("ctrl_l2_n5");
    ctrl_l2_n5.setDataCollector(dataCollector_288);
    ctrl_l2_n5.setEventContext(eventContext_287);
    ctrl_l2_n5.value = 0.0;
    ctrl_l2_n5.nodeId = "ctrl_l2_n5";
    ctrl_l2_n5.eventContext = eventContext_287;
    ctrl_l2_n5.dataCollector = dataCollector_288;
    ctrl_l2_n5.upstream1 = ctrl_l1_n5;
    ctrl_l2_n6.setUpstream1(ctrl_l1_n6);
    ctrl_l2_n6.setNodeId("ctrl_l2_n6");
    ctrl_l2_n6.setDataCollector(dataCollector_288);
    ctrl_l2_n6.setEventContext(eventContext_287);
    ctrl_l2_n6.value = 0.0;
    ctrl_l2_n6.nodeId = "ctrl_l2_n6";
    ctrl_l2_n6.eventContext = eventContext_287;
    ctrl_l2_n6.dataCollector = dataCollector_288;
    ctrl_l2_n6.upstream1 = ctrl_l1_n6;
    ctrl_l2_n7.setUpstream1(ctrl_l1_n7);
    ctrl_l2_n7.setNodeId("ctrl_l2_n7");
    ctrl_l2_n7.setDataCollector(dataCollector_288);
    ctrl_l2_n7.setEventContext(eventContext_287);
    ctrl_l2_n7.value = 0.0;
    ctrl_l2_n7.nodeId = "ctrl_l2_n7";
    ctrl_l2_n7.eventContext = eventContext_287;
    ctrl_l2_n7.dataCollector = dataCollector_288;
    ctrl_l2_n7.upstream1 = ctrl_l1_n7;
    ctrl_l2_n8.setUpstream1(ctrl_l1_n8);
    ctrl_l2_n8.setNodeId("ctrl_l2_n8");
    ctrl_l2_n8.setDataCollector(dataCollector_288);
    ctrl_l2_n8.setEventContext(eventContext_287);
    ctrl_l2_n8.value = 0.0;
    ctrl_l2_n8.nodeId = "ctrl_l2_n8";
    ctrl_l2_n8.eventContext = eventContext_287;
    ctrl_l2_n8.dataCollector = dataCollector_288;
    ctrl_l2_n8.upstream1 = ctrl_l1_n8;
    ctrl_l2_n9.setUpstream1(ctrl_l1_n9);
    ctrl_l2_n9.setNodeId("ctrl_l2_n9");
    ctrl_l2_n9.setDataCollector(dataCollector_288);
    ctrl_l2_n9.setEventContext(eventContext_287);
    ctrl_l2_n9.value = 0.0;
    ctrl_l2_n9.nodeId = "ctrl_l2_n9";
    ctrl_l2_n9.eventContext = eventContext_287;
    ctrl_l2_n9.dataCollector = dataCollector_288;
    ctrl_l2_n9.upstream1 = ctrl_l1_n9;
    ctrl_l3_n0.setUpstream1(ctrl_l2_n0);
    ctrl_l3_n0.setNodeId("ctrl_l3_n0");
    ctrl_l3_n0.setDataCollector(dataCollector_288);
    ctrl_l3_n0.setEventContext(eventContext_287);
    ctrl_l3_n0.value = 0.0;
    ctrl_l3_n0.nodeId = "ctrl_l3_n0";
    ctrl_l3_n0.eventContext = eventContext_287;
    ctrl_l3_n0.dataCollector = dataCollector_288;
    ctrl_l3_n0.upstream1 = ctrl_l2_n0;
    ctrl_l3_n1.setUpstream1(ctrl_l2_n1);
    ctrl_l3_n1.setNodeId("ctrl_l3_n1");
    ctrl_l3_n1.setDataCollector(dataCollector_288);
    ctrl_l3_n1.setEventContext(eventContext_287);
    ctrl_l3_n1.value = 0.0;
    ctrl_l3_n1.nodeId = "ctrl_l3_n1";
    ctrl_l3_n1.eventContext = eventContext_287;
    ctrl_l3_n1.dataCollector = dataCollector_288;
    ctrl_l3_n1.upstream1 = ctrl_l2_n1;
    ctrl_l3_n2.setUpstream1(ctrl_l2_n2);
    ctrl_l3_n2.setNodeId("ctrl_l3_n2");
    ctrl_l3_n2.setDataCollector(dataCollector_288);
    ctrl_l3_n2.setEventContext(eventContext_287);
    ctrl_l3_n2.value = 0.0;
    ctrl_l3_n2.nodeId = "ctrl_l3_n2";
    ctrl_l3_n2.eventContext = eventContext_287;
    ctrl_l3_n2.dataCollector = dataCollector_288;
    ctrl_l3_n2.upstream1 = ctrl_l2_n2;
    ctrl_l3_n3.setUpstream1(ctrl_l2_n3);
    ctrl_l3_n3.setNodeId("ctrl_l3_n3");
    ctrl_l3_n3.setDataCollector(dataCollector_288);
    ctrl_l3_n3.setEventContext(eventContext_287);
    ctrl_l3_n3.value = 0.0;
    ctrl_l3_n3.nodeId = "ctrl_l3_n3";
    ctrl_l3_n3.eventContext = eventContext_287;
    ctrl_l3_n3.dataCollector = dataCollector_288;
    ctrl_l3_n3.upstream1 = ctrl_l2_n3;
    ctrl_l3_n4.setUpstream1(ctrl_l2_n4);
    ctrl_l3_n4.setNodeId("ctrl_l3_n4");
    ctrl_l3_n4.setDataCollector(dataCollector_288);
    ctrl_l3_n4.setEventContext(eventContext_287);
    ctrl_l3_n4.value = 0.0;
    ctrl_l3_n4.nodeId = "ctrl_l3_n4";
    ctrl_l3_n4.eventContext = eventContext_287;
    ctrl_l3_n4.dataCollector = dataCollector_288;
    ctrl_l3_n4.upstream1 = ctrl_l2_n4;
    ctrl_l3_n5.setUpstream1(ctrl_l2_n5);
    ctrl_l3_n5.setNodeId("ctrl_l3_n5");
    ctrl_l3_n5.setDataCollector(dataCollector_288);
    ctrl_l3_n5.setEventContext(eventContext_287);
    ctrl_l3_n5.value = 0.0;
    ctrl_l3_n5.nodeId = "ctrl_l3_n5";
    ctrl_l3_n5.eventContext = eventContext_287;
    ctrl_l3_n5.dataCollector = dataCollector_288;
    ctrl_l3_n5.upstream1 = ctrl_l2_n5;
    ctrl_l3_n6.setUpstream1(ctrl_l2_n6);
    ctrl_l3_n6.setNodeId("ctrl_l3_n6");
    ctrl_l3_n6.setDataCollector(dataCollector_288);
    ctrl_l3_n6.setEventContext(eventContext_287);
    ctrl_l3_n6.value = 0.0;
    ctrl_l3_n6.nodeId = "ctrl_l3_n6";
    ctrl_l3_n6.eventContext = eventContext_287;
    ctrl_l3_n6.dataCollector = dataCollector_288;
    ctrl_l3_n6.upstream1 = ctrl_l2_n6;
    ctrl_l3_n7.setUpstream1(ctrl_l2_n7);
    ctrl_l3_n7.setNodeId("ctrl_l3_n7");
    ctrl_l3_n7.setDataCollector(dataCollector_288);
    ctrl_l3_n7.setEventContext(eventContext_287);
    ctrl_l3_n7.value = 0.0;
    ctrl_l3_n7.nodeId = "ctrl_l3_n7";
    ctrl_l3_n7.eventContext = eventContext_287;
    ctrl_l3_n7.dataCollector = dataCollector_288;
    ctrl_l3_n7.upstream1 = ctrl_l2_n7;
    ctrl_l3_n8.setUpstream1(ctrl_l2_n8);
    ctrl_l3_n8.setNodeId("ctrl_l3_n8");
    ctrl_l3_n8.setDataCollector(dataCollector_288);
    ctrl_l3_n8.setEventContext(eventContext_287);
    ctrl_l3_n8.value = 0.0;
    ctrl_l3_n8.nodeId = "ctrl_l3_n8";
    ctrl_l3_n8.eventContext = eventContext_287;
    ctrl_l3_n8.dataCollector = dataCollector_288;
    ctrl_l3_n8.upstream1 = ctrl_l2_n8;
    ctrl_l3_n9.setUpstream1(ctrl_l2_n9);
    ctrl_l3_n9.setNodeId("ctrl_l3_n9");
    ctrl_l3_n9.setDataCollector(dataCollector_288);
    ctrl_l3_n9.setEventContext(eventContext_287);
    ctrl_l3_n9.value = 0.0;
    ctrl_l3_n9.nodeId = "ctrl_l3_n9";
    ctrl_l3_n9.eventContext = eventContext_287;
    ctrl_l3_n9.dataCollector = dataCollector_288;
    ctrl_l3_n9.upstream1 = ctrl_l2_n9;
    ctrl_l4_n0.setUpstream1(ctrl_l3_n0);
    ctrl_l4_n0.setNodeId("ctrl_l4_n0");
    ctrl_l4_n0.setDataCollector(dataCollector_288);
    ctrl_l4_n0.setEventContext(eventContext_287);
    ctrl_l4_n0.value = 0.0;
    ctrl_l4_n0.nodeId = "ctrl_l4_n0";
    ctrl_l4_n0.eventContext = eventContext_287;
    ctrl_l4_n0.dataCollector = dataCollector_288;
    ctrl_l4_n0.upstream1 = ctrl_l3_n0;
    ctrl_l4_n1.setUpstream1(ctrl_l3_n1);
    ctrl_l4_n1.setNodeId("ctrl_l4_n1");
    ctrl_l4_n1.setDataCollector(dataCollector_288);
    ctrl_l4_n1.setEventContext(eventContext_287);
    ctrl_l4_n1.value = 0.0;
    ctrl_l4_n1.nodeId = "ctrl_l4_n1";
    ctrl_l4_n1.eventContext = eventContext_287;
    ctrl_l4_n1.dataCollector = dataCollector_288;
    ctrl_l4_n1.upstream1 = ctrl_l3_n1;
    ctrl_l4_n2.setUpstream1(ctrl_l3_n2);
    ctrl_l4_n2.setNodeId("ctrl_l4_n2");
    ctrl_l4_n2.setDataCollector(dataCollector_288);
    ctrl_l4_n2.setEventContext(eventContext_287);
    ctrl_l4_n2.value = 0.0;
    ctrl_l4_n2.nodeId = "ctrl_l4_n2";
    ctrl_l4_n2.eventContext = eventContext_287;
    ctrl_l4_n2.dataCollector = dataCollector_288;
    ctrl_l4_n2.upstream1 = ctrl_l3_n2;
    ctrl_l4_n3.setUpstream1(ctrl_l3_n3);
    ctrl_l4_n3.setNodeId("ctrl_l4_n3");
    ctrl_l4_n3.setDataCollector(dataCollector_288);
    ctrl_l4_n3.setEventContext(eventContext_287);
    ctrl_l4_n3.value = 0.0;
    ctrl_l4_n3.nodeId = "ctrl_l4_n3";
    ctrl_l4_n3.eventContext = eventContext_287;
    ctrl_l4_n3.dataCollector = dataCollector_288;
    ctrl_l4_n3.upstream1 = ctrl_l3_n3;
    ctrl_l4_n4.setUpstream1(ctrl_l3_n4);
    ctrl_l4_n4.setNodeId("ctrl_l4_n4");
    ctrl_l4_n4.setDataCollector(dataCollector_288);
    ctrl_l4_n4.setEventContext(eventContext_287);
    ctrl_l4_n4.value = 0.0;
    ctrl_l4_n4.nodeId = "ctrl_l4_n4";
    ctrl_l4_n4.eventContext = eventContext_287;
    ctrl_l4_n4.dataCollector = dataCollector_288;
    ctrl_l4_n4.upstream1 = ctrl_l3_n4;
    ctrl_l4_n5.setUpstream1(ctrl_l3_n5);
    ctrl_l4_n5.setNodeId("ctrl_l4_n5");
    ctrl_l4_n5.setDataCollector(dataCollector_288);
    ctrl_l4_n5.setEventContext(eventContext_287);
    ctrl_l4_n5.value = 0.0;
    ctrl_l4_n5.nodeId = "ctrl_l4_n5";
    ctrl_l4_n5.eventContext = eventContext_287;
    ctrl_l4_n5.dataCollector = dataCollector_288;
    ctrl_l4_n5.upstream1 = ctrl_l3_n5;
    ctrl_l4_n6.setUpstream1(ctrl_l3_n6);
    ctrl_l4_n6.setNodeId("ctrl_l4_n6");
    ctrl_l4_n6.setDataCollector(dataCollector_288);
    ctrl_l4_n6.setEventContext(eventContext_287);
    ctrl_l4_n6.value = 0.0;
    ctrl_l4_n6.nodeId = "ctrl_l4_n6";
    ctrl_l4_n6.eventContext = eventContext_287;
    ctrl_l4_n6.dataCollector = dataCollector_288;
    ctrl_l4_n6.upstream1 = ctrl_l3_n6;
    ctrl_l4_n7.setUpstream1(ctrl_l3_n7);
    ctrl_l4_n7.setNodeId("ctrl_l4_n7");
    ctrl_l4_n7.setDataCollector(dataCollector_288);
    ctrl_l4_n7.setEventContext(eventContext_287);
    ctrl_l4_n7.value = 0.0;
    ctrl_l4_n7.nodeId = "ctrl_l4_n7";
    ctrl_l4_n7.eventContext = eventContext_287;
    ctrl_l4_n7.dataCollector = dataCollector_288;
    ctrl_l4_n7.upstream1 = ctrl_l3_n7;
    ctrl_l4_n8.setUpstream1(ctrl_l3_n8);
    ctrl_l4_n8.setNodeId("ctrl_l4_n8");
    ctrl_l4_n8.setDataCollector(dataCollector_288);
    ctrl_l4_n8.setEventContext(eventContext_287);
    ctrl_l4_n8.value = 0.0;
    ctrl_l4_n8.nodeId = "ctrl_l4_n8";
    ctrl_l4_n8.eventContext = eventContext_287;
    ctrl_l4_n8.dataCollector = dataCollector_288;
    ctrl_l4_n8.upstream1 = ctrl_l3_n8;
    ctrl_l4_n9.setUpstream1(ctrl_l3_n9);
    ctrl_l4_n9.setNodeId("ctrl_l4_n9");
    ctrl_l4_n9.setDataCollector(dataCollector_288);
    ctrl_l4_n9.setEventContext(eventContext_287);
    ctrl_l4_n9.value = 0.0;
    ctrl_l4_n9.nodeId = "ctrl_l4_n9";
    ctrl_l4_n9.eventContext = eventContext_287;
    ctrl_l4_n9.dataCollector = dataCollector_288;
    ctrl_l4_n9.upstream1 = ctrl_l3_n9;
    ctrl_l5_n0.setUpstream1(ctrl_l4_n0);
    ctrl_l5_n0.setNodeId("ctrl_l5_n0");
    ctrl_l5_n0.setDataCollector(dataCollector_288);
    ctrl_l5_n0.setEventContext(eventContext_287);
    ctrl_l5_n0.value = 0.0;
    ctrl_l5_n0.nodeId = "ctrl_l5_n0";
    ctrl_l5_n0.eventContext = eventContext_287;
    ctrl_l5_n0.dataCollector = dataCollector_288;
    ctrl_l5_n0.upstream1 = ctrl_l4_n0;
    ctrl_l5_n1.setUpstream1(ctrl_l4_n1);
    ctrl_l5_n1.setNodeId("ctrl_l5_n1");
    ctrl_l5_n1.setDataCollector(dataCollector_288);
    ctrl_l5_n1.setEventContext(eventContext_287);
    ctrl_l5_n1.value = 0.0;
    ctrl_l5_n1.nodeId = "ctrl_l5_n1";
    ctrl_l5_n1.eventContext = eventContext_287;
    ctrl_l5_n1.dataCollector = dataCollector_288;
    ctrl_l5_n1.upstream1 = ctrl_l4_n1;
    ctrl_l5_n2.setUpstream1(ctrl_l4_n2);
    ctrl_l5_n2.setNodeId("ctrl_l5_n2");
    ctrl_l5_n2.setDataCollector(dataCollector_288);
    ctrl_l5_n2.setEventContext(eventContext_287);
    ctrl_l5_n2.value = 0.0;
    ctrl_l5_n2.nodeId = "ctrl_l5_n2";
    ctrl_l5_n2.eventContext = eventContext_287;
    ctrl_l5_n2.dataCollector = dataCollector_288;
    ctrl_l5_n2.upstream1 = ctrl_l4_n2;
    ctrl_l5_n3.setUpstream1(ctrl_l4_n3);
    ctrl_l5_n3.setNodeId("ctrl_l5_n3");
    ctrl_l5_n3.setDataCollector(dataCollector_288);
    ctrl_l5_n3.setEventContext(eventContext_287);
    ctrl_l5_n3.value = 0.0;
    ctrl_l5_n3.nodeId = "ctrl_l5_n3";
    ctrl_l5_n3.eventContext = eventContext_287;
    ctrl_l5_n3.dataCollector = dataCollector_288;
    ctrl_l5_n3.upstream1 = ctrl_l4_n3;
    ctrl_l5_n4.setUpstream1(ctrl_l4_n4);
    ctrl_l5_n4.setNodeId("ctrl_l5_n4");
    ctrl_l5_n4.setDataCollector(dataCollector_288);
    ctrl_l5_n4.setEventContext(eventContext_287);
    ctrl_l5_n4.value = 0.0;
    ctrl_l5_n4.nodeId = "ctrl_l5_n4";
    ctrl_l5_n4.eventContext = eventContext_287;
    ctrl_l5_n4.dataCollector = dataCollector_288;
    ctrl_l5_n4.upstream1 = ctrl_l4_n4;
    ctrl_l5_n5.setUpstream1(ctrl_l4_n5);
    ctrl_l5_n5.setNodeId("ctrl_l5_n5");
    ctrl_l5_n5.setDataCollector(dataCollector_288);
    ctrl_l5_n5.setEventContext(eventContext_287);
    ctrl_l5_n5.value = 0.0;
    ctrl_l5_n5.nodeId = "ctrl_l5_n5";
    ctrl_l5_n5.eventContext = eventContext_287;
    ctrl_l5_n5.dataCollector = dataCollector_288;
    ctrl_l5_n5.upstream1 = ctrl_l4_n5;
    ctrl_l5_n6.setUpstream1(ctrl_l4_n6);
    ctrl_l5_n6.setNodeId("ctrl_l5_n6");
    ctrl_l5_n6.setDataCollector(dataCollector_288);
    ctrl_l5_n6.setEventContext(eventContext_287);
    ctrl_l5_n6.value = 0.0;
    ctrl_l5_n6.nodeId = "ctrl_l5_n6";
    ctrl_l5_n6.eventContext = eventContext_287;
    ctrl_l5_n6.dataCollector = dataCollector_288;
    ctrl_l5_n6.upstream1 = ctrl_l4_n6;
    ctrl_l5_n7.setUpstream1(ctrl_l4_n7);
    ctrl_l5_n7.setNodeId("ctrl_l5_n7");
    ctrl_l5_n7.setDataCollector(dataCollector_288);
    ctrl_l5_n7.setEventContext(eventContext_287);
    ctrl_l5_n7.value = 0.0;
    ctrl_l5_n7.nodeId = "ctrl_l5_n7";
    ctrl_l5_n7.eventContext = eventContext_287;
    ctrl_l5_n7.dataCollector = dataCollector_288;
    ctrl_l5_n7.upstream1 = ctrl_l4_n7;
    ctrl_l5_n8.setUpstream1(ctrl_l4_n8);
    ctrl_l5_n8.setNodeId("ctrl_l5_n8");
    ctrl_l5_n8.setDataCollector(dataCollector_288);
    ctrl_l5_n8.setEventContext(eventContext_287);
    ctrl_l5_n8.value = 0.0;
    ctrl_l5_n8.nodeId = "ctrl_l5_n8";
    ctrl_l5_n8.eventContext = eventContext_287;
    ctrl_l5_n8.dataCollector = dataCollector_288;
    ctrl_l5_n8.upstream1 = ctrl_l4_n8;
    ctrl_l5_n9.setUpstream1(ctrl_l4_n9);
    ctrl_l5_n9.setNodeId("ctrl_l5_n9");
    ctrl_l5_n9.setDataCollector(dataCollector_288);
    ctrl_l5_n9.setEventContext(eventContext_287);
    ctrl_l5_n9.value = 0.0;
    ctrl_l5_n9.nodeId = "ctrl_l5_n9";
    ctrl_l5_n9.eventContext = eventContext_287;
    ctrl_l5_n9.dataCollector = dataCollector_288;
    ctrl_l5_n9.upstream1 = ctrl_l4_n9;
    ctrl_l6_n0.setUpstream1(ctrl_l5_n0);
    ctrl_l6_n0.setNodeId("ctrl_l6_n0");
    ctrl_l6_n0.setDataCollector(dataCollector_288);
    ctrl_l6_n0.setEventContext(eventContext_287);
    ctrl_l6_n0.value = 0.0;
    ctrl_l6_n0.nodeId = "ctrl_l6_n0";
    ctrl_l6_n0.eventContext = eventContext_287;
    ctrl_l6_n0.dataCollector = dataCollector_288;
    ctrl_l6_n0.upstream1 = ctrl_l5_n0;
    ctrl_l6_n1.setUpstream1(ctrl_l5_n1);
    ctrl_l6_n1.setNodeId("ctrl_l6_n1");
    ctrl_l6_n1.setDataCollector(dataCollector_288);
    ctrl_l6_n1.setEventContext(eventContext_287);
    ctrl_l6_n1.value = 0.0;
    ctrl_l6_n1.nodeId = "ctrl_l6_n1";
    ctrl_l6_n1.eventContext = eventContext_287;
    ctrl_l6_n1.dataCollector = dataCollector_288;
    ctrl_l6_n1.upstream1 = ctrl_l5_n1;
    ctrl_l6_n2.setUpstream1(ctrl_l5_n2);
    ctrl_l6_n2.setNodeId("ctrl_l6_n2");
    ctrl_l6_n2.setDataCollector(dataCollector_288);
    ctrl_l6_n2.setEventContext(eventContext_287);
    ctrl_l6_n2.value = 0.0;
    ctrl_l6_n2.nodeId = "ctrl_l6_n2";
    ctrl_l6_n2.eventContext = eventContext_287;
    ctrl_l6_n2.dataCollector = dataCollector_288;
    ctrl_l6_n2.upstream1 = ctrl_l5_n2;
    ctrl_l6_n3.setUpstream1(ctrl_l5_n3);
    ctrl_l6_n3.setNodeId("ctrl_l6_n3");
    ctrl_l6_n3.setDataCollector(dataCollector_288);
    ctrl_l6_n3.setEventContext(eventContext_287);
    ctrl_l6_n3.value = 0.0;
    ctrl_l6_n3.nodeId = "ctrl_l6_n3";
    ctrl_l6_n3.eventContext = eventContext_287;
    ctrl_l6_n3.dataCollector = dataCollector_288;
    ctrl_l6_n3.upstream1 = ctrl_l5_n3;
    ctrl_l6_n4.setUpstream1(ctrl_l5_n4);
    ctrl_l6_n4.setNodeId("ctrl_l6_n4");
    ctrl_l6_n4.setDataCollector(dataCollector_288);
    ctrl_l6_n4.setEventContext(eventContext_287);
    ctrl_l6_n4.value = 0.0;
    ctrl_l6_n4.nodeId = "ctrl_l6_n4";
    ctrl_l6_n4.eventContext = eventContext_287;
    ctrl_l6_n4.dataCollector = dataCollector_288;
    ctrl_l6_n4.upstream1 = ctrl_l5_n4;
    ctrl_l6_n5.setUpstream1(ctrl_l5_n5);
    ctrl_l6_n5.setNodeId("ctrl_l6_n5");
    ctrl_l6_n5.setDataCollector(dataCollector_288);
    ctrl_l6_n5.setEventContext(eventContext_287);
    ctrl_l6_n5.value = 0.0;
    ctrl_l6_n5.nodeId = "ctrl_l6_n5";
    ctrl_l6_n5.eventContext = eventContext_287;
    ctrl_l6_n5.dataCollector = dataCollector_288;
    ctrl_l6_n5.upstream1 = ctrl_l5_n5;
    ctrl_l6_n6.setUpstream1(ctrl_l5_n6);
    ctrl_l6_n6.setNodeId("ctrl_l6_n6");
    ctrl_l6_n6.setDataCollector(dataCollector_288);
    ctrl_l6_n6.setEventContext(eventContext_287);
    ctrl_l6_n6.value = 0.0;
    ctrl_l6_n6.nodeId = "ctrl_l6_n6";
    ctrl_l6_n6.eventContext = eventContext_287;
    ctrl_l6_n6.dataCollector = dataCollector_288;
    ctrl_l6_n6.upstream1 = ctrl_l5_n6;
    ctrl_l6_n7.setUpstream1(ctrl_l5_n7);
    ctrl_l6_n7.setNodeId("ctrl_l6_n7");
    ctrl_l6_n7.setDataCollector(dataCollector_288);
    ctrl_l6_n7.setEventContext(eventContext_287);
    ctrl_l6_n7.value = 0.0;
    ctrl_l6_n7.nodeId = "ctrl_l6_n7";
    ctrl_l6_n7.eventContext = eventContext_287;
    ctrl_l6_n7.dataCollector = dataCollector_288;
    ctrl_l6_n7.upstream1 = ctrl_l5_n7;
    ctrl_l6_n8.setUpstream1(ctrl_l5_n8);
    ctrl_l6_n8.setNodeId("ctrl_l6_n8");
    ctrl_l6_n8.setDataCollector(dataCollector_288);
    ctrl_l6_n8.setEventContext(eventContext_287);
    ctrl_l6_n8.value = 0.0;
    ctrl_l6_n8.nodeId = "ctrl_l6_n8";
    ctrl_l6_n8.eventContext = eventContext_287;
    ctrl_l6_n8.dataCollector = dataCollector_288;
    ctrl_l6_n8.upstream1 = ctrl_l5_n8;
    ctrl_l6_n9.setUpstream1(ctrl_l5_n9);
    ctrl_l6_n9.setNodeId("ctrl_l6_n9");
    ctrl_l6_n9.setDataCollector(dataCollector_288);
    ctrl_l6_n9.setEventContext(eventContext_287);
    ctrl_l6_n9.value = 0.0;
    ctrl_l6_n9.nodeId = "ctrl_l6_n9";
    ctrl_l6_n9.eventContext = eventContext_287;
    ctrl_l6_n9.dataCollector = dataCollector_288;
    ctrl_l6_n9.upstream1 = ctrl_l5_n9;
    ctrl_l7_n0.setUpstream1(ctrl_l6_n0);
    ctrl_l7_n0.setNodeId("ctrl_l7_n0");
    ctrl_l7_n0.setDataCollector(dataCollector_288);
    ctrl_l7_n0.setEventContext(eventContext_287);
    ctrl_l7_n0.value = 0.0;
    ctrl_l7_n0.nodeId = "ctrl_l7_n0";
    ctrl_l7_n0.eventContext = eventContext_287;
    ctrl_l7_n0.dataCollector = dataCollector_288;
    ctrl_l7_n0.upstream1 = ctrl_l6_n0;
    ctrl_l7_n1.setUpstream1(ctrl_l6_n1);
    ctrl_l7_n1.setNodeId("ctrl_l7_n1");
    ctrl_l7_n1.setDataCollector(dataCollector_288);
    ctrl_l7_n1.setEventContext(eventContext_287);
    ctrl_l7_n1.value = 0.0;
    ctrl_l7_n1.nodeId = "ctrl_l7_n1";
    ctrl_l7_n1.eventContext = eventContext_287;
    ctrl_l7_n1.dataCollector = dataCollector_288;
    ctrl_l7_n1.upstream1 = ctrl_l6_n1;
    ctrl_l7_n2.setUpstream1(ctrl_l6_n2);
    ctrl_l7_n2.setNodeId("ctrl_l7_n2");
    ctrl_l7_n2.setDataCollector(dataCollector_288);
    ctrl_l7_n2.setEventContext(eventContext_287);
    ctrl_l7_n2.value = 0.0;
    ctrl_l7_n2.nodeId = "ctrl_l7_n2";
    ctrl_l7_n2.eventContext = eventContext_287;
    ctrl_l7_n2.dataCollector = dataCollector_288;
    ctrl_l7_n2.upstream1 = ctrl_l6_n2;
    ctrl_l7_n3.setUpstream1(ctrl_l6_n3);
    ctrl_l7_n3.setNodeId("ctrl_l7_n3");
    ctrl_l7_n3.setDataCollector(dataCollector_288);
    ctrl_l7_n3.setEventContext(eventContext_287);
    ctrl_l7_n3.value = 0.0;
    ctrl_l7_n3.nodeId = "ctrl_l7_n3";
    ctrl_l7_n3.eventContext = eventContext_287;
    ctrl_l7_n3.dataCollector = dataCollector_288;
    ctrl_l7_n3.upstream1 = ctrl_l6_n3;
    ctrl_l7_n4.setUpstream1(ctrl_l6_n4);
    ctrl_l7_n4.setNodeId("ctrl_l7_n4");
    ctrl_l7_n4.setDataCollector(dataCollector_288);
    ctrl_l7_n4.setEventContext(eventContext_287);
    ctrl_l7_n4.value = 0.0;
    ctrl_l7_n4.nodeId = "ctrl_l7_n4";
    ctrl_l7_n4.eventContext = eventContext_287;
    ctrl_l7_n4.dataCollector = dataCollector_288;
    ctrl_l7_n4.upstream1 = ctrl_l6_n4;
    ctrl_l7_n5.setUpstream1(ctrl_l6_n5);
    ctrl_l7_n5.setNodeId("ctrl_l7_n5");
    ctrl_l7_n5.setDataCollector(dataCollector_288);
    ctrl_l7_n5.setEventContext(eventContext_287);
    ctrl_l7_n5.value = 0.0;
    ctrl_l7_n5.nodeId = "ctrl_l7_n5";
    ctrl_l7_n5.eventContext = eventContext_287;
    ctrl_l7_n5.dataCollector = dataCollector_288;
    ctrl_l7_n5.upstream1 = ctrl_l6_n5;
    ctrl_l7_n6.setUpstream1(ctrl_l6_n6);
    ctrl_l7_n6.setNodeId("ctrl_l7_n6");
    ctrl_l7_n6.setDataCollector(dataCollector_288);
    ctrl_l7_n6.setEventContext(eventContext_287);
    ctrl_l7_n6.value = 0.0;
    ctrl_l7_n6.nodeId = "ctrl_l7_n6";
    ctrl_l7_n6.eventContext = eventContext_287;
    ctrl_l7_n6.dataCollector = dataCollector_288;
    ctrl_l7_n6.upstream1 = ctrl_l6_n6;
    ctrl_l7_n7.setUpstream1(ctrl_l6_n7);
    ctrl_l7_n7.setNodeId("ctrl_l7_n7");
    ctrl_l7_n7.setDataCollector(dataCollector_288);
    ctrl_l7_n7.setEventContext(eventContext_287);
    ctrl_l7_n7.value = 0.0;
    ctrl_l7_n7.nodeId = "ctrl_l7_n7";
    ctrl_l7_n7.eventContext = eventContext_287;
    ctrl_l7_n7.dataCollector = dataCollector_288;
    ctrl_l7_n7.upstream1 = ctrl_l6_n7;
    ctrl_l7_n8.setUpstream1(ctrl_l6_n8);
    ctrl_l7_n8.setNodeId("ctrl_l7_n8");
    ctrl_l7_n8.setDataCollector(dataCollector_288);
    ctrl_l7_n8.setEventContext(eventContext_287);
    ctrl_l7_n8.value = 0.0;
    ctrl_l7_n8.nodeId = "ctrl_l7_n8";
    ctrl_l7_n8.eventContext = eventContext_287;
    ctrl_l7_n8.dataCollector = dataCollector_288;
    ctrl_l7_n8.upstream1 = ctrl_l6_n8;
    ctrl_l7_n9.setUpstream1(ctrl_l6_n9);
    ctrl_l7_n9.setNodeId("ctrl_l7_n9");
    ctrl_l7_n9.setDataCollector(dataCollector_288);
    ctrl_l7_n9.setEventContext(eventContext_287);
    ctrl_l7_n9.value = 0.0;
    ctrl_l7_n9.nodeId = "ctrl_l7_n9";
    ctrl_l7_n9.eventContext = eventContext_287;
    ctrl_l7_n9.dataCollector = dataCollector_288;
    ctrl_l7_n9.upstream1 = ctrl_l6_n9;
    ctrl_l8_n0.setUpstream1(ctrl_l7_n0);
    ctrl_l8_n0.setNodeId("ctrl_l8_n0");
    ctrl_l8_n0.setDataCollector(dataCollector_288);
    ctrl_l8_n0.setEventContext(eventContext_287);
    ctrl_l8_n0.value = 0.0;
    ctrl_l8_n0.nodeId = "ctrl_l8_n0";
    ctrl_l8_n0.eventContext = eventContext_287;
    ctrl_l8_n0.dataCollector = dataCollector_288;
    ctrl_l8_n0.upstream1 = ctrl_l7_n0;
    ctrl_l8_n1.setUpstream1(ctrl_l7_n1);
    ctrl_l8_n1.setNodeId("ctrl_l8_n1");
    ctrl_l8_n1.setDataCollector(dataCollector_288);
    ctrl_l8_n1.setEventContext(eventContext_287);
    ctrl_l8_n1.value = 0.0;
    ctrl_l8_n1.nodeId = "ctrl_l8_n1";
    ctrl_l8_n1.eventContext = eventContext_287;
    ctrl_l8_n1.dataCollector = dataCollector_288;
    ctrl_l8_n1.upstream1 = ctrl_l7_n1;
    ctrl_l8_n2.setUpstream1(ctrl_l7_n2);
    ctrl_l8_n2.setNodeId("ctrl_l8_n2");
    ctrl_l8_n2.setDataCollector(dataCollector_288);
    ctrl_l8_n2.setEventContext(eventContext_287);
    ctrl_l8_n2.value = 0.0;
    ctrl_l8_n2.nodeId = "ctrl_l8_n2";
    ctrl_l8_n2.eventContext = eventContext_287;
    ctrl_l8_n2.dataCollector = dataCollector_288;
    ctrl_l8_n2.upstream1 = ctrl_l7_n2;
    ctrl_l8_n3.setUpstream1(ctrl_l7_n3);
    ctrl_l8_n3.setNodeId("ctrl_l8_n3");
    ctrl_l8_n3.setDataCollector(dataCollector_288);
    ctrl_l8_n3.setEventContext(eventContext_287);
    ctrl_l8_n3.value = 0.0;
    ctrl_l8_n3.nodeId = "ctrl_l8_n3";
    ctrl_l8_n3.eventContext = eventContext_287;
    ctrl_l8_n3.dataCollector = dataCollector_288;
    ctrl_l8_n3.upstream1 = ctrl_l7_n3;
    ctrl_l8_n4.setUpstream1(ctrl_l7_n4);
    ctrl_l8_n4.setNodeId("ctrl_l8_n4");
    ctrl_l8_n4.setDataCollector(dataCollector_288);
    ctrl_l8_n4.setEventContext(eventContext_287);
    ctrl_l8_n4.value = 0.0;
    ctrl_l8_n4.nodeId = "ctrl_l8_n4";
    ctrl_l8_n4.eventContext = eventContext_287;
    ctrl_l8_n4.dataCollector = dataCollector_288;
    ctrl_l8_n4.upstream1 = ctrl_l7_n4;
    ctrl_l8_n5.setUpstream1(ctrl_l7_n5);
    ctrl_l8_n5.setNodeId("ctrl_l8_n5");
    ctrl_l8_n5.setDataCollector(dataCollector_288);
    ctrl_l8_n5.setEventContext(eventContext_287);
    ctrl_l8_n5.value = 0.0;
    ctrl_l8_n5.nodeId = "ctrl_l8_n5";
    ctrl_l8_n5.eventContext = eventContext_287;
    ctrl_l8_n5.dataCollector = dataCollector_288;
    ctrl_l8_n5.upstream1 = ctrl_l7_n5;
    ctrl_l8_n6.setUpstream1(ctrl_l7_n6);
    ctrl_l8_n6.setNodeId("ctrl_l8_n6");
    ctrl_l8_n6.setDataCollector(dataCollector_288);
    ctrl_l8_n6.setEventContext(eventContext_287);
    ctrl_l8_n6.value = 0.0;
    ctrl_l8_n6.nodeId = "ctrl_l8_n6";
    ctrl_l8_n6.eventContext = eventContext_287;
    ctrl_l8_n6.dataCollector = dataCollector_288;
    ctrl_l8_n6.upstream1 = ctrl_l7_n6;
    ctrl_l8_n7.setUpstream1(ctrl_l7_n7);
    ctrl_l8_n7.setNodeId("ctrl_l8_n7");
    ctrl_l8_n7.setDataCollector(dataCollector_288);
    ctrl_l8_n7.setEventContext(eventContext_287);
    ctrl_l8_n7.value = 0.0;
    ctrl_l8_n7.nodeId = "ctrl_l8_n7";
    ctrl_l8_n7.eventContext = eventContext_287;
    ctrl_l8_n7.dataCollector = dataCollector_288;
    ctrl_l8_n7.upstream1 = ctrl_l7_n7;
    ctrl_l8_n8.setUpstream1(ctrl_l7_n8);
    ctrl_l8_n8.setNodeId("ctrl_l8_n8");
    ctrl_l8_n8.setDataCollector(dataCollector_288);
    ctrl_l8_n8.setEventContext(eventContext_287);
    ctrl_l8_n8.value = 0.0;
    ctrl_l8_n8.nodeId = "ctrl_l8_n8";
    ctrl_l8_n8.eventContext = eventContext_287;
    ctrl_l8_n8.dataCollector = dataCollector_288;
    ctrl_l8_n8.upstream1 = ctrl_l7_n8;
    ctrl_l8_n9.setUpstream1(ctrl_l7_n9);
    ctrl_l8_n9.setNodeId("ctrl_l8_n9");
    ctrl_l8_n9.setDataCollector(dataCollector_288);
    ctrl_l8_n9.setEventContext(eventContext_287);
    ctrl_l8_n9.value = 0.0;
    ctrl_l8_n9.nodeId = "ctrl_l8_n9";
    ctrl_l8_n9.eventContext = eventContext_287;
    ctrl_l8_n9.dataCollector = dataCollector_288;
    ctrl_l8_n9.upstream1 = ctrl_l7_n9;
    ctrl_l9_n0.setUpstream1(ctrl_l8_n0);
    ctrl_l9_n0.setNodeId("ctrl_l9_n0");
    ctrl_l9_n0.setDataCollector(dataCollector_288);
    ctrl_l9_n0.setEventContext(eventContext_287);
    ctrl_l9_n0.value = 0.0;
    ctrl_l9_n0.nodeId = "ctrl_l9_n0";
    ctrl_l9_n0.eventContext = eventContext_287;
    ctrl_l9_n0.dataCollector = dataCollector_288;
    ctrl_l9_n0.upstream1 = ctrl_l8_n0;
    ctrl_l9_n1.setUpstream1(ctrl_l8_n1);
    ctrl_l9_n1.setNodeId("ctrl_l9_n1");
    ctrl_l9_n1.setDataCollector(dataCollector_288);
    ctrl_l9_n1.setEventContext(eventContext_287);
    ctrl_l9_n1.value = 0.0;
    ctrl_l9_n1.nodeId = "ctrl_l9_n1";
    ctrl_l9_n1.eventContext = eventContext_287;
    ctrl_l9_n1.dataCollector = dataCollector_288;
    ctrl_l9_n1.upstream1 = ctrl_l8_n1;
    ctrl_l9_n2.setUpstream1(ctrl_l8_n2);
    ctrl_l9_n2.setNodeId("ctrl_l9_n2");
    ctrl_l9_n2.setDataCollector(dataCollector_288);
    ctrl_l9_n2.setEventContext(eventContext_287);
    ctrl_l9_n2.value = 0.0;
    ctrl_l9_n2.nodeId = "ctrl_l9_n2";
    ctrl_l9_n2.eventContext = eventContext_287;
    ctrl_l9_n2.dataCollector = dataCollector_288;
    ctrl_l9_n2.upstream1 = ctrl_l8_n2;
    ctrl_l9_n3.setUpstream1(ctrl_l8_n3);
    ctrl_l9_n3.setNodeId("ctrl_l9_n3");
    ctrl_l9_n3.setDataCollector(dataCollector_288);
    ctrl_l9_n3.setEventContext(eventContext_287);
    ctrl_l9_n3.value = 0.0;
    ctrl_l9_n3.nodeId = "ctrl_l9_n3";
    ctrl_l9_n3.eventContext = eventContext_287;
    ctrl_l9_n3.dataCollector = dataCollector_288;
    ctrl_l9_n3.upstream1 = ctrl_l8_n3;
    ctrl_l9_n4.setUpstream1(ctrl_l8_n4);
    ctrl_l9_n4.setNodeId("ctrl_l9_n4");
    ctrl_l9_n4.setDataCollector(dataCollector_288);
    ctrl_l9_n4.setEventContext(eventContext_287);
    ctrl_l9_n4.value = 0.0;
    ctrl_l9_n4.nodeId = "ctrl_l9_n4";
    ctrl_l9_n4.eventContext = eventContext_287;
    ctrl_l9_n4.dataCollector = dataCollector_288;
    ctrl_l9_n4.upstream1 = ctrl_l8_n4;
    ctrl_l9_n5.setUpstream1(ctrl_l8_n5);
    ctrl_l9_n5.setNodeId("ctrl_l9_n5");
    ctrl_l9_n5.setDataCollector(dataCollector_288);
    ctrl_l9_n5.setEventContext(eventContext_287);
    ctrl_l9_n5.value = 0.0;
    ctrl_l9_n5.nodeId = "ctrl_l9_n5";
    ctrl_l9_n5.eventContext = eventContext_287;
    ctrl_l9_n5.dataCollector = dataCollector_288;
    ctrl_l9_n5.upstream1 = ctrl_l8_n5;
    ctrl_l9_n6.setUpstream1(ctrl_l8_n6);
    ctrl_l9_n6.setNodeId("ctrl_l9_n6");
    ctrl_l9_n6.setDataCollector(dataCollector_288);
    ctrl_l9_n6.setEventContext(eventContext_287);
    ctrl_l9_n6.value = 0.0;
    ctrl_l9_n6.nodeId = "ctrl_l9_n6";
    ctrl_l9_n6.eventContext = eventContext_287;
    ctrl_l9_n6.dataCollector = dataCollector_288;
    ctrl_l9_n6.upstream1 = ctrl_l8_n6;
    ctrl_l9_n7.setUpstream1(ctrl_l8_n7);
    ctrl_l9_n7.setNodeId("ctrl_l9_n7");
    ctrl_l9_n7.setDataCollector(dataCollector_288);
    ctrl_l9_n7.setEventContext(eventContext_287);
    ctrl_l9_n7.value = 0.0;
    ctrl_l9_n7.nodeId = "ctrl_l9_n7";
    ctrl_l9_n7.eventContext = eventContext_287;
    ctrl_l9_n7.dataCollector = dataCollector_288;
    ctrl_l9_n7.upstream1 = ctrl_l8_n7;
    ctrl_l9_n8.setUpstream1(ctrl_l8_n8);
    ctrl_l9_n8.setNodeId("ctrl_l9_n8");
    ctrl_l9_n8.setDataCollector(dataCollector_288);
    ctrl_l9_n8.setEventContext(eventContext_287);
    ctrl_l9_n8.value = 0.0;
    ctrl_l9_n8.nodeId = "ctrl_l9_n8";
    ctrl_l9_n8.eventContext = eventContext_287;
    ctrl_l9_n8.dataCollector = dataCollector_288;
    ctrl_l9_n8.upstream1 = ctrl_l8_n8;
    ctrl_l9_n9.setUpstream1(ctrl_l8_n9);
    ctrl_l9_n9.setNodeId("ctrl_l9_n9");
    ctrl_l9_n9.setDataCollector(dataCollector_288);
    ctrl_l9_n9.setEventContext(eventContext_287);
    ctrl_l9_n9.value = 0.0;
    ctrl_l9_n9.nodeId = "ctrl_l9_n9";
    ctrl_l9_n9.eventContext = eventContext_287;
    ctrl_l9_n9.dataCollector = dataCollector_288;
    ctrl_l9_n9.upstream1 = ctrl_l8_n9;
    ctrl_sink.setUpstream1(ctrl_l9_n0);
    ctrl_sink.setNodeId("ctrl_sink");
    ctrl_sink.setDataCollector(dataCollector_288);
    ctrl_sink.setEventContext(eventContext_287);
    ctrl_sink.setUpstream2(ctrl_l9_n1);
    ctrl_sink.setUpstream3(ctrl_l9_n2);
    ctrl_sink.value = 0.0;
    ctrl_sink.nodeId = "ctrl_sink";
    ctrl_sink.eventContext = eventContext_287;
    ctrl_sink.dataCollector = dataCollector_288;
    ctrl_sink.upstream1 = ctrl_l9_n0;
    ctrl_sink.upstream2 = ctrl_l9_n1;
    ctrl_sink.upstream3 = ctrl_l9_n2;
    md_l1_n0.setUpstream1(md_root);
    md_l1_n0.setNodeId("md_l1_n0");
    md_l1_n0.setDataCollector(dataCollector_288);
    md_l1_n0.setEventContext(eventContext_287);
    md_l1_n0.value = 0.0;
    md_l1_n0.nodeId = "md_l1_n0";
    md_l1_n0.eventContext = eventContext_287;
    md_l1_n0.dataCollector = dataCollector_288;
    md_l1_n0.upstream1 = md_root;
    md_l1_n1.setUpstream1(md_root);
    md_l1_n1.setNodeId("md_l1_n1");
    md_l1_n1.setDataCollector(dataCollector_288);
    md_l1_n1.setEventContext(eventContext_287);
    md_l1_n1.value = 0.0;
    md_l1_n1.nodeId = "md_l1_n1";
    md_l1_n1.eventContext = eventContext_287;
    md_l1_n1.dataCollector = dataCollector_288;
    md_l1_n1.upstream1 = md_root;
    md_l1_n2.setUpstream1(md_root);
    md_l1_n2.setNodeId("md_l1_n2");
    md_l1_n2.setDataCollector(dataCollector_288);
    md_l1_n2.setEventContext(eventContext_287);
    md_l1_n2.value = 0.0;
    md_l1_n2.nodeId = "md_l1_n2";
    md_l1_n2.eventContext = eventContext_287;
    md_l1_n2.dataCollector = dataCollector_288;
    md_l1_n2.upstream1 = md_root;
    md_l1_n3.setUpstream1(md_root);
    md_l1_n3.setNodeId("md_l1_n3");
    md_l1_n3.setDataCollector(dataCollector_288);
    md_l1_n3.setEventContext(eventContext_287);
    md_l1_n3.value = 0.0;
    md_l1_n3.nodeId = "md_l1_n3";
    md_l1_n3.eventContext = eventContext_287;
    md_l1_n3.dataCollector = dataCollector_288;
    md_l1_n3.upstream1 = md_root;
    md_l1_n4.setUpstream1(md_root);
    md_l1_n4.setNodeId("md_l1_n4");
    md_l1_n4.setDataCollector(dataCollector_288);
    md_l1_n4.setEventContext(eventContext_287);
    md_l1_n4.value = 0.0;
    md_l1_n4.nodeId = "md_l1_n4";
    md_l1_n4.eventContext = eventContext_287;
    md_l1_n4.dataCollector = dataCollector_288;
    md_l1_n4.upstream1 = md_root;
    md_l1_n5.setUpstream1(md_root);
    md_l1_n5.setNodeId("md_l1_n5");
    md_l1_n5.setDataCollector(dataCollector_288);
    md_l1_n5.setEventContext(eventContext_287);
    md_l1_n5.value = 0.0;
    md_l1_n5.nodeId = "md_l1_n5";
    md_l1_n5.eventContext = eventContext_287;
    md_l1_n5.dataCollector = dataCollector_288;
    md_l1_n5.upstream1 = md_root;
    md_l1_n6.setUpstream1(md_root);
    md_l1_n6.setNodeId("md_l1_n6");
    md_l1_n6.setDataCollector(dataCollector_288);
    md_l1_n6.setEventContext(eventContext_287);
    md_l1_n6.value = 0.0;
    md_l1_n6.nodeId = "md_l1_n6";
    md_l1_n6.eventContext = eventContext_287;
    md_l1_n6.dataCollector = dataCollector_288;
    md_l1_n6.upstream1 = md_root;
    md_l1_n7.setUpstream1(md_root);
    md_l1_n7.setNodeId("md_l1_n7");
    md_l1_n7.setDataCollector(dataCollector_288);
    md_l1_n7.setEventContext(eventContext_287);
    md_l1_n7.value = 0.0;
    md_l1_n7.nodeId = "md_l1_n7";
    md_l1_n7.eventContext = eventContext_287;
    md_l1_n7.dataCollector = dataCollector_288;
    md_l1_n7.upstream1 = md_root;
    md_l1_n8.setUpstream1(md_root);
    md_l1_n8.setNodeId("md_l1_n8");
    md_l1_n8.setDataCollector(dataCollector_288);
    md_l1_n8.setEventContext(eventContext_287);
    md_l1_n8.value = 0.0;
    md_l1_n8.nodeId = "md_l1_n8";
    md_l1_n8.eventContext = eventContext_287;
    md_l1_n8.dataCollector = dataCollector_288;
    md_l1_n8.upstream1 = md_root;
    md_l1_n9.setUpstream1(md_root);
    md_l1_n9.setNodeId("md_l1_n9");
    md_l1_n9.setDataCollector(dataCollector_288);
    md_l1_n9.setEventContext(eventContext_287);
    md_l1_n9.value = 0.0;
    md_l1_n9.nodeId = "md_l1_n9";
    md_l1_n9.eventContext = eventContext_287;
    md_l1_n9.dataCollector = dataCollector_288;
    md_l1_n9.upstream1 = md_root;
    md_l2_n0.setUpstream1(md_l1_n0);
    md_l2_n0.setNodeId("md_l2_n0");
    md_l2_n0.setDataCollector(dataCollector_288);
    md_l2_n0.setEventContext(eventContext_287);
    md_l2_n0.setUpstream2(md_l1_n1);
    md_l2_n0.value = 0.0;
    md_l2_n0.nodeId = "md_l2_n0";
    md_l2_n0.eventContext = eventContext_287;
    md_l2_n0.dataCollector = dataCollector_288;
    md_l2_n0.upstream1 = md_l1_n0;
    md_l2_n0.upstream2 = md_l1_n1;
    md_l2_n1.setUpstream1(md_l1_n1);
    md_l2_n1.setNodeId("md_l2_n1");
    md_l2_n1.setDataCollector(dataCollector_288);
    md_l2_n1.setEventContext(eventContext_287);
    md_l2_n1.setUpstream2(md_l1_n2);
    md_l2_n1.value = 0.0;
    md_l2_n1.nodeId = "md_l2_n1";
    md_l2_n1.eventContext = eventContext_287;
    md_l2_n1.dataCollector = dataCollector_288;
    md_l2_n1.upstream1 = md_l1_n1;
    md_l2_n1.upstream2 = md_l1_n2;
    md_l2_n2.setUpstream1(md_l1_n2);
    md_l2_n2.setNodeId("md_l2_n2");
    md_l2_n2.setDataCollector(dataCollector_288);
    md_l2_n2.setEventContext(eventContext_287);
    md_l2_n2.setUpstream2(md_l1_n3);
    md_l2_n2.value = 0.0;
    md_l2_n2.nodeId = "md_l2_n2";
    md_l2_n2.eventContext = eventContext_287;
    md_l2_n2.dataCollector = dataCollector_288;
    md_l2_n2.upstream1 = md_l1_n2;
    md_l2_n2.upstream2 = md_l1_n3;
    md_l2_n3.setUpstream1(md_l1_n3);
    md_l2_n3.setNodeId("md_l2_n3");
    md_l2_n3.setDataCollector(dataCollector_288);
    md_l2_n3.setEventContext(eventContext_287);
    md_l2_n3.setUpstream2(md_l1_n4);
    md_l2_n3.value = 0.0;
    md_l2_n3.nodeId = "md_l2_n3";
    md_l2_n3.eventContext = eventContext_287;
    md_l2_n3.dataCollector = dataCollector_288;
    md_l2_n3.upstream1 = md_l1_n3;
    md_l2_n3.upstream2 = md_l1_n4;
    md_l2_n4.setUpstream1(md_l1_n4);
    md_l2_n4.setNodeId("md_l2_n4");
    md_l2_n4.setDataCollector(dataCollector_288);
    md_l2_n4.setEventContext(eventContext_287);
    md_l2_n4.setUpstream2(md_l1_n5);
    md_l2_n4.value = 0.0;
    md_l2_n4.nodeId = "md_l2_n4";
    md_l2_n4.eventContext = eventContext_287;
    md_l2_n4.dataCollector = dataCollector_288;
    md_l2_n4.upstream1 = md_l1_n4;
    md_l2_n4.upstream2 = md_l1_n5;
    md_l2_n5.setUpstream1(md_l1_n5);
    md_l2_n5.setNodeId("md_l2_n5");
    md_l2_n5.setDataCollector(dataCollector_288);
    md_l2_n5.setEventContext(eventContext_287);
    md_l2_n5.setUpstream2(md_l1_n6);
    md_l2_n5.value = 0.0;
    md_l2_n5.nodeId = "md_l2_n5";
    md_l2_n5.eventContext = eventContext_287;
    md_l2_n5.dataCollector = dataCollector_288;
    md_l2_n5.upstream1 = md_l1_n5;
    md_l2_n5.upstream2 = md_l1_n6;
    md_l2_n6.setUpstream1(md_l1_n6);
    md_l2_n6.setNodeId("md_l2_n6");
    md_l2_n6.setDataCollector(dataCollector_288);
    md_l2_n6.setEventContext(eventContext_287);
    md_l2_n6.setUpstream2(md_l1_n7);
    md_l2_n6.value = 0.0;
    md_l2_n6.nodeId = "md_l2_n6";
    md_l2_n6.eventContext = eventContext_287;
    md_l2_n6.dataCollector = dataCollector_288;
    md_l2_n6.upstream1 = md_l1_n6;
    md_l2_n6.upstream2 = md_l1_n7;
    md_l2_n7.setUpstream1(md_l1_n7);
    md_l2_n7.setNodeId("md_l2_n7");
    md_l2_n7.setDataCollector(dataCollector_288);
    md_l2_n7.setEventContext(eventContext_287);
    md_l2_n7.setUpstream2(md_l1_n8);
    md_l2_n7.value = 0.0;
    md_l2_n7.nodeId = "md_l2_n7";
    md_l2_n7.eventContext = eventContext_287;
    md_l2_n7.dataCollector = dataCollector_288;
    md_l2_n7.upstream1 = md_l1_n7;
    md_l2_n7.upstream2 = md_l1_n8;
    md_l2_n8.setUpstream1(md_l1_n8);
    md_l2_n8.setNodeId("md_l2_n8");
    md_l2_n8.setDataCollector(dataCollector_288);
    md_l2_n8.setEventContext(eventContext_287);
    md_l2_n8.setUpstream2(md_l1_n9);
    md_l2_n8.value = 0.0;
    md_l2_n8.nodeId = "md_l2_n8";
    md_l2_n8.eventContext = eventContext_287;
    md_l2_n8.dataCollector = dataCollector_288;
    md_l2_n8.upstream1 = md_l1_n8;
    md_l2_n8.upstream2 = md_l1_n9;
    md_l2_n9.setUpstream1(md_l1_n9);
    md_l2_n9.setNodeId("md_l2_n9");
    md_l2_n9.setDataCollector(dataCollector_288);
    md_l2_n9.setEventContext(eventContext_287);
    md_l2_n9.setUpstream2(md_l1_n0);
    md_l2_n9.value = 0.0;
    md_l2_n9.nodeId = "md_l2_n9";
    md_l2_n9.eventContext = eventContext_287;
    md_l2_n9.dataCollector = dataCollector_288;
    md_l2_n9.upstream1 = md_l1_n9;
    md_l2_n9.upstream2 = md_l1_n0;
    md_l3_n0.setUpstream1(md_l2_n0);
    md_l3_n0.setNodeId("md_l3_n0");
    md_l3_n0.setDataCollector(dataCollector_288);
    md_l3_n0.setEventContext(eventContext_287);
    md_l3_n0.setUpstream2(md_l2_n1);
    md_l3_n0.value = 0.0;
    md_l3_n0.nodeId = "md_l3_n0";
    md_l3_n0.eventContext = eventContext_287;
    md_l3_n0.dataCollector = dataCollector_288;
    md_l3_n0.upstream1 = md_l2_n0;
    md_l3_n0.upstream2 = md_l2_n1;
    md_l3_n1.setUpstream1(md_l2_n1);
    md_l3_n1.setNodeId("md_l3_n1");
    md_l3_n1.setDataCollector(dataCollector_288);
    md_l3_n1.setEventContext(eventContext_287);
    md_l3_n1.setUpstream2(md_l2_n2);
    md_l3_n1.value = 0.0;
    md_l3_n1.nodeId = "md_l3_n1";
    md_l3_n1.eventContext = eventContext_287;
    md_l3_n1.dataCollector = dataCollector_288;
    md_l3_n1.upstream1 = md_l2_n1;
    md_l3_n1.upstream2 = md_l2_n2;
    md_l3_n2.setUpstream1(md_l2_n2);
    md_l3_n2.setNodeId("md_l3_n2");
    md_l3_n2.setDataCollector(dataCollector_288);
    md_l3_n2.setEventContext(eventContext_287);
    md_l3_n2.setUpstream2(md_l2_n3);
    md_l3_n2.value = 0.0;
    md_l3_n2.nodeId = "md_l3_n2";
    md_l3_n2.eventContext = eventContext_287;
    md_l3_n2.dataCollector = dataCollector_288;
    md_l3_n2.upstream1 = md_l2_n2;
    md_l3_n2.upstream2 = md_l2_n3;
    md_l3_n3.setUpstream1(md_l2_n3);
    md_l3_n3.setNodeId("md_l3_n3");
    md_l3_n3.setDataCollector(dataCollector_288);
    md_l3_n3.setEventContext(eventContext_287);
    md_l3_n3.setUpstream2(md_l2_n4);
    md_l3_n3.value = 0.0;
    md_l3_n3.nodeId = "md_l3_n3";
    md_l3_n3.eventContext = eventContext_287;
    md_l3_n3.dataCollector = dataCollector_288;
    md_l3_n3.upstream1 = md_l2_n3;
    md_l3_n3.upstream2 = md_l2_n4;
    md_l3_n4.setUpstream1(md_l2_n4);
    md_l3_n4.setNodeId("md_l3_n4");
    md_l3_n4.setDataCollector(dataCollector_288);
    md_l3_n4.setEventContext(eventContext_287);
    md_l3_n4.setUpstream2(md_l2_n5);
    md_l3_n4.value = 0.0;
    md_l3_n4.nodeId = "md_l3_n4";
    md_l3_n4.eventContext = eventContext_287;
    md_l3_n4.dataCollector = dataCollector_288;
    md_l3_n4.upstream1 = md_l2_n4;
    md_l3_n4.upstream2 = md_l2_n5;
    md_l3_n5.setUpstream1(md_l2_n5);
    md_l3_n5.setNodeId("md_l3_n5");
    md_l3_n5.setDataCollector(dataCollector_288);
    md_l3_n5.setEventContext(eventContext_287);
    md_l3_n5.setUpstream2(md_l2_n6);
    md_l3_n5.value = 0.0;
    md_l3_n5.nodeId = "md_l3_n5";
    md_l3_n5.eventContext = eventContext_287;
    md_l3_n5.dataCollector = dataCollector_288;
    md_l3_n5.upstream1 = md_l2_n5;
    md_l3_n5.upstream2 = md_l2_n6;
    md_l3_n6.setUpstream1(md_l2_n6);
    md_l3_n6.setNodeId("md_l3_n6");
    md_l3_n6.setDataCollector(dataCollector_288);
    md_l3_n6.setEventContext(eventContext_287);
    md_l3_n6.setUpstream2(md_l2_n7);
    md_l3_n6.value = 0.0;
    md_l3_n6.nodeId = "md_l3_n6";
    md_l3_n6.eventContext = eventContext_287;
    md_l3_n6.dataCollector = dataCollector_288;
    md_l3_n6.upstream1 = md_l2_n6;
    md_l3_n6.upstream2 = md_l2_n7;
    md_l3_n7.setUpstream1(md_l2_n7);
    md_l3_n7.setNodeId("md_l3_n7");
    md_l3_n7.setDataCollector(dataCollector_288);
    md_l3_n7.setEventContext(eventContext_287);
    md_l3_n7.setUpstream2(md_l2_n8);
    md_l3_n7.value = 0.0;
    md_l3_n7.nodeId = "md_l3_n7";
    md_l3_n7.eventContext = eventContext_287;
    md_l3_n7.dataCollector = dataCollector_288;
    md_l3_n7.upstream1 = md_l2_n7;
    md_l3_n7.upstream2 = md_l2_n8;
    md_l3_n8.setUpstream1(md_l2_n8);
    md_l3_n8.setNodeId("md_l3_n8");
    md_l3_n8.setDataCollector(dataCollector_288);
    md_l3_n8.setEventContext(eventContext_287);
    md_l3_n8.setUpstream2(md_l2_n9);
    md_l3_n8.value = 0.0;
    md_l3_n8.nodeId = "md_l3_n8";
    md_l3_n8.eventContext = eventContext_287;
    md_l3_n8.dataCollector = dataCollector_288;
    md_l3_n8.upstream1 = md_l2_n8;
    md_l3_n8.upstream2 = md_l2_n9;
    md_l3_n9.setUpstream1(md_l2_n9);
    md_l3_n9.setNodeId("md_l3_n9");
    md_l3_n9.setDataCollector(dataCollector_288);
    md_l3_n9.setEventContext(eventContext_287);
    md_l3_n9.setUpstream2(md_l2_n0);
    md_l3_n9.value = 0.0;
    md_l3_n9.nodeId = "md_l3_n9";
    md_l3_n9.eventContext = eventContext_287;
    md_l3_n9.dataCollector = dataCollector_288;
    md_l3_n9.upstream1 = md_l2_n9;
    md_l3_n9.upstream2 = md_l2_n0;
    md_l4_n0.setUpstream1(md_l3_n0);
    md_l4_n0.setNodeId("md_l4_n0");
    md_l4_n0.setDataCollector(dataCollector_288);
    md_l4_n0.setEventContext(eventContext_287);
    md_l4_n0.setUpstream2(md_l3_n1);
    md_l4_n0.value = 0.0;
    md_l4_n0.nodeId = "md_l4_n0";
    md_l4_n0.eventContext = eventContext_287;
    md_l4_n0.dataCollector = dataCollector_288;
    md_l4_n0.upstream1 = md_l3_n0;
    md_l4_n0.upstream2 = md_l3_n1;
    md_l4_n1.setUpstream1(md_l3_n1);
    md_l4_n1.setNodeId("md_l4_n1");
    md_l4_n1.setDataCollector(dataCollector_288);
    md_l4_n1.setEventContext(eventContext_287);
    md_l4_n1.setUpstream2(md_l3_n2);
    md_l4_n1.value = 0.0;
    md_l4_n1.nodeId = "md_l4_n1";
    md_l4_n1.eventContext = eventContext_287;
    md_l4_n1.dataCollector = dataCollector_288;
    md_l4_n1.upstream1 = md_l3_n1;
    md_l4_n1.upstream2 = md_l3_n2;
    md_l4_n2.setUpstream1(md_l3_n2);
    md_l4_n2.setNodeId("md_l4_n2");
    md_l4_n2.setDataCollector(dataCollector_288);
    md_l4_n2.setEventContext(eventContext_287);
    md_l4_n2.setUpstream2(md_l3_n3);
    md_l4_n2.value = 0.0;
    md_l4_n2.nodeId = "md_l4_n2";
    md_l4_n2.eventContext = eventContext_287;
    md_l4_n2.dataCollector = dataCollector_288;
    md_l4_n2.upstream1 = md_l3_n2;
    md_l4_n2.upstream2 = md_l3_n3;
    md_l4_n3.setUpstream1(md_l3_n3);
    md_l4_n3.setNodeId("md_l4_n3");
    md_l4_n3.setDataCollector(dataCollector_288);
    md_l4_n3.setEventContext(eventContext_287);
    md_l4_n3.setUpstream2(md_l3_n4);
    md_l4_n3.value = 0.0;
    md_l4_n3.nodeId = "md_l4_n3";
    md_l4_n3.eventContext = eventContext_287;
    md_l4_n3.dataCollector = dataCollector_288;
    md_l4_n3.upstream1 = md_l3_n3;
    md_l4_n3.upstream2 = md_l3_n4;
    md_l4_n4.setUpstream1(md_l3_n4);
    md_l4_n4.setNodeId("md_l4_n4");
    md_l4_n4.setDataCollector(dataCollector_288);
    md_l4_n4.setEventContext(eventContext_287);
    md_l4_n4.setUpstream2(md_l3_n5);
    md_l4_n4.value = 0.0;
    md_l4_n4.nodeId = "md_l4_n4";
    md_l4_n4.eventContext = eventContext_287;
    md_l4_n4.dataCollector = dataCollector_288;
    md_l4_n4.upstream1 = md_l3_n4;
    md_l4_n4.upstream2 = md_l3_n5;
    md_l4_n5.setUpstream1(md_l3_n5);
    md_l4_n5.setNodeId("md_l4_n5");
    md_l4_n5.setDataCollector(dataCollector_288);
    md_l4_n5.setEventContext(eventContext_287);
    md_l4_n5.setUpstream2(md_l3_n6);
    md_l4_n5.value = 0.0;
    md_l4_n5.nodeId = "md_l4_n5";
    md_l4_n5.eventContext = eventContext_287;
    md_l4_n5.dataCollector = dataCollector_288;
    md_l4_n5.upstream1 = md_l3_n5;
    md_l4_n5.upstream2 = md_l3_n6;
    md_l4_n6.setUpstream1(md_l3_n6);
    md_l4_n6.setNodeId("md_l4_n6");
    md_l4_n6.setDataCollector(dataCollector_288);
    md_l4_n6.setEventContext(eventContext_287);
    md_l4_n6.setUpstream2(md_l3_n7);
    md_l4_n6.value = 0.0;
    md_l4_n6.nodeId = "md_l4_n6";
    md_l4_n6.eventContext = eventContext_287;
    md_l4_n6.dataCollector = dataCollector_288;
    md_l4_n6.upstream1 = md_l3_n6;
    md_l4_n6.upstream2 = md_l3_n7;
    md_l4_n7.setUpstream1(md_l3_n7);
    md_l4_n7.setNodeId("md_l4_n7");
    md_l4_n7.setDataCollector(dataCollector_288);
    md_l4_n7.setEventContext(eventContext_287);
    md_l4_n7.setUpstream2(md_l3_n8);
    md_l4_n7.value = 0.0;
    md_l4_n7.nodeId = "md_l4_n7";
    md_l4_n7.eventContext = eventContext_287;
    md_l4_n7.dataCollector = dataCollector_288;
    md_l4_n7.upstream1 = md_l3_n7;
    md_l4_n7.upstream2 = md_l3_n8;
    md_l4_n8.setUpstream1(md_l3_n8);
    md_l4_n8.setNodeId("md_l4_n8");
    md_l4_n8.setDataCollector(dataCollector_288);
    md_l4_n8.setEventContext(eventContext_287);
    md_l4_n8.setUpstream2(md_l3_n9);
    md_l4_n8.value = 0.0;
    md_l4_n8.nodeId = "md_l4_n8";
    md_l4_n8.eventContext = eventContext_287;
    md_l4_n8.dataCollector = dataCollector_288;
    md_l4_n8.upstream1 = md_l3_n8;
    md_l4_n8.upstream2 = md_l3_n9;
    md_l4_n9.setUpstream1(md_l3_n9);
    md_l4_n9.setNodeId("md_l4_n9");
    md_l4_n9.setDataCollector(dataCollector_288);
    md_l4_n9.setEventContext(eventContext_287);
    md_l4_n9.setUpstream2(md_l3_n0);
    md_l4_n9.value = 0.0;
    md_l4_n9.nodeId = "md_l4_n9";
    md_l4_n9.eventContext = eventContext_287;
    md_l4_n9.dataCollector = dataCollector_288;
    md_l4_n9.upstream1 = md_l3_n9;
    md_l4_n9.upstream2 = md_l3_n0;
    md_l5_n0.setUpstream1(md_l4_n0);
    md_l5_n0.setNodeId("md_l5_n0");
    md_l5_n0.setDataCollector(dataCollector_288);
    md_l5_n0.setEventContext(eventContext_287);
    md_l5_n0.setUpstream2(md_l4_n1);
    md_l5_n0.value = 0.0;
    md_l5_n0.nodeId = "md_l5_n0";
    md_l5_n0.eventContext = eventContext_287;
    md_l5_n0.dataCollector = dataCollector_288;
    md_l5_n0.upstream1 = md_l4_n0;
    md_l5_n0.upstream2 = md_l4_n1;
    md_l5_n1.setUpstream1(md_l4_n1);
    md_l5_n1.setNodeId("md_l5_n1");
    md_l5_n1.setDataCollector(dataCollector_288);
    md_l5_n1.setEventContext(eventContext_287);
    md_l5_n1.setUpstream2(md_l4_n2);
    md_l5_n1.value = 0.0;
    md_l5_n1.nodeId = "md_l5_n1";
    md_l5_n1.eventContext = eventContext_287;
    md_l5_n1.dataCollector = dataCollector_288;
    md_l5_n1.upstream1 = md_l4_n1;
    md_l5_n1.upstream2 = md_l4_n2;
    md_l5_n2.setUpstream1(md_l4_n2);
    md_l5_n2.setNodeId("md_l5_n2");
    md_l5_n2.setDataCollector(dataCollector_288);
    md_l5_n2.setEventContext(eventContext_287);
    md_l5_n2.setUpstream2(md_l4_n3);
    md_l5_n2.value = 0.0;
    md_l5_n2.nodeId = "md_l5_n2";
    md_l5_n2.eventContext = eventContext_287;
    md_l5_n2.dataCollector = dataCollector_288;
    md_l5_n2.upstream1 = md_l4_n2;
    md_l5_n2.upstream2 = md_l4_n3;
    md_l5_n3.setUpstream1(md_l4_n3);
    md_l5_n3.setNodeId("md_l5_n3");
    md_l5_n3.setDataCollector(dataCollector_288);
    md_l5_n3.setEventContext(eventContext_287);
    md_l5_n3.setUpstream2(md_l4_n4);
    md_l5_n3.value = 0.0;
    md_l5_n3.nodeId = "md_l5_n3";
    md_l5_n3.eventContext = eventContext_287;
    md_l5_n3.dataCollector = dataCollector_288;
    md_l5_n3.upstream1 = md_l4_n3;
    md_l5_n3.upstream2 = md_l4_n4;
    md_l5_n4.setUpstream1(md_l4_n4);
    md_l5_n4.setNodeId("md_l5_n4");
    md_l5_n4.setDataCollector(dataCollector_288);
    md_l5_n4.setEventContext(eventContext_287);
    md_l5_n4.setUpstream2(md_l4_n5);
    md_l5_n4.value = 0.0;
    md_l5_n4.nodeId = "md_l5_n4";
    md_l5_n4.eventContext = eventContext_287;
    md_l5_n4.dataCollector = dataCollector_288;
    md_l5_n4.upstream1 = md_l4_n4;
    md_l5_n4.upstream2 = md_l4_n5;
    md_l5_n5.setUpstream1(md_l4_n5);
    md_l5_n5.setNodeId("md_l5_n5");
    md_l5_n5.setDataCollector(dataCollector_288);
    md_l5_n5.setEventContext(eventContext_287);
    md_l5_n5.setUpstream2(md_l4_n6);
    md_l5_n5.value = 0.0;
    md_l5_n5.nodeId = "md_l5_n5";
    md_l5_n5.eventContext = eventContext_287;
    md_l5_n5.dataCollector = dataCollector_288;
    md_l5_n5.upstream1 = md_l4_n5;
    md_l5_n5.upstream2 = md_l4_n6;
    md_l5_n6.setUpstream1(md_l4_n6);
    md_l5_n6.setNodeId("md_l5_n6");
    md_l5_n6.setDataCollector(dataCollector_288);
    md_l5_n6.setEventContext(eventContext_287);
    md_l5_n6.setUpstream2(md_l4_n7);
    md_l5_n6.value = 0.0;
    md_l5_n6.nodeId = "md_l5_n6";
    md_l5_n6.eventContext = eventContext_287;
    md_l5_n6.dataCollector = dataCollector_288;
    md_l5_n6.upstream1 = md_l4_n6;
    md_l5_n6.upstream2 = md_l4_n7;
    md_l5_n7.setUpstream1(md_l4_n7);
    md_l5_n7.setNodeId("md_l5_n7");
    md_l5_n7.setDataCollector(dataCollector_288);
    md_l5_n7.setEventContext(eventContext_287);
    md_l5_n7.setUpstream2(md_l4_n8);
    md_l5_n7.value = 0.0;
    md_l5_n7.nodeId = "md_l5_n7";
    md_l5_n7.eventContext = eventContext_287;
    md_l5_n7.dataCollector = dataCollector_288;
    md_l5_n7.upstream1 = md_l4_n7;
    md_l5_n7.upstream2 = md_l4_n8;
    md_l5_n8.setUpstream1(md_l4_n8);
    md_l5_n8.setNodeId("md_l5_n8");
    md_l5_n8.setDataCollector(dataCollector_288);
    md_l5_n8.setEventContext(eventContext_287);
    md_l5_n8.setUpstream2(md_l4_n9);
    md_l5_n8.value = 0.0;
    md_l5_n8.nodeId = "md_l5_n8";
    md_l5_n8.eventContext = eventContext_287;
    md_l5_n8.dataCollector = dataCollector_288;
    md_l5_n8.upstream1 = md_l4_n8;
    md_l5_n8.upstream2 = md_l4_n9;
    md_l5_n9.setUpstream1(md_l4_n9);
    md_l5_n9.setNodeId("md_l5_n9");
    md_l5_n9.setDataCollector(dataCollector_288);
    md_l5_n9.setEventContext(eventContext_287);
    md_l5_n9.setUpstream2(md_l4_n0);
    md_l5_n9.value = 0.0;
    md_l5_n9.nodeId = "md_l5_n9";
    md_l5_n9.eventContext = eventContext_287;
    md_l5_n9.dataCollector = dataCollector_288;
    md_l5_n9.upstream1 = md_l4_n9;
    md_l5_n9.upstream2 = md_l4_n0;
    md_l6_n0.setUpstream1(md_l5_n0);
    md_l6_n0.setNodeId("md_l6_n0");
    md_l6_n0.setDataCollector(dataCollector_288);
    md_l6_n0.setEventContext(eventContext_287);
    md_l6_n0.setUpstream2(md_l5_n1);
    md_l6_n0.value = 0.0;
    md_l6_n0.nodeId = "md_l6_n0";
    md_l6_n0.eventContext = eventContext_287;
    md_l6_n0.dataCollector = dataCollector_288;
    md_l6_n0.upstream1 = md_l5_n0;
    md_l6_n0.upstream2 = md_l5_n1;
    md_l6_n1.setUpstream1(md_l5_n1);
    md_l6_n1.setNodeId("md_l6_n1");
    md_l6_n1.setDataCollector(dataCollector_288);
    md_l6_n1.setEventContext(eventContext_287);
    md_l6_n1.setUpstream2(md_l5_n2);
    md_l6_n1.value = 0.0;
    md_l6_n1.nodeId = "md_l6_n1";
    md_l6_n1.eventContext = eventContext_287;
    md_l6_n1.dataCollector = dataCollector_288;
    md_l6_n1.upstream1 = md_l5_n1;
    md_l6_n1.upstream2 = md_l5_n2;
    md_l6_n2.setUpstream1(md_l5_n2);
    md_l6_n2.setNodeId("md_l6_n2");
    md_l6_n2.setDataCollector(dataCollector_288);
    md_l6_n2.setEventContext(eventContext_287);
    md_l6_n2.setUpstream2(md_l5_n3);
    md_l6_n2.value = 0.0;
    md_l6_n2.nodeId = "md_l6_n2";
    md_l6_n2.eventContext = eventContext_287;
    md_l6_n2.dataCollector = dataCollector_288;
    md_l6_n2.upstream1 = md_l5_n2;
    md_l6_n2.upstream2 = md_l5_n3;
    md_l6_n3.setUpstream1(md_l5_n3);
    md_l6_n3.setNodeId("md_l6_n3");
    md_l6_n3.setDataCollector(dataCollector_288);
    md_l6_n3.setEventContext(eventContext_287);
    md_l6_n3.setUpstream2(md_l5_n4);
    md_l6_n3.value = 0.0;
    md_l6_n3.nodeId = "md_l6_n3";
    md_l6_n3.eventContext = eventContext_287;
    md_l6_n3.dataCollector = dataCollector_288;
    md_l6_n3.upstream1 = md_l5_n3;
    md_l6_n3.upstream2 = md_l5_n4;
    md_l6_n4.setUpstream1(md_l5_n4);
    md_l6_n4.setNodeId("md_l6_n4");
    md_l6_n4.setDataCollector(dataCollector_288);
    md_l6_n4.setEventContext(eventContext_287);
    md_l6_n4.setUpstream2(md_l5_n5);
    md_l6_n4.value = 0.0;
    md_l6_n4.nodeId = "md_l6_n4";
    md_l6_n4.eventContext = eventContext_287;
    md_l6_n4.dataCollector = dataCollector_288;
    md_l6_n4.upstream1 = md_l5_n4;
    md_l6_n4.upstream2 = md_l5_n5;
    md_l6_n5.setUpstream1(md_l5_n5);
    md_l6_n5.setNodeId("md_l6_n5");
    md_l6_n5.setDataCollector(dataCollector_288);
    md_l6_n5.setEventContext(eventContext_287);
    md_l6_n5.setUpstream2(md_l5_n6);
    md_l6_n5.value = 0.0;
    md_l6_n5.nodeId = "md_l6_n5";
    md_l6_n5.eventContext = eventContext_287;
    md_l6_n5.dataCollector = dataCollector_288;
    md_l6_n5.upstream1 = md_l5_n5;
    md_l6_n5.upstream2 = md_l5_n6;
    md_l6_n6.setUpstream1(md_l5_n6);
    md_l6_n6.setNodeId("md_l6_n6");
    md_l6_n6.setDataCollector(dataCollector_288);
    md_l6_n6.setEventContext(eventContext_287);
    md_l6_n6.setUpstream2(md_l5_n7);
    md_l6_n6.value = 0.0;
    md_l6_n6.nodeId = "md_l6_n6";
    md_l6_n6.eventContext = eventContext_287;
    md_l6_n6.dataCollector = dataCollector_288;
    md_l6_n6.upstream1 = md_l5_n6;
    md_l6_n6.upstream2 = md_l5_n7;
    md_l6_n7.setUpstream1(md_l5_n7);
    md_l6_n7.setNodeId("md_l6_n7");
    md_l6_n7.setDataCollector(dataCollector_288);
    md_l6_n7.setEventContext(eventContext_287);
    md_l6_n7.setUpstream2(md_l5_n8);
    md_l6_n7.value = 0.0;
    md_l6_n7.nodeId = "md_l6_n7";
    md_l6_n7.eventContext = eventContext_287;
    md_l6_n7.dataCollector = dataCollector_288;
    md_l6_n7.upstream1 = md_l5_n7;
    md_l6_n7.upstream2 = md_l5_n8;
    md_l6_n8.setUpstream1(md_l5_n8);
    md_l6_n8.setNodeId("md_l6_n8");
    md_l6_n8.setDataCollector(dataCollector_288);
    md_l6_n8.setEventContext(eventContext_287);
    md_l6_n8.setUpstream2(md_l5_n9);
    md_l6_n8.value = 0.0;
    md_l6_n8.nodeId = "md_l6_n8";
    md_l6_n8.eventContext = eventContext_287;
    md_l6_n8.dataCollector = dataCollector_288;
    md_l6_n8.upstream1 = md_l5_n8;
    md_l6_n8.upstream2 = md_l5_n9;
    md_l6_n9.setUpstream1(md_l5_n9);
    md_l6_n9.setNodeId("md_l6_n9");
    md_l6_n9.setDataCollector(dataCollector_288);
    md_l6_n9.setEventContext(eventContext_287);
    md_l6_n9.setUpstream2(md_l5_n0);
    md_l6_n9.value = 0.0;
    md_l6_n9.nodeId = "md_l6_n9";
    md_l6_n9.eventContext = eventContext_287;
    md_l6_n9.dataCollector = dataCollector_288;
    md_l6_n9.upstream1 = md_l5_n9;
    md_l6_n9.upstream2 = md_l5_n0;
    md_l7_n0.setUpstream1(md_l6_n0);
    md_l7_n0.setNodeId("md_l7_n0");
    md_l7_n0.setDataCollector(dataCollector_288);
    md_l7_n0.setEventContext(eventContext_287);
    md_l7_n0.setUpstream2(md_l6_n1);
    md_l7_n0.value = 0.0;
    md_l7_n0.nodeId = "md_l7_n0";
    md_l7_n0.eventContext = eventContext_287;
    md_l7_n0.dataCollector = dataCollector_288;
    md_l7_n0.upstream1 = md_l6_n0;
    md_l7_n0.upstream2 = md_l6_n1;
    md_l7_n1.setUpstream1(md_l6_n1);
    md_l7_n1.setNodeId("md_l7_n1");
    md_l7_n1.setDataCollector(dataCollector_288);
    md_l7_n1.setEventContext(eventContext_287);
    md_l7_n1.setUpstream2(md_l6_n2);
    md_l7_n1.value = 0.0;
    md_l7_n1.nodeId = "md_l7_n1";
    md_l7_n1.eventContext = eventContext_287;
    md_l7_n1.dataCollector = dataCollector_288;
    md_l7_n1.upstream1 = md_l6_n1;
    md_l7_n1.upstream2 = md_l6_n2;
    md_l7_n2.setUpstream1(md_l6_n2);
    md_l7_n2.setNodeId("md_l7_n2");
    md_l7_n2.setDataCollector(dataCollector_288);
    md_l7_n2.setEventContext(eventContext_287);
    md_l7_n2.setUpstream2(md_l6_n3);
    md_l7_n2.value = 0.0;
    md_l7_n2.nodeId = "md_l7_n2";
    md_l7_n2.eventContext = eventContext_287;
    md_l7_n2.dataCollector = dataCollector_288;
    md_l7_n2.upstream1 = md_l6_n2;
    md_l7_n2.upstream2 = md_l6_n3;
    md_l7_n3.setUpstream1(md_l6_n3);
    md_l7_n3.setNodeId("md_l7_n3");
    md_l7_n3.setDataCollector(dataCollector_288);
    md_l7_n3.setEventContext(eventContext_287);
    md_l7_n3.setUpstream2(md_l6_n4);
    md_l7_n3.value = 0.0;
    md_l7_n3.nodeId = "md_l7_n3";
    md_l7_n3.eventContext = eventContext_287;
    md_l7_n3.dataCollector = dataCollector_288;
    md_l7_n3.upstream1 = md_l6_n3;
    md_l7_n3.upstream2 = md_l6_n4;
    md_l7_n4.setUpstream1(md_l6_n4);
    md_l7_n4.setNodeId("md_l7_n4");
    md_l7_n4.setDataCollector(dataCollector_288);
    md_l7_n4.setEventContext(eventContext_287);
    md_l7_n4.setUpstream2(md_l6_n5);
    md_l7_n4.value = 0.0;
    md_l7_n4.nodeId = "md_l7_n4";
    md_l7_n4.eventContext = eventContext_287;
    md_l7_n4.dataCollector = dataCollector_288;
    md_l7_n4.upstream1 = md_l6_n4;
    md_l7_n4.upstream2 = md_l6_n5;
    md_l7_n5.setUpstream1(md_l6_n5);
    md_l7_n5.setNodeId("md_l7_n5");
    md_l7_n5.setDataCollector(dataCollector_288);
    md_l7_n5.setEventContext(eventContext_287);
    md_l7_n5.setUpstream2(md_l6_n6);
    md_l7_n5.value = 0.0;
    md_l7_n5.nodeId = "md_l7_n5";
    md_l7_n5.eventContext = eventContext_287;
    md_l7_n5.dataCollector = dataCollector_288;
    md_l7_n5.upstream1 = md_l6_n5;
    md_l7_n5.upstream2 = md_l6_n6;
    md_l7_n6.setUpstream1(md_l6_n6);
    md_l7_n6.setNodeId("md_l7_n6");
    md_l7_n6.setDataCollector(dataCollector_288);
    md_l7_n6.setEventContext(eventContext_287);
    md_l7_n6.setUpstream2(md_l6_n7);
    md_l7_n6.value = 0.0;
    md_l7_n6.nodeId = "md_l7_n6";
    md_l7_n6.eventContext = eventContext_287;
    md_l7_n6.dataCollector = dataCollector_288;
    md_l7_n6.upstream1 = md_l6_n6;
    md_l7_n6.upstream2 = md_l6_n7;
    md_l7_n7.setUpstream1(md_l6_n7);
    md_l7_n7.setNodeId("md_l7_n7");
    md_l7_n7.setDataCollector(dataCollector_288);
    md_l7_n7.setEventContext(eventContext_287);
    md_l7_n7.setUpstream2(md_l6_n8);
    md_l7_n7.value = 0.0;
    md_l7_n7.nodeId = "md_l7_n7";
    md_l7_n7.eventContext = eventContext_287;
    md_l7_n7.dataCollector = dataCollector_288;
    md_l7_n7.upstream1 = md_l6_n7;
    md_l7_n7.upstream2 = md_l6_n8;
    md_l7_n8.setUpstream1(md_l6_n8);
    md_l7_n8.setNodeId("md_l7_n8");
    md_l7_n8.setDataCollector(dataCollector_288);
    md_l7_n8.setEventContext(eventContext_287);
    md_l7_n8.setUpstream2(md_l6_n9);
    md_l7_n8.value = 0.0;
    md_l7_n8.nodeId = "md_l7_n8";
    md_l7_n8.eventContext = eventContext_287;
    md_l7_n8.dataCollector = dataCollector_288;
    md_l7_n8.upstream1 = md_l6_n8;
    md_l7_n8.upstream2 = md_l6_n9;
    md_l7_n9.setUpstream1(md_l6_n9);
    md_l7_n9.setNodeId("md_l7_n9");
    md_l7_n9.setDataCollector(dataCollector_288);
    md_l7_n9.setEventContext(eventContext_287);
    md_l7_n9.setUpstream2(md_l6_n0);
    md_l7_n9.value = 0.0;
    md_l7_n9.nodeId = "md_l7_n9";
    md_l7_n9.eventContext = eventContext_287;
    md_l7_n9.dataCollector = dataCollector_288;
    md_l7_n9.upstream1 = md_l6_n9;
    md_l7_n9.upstream2 = md_l6_n0;
    md_l8_n0.setUpstream1(md_l7_n0);
    md_l8_n0.setNodeId("md_l8_n0");
    md_l8_n0.setDataCollector(dataCollector_288);
    md_l8_n0.setEventContext(eventContext_287);
    md_l8_n0.setUpstream2(md_l7_n1);
    md_l8_n0.value = 0.0;
    md_l8_n0.nodeId = "md_l8_n0";
    md_l8_n0.eventContext = eventContext_287;
    md_l8_n0.dataCollector = dataCollector_288;
    md_l8_n0.upstream1 = md_l7_n0;
    md_l8_n0.upstream2 = md_l7_n1;
    md_l8_n1.setUpstream1(md_l7_n1);
    md_l8_n1.setNodeId("md_l8_n1");
    md_l8_n1.setDataCollector(dataCollector_288);
    md_l8_n1.setEventContext(eventContext_287);
    md_l8_n1.setUpstream2(md_l7_n2);
    md_l8_n1.value = 0.0;
    md_l8_n1.nodeId = "md_l8_n1";
    md_l8_n1.eventContext = eventContext_287;
    md_l8_n1.dataCollector = dataCollector_288;
    md_l8_n1.upstream1 = md_l7_n1;
    md_l8_n1.upstream2 = md_l7_n2;
    md_l8_n2.setUpstream1(md_l7_n2);
    md_l8_n2.setNodeId("md_l8_n2");
    md_l8_n2.setDataCollector(dataCollector_288);
    md_l8_n2.setEventContext(eventContext_287);
    md_l8_n2.setUpstream2(md_l7_n3);
    md_l8_n2.value = 0.0;
    md_l8_n2.nodeId = "md_l8_n2";
    md_l8_n2.eventContext = eventContext_287;
    md_l8_n2.dataCollector = dataCollector_288;
    md_l8_n2.upstream1 = md_l7_n2;
    md_l8_n2.upstream2 = md_l7_n3;
    md_l8_n3.setUpstream1(md_l7_n3);
    md_l8_n3.setNodeId("md_l8_n3");
    md_l8_n3.setDataCollector(dataCollector_288);
    md_l8_n3.setEventContext(eventContext_287);
    md_l8_n3.setUpstream2(md_l7_n4);
    md_l8_n3.value = 0.0;
    md_l8_n3.nodeId = "md_l8_n3";
    md_l8_n3.eventContext = eventContext_287;
    md_l8_n3.dataCollector = dataCollector_288;
    md_l8_n3.upstream1 = md_l7_n3;
    md_l8_n3.upstream2 = md_l7_n4;
    md_l8_n4.setUpstream1(md_l7_n4);
    md_l8_n4.setNodeId("md_l8_n4");
    md_l8_n4.setDataCollector(dataCollector_288);
    md_l8_n4.setEventContext(eventContext_287);
    md_l8_n4.setUpstream2(md_l7_n5);
    md_l8_n4.value = 0.0;
    md_l8_n4.nodeId = "md_l8_n4";
    md_l8_n4.eventContext = eventContext_287;
    md_l8_n4.dataCollector = dataCollector_288;
    md_l8_n4.upstream1 = md_l7_n4;
    md_l8_n4.upstream2 = md_l7_n5;
    md_l8_n5.setUpstream1(md_l7_n5);
    md_l8_n5.setNodeId("md_l8_n5");
    md_l8_n5.setDataCollector(dataCollector_288);
    md_l8_n5.setEventContext(eventContext_287);
    md_l8_n5.setUpstream2(md_l7_n6);
    md_l8_n5.value = 0.0;
    md_l8_n5.nodeId = "md_l8_n5";
    md_l8_n5.eventContext = eventContext_287;
    md_l8_n5.dataCollector = dataCollector_288;
    md_l8_n5.upstream1 = md_l7_n5;
    md_l8_n5.upstream2 = md_l7_n6;
    md_l8_n6.setUpstream1(md_l7_n6);
    md_l8_n6.setNodeId("md_l8_n6");
    md_l8_n6.setDataCollector(dataCollector_288);
    md_l8_n6.setEventContext(eventContext_287);
    md_l8_n6.setUpstream2(md_l7_n7);
    md_l8_n6.value = 0.0;
    md_l8_n6.nodeId = "md_l8_n6";
    md_l8_n6.eventContext = eventContext_287;
    md_l8_n6.dataCollector = dataCollector_288;
    md_l8_n6.upstream1 = md_l7_n6;
    md_l8_n6.upstream2 = md_l7_n7;
    md_l8_n7.setUpstream1(md_l7_n7);
    md_l8_n7.setNodeId("md_l8_n7");
    md_l8_n7.setDataCollector(dataCollector_288);
    md_l8_n7.setEventContext(eventContext_287);
    md_l8_n7.setUpstream2(md_l7_n8);
    md_l8_n7.value = 0.0;
    md_l8_n7.nodeId = "md_l8_n7";
    md_l8_n7.eventContext = eventContext_287;
    md_l8_n7.dataCollector = dataCollector_288;
    md_l8_n7.upstream1 = md_l7_n7;
    md_l8_n7.upstream2 = md_l7_n8;
    md_l8_n8.setUpstream1(md_l7_n8);
    md_l8_n8.setNodeId("md_l8_n8");
    md_l8_n8.setDataCollector(dataCollector_288);
    md_l8_n8.setEventContext(eventContext_287);
    md_l8_n8.setUpstream2(md_l7_n9);
    md_l8_n8.value = 0.0;
    md_l8_n8.nodeId = "md_l8_n8";
    md_l8_n8.eventContext = eventContext_287;
    md_l8_n8.dataCollector = dataCollector_288;
    md_l8_n8.upstream1 = md_l7_n8;
    md_l8_n8.upstream2 = md_l7_n9;
    md_l8_n9.setUpstream1(md_l7_n9);
    md_l8_n9.setNodeId("md_l8_n9");
    md_l8_n9.setDataCollector(dataCollector_288);
    md_l8_n9.setEventContext(eventContext_287);
    md_l8_n9.setUpstream2(md_l7_n0);
    md_l8_n9.value = 0.0;
    md_l8_n9.nodeId = "md_l8_n9";
    md_l8_n9.eventContext = eventContext_287;
    md_l8_n9.dataCollector = dataCollector_288;
    md_l8_n9.upstream1 = md_l7_n9;
    md_l8_n9.upstream2 = md_l7_n0;
    md_l9_n0.setUpstream1(md_l8_n0);
    md_l9_n0.setNodeId("md_l9_n0");
    md_l9_n0.setDataCollector(dataCollector_288);
    md_l9_n0.setEventContext(eventContext_287);
    md_l9_n0.setUpstream2(md_l8_n1);
    md_l9_n0.value = 0.0;
    md_l9_n0.nodeId = "md_l9_n0";
    md_l9_n0.eventContext = eventContext_287;
    md_l9_n0.dataCollector = dataCollector_288;
    md_l9_n0.upstream1 = md_l8_n0;
    md_l9_n0.upstream2 = md_l8_n1;
    md_l9_n1.setUpstream1(md_l8_n1);
    md_l9_n1.setNodeId("md_l9_n1");
    md_l9_n1.setDataCollector(dataCollector_288);
    md_l9_n1.setEventContext(eventContext_287);
    md_l9_n1.setUpstream2(md_l8_n2);
    md_l9_n1.value = 0.0;
    md_l9_n1.nodeId = "md_l9_n1";
    md_l9_n1.eventContext = eventContext_287;
    md_l9_n1.dataCollector = dataCollector_288;
    md_l9_n1.upstream1 = md_l8_n1;
    md_l9_n1.upstream2 = md_l8_n2;
    md_l9_n2.setUpstream1(md_l8_n2);
    md_l9_n2.setNodeId("md_l9_n2");
    md_l9_n2.setDataCollector(dataCollector_288);
    md_l9_n2.setEventContext(eventContext_287);
    md_l9_n2.setUpstream2(md_l8_n3);
    md_l9_n2.value = 0.0;
    md_l9_n2.nodeId = "md_l9_n2";
    md_l9_n2.eventContext = eventContext_287;
    md_l9_n2.dataCollector = dataCollector_288;
    md_l9_n2.upstream1 = md_l8_n2;
    md_l9_n2.upstream2 = md_l8_n3;
    md_l9_n3.setUpstream1(md_l8_n3);
    md_l9_n3.setNodeId("md_l9_n3");
    md_l9_n3.setDataCollector(dataCollector_288);
    md_l9_n3.setEventContext(eventContext_287);
    md_l9_n3.setUpstream2(md_l8_n4);
    md_l9_n3.value = 0.0;
    md_l9_n3.nodeId = "md_l9_n3";
    md_l9_n3.eventContext = eventContext_287;
    md_l9_n3.dataCollector = dataCollector_288;
    md_l9_n3.upstream1 = md_l8_n3;
    md_l9_n3.upstream2 = md_l8_n4;
    md_l9_n4.setUpstream1(md_l8_n4);
    md_l9_n4.setNodeId("md_l9_n4");
    md_l9_n4.setDataCollector(dataCollector_288);
    md_l9_n4.setEventContext(eventContext_287);
    md_l9_n4.setUpstream2(md_l8_n5);
    md_l9_n4.value = 0.0;
    md_l9_n4.nodeId = "md_l9_n4";
    md_l9_n4.eventContext = eventContext_287;
    md_l9_n4.dataCollector = dataCollector_288;
    md_l9_n4.upstream1 = md_l8_n4;
    md_l9_n4.upstream2 = md_l8_n5;
    md_l9_n5.setUpstream1(md_l8_n5);
    md_l9_n5.setNodeId("md_l9_n5");
    md_l9_n5.setDataCollector(dataCollector_288);
    md_l9_n5.setEventContext(eventContext_287);
    md_l9_n5.setUpstream2(md_l8_n6);
    md_l9_n5.value = 0.0;
    md_l9_n5.nodeId = "md_l9_n5";
    md_l9_n5.eventContext = eventContext_287;
    md_l9_n5.dataCollector = dataCollector_288;
    md_l9_n5.upstream1 = md_l8_n5;
    md_l9_n5.upstream2 = md_l8_n6;
    md_l9_n6.setUpstream1(md_l8_n6);
    md_l9_n6.setNodeId("md_l9_n6");
    md_l9_n6.setDataCollector(dataCollector_288);
    md_l9_n6.setEventContext(eventContext_287);
    md_l9_n6.setUpstream2(md_l8_n7);
    md_l9_n6.value = 0.0;
    md_l9_n6.nodeId = "md_l9_n6";
    md_l9_n6.eventContext = eventContext_287;
    md_l9_n6.dataCollector = dataCollector_288;
    md_l9_n6.upstream1 = md_l8_n6;
    md_l9_n6.upstream2 = md_l8_n7;
    md_l9_n7.setUpstream1(md_l8_n7);
    md_l9_n7.setNodeId("md_l9_n7");
    md_l9_n7.setDataCollector(dataCollector_288);
    md_l9_n7.setEventContext(eventContext_287);
    md_l9_n7.setUpstream2(md_l8_n8);
    md_l9_n7.value = 0.0;
    md_l9_n7.nodeId = "md_l9_n7";
    md_l9_n7.eventContext = eventContext_287;
    md_l9_n7.dataCollector = dataCollector_288;
    md_l9_n7.upstream1 = md_l8_n7;
    md_l9_n7.upstream2 = md_l8_n8;
    md_l9_n8.setUpstream1(md_l8_n8);
    md_l9_n8.setNodeId("md_l9_n8");
    md_l9_n8.setDataCollector(dataCollector_288);
    md_l9_n8.setEventContext(eventContext_287);
    md_l9_n8.setUpstream2(md_l8_n9);
    md_l9_n8.value = 0.0;
    md_l9_n8.nodeId = "md_l9_n8";
    md_l9_n8.eventContext = eventContext_287;
    md_l9_n8.dataCollector = dataCollector_288;
    md_l9_n8.upstream1 = md_l8_n8;
    md_l9_n8.upstream2 = md_l8_n9;
    md_l9_n9.setUpstream1(md_l8_n9);
    md_l9_n9.setNodeId("md_l9_n9");
    md_l9_n9.setDataCollector(dataCollector_288);
    md_l9_n9.setEventContext(eventContext_287);
    md_l9_n9.setUpstream2(md_l8_n0);
    md_l9_n9.value = 0.0;
    md_l9_n9.nodeId = "md_l9_n9";
    md_l9_n9.eventContext = eventContext_287;
    md_l9_n9.dataCollector = dataCollector_288;
    md_l9_n9.upstream1 = md_l8_n9;
    md_l9_n9.upstream2 = md_l8_n0;
    md_l10_n0.setUpstream1(md_l9_n0);
    md_l10_n0.setNodeId("md_l10_n0");
    md_l10_n0.setDataCollector(dataCollector_288);
    md_l10_n0.setEventContext(eventContext_287);
    md_l10_n0.setUpstream2(md_l9_n1);
    md_l10_n0.value = 0.0;
    md_l10_n0.nodeId = "md_l10_n0";
    md_l10_n0.eventContext = eventContext_287;
    md_l10_n0.dataCollector = dataCollector_288;
    md_l10_n0.upstream1 = md_l9_n0;
    md_l10_n0.upstream2 = md_l9_n1;
    md_l10_n1.setUpstream1(md_l9_n1);
    md_l10_n1.setNodeId("md_l10_n1");
    md_l10_n1.setDataCollector(dataCollector_288);
    md_l10_n1.setEventContext(eventContext_287);
    md_l10_n1.setUpstream2(md_l9_n2);
    md_l10_n1.value = 0.0;
    md_l10_n1.nodeId = "md_l10_n1";
    md_l10_n1.eventContext = eventContext_287;
    md_l10_n1.dataCollector = dataCollector_288;
    md_l10_n1.upstream1 = md_l9_n1;
    md_l10_n1.upstream2 = md_l9_n2;
    md_l10_n2.setUpstream1(md_l9_n2);
    md_l10_n2.setNodeId("md_l10_n2");
    md_l10_n2.setDataCollector(dataCollector_288);
    md_l10_n2.setEventContext(eventContext_287);
    md_l10_n2.setUpstream2(md_l9_n3);
    md_l10_n2.value = 0.0;
    md_l10_n2.nodeId = "md_l10_n2";
    md_l10_n2.eventContext = eventContext_287;
    md_l10_n2.dataCollector = dataCollector_288;
    md_l10_n2.upstream1 = md_l9_n2;
    md_l10_n2.upstream2 = md_l9_n3;
    md_l10_n3.setUpstream1(md_l9_n3);
    md_l10_n3.setNodeId("md_l10_n3");
    md_l10_n3.setDataCollector(dataCollector_288);
    md_l10_n3.setEventContext(eventContext_287);
    md_l10_n3.setUpstream2(md_l9_n4);
    md_l10_n3.value = 0.0;
    md_l10_n3.nodeId = "md_l10_n3";
    md_l10_n3.eventContext = eventContext_287;
    md_l10_n3.dataCollector = dataCollector_288;
    md_l10_n3.upstream1 = md_l9_n3;
    md_l10_n3.upstream2 = md_l9_n4;
    md_l10_n4.setUpstream1(md_l9_n4);
    md_l10_n4.setNodeId("md_l10_n4");
    md_l10_n4.setDataCollector(dataCollector_288);
    md_l10_n4.setEventContext(eventContext_287);
    md_l10_n4.setUpstream2(md_l9_n5);
    md_l10_n4.value = 0.0;
    md_l10_n4.nodeId = "md_l10_n4";
    md_l10_n4.eventContext = eventContext_287;
    md_l10_n4.dataCollector = dataCollector_288;
    md_l10_n4.upstream1 = md_l9_n4;
    md_l10_n4.upstream2 = md_l9_n5;
    md_l10_n5.setUpstream1(md_l9_n5);
    md_l10_n5.setNodeId("md_l10_n5");
    md_l10_n5.setDataCollector(dataCollector_288);
    md_l10_n5.setEventContext(eventContext_287);
    md_l10_n5.setUpstream2(md_l9_n6);
    md_l10_n5.value = 0.0;
    md_l10_n5.nodeId = "md_l10_n5";
    md_l10_n5.eventContext = eventContext_287;
    md_l10_n5.dataCollector = dataCollector_288;
    md_l10_n5.upstream1 = md_l9_n5;
    md_l10_n5.upstream2 = md_l9_n6;
    md_l10_n6.setUpstream1(md_l9_n6);
    md_l10_n6.setNodeId("md_l10_n6");
    md_l10_n6.setDataCollector(dataCollector_288);
    md_l10_n6.setEventContext(eventContext_287);
    md_l10_n6.setUpstream2(md_l9_n7);
    md_l10_n6.value = 0.0;
    md_l10_n6.nodeId = "md_l10_n6";
    md_l10_n6.eventContext = eventContext_287;
    md_l10_n6.dataCollector = dataCollector_288;
    md_l10_n6.upstream1 = md_l9_n6;
    md_l10_n6.upstream2 = md_l9_n7;
    md_l10_n7.setUpstream1(md_l9_n7);
    md_l10_n7.setNodeId("md_l10_n7");
    md_l10_n7.setDataCollector(dataCollector_288);
    md_l10_n7.setEventContext(eventContext_287);
    md_l10_n7.setUpstream2(md_l9_n8);
    md_l10_n7.value = 0.0;
    md_l10_n7.nodeId = "md_l10_n7";
    md_l10_n7.eventContext = eventContext_287;
    md_l10_n7.dataCollector = dataCollector_288;
    md_l10_n7.upstream1 = md_l9_n7;
    md_l10_n7.upstream2 = md_l9_n8;
    md_l10_n8.setUpstream1(md_l9_n8);
    md_l10_n8.setNodeId("md_l10_n8");
    md_l10_n8.setDataCollector(dataCollector_288);
    md_l10_n8.setEventContext(eventContext_287);
    md_l10_n8.setUpstream2(md_l9_n9);
    md_l10_n8.value = 0.0;
    md_l10_n8.nodeId = "md_l10_n8";
    md_l10_n8.eventContext = eventContext_287;
    md_l10_n8.dataCollector = dataCollector_288;
    md_l10_n8.upstream1 = md_l9_n8;
    md_l10_n8.upstream2 = md_l9_n9;
    md_l10_n9.setUpstream1(md_l9_n9);
    md_l10_n9.setNodeId("md_l10_n9");
    md_l10_n9.setDataCollector(dataCollector_288);
    md_l10_n9.setEventContext(eventContext_287);
    md_l10_n9.setUpstream2(md_l9_n0);
    md_l10_n9.value = 0.0;
    md_l10_n9.nodeId = "md_l10_n9";
    md_l10_n9.eventContext = eventContext_287;
    md_l10_n9.dataCollector = dataCollector_288;
    md_l10_n9.upstream1 = md_l9_n9;
    md_l10_n9.upstream2 = md_l9_n0;
    ctrl_root.setNodeId("ctrl_root");
    ctrl_root.setDataCollector(dataCollector_288);
    ctrl_root.setEventContext(eventContext_287);
    ctrl_root.value = 0.0;
    ctrl_root.nodeId = "ctrl_root";
    ctrl_root.eventContext = eventContext_287;
    ctrl_root.dataCollector = dataCollector_288;
    md_root.setNodeId("md_root");
    md_root.setDataCollector(dataCollector_288);
    md_root.setEventContext(eventContext_287);
    md_root.value = 0.0;
    md_root.nodeId = "md_root";
    md_root.eventContext = eventContext_287;
    md_root.dataCollector = dataCollector_288;
    md_sink.setUpstream1(md_l10_n0);
    md_sink.setNodeId("md_sink");
    md_sink.setDataCollector(dataCollector_288);
    md_sink.setEventContext(eventContext_287);
    md_sink.setUpstream2(md_l10_n1);
    md_sink.setUpstream3(md_l10_n2);
    md_sink.setUpstream4(md_l10_n3);
    md_sink.setUpstream5(md_l10_n4);
    md_sink.value = 0.0;
    md_sink.nodeId = "md_sink";
    md_sink.eventContext = eventContext_287;
    md_sink.dataCollector = dataCollector_288;
    md_sink.upstream1 = md_l10_n0;
    md_sink.upstream2 = md_l10_n1;
    md_sink.upstream3 = md_l10_n2;
    md_sink.upstream4 = md_l10_n3;
    md_sink.upstream5 = md_l10_n4;
    sink.setUpstream1(md_sink);
    sink.setNodeId("sink");
    sink.setDataCollector(dataCollector_288);
    sink.setEventContext(eventContext_287);
    sink.setUpstream2(ts_sink);
    sink.value = 0.0;
    sink.nodeId = "sink";
    sink.eventContext = eventContext_287;
    sink.dataCollector = dataCollector_288;
    sink.upstream1 = md_sink;
    sink.upstream2 = ts_sink;
    ts_sink.setUpstream1(ts_l9_n0);
    ts_sink.setNodeId("ts_sink");
    ts_sink.setDataCollector(dataCollector_288);
    ts_sink.setEventContext(eventContext_287);
    ts_sink.setUpstream2(ts_l9_n1);
    ts_sink.setUpstream3(ts_l9_n2);
    ts_sink.setUpstream4(ts_l9_n3);
    ts_sink.setUpstream5(ts_l9_n4);
    ts_sink.value = 0.0;
    ts_sink.nodeId = "ts_sink";
    ts_sink.eventContext = eventContext_287;
    ts_sink.dataCollector = dataCollector_288;
    ts_sink.upstream1 = ts_l9_n0;
    ts_sink.upstream2 = ts_l9_n1;
    ts_sink.upstream3 = ts_l9_n2;
    ts_sink.upstream4 = ts_l9_n3;
    ts_sink.upstream5 = ts_l9_n4;
    ts_root.setNodeId("ts_root");
    ts_root.setDataCollector(dataCollector_288);
    ts_root.setEventContext(eventContext_287);
    ts_root.value = 0.0;
    ts_root.nodeId = "ts_root";
    ts_root.eventContext = eventContext_287;
    ts_root.dataCollector = dataCollector_288;
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
    dataCollector_288.onInit();
    eventContext_287.onInit();
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
    isDirty_ctrl_root = ctrl_root.onControlEvent(typedEvent);
    if (guardCheck_ctrl_l1_n0()) {
      isDirty_ctrl_l1_n0 = ctrl_l1_n0.onUpstream();
    }
    if (guardCheck_ctrl_l1_n1()) {
      isDirty_ctrl_l1_n1 = ctrl_l1_n1.onUpstream();
    }
    if (guardCheck_ctrl_l1_n2()) {
      isDirty_ctrl_l1_n2 = ctrl_l1_n2.onUpstream();
    }
    if (guardCheck_ctrl_l1_n3()) {
      isDirty_ctrl_l1_n3 = ctrl_l1_n3.onUpstream();
    }
    if (guardCheck_ctrl_l1_n4()) {
      isDirty_ctrl_l1_n4 = ctrl_l1_n4.onUpstream();
    }
    if (guardCheck_ctrl_l1_n5()) {
      isDirty_ctrl_l1_n5 = ctrl_l1_n5.onUpstream();
    }
    if (guardCheck_ctrl_l1_n6()) {
      isDirty_ctrl_l1_n6 = ctrl_l1_n6.onUpstream();
    }
    if (guardCheck_ctrl_l1_n7()) {
      isDirty_ctrl_l1_n7 = ctrl_l1_n7.onUpstream();
    }
    if (guardCheck_ctrl_l1_n8()) {
      isDirty_ctrl_l1_n8 = ctrl_l1_n8.onUpstream();
    }
    if (guardCheck_ctrl_l1_n9()) {
      isDirty_ctrl_l1_n9 = ctrl_l1_n9.onUpstream();
    }
    if (guardCheck_ctrl_l2_n0()) {
      isDirty_ctrl_l2_n0 = ctrl_l2_n0.onUpstream();
    }
    if (guardCheck_ctrl_l2_n1()) {
      isDirty_ctrl_l2_n1 = ctrl_l2_n1.onUpstream();
    }
    if (guardCheck_ctrl_l2_n2()) {
      isDirty_ctrl_l2_n2 = ctrl_l2_n2.onUpstream();
    }
    if (guardCheck_ctrl_l2_n3()) {
      isDirty_ctrl_l2_n3 = ctrl_l2_n3.onUpstream();
    }
    if (guardCheck_ctrl_l2_n4()) {
      isDirty_ctrl_l2_n4 = ctrl_l2_n4.onUpstream();
    }
    if (guardCheck_ctrl_l2_n5()) {
      isDirty_ctrl_l2_n5 = ctrl_l2_n5.onUpstream();
    }
    if (guardCheck_ctrl_l2_n6()) {
      isDirty_ctrl_l2_n6 = ctrl_l2_n6.onUpstream();
    }
    if (guardCheck_ctrl_l2_n7()) {
      isDirty_ctrl_l2_n7 = ctrl_l2_n7.onUpstream();
    }
    if (guardCheck_ctrl_l2_n8()) {
      isDirty_ctrl_l2_n8 = ctrl_l2_n8.onUpstream();
    }
    if (guardCheck_ctrl_l2_n9()) {
      isDirty_ctrl_l2_n9 = ctrl_l2_n9.onUpstream();
    }
    if (guardCheck_ctrl_l3_n0()) {
      isDirty_ctrl_l3_n0 = ctrl_l3_n0.onUpstream();
    }
    if (guardCheck_ctrl_l3_n1()) {
      isDirty_ctrl_l3_n1 = ctrl_l3_n1.onUpstream();
    }
    if (guardCheck_ctrl_l3_n2()) {
      isDirty_ctrl_l3_n2 = ctrl_l3_n2.onUpstream();
    }
    if (guardCheck_ctrl_l3_n3()) {
      isDirty_ctrl_l3_n3 = ctrl_l3_n3.onUpstream();
    }
    if (guardCheck_ctrl_l3_n4()) {
      isDirty_ctrl_l3_n4 = ctrl_l3_n4.onUpstream();
    }
    if (guardCheck_ctrl_l3_n5()) {
      isDirty_ctrl_l3_n5 = ctrl_l3_n5.onUpstream();
    }
    if (guardCheck_ctrl_l3_n6()) {
      isDirty_ctrl_l3_n6 = ctrl_l3_n6.onUpstream();
    }
    if (guardCheck_ctrl_l3_n7()) {
      isDirty_ctrl_l3_n7 = ctrl_l3_n7.onUpstream();
    }
    if (guardCheck_ctrl_l3_n8()) {
      isDirty_ctrl_l3_n8 = ctrl_l3_n8.onUpstream();
    }
    if (guardCheck_ctrl_l3_n9()) {
      isDirty_ctrl_l3_n9 = ctrl_l3_n9.onUpstream();
    }
    if (guardCheck_ctrl_l4_n0()) {
      isDirty_ctrl_l4_n0 = ctrl_l4_n0.onUpstream();
    }
    if (guardCheck_ctrl_l4_n1()) {
      isDirty_ctrl_l4_n1 = ctrl_l4_n1.onUpstream();
    }
    if (guardCheck_ctrl_l4_n2()) {
      isDirty_ctrl_l4_n2 = ctrl_l4_n2.onUpstream();
    }
    if (guardCheck_ctrl_l4_n3()) {
      isDirty_ctrl_l4_n3 = ctrl_l4_n3.onUpstream();
    }
    if (guardCheck_ctrl_l4_n4()) {
      isDirty_ctrl_l4_n4 = ctrl_l4_n4.onUpstream();
    }
    if (guardCheck_ctrl_l4_n5()) {
      isDirty_ctrl_l4_n5 = ctrl_l4_n5.onUpstream();
    }
    if (guardCheck_ctrl_l4_n6()) {
      isDirty_ctrl_l4_n6 = ctrl_l4_n6.onUpstream();
    }
    if (guardCheck_ctrl_l4_n7()) {
      isDirty_ctrl_l4_n7 = ctrl_l4_n7.onUpstream();
    }
    if (guardCheck_ctrl_l4_n8()) {
      isDirty_ctrl_l4_n8 = ctrl_l4_n8.onUpstream();
    }
    if (guardCheck_ctrl_l4_n9()) {
      isDirty_ctrl_l4_n9 = ctrl_l4_n9.onUpstream();
    }
    if (guardCheck_ctrl_l5_n0()) {
      isDirty_ctrl_l5_n0 = ctrl_l5_n0.onUpstream();
    }
    if (guardCheck_ctrl_l5_n1()) {
      isDirty_ctrl_l5_n1 = ctrl_l5_n1.onUpstream();
    }
    if (guardCheck_ctrl_l5_n2()) {
      isDirty_ctrl_l5_n2 = ctrl_l5_n2.onUpstream();
    }
    if (guardCheck_ctrl_l5_n3()) {
      isDirty_ctrl_l5_n3 = ctrl_l5_n3.onUpstream();
    }
    if (guardCheck_ctrl_l5_n4()) {
      isDirty_ctrl_l5_n4 = ctrl_l5_n4.onUpstream();
    }
    if (guardCheck_ctrl_l5_n5()) {
      isDirty_ctrl_l5_n5 = ctrl_l5_n5.onUpstream();
    }
    if (guardCheck_ctrl_l5_n6()) {
      isDirty_ctrl_l5_n6 = ctrl_l5_n6.onUpstream();
    }
    if (guardCheck_ctrl_l5_n7()) {
      isDirty_ctrl_l5_n7 = ctrl_l5_n7.onUpstream();
    }
    if (guardCheck_ctrl_l5_n8()) {
      isDirty_ctrl_l5_n8 = ctrl_l5_n8.onUpstream();
    }
    if (guardCheck_ctrl_l5_n9()) {
      isDirty_ctrl_l5_n9 = ctrl_l5_n9.onUpstream();
    }
    if (guardCheck_ctrl_l6_n0()) {
      isDirty_ctrl_l6_n0 = ctrl_l6_n0.onUpstream();
    }
    if (guardCheck_ctrl_l6_n1()) {
      isDirty_ctrl_l6_n1 = ctrl_l6_n1.onUpstream();
    }
    if (guardCheck_ctrl_l6_n2()) {
      isDirty_ctrl_l6_n2 = ctrl_l6_n2.onUpstream();
    }
    if (guardCheck_ctrl_l6_n3()) {
      isDirty_ctrl_l6_n3 = ctrl_l6_n3.onUpstream();
    }
    if (guardCheck_ctrl_l6_n4()) {
      isDirty_ctrl_l6_n4 = ctrl_l6_n4.onUpstream();
    }
    if (guardCheck_ctrl_l6_n5()) {
      isDirty_ctrl_l6_n5 = ctrl_l6_n5.onUpstream();
    }
    if (guardCheck_ctrl_l6_n6()) {
      isDirty_ctrl_l6_n6 = ctrl_l6_n6.onUpstream();
    }
    if (guardCheck_ctrl_l6_n7()) {
      isDirty_ctrl_l6_n7 = ctrl_l6_n7.onUpstream();
    }
    if (guardCheck_ctrl_l6_n8()) {
      isDirty_ctrl_l6_n8 = ctrl_l6_n8.onUpstream();
    }
    if (guardCheck_ctrl_l6_n9()) {
      isDirty_ctrl_l6_n9 = ctrl_l6_n9.onUpstream();
    }
    if (guardCheck_ctrl_l7_n0()) {
      isDirty_ctrl_l7_n0 = ctrl_l7_n0.onUpstream();
    }
    if (guardCheck_ctrl_l7_n1()) {
      isDirty_ctrl_l7_n1 = ctrl_l7_n1.onUpstream();
    }
    if (guardCheck_ctrl_l7_n2()) {
      isDirty_ctrl_l7_n2 = ctrl_l7_n2.onUpstream();
    }
    if (guardCheck_ctrl_l7_n3()) {
      isDirty_ctrl_l7_n3 = ctrl_l7_n3.onUpstream();
    }
    if (guardCheck_ctrl_l7_n4()) {
      isDirty_ctrl_l7_n4 = ctrl_l7_n4.onUpstream();
    }
    if (guardCheck_ctrl_l7_n5()) {
      isDirty_ctrl_l7_n5 = ctrl_l7_n5.onUpstream();
    }
    if (guardCheck_ctrl_l7_n6()) {
      isDirty_ctrl_l7_n6 = ctrl_l7_n6.onUpstream();
    }
    if (guardCheck_ctrl_l7_n7()) {
      isDirty_ctrl_l7_n7 = ctrl_l7_n7.onUpstream();
    }
    if (guardCheck_ctrl_l7_n8()) {
      isDirty_ctrl_l7_n8 = ctrl_l7_n8.onUpstream();
    }
    if (guardCheck_ctrl_l7_n9()) {
      isDirty_ctrl_l7_n9 = ctrl_l7_n9.onUpstream();
    }
    if (guardCheck_ctrl_l8_n0()) {
      isDirty_ctrl_l8_n0 = ctrl_l8_n0.onUpstream();
    }
    if (guardCheck_ctrl_l8_n1()) {
      isDirty_ctrl_l8_n1 = ctrl_l8_n1.onUpstream();
    }
    if (guardCheck_ctrl_l8_n2()) {
      isDirty_ctrl_l8_n2 = ctrl_l8_n2.onUpstream();
    }
    if (guardCheck_ctrl_l8_n3()) {
      isDirty_ctrl_l8_n3 = ctrl_l8_n3.onUpstream();
    }
    if (guardCheck_ctrl_l8_n4()) {
      isDirty_ctrl_l8_n4 = ctrl_l8_n4.onUpstream();
    }
    if (guardCheck_ctrl_l8_n5()) {
      isDirty_ctrl_l8_n5 = ctrl_l8_n5.onUpstream();
    }
    if (guardCheck_ctrl_l8_n6()) {
      isDirty_ctrl_l8_n6 = ctrl_l8_n6.onUpstream();
    }
    if (guardCheck_ctrl_l8_n7()) {
      isDirty_ctrl_l8_n7 = ctrl_l8_n7.onUpstream();
    }
    if (guardCheck_ctrl_l8_n8()) {
      isDirty_ctrl_l8_n8 = ctrl_l8_n8.onUpstream();
    }
    if (guardCheck_ctrl_l8_n9()) {
      isDirty_ctrl_l8_n9 = ctrl_l8_n9.onUpstream();
    }
    if (guardCheck_ctrl_l9_n0()) {
      isDirty_ctrl_l9_n0 = ctrl_l9_n0.onUpstream();
    }
    if (guardCheck_ctrl_l9_n1()) {
      isDirty_ctrl_l9_n1 = ctrl_l9_n1.onUpstream();
    }
    if (guardCheck_ctrl_l9_n2()) {
      isDirty_ctrl_l9_n2 = ctrl_l9_n2.onUpstream();
    }
    if (guardCheck_ctrl_l9_n3()) {
      ctrl_l9_n3.onUpstream();
    }
    if (guardCheck_ctrl_l9_n4()) {
      ctrl_l9_n4.onUpstream();
    }
    if (guardCheck_ctrl_l9_n5()) {
      ctrl_l9_n5.onUpstream();
    }
    if (guardCheck_ctrl_l9_n6()) {
      ctrl_l9_n6.onUpstream();
    }
    if (guardCheck_ctrl_l9_n7()) {
      ctrl_l9_n7.onUpstream();
    }
    if (guardCheck_ctrl_l9_n8()) {
      ctrl_l9_n8.onUpstream();
    }
    if (guardCheck_ctrl_l9_n9()) {
      ctrl_l9_n9.onUpstream();
    }
    if (guardCheck_ctrl_sink()) {
      ctrl_sink.onUpstream();
    }
    afterEvent();
  }

  public void handleEvent(ValidationMarketEvent typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    isDirty_md_root = md_root.onMarketEvent(typedEvent);
    if (guardCheck_md_l1_n0()) {
      isDirty_md_l1_n0 = md_l1_n0.onUpstream();
    }
    if (guardCheck_md_l1_n1()) {
      isDirty_md_l1_n1 = md_l1_n1.onUpstream();
    }
    if (guardCheck_md_l1_n2()) {
      isDirty_md_l1_n2 = md_l1_n2.onUpstream();
    }
    if (guardCheck_md_l1_n3()) {
      isDirty_md_l1_n3 = md_l1_n3.onUpstream();
    }
    if (guardCheck_md_l1_n4()) {
      isDirty_md_l1_n4 = md_l1_n4.onUpstream();
    }
    if (guardCheck_md_l1_n5()) {
      isDirty_md_l1_n5 = md_l1_n5.onUpstream();
    }
    if (guardCheck_md_l1_n6()) {
      isDirty_md_l1_n6 = md_l1_n6.onUpstream();
    }
    if (guardCheck_md_l1_n7()) {
      isDirty_md_l1_n7 = md_l1_n7.onUpstream();
    }
    if (guardCheck_md_l1_n8()) {
      isDirty_md_l1_n8 = md_l1_n8.onUpstream();
    }
    if (guardCheck_md_l1_n9()) {
      isDirty_md_l1_n9 = md_l1_n9.onUpstream();
    }
    if (guardCheck_md_l2_n0()) {
      isDirty_md_l2_n0 = md_l2_n0.onUpstream();
    }
    if (guardCheck_md_l2_n1()) {
      isDirty_md_l2_n1 = md_l2_n1.onUpstream();
    }
    if (guardCheck_md_l2_n2()) {
      isDirty_md_l2_n2 = md_l2_n2.onUpstream();
    }
    if (guardCheck_md_l2_n3()) {
      isDirty_md_l2_n3 = md_l2_n3.onUpstream();
    }
    if (guardCheck_md_l2_n4()) {
      isDirty_md_l2_n4 = md_l2_n4.onUpstream();
    }
    if (guardCheck_md_l2_n5()) {
      isDirty_md_l2_n5 = md_l2_n5.onUpstream();
    }
    if (guardCheck_md_l2_n6()) {
      isDirty_md_l2_n6 = md_l2_n6.onUpstream();
    }
    if (guardCheck_md_l2_n7()) {
      isDirty_md_l2_n7 = md_l2_n7.onUpstream();
    }
    if (guardCheck_md_l2_n8()) {
      isDirty_md_l2_n8 = md_l2_n8.onUpstream();
    }
    if (guardCheck_md_l2_n9()) {
      isDirty_md_l2_n9 = md_l2_n9.onUpstream();
    }
    if (guardCheck_md_l3_n0()) {
      isDirty_md_l3_n0 = md_l3_n0.onUpstream();
    }
    if (guardCheck_md_l3_n1()) {
      isDirty_md_l3_n1 = md_l3_n1.onUpstream();
    }
    if (guardCheck_md_l3_n2()) {
      isDirty_md_l3_n2 = md_l3_n2.onUpstream();
    }
    if (guardCheck_md_l3_n3()) {
      isDirty_md_l3_n3 = md_l3_n3.onUpstream();
    }
    if (guardCheck_md_l3_n4()) {
      isDirty_md_l3_n4 = md_l3_n4.onUpstream();
    }
    if (guardCheck_md_l3_n5()) {
      isDirty_md_l3_n5 = md_l3_n5.onUpstream();
    }
    if (guardCheck_md_l3_n6()) {
      isDirty_md_l3_n6 = md_l3_n6.onUpstream();
    }
    if (guardCheck_md_l3_n7()) {
      isDirty_md_l3_n7 = md_l3_n7.onUpstream();
    }
    if (guardCheck_md_l3_n8()) {
      isDirty_md_l3_n8 = md_l3_n8.onUpstream();
    }
    if (guardCheck_md_l3_n9()) {
      isDirty_md_l3_n9 = md_l3_n9.onUpstream();
    }
    if (guardCheck_md_l4_n0()) {
      isDirty_md_l4_n0 = md_l4_n0.onUpstream();
    }
    if (guardCheck_md_l4_n1()) {
      isDirty_md_l4_n1 = md_l4_n1.onUpstream();
    }
    if (guardCheck_md_l4_n2()) {
      isDirty_md_l4_n2 = md_l4_n2.onUpstream();
    }
    if (guardCheck_md_l4_n3()) {
      isDirty_md_l4_n3 = md_l4_n3.onUpstream();
    }
    if (guardCheck_md_l4_n4()) {
      isDirty_md_l4_n4 = md_l4_n4.onUpstream();
    }
    if (guardCheck_md_l4_n5()) {
      isDirty_md_l4_n5 = md_l4_n5.onUpstream();
    }
    if (guardCheck_md_l4_n6()) {
      isDirty_md_l4_n6 = md_l4_n6.onUpstream();
    }
    if (guardCheck_md_l4_n7()) {
      isDirty_md_l4_n7 = md_l4_n7.onUpstream();
    }
    if (guardCheck_md_l4_n8()) {
      isDirty_md_l4_n8 = md_l4_n8.onUpstream();
    }
    if (guardCheck_md_l4_n9()) {
      isDirty_md_l4_n9 = md_l4_n9.onUpstream();
    }
    if (guardCheck_md_l5_n0()) {
      isDirty_md_l5_n0 = md_l5_n0.onUpstream();
    }
    if (guardCheck_md_l5_n1()) {
      isDirty_md_l5_n1 = md_l5_n1.onUpstream();
    }
    if (guardCheck_md_l5_n2()) {
      isDirty_md_l5_n2 = md_l5_n2.onUpstream();
    }
    if (guardCheck_md_l5_n3()) {
      isDirty_md_l5_n3 = md_l5_n3.onUpstream();
    }
    if (guardCheck_md_l5_n4()) {
      isDirty_md_l5_n4 = md_l5_n4.onUpstream();
    }
    if (guardCheck_md_l5_n5()) {
      isDirty_md_l5_n5 = md_l5_n5.onUpstream();
    }
    if (guardCheck_md_l5_n6()) {
      isDirty_md_l5_n6 = md_l5_n6.onUpstream();
    }
    if (guardCheck_md_l5_n7()) {
      isDirty_md_l5_n7 = md_l5_n7.onUpstream();
    }
    if (guardCheck_md_l5_n8()) {
      isDirty_md_l5_n8 = md_l5_n8.onUpstream();
    }
    if (guardCheck_md_l5_n9()) {
      isDirty_md_l5_n9 = md_l5_n9.onUpstream();
    }
    if (guardCheck_md_l6_n0()) {
      isDirty_md_l6_n0 = md_l6_n0.onUpstream();
    }
    if (guardCheck_md_l6_n1()) {
      isDirty_md_l6_n1 = md_l6_n1.onUpstream();
    }
    if (guardCheck_md_l6_n2()) {
      isDirty_md_l6_n2 = md_l6_n2.onUpstream();
    }
    if (guardCheck_md_l6_n3()) {
      isDirty_md_l6_n3 = md_l6_n3.onUpstream();
    }
    if (guardCheck_md_l6_n4()) {
      isDirty_md_l6_n4 = md_l6_n4.onUpstream();
    }
    if (guardCheck_md_l6_n5()) {
      isDirty_md_l6_n5 = md_l6_n5.onUpstream();
    }
    if (guardCheck_md_l6_n6()) {
      isDirty_md_l6_n6 = md_l6_n6.onUpstream();
    }
    if (guardCheck_md_l6_n7()) {
      isDirty_md_l6_n7 = md_l6_n7.onUpstream();
    }
    if (guardCheck_md_l6_n8()) {
      isDirty_md_l6_n8 = md_l6_n8.onUpstream();
    }
    if (guardCheck_md_l6_n9()) {
      isDirty_md_l6_n9 = md_l6_n9.onUpstream();
    }
    if (guardCheck_md_l7_n0()) {
      isDirty_md_l7_n0 = md_l7_n0.onUpstream();
    }
    if (guardCheck_md_l7_n1()) {
      isDirty_md_l7_n1 = md_l7_n1.onUpstream();
    }
    if (guardCheck_md_l7_n2()) {
      isDirty_md_l7_n2 = md_l7_n2.onUpstream();
    }
    if (guardCheck_md_l7_n3()) {
      isDirty_md_l7_n3 = md_l7_n3.onUpstream();
    }
    if (guardCheck_md_l7_n4()) {
      isDirty_md_l7_n4 = md_l7_n4.onUpstream();
    }
    if (guardCheck_md_l7_n5()) {
      isDirty_md_l7_n5 = md_l7_n5.onUpstream();
    }
    if (guardCheck_md_l7_n6()) {
      isDirty_md_l7_n6 = md_l7_n6.onUpstream();
    }
    if (guardCheck_md_l7_n7()) {
      isDirty_md_l7_n7 = md_l7_n7.onUpstream();
    }
    if (guardCheck_md_l7_n8()) {
      isDirty_md_l7_n8 = md_l7_n8.onUpstream();
    }
    if (guardCheck_md_l7_n9()) {
      isDirty_md_l7_n9 = md_l7_n9.onUpstream();
    }
    if (guardCheck_md_l8_n0()) {
      isDirty_md_l8_n0 = md_l8_n0.onUpstream();
    }
    if (guardCheck_md_l8_n1()) {
      isDirty_md_l8_n1 = md_l8_n1.onUpstream();
    }
    if (guardCheck_md_l8_n2()) {
      isDirty_md_l8_n2 = md_l8_n2.onUpstream();
    }
    if (guardCheck_md_l8_n3()) {
      isDirty_md_l8_n3 = md_l8_n3.onUpstream();
    }
    if (guardCheck_md_l8_n4()) {
      isDirty_md_l8_n4 = md_l8_n4.onUpstream();
    }
    if (guardCheck_md_l8_n5()) {
      isDirty_md_l8_n5 = md_l8_n5.onUpstream();
    }
    if (guardCheck_md_l8_n6()) {
      isDirty_md_l8_n6 = md_l8_n6.onUpstream();
    }
    if (guardCheck_md_l8_n7()) {
      isDirty_md_l8_n7 = md_l8_n7.onUpstream();
    }
    if (guardCheck_md_l8_n8()) {
      isDirty_md_l8_n8 = md_l8_n8.onUpstream();
    }
    if (guardCheck_md_l8_n9()) {
      isDirty_md_l8_n9 = md_l8_n9.onUpstream();
    }
    if (guardCheck_md_l9_n0()) {
      isDirty_md_l9_n0 = md_l9_n0.onUpstream();
    }
    if (guardCheck_md_l9_n1()) {
      isDirty_md_l9_n1 = md_l9_n1.onUpstream();
    }
    if (guardCheck_md_l9_n2()) {
      isDirty_md_l9_n2 = md_l9_n2.onUpstream();
    }
    if (guardCheck_md_l9_n3()) {
      isDirty_md_l9_n3 = md_l9_n3.onUpstream();
    }
    if (guardCheck_md_l9_n4()) {
      isDirty_md_l9_n4 = md_l9_n4.onUpstream();
    }
    if (guardCheck_md_l9_n5()) {
      isDirty_md_l9_n5 = md_l9_n5.onUpstream();
    }
    if (guardCheck_md_l9_n6()) {
      isDirty_md_l9_n6 = md_l9_n6.onUpstream();
    }
    if (guardCheck_md_l9_n7()) {
      isDirty_md_l9_n7 = md_l9_n7.onUpstream();
    }
    if (guardCheck_md_l9_n8()) {
      isDirty_md_l9_n8 = md_l9_n8.onUpstream();
    }
    if (guardCheck_md_l9_n9()) {
      isDirty_md_l9_n9 = md_l9_n9.onUpstream();
    }
    if (guardCheck_md_l10_n0()) {
      isDirty_md_l10_n0 = md_l10_n0.onUpstream();
    }
    if (guardCheck_md_l10_n1()) {
      isDirty_md_l10_n1 = md_l10_n1.onUpstream();
    }
    if (guardCheck_md_l10_n2()) {
      isDirty_md_l10_n2 = md_l10_n2.onUpstream();
    }
    if (guardCheck_md_l10_n3()) {
      isDirty_md_l10_n3 = md_l10_n3.onUpstream();
    }
    if (guardCheck_md_l10_n4()) {
      isDirty_md_l10_n4 = md_l10_n4.onUpstream();
    }
    if (guardCheck_md_l10_n5()) {
      md_l10_n5.onUpstream();
    }
    if (guardCheck_md_l10_n6()) {
      md_l10_n6.onUpstream();
    }
    if (guardCheck_md_l10_n7()) {
      md_l10_n7.onUpstream();
    }
    if (guardCheck_md_l10_n8()) {
      md_l10_n8.onUpstream();
    }
    if (guardCheck_md_l10_n9()) {
      md_l10_n9.onUpstream();
    }
    if (guardCheck_md_sink()) {
      isDirty_md_sink = md_sink.onUpstream();
    }
    if (guardCheck_sink()) {
      sink.onUpstream();
    }
    afterEvent();
  }

  public void handleEvent(ValidationTradeEvent typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    isDirty_ts_root = ts_root.onTradeEvent(typedEvent);
    if (guardCheck_ts_l1_n0()) {
      isDirty_ts_l1_n0 = ts_l1_n0.onUpstream();
    }
    if (guardCheck_ts_l1_n1()) {
      isDirty_ts_l1_n1 = ts_l1_n1.onUpstream();
    }
    if (guardCheck_ts_l1_n2()) {
      isDirty_ts_l1_n2 = ts_l1_n2.onUpstream();
    }
    if (guardCheck_ts_l1_n3()) {
      isDirty_ts_l1_n3 = ts_l1_n3.onUpstream();
    }
    if (guardCheck_ts_l1_n4()) {
      isDirty_ts_l1_n4 = ts_l1_n4.onUpstream();
    }
    if (guardCheck_ts_l1_n5()) {
      isDirty_ts_l1_n5 = ts_l1_n5.onUpstream();
    }
    if (guardCheck_ts_l1_n6()) {
      isDirty_ts_l1_n6 = ts_l1_n6.onUpstream();
    }
    if (guardCheck_ts_l1_n7()) {
      isDirty_ts_l1_n7 = ts_l1_n7.onUpstream();
    }
    if (guardCheck_ts_l1_n8()) {
      isDirty_ts_l1_n8 = ts_l1_n8.onUpstream();
    }
    if (guardCheck_ts_l1_n9()) {
      isDirty_ts_l1_n9 = ts_l1_n9.onUpstream();
    }
    if (guardCheck_ts_l2_n0()) {
      isDirty_ts_l2_n0 = ts_l2_n0.onUpstream();
    }
    if (guardCheck_ts_l2_n1()) {
      isDirty_ts_l2_n1 = ts_l2_n1.onUpstream();
    }
    if (guardCheck_ts_l2_n2()) {
      isDirty_ts_l2_n2 = ts_l2_n2.onUpstream();
    }
    if (guardCheck_ts_l2_n3()) {
      isDirty_ts_l2_n3 = ts_l2_n3.onUpstream();
    }
    if (guardCheck_ts_l2_n4()) {
      isDirty_ts_l2_n4 = ts_l2_n4.onUpstream();
    }
    if (guardCheck_ts_l2_n5()) {
      isDirty_ts_l2_n5 = ts_l2_n5.onUpstream();
    }
    if (guardCheck_ts_l2_n6()) {
      isDirty_ts_l2_n6 = ts_l2_n6.onUpstream();
    }
    if (guardCheck_ts_l2_n7()) {
      isDirty_ts_l2_n7 = ts_l2_n7.onUpstream();
    }
    if (guardCheck_ts_l2_n8()) {
      isDirty_ts_l2_n8 = ts_l2_n8.onUpstream();
    }
    if (guardCheck_ts_l2_n9()) {
      isDirty_ts_l2_n9 = ts_l2_n9.onUpstream();
    }
    if (guardCheck_ts_l3_n0()) {
      isDirty_ts_l3_n0 = ts_l3_n0.onUpstream();
    }
    if (guardCheck_ts_l3_n1()) {
      isDirty_ts_l3_n1 = ts_l3_n1.onUpstream();
    }
    if (guardCheck_ts_l3_n2()) {
      isDirty_ts_l3_n2 = ts_l3_n2.onUpstream();
    }
    if (guardCheck_ts_l3_n3()) {
      isDirty_ts_l3_n3 = ts_l3_n3.onUpstream();
    }
    if (guardCheck_ts_l3_n4()) {
      isDirty_ts_l3_n4 = ts_l3_n4.onUpstream();
    }
    if (guardCheck_ts_l3_n5()) {
      isDirty_ts_l3_n5 = ts_l3_n5.onUpstream();
    }
    if (guardCheck_ts_l3_n6()) {
      isDirty_ts_l3_n6 = ts_l3_n6.onUpstream();
    }
    if (guardCheck_ts_l3_n7()) {
      isDirty_ts_l3_n7 = ts_l3_n7.onUpstream();
    }
    if (guardCheck_ts_l3_n8()) {
      isDirty_ts_l3_n8 = ts_l3_n8.onUpstream();
    }
    if (guardCheck_ts_l3_n9()) {
      isDirty_ts_l3_n9 = ts_l3_n9.onUpstream();
    }
    if (guardCheck_ts_l4_n0()) {
      isDirty_ts_l4_n0 = ts_l4_n0.onUpstream();
    }
    if (guardCheck_ts_l4_n1()) {
      isDirty_ts_l4_n1 = ts_l4_n1.onUpstream();
    }
    if (guardCheck_ts_l4_n2()) {
      isDirty_ts_l4_n2 = ts_l4_n2.onUpstream();
    }
    if (guardCheck_ts_l4_n3()) {
      isDirty_ts_l4_n3 = ts_l4_n3.onUpstream();
    }
    if (guardCheck_ts_l4_n4()) {
      isDirty_ts_l4_n4 = ts_l4_n4.onUpstream();
    }
    if (guardCheck_ts_l4_n5()) {
      isDirty_ts_l4_n5 = ts_l4_n5.onUpstream();
    }
    if (guardCheck_ts_l4_n6()) {
      isDirty_ts_l4_n6 = ts_l4_n6.onUpstream();
    }
    if (guardCheck_ts_l4_n7()) {
      isDirty_ts_l4_n7 = ts_l4_n7.onUpstream();
    }
    if (guardCheck_ts_l4_n8()) {
      isDirty_ts_l4_n8 = ts_l4_n8.onUpstream();
    }
    if (guardCheck_ts_l4_n9()) {
      isDirty_ts_l4_n9 = ts_l4_n9.onUpstream();
    }
    if (guardCheck_ts_l5_n0()) {
      isDirty_ts_l5_n0 = ts_l5_n0.onUpstream();
    }
    if (guardCheck_ts_l5_n1()) {
      isDirty_ts_l5_n1 = ts_l5_n1.onUpstream();
    }
    if (guardCheck_ts_l5_n2()) {
      isDirty_ts_l5_n2 = ts_l5_n2.onUpstream();
    }
    if (guardCheck_ts_l5_n3()) {
      isDirty_ts_l5_n3 = ts_l5_n3.onUpstream();
    }
    if (guardCheck_ts_l5_n4()) {
      isDirty_ts_l5_n4 = ts_l5_n4.onUpstream();
    }
    if (guardCheck_ts_l5_n5()) {
      isDirty_ts_l5_n5 = ts_l5_n5.onUpstream();
    }
    if (guardCheck_ts_l5_n6()) {
      isDirty_ts_l5_n6 = ts_l5_n6.onUpstream();
    }
    if (guardCheck_ts_l5_n7()) {
      isDirty_ts_l5_n7 = ts_l5_n7.onUpstream();
    }
    if (guardCheck_ts_l5_n8()) {
      isDirty_ts_l5_n8 = ts_l5_n8.onUpstream();
    }
    if (guardCheck_ts_l5_n9()) {
      isDirty_ts_l5_n9 = ts_l5_n9.onUpstream();
    }
    if (guardCheck_ts_l6_n0()) {
      isDirty_ts_l6_n0 = ts_l6_n0.onUpstream();
    }
    if (guardCheck_ts_l6_n1()) {
      isDirty_ts_l6_n1 = ts_l6_n1.onUpstream();
    }
    if (guardCheck_ts_l6_n2()) {
      isDirty_ts_l6_n2 = ts_l6_n2.onUpstream();
    }
    if (guardCheck_ts_l6_n3()) {
      isDirty_ts_l6_n3 = ts_l6_n3.onUpstream();
    }
    if (guardCheck_ts_l6_n4()) {
      isDirty_ts_l6_n4 = ts_l6_n4.onUpstream();
    }
    if (guardCheck_ts_l6_n5()) {
      isDirty_ts_l6_n5 = ts_l6_n5.onUpstream();
    }
    if (guardCheck_ts_l6_n6()) {
      isDirty_ts_l6_n6 = ts_l6_n6.onUpstream();
    }
    if (guardCheck_ts_l6_n7()) {
      isDirty_ts_l6_n7 = ts_l6_n7.onUpstream();
    }
    if (guardCheck_ts_l6_n8()) {
      isDirty_ts_l6_n8 = ts_l6_n8.onUpstream();
    }
    if (guardCheck_ts_l6_n9()) {
      isDirty_ts_l6_n9 = ts_l6_n9.onUpstream();
    }
    if (guardCheck_ts_l7_n0()) {
      isDirty_ts_l7_n0 = ts_l7_n0.onUpstream();
    }
    if (guardCheck_ts_l7_n1()) {
      isDirty_ts_l7_n1 = ts_l7_n1.onUpstream();
    }
    if (guardCheck_ts_l7_n2()) {
      isDirty_ts_l7_n2 = ts_l7_n2.onUpstream();
    }
    if (guardCheck_ts_l7_n3()) {
      isDirty_ts_l7_n3 = ts_l7_n3.onUpstream();
    }
    if (guardCheck_ts_l7_n4()) {
      isDirty_ts_l7_n4 = ts_l7_n4.onUpstream();
    }
    if (guardCheck_ts_l7_n5()) {
      isDirty_ts_l7_n5 = ts_l7_n5.onUpstream();
    }
    if (guardCheck_ts_l7_n6()) {
      isDirty_ts_l7_n6 = ts_l7_n6.onUpstream();
    }
    if (guardCheck_ts_l7_n7()) {
      isDirty_ts_l7_n7 = ts_l7_n7.onUpstream();
    }
    if (guardCheck_ts_l7_n8()) {
      isDirty_ts_l7_n8 = ts_l7_n8.onUpstream();
    }
    if (guardCheck_ts_l7_n9()) {
      isDirty_ts_l7_n9 = ts_l7_n9.onUpstream();
    }
    if (guardCheck_ts_l8_n0()) {
      isDirty_ts_l8_n0 = ts_l8_n0.onUpstream();
    }
    if (guardCheck_ts_l8_n1()) {
      isDirty_ts_l8_n1 = ts_l8_n1.onUpstream();
    }
    if (guardCheck_ts_l8_n2()) {
      isDirty_ts_l8_n2 = ts_l8_n2.onUpstream();
    }
    if (guardCheck_ts_l8_n3()) {
      isDirty_ts_l8_n3 = ts_l8_n3.onUpstream();
    }
    if (guardCheck_ts_l8_n4()) {
      isDirty_ts_l8_n4 = ts_l8_n4.onUpstream();
    }
    if (guardCheck_ts_l8_n5()) {
      isDirty_ts_l8_n5 = ts_l8_n5.onUpstream();
    }
    if (guardCheck_ts_l8_n6()) {
      isDirty_ts_l8_n6 = ts_l8_n6.onUpstream();
    }
    if (guardCheck_ts_l8_n7()) {
      isDirty_ts_l8_n7 = ts_l8_n7.onUpstream();
    }
    if (guardCheck_ts_l8_n8()) {
      isDirty_ts_l8_n8 = ts_l8_n8.onUpstream();
    }
    if (guardCheck_ts_l8_n9()) {
      isDirty_ts_l8_n9 = ts_l8_n9.onUpstream();
    }
    if (guardCheck_ts_l9_n0()) {
      isDirty_ts_l9_n0 = ts_l9_n0.onUpstream();
    }
    if (guardCheck_ts_l9_n1()) {
      isDirty_ts_l9_n1 = ts_l9_n1.onUpstream();
    }
    if (guardCheck_ts_l9_n2()) {
      isDirty_ts_l9_n2 = ts_l9_n2.onUpstream();
    }
    if (guardCheck_ts_l9_n3()) {
      isDirty_ts_l9_n3 = ts_l9_n3.onUpstream();
    }
    if (guardCheck_ts_l9_n4()) {
      isDirty_ts_l9_n4 = ts_l9_n4.onUpstream();
    }
    if (guardCheck_ts_l9_n5()) {
      ts_l9_n5.onUpstream();
    }
    if (guardCheck_ts_l9_n6()) {
      ts_l9_n6.onUpstream();
    }
    if (guardCheck_ts_l9_n7()) {
      ts_l9_n7.onUpstream();
    }
    if (guardCheck_ts_l9_n8()) {
      ts_l9_n8.onUpstream();
    }
    if (guardCheck_ts_l9_n9()) {
      ts_l9_n9.onUpstream();
    }
    if (guardCheck_ts_sink()) {
      isDirty_ts_sink = ts_sink.onUpstream();
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
      isDirty_ctrl_root = ctrl_root.onControlEvent(typedEvent);
    } else if (event instanceof ValidationMarketEvent) {
      ValidationMarketEvent typedEvent = (ValidationMarketEvent) event;
      auditEvent(typedEvent);
      isDirty_md_root = md_root.onMarketEvent(typedEvent);
    } else if (event instanceof ValidationTradeEvent) {
      ValidationTradeEvent typedEvent = (ValidationTradeEvent) event;
      auditEvent(typedEvent);
      isDirty_ts_root = ts_root.onTradeEvent(typedEvent);
    }
  }

  public void triggerCalculation() {
    buffering = false;
    String typedEvent = "No event information - buffered dispatch";
    if (guardCheck_ctrl_l1_n0()) {
      isDirty_ctrl_l1_n0 = ctrl_l1_n0.onUpstream();
    }
    if (guardCheck_ctrl_l1_n1()) {
      isDirty_ctrl_l1_n1 = ctrl_l1_n1.onUpstream();
    }
    if (guardCheck_ctrl_l1_n2()) {
      isDirty_ctrl_l1_n2 = ctrl_l1_n2.onUpstream();
    }
    if (guardCheck_ctrl_l1_n3()) {
      isDirty_ctrl_l1_n3 = ctrl_l1_n3.onUpstream();
    }
    if (guardCheck_ctrl_l1_n4()) {
      isDirty_ctrl_l1_n4 = ctrl_l1_n4.onUpstream();
    }
    if (guardCheck_ctrl_l1_n5()) {
      isDirty_ctrl_l1_n5 = ctrl_l1_n5.onUpstream();
    }
    if (guardCheck_ctrl_l1_n6()) {
      isDirty_ctrl_l1_n6 = ctrl_l1_n6.onUpstream();
    }
    if (guardCheck_ctrl_l1_n7()) {
      isDirty_ctrl_l1_n7 = ctrl_l1_n7.onUpstream();
    }
    if (guardCheck_ctrl_l1_n8()) {
      isDirty_ctrl_l1_n8 = ctrl_l1_n8.onUpstream();
    }
    if (guardCheck_ctrl_l1_n9()) {
      isDirty_ctrl_l1_n9 = ctrl_l1_n9.onUpstream();
    }
    if (guardCheck_ctrl_l2_n0()) {
      isDirty_ctrl_l2_n0 = ctrl_l2_n0.onUpstream();
    }
    if (guardCheck_ctrl_l2_n1()) {
      isDirty_ctrl_l2_n1 = ctrl_l2_n1.onUpstream();
    }
    if (guardCheck_ctrl_l2_n2()) {
      isDirty_ctrl_l2_n2 = ctrl_l2_n2.onUpstream();
    }
    if (guardCheck_ctrl_l2_n3()) {
      isDirty_ctrl_l2_n3 = ctrl_l2_n3.onUpstream();
    }
    if (guardCheck_ctrl_l2_n4()) {
      isDirty_ctrl_l2_n4 = ctrl_l2_n4.onUpstream();
    }
    if (guardCheck_ctrl_l2_n5()) {
      isDirty_ctrl_l2_n5 = ctrl_l2_n5.onUpstream();
    }
    if (guardCheck_ctrl_l2_n6()) {
      isDirty_ctrl_l2_n6 = ctrl_l2_n6.onUpstream();
    }
    if (guardCheck_ctrl_l2_n7()) {
      isDirty_ctrl_l2_n7 = ctrl_l2_n7.onUpstream();
    }
    if (guardCheck_ctrl_l2_n8()) {
      isDirty_ctrl_l2_n8 = ctrl_l2_n8.onUpstream();
    }
    if (guardCheck_ctrl_l2_n9()) {
      isDirty_ctrl_l2_n9 = ctrl_l2_n9.onUpstream();
    }
    if (guardCheck_ctrl_l3_n0()) {
      isDirty_ctrl_l3_n0 = ctrl_l3_n0.onUpstream();
    }
    if (guardCheck_ctrl_l3_n1()) {
      isDirty_ctrl_l3_n1 = ctrl_l3_n1.onUpstream();
    }
    if (guardCheck_ctrl_l3_n2()) {
      isDirty_ctrl_l3_n2 = ctrl_l3_n2.onUpstream();
    }
    if (guardCheck_ctrl_l3_n3()) {
      isDirty_ctrl_l3_n3 = ctrl_l3_n3.onUpstream();
    }
    if (guardCheck_ctrl_l3_n4()) {
      isDirty_ctrl_l3_n4 = ctrl_l3_n4.onUpstream();
    }
    if (guardCheck_ctrl_l3_n5()) {
      isDirty_ctrl_l3_n5 = ctrl_l3_n5.onUpstream();
    }
    if (guardCheck_ctrl_l3_n6()) {
      isDirty_ctrl_l3_n6 = ctrl_l3_n6.onUpstream();
    }
    if (guardCheck_ctrl_l3_n7()) {
      isDirty_ctrl_l3_n7 = ctrl_l3_n7.onUpstream();
    }
    if (guardCheck_ctrl_l3_n8()) {
      isDirty_ctrl_l3_n8 = ctrl_l3_n8.onUpstream();
    }
    if (guardCheck_ctrl_l3_n9()) {
      isDirty_ctrl_l3_n9 = ctrl_l3_n9.onUpstream();
    }
    if (guardCheck_ctrl_l4_n0()) {
      isDirty_ctrl_l4_n0 = ctrl_l4_n0.onUpstream();
    }
    if (guardCheck_ctrl_l4_n1()) {
      isDirty_ctrl_l4_n1 = ctrl_l4_n1.onUpstream();
    }
    if (guardCheck_ctrl_l4_n2()) {
      isDirty_ctrl_l4_n2 = ctrl_l4_n2.onUpstream();
    }
    if (guardCheck_ctrl_l4_n3()) {
      isDirty_ctrl_l4_n3 = ctrl_l4_n3.onUpstream();
    }
    if (guardCheck_ctrl_l4_n4()) {
      isDirty_ctrl_l4_n4 = ctrl_l4_n4.onUpstream();
    }
    if (guardCheck_ctrl_l4_n5()) {
      isDirty_ctrl_l4_n5 = ctrl_l4_n5.onUpstream();
    }
    if (guardCheck_ctrl_l4_n6()) {
      isDirty_ctrl_l4_n6 = ctrl_l4_n6.onUpstream();
    }
    if (guardCheck_ctrl_l4_n7()) {
      isDirty_ctrl_l4_n7 = ctrl_l4_n7.onUpstream();
    }
    if (guardCheck_ctrl_l4_n8()) {
      isDirty_ctrl_l4_n8 = ctrl_l4_n8.onUpstream();
    }
    if (guardCheck_ctrl_l4_n9()) {
      isDirty_ctrl_l4_n9 = ctrl_l4_n9.onUpstream();
    }
    if (guardCheck_ctrl_l5_n0()) {
      isDirty_ctrl_l5_n0 = ctrl_l5_n0.onUpstream();
    }
    if (guardCheck_ctrl_l5_n1()) {
      isDirty_ctrl_l5_n1 = ctrl_l5_n1.onUpstream();
    }
    if (guardCheck_ctrl_l5_n2()) {
      isDirty_ctrl_l5_n2 = ctrl_l5_n2.onUpstream();
    }
    if (guardCheck_ctrl_l5_n3()) {
      isDirty_ctrl_l5_n3 = ctrl_l5_n3.onUpstream();
    }
    if (guardCheck_ctrl_l5_n4()) {
      isDirty_ctrl_l5_n4 = ctrl_l5_n4.onUpstream();
    }
    if (guardCheck_ctrl_l5_n5()) {
      isDirty_ctrl_l5_n5 = ctrl_l5_n5.onUpstream();
    }
    if (guardCheck_ctrl_l5_n6()) {
      isDirty_ctrl_l5_n6 = ctrl_l5_n6.onUpstream();
    }
    if (guardCheck_ctrl_l5_n7()) {
      isDirty_ctrl_l5_n7 = ctrl_l5_n7.onUpstream();
    }
    if (guardCheck_ctrl_l5_n8()) {
      isDirty_ctrl_l5_n8 = ctrl_l5_n8.onUpstream();
    }
    if (guardCheck_ctrl_l5_n9()) {
      isDirty_ctrl_l5_n9 = ctrl_l5_n9.onUpstream();
    }
    if (guardCheck_ctrl_l6_n0()) {
      isDirty_ctrl_l6_n0 = ctrl_l6_n0.onUpstream();
    }
    if (guardCheck_ctrl_l6_n1()) {
      isDirty_ctrl_l6_n1 = ctrl_l6_n1.onUpstream();
    }
    if (guardCheck_ctrl_l6_n2()) {
      isDirty_ctrl_l6_n2 = ctrl_l6_n2.onUpstream();
    }
    if (guardCheck_ctrl_l6_n3()) {
      isDirty_ctrl_l6_n3 = ctrl_l6_n3.onUpstream();
    }
    if (guardCheck_ctrl_l6_n4()) {
      isDirty_ctrl_l6_n4 = ctrl_l6_n4.onUpstream();
    }
    if (guardCheck_ctrl_l6_n5()) {
      isDirty_ctrl_l6_n5 = ctrl_l6_n5.onUpstream();
    }
    if (guardCheck_ctrl_l6_n6()) {
      isDirty_ctrl_l6_n6 = ctrl_l6_n6.onUpstream();
    }
    if (guardCheck_ctrl_l6_n7()) {
      isDirty_ctrl_l6_n7 = ctrl_l6_n7.onUpstream();
    }
    if (guardCheck_ctrl_l6_n8()) {
      isDirty_ctrl_l6_n8 = ctrl_l6_n8.onUpstream();
    }
    if (guardCheck_ctrl_l6_n9()) {
      isDirty_ctrl_l6_n9 = ctrl_l6_n9.onUpstream();
    }
    if (guardCheck_ctrl_l7_n0()) {
      isDirty_ctrl_l7_n0 = ctrl_l7_n0.onUpstream();
    }
    if (guardCheck_ctrl_l7_n1()) {
      isDirty_ctrl_l7_n1 = ctrl_l7_n1.onUpstream();
    }
    if (guardCheck_ctrl_l7_n2()) {
      isDirty_ctrl_l7_n2 = ctrl_l7_n2.onUpstream();
    }
    if (guardCheck_ctrl_l7_n3()) {
      isDirty_ctrl_l7_n3 = ctrl_l7_n3.onUpstream();
    }
    if (guardCheck_ctrl_l7_n4()) {
      isDirty_ctrl_l7_n4 = ctrl_l7_n4.onUpstream();
    }
    if (guardCheck_ctrl_l7_n5()) {
      isDirty_ctrl_l7_n5 = ctrl_l7_n5.onUpstream();
    }
    if (guardCheck_ctrl_l7_n6()) {
      isDirty_ctrl_l7_n6 = ctrl_l7_n6.onUpstream();
    }
    if (guardCheck_ctrl_l7_n7()) {
      isDirty_ctrl_l7_n7 = ctrl_l7_n7.onUpstream();
    }
    if (guardCheck_ctrl_l7_n8()) {
      isDirty_ctrl_l7_n8 = ctrl_l7_n8.onUpstream();
    }
    if (guardCheck_ctrl_l7_n9()) {
      isDirty_ctrl_l7_n9 = ctrl_l7_n9.onUpstream();
    }
    if (guardCheck_ctrl_l8_n0()) {
      isDirty_ctrl_l8_n0 = ctrl_l8_n0.onUpstream();
    }
    if (guardCheck_ctrl_l8_n1()) {
      isDirty_ctrl_l8_n1 = ctrl_l8_n1.onUpstream();
    }
    if (guardCheck_ctrl_l8_n2()) {
      isDirty_ctrl_l8_n2 = ctrl_l8_n2.onUpstream();
    }
    if (guardCheck_ctrl_l8_n3()) {
      isDirty_ctrl_l8_n3 = ctrl_l8_n3.onUpstream();
    }
    if (guardCheck_ctrl_l8_n4()) {
      isDirty_ctrl_l8_n4 = ctrl_l8_n4.onUpstream();
    }
    if (guardCheck_ctrl_l8_n5()) {
      isDirty_ctrl_l8_n5 = ctrl_l8_n5.onUpstream();
    }
    if (guardCheck_ctrl_l8_n6()) {
      isDirty_ctrl_l8_n6 = ctrl_l8_n6.onUpstream();
    }
    if (guardCheck_ctrl_l8_n7()) {
      isDirty_ctrl_l8_n7 = ctrl_l8_n7.onUpstream();
    }
    if (guardCheck_ctrl_l8_n8()) {
      isDirty_ctrl_l8_n8 = ctrl_l8_n8.onUpstream();
    }
    if (guardCheck_ctrl_l8_n9()) {
      isDirty_ctrl_l8_n9 = ctrl_l8_n9.onUpstream();
    }
    if (guardCheck_ctrl_l9_n0()) {
      isDirty_ctrl_l9_n0 = ctrl_l9_n0.onUpstream();
    }
    if (guardCheck_ctrl_l9_n1()) {
      isDirty_ctrl_l9_n1 = ctrl_l9_n1.onUpstream();
    }
    if (guardCheck_ctrl_l9_n2()) {
      isDirty_ctrl_l9_n2 = ctrl_l9_n2.onUpstream();
    }
    if (guardCheck_ctrl_l9_n3()) {
      ctrl_l9_n3.onUpstream();
    }
    if (guardCheck_ctrl_l9_n4()) {
      ctrl_l9_n4.onUpstream();
    }
    if (guardCheck_ctrl_l9_n5()) {
      ctrl_l9_n5.onUpstream();
    }
    if (guardCheck_ctrl_l9_n6()) {
      ctrl_l9_n6.onUpstream();
    }
    if (guardCheck_ctrl_l9_n7()) {
      ctrl_l9_n7.onUpstream();
    }
    if (guardCheck_ctrl_l9_n8()) {
      ctrl_l9_n8.onUpstream();
    }
    if (guardCheck_ctrl_l9_n9()) {
      ctrl_l9_n9.onUpstream();
    }
    if (guardCheck_ctrl_sink()) {
      ctrl_sink.onUpstream();
    }
    if (guardCheck_md_l1_n0()) {
      isDirty_md_l1_n0 = md_l1_n0.onUpstream();
    }
    if (guardCheck_md_l1_n1()) {
      isDirty_md_l1_n1 = md_l1_n1.onUpstream();
    }
    if (guardCheck_md_l1_n2()) {
      isDirty_md_l1_n2 = md_l1_n2.onUpstream();
    }
    if (guardCheck_md_l1_n3()) {
      isDirty_md_l1_n3 = md_l1_n3.onUpstream();
    }
    if (guardCheck_md_l1_n4()) {
      isDirty_md_l1_n4 = md_l1_n4.onUpstream();
    }
    if (guardCheck_md_l1_n5()) {
      isDirty_md_l1_n5 = md_l1_n5.onUpstream();
    }
    if (guardCheck_md_l1_n6()) {
      isDirty_md_l1_n6 = md_l1_n6.onUpstream();
    }
    if (guardCheck_md_l1_n7()) {
      isDirty_md_l1_n7 = md_l1_n7.onUpstream();
    }
    if (guardCheck_md_l1_n8()) {
      isDirty_md_l1_n8 = md_l1_n8.onUpstream();
    }
    if (guardCheck_md_l1_n9()) {
      isDirty_md_l1_n9 = md_l1_n9.onUpstream();
    }
    if (guardCheck_md_l2_n0()) {
      isDirty_md_l2_n0 = md_l2_n0.onUpstream();
    }
    if (guardCheck_md_l2_n1()) {
      isDirty_md_l2_n1 = md_l2_n1.onUpstream();
    }
    if (guardCheck_md_l2_n2()) {
      isDirty_md_l2_n2 = md_l2_n2.onUpstream();
    }
    if (guardCheck_md_l2_n3()) {
      isDirty_md_l2_n3 = md_l2_n3.onUpstream();
    }
    if (guardCheck_md_l2_n4()) {
      isDirty_md_l2_n4 = md_l2_n4.onUpstream();
    }
    if (guardCheck_md_l2_n5()) {
      isDirty_md_l2_n5 = md_l2_n5.onUpstream();
    }
    if (guardCheck_md_l2_n6()) {
      isDirty_md_l2_n6 = md_l2_n6.onUpstream();
    }
    if (guardCheck_md_l2_n7()) {
      isDirty_md_l2_n7 = md_l2_n7.onUpstream();
    }
    if (guardCheck_md_l2_n8()) {
      isDirty_md_l2_n8 = md_l2_n8.onUpstream();
    }
    if (guardCheck_md_l2_n9()) {
      isDirty_md_l2_n9 = md_l2_n9.onUpstream();
    }
    if (guardCheck_md_l3_n0()) {
      isDirty_md_l3_n0 = md_l3_n0.onUpstream();
    }
    if (guardCheck_md_l3_n1()) {
      isDirty_md_l3_n1 = md_l3_n1.onUpstream();
    }
    if (guardCheck_md_l3_n2()) {
      isDirty_md_l3_n2 = md_l3_n2.onUpstream();
    }
    if (guardCheck_md_l3_n3()) {
      isDirty_md_l3_n3 = md_l3_n3.onUpstream();
    }
    if (guardCheck_md_l3_n4()) {
      isDirty_md_l3_n4 = md_l3_n4.onUpstream();
    }
    if (guardCheck_md_l3_n5()) {
      isDirty_md_l3_n5 = md_l3_n5.onUpstream();
    }
    if (guardCheck_md_l3_n6()) {
      isDirty_md_l3_n6 = md_l3_n6.onUpstream();
    }
    if (guardCheck_md_l3_n7()) {
      isDirty_md_l3_n7 = md_l3_n7.onUpstream();
    }
    if (guardCheck_md_l3_n8()) {
      isDirty_md_l3_n8 = md_l3_n8.onUpstream();
    }
    if (guardCheck_md_l3_n9()) {
      isDirty_md_l3_n9 = md_l3_n9.onUpstream();
    }
    if (guardCheck_md_l4_n0()) {
      isDirty_md_l4_n0 = md_l4_n0.onUpstream();
    }
    if (guardCheck_md_l4_n1()) {
      isDirty_md_l4_n1 = md_l4_n1.onUpstream();
    }
    if (guardCheck_md_l4_n2()) {
      isDirty_md_l4_n2 = md_l4_n2.onUpstream();
    }
    if (guardCheck_md_l4_n3()) {
      isDirty_md_l4_n3 = md_l4_n3.onUpstream();
    }
    if (guardCheck_md_l4_n4()) {
      isDirty_md_l4_n4 = md_l4_n4.onUpstream();
    }
    if (guardCheck_md_l4_n5()) {
      isDirty_md_l4_n5 = md_l4_n5.onUpstream();
    }
    if (guardCheck_md_l4_n6()) {
      isDirty_md_l4_n6 = md_l4_n6.onUpstream();
    }
    if (guardCheck_md_l4_n7()) {
      isDirty_md_l4_n7 = md_l4_n7.onUpstream();
    }
    if (guardCheck_md_l4_n8()) {
      isDirty_md_l4_n8 = md_l4_n8.onUpstream();
    }
    if (guardCheck_md_l4_n9()) {
      isDirty_md_l4_n9 = md_l4_n9.onUpstream();
    }
    if (guardCheck_md_l5_n0()) {
      isDirty_md_l5_n0 = md_l5_n0.onUpstream();
    }
    if (guardCheck_md_l5_n1()) {
      isDirty_md_l5_n1 = md_l5_n1.onUpstream();
    }
    if (guardCheck_md_l5_n2()) {
      isDirty_md_l5_n2 = md_l5_n2.onUpstream();
    }
    if (guardCheck_md_l5_n3()) {
      isDirty_md_l5_n3 = md_l5_n3.onUpstream();
    }
    if (guardCheck_md_l5_n4()) {
      isDirty_md_l5_n4 = md_l5_n4.onUpstream();
    }
    if (guardCheck_md_l5_n5()) {
      isDirty_md_l5_n5 = md_l5_n5.onUpstream();
    }
    if (guardCheck_md_l5_n6()) {
      isDirty_md_l5_n6 = md_l5_n6.onUpstream();
    }
    if (guardCheck_md_l5_n7()) {
      isDirty_md_l5_n7 = md_l5_n7.onUpstream();
    }
    if (guardCheck_md_l5_n8()) {
      isDirty_md_l5_n8 = md_l5_n8.onUpstream();
    }
    if (guardCheck_md_l5_n9()) {
      isDirty_md_l5_n9 = md_l5_n9.onUpstream();
    }
    if (guardCheck_md_l6_n0()) {
      isDirty_md_l6_n0 = md_l6_n0.onUpstream();
    }
    if (guardCheck_md_l6_n1()) {
      isDirty_md_l6_n1 = md_l6_n1.onUpstream();
    }
    if (guardCheck_md_l6_n2()) {
      isDirty_md_l6_n2 = md_l6_n2.onUpstream();
    }
    if (guardCheck_md_l6_n3()) {
      isDirty_md_l6_n3 = md_l6_n3.onUpstream();
    }
    if (guardCheck_md_l6_n4()) {
      isDirty_md_l6_n4 = md_l6_n4.onUpstream();
    }
    if (guardCheck_md_l6_n5()) {
      isDirty_md_l6_n5 = md_l6_n5.onUpstream();
    }
    if (guardCheck_md_l6_n6()) {
      isDirty_md_l6_n6 = md_l6_n6.onUpstream();
    }
    if (guardCheck_md_l6_n7()) {
      isDirty_md_l6_n7 = md_l6_n7.onUpstream();
    }
    if (guardCheck_md_l6_n8()) {
      isDirty_md_l6_n8 = md_l6_n8.onUpstream();
    }
    if (guardCheck_md_l6_n9()) {
      isDirty_md_l6_n9 = md_l6_n9.onUpstream();
    }
    if (guardCheck_md_l7_n0()) {
      isDirty_md_l7_n0 = md_l7_n0.onUpstream();
    }
    if (guardCheck_md_l7_n1()) {
      isDirty_md_l7_n1 = md_l7_n1.onUpstream();
    }
    if (guardCheck_md_l7_n2()) {
      isDirty_md_l7_n2 = md_l7_n2.onUpstream();
    }
    if (guardCheck_md_l7_n3()) {
      isDirty_md_l7_n3 = md_l7_n3.onUpstream();
    }
    if (guardCheck_md_l7_n4()) {
      isDirty_md_l7_n4 = md_l7_n4.onUpstream();
    }
    if (guardCheck_md_l7_n5()) {
      isDirty_md_l7_n5 = md_l7_n5.onUpstream();
    }
    if (guardCheck_md_l7_n6()) {
      isDirty_md_l7_n6 = md_l7_n6.onUpstream();
    }
    if (guardCheck_md_l7_n7()) {
      isDirty_md_l7_n7 = md_l7_n7.onUpstream();
    }
    if (guardCheck_md_l7_n8()) {
      isDirty_md_l7_n8 = md_l7_n8.onUpstream();
    }
    if (guardCheck_md_l7_n9()) {
      isDirty_md_l7_n9 = md_l7_n9.onUpstream();
    }
    if (guardCheck_md_l8_n0()) {
      isDirty_md_l8_n0 = md_l8_n0.onUpstream();
    }
    if (guardCheck_md_l8_n1()) {
      isDirty_md_l8_n1 = md_l8_n1.onUpstream();
    }
    if (guardCheck_md_l8_n2()) {
      isDirty_md_l8_n2 = md_l8_n2.onUpstream();
    }
    if (guardCheck_md_l8_n3()) {
      isDirty_md_l8_n3 = md_l8_n3.onUpstream();
    }
    if (guardCheck_md_l8_n4()) {
      isDirty_md_l8_n4 = md_l8_n4.onUpstream();
    }
    if (guardCheck_md_l8_n5()) {
      isDirty_md_l8_n5 = md_l8_n5.onUpstream();
    }
    if (guardCheck_md_l8_n6()) {
      isDirty_md_l8_n6 = md_l8_n6.onUpstream();
    }
    if (guardCheck_md_l8_n7()) {
      isDirty_md_l8_n7 = md_l8_n7.onUpstream();
    }
    if (guardCheck_md_l8_n8()) {
      isDirty_md_l8_n8 = md_l8_n8.onUpstream();
    }
    if (guardCheck_md_l8_n9()) {
      isDirty_md_l8_n9 = md_l8_n9.onUpstream();
    }
    if (guardCheck_md_l9_n0()) {
      isDirty_md_l9_n0 = md_l9_n0.onUpstream();
    }
    if (guardCheck_md_l9_n1()) {
      isDirty_md_l9_n1 = md_l9_n1.onUpstream();
    }
    if (guardCheck_md_l9_n2()) {
      isDirty_md_l9_n2 = md_l9_n2.onUpstream();
    }
    if (guardCheck_md_l9_n3()) {
      isDirty_md_l9_n3 = md_l9_n3.onUpstream();
    }
    if (guardCheck_md_l9_n4()) {
      isDirty_md_l9_n4 = md_l9_n4.onUpstream();
    }
    if (guardCheck_md_l9_n5()) {
      isDirty_md_l9_n5 = md_l9_n5.onUpstream();
    }
    if (guardCheck_md_l9_n6()) {
      isDirty_md_l9_n6 = md_l9_n6.onUpstream();
    }
    if (guardCheck_md_l9_n7()) {
      isDirty_md_l9_n7 = md_l9_n7.onUpstream();
    }
    if (guardCheck_md_l9_n8()) {
      isDirty_md_l9_n8 = md_l9_n8.onUpstream();
    }
    if (guardCheck_md_l9_n9()) {
      isDirty_md_l9_n9 = md_l9_n9.onUpstream();
    }
    if (guardCheck_md_l10_n0()) {
      isDirty_md_l10_n0 = md_l10_n0.onUpstream();
    }
    if (guardCheck_md_l10_n1()) {
      isDirty_md_l10_n1 = md_l10_n1.onUpstream();
    }
    if (guardCheck_md_l10_n2()) {
      isDirty_md_l10_n2 = md_l10_n2.onUpstream();
    }
    if (guardCheck_md_l10_n3()) {
      isDirty_md_l10_n3 = md_l10_n3.onUpstream();
    }
    if (guardCheck_md_l10_n4()) {
      isDirty_md_l10_n4 = md_l10_n4.onUpstream();
    }
    if (guardCheck_md_l10_n5()) {
      md_l10_n5.onUpstream();
    }
    if (guardCheck_md_l10_n6()) {
      md_l10_n6.onUpstream();
    }
    if (guardCheck_md_l10_n7()) {
      md_l10_n7.onUpstream();
    }
    if (guardCheck_md_l10_n8()) {
      md_l10_n8.onUpstream();
    }
    if (guardCheck_md_l10_n9()) {
      md_l10_n9.onUpstream();
    }
    if (guardCheck_md_sink()) {
      isDirty_md_sink = md_sink.onUpstream();
    }
    if (guardCheck_ts_l1_n0()) {
      isDirty_ts_l1_n0 = ts_l1_n0.onUpstream();
    }
    if (guardCheck_ts_l1_n1()) {
      isDirty_ts_l1_n1 = ts_l1_n1.onUpstream();
    }
    if (guardCheck_ts_l1_n2()) {
      isDirty_ts_l1_n2 = ts_l1_n2.onUpstream();
    }
    if (guardCheck_ts_l1_n3()) {
      isDirty_ts_l1_n3 = ts_l1_n3.onUpstream();
    }
    if (guardCheck_ts_l1_n4()) {
      isDirty_ts_l1_n4 = ts_l1_n4.onUpstream();
    }
    if (guardCheck_ts_l1_n5()) {
      isDirty_ts_l1_n5 = ts_l1_n5.onUpstream();
    }
    if (guardCheck_ts_l1_n6()) {
      isDirty_ts_l1_n6 = ts_l1_n6.onUpstream();
    }
    if (guardCheck_ts_l1_n7()) {
      isDirty_ts_l1_n7 = ts_l1_n7.onUpstream();
    }
    if (guardCheck_ts_l1_n8()) {
      isDirty_ts_l1_n8 = ts_l1_n8.onUpstream();
    }
    if (guardCheck_ts_l1_n9()) {
      isDirty_ts_l1_n9 = ts_l1_n9.onUpstream();
    }
    if (guardCheck_ts_l2_n0()) {
      isDirty_ts_l2_n0 = ts_l2_n0.onUpstream();
    }
    if (guardCheck_ts_l2_n1()) {
      isDirty_ts_l2_n1 = ts_l2_n1.onUpstream();
    }
    if (guardCheck_ts_l2_n2()) {
      isDirty_ts_l2_n2 = ts_l2_n2.onUpstream();
    }
    if (guardCheck_ts_l2_n3()) {
      isDirty_ts_l2_n3 = ts_l2_n3.onUpstream();
    }
    if (guardCheck_ts_l2_n4()) {
      isDirty_ts_l2_n4 = ts_l2_n4.onUpstream();
    }
    if (guardCheck_ts_l2_n5()) {
      isDirty_ts_l2_n5 = ts_l2_n5.onUpstream();
    }
    if (guardCheck_ts_l2_n6()) {
      isDirty_ts_l2_n6 = ts_l2_n6.onUpstream();
    }
    if (guardCheck_ts_l2_n7()) {
      isDirty_ts_l2_n7 = ts_l2_n7.onUpstream();
    }
    if (guardCheck_ts_l2_n8()) {
      isDirty_ts_l2_n8 = ts_l2_n8.onUpstream();
    }
    if (guardCheck_ts_l2_n9()) {
      isDirty_ts_l2_n9 = ts_l2_n9.onUpstream();
    }
    if (guardCheck_ts_l3_n0()) {
      isDirty_ts_l3_n0 = ts_l3_n0.onUpstream();
    }
    if (guardCheck_ts_l3_n1()) {
      isDirty_ts_l3_n1 = ts_l3_n1.onUpstream();
    }
    if (guardCheck_ts_l3_n2()) {
      isDirty_ts_l3_n2 = ts_l3_n2.onUpstream();
    }
    if (guardCheck_ts_l3_n3()) {
      isDirty_ts_l3_n3 = ts_l3_n3.onUpstream();
    }
    if (guardCheck_ts_l3_n4()) {
      isDirty_ts_l3_n4 = ts_l3_n4.onUpstream();
    }
    if (guardCheck_ts_l3_n5()) {
      isDirty_ts_l3_n5 = ts_l3_n5.onUpstream();
    }
    if (guardCheck_ts_l3_n6()) {
      isDirty_ts_l3_n6 = ts_l3_n6.onUpstream();
    }
    if (guardCheck_ts_l3_n7()) {
      isDirty_ts_l3_n7 = ts_l3_n7.onUpstream();
    }
    if (guardCheck_ts_l3_n8()) {
      isDirty_ts_l3_n8 = ts_l3_n8.onUpstream();
    }
    if (guardCheck_ts_l3_n9()) {
      isDirty_ts_l3_n9 = ts_l3_n9.onUpstream();
    }
    if (guardCheck_ts_l4_n0()) {
      isDirty_ts_l4_n0 = ts_l4_n0.onUpstream();
    }
    if (guardCheck_ts_l4_n1()) {
      isDirty_ts_l4_n1 = ts_l4_n1.onUpstream();
    }
    if (guardCheck_ts_l4_n2()) {
      isDirty_ts_l4_n2 = ts_l4_n2.onUpstream();
    }
    if (guardCheck_ts_l4_n3()) {
      isDirty_ts_l4_n3 = ts_l4_n3.onUpstream();
    }
    if (guardCheck_ts_l4_n4()) {
      isDirty_ts_l4_n4 = ts_l4_n4.onUpstream();
    }
    if (guardCheck_ts_l4_n5()) {
      isDirty_ts_l4_n5 = ts_l4_n5.onUpstream();
    }
    if (guardCheck_ts_l4_n6()) {
      isDirty_ts_l4_n6 = ts_l4_n6.onUpstream();
    }
    if (guardCheck_ts_l4_n7()) {
      isDirty_ts_l4_n7 = ts_l4_n7.onUpstream();
    }
    if (guardCheck_ts_l4_n8()) {
      isDirty_ts_l4_n8 = ts_l4_n8.onUpstream();
    }
    if (guardCheck_ts_l4_n9()) {
      isDirty_ts_l4_n9 = ts_l4_n9.onUpstream();
    }
    if (guardCheck_ts_l5_n0()) {
      isDirty_ts_l5_n0 = ts_l5_n0.onUpstream();
    }
    if (guardCheck_ts_l5_n1()) {
      isDirty_ts_l5_n1 = ts_l5_n1.onUpstream();
    }
    if (guardCheck_ts_l5_n2()) {
      isDirty_ts_l5_n2 = ts_l5_n2.onUpstream();
    }
    if (guardCheck_ts_l5_n3()) {
      isDirty_ts_l5_n3 = ts_l5_n3.onUpstream();
    }
    if (guardCheck_ts_l5_n4()) {
      isDirty_ts_l5_n4 = ts_l5_n4.onUpstream();
    }
    if (guardCheck_ts_l5_n5()) {
      isDirty_ts_l5_n5 = ts_l5_n5.onUpstream();
    }
    if (guardCheck_ts_l5_n6()) {
      isDirty_ts_l5_n6 = ts_l5_n6.onUpstream();
    }
    if (guardCheck_ts_l5_n7()) {
      isDirty_ts_l5_n7 = ts_l5_n7.onUpstream();
    }
    if (guardCheck_ts_l5_n8()) {
      isDirty_ts_l5_n8 = ts_l5_n8.onUpstream();
    }
    if (guardCheck_ts_l5_n9()) {
      isDirty_ts_l5_n9 = ts_l5_n9.onUpstream();
    }
    if (guardCheck_ts_l6_n0()) {
      isDirty_ts_l6_n0 = ts_l6_n0.onUpstream();
    }
    if (guardCheck_ts_l6_n1()) {
      isDirty_ts_l6_n1 = ts_l6_n1.onUpstream();
    }
    if (guardCheck_ts_l6_n2()) {
      isDirty_ts_l6_n2 = ts_l6_n2.onUpstream();
    }
    if (guardCheck_ts_l6_n3()) {
      isDirty_ts_l6_n3 = ts_l6_n3.onUpstream();
    }
    if (guardCheck_ts_l6_n4()) {
      isDirty_ts_l6_n4 = ts_l6_n4.onUpstream();
    }
    if (guardCheck_ts_l6_n5()) {
      isDirty_ts_l6_n5 = ts_l6_n5.onUpstream();
    }
    if (guardCheck_ts_l6_n6()) {
      isDirty_ts_l6_n6 = ts_l6_n6.onUpstream();
    }
    if (guardCheck_ts_l6_n7()) {
      isDirty_ts_l6_n7 = ts_l6_n7.onUpstream();
    }
    if (guardCheck_ts_l6_n8()) {
      isDirty_ts_l6_n8 = ts_l6_n8.onUpstream();
    }
    if (guardCheck_ts_l6_n9()) {
      isDirty_ts_l6_n9 = ts_l6_n9.onUpstream();
    }
    if (guardCheck_ts_l7_n0()) {
      isDirty_ts_l7_n0 = ts_l7_n0.onUpstream();
    }
    if (guardCheck_ts_l7_n1()) {
      isDirty_ts_l7_n1 = ts_l7_n1.onUpstream();
    }
    if (guardCheck_ts_l7_n2()) {
      isDirty_ts_l7_n2 = ts_l7_n2.onUpstream();
    }
    if (guardCheck_ts_l7_n3()) {
      isDirty_ts_l7_n3 = ts_l7_n3.onUpstream();
    }
    if (guardCheck_ts_l7_n4()) {
      isDirty_ts_l7_n4 = ts_l7_n4.onUpstream();
    }
    if (guardCheck_ts_l7_n5()) {
      isDirty_ts_l7_n5 = ts_l7_n5.onUpstream();
    }
    if (guardCheck_ts_l7_n6()) {
      isDirty_ts_l7_n6 = ts_l7_n6.onUpstream();
    }
    if (guardCheck_ts_l7_n7()) {
      isDirty_ts_l7_n7 = ts_l7_n7.onUpstream();
    }
    if (guardCheck_ts_l7_n8()) {
      isDirty_ts_l7_n8 = ts_l7_n8.onUpstream();
    }
    if (guardCheck_ts_l7_n9()) {
      isDirty_ts_l7_n9 = ts_l7_n9.onUpstream();
    }
    if (guardCheck_ts_l8_n0()) {
      isDirty_ts_l8_n0 = ts_l8_n0.onUpstream();
    }
    if (guardCheck_ts_l8_n1()) {
      isDirty_ts_l8_n1 = ts_l8_n1.onUpstream();
    }
    if (guardCheck_ts_l8_n2()) {
      isDirty_ts_l8_n2 = ts_l8_n2.onUpstream();
    }
    if (guardCheck_ts_l8_n3()) {
      isDirty_ts_l8_n3 = ts_l8_n3.onUpstream();
    }
    if (guardCheck_ts_l8_n4()) {
      isDirty_ts_l8_n4 = ts_l8_n4.onUpstream();
    }
    if (guardCheck_ts_l8_n5()) {
      isDirty_ts_l8_n5 = ts_l8_n5.onUpstream();
    }
    if (guardCheck_ts_l8_n6()) {
      isDirty_ts_l8_n6 = ts_l8_n6.onUpstream();
    }
    if (guardCheck_ts_l8_n7()) {
      isDirty_ts_l8_n7 = ts_l8_n7.onUpstream();
    }
    if (guardCheck_ts_l8_n8()) {
      isDirty_ts_l8_n8 = ts_l8_n8.onUpstream();
    }
    if (guardCheck_ts_l8_n9()) {
      isDirty_ts_l8_n9 = ts_l8_n9.onUpstream();
    }
    if (guardCheck_ts_l9_n0()) {
      isDirty_ts_l9_n0 = ts_l9_n0.onUpstream();
    }
    if (guardCheck_ts_l9_n1()) {
      isDirty_ts_l9_n1 = ts_l9_n1.onUpstream();
    }
    if (guardCheck_ts_l9_n2()) {
      isDirty_ts_l9_n2 = ts_l9_n2.onUpstream();
    }
    if (guardCheck_ts_l9_n3()) {
      isDirty_ts_l9_n3 = ts_l9_n3.onUpstream();
    }
    if (guardCheck_ts_l9_n4()) {
      isDirty_ts_l9_n4 = ts_l9_n4.onUpstream();
    }
    if (guardCheck_ts_l9_n5()) {
      ts_l9_n5.onUpstream();
    }
    if (guardCheck_ts_l9_n6()) {
      ts_l9_n6.onUpstream();
    }
    if (guardCheck_ts_l9_n7()) {
      ts_l9_n7.onUpstream();
    }
    if (guardCheck_ts_l9_n8()) {
      ts_l9_n8.onUpstream();
    }
    if (guardCheck_ts_l9_n9()) {
      ts_l9_n9.onUpstream();
    }
    if (guardCheck_ts_sink()) {
      isDirty_ts_sink = ts_sink.onUpstream();
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
    auditor.nodeRegistered(dataCollector_288, "dataCollector_288");
    auditor.nodeRegistered(eventContext_287, "eventContext_287");
    auditor.nodeRegistered(ts_l1_n0, "ts_l1_n0");
    auditor.nodeRegistered(ts_l1_n1, "ts_l1_n1");
    auditor.nodeRegistered(ts_l1_n2, "ts_l1_n2");
    auditor.nodeRegistered(ts_l1_n3, "ts_l1_n3");
    auditor.nodeRegistered(ts_l1_n4, "ts_l1_n4");
    auditor.nodeRegistered(ts_l1_n5, "ts_l1_n5");
    auditor.nodeRegistered(ts_l1_n6, "ts_l1_n6");
    auditor.nodeRegistered(ts_l1_n7, "ts_l1_n7");
    auditor.nodeRegistered(ts_l1_n8, "ts_l1_n8");
    auditor.nodeRegistered(ts_l1_n9, "ts_l1_n9");
    auditor.nodeRegistered(ts_l2_n0, "ts_l2_n0");
    auditor.nodeRegistered(ts_l2_n1, "ts_l2_n1");
    auditor.nodeRegistered(ts_l2_n2, "ts_l2_n2");
    auditor.nodeRegistered(ts_l2_n3, "ts_l2_n3");
    auditor.nodeRegistered(ts_l2_n4, "ts_l2_n4");
    auditor.nodeRegistered(ts_l2_n5, "ts_l2_n5");
    auditor.nodeRegistered(ts_l2_n6, "ts_l2_n6");
    auditor.nodeRegistered(ts_l2_n7, "ts_l2_n7");
    auditor.nodeRegistered(ts_l2_n8, "ts_l2_n8");
    auditor.nodeRegistered(ts_l2_n9, "ts_l2_n9");
    auditor.nodeRegistered(ts_l3_n0, "ts_l3_n0");
    auditor.nodeRegistered(ts_l3_n1, "ts_l3_n1");
    auditor.nodeRegistered(ts_l3_n2, "ts_l3_n2");
    auditor.nodeRegistered(ts_l3_n3, "ts_l3_n3");
    auditor.nodeRegistered(ts_l3_n4, "ts_l3_n4");
    auditor.nodeRegistered(ts_l3_n5, "ts_l3_n5");
    auditor.nodeRegistered(ts_l3_n6, "ts_l3_n6");
    auditor.nodeRegistered(ts_l3_n7, "ts_l3_n7");
    auditor.nodeRegistered(ts_l3_n8, "ts_l3_n8");
    auditor.nodeRegistered(ts_l3_n9, "ts_l3_n9");
    auditor.nodeRegistered(ts_l4_n0, "ts_l4_n0");
    auditor.nodeRegistered(ts_l4_n1, "ts_l4_n1");
    auditor.nodeRegistered(ts_l4_n2, "ts_l4_n2");
    auditor.nodeRegistered(ts_l4_n3, "ts_l4_n3");
    auditor.nodeRegistered(ts_l4_n4, "ts_l4_n4");
    auditor.nodeRegistered(ts_l4_n5, "ts_l4_n5");
    auditor.nodeRegistered(ts_l4_n6, "ts_l4_n6");
    auditor.nodeRegistered(ts_l4_n7, "ts_l4_n7");
    auditor.nodeRegistered(ts_l4_n8, "ts_l4_n8");
    auditor.nodeRegistered(ts_l4_n9, "ts_l4_n9");
    auditor.nodeRegistered(ts_l5_n0, "ts_l5_n0");
    auditor.nodeRegistered(ts_l5_n1, "ts_l5_n1");
    auditor.nodeRegistered(ts_l5_n2, "ts_l5_n2");
    auditor.nodeRegistered(ts_l5_n3, "ts_l5_n3");
    auditor.nodeRegistered(ts_l5_n4, "ts_l5_n4");
    auditor.nodeRegistered(ts_l5_n5, "ts_l5_n5");
    auditor.nodeRegistered(ts_l5_n6, "ts_l5_n6");
    auditor.nodeRegistered(ts_l5_n7, "ts_l5_n7");
    auditor.nodeRegistered(ts_l5_n8, "ts_l5_n8");
    auditor.nodeRegistered(ts_l5_n9, "ts_l5_n9");
    auditor.nodeRegistered(ts_l6_n0, "ts_l6_n0");
    auditor.nodeRegistered(ts_l6_n1, "ts_l6_n1");
    auditor.nodeRegistered(ts_l6_n2, "ts_l6_n2");
    auditor.nodeRegistered(ts_l6_n3, "ts_l6_n3");
    auditor.nodeRegistered(ts_l6_n4, "ts_l6_n4");
    auditor.nodeRegistered(ts_l6_n5, "ts_l6_n5");
    auditor.nodeRegistered(ts_l6_n6, "ts_l6_n6");
    auditor.nodeRegistered(ts_l6_n7, "ts_l6_n7");
    auditor.nodeRegistered(ts_l6_n8, "ts_l6_n8");
    auditor.nodeRegistered(ts_l6_n9, "ts_l6_n9");
    auditor.nodeRegistered(ts_l7_n0, "ts_l7_n0");
    auditor.nodeRegistered(ts_l7_n1, "ts_l7_n1");
    auditor.nodeRegistered(ts_l7_n2, "ts_l7_n2");
    auditor.nodeRegistered(ts_l7_n3, "ts_l7_n3");
    auditor.nodeRegistered(ts_l7_n4, "ts_l7_n4");
    auditor.nodeRegistered(ts_l7_n5, "ts_l7_n5");
    auditor.nodeRegistered(ts_l7_n6, "ts_l7_n6");
    auditor.nodeRegistered(ts_l7_n7, "ts_l7_n7");
    auditor.nodeRegistered(ts_l7_n8, "ts_l7_n8");
    auditor.nodeRegistered(ts_l7_n9, "ts_l7_n9");
    auditor.nodeRegistered(ts_l8_n0, "ts_l8_n0");
    auditor.nodeRegistered(ts_l8_n1, "ts_l8_n1");
    auditor.nodeRegistered(ts_l8_n2, "ts_l8_n2");
    auditor.nodeRegistered(ts_l8_n3, "ts_l8_n3");
    auditor.nodeRegistered(ts_l8_n4, "ts_l8_n4");
    auditor.nodeRegistered(ts_l8_n5, "ts_l8_n5");
    auditor.nodeRegistered(ts_l8_n6, "ts_l8_n6");
    auditor.nodeRegistered(ts_l8_n7, "ts_l8_n7");
    auditor.nodeRegistered(ts_l8_n8, "ts_l8_n8");
    auditor.nodeRegistered(ts_l8_n9, "ts_l8_n9");
    auditor.nodeRegistered(ts_l9_n0, "ts_l9_n0");
    auditor.nodeRegistered(ts_l9_n1, "ts_l9_n1");
    auditor.nodeRegistered(ts_l9_n2, "ts_l9_n2");
    auditor.nodeRegistered(ts_l9_n3, "ts_l9_n3");
    auditor.nodeRegistered(ts_l9_n4, "ts_l9_n4");
    auditor.nodeRegistered(ts_l9_n5, "ts_l9_n5");
    auditor.nodeRegistered(ts_l9_n6, "ts_l9_n6");
    auditor.nodeRegistered(ts_l9_n7, "ts_l9_n7");
    auditor.nodeRegistered(ts_l9_n8, "ts_l9_n8");
    auditor.nodeRegistered(ts_l9_n9, "ts_l9_n9");
    auditor.nodeRegistered(ctrl_l1_n0, "ctrl_l1_n0");
    auditor.nodeRegistered(ctrl_l1_n1, "ctrl_l1_n1");
    auditor.nodeRegistered(ctrl_l1_n2, "ctrl_l1_n2");
    auditor.nodeRegistered(ctrl_l1_n3, "ctrl_l1_n3");
    auditor.nodeRegistered(ctrl_l1_n4, "ctrl_l1_n4");
    auditor.nodeRegistered(ctrl_l1_n5, "ctrl_l1_n5");
    auditor.nodeRegistered(ctrl_l1_n6, "ctrl_l1_n6");
    auditor.nodeRegistered(ctrl_l1_n7, "ctrl_l1_n7");
    auditor.nodeRegistered(ctrl_l1_n8, "ctrl_l1_n8");
    auditor.nodeRegistered(ctrl_l1_n9, "ctrl_l1_n9");
    auditor.nodeRegistered(ctrl_l2_n0, "ctrl_l2_n0");
    auditor.nodeRegistered(ctrl_l2_n1, "ctrl_l2_n1");
    auditor.nodeRegistered(ctrl_l2_n2, "ctrl_l2_n2");
    auditor.nodeRegistered(ctrl_l2_n3, "ctrl_l2_n3");
    auditor.nodeRegistered(ctrl_l2_n4, "ctrl_l2_n4");
    auditor.nodeRegistered(ctrl_l2_n5, "ctrl_l2_n5");
    auditor.nodeRegistered(ctrl_l2_n6, "ctrl_l2_n6");
    auditor.nodeRegistered(ctrl_l2_n7, "ctrl_l2_n7");
    auditor.nodeRegistered(ctrl_l2_n8, "ctrl_l2_n8");
    auditor.nodeRegistered(ctrl_l2_n9, "ctrl_l2_n9");
    auditor.nodeRegistered(ctrl_l3_n0, "ctrl_l3_n0");
    auditor.nodeRegistered(ctrl_l3_n1, "ctrl_l3_n1");
    auditor.nodeRegistered(ctrl_l3_n2, "ctrl_l3_n2");
    auditor.nodeRegistered(ctrl_l3_n3, "ctrl_l3_n3");
    auditor.nodeRegistered(ctrl_l3_n4, "ctrl_l3_n4");
    auditor.nodeRegistered(ctrl_l3_n5, "ctrl_l3_n5");
    auditor.nodeRegistered(ctrl_l3_n6, "ctrl_l3_n6");
    auditor.nodeRegistered(ctrl_l3_n7, "ctrl_l3_n7");
    auditor.nodeRegistered(ctrl_l3_n8, "ctrl_l3_n8");
    auditor.nodeRegistered(ctrl_l3_n9, "ctrl_l3_n9");
    auditor.nodeRegistered(ctrl_l4_n0, "ctrl_l4_n0");
    auditor.nodeRegistered(ctrl_l4_n1, "ctrl_l4_n1");
    auditor.nodeRegistered(ctrl_l4_n2, "ctrl_l4_n2");
    auditor.nodeRegistered(ctrl_l4_n3, "ctrl_l4_n3");
    auditor.nodeRegistered(ctrl_l4_n4, "ctrl_l4_n4");
    auditor.nodeRegistered(ctrl_l4_n5, "ctrl_l4_n5");
    auditor.nodeRegistered(ctrl_l4_n6, "ctrl_l4_n6");
    auditor.nodeRegistered(ctrl_l4_n7, "ctrl_l4_n7");
    auditor.nodeRegistered(ctrl_l4_n8, "ctrl_l4_n8");
    auditor.nodeRegistered(ctrl_l4_n9, "ctrl_l4_n9");
    auditor.nodeRegistered(ctrl_l5_n0, "ctrl_l5_n0");
    auditor.nodeRegistered(ctrl_l5_n1, "ctrl_l5_n1");
    auditor.nodeRegistered(ctrl_l5_n2, "ctrl_l5_n2");
    auditor.nodeRegistered(ctrl_l5_n3, "ctrl_l5_n3");
    auditor.nodeRegistered(ctrl_l5_n4, "ctrl_l5_n4");
    auditor.nodeRegistered(ctrl_l5_n5, "ctrl_l5_n5");
    auditor.nodeRegistered(ctrl_l5_n6, "ctrl_l5_n6");
    auditor.nodeRegistered(ctrl_l5_n7, "ctrl_l5_n7");
    auditor.nodeRegistered(ctrl_l5_n8, "ctrl_l5_n8");
    auditor.nodeRegistered(ctrl_l5_n9, "ctrl_l5_n9");
    auditor.nodeRegistered(ctrl_l6_n0, "ctrl_l6_n0");
    auditor.nodeRegistered(ctrl_l6_n1, "ctrl_l6_n1");
    auditor.nodeRegistered(ctrl_l6_n2, "ctrl_l6_n2");
    auditor.nodeRegistered(ctrl_l6_n3, "ctrl_l6_n3");
    auditor.nodeRegistered(ctrl_l6_n4, "ctrl_l6_n4");
    auditor.nodeRegistered(ctrl_l6_n5, "ctrl_l6_n5");
    auditor.nodeRegistered(ctrl_l6_n6, "ctrl_l6_n6");
    auditor.nodeRegistered(ctrl_l6_n7, "ctrl_l6_n7");
    auditor.nodeRegistered(ctrl_l6_n8, "ctrl_l6_n8");
    auditor.nodeRegistered(ctrl_l6_n9, "ctrl_l6_n9");
    auditor.nodeRegistered(ctrl_l7_n0, "ctrl_l7_n0");
    auditor.nodeRegistered(ctrl_l7_n1, "ctrl_l7_n1");
    auditor.nodeRegistered(ctrl_l7_n2, "ctrl_l7_n2");
    auditor.nodeRegistered(ctrl_l7_n3, "ctrl_l7_n3");
    auditor.nodeRegistered(ctrl_l7_n4, "ctrl_l7_n4");
    auditor.nodeRegistered(ctrl_l7_n5, "ctrl_l7_n5");
    auditor.nodeRegistered(ctrl_l7_n6, "ctrl_l7_n6");
    auditor.nodeRegistered(ctrl_l7_n7, "ctrl_l7_n7");
    auditor.nodeRegistered(ctrl_l7_n8, "ctrl_l7_n8");
    auditor.nodeRegistered(ctrl_l7_n9, "ctrl_l7_n9");
    auditor.nodeRegistered(ctrl_l8_n0, "ctrl_l8_n0");
    auditor.nodeRegistered(ctrl_l8_n1, "ctrl_l8_n1");
    auditor.nodeRegistered(ctrl_l8_n2, "ctrl_l8_n2");
    auditor.nodeRegistered(ctrl_l8_n3, "ctrl_l8_n3");
    auditor.nodeRegistered(ctrl_l8_n4, "ctrl_l8_n4");
    auditor.nodeRegistered(ctrl_l8_n5, "ctrl_l8_n5");
    auditor.nodeRegistered(ctrl_l8_n6, "ctrl_l8_n6");
    auditor.nodeRegistered(ctrl_l8_n7, "ctrl_l8_n7");
    auditor.nodeRegistered(ctrl_l8_n8, "ctrl_l8_n8");
    auditor.nodeRegistered(ctrl_l8_n9, "ctrl_l8_n9");
    auditor.nodeRegistered(ctrl_l9_n0, "ctrl_l9_n0");
    auditor.nodeRegistered(ctrl_l9_n1, "ctrl_l9_n1");
    auditor.nodeRegistered(ctrl_l9_n2, "ctrl_l9_n2");
    auditor.nodeRegistered(ctrl_l9_n3, "ctrl_l9_n3");
    auditor.nodeRegistered(ctrl_l9_n4, "ctrl_l9_n4");
    auditor.nodeRegistered(ctrl_l9_n5, "ctrl_l9_n5");
    auditor.nodeRegistered(ctrl_l9_n6, "ctrl_l9_n6");
    auditor.nodeRegistered(ctrl_l9_n7, "ctrl_l9_n7");
    auditor.nodeRegistered(ctrl_l9_n8, "ctrl_l9_n8");
    auditor.nodeRegistered(ctrl_l9_n9, "ctrl_l9_n9");
    auditor.nodeRegistered(ctrl_sink, "ctrl_sink");
    auditor.nodeRegistered(md_l1_n0, "md_l1_n0");
    auditor.nodeRegistered(md_l1_n1, "md_l1_n1");
    auditor.nodeRegistered(md_l1_n2, "md_l1_n2");
    auditor.nodeRegistered(md_l1_n3, "md_l1_n3");
    auditor.nodeRegistered(md_l1_n4, "md_l1_n4");
    auditor.nodeRegistered(md_l1_n5, "md_l1_n5");
    auditor.nodeRegistered(md_l1_n6, "md_l1_n6");
    auditor.nodeRegistered(md_l1_n7, "md_l1_n7");
    auditor.nodeRegistered(md_l1_n8, "md_l1_n8");
    auditor.nodeRegistered(md_l1_n9, "md_l1_n9");
    auditor.nodeRegistered(md_l2_n0, "md_l2_n0");
    auditor.nodeRegistered(md_l2_n1, "md_l2_n1");
    auditor.nodeRegistered(md_l2_n2, "md_l2_n2");
    auditor.nodeRegistered(md_l2_n3, "md_l2_n3");
    auditor.nodeRegistered(md_l2_n4, "md_l2_n4");
    auditor.nodeRegistered(md_l2_n5, "md_l2_n5");
    auditor.nodeRegistered(md_l2_n6, "md_l2_n6");
    auditor.nodeRegistered(md_l2_n7, "md_l2_n7");
    auditor.nodeRegistered(md_l2_n8, "md_l2_n8");
    auditor.nodeRegistered(md_l2_n9, "md_l2_n9");
    auditor.nodeRegistered(md_l3_n0, "md_l3_n0");
    auditor.nodeRegistered(md_l3_n1, "md_l3_n1");
    auditor.nodeRegistered(md_l3_n2, "md_l3_n2");
    auditor.nodeRegistered(md_l3_n3, "md_l3_n3");
    auditor.nodeRegistered(md_l3_n4, "md_l3_n4");
    auditor.nodeRegistered(md_l3_n5, "md_l3_n5");
    auditor.nodeRegistered(md_l3_n6, "md_l3_n6");
    auditor.nodeRegistered(md_l3_n7, "md_l3_n7");
    auditor.nodeRegistered(md_l3_n8, "md_l3_n8");
    auditor.nodeRegistered(md_l3_n9, "md_l3_n9");
    auditor.nodeRegistered(md_l4_n0, "md_l4_n0");
    auditor.nodeRegistered(md_l4_n1, "md_l4_n1");
    auditor.nodeRegistered(md_l4_n2, "md_l4_n2");
    auditor.nodeRegistered(md_l4_n3, "md_l4_n3");
    auditor.nodeRegistered(md_l4_n4, "md_l4_n4");
    auditor.nodeRegistered(md_l4_n5, "md_l4_n5");
    auditor.nodeRegistered(md_l4_n6, "md_l4_n6");
    auditor.nodeRegistered(md_l4_n7, "md_l4_n7");
    auditor.nodeRegistered(md_l4_n8, "md_l4_n8");
    auditor.nodeRegistered(md_l4_n9, "md_l4_n9");
    auditor.nodeRegistered(md_l5_n0, "md_l5_n0");
    auditor.nodeRegistered(md_l5_n1, "md_l5_n1");
    auditor.nodeRegistered(md_l5_n2, "md_l5_n2");
    auditor.nodeRegistered(md_l5_n3, "md_l5_n3");
    auditor.nodeRegistered(md_l5_n4, "md_l5_n4");
    auditor.nodeRegistered(md_l5_n5, "md_l5_n5");
    auditor.nodeRegistered(md_l5_n6, "md_l5_n6");
    auditor.nodeRegistered(md_l5_n7, "md_l5_n7");
    auditor.nodeRegistered(md_l5_n8, "md_l5_n8");
    auditor.nodeRegistered(md_l5_n9, "md_l5_n9");
    auditor.nodeRegistered(md_l6_n0, "md_l6_n0");
    auditor.nodeRegistered(md_l6_n1, "md_l6_n1");
    auditor.nodeRegistered(md_l6_n2, "md_l6_n2");
    auditor.nodeRegistered(md_l6_n3, "md_l6_n3");
    auditor.nodeRegistered(md_l6_n4, "md_l6_n4");
    auditor.nodeRegistered(md_l6_n5, "md_l6_n5");
    auditor.nodeRegistered(md_l6_n6, "md_l6_n6");
    auditor.nodeRegistered(md_l6_n7, "md_l6_n7");
    auditor.nodeRegistered(md_l6_n8, "md_l6_n8");
    auditor.nodeRegistered(md_l6_n9, "md_l6_n9");
    auditor.nodeRegistered(md_l7_n0, "md_l7_n0");
    auditor.nodeRegistered(md_l7_n1, "md_l7_n1");
    auditor.nodeRegistered(md_l7_n2, "md_l7_n2");
    auditor.nodeRegistered(md_l7_n3, "md_l7_n3");
    auditor.nodeRegistered(md_l7_n4, "md_l7_n4");
    auditor.nodeRegistered(md_l7_n5, "md_l7_n5");
    auditor.nodeRegistered(md_l7_n6, "md_l7_n6");
    auditor.nodeRegistered(md_l7_n7, "md_l7_n7");
    auditor.nodeRegistered(md_l7_n8, "md_l7_n8");
    auditor.nodeRegistered(md_l7_n9, "md_l7_n9");
    auditor.nodeRegistered(md_l8_n0, "md_l8_n0");
    auditor.nodeRegistered(md_l8_n1, "md_l8_n1");
    auditor.nodeRegistered(md_l8_n2, "md_l8_n2");
    auditor.nodeRegistered(md_l8_n3, "md_l8_n3");
    auditor.nodeRegistered(md_l8_n4, "md_l8_n4");
    auditor.nodeRegistered(md_l8_n5, "md_l8_n5");
    auditor.nodeRegistered(md_l8_n6, "md_l8_n6");
    auditor.nodeRegistered(md_l8_n7, "md_l8_n7");
    auditor.nodeRegistered(md_l8_n8, "md_l8_n8");
    auditor.nodeRegistered(md_l8_n9, "md_l8_n9");
    auditor.nodeRegistered(md_l9_n0, "md_l9_n0");
    auditor.nodeRegistered(md_l9_n1, "md_l9_n1");
    auditor.nodeRegistered(md_l9_n2, "md_l9_n2");
    auditor.nodeRegistered(md_l9_n3, "md_l9_n3");
    auditor.nodeRegistered(md_l9_n4, "md_l9_n4");
    auditor.nodeRegistered(md_l9_n5, "md_l9_n5");
    auditor.nodeRegistered(md_l9_n6, "md_l9_n6");
    auditor.nodeRegistered(md_l9_n7, "md_l9_n7");
    auditor.nodeRegistered(md_l9_n8, "md_l9_n8");
    auditor.nodeRegistered(md_l9_n9, "md_l9_n9");
    auditor.nodeRegistered(md_l10_n0, "md_l10_n0");
    auditor.nodeRegistered(md_l10_n1, "md_l10_n1");
    auditor.nodeRegistered(md_l10_n2, "md_l10_n2");
    auditor.nodeRegistered(md_l10_n3, "md_l10_n3");
    auditor.nodeRegistered(md_l10_n4, "md_l10_n4");
    auditor.nodeRegistered(md_l10_n5, "md_l10_n5");
    auditor.nodeRegistered(md_l10_n6, "md_l10_n6");
    auditor.nodeRegistered(md_l10_n7, "md_l10_n7");
    auditor.nodeRegistered(md_l10_n8, "md_l10_n8");
    auditor.nodeRegistered(md_l10_n9, "md_l10_n9");
    auditor.nodeRegistered(ctrl_root, "ctrl_root");
    auditor.nodeRegistered(md_root, "md_root");
    auditor.nodeRegistered(md_sink, "md_sink");
    auditor.nodeRegistered(sink, "sink");
    auditor.nodeRegistered(ts_sink, "ts_sink");
    auditor.nodeRegistered(ts_root, "ts_root");
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
    isDirty_ctrl_l1_n0 = false;
    isDirty_ctrl_l1_n1 = false;
    isDirty_ctrl_l1_n2 = false;
    isDirty_ctrl_l1_n3 = false;
    isDirty_ctrl_l1_n4 = false;
    isDirty_ctrl_l1_n5 = false;
    isDirty_ctrl_l1_n6 = false;
    isDirty_ctrl_l1_n7 = false;
    isDirty_ctrl_l1_n8 = false;
    isDirty_ctrl_l1_n9 = false;
    isDirty_ctrl_l2_n0 = false;
    isDirty_ctrl_l2_n1 = false;
    isDirty_ctrl_l2_n2 = false;
    isDirty_ctrl_l2_n3 = false;
    isDirty_ctrl_l2_n4 = false;
    isDirty_ctrl_l2_n5 = false;
    isDirty_ctrl_l2_n6 = false;
    isDirty_ctrl_l2_n7 = false;
    isDirty_ctrl_l2_n8 = false;
    isDirty_ctrl_l2_n9 = false;
    isDirty_ctrl_l3_n0 = false;
    isDirty_ctrl_l3_n1 = false;
    isDirty_ctrl_l3_n2 = false;
    isDirty_ctrl_l3_n3 = false;
    isDirty_ctrl_l3_n4 = false;
    isDirty_ctrl_l3_n5 = false;
    isDirty_ctrl_l3_n6 = false;
    isDirty_ctrl_l3_n7 = false;
    isDirty_ctrl_l3_n8 = false;
    isDirty_ctrl_l3_n9 = false;
    isDirty_ctrl_l4_n0 = false;
    isDirty_ctrl_l4_n1 = false;
    isDirty_ctrl_l4_n2 = false;
    isDirty_ctrl_l4_n3 = false;
    isDirty_ctrl_l4_n4 = false;
    isDirty_ctrl_l4_n5 = false;
    isDirty_ctrl_l4_n6 = false;
    isDirty_ctrl_l4_n7 = false;
    isDirty_ctrl_l4_n8 = false;
    isDirty_ctrl_l4_n9 = false;
    isDirty_ctrl_l5_n0 = false;
    isDirty_ctrl_l5_n1 = false;
    isDirty_ctrl_l5_n2 = false;
    isDirty_ctrl_l5_n3 = false;
    isDirty_ctrl_l5_n4 = false;
    isDirty_ctrl_l5_n5 = false;
    isDirty_ctrl_l5_n6 = false;
    isDirty_ctrl_l5_n7 = false;
    isDirty_ctrl_l5_n8 = false;
    isDirty_ctrl_l5_n9 = false;
    isDirty_ctrl_l6_n0 = false;
    isDirty_ctrl_l6_n1 = false;
    isDirty_ctrl_l6_n2 = false;
    isDirty_ctrl_l6_n3 = false;
    isDirty_ctrl_l6_n4 = false;
    isDirty_ctrl_l6_n5 = false;
    isDirty_ctrl_l6_n6 = false;
    isDirty_ctrl_l6_n7 = false;
    isDirty_ctrl_l6_n8 = false;
    isDirty_ctrl_l6_n9 = false;
    isDirty_ctrl_l7_n0 = false;
    isDirty_ctrl_l7_n1 = false;
    isDirty_ctrl_l7_n2 = false;
    isDirty_ctrl_l7_n3 = false;
    isDirty_ctrl_l7_n4 = false;
    isDirty_ctrl_l7_n5 = false;
    isDirty_ctrl_l7_n6 = false;
    isDirty_ctrl_l7_n7 = false;
    isDirty_ctrl_l7_n8 = false;
    isDirty_ctrl_l7_n9 = false;
    isDirty_ctrl_l8_n0 = false;
    isDirty_ctrl_l8_n1 = false;
    isDirty_ctrl_l8_n2 = false;
    isDirty_ctrl_l8_n3 = false;
    isDirty_ctrl_l8_n4 = false;
    isDirty_ctrl_l8_n5 = false;
    isDirty_ctrl_l8_n6 = false;
    isDirty_ctrl_l8_n7 = false;
    isDirty_ctrl_l8_n8 = false;
    isDirty_ctrl_l8_n9 = false;
    isDirty_ctrl_l9_n0 = false;
    isDirty_ctrl_l9_n1 = false;
    isDirty_ctrl_l9_n2 = false;
    isDirty_ctrl_root = false;
    isDirty_md_l1_n0 = false;
    isDirty_md_l1_n1 = false;
    isDirty_md_l1_n2 = false;
    isDirty_md_l1_n3 = false;
    isDirty_md_l1_n4 = false;
    isDirty_md_l1_n5 = false;
    isDirty_md_l1_n6 = false;
    isDirty_md_l1_n7 = false;
    isDirty_md_l1_n8 = false;
    isDirty_md_l1_n9 = false;
    isDirty_md_l2_n0 = false;
    isDirty_md_l2_n1 = false;
    isDirty_md_l2_n2 = false;
    isDirty_md_l2_n3 = false;
    isDirty_md_l2_n4 = false;
    isDirty_md_l2_n5 = false;
    isDirty_md_l2_n6 = false;
    isDirty_md_l2_n7 = false;
    isDirty_md_l2_n8 = false;
    isDirty_md_l2_n9 = false;
    isDirty_md_l3_n0 = false;
    isDirty_md_l3_n1 = false;
    isDirty_md_l3_n2 = false;
    isDirty_md_l3_n3 = false;
    isDirty_md_l3_n4 = false;
    isDirty_md_l3_n5 = false;
    isDirty_md_l3_n6 = false;
    isDirty_md_l3_n7 = false;
    isDirty_md_l3_n8 = false;
    isDirty_md_l3_n9 = false;
    isDirty_md_l4_n0 = false;
    isDirty_md_l4_n1 = false;
    isDirty_md_l4_n2 = false;
    isDirty_md_l4_n3 = false;
    isDirty_md_l4_n4 = false;
    isDirty_md_l4_n5 = false;
    isDirty_md_l4_n6 = false;
    isDirty_md_l4_n7 = false;
    isDirty_md_l4_n8 = false;
    isDirty_md_l4_n9 = false;
    isDirty_md_l5_n0 = false;
    isDirty_md_l5_n1 = false;
    isDirty_md_l5_n2 = false;
    isDirty_md_l5_n3 = false;
    isDirty_md_l5_n4 = false;
    isDirty_md_l5_n5 = false;
    isDirty_md_l5_n6 = false;
    isDirty_md_l5_n7 = false;
    isDirty_md_l5_n8 = false;
    isDirty_md_l5_n9 = false;
    isDirty_md_l6_n0 = false;
    isDirty_md_l6_n1 = false;
    isDirty_md_l6_n2 = false;
    isDirty_md_l6_n3 = false;
    isDirty_md_l6_n4 = false;
    isDirty_md_l6_n5 = false;
    isDirty_md_l6_n6 = false;
    isDirty_md_l6_n7 = false;
    isDirty_md_l6_n8 = false;
    isDirty_md_l6_n9 = false;
    isDirty_md_l7_n0 = false;
    isDirty_md_l7_n1 = false;
    isDirty_md_l7_n2 = false;
    isDirty_md_l7_n3 = false;
    isDirty_md_l7_n4 = false;
    isDirty_md_l7_n5 = false;
    isDirty_md_l7_n6 = false;
    isDirty_md_l7_n7 = false;
    isDirty_md_l7_n8 = false;
    isDirty_md_l7_n9 = false;
    isDirty_md_l8_n0 = false;
    isDirty_md_l8_n1 = false;
    isDirty_md_l8_n2 = false;
    isDirty_md_l8_n3 = false;
    isDirty_md_l8_n4 = false;
    isDirty_md_l8_n5 = false;
    isDirty_md_l8_n6 = false;
    isDirty_md_l8_n7 = false;
    isDirty_md_l8_n8 = false;
    isDirty_md_l8_n9 = false;
    isDirty_md_l9_n0 = false;
    isDirty_md_l9_n1 = false;
    isDirty_md_l9_n2 = false;
    isDirty_md_l9_n3 = false;
    isDirty_md_l9_n4 = false;
    isDirty_md_l9_n5 = false;
    isDirty_md_l9_n6 = false;
    isDirty_md_l9_n7 = false;
    isDirty_md_l9_n8 = false;
    isDirty_md_l9_n9 = false;
    isDirty_md_l10_n0 = false;
    isDirty_md_l10_n1 = false;
    isDirty_md_l10_n2 = false;
    isDirty_md_l10_n3 = false;
    isDirty_md_l10_n4 = false;
    isDirty_md_root = false;
    isDirty_md_sink = false;
    isDirty_ts_l1_n0 = false;
    isDirty_ts_l1_n1 = false;
    isDirty_ts_l1_n2 = false;
    isDirty_ts_l1_n3 = false;
    isDirty_ts_l1_n4 = false;
    isDirty_ts_l1_n5 = false;
    isDirty_ts_l1_n6 = false;
    isDirty_ts_l1_n7 = false;
    isDirty_ts_l1_n8 = false;
    isDirty_ts_l1_n9 = false;
    isDirty_ts_l2_n0 = false;
    isDirty_ts_l2_n1 = false;
    isDirty_ts_l2_n2 = false;
    isDirty_ts_l2_n3 = false;
    isDirty_ts_l2_n4 = false;
    isDirty_ts_l2_n5 = false;
    isDirty_ts_l2_n6 = false;
    isDirty_ts_l2_n7 = false;
    isDirty_ts_l2_n8 = false;
    isDirty_ts_l2_n9 = false;
    isDirty_ts_l3_n0 = false;
    isDirty_ts_l3_n1 = false;
    isDirty_ts_l3_n2 = false;
    isDirty_ts_l3_n3 = false;
    isDirty_ts_l3_n4 = false;
    isDirty_ts_l3_n5 = false;
    isDirty_ts_l3_n6 = false;
    isDirty_ts_l3_n7 = false;
    isDirty_ts_l3_n8 = false;
    isDirty_ts_l3_n9 = false;
    isDirty_ts_l4_n0 = false;
    isDirty_ts_l4_n1 = false;
    isDirty_ts_l4_n2 = false;
    isDirty_ts_l4_n3 = false;
    isDirty_ts_l4_n4 = false;
    isDirty_ts_l4_n5 = false;
    isDirty_ts_l4_n6 = false;
    isDirty_ts_l4_n7 = false;
    isDirty_ts_l4_n8 = false;
    isDirty_ts_l4_n9 = false;
    isDirty_ts_l5_n0 = false;
    isDirty_ts_l5_n1 = false;
    isDirty_ts_l5_n2 = false;
    isDirty_ts_l5_n3 = false;
    isDirty_ts_l5_n4 = false;
    isDirty_ts_l5_n5 = false;
    isDirty_ts_l5_n6 = false;
    isDirty_ts_l5_n7 = false;
    isDirty_ts_l5_n8 = false;
    isDirty_ts_l5_n9 = false;
    isDirty_ts_l6_n0 = false;
    isDirty_ts_l6_n1 = false;
    isDirty_ts_l6_n2 = false;
    isDirty_ts_l6_n3 = false;
    isDirty_ts_l6_n4 = false;
    isDirty_ts_l6_n5 = false;
    isDirty_ts_l6_n6 = false;
    isDirty_ts_l6_n7 = false;
    isDirty_ts_l6_n8 = false;
    isDirty_ts_l6_n9 = false;
    isDirty_ts_l7_n0 = false;
    isDirty_ts_l7_n1 = false;
    isDirty_ts_l7_n2 = false;
    isDirty_ts_l7_n3 = false;
    isDirty_ts_l7_n4 = false;
    isDirty_ts_l7_n5 = false;
    isDirty_ts_l7_n6 = false;
    isDirty_ts_l7_n7 = false;
    isDirty_ts_l7_n8 = false;
    isDirty_ts_l7_n9 = false;
    isDirty_ts_l8_n0 = false;
    isDirty_ts_l8_n1 = false;
    isDirty_ts_l8_n2 = false;
    isDirty_ts_l8_n3 = false;
    isDirty_ts_l8_n4 = false;
    isDirty_ts_l8_n5 = false;
    isDirty_ts_l8_n6 = false;
    isDirty_ts_l8_n7 = false;
    isDirty_ts_l8_n8 = false;
    isDirty_ts_l8_n9 = false;
    isDirty_ts_l9_n0 = false;
    isDirty_ts_l9_n1 = false;
    isDirty_ts_l9_n2 = false;
    isDirty_ts_l9_n3 = false;
    isDirty_ts_l9_n4 = false;
    isDirty_ts_root = false;
    isDirty_ts_sink = false;
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
      dirtyFlagSupplierMap.put(ctrl_l1_n0, () -> isDirty_ctrl_l1_n0);
      dirtyFlagSupplierMap.put(ctrl_l1_n1, () -> isDirty_ctrl_l1_n1);
      dirtyFlagSupplierMap.put(ctrl_l1_n2, () -> isDirty_ctrl_l1_n2);
      dirtyFlagSupplierMap.put(ctrl_l1_n3, () -> isDirty_ctrl_l1_n3);
      dirtyFlagSupplierMap.put(ctrl_l1_n4, () -> isDirty_ctrl_l1_n4);
      dirtyFlagSupplierMap.put(ctrl_l1_n5, () -> isDirty_ctrl_l1_n5);
      dirtyFlagSupplierMap.put(ctrl_l1_n6, () -> isDirty_ctrl_l1_n6);
      dirtyFlagSupplierMap.put(ctrl_l1_n7, () -> isDirty_ctrl_l1_n7);
      dirtyFlagSupplierMap.put(ctrl_l1_n8, () -> isDirty_ctrl_l1_n8);
      dirtyFlagSupplierMap.put(ctrl_l1_n9, () -> isDirty_ctrl_l1_n9);
      dirtyFlagSupplierMap.put(ctrl_l2_n0, () -> isDirty_ctrl_l2_n0);
      dirtyFlagSupplierMap.put(ctrl_l2_n1, () -> isDirty_ctrl_l2_n1);
      dirtyFlagSupplierMap.put(ctrl_l2_n2, () -> isDirty_ctrl_l2_n2);
      dirtyFlagSupplierMap.put(ctrl_l2_n3, () -> isDirty_ctrl_l2_n3);
      dirtyFlagSupplierMap.put(ctrl_l2_n4, () -> isDirty_ctrl_l2_n4);
      dirtyFlagSupplierMap.put(ctrl_l2_n5, () -> isDirty_ctrl_l2_n5);
      dirtyFlagSupplierMap.put(ctrl_l2_n6, () -> isDirty_ctrl_l2_n6);
      dirtyFlagSupplierMap.put(ctrl_l2_n7, () -> isDirty_ctrl_l2_n7);
      dirtyFlagSupplierMap.put(ctrl_l2_n8, () -> isDirty_ctrl_l2_n8);
      dirtyFlagSupplierMap.put(ctrl_l2_n9, () -> isDirty_ctrl_l2_n9);
      dirtyFlagSupplierMap.put(ctrl_l3_n0, () -> isDirty_ctrl_l3_n0);
      dirtyFlagSupplierMap.put(ctrl_l3_n1, () -> isDirty_ctrl_l3_n1);
      dirtyFlagSupplierMap.put(ctrl_l3_n2, () -> isDirty_ctrl_l3_n2);
      dirtyFlagSupplierMap.put(ctrl_l3_n3, () -> isDirty_ctrl_l3_n3);
      dirtyFlagSupplierMap.put(ctrl_l3_n4, () -> isDirty_ctrl_l3_n4);
      dirtyFlagSupplierMap.put(ctrl_l3_n5, () -> isDirty_ctrl_l3_n5);
      dirtyFlagSupplierMap.put(ctrl_l3_n6, () -> isDirty_ctrl_l3_n6);
      dirtyFlagSupplierMap.put(ctrl_l3_n7, () -> isDirty_ctrl_l3_n7);
      dirtyFlagSupplierMap.put(ctrl_l3_n8, () -> isDirty_ctrl_l3_n8);
      dirtyFlagSupplierMap.put(ctrl_l3_n9, () -> isDirty_ctrl_l3_n9);
      dirtyFlagSupplierMap.put(ctrl_l4_n0, () -> isDirty_ctrl_l4_n0);
      dirtyFlagSupplierMap.put(ctrl_l4_n1, () -> isDirty_ctrl_l4_n1);
      dirtyFlagSupplierMap.put(ctrl_l4_n2, () -> isDirty_ctrl_l4_n2);
      dirtyFlagSupplierMap.put(ctrl_l4_n3, () -> isDirty_ctrl_l4_n3);
      dirtyFlagSupplierMap.put(ctrl_l4_n4, () -> isDirty_ctrl_l4_n4);
      dirtyFlagSupplierMap.put(ctrl_l4_n5, () -> isDirty_ctrl_l4_n5);
      dirtyFlagSupplierMap.put(ctrl_l4_n6, () -> isDirty_ctrl_l4_n6);
      dirtyFlagSupplierMap.put(ctrl_l4_n7, () -> isDirty_ctrl_l4_n7);
      dirtyFlagSupplierMap.put(ctrl_l4_n8, () -> isDirty_ctrl_l4_n8);
      dirtyFlagSupplierMap.put(ctrl_l4_n9, () -> isDirty_ctrl_l4_n9);
      dirtyFlagSupplierMap.put(ctrl_l5_n0, () -> isDirty_ctrl_l5_n0);
      dirtyFlagSupplierMap.put(ctrl_l5_n1, () -> isDirty_ctrl_l5_n1);
      dirtyFlagSupplierMap.put(ctrl_l5_n2, () -> isDirty_ctrl_l5_n2);
      dirtyFlagSupplierMap.put(ctrl_l5_n3, () -> isDirty_ctrl_l5_n3);
      dirtyFlagSupplierMap.put(ctrl_l5_n4, () -> isDirty_ctrl_l5_n4);
      dirtyFlagSupplierMap.put(ctrl_l5_n5, () -> isDirty_ctrl_l5_n5);
      dirtyFlagSupplierMap.put(ctrl_l5_n6, () -> isDirty_ctrl_l5_n6);
      dirtyFlagSupplierMap.put(ctrl_l5_n7, () -> isDirty_ctrl_l5_n7);
      dirtyFlagSupplierMap.put(ctrl_l5_n8, () -> isDirty_ctrl_l5_n8);
      dirtyFlagSupplierMap.put(ctrl_l5_n9, () -> isDirty_ctrl_l5_n9);
      dirtyFlagSupplierMap.put(ctrl_l6_n0, () -> isDirty_ctrl_l6_n0);
      dirtyFlagSupplierMap.put(ctrl_l6_n1, () -> isDirty_ctrl_l6_n1);
      dirtyFlagSupplierMap.put(ctrl_l6_n2, () -> isDirty_ctrl_l6_n2);
      dirtyFlagSupplierMap.put(ctrl_l6_n3, () -> isDirty_ctrl_l6_n3);
      dirtyFlagSupplierMap.put(ctrl_l6_n4, () -> isDirty_ctrl_l6_n4);
      dirtyFlagSupplierMap.put(ctrl_l6_n5, () -> isDirty_ctrl_l6_n5);
      dirtyFlagSupplierMap.put(ctrl_l6_n6, () -> isDirty_ctrl_l6_n6);
      dirtyFlagSupplierMap.put(ctrl_l6_n7, () -> isDirty_ctrl_l6_n7);
      dirtyFlagSupplierMap.put(ctrl_l6_n8, () -> isDirty_ctrl_l6_n8);
      dirtyFlagSupplierMap.put(ctrl_l6_n9, () -> isDirty_ctrl_l6_n9);
      dirtyFlagSupplierMap.put(ctrl_l7_n0, () -> isDirty_ctrl_l7_n0);
      dirtyFlagSupplierMap.put(ctrl_l7_n1, () -> isDirty_ctrl_l7_n1);
      dirtyFlagSupplierMap.put(ctrl_l7_n2, () -> isDirty_ctrl_l7_n2);
      dirtyFlagSupplierMap.put(ctrl_l7_n3, () -> isDirty_ctrl_l7_n3);
      dirtyFlagSupplierMap.put(ctrl_l7_n4, () -> isDirty_ctrl_l7_n4);
      dirtyFlagSupplierMap.put(ctrl_l7_n5, () -> isDirty_ctrl_l7_n5);
      dirtyFlagSupplierMap.put(ctrl_l7_n6, () -> isDirty_ctrl_l7_n6);
      dirtyFlagSupplierMap.put(ctrl_l7_n7, () -> isDirty_ctrl_l7_n7);
      dirtyFlagSupplierMap.put(ctrl_l7_n8, () -> isDirty_ctrl_l7_n8);
      dirtyFlagSupplierMap.put(ctrl_l7_n9, () -> isDirty_ctrl_l7_n9);
      dirtyFlagSupplierMap.put(ctrl_l8_n0, () -> isDirty_ctrl_l8_n0);
      dirtyFlagSupplierMap.put(ctrl_l8_n1, () -> isDirty_ctrl_l8_n1);
      dirtyFlagSupplierMap.put(ctrl_l8_n2, () -> isDirty_ctrl_l8_n2);
      dirtyFlagSupplierMap.put(ctrl_l8_n3, () -> isDirty_ctrl_l8_n3);
      dirtyFlagSupplierMap.put(ctrl_l8_n4, () -> isDirty_ctrl_l8_n4);
      dirtyFlagSupplierMap.put(ctrl_l8_n5, () -> isDirty_ctrl_l8_n5);
      dirtyFlagSupplierMap.put(ctrl_l8_n6, () -> isDirty_ctrl_l8_n6);
      dirtyFlagSupplierMap.put(ctrl_l8_n7, () -> isDirty_ctrl_l8_n7);
      dirtyFlagSupplierMap.put(ctrl_l8_n8, () -> isDirty_ctrl_l8_n8);
      dirtyFlagSupplierMap.put(ctrl_l8_n9, () -> isDirty_ctrl_l8_n9);
      dirtyFlagSupplierMap.put(ctrl_l9_n0, () -> isDirty_ctrl_l9_n0);
      dirtyFlagSupplierMap.put(ctrl_l9_n1, () -> isDirty_ctrl_l9_n1);
      dirtyFlagSupplierMap.put(ctrl_l9_n2, () -> isDirty_ctrl_l9_n2);
      dirtyFlagSupplierMap.put(ctrl_root, () -> isDirty_ctrl_root);
      dirtyFlagSupplierMap.put(md_l10_n0, () -> isDirty_md_l10_n0);
      dirtyFlagSupplierMap.put(md_l10_n1, () -> isDirty_md_l10_n1);
      dirtyFlagSupplierMap.put(md_l10_n2, () -> isDirty_md_l10_n2);
      dirtyFlagSupplierMap.put(md_l10_n3, () -> isDirty_md_l10_n3);
      dirtyFlagSupplierMap.put(md_l10_n4, () -> isDirty_md_l10_n4);
      dirtyFlagSupplierMap.put(md_l1_n0, () -> isDirty_md_l1_n0);
      dirtyFlagSupplierMap.put(md_l1_n1, () -> isDirty_md_l1_n1);
      dirtyFlagSupplierMap.put(md_l1_n2, () -> isDirty_md_l1_n2);
      dirtyFlagSupplierMap.put(md_l1_n3, () -> isDirty_md_l1_n3);
      dirtyFlagSupplierMap.put(md_l1_n4, () -> isDirty_md_l1_n4);
      dirtyFlagSupplierMap.put(md_l1_n5, () -> isDirty_md_l1_n5);
      dirtyFlagSupplierMap.put(md_l1_n6, () -> isDirty_md_l1_n6);
      dirtyFlagSupplierMap.put(md_l1_n7, () -> isDirty_md_l1_n7);
      dirtyFlagSupplierMap.put(md_l1_n8, () -> isDirty_md_l1_n8);
      dirtyFlagSupplierMap.put(md_l1_n9, () -> isDirty_md_l1_n9);
      dirtyFlagSupplierMap.put(md_l2_n0, () -> isDirty_md_l2_n0);
      dirtyFlagSupplierMap.put(md_l2_n1, () -> isDirty_md_l2_n1);
      dirtyFlagSupplierMap.put(md_l2_n2, () -> isDirty_md_l2_n2);
      dirtyFlagSupplierMap.put(md_l2_n3, () -> isDirty_md_l2_n3);
      dirtyFlagSupplierMap.put(md_l2_n4, () -> isDirty_md_l2_n4);
      dirtyFlagSupplierMap.put(md_l2_n5, () -> isDirty_md_l2_n5);
      dirtyFlagSupplierMap.put(md_l2_n6, () -> isDirty_md_l2_n6);
      dirtyFlagSupplierMap.put(md_l2_n7, () -> isDirty_md_l2_n7);
      dirtyFlagSupplierMap.put(md_l2_n8, () -> isDirty_md_l2_n8);
      dirtyFlagSupplierMap.put(md_l2_n9, () -> isDirty_md_l2_n9);
      dirtyFlagSupplierMap.put(md_l3_n0, () -> isDirty_md_l3_n0);
      dirtyFlagSupplierMap.put(md_l3_n1, () -> isDirty_md_l3_n1);
      dirtyFlagSupplierMap.put(md_l3_n2, () -> isDirty_md_l3_n2);
      dirtyFlagSupplierMap.put(md_l3_n3, () -> isDirty_md_l3_n3);
      dirtyFlagSupplierMap.put(md_l3_n4, () -> isDirty_md_l3_n4);
      dirtyFlagSupplierMap.put(md_l3_n5, () -> isDirty_md_l3_n5);
      dirtyFlagSupplierMap.put(md_l3_n6, () -> isDirty_md_l3_n6);
      dirtyFlagSupplierMap.put(md_l3_n7, () -> isDirty_md_l3_n7);
      dirtyFlagSupplierMap.put(md_l3_n8, () -> isDirty_md_l3_n8);
      dirtyFlagSupplierMap.put(md_l3_n9, () -> isDirty_md_l3_n9);
      dirtyFlagSupplierMap.put(md_l4_n0, () -> isDirty_md_l4_n0);
      dirtyFlagSupplierMap.put(md_l4_n1, () -> isDirty_md_l4_n1);
      dirtyFlagSupplierMap.put(md_l4_n2, () -> isDirty_md_l4_n2);
      dirtyFlagSupplierMap.put(md_l4_n3, () -> isDirty_md_l4_n3);
      dirtyFlagSupplierMap.put(md_l4_n4, () -> isDirty_md_l4_n4);
      dirtyFlagSupplierMap.put(md_l4_n5, () -> isDirty_md_l4_n5);
      dirtyFlagSupplierMap.put(md_l4_n6, () -> isDirty_md_l4_n6);
      dirtyFlagSupplierMap.put(md_l4_n7, () -> isDirty_md_l4_n7);
      dirtyFlagSupplierMap.put(md_l4_n8, () -> isDirty_md_l4_n8);
      dirtyFlagSupplierMap.put(md_l4_n9, () -> isDirty_md_l4_n9);
      dirtyFlagSupplierMap.put(md_l5_n0, () -> isDirty_md_l5_n0);
      dirtyFlagSupplierMap.put(md_l5_n1, () -> isDirty_md_l5_n1);
      dirtyFlagSupplierMap.put(md_l5_n2, () -> isDirty_md_l5_n2);
      dirtyFlagSupplierMap.put(md_l5_n3, () -> isDirty_md_l5_n3);
      dirtyFlagSupplierMap.put(md_l5_n4, () -> isDirty_md_l5_n4);
      dirtyFlagSupplierMap.put(md_l5_n5, () -> isDirty_md_l5_n5);
      dirtyFlagSupplierMap.put(md_l5_n6, () -> isDirty_md_l5_n6);
      dirtyFlagSupplierMap.put(md_l5_n7, () -> isDirty_md_l5_n7);
      dirtyFlagSupplierMap.put(md_l5_n8, () -> isDirty_md_l5_n8);
      dirtyFlagSupplierMap.put(md_l5_n9, () -> isDirty_md_l5_n9);
      dirtyFlagSupplierMap.put(md_l6_n0, () -> isDirty_md_l6_n0);
      dirtyFlagSupplierMap.put(md_l6_n1, () -> isDirty_md_l6_n1);
      dirtyFlagSupplierMap.put(md_l6_n2, () -> isDirty_md_l6_n2);
      dirtyFlagSupplierMap.put(md_l6_n3, () -> isDirty_md_l6_n3);
      dirtyFlagSupplierMap.put(md_l6_n4, () -> isDirty_md_l6_n4);
      dirtyFlagSupplierMap.put(md_l6_n5, () -> isDirty_md_l6_n5);
      dirtyFlagSupplierMap.put(md_l6_n6, () -> isDirty_md_l6_n6);
      dirtyFlagSupplierMap.put(md_l6_n7, () -> isDirty_md_l6_n7);
      dirtyFlagSupplierMap.put(md_l6_n8, () -> isDirty_md_l6_n8);
      dirtyFlagSupplierMap.put(md_l6_n9, () -> isDirty_md_l6_n9);
      dirtyFlagSupplierMap.put(md_l7_n0, () -> isDirty_md_l7_n0);
      dirtyFlagSupplierMap.put(md_l7_n1, () -> isDirty_md_l7_n1);
      dirtyFlagSupplierMap.put(md_l7_n2, () -> isDirty_md_l7_n2);
      dirtyFlagSupplierMap.put(md_l7_n3, () -> isDirty_md_l7_n3);
      dirtyFlagSupplierMap.put(md_l7_n4, () -> isDirty_md_l7_n4);
      dirtyFlagSupplierMap.put(md_l7_n5, () -> isDirty_md_l7_n5);
      dirtyFlagSupplierMap.put(md_l7_n6, () -> isDirty_md_l7_n6);
      dirtyFlagSupplierMap.put(md_l7_n7, () -> isDirty_md_l7_n7);
      dirtyFlagSupplierMap.put(md_l7_n8, () -> isDirty_md_l7_n8);
      dirtyFlagSupplierMap.put(md_l7_n9, () -> isDirty_md_l7_n9);
      dirtyFlagSupplierMap.put(md_l8_n0, () -> isDirty_md_l8_n0);
      dirtyFlagSupplierMap.put(md_l8_n1, () -> isDirty_md_l8_n1);
      dirtyFlagSupplierMap.put(md_l8_n2, () -> isDirty_md_l8_n2);
      dirtyFlagSupplierMap.put(md_l8_n3, () -> isDirty_md_l8_n3);
      dirtyFlagSupplierMap.put(md_l8_n4, () -> isDirty_md_l8_n4);
      dirtyFlagSupplierMap.put(md_l8_n5, () -> isDirty_md_l8_n5);
      dirtyFlagSupplierMap.put(md_l8_n6, () -> isDirty_md_l8_n6);
      dirtyFlagSupplierMap.put(md_l8_n7, () -> isDirty_md_l8_n7);
      dirtyFlagSupplierMap.put(md_l8_n8, () -> isDirty_md_l8_n8);
      dirtyFlagSupplierMap.put(md_l8_n9, () -> isDirty_md_l8_n9);
      dirtyFlagSupplierMap.put(md_l9_n0, () -> isDirty_md_l9_n0);
      dirtyFlagSupplierMap.put(md_l9_n1, () -> isDirty_md_l9_n1);
      dirtyFlagSupplierMap.put(md_l9_n2, () -> isDirty_md_l9_n2);
      dirtyFlagSupplierMap.put(md_l9_n3, () -> isDirty_md_l9_n3);
      dirtyFlagSupplierMap.put(md_l9_n4, () -> isDirty_md_l9_n4);
      dirtyFlagSupplierMap.put(md_l9_n5, () -> isDirty_md_l9_n5);
      dirtyFlagSupplierMap.put(md_l9_n6, () -> isDirty_md_l9_n6);
      dirtyFlagSupplierMap.put(md_l9_n7, () -> isDirty_md_l9_n7);
      dirtyFlagSupplierMap.put(md_l9_n8, () -> isDirty_md_l9_n8);
      dirtyFlagSupplierMap.put(md_l9_n9, () -> isDirty_md_l9_n9);
      dirtyFlagSupplierMap.put(md_root, () -> isDirty_md_root);
      dirtyFlagSupplierMap.put(md_sink, () -> isDirty_md_sink);
      dirtyFlagSupplierMap.put(ts_l1_n0, () -> isDirty_ts_l1_n0);
      dirtyFlagSupplierMap.put(ts_l1_n1, () -> isDirty_ts_l1_n1);
      dirtyFlagSupplierMap.put(ts_l1_n2, () -> isDirty_ts_l1_n2);
      dirtyFlagSupplierMap.put(ts_l1_n3, () -> isDirty_ts_l1_n3);
      dirtyFlagSupplierMap.put(ts_l1_n4, () -> isDirty_ts_l1_n4);
      dirtyFlagSupplierMap.put(ts_l1_n5, () -> isDirty_ts_l1_n5);
      dirtyFlagSupplierMap.put(ts_l1_n6, () -> isDirty_ts_l1_n6);
      dirtyFlagSupplierMap.put(ts_l1_n7, () -> isDirty_ts_l1_n7);
      dirtyFlagSupplierMap.put(ts_l1_n8, () -> isDirty_ts_l1_n8);
      dirtyFlagSupplierMap.put(ts_l1_n9, () -> isDirty_ts_l1_n9);
      dirtyFlagSupplierMap.put(ts_l2_n0, () -> isDirty_ts_l2_n0);
      dirtyFlagSupplierMap.put(ts_l2_n1, () -> isDirty_ts_l2_n1);
      dirtyFlagSupplierMap.put(ts_l2_n2, () -> isDirty_ts_l2_n2);
      dirtyFlagSupplierMap.put(ts_l2_n3, () -> isDirty_ts_l2_n3);
      dirtyFlagSupplierMap.put(ts_l2_n4, () -> isDirty_ts_l2_n4);
      dirtyFlagSupplierMap.put(ts_l2_n5, () -> isDirty_ts_l2_n5);
      dirtyFlagSupplierMap.put(ts_l2_n6, () -> isDirty_ts_l2_n6);
      dirtyFlagSupplierMap.put(ts_l2_n7, () -> isDirty_ts_l2_n7);
      dirtyFlagSupplierMap.put(ts_l2_n8, () -> isDirty_ts_l2_n8);
      dirtyFlagSupplierMap.put(ts_l2_n9, () -> isDirty_ts_l2_n9);
      dirtyFlagSupplierMap.put(ts_l3_n0, () -> isDirty_ts_l3_n0);
      dirtyFlagSupplierMap.put(ts_l3_n1, () -> isDirty_ts_l3_n1);
      dirtyFlagSupplierMap.put(ts_l3_n2, () -> isDirty_ts_l3_n2);
      dirtyFlagSupplierMap.put(ts_l3_n3, () -> isDirty_ts_l3_n3);
      dirtyFlagSupplierMap.put(ts_l3_n4, () -> isDirty_ts_l3_n4);
      dirtyFlagSupplierMap.put(ts_l3_n5, () -> isDirty_ts_l3_n5);
      dirtyFlagSupplierMap.put(ts_l3_n6, () -> isDirty_ts_l3_n6);
      dirtyFlagSupplierMap.put(ts_l3_n7, () -> isDirty_ts_l3_n7);
      dirtyFlagSupplierMap.put(ts_l3_n8, () -> isDirty_ts_l3_n8);
      dirtyFlagSupplierMap.put(ts_l3_n9, () -> isDirty_ts_l3_n9);
      dirtyFlagSupplierMap.put(ts_l4_n0, () -> isDirty_ts_l4_n0);
      dirtyFlagSupplierMap.put(ts_l4_n1, () -> isDirty_ts_l4_n1);
      dirtyFlagSupplierMap.put(ts_l4_n2, () -> isDirty_ts_l4_n2);
      dirtyFlagSupplierMap.put(ts_l4_n3, () -> isDirty_ts_l4_n3);
      dirtyFlagSupplierMap.put(ts_l4_n4, () -> isDirty_ts_l4_n4);
      dirtyFlagSupplierMap.put(ts_l4_n5, () -> isDirty_ts_l4_n5);
      dirtyFlagSupplierMap.put(ts_l4_n6, () -> isDirty_ts_l4_n6);
      dirtyFlagSupplierMap.put(ts_l4_n7, () -> isDirty_ts_l4_n7);
      dirtyFlagSupplierMap.put(ts_l4_n8, () -> isDirty_ts_l4_n8);
      dirtyFlagSupplierMap.put(ts_l4_n9, () -> isDirty_ts_l4_n9);
      dirtyFlagSupplierMap.put(ts_l5_n0, () -> isDirty_ts_l5_n0);
      dirtyFlagSupplierMap.put(ts_l5_n1, () -> isDirty_ts_l5_n1);
      dirtyFlagSupplierMap.put(ts_l5_n2, () -> isDirty_ts_l5_n2);
      dirtyFlagSupplierMap.put(ts_l5_n3, () -> isDirty_ts_l5_n3);
      dirtyFlagSupplierMap.put(ts_l5_n4, () -> isDirty_ts_l5_n4);
      dirtyFlagSupplierMap.put(ts_l5_n5, () -> isDirty_ts_l5_n5);
      dirtyFlagSupplierMap.put(ts_l5_n6, () -> isDirty_ts_l5_n6);
      dirtyFlagSupplierMap.put(ts_l5_n7, () -> isDirty_ts_l5_n7);
      dirtyFlagSupplierMap.put(ts_l5_n8, () -> isDirty_ts_l5_n8);
      dirtyFlagSupplierMap.put(ts_l5_n9, () -> isDirty_ts_l5_n9);
      dirtyFlagSupplierMap.put(ts_l6_n0, () -> isDirty_ts_l6_n0);
      dirtyFlagSupplierMap.put(ts_l6_n1, () -> isDirty_ts_l6_n1);
      dirtyFlagSupplierMap.put(ts_l6_n2, () -> isDirty_ts_l6_n2);
      dirtyFlagSupplierMap.put(ts_l6_n3, () -> isDirty_ts_l6_n3);
      dirtyFlagSupplierMap.put(ts_l6_n4, () -> isDirty_ts_l6_n4);
      dirtyFlagSupplierMap.put(ts_l6_n5, () -> isDirty_ts_l6_n5);
      dirtyFlagSupplierMap.put(ts_l6_n6, () -> isDirty_ts_l6_n6);
      dirtyFlagSupplierMap.put(ts_l6_n7, () -> isDirty_ts_l6_n7);
      dirtyFlagSupplierMap.put(ts_l6_n8, () -> isDirty_ts_l6_n8);
      dirtyFlagSupplierMap.put(ts_l6_n9, () -> isDirty_ts_l6_n9);
      dirtyFlagSupplierMap.put(ts_l7_n0, () -> isDirty_ts_l7_n0);
      dirtyFlagSupplierMap.put(ts_l7_n1, () -> isDirty_ts_l7_n1);
      dirtyFlagSupplierMap.put(ts_l7_n2, () -> isDirty_ts_l7_n2);
      dirtyFlagSupplierMap.put(ts_l7_n3, () -> isDirty_ts_l7_n3);
      dirtyFlagSupplierMap.put(ts_l7_n4, () -> isDirty_ts_l7_n4);
      dirtyFlagSupplierMap.put(ts_l7_n5, () -> isDirty_ts_l7_n5);
      dirtyFlagSupplierMap.put(ts_l7_n6, () -> isDirty_ts_l7_n6);
      dirtyFlagSupplierMap.put(ts_l7_n7, () -> isDirty_ts_l7_n7);
      dirtyFlagSupplierMap.put(ts_l7_n8, () -> isDirty_ts_l7_n8);
      dirtyFlagSupplierMap.put(ts_l7_n9, () -> isDirty_ts_l7_n9);
      dirtyFlagSupplierMap.put(ts_l8_n0, () -> isDirty_ts_l8_n0);
      dirtyFlagSupplierMap.put(ts_l8_n1, () -> isDirty_ts_l8_n1);
      dirtyFlagSupplierMap.put(ts_l8_n2, () -> isDirty_ts_l8_n2);
      dirtyFlagSupplierMap.put(ts_l8_n3, () -> isDirty_ts_l8_n3);
      dirtyFlagSupplierMap.put(ts_l8_n4, () -> isDirty_ts_l8_n4);
      dirtyFlagSupplierMap.put(ts_l8_n5, () -> isDirty_ts_l8_n5);
      dirtyFlagSupplierMap.put(ts_l8_n6, () -> isDirty_ts_l8_n6);
      dirtyFlagSupplierMap.put(ts_l8_n7, () -> isDirty_ts_l8_n7);
      dirtyFlagSupplierMap.put(ts_l8_n8, () -> isDirty_ts_l8_n8);
      dirtyFlagSupplierMap.put(ts_l8_n9, () -> isDirty_ts_l8_n9);
      dirtyFlagSupplierMap.put(ts_l9_n0, () -> isDirty_ts_l9_n0);
      dirtyFlagSupplierMap.put(ts_l9_n1, () -> isDirty_ts_l9_n1);
      dirtyFlagSupplierMap.put(ts_l9_n2, () -> isDirty_ts_l9_n2);
      dirtyFlagSupplierMap.put(ts_l9_n3, () -> isDirty_ts_l9_n3);
      dirtyFlagSupplierMap.put(ts_l9_n4, () -> isDirty_ts_l9_n4);
      dirtyFlagSupplierMap.put(ts_root, () -> isDirty_ts_root);
      dirtyFlagSupplierMap.put(ts_sink, () -> isDirty_ts_sink);
    }
    return dirtyFlagSupplierMap.getOrDefault(node, DataFlow.ALWAYS_FALSE);
  }

  @Override
  public void setDirty(Object node, boolean dirtyFlag) {
    if (dirtyFlagUpdateMap.isEmpty()) {
      dirtyFlagUpdateMap.put(ctrl_l1_n0, (b) -> isDirty_ctrl_l1_n0 = b);
      dirtyFlagUpdateMap.put(ctrl_l1_n1, (b) -> isDirty_ctrl_l1_n1 = b);
      dirtyFlagUpdateMap.put(ctrl_l1_n2, (b) -> isDirty_ctrl_l1_n2 = b);
      dirtyFlagUpdateMap.put(ctrl_l1_n3, (b) -> isDirty_ctrl_l1_n3 = b);
      dirtyFlagUpdateMap.put(ctrl_l1_n4, (b) -> isDirty_ctrl_l1_n4 = b);
      dirtyFlagUpdateMap.put(ctrl_l1_n5, (b) -> isDirty_ctrl_l1_n5 = b);
      dirtyFlagUpdateMap.put(ctrl_l1_n6, (b) -> isDirty_ctrl_l1_n6 = b);
      dirtyFlagUpdateMap.put(ctrl_l1_n7, (b) -> isDirty_ctrl_l1_n7 = b);
      dirtyFlagUpdateMap.put(ctrl_l1_n8, (b) -> isDirty_ctrl_l1_n8 = b);
      dirtyFlagUpdateMap.put(ctrl_l1_n9, (b) -> isDirty_ctrl_l1_n9 = b);
      dirtyFlagUpdateMap.put(ctrl_l2_n0, (b) -> isDirty_ctrl_l2_n0 = b);
      dirtyFlagUpdateMap.put(ctrl_l2_n1, (b) -> isDirty_ctrl_l2_n1 = b);
      dirtyFlagUpdateMap.put(ctrl_l2_n2, (b) -> isDirty_ctrl_l2_n2 = b);
      dirtyFlagUpdateMap.put(ctrl_l2_n3, (b) -> isDirty_ctrl_l2_n3 = b);
      dirtyFlagUpdateMap.put(ctrl_l2_n4, (b) -> isDirty_ctrl_l2_n4 = b);
      dirtyFlagUpdateMap.put(ctrl_l2_n5, (b) -> isDirty_ctrl_l2_n5 = b);
      dirtyFlagUpdateMap.put(ctrl_l2_n6, (b) -> isDirty_ctrl_l2_n6 = b);
      dirtyFlagUpdateMap.put(ctrl_l2_n7, (b) -> isDirty_ctrl_l2_n7 = b);
      dirtyFlagUpdateMap.put(ctrl_l2_n8, (b) -> isDirty_ctrl_l2_n8 = b);
      dirtyFlagUpdateMap.put(ctrl_l2_n9, (b) -> isDirty_ctrl_l2_n9 = b);
      dirtyFlagUpdateMap.put(ctrl_l3_n0, (b) -> isDirty_ctrl_l3_n0 = b);
      dirtyFlagUpdateMap.put(ctrl_l3_n1, (b) -> isDirty_ctrl_l3_n1 = b);
      dirtyFlagUpdateMap.put(ctrl_l3_n2, (b) -> isDirty_ctrl_l3_n2 = b);
      dirtyFlagUpdateMap.put(ctrl_l3_n3, (b) -> isDirty_ctrl_l3_n3 = b);
      dirtyFlagUpdateMap.put(ctrl_l3_n4, (b) -> isDirty_ctrl_l3_n4 = b);
      dirtyFlagUpdateMap.put(ctrl_l3_n5, (b) -> isDirty_ctrl_l3_n5 = b);
      dirtyFlagUpdateMap.put(ctrl_l3_n6, (b) -> isDirty_ctrl_l3_n6 = b);
      dirtyFlagUpdateMap.put(ctrl_l3_n7, (b) -> isDirty_ctrl_l3_n7 = b);
      dirtyFlagUpdateMap.put(ctrl_l3_n8, (b) -> isDirty_ctrl_l3_n8 = b);
      dirtyFlagUpdateMap.put(ctrl_l3_n9, (b) -> isDirty_ctrl_l3_n9 = b);
      dirtyFlagUpdateMap.put(ctrl_l4_n0, (b) -> isDirty_ctrl_l4_n0 = b);
      dirtyFlagUpdateMap.put(ctrl_l4_n1, (b) -> isDirty_ctrl_l4_n1 = b);
      dirtyFlagUpdateMap.put(ctrl_l4_n2, (b) -> isDirty_ctrl_l4_n2 = b);
      dirtyFlagUpdateMap.put(ctrl_l4_n3, (b) -> isDirty_ctrl_l4_n3 = b);
      dirtyFlagUpdateMap.put(ctrl_l4_n4, (b) -> isDirty_ctrl_l4_n4 = b);
      dirtyFlagUpdateMap.put(ctrl_l4_n5, (b) -> isDirty_ctrl_l4_n5 = b);
      dirtyFlagUpdateMap.put(ctrl_l4_n6, (b) -> isDirty_ctrl_l4_n6 = b);
      dirtyFlagUpdateMap.put(ctrl_l4_n7, (b) -> isDirty_ctrl_l4_n7 = b);
      dirtyFlagUpdateMap.put(ctrl_l4_n8, (b) -> isDirty_ctrl_l4_n8 = b);
      dirtyFlagUpdateMap.put(ctrl_l4_n9, (b) -> isDirty_ctrl_l4_n9 = b);
      dirtyFlagUpdateMap.put(ctrl_l5_n0, (b) -> isDirty_ctrl_l5_n0 = b);
      dirtyFlagUpdateMap.put(ctrl_l5_n1, (b) -> isDirty_ctrl_l5_n1 = b);
      dirtyFlagUpdateMap.put(ctrl_l5_n2, (b) -> isDirty_ctrl_l5_n2 = b);
      dirtyFlagUpdateMap.put(ctrl_l5_n3, (b) -> isDirty_ctrl_l5_n3 = b);
      dirtyFlagUpdateMap.put(ctrl_l5_n4, (b) -> isDirty_ctrl_l5_n4 = b);
      dirtyFlagUpdateMap.put(ctrl_l5_n5, (b) -> isDirty_ctrl_l5_n5 = b);
      dirtyFlagUpdateMap.put(ctrl_l5_n6, (b) -> isDirty_ctrl_l5_n6 = b);
      dirtyFlagUpdateMap.put(ctrl_l5_n7, (b) -> isDirty_ctrl_l5_n7 = b);
      dirtyFlagUpdateMap.put(ctrl_l5_n8, (b) -> isDirty_ctrl_l5_n8 = b);
      dirtyFlagUpdateMap.put(ctrl_l5_n9, (b) -> isDirty_ctrl_l5_n9 = b);
      dirtyFlagUpdateMap.put(ctrl_l6_n0, (b) -> isDirty_ctrl_l6_n0 = b);
      dirtyFlagUpdateMap.put(ctrl_l6_n1, (b) -> isDirty_ctrl_l6_n1 = b);
      dirtyFlagUpdateMap.put(ctrl_l6_n2, (b) -> isDirty_ctrl_l6_n2 = b);
      dirtyFlagUpdateMap.put(ctrl_l6_n3, (b) -> isDirty_ctrl_l6_n3 = b);
      dirtyFlagUpdateMap.put(ctrl_l6_n4, (b) -> isDirty_ctrl_l6_n4 = b);
      dirtyFlagUpdateMap.put(ctrl_l6_n5, (b) -> isDirty_ctrl_l6_n5 = b);
      dirtyFlagUpdateMap.put(ctrl_l6_n6, (b) -> isDirty_ctrl_l6_n6 = b);
      dirtyFlagUpdateMap.put(ctrl_l6_n7, (b) -> isDirty_ctrl_l6_n7 = b);
      dirtyFlagUpdateMap.put(ctrl_l6_n8, (b) -> isDirty_ctrl_l6_n8 = b);
      dirtyFlagUpdateMap.put(ctrl_l6_n9, (b) -> isDirty_ctrl_l6_n9 = b);
      dirtyFlagUpdateMap.put(ctrl_l7_n0, (b) -> isDirty_ctrl_l7_n0 = b);
      dirtyFlagUpdateMap.put(ctrl_l7_n1, (b) -> isDirty_ctrl_l7_n1 = b);
      dirtyFlagUpdateMap.put(ctrl_l7_n2, (b) -> isDirty_ctrl_l7_n2 = b);
      dirtyFlagUpdateMap.put(ctrl_l7_n3, (b) -> isDirty_ctrl_l7_n3 = b);
      dirtyFlagUpdateMap.put(ctrl_l7_n4, (b) -> isDirty_ctrl_l7_n4 = b);
      dirtyFlagUpdateMap.put(ctrl_l7_n5, (b) -> isDirty_ctrl_l7_n5 = b);
      dirtyFlagUpdateMap.put(ctrl_l7_n6, (b) -> isDirty_ctrl_l7_n6 = b);
      dirtyFlagUpdateMap.put(ctrl_l7_n7, (b) -> isDirty_ctrl_l7_n7 = b);
      dirtyFlagUpdateMap.put(ctrl_l7_n8, (b) -> isDirty_ctrl_l7_n8 = b);
      dirtyFlagUpdateMap.put(ctrl_l7_n9, (b) -> isDirty_ctrl_l7_n9 = b);
      dirtyFlagUpdateMap.put(ctrl_l8_n0, (b) -> isDirty_ctrl_l8_n0 = b);
      dirtyFlagUpdateMap.put(ctrl_l8_n1, (b) -> isDirty_ctrl_l8_n1 = b);
      dirtyFlagUpdateMap.put(ctrl_l8_n2, (b) -> isDirty_ctrl_l8_n2 = b);
      dirtyFlagUpdateMap.put(ctrl_l8_n3, (b) -> isDirty_ctrl_l8_n3 = b);
      dirtyFlagUpdateMap.put(ctrl_l8_n4, (b) -> isDirty_ctrl_l8_n4 = b);
      dirtyFlagUpdateMap.put(ctrl_l8_n5, (b) -> isDirty_ctrl_l8_n5 = b);
      dirtyFlagUpdateMap.put(ctrl_l8_n6, (b) -> isDirty_ctrl_l8_n6 = b);
      dirtyFlagUpdateMap.put(ctrl_l8_n7, (b) -> isDirty_ctrl_l8_n7 = b);
      dirtyFlagUpdateMap.put(ctrl_l8_n8, (b) -> isDirty_ctrl_l8_n8 = b);
      dirtyFlagUpdateMap.put(ctrl_l8_n9, (b) -> isDirty_ctrl_l8_n9 = b);
      dirtyFlagUpdateMap.put(ctrl_l9_n0, (b) -> isDirty_ctrl_l9_n0 = b);
      dirtyFlagUpdateMap.put(ctrl_l9_n1, (b) -> isDirty_ctrl_l9_n1 = b);
      dirtyFlagUpdateMap.put(ctrl_l9_n2, (b) -> isDirty_ctrl_l9_n2 = b);
      dirtyFlagUpdateMap.put(ctrl_root, (b) -> isDirty_ctrl_root = b);
      dirtyFlagUpdateMap.put(md_l10_n0, (b) -> isDirty_md_l10_n0 = b);
      dirtyFlagUpdateMap.put(md_l10_n1, (b) -> isDirty_md_l10_n1 = b);
      dirtyFlagUpdateMap.put(md_l10_n2, (b) -> isDirty_md_l10_n2 = b);
      dirtyFlagUpdateMap.put(md_l10_n3, (b) -> isDirty_md_l10_n3 = b);
      dirtyFlagUpdateMap.put(md_l10_n4, (b) -> isDirty_md_l10_n4 = b);
      dirtyFlagUpdateMap.put(md_l1_n0, (b) -> isDirty_md_l1_n0 = b);
      dirtyFlagUpdateMap.put(md_l1_n1, (b) -> isDirty_md_l1_n1 = b);
      dirtyFlagUpdateMap.put(md_l1_n2, (b) -> isDirty_md_l1_n2 = b);
      dirtyFlagUpdateMap.put(md_l1_n3, (b) -> isDirty_md_l1_n3 = b);
      dirtyFlagUpdateMap.put(md_l1_n4, (b) -> isDirty_md_l1_n4 = b);
      dirtyFlagUpdateMap.put(md_l1_n5, (b) -> isDirty_md_l1_n5 = b);
      dirtyFlagUpdateMap.put(md_l1_n6, (b) -> isDirty_md_l1_n6 = b);
      dirtyFlagUpdateMap.put(md_l1_n7, (b) -> isDirty_md_l1_n7 = b);
      dirtyFlagUpdateMap.put(md_l1_n8, (b) -> isDirty_md_l1_n8 = b);
      dirtyFlagUpdateMap.put(md_l1_n9, (b) -> isDirty_md_l1_n9 = b);
      dirtyFlagUpdateMap.put(md_l2_n0, (b) -> isDirty_md_l2_n0 = b);
      dirtyFlagUpdateMap.put(md_l2_n1, (b) -> isDirty_md_l2_n1 = b);
      dirtyFlagUpdateMap.put(md_l2_n2, (b) -> isDirty_md_l2_n2 = b);
      dirtyFlagUpdateMap.put(md_l2_n3, (b) -> isDirty_md_l2_n3 = b);
      dirtyFlagUpdateMap.put(md_l2_n4, (b) -> isDirty_md_l2_n4 = b);
      dirtyFlagUpdateMap.put(md_l2_n5, (b) -> isDirty_md_l2_n5 = b);
      dirtyFlagUpdateMap.put(md_l2_n6, (b) -> isDirty_md_l2_n6 = b);
      dirtyFlagUpdateMap.put(md_l2_n7, (b) -> isDirty_md_l2_n7 = b);
      dirtyFlagUpdateMap.put(md_l2_n8, (b) -> isDirty_md_l2_n8 = b);
      dirtyFlagUpdateMap.put(md_l2_n9, (b) -> isDirty_md_l2_n9 = b);
      dirtyFlagUpdateMap.put(md_l3_n0, (b) -> isDirty_md_l3_n0 = b);
      dirtyFlagUpdateMap.put(md_l3_n1, (b) -> isDirty_md_l3_n1 = b);
      dirtyFlagUpdateMap.put(md_l3_n2, (b) -> isDirty_md_l3_n2 = b);
      dirtyFlagUpdateMap.put(md_l3_n3, (b) -> isDirty_md_l3_n3 = b);
      dirtyFlagUpdateMap.put(md_l3_n4, (b) -> isDirty_md_l3_n4 = b);
      dirtyFlagUpdateMap.put(md_l3_n5, (b) -> isDirty_md_l3_n5 = b);
      dirtyFlagUpdateMap.put(md_l3_n6, (b) -> isDirty_md_l3_n6 = b);
      dirtyFlagUpdateMap.put(md_l3_n7, (b) -> isDirty_md_l3_n7 = b);
      dirtyFlagUpdateMap.put(md_l3_n8, (b) -> isDirty_md_l3_n8 = b);
      dirtyFlagUpdateMap.put(md_l3_n9, (b) -> isDirty_md_l3_n9 = b);
      dirtyFlagUpdateMap.put(md_l4_n0, (b) -> isDirty_md_l4_n0 = b);
      dirtyFlagUpdateMap.put(md_l4_n1, (b) -> isDirty_md_l4_n1 = b);
      dirtyFlagUpdateMap.put(md_l4_n2, (b) -> isDirty_md_l4_n2 = b);
      dirtyFlagUpdateMap.put(md_l4_n3, (b) -> isDirty_md_l4_n3 = b);
      dirtyFlagUpdateMap.put(md_l4_n4, (b) -> isDirty_md_l4_n4 = b);
      dirtyFlagUpdateMap.put(md_l4_n5, (b) -> isDirty_md_l4_n5 = b);
      dirtyFlagUpdateMap.put(md_l4_n6, (b) -> isDirty_md_l4_n6 = b);
      dirtyFlagUpdateMap.put(md_l4_n7, (b) -> isDirty_md_l4_n7 = b);
      dirtyFlagUpdateMap.put(md_l4_n8, (b) -> isDirty_md_l4_n8 = b);
      dirtyFlagUpdateMap.put(md_l4_n9, (b) -> isDirty_md_l4_n9 = b);
      dirtyFlagUpdateMap.put(md_l5_n0, (b) -> isDirty_md_l5_n0 = b);
      dirtyFlagUpdateMap.put(md_l5_n1, (b) -> isDirty_md_l5_n1 = b);
      dirtyFlagUpdateMap.put(md_l5_n2, (b) -> isDirty_md_l5_n2 = b);
      dirtyFlagUpdateMap.put(md_l5_n3, (b) -> isDirty_md_l5_n3 = b);
      dirtyFlagUpdateMap.put(md_l5_n4, (b) -> isDirty_md_l5_n4 = b);
      dirtyFlagUpdateMap.put(md_l5_n5, (b) -> isDirty_md_l5_n5 = b);
      dirtyFlagUpdateMap.put(md_l5_n6, (b) -> isDirty_md_l5_n6 = b);
      dirtyFlagUpdateMap.put(md_l5_n7, (b) -> isDirty_md_l5_n7 = b);
      dirtyFlagUpdateMap.put(md_l5_n8, (b) -> isDirty_md_l5_n8 = b);
      dirtyFlagUpdateMap.put(md_l5_n9, (b) -> isDirty_md_l5_n9 = b);
      dirtyFlagUpdateMap.put(md_l6_n0, (b) -> isDirty_md_l6_n0 = b);
      dirtyFlagUpdateMap.put(md_l6_n1, (b) -> isDirty_md_l6_n1 = b);
      dirtyFlagUpdateMap.put(md_l6_n2, (b) -> isDirty_md_l6_n2 = b);
      dirtyFlagUpdateMap.put(md_l6_n3, (b) -> isDirty_md_l6_n3 = b);
      dirtyFlagUpdateMap.put(md_l6_n4, (b) -> isDirty_md_l6_n4 = b);
      dirtyFlagUpdateMap.put(md_l6_n5, (b) -> isDirty_md_l6_n5 = b);
      dirtyFlagUpdateMap.put(md_l6_n6, (b) -> isDirty_md_l6_n6 = b);
      dirtyFlagUpdateMap.put(md_l6_n7, (b) -> isDirty_md_l6_n7 = b);
      dirtyFlagUpdateMap.put(md_l6_n8, (b) -> isDirty_md_l6_n8 = b);
      dirtyFlagUpdateMap.put(md_l6_n9, (b) -> isDirty_md_l6_n9 = b);
      dirtyFlagUpdateMap.put(md_l7_n0, (b) -> isDirty_md_l7_n0 = b);
      dirtyFlagUpdateMap.put(md_l7_n1, (b) -> isDirty_md_l7_n1 = b);
      dirtyFlagUpdateMap.put(md_l7_n2, (b) -> isDirty_md_l7_n2 = b);
      dirtyFlagUpdateMap.put(md_l7_n3, (b) -> isDirty_md_l7_n3 = b);
      dirtyFlagUpdateMap.put(md_l7_n4, (b) -> isDirty_md_l7_n4 = b);
      dirtyFlagUpdateMap.put(md_l7_n5, (b) -> isDirty_md_l7_n5 = b);
      dirtyFlagUpdateMap.put(md_l7_n6, (b) -> isDirty_md_l7_n6 = b);
      dirtyFlagUpdateMap.put(md_l7_n7, (b) -> isDirty_md_l7_n7 = b);
      dirtyFlagUpdateMap.put(md_l7_n8, (b) -> isDirty_md_l7_n8 = b);
      dirtyFlagUpdateMap.put(md_l7_n9, (b) -> isDirty_md_l7_n9 = b);
      dirtyFlagUpdateMap.put(md_l8_n0, (b) -> isDirty_md_l8_n0 = b);
      dirtyFlagUpdateMap.put(md_l8_n1, (b) -> isDirty_md_l8_n1 = b);
      dirtyFlagUpdateMap.put(md_l8_n2, (b) -> isDirty_md_l8_n2 = b);
      dirtyFlagUpdateMap.put(md_l8_n3, (b) -> isDirty_md_l8_n3 = b);
      dirtyFlagUpdateMap.put(md_l8_n4, (b) -> isDirty_md_l8_n4 = b);
      dirtyFlagUpdateMap.put(md_l8_n5, (b) -> isDirty_md_l8_n5 = b);
      dirtyFlagUpdateMap.put(md_l8_n6, (b) -> isDirty_md_l8_n6 = b);
      dirtyFlagUpdateMap.put(md_l8_n7, (b) -> isDirty_md_l8_n7 = b);
      dirtyFlagUpdateMap.put(md_l8_n8, (b) -> isDirty_md_l8_n8 = b);
      dirtyFlagUpdateMap.put(md_l8_n9, (b) -> isDirty_md_l8_n9 = b);
      dirtyFlagUpdateMap.put(md_l9_n0, (b) -> isDirty_md_l9_n0 = b);
      dirtyFlagUpdateMap.put(md_l9_n1, (b) -> isDirty_md_l9_n1 = b);
      dirtyFlagUpdateMap.put(md_l9_n2, (b) -> isDirty_md_l9_n2 = b);
      dirtyFlagUpdateMap.put(md_l9_n3, (b) -> isDirty_md_l9_n3 = b);
      dirtyFlagUpdateMap.put(md_l9_n4, (b) -> isDirty_md_l9_n4 = b);
      dirtyFlagUpdateMap.put(md_l9_n5, (b) -> isDirty_md_l9_n5 = b);
      dirtyFlagUpdateMap.put(md_l9_n6, (b) -> isDirty_md_l9_n6 = b);
      dirtyFlagUpdateMap.put(md_l9_n7, (b) -> isDirty_md_l9_n7 = b);
      dirtyFlagUpdateMap.put(md_l9_n8, (b) -> isDirty_md_l9_n8 = b);
      dirtyFlagUpdateMap.put(md_l9_n9, (b) -> isDirty_md_l9_n9 = b);
      dirtyFlagUpdateMap.put(md_root, (b) -> isDirty_md_root = b);
      dirtyFlagUpdateMap.put(md_sink, (b) -> isDirty_md_sink = b);
      dirtyFlagUpdateMap.put(ts_l1_n0, (b) -> isDirty_ts_l1_n0 = b);
      dirtyFlagUpdateMap.put(ts_l1_n1, (b) -> isDirty_ts_l1_n1 = b);
      dirtyFlagUpdateMap.put(ts_l1_n2, (b) -> isDirty_ts_l1_n2 = b);
      dirtyFlagUpdateMap.put(ts_l1_n3, (b) -> isDirty_ts_l1_n3 = b);
      dirtyFlagUpdateMap.put(ts_l1_n4, (b) -> isDirty_ts_l1_n4 = b);
      dirtyFlagUpdateMap.put(ts_l1_n5, (b) -> isDirty_ts_l1_n5 = b);
      dirtyFlagUpdateMap.put(ts_l1_n6, (b) -> isDirty_ts_l1_n6 = b);
      dirtyFlagUpdateMap.put(ts_l1_n7, (b) -> isDirty_ts_l1_n7 = b);
      dirtyFlagUpdateMap.put(ts_l1_n8, (b) -> isDirty_ts_l1_n8 = b);
      dirtyFlagUpdateMap.put(ts_l1_n9, (b) -> isDirty_ts_l1_n9 = b);
      dirtyFlagUpdateMap.put(ts_l2_n0, (b) -> isDirty_ts_l2_n0 = b);
      dirtyFlagUpdateMap.put(ts_l2_n1, (b) -> isDirty_ts_l2_n1 = b);
      dirtyFlagUpdateMap.put(ts_l2_n2, (b) -> isDirty_ts_l2_n2 = b);
      dirtyFlagUpdateMap.put(ts_l2_n3, (b) -> isDirty_ts_l2_n3 = b);
      dirtyFlagUpdateMap.put(ts_l2_n4, (b) -> isDirty_ts_l2_n4 = b);
      dirtyFlagUpdateMap.put(ts_l2_n5, (b) -> isDirty_ts_l2_n5 = b);
      dirtyFlagUpdateMap.put(ts_l2_n6, (b) -> isDirty_ts_l2_n6 = b);
      dirtyFlagUpdateMap.put(ts_l2_n7, (b) -> isDirty_ts_l2_n7 = b);
      dirtyFlagUpdateMap.put(ts_l2_n8, (b) -> isDirty_ts_l2_n8 = b);
      dirtyFlagUpdateMap.put(ts_l2_n9, (b) -> isDirty_ts_l2_n9 = b);
      dirtyFlagUpdateMap.put(ts_l3_n0, (b) -> isDirty_ts_l3_n0 = b);
      dirtyFlagUpdateMap.put(ts_l3_n1, (b) -> isDirty_ts_l3_n1 = b);
      dirtyFlagUpdateMap.put(ts_l3_n2, (b) -> isDirty_ts_l3_n2 = b);
      dirtyFlagUpdateMap.put(ts_l3_n3, (b) -> isDirty_ts_l3_n3 = b);
      dirtyFlagUpdateMap.put(ts_l3_n4, (b) -> isDirty_ts_l3_n4 = b);
      dirtyFlagUpdateMap.put(ts_l3_n5, (b) -> isDirty_ts_l3_n5 = b);
      dirtyFlagUpdateMap.put(ts_l3_n6, (b) -> isDirty_ts_l3_n6 = b);
      dirtyFlagUpdateMap.put(ts_l3_n7, (b) -> isDirty_ts_l3_n7 = b);
      dirtyFlagUpdateMap.put(ts_l3_n8, (b) -> isDirty_ts_l3_n8 = b);
      dirtyFlagUpdateMap.put(ts_l3_n9, (b) -> isDirty_ts_l3_n9 = b);
      dirtyFlagUpdateMap.put(ts_l4_n0, (b) -> isDirty_ts_l4_n0 = b);
      dirtyFlagUpdateMap.put(ts_l4_n1, (b) -> isDirty_ts_l4_n1 = b);
      dirtyFlagUpdateMap.put(ts_l4_n2, (b) -> isDirty_ts_l4_n2 = b);
      dirtyFlagUpdateMap.put(ts_l4_n3, (b) -> isDirty_ts_l4_n3 = b);
      dirtyFlagUpdateMap.put(ts_l4_n4, (b) -> isDirty_ts_l4_n4 = b);
      dirtyFlagUpdateMap.put(ts_l4_n5, (b) -> isDirty_ts_l4_n5 = b);
      dirtyFlagUpdateMap.put(ts_l4_n6, (b) -> isDirty_ts_l4_n6 = b);
      dirtyFlagUpdateMap.put(ts_l4_n7, (b) -> isDirty_ts_l4_n7 = b);
      dirtyFlagUpdateMap.put(ts_l4_n8, (b) -> isDirty_ts_l4_n8 = b);
      dirtyFlagUpdateMap.put(ts_l4_n9, (b) -> isDirty_ts_l4_n9 = b);
      dirtyFlagUpdateMap.put(ts_l5_n0, (b) -> isDirty_ts_l5_n0 = b);
      dirtyFlagUpdateMap.put(ts_l5_n1, (b) -> isDirty_ts_l5_n1 = b);
      dirtyFlagUpdateMap.put(ts_l5_n2, (b) -> isDirty_ts_l5_n2 = b);
      dirtyFlagUpdateMap.put(ts_l5_n3, (b) -> isDirty_ts_l5_n3 = b);
      dirtyFlagUpdateMap.put(ts_l5_n4, (b) -> isDirty_ts_l5_n4 = b);
      dirtyFlagUpdateMap.put(ts_l5_n5, (b) -> isDirty_ts_l5_n5 = b);
      dirtyFlagUpdateMap.put(ts_l5_n6, (b) -> isDirty_ts_l5_n6 = b);
      dirtyFlagUpdateMap.put(ts_l5_n7, (b) -> isDirty_ts_l5_n7 = b);
      dirtyFlagUpdateMap.put(ts_l5_n8, (b) -> isDirty_ts_l5_n8 = b);
      dirtyFlagUpdateMap.put(ts_l5_n9, (b) -> isDirty_ts_l5_n9 = b);
      dirtyFlagUpdateMap.put(ts_l6_n0, (b) -> isDirty_ts_l6_n0 = b);
      dirtyFlagUpdateMap.put(ts_l6_n1, (b) -> isDirty_ts_l6_n1 = b);
      dirtyFlagUpdateMap.put(ts_l6_n2, (b) -> isDirty_ts_l6_n2 = b);
      dirtyFlagUpdateMap.put(ts_l6_n3, (b) -> isDirty_ts_l6_n3 = b);
      dirtyFlagUpdateMap.put(ts_l6_n4, (b) -> isDirty_ts_l6_n4 = b);
      dirtyFlagUpdateMap.put(ts_l6_n5, (b) -> isDirty_ts_l6_n5 = b);
      dirtyFlagUpdateMap.put(ts_l6_n6, (b) -> isDirty_ts_l6_n6 = b);
      dirtyFlagUpdateMap.put(ts_l6_n7, (b) -> isDirty_ts_l6_n7 = b);
      dirtyFlagUpdateMap.put(ts_l6_n8, (b) -> isDirty_ts_l6_n8 = b);
      dirtyFlagUpdateMap.put(ts_l6_n9, (b) -> isDirty_ts_l6_n9 = b);
      dirtyFlagUpdateMap.put(ts_l7_n0, (b) -> isDirty_ts_l7_n0 = b);
      dirtyFlagUpdateMap.put(ts_l7_n1, (b) -> isDirty_ts_l7_n1 = b);
      dirtyFlagUpdateMap.put(ts_l7_n2, (b) -> isDirty_ts_l7_n2 = b);
      dirtyFlagUpdateMap.put(ts_l7_n3, (b) -> isDirty_ts_l7_n3 = b);
      dirtyFlagUpdateMap.put(ts_l7_n4, (b) -> isDirty_ts_l7_n4 = b);
      dirtyFlagUpdateMap.put(ts_l7_n5, (b) -> isDirty_ts_l7_n5 = b);
      dirtyFlagUpdateMap.put(ts_l7_n6, (b) -> isDirty_ts_l7_n6 = b);
      dirtyFlagUpdateMap.put(ts_l7_n7, (b) -> isDirty_ts_l7_n7 = b);
      dirtyFlagUpdateMap.put(ts_l7_n8, (b) -> isDirty_ts_l7_n8 = b);
      dirtyFlagUpdateMap.put(ts_l7_n9, (b) -> isDirty_ts_l7_n9 = b);
      dirtyFlagUpdateMap.put(ts_l8_n0, (b) -> isDirty_ts_l8_n0 = b);
      dirtyFlagUpdateMap.put(ts_l8_n1, (b) -> isDirty_ts_l8_n1 = b);
      dirtyFlagUpdateMap.put(ts_l8_n2, (b) -> isDirty_ts_l8_n2 = b);
      dirtyFlagUpdateMap.put(ts_l8_n3, (b) -> isDirty_ts_l8_n3 = b);
      dirtyFlagUpdateMap.put(ts_l8_n4, (b) -> isDirty_ts_l8_n4 = b);
      dirtyFlagUpdateMap.put(ts_l8_n5, (b) -> isDirty_ts_l8_n5 = b);
      dirtyFlagUpdateMap.put(ts_l8_n6, (b) -> isDirty_ts_l8_n6 = b);
      dirtyFlagUpdateMap.put(ts_l8_n7, (b) -> isDirty_ts_l8_n7 = b);
      dirtyFlagUpdateMap.put(ts_l8_n8, (b) -> isDirty_ts_l8_n8 = b);
      dirtyFlagUpdateMap.put(ts_l8_n9, (b) -> isDirty_ts_l8_n9 = b);
      dirtyFlagUpdateMap.put(ts_l9_n0, (b) -> isDirty_ts_l9_n0 = b);
      dirtyFlagUpdateMap.put(ts_l9_n1, (b) -> isDirty_ts_l9_n1 = b);
      dirtyFlagUpdateMap.put(ts_l9_n2, (b) -> isDirty_ts_l9_n2 = b);
      dirtyFlagUpdateMap.put(ts_l9_n3, (b) -> isDirty_ts_l9_n3 = b);
      dirtyFlagUpdateMap.put(ts_l9_n4, (b) -> isDirty_ts_l9_n4 = b);
      dirtyFlagUpdateMap.put(ts_root, (b) -> isDirty_ts_root = b);
      dirtyFlagUpdateMap.put(ts_sink, (b) -> isDirty_ts_sink = b);
    }
    dirtyFlagUpdateMap.get(node).accept(dirtyFlag);
  }

  private boolean guardCheck_ts_l1_n0() {
    return isDirty_ts_root;
  }

  private boolean guardCheck_ts_l1_n1() {
    return isDirty_ts_root;
  }

  private boolean guardCheck_ts_l1_n2() {
    return isDirty_ts_root;
  }

  private boolean guardCheck_ts_l1_n3() {
    return isDirty_ts_root;
  }

  private boolean guardCheck_ts_l1_n4() {
    return isDirty_ts_root;
  }

  private boolean guardCheck_ts_l1_n5() {
    return isDirty_ts_root;
  }

  private boolean guardCheck_ts_l1_n6() {
    return isDirty_ts_root;
  }

  private boolean guardCheck_ts_l1_n7() {
    return isDirty_ts_root;
  }

  private boolean guardCheck_ts_l1_n8() {
    return isDirty_ts_root;
  }

  private boolean guardCheck_ts_l1_n9() {
    return isDirty_ts_root;
  }

  private boolean guardCheck_ts_l2_n0() {
    return isDirty_ts_l1_n0 | isDirty_ts_l1_n1;
  }

  private boolean guardCheck_ts_l2_n1() {
    return isDirty_ts_l1_n1 | isDirty_ts_l1_n2;
  }

  private boolean guardCheck_ts_l2_n2() {
    return isDirty_ts_l1_n2 | isDirty_ts_l1_n3;
  }

  private boolean guardCheck_ts_l2_n3() {
    return isDirty_ts_l1_n3 | isDirty_ts_l1_n4;
  }

  private boolean guardCheck_ts_l2_n4() {
    return isDirty_ts_l1_n4 | isDirty_ts_l1_n5;
  }

  private boolean guardCheck_ts_l2_n5() {
    return isDirty_ts_l1_n5 | isDirty_ts_l1_n6;
  }

  private boolean guardCheck_ts_l2_n6() {
    return isDirty_ts_l1_n6 | isDirty_ts_l1_n7;
  }

  private boolean guardCheck_ts_l2_n7() {
    return isDirty_ts_l1_n7 | isDirty_ts_l1_n8;
  }

  private boolean guardCheck_ts_l2_n8() {
    return isDirty_ts_l1_n8 | isDirty_ts_l1_n9;
  }

  private boolean guardCheck_ts_l2_n9() {
    return isDirty_ts_l1_n0 | isDirty_ts_l1_n9;
  }

  private boolean guardCheck_ts_l3_n0() {
    return isDirty_ts_l2_n0 | isDirty_ts_l2_n1;
  }

  private boolean guardCheck_ts_l3_n1() {
    return isDirty_ts_l2_n1 | isDirty_ts_l2_n2;
  }

  private boolean guardCheck_ts_l3_n2() {
    return isDirty_ts_l2_n2 | isDirty_ts_l2_n3;
  }

  private boolean guardCheck_ts_l3_n3() {
    return isDirty_ts_l2_n3 | isDirty_ts_l2_n4;
  }

  private boolean guardCheck_ts_l3_n4() {
    return isDirty_ts_l2_n4 | isDirty_ts_l2_n5;
  }

  private boolean guardCheck_ts_l3_n5() {
    return isDirty_ts_l2_n5 | isDirty_ts_l2_n6;
  }

  private boolean guardCheck_ts_l3_n6() {
    return isDirty_ts_l2_n6 | isDirty_ts_l2_n7;
  }

  private boolean guardCheck_ts_l3_n7() {
    return isDirty_ts_l2_n7 | isDirty_ts_l2_n8;
  }

  private boolean guardCheck_ts_l3_n8() {
    return isDirty_ts_l2_n8 | isDirty_ts_l2_n9;
  }

  private boolean guardCheck_ts_l3_n9() {
    return isDirty_ts_l2_n0 | isDirty_ts_l2_n9;
  }

  private boolean guardCheck_ts_l4_n0() {
    return isDirty_ts_l3_n0 | isDirty_ts_l3_n1;
  }

  private boolean guardCheck_ts_l4_n1() {
    return isDirty_ts_l3_n1 | isDirty_ts_l3_n2;
  }

  private boolean guardCheck_ts_l4_n2() {
    return isDirty_ts_l3_n2 | isDirty_ts_l3_n3;
  }

  private boolean guardCheck_ts_l4_n3() {
    return isDirty_ts_l3_n3 | isDirty_ts_l3_n4;
  }

  private boolean guardCheck_ts_l4_n4() {
    return isDirty_ts_l3_n4 | isDirty_ts_l3_n5;
  }

  private boolean guardCheck_ts_l4_n5() {
    return isDirty_ts_l3_n5 | isDirty_ts_l3_n6;
  }

  private boolean guardCheck_ts_l4_n6() {
    return isDirty_ts_l3_n6 | isDirty_ts_l3_n7;
  }

  private boolean guardCheck_ts_l4_n7() {
    return isDirty_ts_l3_n7 | isDirty_ts_l3_n8;
  }

  private boolean guardCheck_ts_l4_n8() {
    return isDirty_ts_l3_n8 | isDirty_ts_l3_n9;
  }

  private boolean guardCheck_ts_l4_n9() {
    return isDirty_ts_l3_n0 | isDirty_ts_l3_n9;
  }

  private boolean guardCheck_ts_l5_n0() {
    return isDirty_ts_l4_n0 | isDirty_ts_l4_n1;
  }

  private boolean guardCheck_ts_l5_n1() {
    return isDirty_ts_l4_n1 | isDirty_ts_l4_n2;
  }

  private boolean guardCheck_ts_l5_n2() {
    return isDirty_ts_l4_n2 | isDirty_ts_l4_n3;
  }

  private boolean guardCheck_ts_l5_n3() {
    return isDirty_ts_l4_n3 | isDirty_ts_l4_n4;
  }

  private boolean guardCheck_ts_l5_n4() {
    return isDirty_ts_l4_n4 | isDirty_ts_l4_n5;
  }

  private boolean guardCheck_ts_l5_n5() {
    return isDirty_ts_l4_n5 | isDirty_ts_l4_n6;
  }

  private boolean guardCheck_ts_l5_n6() {
    return isDirty_ts_l4_n6 | isDirty_ts_l4_n7;
  }

  private boolean guardCheck_ts_l5_n7() {
    return isDirty_ts_l4_n7 | isDirty_ts_l4_n8;
  }

  private boolean guardCheck_ts_l5_n8() {
    return isDirty_ts_l4_n8 | isDirty_ts_l4_n9;
  }

  private boolean guardCheck_ts_l5_n9() {
    return isDirty_ts_l4_n0 | isDirty_ts_l4_n9;
  }

  private boolean guardCheck_ts_l6_n0() {
    return isDirty_ts_l5_n0 | isDirty_ts_l5_n1;
  }

  private boolean guardCheck_ts_l6_n1() {
    return isDirty_ts_l5_n1 | isDirty_ts_l5_n2;
  }

  private boolean guardCheck_ts_l6_n2() {
    return isDirty_ts_l5_n2 | isDirty_ts_l5_n3;
  }

  private boolean guardCheck_ts_l6_n3() {
    return isDirty_ts_l5_n3 | isDirty_ts_l5_n4;
  }

  private boolean guardCheck_ts_l6_n4() {
    return isDirty_ts_l5_n4 | isDirty_ts_l5_n5;
  }

  private boolean guardCheck_ts_l6_n5() {
    return isDirty_ts_l5_n5 | isDirty_ts_l5_n6;
  }

  private boolean guardCheck_ts_l6_n6() {
    return isDirty_ts_l5_n6 | isDirty_ts_l5_n7;
  }

  private boolean guardCheck_ts_l6_n7() {
    return isDirty_ts_l5_n7 | isDirty_ts_l5_n8;
  }

  private boolean guardCheck_ts_l6_n8() {
    return isDirty_ts_l5_n8 | isDirty_ts_l5_n9;
  }

  private boolean guardCheck_ts_l6_n9() {
    return isDirty_ts_l5_n0 | isDirty_ts_l5_n9;
  }

  private boolean guardCheck_ts_l7_n0() {
    return isDirty_ts_l6_n0 | isDirty_ts_l6_n1;
  }

  private boolean guardCheck_ts_l7_n1() {
    return isDirty_ts_l6_n1 | isDirty_ts_l6_n2;
  }

  private boolean guardCheck_ts_l7_n2() {
    return isDirty_ts_l6_n2 | isDirty_ts_l6_n3;
  }

  private boolean guardCheck_ts_l7_n3() {
    return isDirty_ts_l6_n3 | isDirty_ts_l6_n4;
  }

  private boolean guardCheck_ts_l7_n4() {
    return isDirty_ts_l6_n4 | isDirty_ts_l6_n5;
  }

  private boolean guardCheck_ts_l7_n5() {
    return isDirty_ts_l6_n5 | isDirty_ts_l6_n6;
  }

  private boolean guardCheck_ts_l7_n6() {
    return isDirty_ts_l6_n6 | isDirty_ts_l6_n7;
  }

  private boolean guardCheck_ts_l7_n7() {
    return isDirty_ts_l6_n7 | isDirty_ts_l6_n8;
  }

  private boolean guardCheck_ts_l7_n8() {
    return isDirty_ts_l6_n8 | isDirty_ts_l6_n9;
  }

  private boolean guardCheck_ts_l7_n9() {
    return isDirty_ts_l6_n0 | isDirty_ts_l6_n9;
  }

  private boolean guardCheck_ts_l8_n0() {
    return isDirty_ts_l7_n0 | isDirty_ts_l7_n1;
  }

  private boolean guardCheck_ts_l8_n1() {
    return isDirty_ts_l7_n1 | isDirty_ts_l7_n2;
  }

  private boolean guardCheck_ts_l8_n2() {
    return isDirty_ts_l7_n2 | isDirty_ts_l7_n3;
  }

  private boolean guardCheck_ts_l8_n3() {
    return isDirty_ts_l7_n3 | isDirty_ts_l7_n4;
  }

  private boolean guardCheck_ts_l8_n4() {
    return isDirty_ts_l7_n4 | isDirty_ts_l7_n5;
  }

  private boolean guardCheck_ts_l8_n5() {
    return isDirty_ts_l7_n5 | isDirty_ts_l7_n6;
  }

  private boolean guardCheck_ts_l8_n6() {
    return isDirty_ts_l7_n6 | isDirty_ts_l7_n7;
  }

  private boolean guardCheck_ts_l8_n7() {
    return isDirty_ts_l7_n7 | isDirty_ts_l7_n8;
  }

  private boolean guardCheck_ts_l8_n8() {
    return isDirty_ts_l7_n8 | isDirty_ts_l7_n9;
  }

  private boolean guardCheck_ts_l8_n9() {
    return isDirty_ts_l7_n0 | isDirty_ts_l7_n9;
  }

  private boolean guardCheck_ts_l9_n0() {
    return isDirty_ts_l8_n0 | isDirty_ts_l8_n1;
  }

  private boolean guardCheck_ts_l9_n1() {
    return isDirty_ts_l8_n1 | isDirty_ts_l8_n2;
  }

  private boolean guardCheck_ts_l9_n2() {
    return isDirty_ts_l8_n2 | isDirty_ts_l8_n3;
  }

  private boolean guardCheck_ts_l9_n3() {
    return isDirty_ts_l8_n3 | isDirty_ts_l8_n4;
  }

  private boolean guardCheck_ts_l9_n4() {
    return isDirty_ts_l8_n4 | isDirty_ts_l8_n5;
  }

  private boolean guardCheck_ts_l9_n5() {
    return isDirty_ts_l8_n5 | isDirty_ts_l8_n6;
  }

  private boolean guardCheck_ts_l9_n6() {
    return isDirty_ts_l8_n6 | isDirty_ts_l8_n7;
  }

  private boolean guardCheck_ts_l9_n7() {
    return isDirty_ts_l8_n7 | isDirty_ts_l8_n8;
  }

  private boolean guardCheck_ts_l9_n8() {
    return isDirty_ts_l8_n8 | isDirty_ts_l8_n9;
  }

  private boolean guardCheck_ts_l9_n9() {
    return isDirty_ts_l8_n0 | isDirty_ts_l8_n9;
  }

  private boolean guardCheck_ctrl_l1_n0() {
    return isDirty_ctrl_root;
  }

  private boolean guardCheck_ctrl_l1_n1() {
    return isDirty_ctrl_root;
  }

  private boolean guardCheck_ctrl_l1_n2() {
    return isDirty_ctrl_root;
  }

  private boolean guardCheck_ctrl_l1_n3() {
    return isDirty_ctrl_root;
  }

  private boolean guardCheck_ctrl_l1_n4() {
    return isDirty_ctrl_root;
  }

  private boolean guardCheck_ctrl_l1_n5() {
    return isDirty_ctrl_root;
  }

  private boolean guardCheck_ctrl_l1_n6() {
    return isDirty_ctrl_root;
  }

  private boolean guardCheck_ctrl_l1_n7() {
    return isDirty_ctrl_root;
  }

  private boolean guardCheck_ctrl_l1_n8() {
    return isDirty_ctrl_root;
  }

  private boolean guardCheck_ctrl_l1_n9() {
    return isDirty_ctrl_root;
  }

  private boolean guardCheck_ctrl_l2_n0() {
    return isDirty_ctrl_l1_n0;
  }

  private boolean guardCheck_ctrl_l2_n1() {
    return isDirty_ctrl_l1_n1;
  }

  private boolean guardCheck_ctrl_l2_n2() {
    return isDirty_ctrl_l1_n2;
  }

  private boolean guardCheck_ctrl_l2_n3() {
    return isDirty_ctrl_l1_n3;
  }

  private boolean guardCheck_ctrl_l2_n4() {
    return isDirty_ctrl_l1_n4;
  }

  private boolean guardCheck_ctrl_l2_n5() {
    return isDirty_ctrl_l1_n5;
  }

  private boolean guardCheck_ctrl_l2_n6() {
    return isDirty_ctrl_l1_n6;
  }

  private boolean guardCheck_ctrl_l2_n7() {
    return isDirty_ctrl_l1_n7;
  }

  private boolean guardCheck_ctrl_l2_n8() {
    return isDirty_ctrl_l1_n8;
  }

  private boolean guardCheck_ctrl_l2_n9() {
    return isDirty_ctrl_l1_n9;
  }

  private boolean guardCheck_ctrl_l3_n0() {
    return isDirty_ctrl_l2_n0;
  }

  private boolean guardCheck_ctrl_l3_n1() {
    return isDirty_ctrl_l2_n1;
  }

  private boolean guardCheck_ctrl_l3_n2() {
    return isDirty_ctrl_l2_n2;
  }

  private boolean guardCheck_ctrl_l3_n3() {
    return isDirty_ctrl_l2_n3;
  }

  private boolean guardCheck_ctrl_l3_n4() {
    return isDirty_ctrl_l2_n4;
  }

  private boolean guardCheck_ctrl_l3_n5() {
    return isDirty_ctrl_l2_n5;
  }

  private boolean guardCheck_ctrl_l3_n6() {
    return isDirty_ctrl_l2_n6;
  }

  private boolean guardCheck_ctrl_l3_n7() {
    return isDirty_ctrl_l2_n7;
  }

  private boolean guardCheck_ctrl_l3_n8() {
    return isDirty_ctrl_l2_n8;
  }

  private boolean guardCheck_ctrl_l3_n9() {
    return isDirty_ctrl_l2_n9;
  }

  private boolean guardCheck_ctrl_l4_n0() {
    return isDirty_ctrl_l3_n0;
  }

  private boolean guardCheck_ctrl_l4_n1() {
    return isDirty_ctrl_l3_n1;
  }

  private boolean guardCheck_ctrl_l4_n2() {
    return isDirty_ctrl_l3_n2;
  }

  private boolean guardCheck_ctrl_l4_n3() {
    return isDirty_ctrl_l3_n3;
  }

  private boolean guardCheck_ctrl_l4_n4() {
    return isDirty_ctrl_l3_n4;
  }

  private boolean guardCheck_ctrl_l4_n5() {
    return isDirty_ctrl_l3_n5;
  }

  private boolean guardCheck_ctrl_l4_n6() {
    return isDirty_ctrl_l3_n6;
  }

  private boolean guardCheck_ctrl_l4_n7() {
    return isDirty_ctrl_l3_n7;
  }

  private boolean guardCheck_ctrl_l4_n8() {
    return isDirty_ctrl_l3_n8;
  }

  private boolean guardCheck_ctrl_l4_n9() {
    return isDirty_ctrl_l3_n9;
  }

  private boolean guardCheck_ctrl_l5_n0() {
    return isDirty_ctrl_l4_n0;
  }

  private boolean guardCheck_ctrl_l5_n1() {
    return isDirty_ctrl_l4_n1;
  }

  private boolean guardCheck_ctrl_l5_n2() {
    return isDirty_ctrl_l4_n2;
  }

  private boolean guardCheck_ctrl_l5_n3() {
    return isDirty_ctrl_l4_n3;
  }

  private boolean guardCheck_ctrl_l5_n4() {
    return isDirty_ctrl_l4_n4;
  }

  private boolean guardCheck_ctrl_l5_n5() {
    return isDirty_ctrl_l4_n5;
  }

  private boolean guardCheck_ctrl_l5_n6() {
    return isDirty_ctrl_l4_n6;
  }

  private boolean guardCheck_ctrl_l5_n7() {
    return isDirty_ctrl_l4_n7;
  }

  private boolean guardCheck_ctrl_l5_n8() {
    return isDirty_ctrl_l4_n8;
  }

  private boolean guardCheck_ctrl_l5_n9() {
    return isDirty_ctrl_l4_n9;
  }

  private boolean guardCheck_ctrl_l6_n0() {
    return isDirty_ctrl_l5_n0;
  }

  private boolean guardCheck_ctrl_l6_n1() {
    return isDirty_ctrl_l5_n1;
  }

  private boolean guardCheck_ctrl_l6_n2() {
    return isDirty_ctrl_l5_n2;
  }

  private boolean guardCheck_ctrl_l6_n3() {
    return isDirty_ctrl_l5_n3;
  }

  private boolean guardCheck_ctrl_l6_n4() {
    return isDirty_ctrl_l5_n4;
  }

  private boolean guardCheck_ctrl_l6_n5() {
    return isDirty_ctrl_l5_n5;
  }

  private boolean guardCheck_ctrl_l6_n6() {
    return isDirty_ctrl_l5_n6;
  }

  private boolean guardCheck_ctrl_l6_n7() {
    return isDirty_ctrl_l5_n7;
  }

  private boolean guardCheck_ctrl_l6_n8() {
    return isDirty_ctrl_l5_n8;
  }

  private boolean guardCheck_ctrl_l6_n9() {
    return isDirty_ctrl_l5_n9;
  }

  private boolean guardCheck_ctrl_l7_n0() {
    return isDirty_ctrl_l6_n0;
  }

  private boolean guardCheck_ctrl_l7_n1() {
    return isDirty_ctrl_l6_n1;
  }

  private boolean guardCheck_ctrl_l7_n2() {
    return isDirty_ctrl_l6_n2;
  }

  private boolean guardCheck_ctrl_l7_n3() {
    return isDirty_ctrl_l6_n3;
  }

  private boolean guardCheck_ctrl_l7_n4() {
    return isDirty_ctrl_l6_n4;
  }

  private boolean guardCheck_ctrl_l7_n5() {
    return isDirty_ctrl_l6_n5;
  }

  private boolean guardCheck_ctrl_l7_n6() {
    return isDirty_ctrl_l6_n6;
  }

  private boolean guardCheck_ctrl_l7_n7() {
    return isDirty_ctrl_l6_n7;
  }

  private boolean guardCheck_ctrl_l7_n8() {
    return isDirty_ctrl_l6_n8;
  }

  private boolean guardCheck_ctrl_l7_n9() {
    return isDirty_ctrl_l6_n9;
  }

  private boolean guardCheck_ctrl_l8_n0() {
    return isDirty_ctrl_l7_n0;
  }

  private boolean guardCheck_ctrl_l8_n1() {
    return isDirty_ctrl_l7_n1;
  }

  private boolean guardCheck_ctrl_l8_n2() {
    return isDirty_ctrl_l7_n2;
  }

  private boolean guardCheck_ctrl_l8_n3() {
    return isDirty_ctrl_l7_n3;
  }

  private boolean guardCheck_ctrl_l8_n4() {
    return isDirty_ctrl_l7_n4;
  }

  private boolean guardCheck_ctrl_l8_n5() {
    return isDirty_ctrl_l7_n5;
  }

  private boolean guardCheck_ctrl_l8_n6() {
    return isDirty_ctrl_l7_n6;
  }

  private boolean guardCheck_ctrl_l8_n7() {
    return isDirty_ctrl_l7_n7;
  }

  private boolean guardCheck_ctrl_l8_n8() {
    return isDirty_ctrl_l7_n8;
  }

  private boolean guardCheck_ctrl_l8_n9() {
    return isDirty_ctrl_l7_n9;
  }

  private boolean guardCheck_ctrl_l9_n0() {
    return isDirty_ctrl_l8_n0;
  }

  private boolean guardCheck_ctrl_l9_n1() {
    return isDirty_ctrl_l8_n1;
  }

  private boolean guardCheck_ctrl_l9_n2() {
    return isDirty_ctrl_l8_n2;
  }

  private boolean guardCheck_ctrl_l9_n3() {
    return isDirty_ctrl_l8_n3;
  }

  private boolean guardCheck_ctrl_l9_n4() {
    return isDirty_ctrl_l8_n4;
  }

  private boolean guardCheck_ctrl_l9_n5() {
    return isDirty_ctrl_l8_n5;
  }

  private boolean guardCheck_ctrl_l9_n6() {
    return isDirty_ctrl_l8_n6;
  }

  private boolean guardCheck_ctrl_l9_n7() {
    return isDirty_ctrl_l8_n7;
  }

  private boolean guardCheck_ctrl_l9_n8() {
    return isDirty_ctrl_l8_n8;
  }

  private boolean guardCheck_ctrl_l9_n9() {
    return isDirty_ctrl_l8_n9;
  }

  private boolean guardCheck_ctrl_sink() {
    return isDirty_ctrl_l9_n0 | isDirty_ctrl_l9_n1 | isDirty_ctrl_l9_n2;
  }

  private boolean guardCheck_md_l1_n0() {
    return isDirty_md_root;
  }

  private boolean guardCheck_md_l1_n1() {
    return isDirty_md_root;
  }

  private boolean guardCheck_md_l1_n2() {
    return isDirty_md_root;
  }

  private boolean guardCheck_md_l1_n3() {
    return isDirty_md_root;
  }

  private boolean guardCheck_md_l1_n4() {
    return isDirty_md_root;
  }

  private boolean guardCheck_md_l1_n5() {
    return isDirty_md_root;
  }

  private boolean guardCheck_md_l1_n6() {
    return isDirty_md_root;
  }

  private boolean guardCheck_md_l1_n7() {
    return isDirty_md_root;
  }

  private boolean guardCheck_md_l1_n8() {
    return isDirty_md_root;
  }

  private boolean guardCheck_md_l1_n9() {
    return isDirty_md_root;
  }

  private boolean guardCheck_md_l2_n0() {
    return isDirty_md_l1_n0 | isDirty_md_l1_n1;
  }

  private boolean guardCheck_md_l2_n1() {
    return isDirty_md_l1_n1 | isDirty_md_l1_n2;
  }

  private boolean guardCheck_md_l2_n2() {
    return isDirty_md_l1_n2 | isDirty_md_l1_n3;
  }

  private boolean guardCheck_md_l2_n3() {
    return isDirty_md_l1_n3 | isDirty_md_l1_n4;
  }

  private boolean guardCheck_md_l2_n4() {
    return isDirty_md_l1_n4 | isDirty_md_l1_n5;
  }

  private boolean guardCheck_md_l2_n5() {
    return isDirty_md_l1_n5 | isDirty_md_l1_n6;
  }

  private boolean guardCheck_md_l2_n6() {
    return isDirty_md_l1_n6 | isDirty_md_l1_n7;
  }

  private boolean guardCheck_md_l2_n7() {
    return isDirty_md_l1_n7 | isDirty_md_l1_n8;
  }

  private boolean guardCheck_md_l2_n8() {
    return isDirty_md_l1_n8 | isDirty_md_l1_n9;
  }

  private boolean guardCheck_md_l2_n9() {
    return isDirty_md_l1_n0 | isDirty_md_l1_n9;
  }

  private boolean guardCheck_md_l3_n0() {
    return isDirty_md_l2_n0 | isDirty_md_l2_n1;
  }

  private boolean guardCheck_md_l3_n1() {
    return isDirty_md_l2_n1 | isDirty_md_l2_n2;
  }

  private boolean guardCheck_md_l3_n2() {
    return isDirty_md_l2_n2 | isDirty_md_l2_n3;
  }

  private boolean guardCheck_md_l3_n3() {
    return isDirty_md_l2_n3 | isDirty_md_l2_n4;
  }

  private boolean guardCheck_md_l3_n4() {
    return isDirty_md_l2_n4 | isDirty_md_l2_n5;
  }

  private boolean guardCheck_md_l3_n5() {
    return isDirty_md_l2_n5 | isDirty_md_l2_n6;
  }

  private boolean guardCheck_md_l3_n6() {
    return isDirty_md_l2_n6 | isDirty_md_l2_n7;
  }

  private boolean guardCheck_md_l3_n7() {
    return isDirty_md_l2_n7 | isDirty_md_l2_n8;
  }

  private boolean guardCheck_md_l3_n8() {
    return isDirty_md_l2_n8 | isDirty_md_l2_n9;
  }

  private boolean guardCheck_md_l3_n9() {
    return isDirty_md_l2_n0 | isDirty_md_l2_n9;
  }

  private boolean guardCheck_md_l4_n0() {
    return isDirty_md_l3_n0 | isDirty_md_l3_n1;
  }

  private boolean guardCheck_md_l4_n1() {
    return isDirty_md_l3_n1 | isDirty_md_l3_n2;
  }

  private boolean guardCheck_md_l4_n2() {
    return isDirty_md_l3_n2 | isDirty_md_l3_n3;
  }

  private boolean guardCheck_md_l4_n3() {
    return isDirty_md_l3_n3 | isDirty_md_l3_n4;
  }

  private boolean guardCheck_md_l4_n4() {
    return isDirty_md_l3_n4 | isDirty_md_l3_n5;
  }

  private boolean guardCheck_md_l4_n5() {
    return isDirty_md_l3_n5 | isDirty_md_l3_n6;
  }

  private boolean guardCheck_md_l4_n6() {
    return isDirty_md_l3_n6 | isDirty_md_l3_n7;
  }

  private boolean guardCheck_md_l4_n7() {
    return isDirty_md_l3_n7 | isDirty_md_l3_n8;
  }

  private boolean guardCheck_md_l4_n8() {
    return isDirty_md_l3_n8 | isDirty_md_l3_n9;
  }

  private boolean guardCheck_md_l4_n9() {
    return isDirty_md_l3_n0 | isDirty_md_l3_n9;
  }

  private boolean guardCheck_md_l5_n0() {
    return isDirty_md_l4_n0 | isDirty_md_l4_n1;
  }

  private boolean guardCheck_md_l5_n1() {
    return isDirty_md_l4_n1 | isDirty_md_l4_n2;
  }

  private boolean guardCheck_md_l5_n2() {
    return isDirty_md_l4_n2 | isDirty_md_l4_n3;
  }

  private boolean guardCheck_md_l5_n3() {
    return isDirty_md_l4_n3 | isDirty_md_l4_n4;
  }

  private boolean guardCheck_md_l5_n4() {
    return isDirty_md_l4_n4 | isDirty_md_l4_n5;
  }

  private boolean guardCheck_md_l5_n5() {
    return isDirty_md_l4_n5 | isDirty_md_l4_n6;
  }

  private boolean guardCheck_md_l5_n6() {
    return isDirty_md_l4_n6 | isDirty_md_l4_n7;
  }

  private boolean guardCheck_md_l5_n7() {
    return isDirty_md_l4_n7 | isDirty_md_l4_n8;
  }

  private boolean guardCheck_md_l5_n8() {
    return isDirty_md_l4_n8 | isDirty_md_l4_n9;
  }

  private boolean guardCheck_md_l5_n9() {
    return isDirty_md_l4_n0 | isDirty_md_l4_n9;
  }

  private boolean guardCheck_md_l6_n0() {
    return isDirty_md_l5_n0 | isDirty_md_l5_n1;
  }

  private boolean guardCheck_md_l6_n1() {
    return isDirty_md_l5_n1 | isDirty_md_l5_n2;
  }

  private boolean guardCheck_md_l6_n2() {
    return isDirty_md_l5_n2 | isDirty_md_l5_n3;
  }

  private boolean guardCheck_md_l6_n3() {
    return isDirty_md_l5_n3 | isDirty_md_l5_n4;
  }

  private boolean guardCheck_md_l6_n4() {
    return isDirty_md_l5_n4 | isDirty_md_l5_n5;
  }

  private boolean guardCheck_md_l6_n5() {
    return isDirty_md_l5_n5 | isDirty_md_l5_n6;
  }

  private boolean guardCheck_md_l6_n6() {
    return isDirty_md_l5_n6 | isDirty_md_l5_n7;
  }

  private boolean guardCheck_md_l6_n7() {
    return isDirty_md_l5_n7 | isDirty_md_l5_n8;
  }

  private boolean guardCheck_md_l6_n8() {
    return isDirty_md_l5_n8 | isDirty_md_l5_n9;
  }

  private boolean guardCheck_md_l6_n9() {
    return isDirty_md_l5_n0 | isDirty_md_l5_n9;
  }

  private boolean guardCheck_md_l7_n0() {
    return isDirty_md_l6_n0 | isDirty_md_l6_n1;
  }

  private boolean guardCheck_md_l7_n1() {
    return isDirty_md_l6_n1 | isDirty_md_l6_n2;
  }

  private boolean guardCheck_md_l7_n2() {
    return isDirty_md_l6_n2 | isDirty_md_l6_n3;
  }

  private boolean guardCheck_md_l7_n3() {
    return isDirty_md_l6_n3 | isDirty_md_l6_n4;
  }

  private boolean guardCheck_md_l7_n4() {
    return isDirty_md_l6_n4 | isDirty_md_l6_n5;
  }

  private boolean guardCheck_md_l7_n5() {
    return isDirty_md_l6_n5 | isDirty_md_l6_n6;
  }

  private boolean guardCheck_md_l7_n6() {
    return isDirty_md_l6_n6 | isDirty_md_l6_n7;
  }

  private boolean guardCheck_md_l7_n7() {
    return isDirty_md_l6_n7 | isDirty_md_l6_n8;
  }

  private boolean guardCheck_md_l7_n8() {
    return isDirty_md_l6_n8 | isDirty_md_l6_n9;
  }

  private boolean guardCheck_md_l7_n9() {
    return isDirty_md_l6_n0 | isDirty_md_l6_n9;
  }

  private boolean guardCheck_md_l8_n0() {
    return isDirty_md_l7_n0 | isDirty_md_l7_n1;
  }

  private boolean guardCheck_md_l8_n1() {
    return isDirty_md_l7_n1 | isDirty_md_l7_n2;
  }

  private boolean guardCheck_md_l8_n2() {
    return isDirty_md_l7_n2 | isDirty_md_l7_n3;
  }

  private boolean guardCheck_md_l8_n3() {
    return isDirty_md_l7_n3 | isDirty_md_l7_n4;
  }

  private boolean guardCheck_md_l8_n4() {
    return isDirty_md_l7_n4 | isDirty_md_l7_n5;
  }

  private boolean guardCheck_md_l8_n5() {
    return isDirty_md_l7_n5 | isDirty_md_l7_n6;
  }

  private boolean guardCheck_md_l8_n6() {
    return isDirty_md_l7_n6 | isDirty_md_l7_n7;
  }

  private boolean guardCheck_md_l8_n7() {
    return isDirty_md_l7_n7 | isDirty_md_l7_n8;
  }

  private boolean guardCheck_md_l8_n8() {
    return isDirty_md_l7_n8 | isDirty_md_l7_n9;
  }

  private boolean guardCheck_md_l8_n9() {
    return isDirty_md_l7_n0 | isDirty_md_l7_n9;
  }

  private boolean guardCheck_md_l9_n0() {
    return isDirty_md_l8_n0 | isDirty_md_l8_n1;
  }

  private boolean guardCheck_md_l9_n1() {
    return isDirty_md_l8_n1 | isDirty_md_l8_n2;
  }

  private boolean guardCheck_md_l9_n2() {
    return isDirty_md_l8_n2 | isDirty_md_l8_n3;
  }

  private boolean guardCheck_md_l9_n3() {
    return isDirty_md_l8_n3 | isDirty_md_l8_n4;
  }

  private boolean guardCheck_md_l9_n4() {
    return isDirty_md_l8_n4 | isDirty_md_l8_n5;
  }

  private boolean guardCheck_md_l9_n5() {
    return isDirty_md_l8_n5 | isDirty_md_l8_n6;
  }

  private boolean guardCheck_md_l9_n6() {
    return isDirty_md_l8_n6 | isDirty_md_l8_n7;
  }

  private boolean guardCheck_md_l9_n7() {
    return isDirty_md_l8_n7 | isDirty_md_l8_n8;
  }

  private boolean guardCheck_md_l9_n8() {
    return isDirty_md_l8_n8 | isDirty_md_l8_n9;
  }

  private boolean guardCheck_md_l9_n9() {
    return isDirty_md_l8_n0 | isDirty_md_l8_n9;
  }

  private boolean guardCheck_md_l10_n0() {
    return isDirty_md_l9_n0 | isDirty_md_l9_n1;
  }

  private boolean guardCheck_md_l10_n1() {
    return isDirty_md_l9_n1 | isDirty_md_l9_n2;
  }

  private boolean guardCheck_md_l10_n2() {
    return isDirty_md_l9_n2 | isDirty_md_l9_n3;
  }

  private boolean guardCheck_md_l10_n3() {
    return isDirty_md_l9_n3 | isDirty_md_l9_n4;
  }

  private boolean guardCheck_md_l10_n4() {
    return isDirty_md_l9_n4 | isDirty_md_l9_n5;
  }

  private boolean guardCheck_md_l10_n5() {
    return isDirty_md_l9_n5 | isDirty_md_l9_n6;
  }

  private boolean guardCheck_md_l10_n6() {
    return isDirty_md_l9_n6 | isDirty_md_l9_n7;
  }

  private boolean guardCheck_md_l10_n7() {
    return isDirty_md_l9_n7 | isDirty_md_l9_n8;
  }

  private boolean guardCheck_md_l10_n8() {
    return isDirty_md_l9_n8 | isDirty_md_l9_n9;
  }

  private boolean guardCheck_md_l10_n9() {
    return isDirty_md_l9_n0 | isDirty_md_l9_n9;
  }

  private boolean guardCheck_md_sink() {
    return isDirty_md_l10_n0
        | isDirty_md_l10_n1
        | isDirty_md_l10_n2
        | isDirty_md_l10_n3
        | isDirty_md_l10_n4;
  }

  private boolean guardCheck_sink() {
    return isDirty_md_sink | isDirty_ts_sink;
  }

  private boolean guardCheck_ts_sink() {
    return isDirty_ts_l9_n0
        | isDirty_ts_l9_n1
        | isDirty_ts_l9_n2
        | isDirty_ts_l9_n3
        | isDirty_ts_l9_n4;
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
