/*
 * Copyright: © 2025.  Gregory Higgins <greg.higgins@v12technology.com> - All Rights Reserved
 * This source code is protected under international copyright law.  All rights
 * reserved and protected by the copyright holders.
 * This file is confidential and only available to authorized individuals with the
 * permission of the copyright holders.  If you encounter this file and do not have
 * permission, please contact the copyright holders and delete this file.
 */
package com.telamin.fluxtion.test.performance.generated.intermediate;

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
import com.telamin.fluxtion.test.performance.events.MarketDataEvent;
import com.telamin.fluxtion.test.performance.events.TradeSignalEvent;
import com.telamin.fluxtion.test.performance.nodes.IntermediateHandlersNode;
import com.telamin.fluxtion.test.performance.nodes.IntermediateHandlersPublisherNode;
import com.telamin.fluxtion.test.performance.nodes.IntermediateHandlersRootNode;
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
 *   <li>com.telamin.fluxtion.test.performance.events.MarketDataEvent
 *   <li>com.telamin.fluxtion.test.performance.events.TradeSignalEvent
 * </ul>
 *
 * @author Greg Higgins
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public class IntermediateHandlers100Processor
    implements CloneableDataFlow<IntermediateHandlers100Processor>,
        /*--- @ExportService start ---*/
        @ExportService ServiceListener,
        /*--- @ExportService end ---*/
        DataFlow,
        InternalEventProcessor,
        BatchHandler {

  //Node declarations
  private final transient CallbackDispatcherImpl callbackDispatcher = new CallbackDispatcherImpl();
  public final transient Clock clock = new Clock();
  private final transient IntermediateHandlersRootNode intermediateHandlersRootNode_101 =
      new IntermediateHandlersRootNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_100 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_99 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_98 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_97 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_96 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_95 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_94 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_93 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_92 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_91 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_90 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_89 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_88 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_87 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_86 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_85 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_84 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_83 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_82 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_81 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_80 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_79 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_78 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_77 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_76 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_75 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_74 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_73 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_72 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_71 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_70 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_69 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_68 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_67 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_66 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_65 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_64 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_63 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_62 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_61 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_60 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_59 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_58 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_57 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_56 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_55 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_54 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_53 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_52 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_51 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_50 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_49 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_48 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_47 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_46 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_45 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_44 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_43 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_42 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_41 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_40 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_39 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_38 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_37 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_36 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_35 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_34 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_33 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_32 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_31 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_30 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_29 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_28 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_27 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_26 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_25 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_24 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_23 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_22 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_21 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_20 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_19 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_18 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_17 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_16 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_15 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_14 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_13 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_12 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_11 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_10 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_9 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_8 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_7 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_6 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_5 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_4 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_3 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_2 =
      new IntermediateHandlersNode();
  private final transient IntermediateHandlersNode intermediateHandlersNode_1 =
      new IntermediateHandlersNode();
  public final transient NodeNameAuditor nodeNameLookup = new NodeNameAuditor();
  public final transient IntermediateHandlersPublisherNode sink =
      new IntermediateHandlersPublisherNode();
  private final transient SubscriptionManagerNode subscriptionManager =
      new SubscriptionManagerNode();
  private final transient MutableDataFlowContext context =
      new com.telamin.fluxtion.runtime.node.MutableDataFlowContext(
          nodeNameLookup, callbackDispatcher, subscriptionManager, callbackDispatcher);;
  public final transient ServiceRegistryNode serviceRegistry = new ServiceRegistryNode();
  private final transient ExportFunctionAuditEvent functionAudit = new ExportFunctionAuditEvent();
  //Dirty flags
  private boolean initCalled = false;
  private boolean processing = false;
  private boolean buffering = false;
  private final transient IdentityHashMap<Object, BooleanSupplier> dirtyFlagSupplierMap =
      new IdentityHashMap<>(101);
  private final transient IdentityHashMap<Object, Consumer<Boolean>> dirtyFlagUpdateMap =
      new IdentityHashMap<>(101);

  private boolean isDirty_intermediateHandlersNode_1 = false;
  private boolean isDirty_intermediateHandlersNode_2 = false;
  private boolean isDirty_intermediateHandlersNode_3 = false;
  private boolean isDirty_intermediateHandlersNode_4 = false;
  private boolean isDirty_intermediateHandlersNode_5 = false;
  private boolean isDirty_intermediateHandlersNode_6 = false;
  private boolean isDirty_intermediateHandlersNode_7 = false;
  private boolean isDirty_intermediateHandlersNode_8 = false;
  private boolean isDirty_intermediateHandlersNode_9 = false;
  private boolean isDirty_intermediateHandlersNode_10 = false;
  private boolean isDirty_intermediateHandlersNode_11 = false;
  private boolean isDirty_intermediateHandlersNode_12 = false;
  private boolean isDirty_intermediateHandlersNode_13 = false;
  private boolean isDirty_intermediateHandlersNode_14 = false;
  private boolean isDirty_intermediateHandlersNode_15 = false;
  private boolean isDirty_intermediateHandlersNode_16 = false;
  private boolean isDirty_intermediateHandlersNode_17 = false;
  private boolean isDirty_intermediateHandlersNode_18 = false;
  private boolean isDirty_intermediateHandlersNode_19 = false;
  private boolean isDirty_intermediateHandlersNode_20 = false;
  private boolean isDirty_intermediateHandlersNode_21 = false;
  private boolean isDirty_intermediateHandlersNode_22 = false;
  private boolean isDirty_intermediateHandlersNode_23 = false;
  private boolean isDirty_intermediateHandlersNode_24 = false;
  private boolean isDirty_intermediateHandlersNode_25 = false;
  private boolean isDirty_intermediateHandlersNode_26 = false;
  private boolean isDirty_intermediateHandlersNode_27 = false;
  private boolean isDirty_intermediateHandlersNode_28 = false;
  private boolean isDirty_intermediateHandlersNode_29 = false;
  private boolean isDirty_intermediateHandlersNode_30 = false;
  private boolean isDirty_intermediateHandlersNode_31 = false;
  private boolean isDirty_intermediateHandlersNode_32 = false;
  private boolean isDirty_intermediateHandlersNode_33 = false;
  private boolean isDirty_intermediateHandlersNode_34 = false;
  private boolean isDirty_intermediateHandlersNode_35 = false;
  private boolean isDirty_intermediateHandlersNode_36 = false;
  private boolean isDirty_intermediateHandlersNode_37 = false;
  private boolean isDirty_intermediateHandlersNode_38 = false;
  private boolean isDirty_intermediateHandlersNode_39 = false;
  private boolean isDirty_intermediateHandlersNode_40 = false;
  private boolean isDirty_intermediateHandlersNode_41 = false;
  private boolean isDirty_intermediateHandlersNode_42 = false;
  private boolean isDirty_intermediateHandlersNode_43 = false;
  private boolean isDirty_intermediateHandlersNode_44 = false;
  private boolean isDirty_intermediateHandlersNode_45 = false;
  private boolean isDirty_intermediateHandlersNode_46 = false;
  private boolean isDirty_intermediateHandlersNode_47 = false;
  private boolean isDirty_intermediateHandlersNode_48 = false;
  private boolean isDirty_intermediateHandlersNode_49 = false;
  private boolean isDirty_intermediateHandlersNode_50 = false;
  private boolean isDirty_intermediateHandlersNode_51 = false;
  private boolean isDirty_intermediateHandlersNode_52 = false;
  private boolean isDirty_intermediateHandlersNode_53 = false;
  private boolean isDirty_intermediateHandlersNode_54 = false;
  private boolean isDirty_intermediateHandlersNode_55 = false;
  private boolean isDirty_intermediateHandlersNode_56 = false;
  private boolean isDirty_intermediateHandlersNode_57 = false;
  private boolean isDirty_intermediateHandlersNode_58 = false;
  private boolean isDirty_intermediateHandlersNode_59 = false;
  private boolean isDirty_intermediateHandlersNode_60 = false;
  private boolean isDirty_intermediateHandlersNode_61 = false;
  private boolean isDirty_intermediateHandlersNode_62 = false;
  private boolean isDirty_intermediateHandlersNode_63 = false;
  private boolean isDirty_intermediateHandlersNode_64 = false;
  private boolean isDirty_intermediateHandlersNode_65 = false;
  private boolean isDirty_intermediateHandlersNode_66 = false;
  private boolean isDirty_intermediateHandlersNode_67 = false;
  private boolean isDirty_intermediateHandlersNode_68 = false;
  private boolean isDirty_intermediateHandlersNode_69 = false;
  private boolean isDirty_intermediateHandlersNode_70 = false;
  private boolean isDirty_intermediateHandlersNode_71 = false;
  private boolean isDirty_intermediateHandlersNode_72 = false;
  private boolean isDirty_intermediateHandlersNode_73 = false;
  private boolean isDirty_intermediateHandlersNode_74 = false;
  private boolean isDirty_intermediateHandlersNode_75 = false;
  private boolean isDirty_intermediateHandlersNode_76 = false;
  private boolean isDirty_intermediateHandlersNode_77 = false;
  private boolean isDirty_intermediateHandlersNode_78 = false;
  private boolean isDirty_intermediateHandlersNode_79 = false;
  private boolean isDirty_intermediateHandlersNode_80 = false;
  private boolean isDirty_intermediateHandlersNode_81 = false;
  private boolean isDirty_intermediateHandlersNode_82 = false;
  private boolean isDirty_intermediateHandlersNode_83 = false;
  private boolean isDirty_intermediateHandlersNode_84 = false;
  private boolean isDirty_intermediateHandlersNode_85 = false;
  private boolean isDirty_intermediateHandlersNode_86 = false;
  private boolean isDirty_intermediateHandlersNode_87 = false;
  private boolean isDirty_intermediateHandlersNode_88 = false;
  private boolean isDirty_intermediateHandlersNode_89 = false;
  private boolean isDirty_intermediateHandlersNode_90 = false;
  private boolean isDirty_intermediateHandlersNode_91 = false;
  private boolean isDirty_intermediateHandlersNode_92 = false;
  private boolean isDirty_intermediateHandlersNode_93 = false;
  private boolean isDirty_intermediateHandlersNode_94 = false;
  private boolean isDirty_intermediateHandlersNode_95 = false;
  private boolean isDirty_intermediateHandlersNode_96 = false;
  private boolean isDirty_intermediateHandlersNode_97 = false;
  private boolean isDirty_intermediateHandlersNode_98 = false;
  private boolean isDirty_intermediateHandlersNode_99 = false;
  private boolean isDirty_intermediateHandlersNode_100 = false;
  private boolean isDirty_intermediateHandlersRootNode_101 = false;

  //Forked declarations

  //Filter constants

  //unknown event handler
  private Consumer unKnownEventHandler = (e) -> {};

  public IntermediateHandlers100Processor(Map<Object, Object> contextMap) {
    if (context != null) {
      context.replaceMappings(contextMap);
    }
    context.setClock(clock);
    serviceRegistry.setDataFlowContext(context);
    intermediateHandlersNode_1.setUpstream1(intermediateHandlersNode_2);
    intermediateHandlersNode_1.value = 0.0;
    intermediateHandlersNode_1.upstream1 = intermediateHandlersNode_2;
    intermediateHandlersNode_2.setUpstream1(intermediateHandlersNode_3);
    intermediateHandlersNode_2.value = 0.0;
    intermediateHandlersNode_2.upstream1 = intermediateHandlersNode_3;
    intermediateHandlersNode_3.setUpstream1(intermediateHandlersNode_4);
    intermediateHandlersNode_3.value = 0.0;
    intermediateHandlersNode_3.upstream1 = intermediateHandlersNode_4;
    intermediateHandlersNode_4.setUpstream1(intermediateHandlersNode_5);
    intermediateHandlersNode_4.value = 0.0;
    intermediateHandlersNode_4.upstream1 = intermediateHandlersNode_5;
    intermediateHandlersNode_5.setUpstream1(intermediateHandlersNode_6);
    intermediateHandlersNode_5.value = 0.0;
    intermediateHandlersNode_5.upstream1 = intermediateHandlersNode_6;
    intermediateHandlersNode_6.setUpstream1(intermediateHandlersNode_7);
    intermediateHandlersNode_6.value = 0.0;
    intermediateHandlersNode_6.upstream1 = intermediateHandlersNode_7;
    intermediateHandlersNode_7.setUpstream1(intermediateHandlersNode_8);
    intermediateHandlersNode_7.value = 0.0;
    intermediateHandlersNode_7.upstream1 = intermediateHandlersNode_8;
    intermediateHandlersNode_8.setUpstream1(intermediateHandlersNode_9);
    intermediateHandlersNode_8.value = 0.0;
    intermediateHandlersNode_8.upstream1 = intermediateHandlersNode_9;
    intermediateHandlersNode_9.setUpstream1(intermediateHandlersNode_10);
    intermediateHandlersNode_9.value = 0.0;
    intermediateHandlersNode_9.upstream1 = intermediateHandlersNode_10;
    intermediateHandlersNode_10.setUpstream1(intermediateHandlersNode_11);
    intermediateHandlersNode_10.value = 0.0;
    intermediateHandlersNode_10.upstream1 = intermediateHandlersNode_11;
    intermediateHandlersNode_11.setUpstream1(intermediateHandlersNode_12);
    intermediateHandlersNode_11.value = 0.0;
    intermediateHandlersNode_11.upstream1 = intermediateHandlersNode_12;
    intermediateHandlersNode_12.setUpstream1(intermediateHandlersNode_13);
    intermediateHandlersNode_12.value = 0.0;
    intermediateHandlersNode_12.upstream1 = intermediateHandlersNode_13;
    intermediateHandlersNode_13.setUpstream1(intermediateHandlersNode_14);
    intermediateHandlersNode_13.value = 0.0;
    intermediateHandlersNode_13.upstream1 = intermediateHandlersNode_14;
    intermediateHandlersNode_14.setUpstream1(intermediateHandlersNode_15);
    intermediateHandlersNode_14.value = 0.0;
    intermediateHandlersNode_14.upstream1 = intermediateHandlersNode_15;
    intermediateHandlersNode_15.setUpstream1(intermediateHandlersNode_16);
    intermediateHandlersNode_15.value = 0.0;
    intermediateHandlersNode_15.upstream1 = intermediateHandlersNode_16;
    intermediateHandlersNode_16.setUpstream1(intermediateHandlersNode_17);
    intermediateHandlersNode_16.value = 0.0;
    intermediateHandlersNode_16.upstream1 = intermediateHandlersNode_17;
    intermediateHandlersNode_17.setUpstream1(intermediateHandlersNode_18);
    intermediateHandlersNode_17.value = 0.0;
    intermediateHandlersNode_17.upstream1 = intermediateHandlersNode_18;
    intermediateHandlersNode_18.setUpstream1(intermediateHandlersNode_19);
    intermediateHandlersNode_18.value = 0.0;
    intermediateHandlersNode_18.upstream1 = intermediateHandlersNode_19;
    intermediateHandlersNode_19.setUpstream1(intermediateHandlersNode_20);
    intermediateHandlersNode_19.value = 0.0;
    intermediateHandlersNode_19.upstream1 = intermediateHandlersNode_20;
    intermediateHandlersNode_20.setUpstream1(intermediateHandlersNode_21);
    intermediateHandlersNode_20.value = 0.0;
    intermediateHandlersNode_20.upstream1 = intermediateHandlersNode_21;
    intermediateHandlersNode_21.setUpstream1(intermediateHandlersNode_22);
    intermediateHandlersNode_21.value = 0.0;
    intermediateHandlersNode_21.upstream1 = intermediateHandlersNode_22;
    intermediateHandlersNode_22.setUpstream1(intermediateHandlersNode_23);
    intermediateHandlersNode_22.value = 0.0;
    intermediateHandlersNode_22.upstream1 = intermediateHandlersNode_23;
    intermediateHandlersNode_23.setUpstream1(intermediateHandlersNode_24);
    intermediateHandlersNode_23.value = 0.0;
    intermediateHandlersNode_23.upstream1 = intermediateHandlersNode_24;
    intermediateHandlersNode_24.setUpstream1(intermediateHandlersNode_25);
    intermediateHandlersNode_24.value = 0.0;
    intermediateHandlersNode_24.upstream1 = intermediateHandlersNode_25;
    intermediateHandlersNode_25.setUpstream1(intermediateHandlersNode_26);
    intermediateHandlersNode_25.value = 0.0;
    intermediateHandlersNode_25.upstream1 = intermediateHandlersNode_26;
    intermediateHandlersNode_26.setUpstream1(intermediateHandlersNode_27);
    intermediateHandlersNode_26.value = 0.0;
    intermediateHandlersNode_26.upstream1 = intermediateHandlersNode_27;
    intermediateHandlersNode_27.setUpstream1(intermediateHandlersNode_28);
    intermediateHandlersNode_27.value = 0.0;
    intermediateHandlersNode_27.upstream1 = intermediateHandlersNode_28;
    intermediateHandlersNode_28.setUpstream1(intermediateHandlersNode_29);
    intermediateHandlersNode_28.value = 0.0;
    intermediateHandlersNode_28.upstream1 = intermediateHandlersNode_29;
    intermediateHandlersNode_29.setUpstream1(intermediateHandlersNode_30);
    intermediateHandlersNode_29.value = 0.0;
    intermediateHandlersNode_29.upstream1 = intermediateHandlersNode_30;
    intermediateHandlersNode_30.setUpstream1(intermediateHandlersNode_31);
    intermediateHandlersNode_30.value = 0.0;
    intermediateHandlersNode_30.upstream1 = intermediateHandlersNode_31;
    intermediateHandlersNode_31.setUpstream1(intermediateHandlersNode_32);
    intermediateHandlersNode_31.value = 0.0;
    intermediateHandlersNode_31.upstream1 = intermediateHandlersNode_32;
    intermediateHandlersNode_32.setUpstream1(intermediateHandlersNode_33);
    intermediateHandlersNode_32.value = 0.0;
    intermediateHandlersNode_32.upstream1 = intermediateHandlersNode_33;
    intermediateHandlersNode_33.setUpstream1(intermediateHandlersNode_34);
    intermediateHandlersNode_33.value = 0.0;
    intermediateHandlersNode_33.upstream1 = intermediateHandlersNode_34;
    intermediateHandlersNode_34.setUpstream1(intermediateHandlersNode_35);
    intermediateHandlersNode_34.value = 0.0;
    intermediateHandlersNode_34.upstream1 = intermediateHandlersNode_35;
    intermediateHandlersNode_35.setUpstream1(intermediateHandlersNode_36);
    intermediateHandlersNode_35.value = 0.0;
    intermediateHandlersNode_35.upstream1 = intermediateHandlersNode_36;
    intermediateHandlersNode_36.setUpstream1(intermediateHandlersNode_37);
    intermediateHandlersNode_36.value = 0.0;
    intermediateHandlersNode_36.upstream1 = intermediateHandlersNode_37;
    intermediateHandlersNode_37.setUpstream1(intermediateHandlersNode_38);
    intermediateHandlersNode_37.value = 0.0;
    intermediateHandlersNode_37.upstream1 = intermediateHandlersNode_38;
    intermediateHandlersNode_38.setUpstream1(intermediateHandlersNode_39);
    intermediateHandlersNode_38.value = 0.0;
    intermediateHandlersNode_38.upstream1 = intermediateHandlersNode_39;
    intermediateHandlersNode_39.setUpstream1(intermediateHandlersNode_40);
    intermediateHandlersNode_39.value = 0.0;
    intermediateHandlersNode_39.upstream1 = intermediateHandlersNode_40;
    intermediateHandlersNode_40.setUpstream1(intermediateHandlersNode_41);
    intermediateHandlersNode_40.value = 0.0;
    intermediateHandlersNode_40.upstream1 = intermediateHandlersNode_41;
    intermediateHandlersNode_41.setUpstream1(intermediateHandlersNode_42);
    intermediateHandlersNode_41.value = 0.0;
    intermediateHandlersNode_41.upstream1 = intermediateHandlersNode_42;
    intermediateHandlersNode_42.setUpstream1(intermediateHandlersNode_43);
    intermediateHandlersNode_42.value = 0.0;
    intermediateHandlersNode_42.upstream1 = intermediateHandlersNode_43;
    intermediateHandlersNode_43.setUpstream1(intermediateHandlersNode_44);
    intermediateHandlersNode_43.value = 0.0;
    intermediateHandlersNode_43.upstream1 = intermediateHandlersNode_44;
    intermediateHandlersNode_44.setUpstream1(intermediateHandlersNode_45);
    intermediateHandlersNode_44.value = 0.0;
    intermediateHandlersNode_44.upstream1 = intermediateHandlersNode_45;
    intermediateHandlersNode_45.setUpstream1(intermediateHandlersNode_46);
    intermediateHandlersNode_45.value = 0.0;
    intermediateHandlersNode_45.upstream1 = intermediateHandlersNode_46;
    intermediateHandlersNode_46.setUpstream1(intermediateHandlersNode_47);
    intermediateHandlersNode_46.value = 0.0;
    intermediateHandlersNode_46.upstream1 = intermediateHandlersNode_47;
    intermediateHandlersNode_47.setUpstream1(intermediateHandlersNode_48);
    intermediateHandlersNode_47.value = 0.0;
    intermediateHandlersNode_47.upstream1 = intermediateHandlersNode_48;
    intermediateHandlersNode_48.setUpstream1(intermediateHandlersNode_49);
    intermediateHandlersNode_48.value = 0.0;
    intermediateHandlersNode_48.upstream1 = intermediateHandlersNode_49;
    intermediateHandlersNode_49.setUpstream1(intermediateHandlersNode_50);
    intermediateHandlersNode_49.value = 0.0;
    intermediateHandlersNode_49.upstream1 = intermediateHandlersNode_50;
    intermediateHandlersNode_50.setUpstream1(intermediateHandlersNode_51);
    intermediateHandlersNode_50.value = 0.0;
    intermediateHandlersNode_50.upstream1 = intermediateHandlersNode_51;
    intermediateHandlersNode_51.setUpstream1(intermediateHandlersNode_52);
    intermediateHandlersNode_51.value = 0.0;
    intermediateHandlersNode_51.upstream1 = intermediateHandlersNode_52;
    intermediateHandlersNode_52.setUpstream1(intermediateHandlersNode_53);
    intermediateHandlersNode_52.value = 0.0;
    intermediateHandlersNode_52.upstream1 = intermediateHandlersNode_53;
    intermediateHandlersNode_53.setUpstream1(intermediateHandlersNode_54);
    intermediateHandlersNode_53.value = 0.0;
    intermediateHandlersNode_53.upstream1 = intermediateHandlersNode_54;
    intermediateHandlersNode_54.setUpstream1(intermediateHandlersNode_55);
    intermediateHandlersNode_54.value = 0.0;
    intermediateHandlersNode_54.upstream1 = intermediateHandlersNode_55;
    intermediateHandlersNode_55.setUpstream1(intermediateHandlersNode_56);
    intermediateHandlersNode_55.value = 0.0;
    intermediateHandlersNode_55.upstream1 = intermediateHandlersNode_56;
    intermediateHandlersNode_56.setUpstream1(intermediateHandlersNode_57);
    intermediateHandlersNode_56.value = 0.0;
    intermediateHandlersNode_56.upstream1 = intermediateHandlersNode_57;
    intermediateHandlersNode_57.setUpstream1(intermediateHandlersNode_58);
    intermediateHandlersNode_57.value = 0.0;
    intermediateHandlersNode_57.upstream1 = intermediateHandlersNode_58;
    intermediateHandlersNode_58.setUpstream1(intermediateHandlersNode_59);
    intermediateHandlersNode_58.value = 0.0;
    intermediateHandlersNode_58.upstream1 = intermediateHandlersNode_59;
    intermediateHandlersNode_59.setUpstream1(intermediateHandlersNode_60);
    intermediateHandlersNode_59.value = 0.0;
    intermediateHandlersNode_59.upstream1 = intermediateHandlersNode_60;
    intermediateHandlersNode_60.setUpstream1(intermediateHandlersNode_61);
    intermediateHandlersNode_60.value = 0.0;
    intermediateHandlersNode_60.upstream1 = intermediateHandlersNode_61;
    intermediateHandlersNode_61.setUpstream1(intermediateHandlersNode_62);
    intermediateHandlersNode_61.value = 0.0;
    intermediateHandlersNode_61.upstream1 = intermediateHandlersNode_62;
    intermediateHandlersNode_62.setUpstream1(intermediateHandlersNode_63);
    intermediateHandlersNode_62.value = 0.0;
    intermediateHandlersNode_62.upstream1 = intermediateHandlersNode_63;
    intermediateHandlersNode_63.setUpstream1(intermediateHandlersNode_64);
    intermediateHandlersNode_63.value = 0.0;
    intermediateHandlersNode_63.upstream1 = intermediateHandlersNode_64;
    intermediateHandlersNode_64.setUpstream1(intermediateHandlersNode_65);
    intermediateHandlersNode_64.value = 0.0;
    intermediateHandlersNode_64.upstream1 = intermediateHandlersNode_65;
    intermediateHandlersNode_65.setUpstream1(intermediateHandlersNode_66);
    intermediateHandlersNode_65.value = 0.0;
    intermediateHandlersNode_65.upstream1 = intermediateHandlersNode_66;
    intermediateHandlersNode_66.setUpstream1(intermediateHandlersNode_67);
    intermediateHandlersNode_66.value = 0.0;
    intermediateHandlersNode_66.upstream1 = intermediateHandlersNode_67;
    intermediateHandlersNode_67.setUpstream1(intermediateHandlersNode_68);
    intermediateHandlersNode_67.value = 0.0;
    intermediateHandlersNode_67.upstream1 = intermediateHandlersNode_68;
    intermediateHandlersNode_68.setUpstream1(intermediateHandlersNode_69);
    intermediateHandlersNode_68.value = 0.0;
    intermediateHandlersNode_68.upstream1 = intermediateHandlersNode_69;
    intermediateHandlersNode_69.setUpstream1(intermediateHandlersNode_70);
    intermediateHandlersNode_69.value = 0.0;
    intermediateHandlersNode_69.upstream1 = intermediateHandlersNode_70;
    intermediateHandlersNode_70.setUpstream1(intermediateHandlersNode_71);
    intermediateHandlersNode_70.value = 0.0;
    intermediateHandlersNode_70.upstream1 = intermediateHandlersNode_71;
    intermediateHandlersNode_71.setUpstream1(intermediateHandlersNode_72);
    intermediateHandlersNode_71.value = 0.0;
    intermediateHandlersNode_71.upstream1 = intermediateHandlersNode_72;
    intermediateHandlersNode_72.setUpstream1(intermediateHandlersNode_73);
    intermediateHandlersNode_72.value = 0.0;
    intermediateHandlersNode_72.upstream1 = intermediateHandlersNode_73;
    intermediateHandlersNode_73.setUpstream1(intermediateHandlersNode_74);
    intermediateHandlersNode_73.value = 0.0;
    intermediateHandlersNode_73.upstream1 = intermediateHandlersNode_74;
    intermediateHandlersNode_74.setUpstream1(intermediateHandlersNode_75);
    intermediateHandlersNode_74.value = 0.0;
    intermediateHandlersNode_74.upstream1 = intermediateHandlersNode_75;
    intermediateHandlersNode_75.setUpstream1(intermediateHandlersNode_76);
    intermediateHandlersNode_75.value = 0.0;
    intermediateHandlersNode_75.upstream1 = intermediateHandlersNode_76;
    intermediateHandlersNode_76.setUpstream1(intermediateHandlersNode_77);
    intermediateHandlersNode_76.value = 0.0;
    intermediateHandlersNode_76.upstream1 = intermediateHandlersNode_77;
    intermediateHandlersNode_77.setUpstream1(intermediateHandlersNode_78);
    intermediateHandlersNode_77.value = 0.0;
    intermediateHandlersNode_77.upstream1 = intermediateHandlersNode_78;
    intermediateHandlersNode_78.setUpstream1(intermediateHandlersNode_79);
    intermediateHandlersNode_78.value = 0.0;
    intermediateHandlersNode_78.upstream1 = intermediateHandlersNode_79;
    intermediateHandlersNode_79.setUpstream1(intermediateHandlersNode_80);
    intermediateHandlersNode_79.value = 0.0;
    intermediateHandlersNode_79.upstream1 = intermediateHandlersNode_80;
    intermediateHandlersNode_80.setUpstream1(intermediateHandlersNode_81);
    intermediateHandlersNode_80.value = 0.0;
    intermediateHandlersNode_80.upstream1 = intermediateHandlersNode_81;
    intermediateHandlersNode_81.setUpstream1(intermediateHandlersNode_82);
    intermediateHandlersNode_81.value = 0.0;
    intermediateHandlersNode_81.upstream1 = intermediateHandlersNode_82;
    intermediateHandlersNode_82.setUpstream1(intermediateHandlersNode_83);
    intermediateHandlersNode_82.value = 0.0;
    intermediateHandlersNode_82.upstream1 = intermediateHandlersNode_83;
    intermediateHandlersNode_83.setUpstream1(intermediateHandlersNode_84);
    intermediateHandlersNode_83.value = 0.0;
    intermediateHandlersNode_83.upstream1 = intermediateHandlersNode_84;
    intermediateHandlersNode_84.setUpstream1(intermediateHandlersNode_85);
    intermediateHandlersNode_84.value = 0.0;
    intermediateHandlersNode_84.upstream1 = intermediateHandlersNode_85;
    intermediateHandlersNode_85.setUpstream1(intermediateHandlersNode_86);
    intermediateHandlersNode_85.value = 0.0;
    intermediateHandlersNode_85.upstream1 = intermediateHandlersNode_86;
    intermediateHandlersNode_86.setUpstream1(intermediateHandlersNode_87);
    intermediateHandlersNode_86.value = 0.0;
    intermediateHandlersNode_86.upstream1 = intermediateHandlersNode_87;
    intermediateHandlersNode_87.setUpstream1(intermediateHandlersNode_88);
    intermediateHandlersNode_87.value = 0.0;
    intermediateHandlersNode_87.upstream1 = intermediateHandlersNode_88;
    intermediateHandlersNode_88.setUpstream1(intermediateHandlersNode_89);
    intermediateHandlersNode_88.value = 0.0;
    intermediateHandlersNode_88.upstream1 = intermediateHandlersNode_89;
    intermediateHandlersNode_89.setUpstream1(intermediateHandlersNode_90);
    intermediateHandlersNode_89.value = 0.0;
    intermediateHandlersNode_89.upstream1 = intermediateHandlersNode_90;
    intermediateHandlersNode_90.setUpstream1(intermediateHandlersNode_91);
    intermediateHandlersNode_90.value = 0.0;
    intermediateHandlersNode_90.upstream1 = intermediateHandlersNode_91;
    intermediateHandlersNode_91.setUpstream1(intermediateHandlersNode_92);
    intermediateHandlersNode_91.value = 0.0;
    intermediateHandlersNode_91.upstream1 = intermediateHandlersNode_92;
    intermediateHandlersNode_92.setUpstream1(intermediateHandlersNode_93);
    intermediateHandlersNode_92.value = 0.0;
    intermediateHandlersNode_92.upstream1 = intermediateHandlersNode_93;
    intermediateHandlersNode_93.setUpstream1(intermediateHandlersNode_94);
    intermediateHandlersNode_93.value = 0.0;
    intermediateHandlersNode_93.upstream1 = intermediateHandlersNode_94;
    intermediateHandlersNode_94.setUpstream1(intermediateHandlersNode_95);
    intermediateHandlersNode_94.value = 0.0;
    intermediateHandlersNode_94.upstream1 = intermediateHandlersNode_95;
    intermediateHandlersNode_95.setUpstream1(intermediateHandlersNode_96);
    intermediateHandlersNode_95.value = 0.0;
    intermediateHandlersNode_95.upstream1 = intermediateHandlersNode_96;
    intermediateHandlersNode_96.setUpstream1(intermediateHandlersNode_97);
    intermediateHandlersNode_96.value = 0.0;
    intermediateHandlersNode_96.upstream1 = intermediateHandlersNode_97;
    intermediateHandlersNode_97.setUpstream1(intermediateHandlersNode_98);
    intermediateHandlersNode_97.value = 0.0;
    intermediateHandlersNode_97.upstream1 = intermediateHandlersNode_98;
    intermediateHandlersNode_98.setUpstream1(intermediateHandlersNode_99);
    intermediateHandlersNode_98.value = 0.0;
    intermediateHandlersNode_98.upstream1 = intermediateHandlersNode_99;
    intermediateHandlersNode_99.setUpstream1(intermediateHandlersNode_100);
    intermediateHandlersNode_99.value = 0.0;
    intermediateHandlersNode_99.upstream1 = intermediateHandlersNode_100;
    intermediateHandlersNode_100.setUpstream1(intermediateHandlersRootNode_101);
    intermediateHandlersNode_100.value = 0.0;
    intermediateHandlersNode_100.upstream1 = intermediateHandlersRootNode_101;
    sink.setUpstream1(intermediateHandlersNode_1);
    sink.upstream1 = intermediateHandlersNode_1;
    sink.value = 0.0;
    intermediateHandlersRootNode_101.value = 0.0;
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

  public IntermediateHandlers100Processor() {
    this(null);
  }

  @Override
  public void init() {
    initCalled = true;
    auditEvent(Lifecycle.LifecycleEvent.Init);
    //initialise dirty lookup map
    isDirty("test");
    clock.init();
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
    } else if (event instanceof MarketDataEvent) {
      MarketDataEvent typedEvent = (MarketDataEvent) event;
      handleEvent(typedEvent);
    } else if (event instanceof TradeSignalEvent) {
      TradeSignalEvent typedEvent = (TradeSignalEvent) event;
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

  public void handleEvent(MarketDataEvent typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    isDirty_intermediateHandlersRootNode_101 =
        intermediateHandlersRootNode_101.onMarketData(typedEvent);
    commonDispatchTail_1(typedEvent);
    afterEvent();
  }

  public void handleEvent(TradeSignalEvent typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    isDirty_intermediateHandlersRootNode_101 =
        intermediateHandlersRootNode_101.onTradeSignal(typedEvent);
    commonDispatchTail_1(typedEvent);
    afterEvent();
  }
  //EVENT DISPATCH - END

  //MERGED DISPATCH HELPERS - START

  private void commonDispatchTail_1(Object typedEvent) {
    if (guardCheck_intermediateHandlersNode_100()) {
      isDirty_intermediateHandlersNode_100 = intermediateHandlersNode_100.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_99()) {
      isDirty_intermediateHandlersNode_99 = intermediateHandlersNode_99.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_98()) {
      isDirty_intermediateHandlersNode_98 = intermediateHandlersNode_98.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_97()) {
      isDirty_intermediateHandlersNode_97 = intermediateHandlersNode_97.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_96()) {
      isDirty_intermediateHandlersNode_96 = intermediateHandlersNode_96.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_95()) {
      isDirty_intermediateHandlersNode_95 = intermediateHandlersNode_95.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_94()) {
      isDirty_intermediateHandlersNode_94 = intermediateHandlersNode_94.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_93()) {
      isDirty_intermediateHandlersNode_93 = intermediateHandlersNode_93.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_92()) {
      isDirty_intermediateHandlersNode_92 = intermediateHandlersNode_92.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_91()) {
      isDirty_intermediateHandlersNode_91 = intermediateHandlersNode_91.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_90()) {
      isDirty_intermediateHandlersNode_90 = intermediateHandlersNode_90.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_89()) {
      isDirty_intermediateHandlersNode_89 = intermediateHandlersNode_89.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_88()) {
      isDirty_intermediateHandlersNode_88 = intermediateHandlersNode_88.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_87()) {
      isDirty_intermediateHandlersNode_87 = intermediateHandlersNode_87.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_86()) {
      isDirty_intermediateHandlersNode_86 = intermediateHandlersNode_86.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_85()) {
      isDirty_intermediateHandlersNode_85 = intermediateHandlersNode_85.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_84()) {
      isDirty_intermediateHandlersNode_84 = intermediateHandlersNode_84.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_83()) {
      isDirty_intermediateHandlersNode_83 = intermediateHandlersNode_83.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_82()) {
      isDirty_intermediateHandlersNode_82 = intermediateHandlersNode_82.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_81()) {
      isDirty_intermediateHandlersNode_81 = intermediateHandlersNode_81.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_80()) {
      isDirty_intermediateHandlersNode_80 = intermediateHandlersNode_80.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_79()) {
      isDirty_intermediateHandlersNode_79 = intermediateHandlersNode_79.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_78()) {
      isDirty_intermediateHandlersNode_78 = intermediateHandlersNode_78.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_77()) {
      isDirty_intermediateHandlersNode_77 = intermediateHandlersNode_77.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_76()) {
      isDirty_intermediateHandlersNode_76 = intermediateHandlersNode_76.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_75()) {
      isDirty_intermediateHandlersNode_75 = intermediateHandlersNode_75.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_74()) {
      isDirty_intermediateHandlersNode_74 = intermediateHandlersNode_74.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_73()) {
      isDirty_intermediateHandlersNode_73 = intermediateHandlersNode_73.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_72()) {
      isDirty_intermediateHandlersNode_72 = intermediateHandlersNode_72.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_71()) {
      isDirty_intermediateHandlersNode_71 = intermediateHandlersNode_71.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_70()) {
      isDirty_intermediateHandlersNode_70 = intermediateHandlersNode_70.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_69()) {
      isDirty_intermediateHandlersNode_69 = intermediateHandlersNode_69.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_68()) {
      isDirty_intermediateHandlersNode_68 = intermediateHandlersNode_68.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_67()) {
      isDirty_intermediateHandlersNode_67 = intermediateHandlersNode_67.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_66()) {
      isDirty_intermediateHandlersNode_66 = intermediateHandlersNode_66.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_65()) {
      isDirty_intermediateHandlersNode_65 = intermediateHandlersNode_65.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_64()) {
      isDirty_intermediateHandlersNode_64 = intermediateHandlersNode_64.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_63()) {
      isDirty_intermediateHandlersNode_63 = intermediateHandlersNode_63.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_62()) {
      isDirty_intermediateHandlersNode_62 = intermediateHandlersNode_62.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_61()) {
      isDirty_intermediateHandlersNode_61 = intermediateHandlersNode_61.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_60()) {
      isDirty_intermediateHandlersNode_60 = intermediateHandlersNode_60.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_59()) {
      isDirty_intermediateHandlersNode_59 = intermediateHandlersNode_59.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_58()) {
      isDirty_intermediateHandlersNode_58 = intermediateHandlersNode_58.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_57()) {
      isDirty_intermediateHandlersNode_57 = intermediateHandlersNode_57.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_56()) {
      isDirty_intermediateHandlersNode_56 = intermediateHandlersNode_56.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_55()) {
      isDirty_intermediateHandlersNode_55 = intermediateHandlersNode_55.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_54()) {
      isDirty_intermediateHandlersNode_54 = intermediateHandlersNode_54.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_53()) {
      isDirty_intermediateHandlersNode_53 = intermediateHandlersNode_53.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_52()) {
      isDirty_intermediateHandlersNode_52 = intermediateHandlersNode_52.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_51()) {
      isDirty_intermediateHandlersNode_51 = intermediateHandlersNode_51.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_50()) {
      isDirty_intermediateHandlersNode_50 = intermediateHandlersNode_50.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_49()) {
      isDirty_intermediateHandlersNode_49 = intermediateHandlersNode_49.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_48()) {
      isDirty_intermediateHandlersNode_48 = intermediateHandlersNode_48.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_47()) {
      isDirty_intermediateHandlersNode_47 = intermediateHandlersNode_47.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_46()) {
      isDirty_intermediateHandlersNode_46 = intermediateHandlersNode_46.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_45()) {
      isDirty_intermediateHandlersNode_45 = intermediateHandlersNode_45.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_44()) {
      isDirty_intermediateHandlersNode_44 = intermediateHandlersNode_44.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_43()) {
      isDirty_intermediateHandlersNode_43 = intermediateHandlersNode_43.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_42()) {
      isDirty_intermediateHandlersNode_42 = intermediateHandlersNode_42.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_41()) {
      isDirty_intermediateHandlersNode_41 = intermediateHandlersNode_41.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_40()) {
      isDirty_intermediateHandlersNode_40 = intermediateHandlersNode_40.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_39()) {
      isDirty_intermediateHandlersNode_39 = intermediateHandlersNode_39.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_38()) {
      isDirty_intermediateHandlersNode_38 = intermediateHandlersNode_38.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_37()) {
      isDirty_intermediateHandlersNode_37 = intermediateHandlersNode_37.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_36()) {
      isDirty_intermediateHandlersNode_36 = intermediateHandlersNode_36.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_35()) {
      isDirty_intermediateHandlersNode_35 = intermediateHandlersNode_35.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_34()) {
      isDirty_intermediateHandlersNode_34 = intermediateHandlersNode_34.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_33()) {
      isDirty_intermediateHandlersNode_33 = intermediateHandlersNode_33.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_32()) {
      isDirty_intermediateHandlersNode_32 = intermediateHandlersNode_32.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_31()) {
      isDirty_intermediateHandlersNode_31 = intermediateHandlersNode_31.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_30()) {
      isDirty_intermediateHandlersNode_30 = intermediateHandlersNode_30.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_29()) {
      isDirty_intermediateHandlersNode_29 = intermediateHandlersNode_29.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_28()) {
      isDirty_intermediateHandlersNode_28 = intermediateHandlersNode_28.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_27()) {
      isDirty_intermediateHandlersNode_27 = intermediateHandlersNode_27.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_26()) {
      isDirty_intermediateHandlersNode_26 = intermediateHandlersNode_26.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_25()) {
      isDirty_intermediateHandlersNode_25 = intermediateHandlersNode_25.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_24()) {
      isDirty_intermediateHandlersNode_24 = intermediateHandlersNode_24.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_23()) {
      isDirty_intermediateHandlersNode_23 = intermediateHandlersNode_23.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_22()) {
      isDirty_intermediateHandlersNode_22 = intermediateHandlersNode_22.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_21()) {
      isDirty_intermediateHandlersNode_21 = intermediateHandlersNode_21.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_20()) {
      isDirty_intermediateHandlersNode_20 = intermediateHandlersNode_20.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_19()) {
      isDirty_intermediateHandlersNode_19 = intermediateHandlersNode_19.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_18()) {
      isDirty_intermediateHandlersNode_18 = intermediateHandlersNode_18.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_17()) {
      isDirty_intermediateHandlersNode_17 = intermediateHandlersNode_17.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_16()) {
      isDirty_intermediateHandlersNode_16 = intermediateHandlersNode_16.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_15()) {
      isDirty_intermediateHandlersNode_15 = intermediateHandlersNode_15.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_14()) {
      isDirty_intermediateHandlersNode_14 = intermediateHandlersNode_14.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_13()) {
      isDirty_intermediateHandlersNode_13 = intermediateHandlersNode_13.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_12()) {
      isDirty_intermediateHandlersNode_12 = intermediateHandlersNode_12.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_11()) {
      isDirty_intermediateHandlersNode_11 = intermediateHandlersNode_11.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_10()) {
      isDirty_intermediateHandlersNode_10 = intermediateHandlersNode_10.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_9()) {
      isDirty_intermediateHandlersNode_9 = intermediateHandlersNode_9.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_8()) {
      isDirty_intermediateHandlersNode_8 = intermediateHandlersNode_8.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_7()) {
      isDirty_intermediateHandlersNode_7 = intermediateHandlersNode_7.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_6()) {
      isDirty_intermediateHandlersNode_6 = intermediateHandlersNode_6.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_5()) {
      isDirty_intermediateHandlersNode_5 = intermediateHandlersNode_5.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_4()) {
      isDirty_intermediateHandlersNode_4 = intermediateHandlersNode_4.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_3()) {
      isDirty_intermediateHandlersNode_3 = intermediateHandlersNode_3.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_2()) {
      isDirty_intermediateHandlersNode_2 = intermediateHandlersNode_2.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_1()) {
      isDirty_intermediateHandlersNode_1 = intermediateHandlersNode_1.onUpstream();
    }
    if (guardCheck_sink()) {
      sink.onUpstream();
    }
  }
  //MERGED DISPATCH HELPERS - END

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
    } else if (event instanceof MarketDataEvent) {
      MarketDataEvent typedEvent = (MarketDataEvent) event;
      auditEvent(typedEvent);
      isDirty_intermediateHandlersRootNode_101 =
          intermediateHandlersRootNode_101.onMarketData(typedEvent);
    } else if (event instanceof TradeSignalEvent) {
      TradeSignalEvent typedEvent = (TradeSignalEvent) event;
      auditEvent(typedEvent);
      isDirty_intermediateHandlersRootNode_101 =
          intermediateHandlersRootNode_101.onTradeSignal(typedEvent);
    }
  }

  public void triggerCalculation() {
    buffering = false;
    String typedEvent = "No event information - buffered dispatch";
    if (guardCheck_intermediateHandlersNode_100()) {
      isDirty_intermediateHandlersNode_100 = intermediateHandlersNode_100.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_99()) {
      isDirty_intermediateHandlersNode_99 = intermediateHandlersNode_99.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_98()) {
      isDirty_intermediateHandlersNode_98 = intermediateHandlersNode_98.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_97()) {
      isDirty_intermediateHandlersNode_97 = intermediateHandlersNode_97.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_96()) {
      isDirty_intermediateHandlersNode_96 = intermediateHandlersNode_96.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_95()) {
      isDirty_intermediateHandlersNode_95 = intermediateHandlersNode_95.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_94()) {
      isDirty_intermediateHandlersNode_94 = intermediateHandlersNode_94.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_93()) {
      isDirty_intermediateHandlersNode_93 = intermediateHandlersNode_93.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_92()) {
      isDirty_intermediateHandlersNode_92 = intermediateHandlersNode_92.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_91()) {
      isDirty_intermediateHandlersNode_91 = intermediateHandlersNode_91.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_90()) {
      isDirty_intermediateHandlersNode_90 = intermediateHandlersNode_90.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_89()) {
      isDirty_intermediateHandlersNode_89 = intermediateHandlersNode_89.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_88()) {
      isDirty_intermediateHandlersNode_88 = intermediateHandlersNode_88.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_87()) {
      isDirty_intermediateHandlersNode_87 = intermediateHandlersNode_87.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_86()) {
      isDirty_intermediateHandlersNode_86 = intermediateHandlersNode_86.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_85()) {
      isDirty_intermediateHandlersNode_85 = intermediateHandlersNode_85.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_84()) {
      isDirty_intermediateHandlersNode_84 = intermediateHandlersNode_84.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_83()) {
      isDirty_intermediateHandlersNode_83 = intermediateHandlersNode_83.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_82()) {
      isDirty_intermediateHandlersNode_82 = intermediateHandlersNode_82.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_81()) {
      isDirty_intermediateHandlersNode_81 = intermediateHandlersNode_81.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_80()) {
      isDirty_intermediateHandlersNode_80 = intermediateHandlersNode_80.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_79()) {
      isDirty_intermediateHandlersNode_79 = intermediateHandlersNode_79.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_78()) {
      isDirty_intermediateHandlersNode_78 = intermediateHandlersNode_78.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_77()) {
      isDirty_intermediateHandlersNode_77 = intermediateHandlersNode_77.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_76()) {
      isDirty_intermediateHandlersNode_76 = intermediateHandlersNode_76.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_75()) {
      isDirty_intermediateHandlersNode_75 = intermediateHandlersNode_75.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_74()) {
      isDirty_intermediateHandlersNode_74 = intermediateHandlersNode_74.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_73()) {
      isDirty_intermediateHandlersNode_73 = intermediateHandlersNode_73.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_72()) {
      isDirty_intermediateHandlersNode_72 = intermediateHandlersNode_72.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_71()) {
      isDirty_intermediateHandlersNode_71 = intermediateHandlersNode_71.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_70()) {
      isDirty_intermediateHandlersNode_70 = intermediateHandlersNode_70.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_69()) {
      isDirty_intermediateHandlersNode_69 = intermediateHandlersNode_69.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_68()) {
      isDirty_intermediateHandlersNode_68 = intermediateHandlersNode_68.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_67()) {
      isDirty_intermediateHandlersNode_67 = intermediateHandlersNode_67.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_66()) {
      isDirty_intermediateHandlersNode_66 = intermediateHandlersNode_66.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_65()) {
      isDirty_intermediateHandlersNode_65 = intermediateHandlersNode_65.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_64()) {
      isDirty_intermediateHandlersNode_64 = intermediateHandlersNode_64.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_63()) {
      isDirty_intermediateHandlersNode_63 = intermediateHandlersNode_63.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_62()) {
      isDirty_intermediateHandlersNode_62 = intermediateHandlersNode_62.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_61()) {
      isDirty_intermediateHandlersNode_61 = intermediateHandlersNode_61.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_60()) {
      isDirty_intermediateHandlersNode_60 = intermediateHandlersNode_60.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_59()) {
      isDirty_intermediateHandlersNode_59 = intermediateHandlersNode_59.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_58()) {
      isDirty_intermediateHandlersNode_58 = intermediateHandlersNode_58.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_57()) {
      isDirty_intermediateHandlersNode_57 = intermediateHandlersNode_57.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_56()) {
      isDirty_intermediateHandlersNode_56 = intermediateHandlersNode_56.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_55()) {
      isDirty_intermediateHandlersNode_55 = intermediateHandlersNode_55.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_54()) {
      isDirty_intermediateHandlersNode_54 = intermediateHandlersNode_54.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_53()) {
      isDirty_intermediateHandlersNode_53 = intermediateHandlersNode_53.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_52()) {
      isDirty_intermediateHandlersNode_52 = intermediateHandlersNode_52.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_51()) {
      isDirty_intermediateHandlersNode_51 = intermediateHandlersNode_51.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_50()) {
      isDirty_intermediateHandlersNode_50 = intermediateHandlersNode_50.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_49()) {
      isDirty_intermediateHandlersNode_49 = intermediateHandlersNode_49.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_48()) {
      isDirty_intermediateHandlersNode_48 = intermediateHandlersNode_48.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_47()) {
      isDirty_intermediateHandlersNode_47 = intermediateHandlersNode_47.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_46()) {
      isDirty_intermediateHandlersNode_46 = intermediateHandlersNode_46.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_45()) {
      isDirty_intermediateHandlersNode_45 = intermediateHandlersNode_45.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_44()) {
      isDirty_intermediateHandlersNode_44 = intermediateHandlersNode_44.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_43()) {
      isDirty_intermediateHandlersNode_43 = intermediateHandlersNode_43.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_42()) {
      isDirty_intermediateHandlersNode_42 = intermediateHandlersNode_42.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_41()) {
      isDirty_intermediateHandlersNode_41 = intermediateHandlersNode_41.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_40()) {
      isDirty_intermediateHandlersNode_40 = intermediateHandlersNode_40.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_39()) {
      isDirty_intermediateHandlersNode_39 = intermediateHandlersNode_39.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_38()) {
      isDirty_intermediateHandlersNode_38 = intermediateHandlersNode_38.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_37()) {
      isDirty_intermediateHandlersNode_37 = intermediateHandlersNode_37.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_36()) {
      isDirty_intermediateHandlersNode_36 = intermediateHandlersNode_36.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_35()) {
      isDirty_intermediateHandlersNode_35 = intermediateHandlersNode_35.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_34()) {
      isDirty_intermediateHandlersNode_34 = intermediateHandlersNode_34.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_33()) {
      isDirty_intermediateHandlersNode_33 = intermediateHandlersNode_33.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_32()) {
      isDirty_intermediateHandlersNode_32 = intermediateHandlersNode_32.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_31()) {
      isDirty_intermediateHandlersNode_31 = intermediateHandlersNode_31.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_30()) {
      isDirty_intermediateHandlersNode_30 = intermediateHandlersNode_30.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_29()) {
      isDirty_intermediateHandlersNode_29 = intermediateHandlersNode_29.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_28()) {
      isDirty_intermediateHandlersNode_28 = intermediateHandlersNode_28.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_27()) {
      isDirty_intermediateHandlersNode_27 = intermediateHandlersNode_27.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_26()) {
      isDirty_intermediateHandlersNode_26 = intermediateHandlersNode_26.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_25()) {
      isDirty_intermediateHandlersNode_25 = intermediateHandlersNode_25.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_24()) {
      isDirty_intermediateHandlersNode_24 = intermediateHandlersNode_24.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_23()) {
      isDirty_intermediateHandlersNode_23 = intermediateHandlersNode_23.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_22()) {
      isDirty_intermediateHandlersNode_22 = intermediateHandlersNode_22.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_21()) {
      isDirty_intermediateHandlersNode_21 = intermediateHandlersNode_21.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_20()) {
      isDirty_intermediateHandlersNode_20 = intermediateHandlersNode_20.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_19()) {
      isDirty_intermediateHandlersNode_19 = intermediateHandlersNode_19.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_18()) {
      isDirty_intermediateHandlersNode_18 = intermediateHandlersNode_18.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_17()) {
      isDirty_intermediateHandlersNode_17 = intermediateHandlersNode_17.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_16()) {
      isDirty_intermediateHandlersNode_16 = intermediateHandlersNode_16.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_15()) {
      isDirty_intermediateHandlersNode_15 = intermediateHandlersNode_15.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_14()) {
      isDirty_intermediateHandlersNode_14 = intermediateHandlersNode_14.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_13()) {
      isDirty_intermediateHandlersNode_13 = intermediateHandlersNode_13.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_12()) {
      isDirty_intermediateHandlersNode_12 = intermediateHandlersNode_12.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_11()) {
      isDirty_intermediateHandlersNode_11 = intermediateHandlersNode_11.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_10()) {
      isDirty_intermediateHandlersNode_10 = intermediateHandlersNode_10.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_9()) {
      isDirty_intermediateHandlersNode_9 = intermediateHandlersNode_9.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_8()) {
      isDirty_intermediateHandlersNode_8 = intermediateHandlersNode_8.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_7()) {
      isDirty_intermediateHandlersNode_7 = intermediateHandlersNode_7.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_6()) {
      isDirty_intermediateHandlersNode_6 = intermediateHandlersNode_6.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_5()) {
      isDirty_intermediateHandlersNode_5 = intermediateHandlersNode_5.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_4()) {
      isDirty_intermediateHandlersNode_4 = intermediateHandlersNode_4.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_3()) {
      isDirty_intermediateHandlersNode_3 = intermediateHandlersNode_3.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_2()) {
      isDirty_intermediateHandlersNode_2 = intermediateHandlersNode_2.onUpstream();
    }
    if (guardCheck_intermediateHandlersNode_1()) {
      isDirty_intermediateHandlersNode_1 = intermediateHandlersNode_1.onUpstream();
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
    auditor.nodeRegistered(intermediateHandlersNode_1, "intermediateHandlersNode_1");
    auditor.nodeRegistered(intermediateHandlersNode_2, "intermediateHandlersNode_2");
    auditor.nodeRegistered(intermediateHandlersNode_3, "intermediateHandlersNode_3");
    auditor.nodeRegistered(intermediateHandlersNode_4, "intermediateHandlersNode_4");
    auditor.nodeRegistered(intermediateHandlersNode_5, "intermediateHandlersNode_5");
    auditor.nodeRegistered(intermediateHandlersNode_6, "intermediateHandlersNode_6");
    auditor.nodeRegistered(intermediateHandlersNode_7, "intermediateHandlersNode_7");
    auditor.nodeRegistered(intermediateHandlersNode_8, "intermediateHandlersNode_8");
    auditor.nodeRegistered(intermediateHandlersNode_9, "intermediateHandlersNode_9");
    auditor.nodeRegistered(intermediateHandlersNode_10, "intermediateHandlersNode_10");
    auditor.nodeRegistered(intermediateHandlersNode_11, "intermediateHandlersNode_11");
    auditor.nodeRegistered(intermediateHandlersNode_12, "intermediateHandlersNode_12");
    auditor.nodeRegistered(intermediateHandlersNode_13, "intermediateHandlersNode_13");
    auditor.nodeRegistered(intermediateHandlersNode_14, "intermediateHandlersNode_14");
    auditor.nodeRegistered(intermediateHandlersNode_15, "intermediateHandlersNode_15");
    auditor.nodeRegistered(intermediateHandlersNode_16, "intermediateHandlersNode_16");
    auditor.nodeRegistered(intermediateHandlersNode_17, "intermediateHandlersNode_17");
    auditor.nodeRegistered(intermediateHandlersNode_18, "intermediateHandlersNode_18");
    auditor.nodeRegistered(intermediateHandlersNode_19, "intermediateHandlersNode_19");
    auditor.nodeRegistered(intermediateHandlersNode_20, "intermediateHandlersNode_20");
    auditor.nodeRegistered(intermediateHandlersNode_21, "intermediateHandlersNode_21");
    auditor.nodeRegistered(intermediateHandlersNode_22, "intermediateHandlersNode_22");
    auditor.nodeRegistered(intermediateHandlersNode_23, "intermediateHandlersNode_23");
    auditor.nodeRegistered(intermediateHandlersNode_24, "intermediateHandlersNode_24");
    auditor.nodeRegistered(intermediateHandlersNode_25, "intermediateHandlersNode_25");
    auditor.nodeRegistered(intermediateHandlersNode_26, "intermediateHandlersNode_26");
    auditor.nodeRegistered(intermediateHandlersNode_27, "intermediateHandlersNode_27");
    auditor.nodeRegistered(intermediateHandlersNode_28, "intermediateHandlersNode_28");
    auditor.nodeRegistered(intermediateHandlersNode_29, "intermediateHandlersNode_29");
    auditor.nodeRegistered(intermediateHandlersNode_30, "intermediateHandlersNode_30");
    auditor.nodeRegistered(intermediateHandlersNode_31, "intermediateHandlersNode_31");
    auditor.nodeRegistered(intermediateHandlersNode_32, "intermediateHandlersNode_32");
    auditor.nodeRegistered(intermediateHandlersNode_33, "intermediateHandlersNode_33");
    auditor.nodeRegistered(intermediateHandlersNode_34, "intermediateHandlersNode_34");
    auditor.nodeRegistered(intermediateHandlersNode_35, "intermediateHandlersNode_35");
    auditor.nodeRegistered(intermediateHandlersNode_36, "intermediateHandlersNode_36");
    auditor.nodeRegistered(intermediateHandlersNode_37, "intermediateHandlersNode_37");
    auditor.nodeRegistered(intermediateHandlersNode_38, "intermediateHandlersNode_38");
    auditor.nodeRegistered(intermediateHandlersNode_39, "intermediateHandlersNode_39");
    auditor.nodeRegistered(intermediateHandlersNode_40, "intermediateHandlersNode_40");
    auditor.nodeRegistered(intermediateHandlersNode_41, "intermediateHandlersNode_41");
    auditor.nodeRegistered(intermediateHandlersNode_42, "intermediateHandlersNode_42");
    auditor.nodeRegistered(intermediateHandlersNode_43, "intermediateHandlersNode_43");
    auditor.nodeRegistered(intermediateHandlersNode_44, "intermediateHandlersNode_44");
    auditor.nodeRegistered(intermediateHandlersNode_45, "intermediateHandlersNode_45");
    auditor.nodeRegistered(intermediateHandlersNode_46, "intermediateHandlersNode_46");
    auditor.nodeRegistered(intermediateHandlersNode_47, "intermediateHandlersNode_47");
    auditor.nodeRegistered(intermediateHandlersNode_48, "intermediateHandlersNode_48");
    auditor.nodeRegistered(intermediateHandlersNode_49, "intermediateHandlersNode_49");
    auditor.nodeRegistered(intermediateHandlersNode_50, "intermediateHandlersNode_50");
    auditor.nodeRegistered(intermediateHandlersNode_51, "intermediateHandlersNode_51");
    auditor.nodeRegistered(intermediateHandlersNode_52, "intermediateHandlersNode_52");
    auditor.nodeRegistered(intermediateHandlersNode_53, "intermediateHandlersNode_53");
    auditor.nodeRegistered(intermediateHandlersNode_54, "intermediateHandlersNode_54");
    auditor.nodeRegistered(intermediateHandlersNode_55, "intermediateHandlersNode_55");
    auditor.nodeRegistered(intermediateHandlersNode_56, "intermediateHandlersNode_56");
    auditor.nodeRegistered(intermediateHandlersNode_57, "intermediateHandlersNode_57");
    auditor.nodeRegistered(intermediateHandlersNode_58, "intermediateHandlersNode_58");
    auditor.nodeRegistered(intermediateHandlersNode_59, "intermediateHandlersNode_59");
    auditor.nodeRegistered(intermediateHandlersNode_60, "intermediateHandlersNode_60");
    auditor.nodeRegistered(intermediateHandlersNode_61, "intermediateHandlersNode_61");
    auditor.nodeRegistered(intermediateHandlersNode_62, "intermediateHandlersNode_62");
    auditor.nodeRegistered(intermediateHandlersNode_63, "intermediateHandlersNode_63");
    auditor.nodeRegistered(intermediateHandlersNode_64, "intermediateHandlersNode_64");
    auditor.nodeRegistered(intermediateHandlersNode_65, "intermediateHandlersNode_65");
    auditor.nodeRegistered(intermediateHandlersNode_66, "intermediateHandlersNode_66");
    auditor.nodeRegistered(intermediateHandlersNode_67, "intermediateHandlersNode_67");
    auditor.nodeRegistered(intermediateHandlersNode_68, "intermediateHandlersNode_68");
    auditor.nodeRegistered(intermediateHandlersNode_69, "intermediateHandlersNode_69");
    auditor.nodeRegistered(intermediateHandlersNode_70, "intermediateHandlersNode_70");
    auditor.nodeRegistered(intermediateHandlersNode_71, "intermediateHandlersNode_71");
    auditor.nodeRegistered(intermediateHandlersNode_72, "intermediateHandlersNode_72");
    auditor.nodeRegistered(intermediateHandlersNode_73, "intermediateHandlersNode_73");
    auditor.nodeRegistered(intermediateHandlersNode_74, "intermediateHandlersNode_74");
    auditor.nodeRegistered(intermediateHandlersNode_75, "intermediateHandlersNode_75");
    auditor.nodeRegistered(intermediateHandlersNode_76, "intermediateHandlersNode_76");
    auditor.nodeRegistered(intermediateHandlersNode_77, "intermediateHandlersNode_77");
    auditor.nodeRegistered(intermediateHandlersNode_78, "intermediateHandlersNode_78");
    auditor.nodeRegistered(intermediateHandlersNode_79, "intermediateHandlersNode_79");
    auditor.nodeRegistered(intermediateHandlersNode_80, "intermediateHandlersNode_80");
    auditor.nodeRegistered(intermediateHandlersNode_81, "intermediateHandlersNode_81");
    auditor.nodeRegistered(intermediateHandlersNode_82, "intermediateHandlersNode_82");
    auditor.nodeRegistered(intermediateHandlersNode_83, "intermediateHandlersNode_83");
    auditor.nodeRegistered(intermediateHandlersNode_84, "intermediateHandlersNode_84");
    auditor.nodeRegistered(intermediateHandlersNode_85, "intermediateHandlersNode_85");
    auditor.nodeRegistered(intermediateHandlersNode_86, "intermediateHandlersNode_86");
    auditor.nodeRegistered(intermediateHandlersNode_87, "intermediateHandlersNode_87");
    auditor.nodeRegistered(intermediateHandlersNode_88, "intermediateHandlersNode_88");
    auditor.nodeRegistered(intermediateHandlersNode_89, "intermediateHandlersNode_89");
    auditor.nodeRegistered(intermediateHandlersNode_90, "intermediateHandlersNode_90");
    auditor.nodeRegistered(intermediateHandlersNode_91, "intermediateHandlersNode_91");
    auditor.nodeRegistered(intermediateHandlersNode_92, "intermediateHandlersNode_92");
    auditor.nodeRegistered(intermediateHandlersNode_93, "intermediateHandlersNode_93");
    auditor.nodeRegistered(intermediateHandlersNode_94, "intermediateHandlersNode_94");
    auditor.nodeRegistered(intermediateHandlersNode_95, "intermediateHandlersNode_95");
    auditor.nodeRegistered(intermediateHandlersNode_96, "intermediateHandlersNode_96");
    auditor.nodeRegistered(intermediateHandlersNode_97, "intermediateHandlersNode_97");
    auditor.nodeRegistered(intermediateHandlersNode_98, "intermediateHandlersNode_98");
    auditor.nodeRegistered(intermediateHandlersNode_99, "intermediateHandlersNode_99");
    auditor.nodeRegistered(intermediateHandlersNode_100, "intermediateHandlersNode_100");
    auditor.nodeRegistered(sink, "sink");
    auditor.nodeRegistered(intermediateHandlersRootNode_101, "intermediateHandlersRootNode_101");
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
    isDirty_intermediateHandlersNode_1 = false;
    isDirty_intermediateHandlersNode_2 = false;
    isDirty_intermediateHandlersNode_3 = false;
    isDirty_intermediateHandlersNode_4 = false;
    isDirty_intermediateHandlersNode_5 = false;
    isDirty_intermediateHandlersNode_6 = false;
    isDirty_intermediateHandlersNode_7 = false;
    isDirty_intermediateHandlersNode_8 = false;
    isDirty_intermediateHandlersNode_9 = false;
    isDirty_intermediateHandlersNode_10 = false;
    isDirty_intermediateHandlersNode_11 = false;
    isDirty_intermediateHandlersNode_12 = false;
    isDirty_intermediateHandlersNode_13 = false;
    isDirty_intermediateHandlersNode_14 = false;
    isDirty_intermediateHandlersNode_15 = false;
    isDirty_intermediateHandlersNode_16 = false;
    isDirty_intermediateHandlersNode_17 = false;
    isDirty_intermediateHandlersNode_18 = false;
    isDirty_intermediateHandlersNode_19 = false;
    isDirty_intermediateHandlersNode_20 = false;
    isDirty_intermediateHandlersNode_21 = false;
    isDirty_intermediateHandlersNode_22 = false;
    isDirty_intermediateHandlersNode_23 = false;
    isDirty_intermediateHandlersNode_24 = false;
    isDirty_intermediateHandlersNode_25 = false;
    isDirty_intermediateHandlersNode_26 = false;
    isDirty_intermediateHandlersNode_27 = false;
    isDirty_intermediateHandlersNode_28 = false;
    isDirty_intermediateHandlersNode_29 = false;
    isDirty_intermediateHandlersNode_30 = false;
    isDirty_intermediateHandlersNode_31 = false;
    isDirty_intermediateHandlersNode_32 = false;
    isDirty_intermediateHandlersNode_33 = false;
    isDirty_intermediateHandlersNode_34 = false;
    isDirty_intermediateHandlersNode_35 = false;
    isDirty_intermediateHandlersNode_36 = false;
    isDirty_intermediateHandlersNode_37 = false;
    isDirty_intermediateHandlersNode_38 = false;
    isDirty_intermediateHandlersNode_39 = false;
    isDirty_intermediateHandlersNode_40 = false;
    isDirty_intermediateHandlersNode_41 = false;
    isDirty_intermediateHandlersNode_42 = false;
    isDirty_intermediateHandlersNode_43 = false;
    isDirty_intermediateHandlersNode_44 = false;
    isDirty_intermediateHandlersNode_45 = false;
    isDirty_intermediateHandlersNode_46 = false;
    isDirty_intermediateHandlersNode_47 = false;
    isDirty_intermediateHandlersNode_48 = false;
    isDirty_intermediateHandlersNode_49 = false;
    isDirty_intermediateHandlersNode_50 = false;
    isDirty_intermediateHandlersNode_51 = false;
    isDirty_intermediateHandlersNode_52 = false;
    isDirty_intermediateHandlersNode_53 = false;
    isDirty_intermediateHandlersNode_54 = false;
    isDirty_intermediateHandlersNode_55 = false;
    isDirty_intermediateHandlersNode_56 = false;
    isDirty_intermediateHandlersNode_57 = false;
    isDirty_intermediateHandlersNode_58 = false;
    isDirty_intermediateHandlersNode_59 = false;
    isDirty_intermediateHandlersNode_60 = false;
    isDirty_intermediateHandlersNode_61 = false;
    isDirty_intermediateHandlersNode_62 = false;
    isDirty_intermediateHandlersNode_63 = false;
    isDirty_intermediateHandlersNode_64 = false;
    isDirty_intermediateHandlersNode_65 = false;
    isDirty_intermediateHandlersNode_66 = false;
    isDirty_intermediateHandlersNode_67 = false;
    isDirty_intermediateHandlersNode_68 = false;
    isDirty_intermediateHandlersNode_69 = false;
    isDirty_intermediateHandlersNode_70 = false;
    isDirty_intermediateHandlersNode_71 = false;
    isDirty_intermediateHandlersNode_72 = false;
    isDirty_intermediateHandlersNode_73 = false;
    isDirty_intermediateHandlersNode_74 = false;
    isDirty_intermediateHandlersNode_75 = false;
    isDirty_intermediateHandlersNode_76 = false;
    isDirty_intermediateHandlersNode_77 = false;
    isDirty_intermediateHandlersNode_78 = false;
    isDirty_intermediateHandlersNode_79 = false;
    isDirty_intermediateHandlersNode_80 = false;
    isDirty_intermediateHandlersNode_81 = false;
    isDirty_intermediateHandlersNode_82 = false;
    isDirty_intermediateHandlersNode_83 = false;
    isDirty_intermediateHandlersNode_84 = false;
    isDirty_intermediateHandlersNode_85 = false;
    isDirty_intermediateHandlersNode_86 = false;
    isDirty_intermediateHandlersNode_87 = false;
    isDirty_intermediateHandlersNode_88 = false;
    isDirty_intermediateHandlersNode_89 = false;
    isDirty_intermediateHandlersNode_90 = false;
    isDirty_intermediateHandlersNode_91 = false;
    isDirty_intermediateHandlersNode_92 = false;
    isDirty_intermediateHandlersNode_93 = false;
    isDirty_intermediateHandlersNode_94 = false;
    isDirty_intermediateHandlersNode_95 = false;
    isDirty_intermediateHandlersNode_96 = false;
    isDirty_intermediateHandlersNode_97 = false;
    isDirty_intermediateHandlersNode_98 = false;
    isDirty_intermediateHandlersNode_99 = false;
    isDirty_intermediateHandlersNode_100 = false;
    isDirty_intermediateHandlersRootNode_101 = false;
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
          intermediateHandlersNode_1, () -> isDirty_intermediateHandlersNode_1);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_10, () -> isDirty_intermediateHandlersNode_10);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_100, () -> isDirty_intermediateHandlersNode_100);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_11, () -> isDirty_intermediateHandlersNode_11);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_12, () -> isDirty_intermediateHandlersNode_12);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_13, () -> isDirty_intermediateHandlersNode_13);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_14, () -> isDirty_intermediateHandlersNode_14);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_15, () -> isDirty_intermediateHandlersNode_15);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_16, () -> isDirty_intermediateHandlersNode_16);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_17, () -> isDirty_intermediateHandlersNode_17);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_18, () -> isDirty_intermediateHandlersNode_18);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_19, () -> isDirty_intermediateHandlersNode_19);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_2, () -> isDirty_intermediateHandlersNode_2);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_20, () -> isDirty_intermediateHandlersNode_20);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_21, () -> isDirty_intermediateHandlersNode_21);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_22, () -> isDirty_intermediateHandlersNode_22);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_23, () -> isDirty_intermediateHandlersNode_23);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_24, () -> isDirty_intermediateHandlersNode_24);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_25, () -> isDirty_intermediateHandlersNode_25);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_26, () -> isDirty_intermediateHandlersNode_26);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_27, () -> isDirty_intermediateHandlersNode_27);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_28, () -> isDirty_intermediateHandlersNode_28);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_29, () -> isDirty_intermediateHandlersNode_29);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_3, () -> isDirty_intermediateHandlersNode_3);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_30, () -> isDirty_intermediateHandlersNode_30);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_31, () -> isDirty_intermediateHandlersNode_31);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_32, () -> isDirty_intermediateHandlersNode_32);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_33, () -> isDirty_intermediateHandlersNode_33);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_34, () -> isDirty_intermediateHandlersNode_34);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_35, () -> isDirty_intermediateHandlersNode_35);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_36, () -> isDirty_intermediateHandlersNode_36);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_37, () -> isDirty_intermediateHandlersNode_37);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_38, () -> isDirty_intermediateHandlersNode_38);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_39, () -> isDirty_intermediateHandlersNode_39);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_4, () -> isDirty_intermediateHandlersNode_4);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_40, () -> isDirty_intermediateHandlersNode_40);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_41, () -> isDirty_intermediateHandlersNode_41);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_42, () -> isDirty_intermediateHandlersNode_42);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_43, () -> isDirty_intermediateHandlersNode_43);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_44, () -> isDirty_intermediateHandlersNode_44);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_45, () -> isDirty_intermediateHandlersNode_45);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_46, () -> isDirty_intermediateHandlersNode_46);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_47, () -> isDirty_intermediateHandlersNode_47);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_48, () -> isDirty_intermediateHandlersNode_48);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_49, () -> isDirty_intermediateHandlersNode_49);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_5, () -> isDirty_intermediateHandlersNode_5);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_50, () -> isDirty_intermediateHandlersNode_50);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_51, () -> isDirty_intermediateHandlersNode_51);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_52, () -> isDirty_intermediateHandlersNode_52);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_53, () -> isDirty_intermediateHandlersNode_53);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_54, () -> isDirty_intermediateHandlersNode_54);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_55, () -> isDirty_intermediateHandlersNode_55);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_56, () -> isDirty_intermediateHandlersNode_56);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_57, () -> isDirty_intermediateHandlersNode_57);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_58, () -> isDirty_intermediateHandlersNode_58);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_59, () -> isDirty_intermediateHandlersNode_59);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_6, () -> isDirty_intermediateHandlersNode_6);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_60, () -> isDirty_intermediateHandlersNode_60);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_61, () -> isDirty_intermediateHandlersNode_61);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_62, () -> isDirty_intermediateHandlersNode_62);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_63, () -> isDirty_intermediateHandlersNode_63);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_64, () -> isDirty_intermediateHandlersNode_64);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_65, () -> isDirty_intermediateHandlersNode_65);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_66, () -> isDirty_intermediateHandlersNode_66);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_67, () -> isDirty_intermediateHandlersNode_67);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_68, () -> isDirty_intermediateHandlersNode_68);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_69, () -> isDirty_intermediateHandlersNode_69);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_7, () -> isDirty_intermediateHandlersNode_7);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_70, () -> isDirty_intermediateHandlersNode_70);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_71, () -> isDirty_intermediateHandlersNode_71);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_72, () -> isDirty_intermediateHandlersNode_72);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_73, () -> isDirty_intermediateHandlersNode_73);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_74, () -> isDirty_intermediateHandlersNode_74);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_75, () -> isDirty_intermediateHandlersNode_75);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_76, () -> isDirty_intermediateHandlersNode_76);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_77, () -> isDirty_intermediateHandlersNode_77);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_78, () -> isDirty_intermediateHandlersNode_78);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_79, () -> isDirty_intermediateHandlersNode_79);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_8, () -> isDirty_intermediateHandlersNode_8);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_80, () -> isDirty_intermediateHandlersNode_80);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_81, () -> isDirty_intermediateHandlersNode_81);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_82, () -> isDirty_intermediateHandlersNode_82);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_83, () -> isDirty_intermediateHandlersNode_83);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_84, () -> isDirty_intermediateHandlersNode_84);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_85, () -> isDirty_intermediateHandlersNode_85);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_86, () -> isDirty_intermediateHandlersNode_86);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_87, () -> isDirty_intermediateHandlersNode_87);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_88, () -> isDirty_intermediateHandlersNode_88);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_89, () -> isDirty_intermediateHandlersNode_89);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_9, () -> isDirty_intermediateHandlersNode_9);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_90, () -> isDirty_intermediateHandlersNode_90);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_91, () -> isDirty_intermediateHandlersNode_91);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_92, () -> isDirty_intermediateHandlersNode_92);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_93, () -> isDirty_intermediateHandlersNode_93);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_94, () -> isDirty_intermediateHandlersNode_94);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_95, () -> isDirty_intermediateHandlersNode_95);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_96, () -> isDirty_intermediateHandlersNode_96);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_97, () -> isDirty_intermediateHandlersNode_97);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_98, () -> isDirty_intermediateHandlersNode_98);
      dirtyFlagSupplierMap.put(
          intermediateHandlersNode_99, () -> isDirty_intermediateHandlersNode_99);
      dirtyFlagSupplierMap.put(
          intermediateHandlersRootNode_101, () -> isDirty_intermediateHandlersRootNode_101);
    }
    return dirtyFlagSupplierMap.getOrDefault(node, DataFlow.ALWAYS_FALSE);
  }

  @Override
  public void setDirty(Object node, boolean dirtyFlag) {
    if (dirtyFlagUpdateMap.isEmpty()) {
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_1, (b) -> isDirty_intermediateHandlersNode_1 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_10, (b) -> isDirty_intermediateHandlersNode_10 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_100, (b) -> isDirty_intermediateHandlersNode_100 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_11, (b) -> isDirty_intermediateHandlersNode_11 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_12, (b) -> isDirty_intermediateHandlersNode_12 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_13, (b) -> isDirty_intermediateHandlersNode_13 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_14, (b) -> isDirty_intermediateHandlersNode_14 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_15, (b) -> isDirty_intermediateHandlersNode_15 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_16, (b) -> isDirty_intermediateHandlersNode_16 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_17, (b) -> isDirty_intermediateHandlersNode_17 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_18, (b) -> isDirty_intermediateHandlersNode_18 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_19, (b) -> isDirty_intermediateHandlersNode_19 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_2, (b) -> isDirty_intermediateHandlersNode_2 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_20, (b) -> isDirty_intermediateHandlersNode_20 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_21, (b) -> isDirty_intermediateHandlersNode_21 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_22, (b) -> isDirty_intermediateHandlersNode_22 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_23, (b) -> isDirty_intermediateHandlersNode_23 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_24, (b) -> isDirty_intermediateHandlersNode_24 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_25, (b) -> isDirty_intermediateHandlersNode_25 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_26, (b) -> isDirty_intermediateHandlersNode_26 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_27, (b) -> isDirty_intermediateHandlersNode_27 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_28, (b) -> isDirty_intermediateHandlersNode_28 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_29, (b) -> isDirty_intermediateHandlersNode_29 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_3, (b) -> isDirty_intermediateHandlersNode_3 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_30, (b) -> isDirty_intermediateHandlersNode_30 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_31, (b) -> isDirty_intermediateHandlersNode_31 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_32, (b) -> isDirty_intermediateHandlersNode_32 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_33, (b) -> isDirty_intermediateHandlersNode_33 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_34, (b) -> isDirty_intermediateHandlersNode_34 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_35, (b) -> isDirty_intermediateHandlersNode_35 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_36, (b) -> isDirty_intermediateHandlersNode_36 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_37, (b) -> isDirty_intermediateHandlersNode_37 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_38, (b) -> isDirty_intermediateHandlersNode_38 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_39, (b) -> isDirty_intermediateHandlersNode_39 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_4, (b) -> isDirty_intermediateHandlersNode_4 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_40, (b) -> isDirty_intermediateHandlersNode_40 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_41, (b) -> isDirty_intermediateHandlersNode_41 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_42, (b) -> isDirty_intermediateHandlersNode_42 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_43, (b) -> isDirty_intermediateHandlersNode_43 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_44, (b) -> isDirty_intermediateHandlersNode_44 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_45, (b) -> isDirty_intermediateHandlersNode_45 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_46, (b) -> isDirty_intermediateHandlersNode_46 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_47, (b) -> isDirty_intermediateHandlersNode_47 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_48, (b) -> isDirty_intermediateHandlersNode_48 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_49, (b) -> isDirty_intermediateHandlersNode_49 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_5, (b) -> isDirty_intermediateHandlersNode_5 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_50, (b) -> isDirty_intermediateHandlersNode_50 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_51, (b) -> isDirty_intermediateHandlersNode_51 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_52, (b) -> isDirty_intermediateHandlersNode_52 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_53, (b) -> isDirty_intermediateHandlersNode_53 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_54, (b) -> isDirty_intermediateHandlersNode_54 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_55, (b) -> isDirty_intermediateHandlersNode_55 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_56, (b) -> isDirty_intermediateHandlersNode_56 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_57, (b) -> isDirty_intermediateHandlersNode_57 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_58, (b) -> isDirty_intermediateHandlersNode_58 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_59, (b) -> isDirty_intermediateHandlersNode_59 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_6, (b) -> isDirty_intermediateHandlersNode_6 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_60, (b) -> isDirty_intermediateHandlersNode_60 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_61, (b) -> isDirty_intermediateHandlersNode_61 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_62, (b) -> isDirty_intermediateHandlersNode_62 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_63, (b) -> isDirty_intermediateHandlersNode_63 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_64, (b) -> isDirty_intermediateHandlersNode_64 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_65, (b) -> isDirty_intermediateHandlersNode_65 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_66, (b) -> isDirty_intermediateHandlersNode_66 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_67, (b) -> isDirty_intermediateHandlersNode_67 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_68, (b) -> isDirty_intermediateHandlersNode_68 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_69, (b) -> isDirty_intermediateHandlersNode_69 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_7, (b) -> isDirty_intermediateHandlersNode_7 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_70, (b) -> isDirty_intermediateHandlersNode_70 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_71, (b) -> isDirty_intermediateHandlersNode_71 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_72, (b) -> isDirty_intermediateHandlersNode_72 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_73, (b) -> isDirty_intermediateHandlersNode_73 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_74, (b) -> isDirty_intermediateHandlersNode_74 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_75, (b) -> isDirty_intermediateHandlersNode_75 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_76, (b) -> isDirty_intermediateHandlersNode_76 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_77, (b) -> isDirty_intermediateHandlersNode_77 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_78, (b) -> isDirty_intermediateHandlersNode_78 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_79, (b) -> isDirty_intermediateHandlersNode_79 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_8, (b) -> isDirty_intermediateHandlersNode_8 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_80, (b) -> isDirty_intermediateHandlersNode_80 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_81, (b) -> isDirty_intermediateHandlersNode_81 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_82, (b) -> isDirty_intermediateHandlersNode_82 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_83, (b) -> isDirty_intermediateHandlersNode_83 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_84, (b) -> isDirty_intermediateHandlersNode_84 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_85, (b) -> isDirty_intermediateHandlersNode_85 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_86, (b) -> isDirty_intermediateHandlersNode_86 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_87, (b) -> isDirty_intermediateHandlersNode_87 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_88, (b) -> isDirty_intermediateHandlersNode_88 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_89, (b) -> isDirty_intermediateHandlersNode_89 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_9, (b) -> isDirty_intermediateHandlersNode_9 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_90, (b) -> isDirty_intermediateHandlersNode_90 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_91, (b) -> isDirty_intermediateHandlersNode_91 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_92, (b) -> isDirty_intermediateHandlersNode_92 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_93, (b) -> isDirty_intermediateHandlersNode_93 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_94, (b) -> isDirty_intermediateHandlersNode_94 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_95, (b) -> isDirty_intermediateHandlersNode_95 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_96, (b) -> isDirty_intermediateHandlersNode_96 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_97, (b) -> isDirty_intermediateHandlersNode_97 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_98, (b) -> isDirty_intermediateHandlersNode_98 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersNode_99, (b) -> isDirty_intermediateHandlersNode_99 = b);
      dirtyFlagUpdateMap.put(
          intermediateHandlersRootNode_101, (b) -> isDirty_intermediateHandlersRootNode_101 = b);
    }
    dirtyFlagUpdateMap.get(node).accept(dirtyFlag);
  }

  private boolean guardCheck_intermediateHandlersNode_1() {
    return isDirty_intermediateHandlersNode_2;
  }

  private boolean guardCheck_intermediateHandlersNode_2() {
    return isDirty_intermediateHandlersNode_3;
  }

  private boolean guardCheck_intermediateHandlersNode_3() {
    return isDirty_intermediateHandlersNode_4;
  }

  private boolean guardCheck_intermediateHandlersNode_4() {
    return isDirty_intermediateHandlersNode_5;
  }

  private boolean guardCheck_intermediateHandlersNode_5() {
    return isDirty_intermediateHandlersNode_6;
  }

  private boolean guardCheck_intermediateHandlersNode_6() {
    return isDirty_intermediateHandlersNode_7;
  }

  private boolean guardCheck_intermediateHandlersNode_7() {
    return isDirty_intermediateHandlersNode_8;
  }

  private boolean guardCheck_intermediateHandlersNode_8() {
    return isDirty_intermediateHandlersNode_9;
  }

  private boolean guardCheck_intermediateHandlersNode_9() {
    return isDirty_intermediateHandlersNode_10;
  }

  private boolean guardCheck_intermediateHandlersNode_10() {
    return isDirty_intermediateHandlersNode_11;
  }

  private boolean guardCheck_intermediateHandlersNode_11() {
    return isDirty_intermediateHandlersNode_12;
  }

  private boolean guardCheck_intermediateHandlersNode_12() {
    return isDirty_intermediateHandlersNode_13;
  }

  private boolean guardCheck_intermediateHandlersNode_13() {
    return isDirty_intermediateHandlersNode_14;
  }

  private boolean guardCheck_intermediateHandlersNode_14() {
    return isDirty_intermediateHandlersNode_15;
  }

  private boolean guardCheck_intermediateHandlersNode_15() {
    return isDirty_intermediateHandlersNode_16;
  }

  private boolean guardCheck_intermediateHandlersNode_16() {
    return isDirty_intermediateHandlersNode_17;
  }

  private boolean guardCheck_intermediateHandlersNode_17() {
    return isDirty_intermediateHandlersNode_18;
  }

  private boolean guardCheck_intermediateHandlersNode_18() {
    return isDirty_intermediateHandlersNode_19;
  }

  private boolean guardCheck_intermediateHandlersNode_19() {
    return isDirty_intermediateHandlersNode_20;
  }

  private boolean guardCheck_intermediateHandlersNode_20() {
    return isDirty_intermediateHandlersNode_21;
  }

  private boolean guardCheck_intermediateHandlersNode_21() {
    return isDirty_intermediateHandlersNode_22;
  }

  private boolean guardCheck_intermediateHandlersNode_22() {
    return isDirty_intermediateHandlersNode_23;
  }

  private boolean guardCheck_intermediateHandlersNode_23() {
    return isDirty_intermediateHandlersNode_24;
  }

  private boolean guardCheck_intermediateHandlersNode_24() {
    return isDirty_intermediateHandlersNode_25;
  }

  private boolean guardCheck_intermediateHandlersNode_25() {
    return isDirty_intermediateHandlersNode_26;
  }

  private boolean guardCheck_intermediateHandlersNode_26() {
    return isDirty_intermediateHandlersNode_27;
  }

  private boolean guardCheck_intermediateHandlersNode_27() {
    return isDirty_intermediateHandlersNode_28;
  }

  private boolean guardCheck_intermediateHandlersNode_28() {
    return isDirty_intermediateHandlersNode_29;
  }

  private boolean guardCheck_intermediateHandlersNode_29() {
    return isDirty_intermediateHandlersNode_30;
  }

  private boolean guardCheck_intermediateHandlersNode_30() {
    return isDirty_intermediateHandlersNode_31;
  }

  private boolean guardCheck_intermediateHandlersNode_31() {
    return isDirty_intermediateHandlersNode_32;
  }

  private boolean guardCheck_intermediateHandlersNode_32() {
    return isDirty_intermediateHandlersNode_33;
  }

  private boolean guardCheck_intermediateHandlersNode_33() {
    return isDirty_intermediateHandlersNode_34;
  }

  private boolean guardCheck_intermediateHandlersNode_34() {
    return isDirty_intermediateHandlersNode_35;
  }

  private boolean guardCheck_intermediateHandlersNode_35() {
    return isDirty_intermediateHandlersNode_36;
  }

  private boolean guardCheck_intermediateHandlersNode_36() {
    return isDirty_intermediateHandlersNode_37;
  }

  private boolean guardCheck_intermediateHandlersNode_37() {
    return isDirty_intermediateHandlersNode_38;
  }

  private boolean guardCheck_intermediateHandlersNode_38() {
    return isDirty_intermediateHandlersNode_39;
  }

  private boolean guardCheck_intermediateHandlersNode_39() {
    return isDirty_intermediateHandlersNode_40;
  }

  private boolean guardCheck_intermediateHandlersNode_40() {
    return isDirty_intermediateHandlersNode_41;
  }

  private boolean guardCheck_intermediateHandlersNode_41() {
    return isDirty_intermediateHandlersNode_42;
  }

  private boolean guardCheck_intermediateHandlersNode_42() {
    return isDirty_intermediateHandlersNode_43;
  }

  private boolean guardCheck_intermediateHandlersNode_43() {
    return isDirty_intermediateHandlersNode_44;
  }

  private boolean guardCheck_intermediateHandlersNode_44() {
    return isDirty_intermediateHandlersNode_45;
  }

  private boolean guardCheck_intermediateHandlersNode_45() {
    return isDirty_intermediateHandlersNode_46;
  }

  private boolean guardCheck_intermediateHandlersNode_46() {
    return isDirty_intermediateHandlersNode_47;
  }

  private boolean guardCheck_intermediateHandlersNode_47() {
    return isDirty_intermediateHandlersNode_48;
  }

  private boolean guardCheck_intermediateHandlersNode_48() {
    return isDirty_intermediateHandlersNode_49;
  }

  private boolean guardCheck_intermediateHandlersNode_49() {
    return isDirty_intermediateHandlersNode_50;
  }

  private boolean guardCheck_intermediateHandlersNode_50() {
    return isDirty_intermediateHandlersNode_51;
  }

  private boolean guardCheck_intermediateHandlersNode_51() {
    return isDirty_intermediateHandlersNode_52;
  }

  private boolean guardCheck_intermediateHandlersNode_52() {
    return isDirty_intermediateHandlersNode_53;
  }

  private boolean guardCheck_intermediateHandlersNode_53() {
    return isDirty_intermediateHandlersNode_54;
  }

  private boolean guardCheck_intermediateHandlersNode_54() {
    return isDirty_intermediateHandlersNode_55;
  }

  private boolean guardCheck_intermediateHandlersNode_55() {
    return isDirty_intermediateHandlersNode_56;
  }

  private boolean guardCheck_intermediateHandlersNode_56() {
    return isDirty_intermediateHandlersNode_57;
  }

  private boolean guardCheck_intermediateHandlersNode_57() {
    return isDirty_intermediateHandlersNode_58;
  }

  private boolean guardCheck_intermediateHandlersNode_58() {
    return isDirty_intermediateHandlersNode_59;
  }

  private boolean guardCheck_intermediateHandlersNode_59() {
    return isDirty_intermediateHandlersNode_60;
  }

  private boolean guardCheck_intermediateHandlersNode_60() {
    return isDirty_intermediateHandlersNode_61;
  }

  private boolean guardCheck_intermediateHandlersNode_61() {
    return isDirty_intermediateHandlersNode_62;
  }

  private boolean guardCheck_intermediateHandlersNode_62() {
    return isDirty_intermediateHandlersNode_63;
  }

  private boolean guardCheck_intermediateHandlersNode_63() {
    return isDirty_intermediateHandlersNode_64;
  }

  private boolean guardCheck_intermediateHandlersNode_64() {
    return isDirty_intermediateHandlersNode_65;
  }

  private boolean guardCheck_intermediateHandlersNode_65() {
    return isDirty_intermediateHandlersNode_66;
  }

  private boolean guardCheck_intermediateHandlersNode_66() {
    return isDirty_intermediateHandlersNode_67;
  }

  private boolean guardCheck_intermediateHandlersNode_67() {
    return isDirty_intermediateHandlersNode_68;
  }

  private boolean guardCheck_intermediateHandlersNode_68() {
    return isDirty_intermediateHandlersNode_69;
  }

  private boolean guardCheck_intermediateHandlersNode_69() {
    return isDirty_intermediateHandlersNode_70;
  }

  private boolean guardCheck_intermediateHandlersNode_70() {
    return isDirty_intermediateHandlersNode_71;
  }

  private boolean guardCheck_intermediateHandlersNode_71() {
    return isDirty_intermediateHandlersNode_72;
  }

  private boolean guardCheck_intermediateHandlersNode_72() {
    return isDirty_intermediateHandlersNode_73;
  }

  private boolean guardCheck_intermediateHandlersNode_73() {
    return isDirty_intermediateHandlersNode_74;
  }

  private boolean guardCheck_intermediateHandlersNode_74() {
    return isDirty_intermediateHandlersNode_75;
  }

  private boolean guardCheck_intermediateHandlersNode_75() {
    return isDirty_intermediateHandlersNode_76;
  }

  private boolean guardCheck_intermediateHandlersNode_76() {
    return isDirty_intermediateHandlersNode_77;
  }

  private boolean guardCheck_intermediateHandlersNode_77() {
    return isDirty_intermediateHandlersNode_78;
  }

  private boolean guardCheck_intermediateHandlersNode_78() {
    return isDirty_intermediateHandlersNode_79;
  }

  private boolean guardCheck_intermediateHandlersNode_79() {
    return isDirty_intermediateHandlersNode_80;
  }

  private boolean guardCheck_intermediateHandlersNode_80() {
    return isDirty_intermediateHandlersNode_81;
  }

  private boolean guardCheck_intermediateHandlersNode_81() {
    return isDirty_intermediateHandlersNode_82;
  }

  private boolean guardCheck_intermediateHandlersNode_82() {
    return isDirty_intermediateHandlersNode_83;
  }

  private boolean guardCheck_intermediateHandlersNode_83() {
    return isDirty_intermediateHandlersNode_84;
  }

  private boolean guardCheck_intermediateHandlersNode_84() {
    return isDirty_intermediateHandlersNode_85;
  }

  private boolean guardCheck_intermediateHandlersNode_85() {
    return isDirty_intermediateHandlersNode_86;
  }

  private boolean guardCheck_intermediateHandlersNode_86() {
    return isDirty_intermediateHandlersNode_87;
  }

  private boolean guardCheck_intermediateHandlersNode_87() {
    return isDirty_intermediateHandlersNode_88;
  }

  private boolean guardCheck_intermediateHandlersNode_88() {
    return isDirty_intermediateHandlersNode_89;
  }

  private boolean guardCheck_intermediateHandlersNode_89() {
    return isDirty_intermediateHandlersNode_90;
  }

  private boolean guardCheck_intermediateHandlersNode_90() {
    return isDirty_intermediateHandlersNode_91;
  }

  private boolean guardCheck_intermediateHandlersNode_91() {
    return isDirty_intermediateHandlersNode_92;
  }

  private boolean guardCheck_intermediateHandlersNode_92() {
    return isDirty_intermediateHandlersNode_93;
  }

  private boolean guardCheck_intermediateHandlersNode_93() {
    return isDirty_intermediateHandlersNode_94;
  }

  private boolean guardCheck_intermediateHandlersNode_94() {
    return isDirty_intermediateHandlersNode_95;
  }

  private boolean guardCheck_intermediateHandlersNode_95() {
    return isDirty_intermediateHandlersNode_96;
  }

  private boolean guardCheck_intermediateHandlersNode_96() {
    return isDirty_intermediateHandlersNode_97;
  }

  private boolean guardCheck_intermediateHandlersNode_97() {
    return isDirty_intermediateHandlersNode_98;
  }

  private boolean guardCheck_intermediateHandlersNode_98() {
    return isDirty_intermediateHandlersNode_99;
  }

  private boolean guardCheck_intermediateHandlersNode_99() {
    return isDirty_intermediateHandlersNode_100;
  }

  private boolean guardCheck_intermediateHandlersNode_100() {
    return isDirty_intermediateHandlersRootNode_101;
  }

  private boolean guardCheck_sink() {
    return isDirty_intermediateHandlersNode_1;
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
  public IntermediateHandlers100Processor newInstance() {
    return new IntermediateHandlers100Processor();
  }

  @Override
  public IntermediateHandlers100Processor newInstance(Map<Object, Object> contextMap) {
    return new IntermediateHandlers100Processor();
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
