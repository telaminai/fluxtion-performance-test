/*
 * Copyright: © 2025.  Gregory Higgins <greg.higgins@v12technology.com> - All Rights Reserved
 * This source code is protected under international copyright law.  All rights
 * reserved and protected by the copyright holders.
 * This file is confidential and only available to authorized individuals with the
 * permission of the copyright holders.  If you encounter this file and do not have
 * permission, please contact the copyright holders and delete this file.
 */
package com.telamin.fluxtion.test.performance.generated.diamond;

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
import com.telamin.fluxtion.test.performance.nodes.DiamondMeshNode;
import com.telamin.fluxtion.test.performance.nodes.DiamondMeshPublisherNode;
import com.telamin.fluxtion.test.performance.nodes.DiamondMeshRootNode;
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
 * </ul>
 *
 * @author Greg Higgins
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public class DiamondMesh101Processor
    implements CloneableDataFlow<DiamondMesh101Processor>,
        /*--- @ExportService start ---*/
        @ExportService ServiceListener,
        /*--- @ExportService end ---*/
        DataFlow,
        InternalEventProcessor,
        BatchHandler {

  //Node declarations
  private final transient CallbackDispatcherImpl callbackDispatcher = new CallbackDispatcherImpl();
  public final transient Clock clock = new Clock();
  private final transient DiamondMeshRootNode diamondMeshRootNode_101 = new DiamondMeshRootNode();
  private final transient DiamondMeshNode diamondMeshNode_100 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_99 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_98 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_97 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_96 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_95 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_94 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_93 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_92 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_91 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_90 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_89 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_88 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_87 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_86 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_85 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_84 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_83 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_82 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_81 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_80 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_79 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_78 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_77 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_76 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_75 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_74 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_73 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_72 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_71 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_70 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_69 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_68 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_67 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_66 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_65 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_64 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_63 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_62 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_61 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_60 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_59 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_58 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_57 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_56 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_55 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_54 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_53 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_52 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_51 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_50 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_49 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_48 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_47 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_46 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_45 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_44 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_43 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_42 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_41 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_40 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_39 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_38 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_37 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_36 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_35 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_34 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_33 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_32 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_31 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_30 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_29 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_28 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_27 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_26 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_25 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_24 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_23 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_22 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_21 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_20 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_19 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_18 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_17 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_16 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_15 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_14 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_13 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_12 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_11 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_10 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_9 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_8 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_7 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_6 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_5 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_4 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_3 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_2 = new DiamondMeshNode();
  private final transient DiamondMeshNode diamondMeshNode_1 = new DiamondMeshNode();
  public final transient NodeNameAuditor nodeNameLookup = new NodeNameAuditor();
  public final transient DiamondMeshPublisherNode sink = new DiamondMeshPublisherNode();
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

  private boolean isDirty_diamondMeshNode_1 = false;
  private boolean isDirty_diamondMeshNode_2 = false;
  private boolean isDirty_diamondMeshNode_3 = false;
  private boolean isDirty_diamondMeshNode_4 = false;
  private boolean isDirty_diamondMeshNode_5 = false;
  private boolean isDirty_diamondMeshNode_6 = false;
  private boolean isDirty_diamondMeshNode_7 = false;
  private boolean isDirty_diamondMeshNode_8 = false;
  private boolean isDirty_diamondMeshNode_9 = false;
  private boolean isDirty_diamondMeshNode_10 = false;
  private boolean isDirty_diamondMeshNode_11 = false;
  private boolean isDirty_diamondMeshNode_12 = false;
  private boolean isDirty_diamondMeshNode_13 = false;
  private boolean isDirty_diamondMeshNode_14 = false;
  private boolean isDirty_diamondMeshNode_15 = false;
  private boolean isDirty_diamondMeshNode_16 = false;
  private boolean isDirty_diamondMeshNode_17 = false;
  private boolean isDirty_diamondMeshNode_18 = false;
  private boolean isDirty_diamondMeshNode_19 = false;
  private boolean isDirty_diamondMeshNode_20 = false;
  private boolean isDirty_diamondMeshNode_21 = false;
  private boolean isDirty_diamondMeshNode_22 = false;
  private boolean isDirty_diamondMeshNode_23 = false;
  private boolean isDirty_diamondMeshNode_24 = false;
  private boolean isDirty_diamondMeshNode_25 = false;
  private boolean isDirty_diamondMeshNode_26 = false;
  private boolean isDirty_diamondMeshNode_27 = false;
  private boolean isDirty_diamondMeshNode_28 = false;
  private boolean isDirty_diamondMeshNode_29 = false;
  private boolean isDirty_diamondMeshNode_30 = false;
  private boolean isDirty_diamondMeshNode_31 = false;
  private boolean isDirty_diamondMeshNode_32 = false;
  private boolean isDirty_diamondMeshNode_33 = false;
  private boolean isDirty_diamondMeshNode_34 = false;
  private boolean isDirty_diamondMeshNode_35 = false;
  private boolean isDirty_diamondMeshNode_36 = false;
  private boolean isDirty_diamondMeshNode_37 = false;
  private boolean isDirty_diamondMeshNode_38 = false;
  private boolean isDirty_diamondMeshNode_39 = false;
  private boolean isDirty_diamondMeshNode_40 = false;
  private boolean isDirty_diamondMeshNode_41 = false;
  private boolean isDirty_diamondMeshNode_42 = false;
  private boolean isDirty_diamondMeshNode_43 = false;
  private boolean isDirty_diamondMeshNode_44 = false;
  private boolean isDirty_diamondMeshNode_45 = false;
  private boolean isDirty_diamondMeshNode_46 = false;
  private boolean isDirty_diamondMeshNode_47 = false;
  private boolean isDirty_diamondMeshNode_48 = false;
  private boolean isDirty_diamondMeshNode_49 = false;
  private boolean isDirty_diamondMeshNode_50 = false;
  private boolean isDirty_diamondMeshNode_51 = false;
  private boolean isDirty_diamondMeshNode_52 = false;
  private boolean isDirty_diamondMeshNode_53 = false;
  private boolean isDirty_diamondMeshNode_54 = false;
  private boolean isDirty_diamondMeshNode_55 = false;
  private boolean isDirty_diamondMeshNode_56 = false;
  private boolean isDirty_diamondMeshNode_57 = false;
  private boolean isDirty_diamondMeshNode_58 = false;
  private boolean isDirty_diamondMeshNode_59 = false;
  private boolean isDirty_diamondMeshNode_60 = false;
  private boolean isDirty_diamondMeshNode_61 = false;
  private boolean isDirty_diamondMeshNode_62 = false;
  private boolean isDirty_diamondMeshNode_63 = false;
  private boolean isDirty_diamondMeshNode_64 = false;
  private boolean isDirty_diamondMeshNode_65 = false;
  private boolean isDirty_diamondMeshNode_66 = false;
  private boolean isDirty_diamondMeshNode_67 = false;
  private boolean isDirty_diamondMeshNode_68 = false;
  private boolean isDirty_diamondMeshNode_69 = false;
  private boolean isDirty_diamondMeshNode_70 = false;
  private boolean isDirty_diamondMeshNode_71 = false;
  private boolean isDirty_diamondMeshNode_72 = false;
  private boolean isDirty_diamondMeshNode_73 = false;
  private boolean isDirty_diamondMeshNode_74 = false;
  private boolean isDirty_diamondMeshNode_75 = false;
  private boolean isDirty_diamondMeshNode_76 = false;
  private boolean isDirty_diamondMeshNode_77 = false;
  private boolean isDirty_diamondMeshNode_78 = false;
  private boolean isDirty_diamondMeshNode_79 = false;
  private boolean isDirty_diamondMeshNode_80 = false;
  private boolean isDirty_diamondMeshNode_81 = false;
  private boolean isDirty_diamondMeshNode_82 = false;
  private boolean isDirty_diamondMeshNode_83 = false;
  private boolean isDirty_diamondMeshNode_84 = false;
  private boolean isDirty_diamondMeshNode_85 = false;
  private boolean isDirty_diamondMeshNode_86 = false;
  private boolean isDirty_diamondMeshNode_87 = false;
  private boolean isDirty_diamondMeshNode_88 = false;
  private boolean isDirty_diamondMeshNode_89 = false;
  private boolean isDirty_diamondMeshNode_90 = false;
  private boolean isDirty_diamondMeshNode_91 = false;
  private boolean isDirty_diamondMeshNode_92 = false;
  private boolean isDirty_diamondMeshNode_93 = false;
  private boolean isDirty_diamondMeshNode_94 = false;
  private boolean isDirty_diamondMeshNode_95 = false;
  private boolean isDirty_diamondMeshNode_96 = false;
  private boolean isDirty_diamondMeshNode_97 = false;
  private boolean isDirty_diamondMeshNode_98 = false;
  private boolean isDirty_diamondMeshNode_99 = false;
  private boolean isDirty_diamondMeshNode_100 = false;
  private boolean isDirty_diamondMeshRootNode_101 = false;

  //Forked declarations

  //Filter constants

  //unknown event handler
  private Consumer unKnownEventHandler = (e) -> {};

  public DiamondMesh101Processor(Map<Object, Object> contextMap) {
    if (context != null) {
      context.replaceMappings(contextMap);
    }
    context.setClock(clock);
    serviceRegistry.setDataFlowContext(context);
    diamondMeshNode_1.setUpstream1(diamondMeshNode_2);
    diamondMeshNode_1.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_1.value = 0.0;
    diamondMeshNode_1.upstream1 = diamondMeshNode_2;
    diamondMeshNode_1.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_2.setUpstream1(diamondMeshNode_3);
    diamondMeshNode_2.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_2.value = 0.0;
    diamondMeshNode_2.upstream1 = diamondMeshNode_3;
    diamondMeshNode_2.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_3.setUpstream1(diamondMeshNode_4);
    diamondMeshNode_3.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_3.value = 0.0;
    diamondMeshNode_3.upstream1 = diamondMeshNode_4;
    diamondMeshNode_3.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_4.setUpstream1(diamondMeshNode_5);
    diamondMeshNode_4.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_4.value = 0.0;
    diamondMeshNode_4.upstream1 = diamondMeshNode_5;
    diamondMeshNode_4.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_5.setUpstream1(diamondMeshNode_6);
    diamondMeshNode_5.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_5.value = 0.0;
    diamondMeshNode_5.upstream1 = diamondMeshNode_6;
    diamondMeshNode_5.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_6.setUpstream1(diamondMeshNode_7);
    diamondMeshNode_6.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_6.value = 0.0;
    diamondMeshNode_6.upstream1 = diamondMeshNode_7;
    diamondMeshNode_6.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_7.setUpstream1(diamondMeshNode_8);
    diamondMeshNode_7.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_7.value = 0.0;
    diamondMeshNode_7.upstream1 = diamondMeshNode_8;
    diamondMeshNode_7.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_8.setUpstream1(diamondMeshNode_9);
    diamondMeshNode_8.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_8.value = 0.0;
    diamondMeshNode_8.upstream1 = diamondMeshNode_9;
    diamondMeshNode_8.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_9.setUpstream1(diamondMeshNode_10);
    diamondMeshNode_9.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_9.value = 0.0;
    diamondMeshNode_9.upstream1 = diamondMeshNode_10;
    diamondMeshNode_9.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_10.setUpstream1(diamondMeshNode_11);
    diamondMeshNode_10.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_10.value = 0.0;
    diamondMeshNode_10.upstream1 = diamondMeshNode_11;
    diamondMeshNode_10.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_11.setUpstream1(diamondMeshNode_12);
    diamondMeshNode_11.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_11.value = 0.0;
    diamondMeshNode_11.upstream1 = diamondMeshNode_12;
    diamondMeshNode_11.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_12.setUpstream1(diamondMeshNode_13);
    diamondMeshNode_12.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_12.value = 0.0;
    diamondMeshNode_12.upstream1 = diamondMeshNode_13;
    diamondMeshNode_12.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_13.setUpstream1(diamondMeshNode_14);
    diamondMeshNode_13.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_13.value = 0.0;
    diamondMeshNode_13.upstream1 = diamondMeshNode_14;
    diamondMeshNode_13.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_14.setUpstream1(diamondMeshNode_15);
    diamondMeshNode_14.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_14.value = 0.0;
    diamondMeshNode_14.upstream1 = diamondMeshNode_15;
    diamondMeshNode_14.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_15.setUpstream1(diamondMeshNode_16);
    diamondMeshNode_15.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_15.value = 0.0;
    diamondMeshNode_15.upstream1 = diamondMeshNode_16;
    diamondMeshNode_15.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_16.setUpstream1(diamondMeshNode_17);
    diamondMeshNode_16.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_16.value = 0.0;
    diamondMeshNode_16.upstream1 = diamondMeshNode_17;
    diamondMeshNode_16.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_17.setUpstream1(diamondMeshNode_18);
    diamondMeshNode_17.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_17.value = 0.0;
    diamondMeshNode_17.upstream1 = diamondMeshNode_18;
    diamondMeshNode_17.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_18.setUpstream1(diamondMeshNode_19);
    diamondMeshNode_18.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_18.value = 0.0;
    diamondMeshNode_18.upstream1 = diamondMeshNode_19;
    diamondMeshNode_18.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_19.setUpstream1(diamondMeshNode_20);
    diamondMeshNode_19.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_19.value = 0.0;
    diamondMeshNode_19.upstream1 = diamondMeshNode_20;
    diamondMeshNode_19.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_20.setUpstream1(diamondMeshNode_21);
    diamondMeshNode_20.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_20.value = 0.0;
    diamondMeshNode_20.upstream1 = diamondMeshNode_21;
    diamondMeshNode_20.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_21.setUpstream1(diamondMeshNode_22);
    diamondMeshNode_21.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_21.value = 0.0;
    diamondMeshNode_21.upstream1 = diamondMeshNode_22;
    diamondMeshNode_21.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_22.setUpstream1(diamondMeshNode_23);
    diamondMeshNode_22.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_22.value = 0.0;
    diamondMeshNode_22.upstream1 = diamondMeshNode_23;
    diamondMeshNode_22.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_23.setUpstream1(diamondMeshNode_24);
    diamondMeshNode_23.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_23.value = 0.0;
    diamondMeshNode_23.upstream1 = diamondMeshNode_24;
    diamondMeshNode_23.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_24.setUpstream1(diamondMeshNode_25);
    diamondMeshNode_24.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_24.value = 0.0;
    diamondMeshNode_24.upstream1 = diamondMeshNode_25;
    diamondMeshNode_24.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_25.setUpstream1(diamondMeshNode_26);
    diamondMeshNode_25.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_25.value = 0.0;
    diamondMeshNode_25.upstream1 = diamondMeshNode_26;
    diamondMeshNode_25.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_26.setUpstream1(diamondMeshNode_27);
    diamondMeshNode_26.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_26.value = 0.0;
    diamondMeshNode_26.upstream1 = diamondMeshNode_27;
    diamondMeshNode_26.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_27.setUpstream1(diamondMeshNode_28);
    diamondMeshNode_27.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_27.value = 0.0;
    diamondMeshNode_27.upstream1 = diamondMeshNode_28;
    diamondMeshNode_27.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_28.setUpstream1(diamondMeshNode_29);
    diamondMeshNode_28.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_28.value = 0.0;
    diamondMeshNode_28.upstream1 = diamondMeshNode_29;
    diamondMeshNode_28.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_29.setUpstream1(diamondMeshNode_30);
    diamondMeshNode_29.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_29.value = 0.0;
    diamondMeshNode_29.upstream1 = diamondMeshNode_30;
    diamondMeshNode_29.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_30.setUpstream1(diamondMeshNode_31);
    diamondMeshNode_30.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_30.value = 0.0;
    diamondMeshNode_30.upstream1 = diamondMeshNode_31;
    diamondMeshNode_30.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_31.setUpstream1(diamondMeshNode_32);
    diamondMeshNode_31.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_31.value = 0.0;
    diamondMeshNode_31.upstream1 = diamondMeshNode_32;
    diamondMeshNode_31.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_32.setUpstream1(diamondMeshNode_33);
    diamondMeshNode_32.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_32.value = 0.0;
    diamondMeshNode_32.upstream1 = diamondMeshNode_33;
    diamondMeshNode_32.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_33.setUpstream1(diamondMeshNode_34);
    diamondMeshNode_33.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_33.value = 0.0;
    diamondMeshNode_33.upstream1 = diamondMeshNode_34;
    diamondMeshNode_33.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_34.setUpstream1(diamondMeshNode_35);
    diamondMeshNode_34.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_34.value = 0.0;
    diamondMeshNode_34.upstream1 = diamondMeshNode_35;
    diamondMeshNode_34.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_35.setUpstream1(diamondMeshNode_36);
    diamondMeshNode_35.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_35.value = 0.0;
    diamondMeshNode_35.upstream1 = diamondMeshNode_36;
    diamondMeshNode_35.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_36.setUpstream1(diamondMeshNode_37);
    diamondMeshNode_36.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_36.value = 0.0;
    diamondMeshNode_36.upstream1 = diamondMeshNode_37;
    diamondMeshNode_36.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_37.setUpstream1(diamondMeshNode_38);
    diamondMeshNode_37.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_37.value = 0.0;
    diamondMeshNode_37.upstream1 = diamondMeshNode_38;
    diamondMeshNode_37.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_38.setUpstream1(diamondMeshNode_39);
    diamondMeshNode_38.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_38.value = 0.0;
    diamondMeshNode_38.upstream1 = diamondMeshNode_39;
    diamondMeshNode_38.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_39.setUpstream1(diamondMeshNode_40);
    diamondMeshNode_39.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_39.value = 0.0;
    diamondMeshNode_39.upstream1 = diamondMeshNode_40;
    diamondMeshNode_39.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_40.setUpstream1(diamondMeshNode_41);
    diamondMeshNode_40.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_40.value = 0.0;
    diamondMeshNode_40.upstream1 = diamondMeshNode_41;
    diamondMeshNode_40.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_41.setUpstream1(diamondMeshNode_42);
    diamondMeshNode_41.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_41.value = 0.0;
    diamondMeshNode_41.upstream1 = diamondMeshNode_42;
    diamondMeshNode_41.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_42.setUpstream1(diamondMeshNode_43);
    diamondMeshNode_42.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_42.value = 0.0;
    diamondMeshNode_42.upstream1 = diamondMeshNode_43;
    diamondMeshNode_42.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_43.setUpstream1(diamondMeshNode_44);
    diamondMeshNode_43.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_43.value = 0.0;
    diamondMeshNode_43.upstream1 = diamondMeshNode_44;
    diamondMeshNode_43.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_44.setUpstream1(diamondMeshNode_45);
    diamondMeshNode_44.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_44.value = 0.0;
    diamondMeshNode_44.upstream1 = diamondMeshNode_45;
    diamondMeshNode_44.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_45.setUpstream1(diamondMeshNode_46);
    diamondMeshNode_45.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_45.value = 0.0;
    diamondMeshNode_45.upstream1 = diamondMeshNode_46;
    diamondMeshNode_45.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_46.setUpstream1(diamondMeshNode_47);
    diamondMeshNode_46.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_46.value = 0.0;
    diamondMeshNode_46.upstream1 = diamondMeshNode_47;
    diamondMeshNode_46.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_47.setUpstream1(diamondMeshNode_48);
    diamondMeshNode_47.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_47.value = 0.0;
    diamondMeshNode_47.upstream1 = diamondMeshNode_48;
    diamondMeshNode_47.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_48.setUpstream1(diamondMeshNode_49);
    diamondMeshNode_48.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_48.value = 0.0;
    diamondMeshNode_48.upstream1 = diamondMeshNode_49;
    diamondMeshNode_48.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_49.setUpstream1(diamondMeshNode_50);
    diamondMeshNode_49.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_49.value = 0.0;
    diamondMeshNode_49.upstream1 = diamondMeshNode_50;
    diamondMeshNode_49.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_50.setUpstream1(diamondMeshNode_51);
    diamondMeshNode_50.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_50.value = 0.0;
    diamondMeshNode_50.upstream1 = diamondMeshNode_51;
    diamondMeshNode_50.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_51.setUpstream1(diamondMeshNode_52);
    diamondMeshNode_51.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_51.value = 0.0;
    diamondMeshNode_51.upstream1 = diamondMeshNode_52;
    diamondMeshNode_51.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_52.setUpstream1(diamondMeshNode_53);
    diamondMeshNode_52.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_52.value = 0.0;
    diamondMeshNode_52.upstream1 = diamondMeshNode_53;
    diamondMeshNode_52.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_53.setUpstream1(diamondMeshNode_54);
    diamondMeshNode_53.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_53.value = 0.0;
    diamondMeshNode_53.upstream1 = diamondMeshNode_54;
    diamondMeshNode_53.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_54.setUpstream1(diamondMeshNode_55);
    diamondMeshNode_54.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_54.value = 0.0;
    diamondMeshNode_54.upstream1 = diamondMeshNode_55;
    diamondMeshNode_54.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_55.setUpstream1(diamondMeshNode_56);
    diamondMeshNode_55.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_55.value = 0.0;
    diamondMeshNode_55.upstream1 = diamondMeshNode_56;
    diamondMeshNode_55.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_56.setUpstream1(diamondMeshNode_57);
    diamondMeshNode_56.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_56.value = 0.0;
    diamondMeshNode_56.upstream1 = diamondMeshNode_57;
    diamondMeshNode_56.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_57.setUpstream1(diamondMeshNode_58);
    diamondMeshNode_57.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_57.value = 0.0;
    diamondMeshNode_57.upstream1 = diamondMeshNode_58;
    diamondMeshNode_57.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_58.setUpstream1(diamondMeshNode_59);
    diamondMeshNode_58.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_58.value = 0.0;
    diamondMeshNode_58.upstream1 = diamondMeshNode_59;
    diamondMeshNode_58.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_59.setUpstream1(diamondMeshNode_60);
    diamondMeshNode_59.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_59.value = 0.0;
    diamondMeshNode_59.upstream1 = diamondMeshNode_60;
    diamondMeshNode_59.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_60.setUpstream1(diamondMeshNode_61);
    diamondMeshNode_60.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_60.value = 0.0;
    diamondMeshNode_60.upstream1 = diamondMeshNode_61;
    diamondMeshNode_60.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_61.setUpstream1(diamondMeshNode_62);
    diamondMeshNode_61.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_61.value = 0.0;
    diamondMeshNode_61.upstream1 = diamondMeshNode_62;
    diamondMeshNode_61.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_62.setUpstream1(diamondMeshNode_63);
    diamondMeshNode_62.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_62.value = 0.0;
    diamondMeshNode_62.upstream1 = diamondMeshNode_63;
    diamondMeshNode_62.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_63.setUpstream1(diamondMeshNode_64);
    diamondMeshNode_63.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_63.value = 0.0;
    diamondMeshNode_63.upstream1 = diamondMeshNode_64;
    diamondMeshNode_63.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_64.setUpstream1(diamondMeshNode_65);
    diamondMeshNode_64.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_64.value = 0.0;
    diamondMeshNode_64.upstream1 = diamondMeshNode_65;
    diamondMeshNode_64.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_65.setUpstream1(diamondMeshNode_66);
    diamondMeshNode_65.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_65.value = 0.0;
    diamondMeshNode_65.upstream1 = diamondMeshNode_66;
    diamondMeshNode_65.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_66.setUpstream1(diamondMeshNode_67);
    diamondMeshNode_66.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_66.value = 0.0;
    diamondMeshNode_66.upstream1 = diamondMeshNode_67;
    diamondMeshNode_66.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_67.setUpstream1(diamondMeshNode_68);
    diamondMeshNode_67.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_67.value = 0.0;
    diamondMeshNode_67.upstream1 = diamondMeshNode_68;
    diamondMeshNode_67.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_68.setUpstream1(diamondMeshNode_69);
    diamondMeshNode_68.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_68.value = 0.0;
    diamondMeshNode_68.upstream1 = diamondMeshNode_69;
    diamondMeshNode_68.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_69.setUpstream1(diamondMeshNode_70);
    diamondMeshNode_69.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_69.value = 0.0;
    diamondMeshNode_69.upstream1 = diamondMeshNode_70;
    diamondMeshNode_69.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_70.setUpstream1(diamondMeshNode_71);
    diamondMeshNode_70.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_70.value = 0.0;
    diamondMeshNode_70.upstream1 = diamondMeshNode_71;
    diamondMeshNode_70.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_71.setUpstream1(diamondMeshNode_72);
    diamondMeshNode_71.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_71.value = 0.0;
    diamondMeshNode_71.upstream1 = diamondMeshNode_72;
    diamondMeshNode_71.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_72.setUpstream1(diamondMeshNode_73);
    diamondMeshNode_72.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_72.value = 0.0;
    diamondMeshNode_72.upstream1 = diamondMeshNode_73;
    diamondMeshNode_72.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_73.setUpstream1(diamondMeshNode_74);
    diamondMeshNode_73.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_73.value = 0.0;
    diamondMeshNode_73.upstream1 = diamondMeshNode_74;
    diamondMeshNode_73.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_74.setUpstream1(diamondMeshNode_75);
    diamondMeshNode_74.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_74.value = 0.0;
    diamondMeshNode_74.upstream1 = diamondMeshNode_75;
    diamondMeshNode_74.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_75.setUpstream1(diamondMeshNode_76);
    diamondMeshNode_75.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_75.value = 0.0;
    diamondMeshNode_75.upstream1 = diamondMeshNode_76;
    diamondMeshNode_75.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_76.setUpstream1(diamondMeshNode_77);
    diamondMeshNode_76.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_76.value = 0.0;
    diamondMeshNode_76.upstream1 = diamondMeshNode_77;
    diamondMeshNode_76.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_77.setUpstream1(diamondMeshNode_78);
    diamondMeshNode_77.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_77.value = 0.0;
    diamondMeshNode_77.upstream1 = diamondMeshNode_78;
    diamondMeshNode_77.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_78.setUpstream1(diamondMeshNode_79);
    diamondMeshNode_78.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_78.value = 0.0;
    diamondMeshNode_78.upstream1 = diamondMeshNode_79;
    diamondMeshNode_78.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_79.setUpstream1(diamondMeshNode_80);
    diamondMeshNode_79.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_79.value = 0.0;
    diamondMeshNode_79.upstream1 = diamondMeshNode_80;
    diamondMeshNode_79.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_80.setUpstream1(diamondMeshNode_81);
    diamondMeshNode_80.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_80.value = 0.0;
    diamondMeshNode_80.upstream1 = diamondMeshNode_81;
    diamondMeshNode_80.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_81.setUpstream1(diamondMeshNode_82);
    diamondMeshNode_81.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_81.value = 0.0;
    diamondMeshNode_81.upstream1 = diamondMeshNode_82;
    diamondMeshNode_81.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_82.setUpstream1(diamondMeshNode_83);
    diamondMeshNode_82.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_82.value = 0.0;
    diamondMeshNode_82.upstream1 = diamondMeshNode_83;
    diamondMeshNode_82.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_83.setUpstream1(diamondMeshNode_84);
    diamondMeshNode_83.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_83.value = 0.0;
    diamondMeshNode_83.upstream1 = diamondMeshNode_84;
    diamondMeshNode_83.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_84.setUpstream1(diamondMeshNode_85);
    diamondMeshNode_84.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_84.value = 0.0;
    diamondMeshNode_84.upstream1 = diamondMeshNode_85;
    diamondMeshNode_84.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_85.setUpstream1(diamondMeshNode_86);
    diamondMeshNode_85.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_85.value = 0.0;
    diamondMeshNode_85.upstream1 = diamondMeshNode_86;
    diamondMeshNode_85.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_86.setUpstream1(diamondMeshNode_87);
    diamondMeshNode_86.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_86.value = 0.0;
    diamondMeshNode_86.upstream1 = diamondMeshNode_87;
    diamondMeshNode_86.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_87.setUpstream1(diamondMeshNode_88);
    diamondMeshNode_87.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_87.value = 0.0;
    diamondMeshNode_87.upstream1 = diamondMeshNode_88;
    diamondMeshNode_87.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_88.setUpstream1(diamondMeshNode_89);
    diamondMeshNode_88.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_88.value = 0.0;
    diamondMeshNode_88.upstream1 = diamondMeshNode_89;
    diamondMeshNode_88.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_89.setUpstream1(diamondMeshNode_90);
    diamondMeshNode_89.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_89.value = 0.0;
    diamondMeshNode_89.upstream1 = diamondMeshNode_90;
    diamondMeshNode_89.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_90.setUpstream1(diamondMeshNode_91);
    diamondMeshNode_90.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_90.value = 0.0;
    diamondMeshNode_90.upstream1 = diamondMeshNode_91;
    diamondMeshNode_90.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_91.setUpstream1(diamondMeshNode_92);
    diamondMeshNode_91.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_91.value = 0.0;
    diamondMeshNode_91.upstream1 = diamondMeshNode_92;
    diamondMeshNode_91.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_92.setUpstream1(diamondMeshNode_93);
    diamondMeshNode_92.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_92.value = 0.0;
    diamondMeshNode_92.upstream1 = diamondMeshNode_93;
    diamondMeshNode_92.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_93.setUpstream1(diamondMeshNode_94);
    diamondMeshNode_93.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_93.value = 0.0;
    diamondMeshNode_93.upstream1 = diamondMeshNode_94;
    diamondMeshNode_93.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_94.setUpstream1(diamondMeshNode_95);
    diamondMeshNode_94.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_94.value = 0.0;
    diamondMeshNode_94.upstream1 = diamondMeshNode_95;
    diamondMeshNode_94.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_95.setUpstream1(diamondMeshNode_96);
    diamondMeshNode_95.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_95.value = 0.0;
    diamondMeshNode_95.upstream1 = diamondMeshNode_96;
    diamondMeshNode_95.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_96.setUpstream1(diamondMeshNode_97);
    diamondMeshNode_96.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_96.value = 0.0;
    diamondMeshNode_96.upstream1 = diamondMeshNode_97;
    diamondMeshNode_96.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_97.setUpstream1(diamondMeshNode_98);
    diamondMeshNode_97.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_97.value = 0.0;
    diamondMeshNode_97.upstream1 = diamondMeshNode_98;
    diamondMeshNode_97.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_98.setUpstream1(diamondMeshNode_99);
    diamondMeshNode_98.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_98.value = 0.0;
    diamondMeshNode_98.upstream1 = diamondMeshNode_99;
    diamondMeshNode_98.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_99.setUpstream1(diamondMeshNode_100);
    diamondMeshNode_99.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_99.value = 0.0;
    diamondMeshNode_99.upstream1 = diamondMeshNode_100;
    diamondMeshNode_99.upstream2 = diamondMeshRootNode_101;
    diamondMeshNode_100.setUpstream1(diamondMeshRootNode_101);
    diamondMeshNode_100.setUpstream2(diamondMeshRootNode_101);
    diamondMeshNode_100.value = 0.0;
    diamondMeshNode_100.upstream1 = diamondMeshRootNode_101;
    diamondMeshNode_100.upstream2 = diamondMeshRootNode_101;
    sink.setUpstream1(diamondMeshNode_1);
    sink.upstream1 = diamondMeshNode_1;
    sink.value = 0.0;
    diamondMeshRootNode_101.value = 0.0;
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

  public DiamondMesh101Processor() {
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
    isDirty_diamondMeshRootNode_101 = diamondMeshRootNode_101.onMarketData(typedEvent);
    if (guardCheck_diamondMeshNode_100()) {
      isDirty_diamondMeshNode_100 = diamondMeshNode_100.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_99()) {
      isDirty_diamondMeshNode_99 = diamondMeshNode_99.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_98()) {
      isDirty_diamondMeshNode_98 = diamondMeshNode_98.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_97()) {
      isDirty_diamondMeshNode_97 = diamondMeshNode_97.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_96()) {
      isDirty_diamondMeshNode_96 = diamondMeshNode_96.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_95()) {
      isDirty_diamondMeshNode_95 = diamondMeshNode_95.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_94()) {
      isDirty_diamondMeshNode_94 = diamondMeshNode_94.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_93()) {
      isDirty_diamondMeshNode_93 = diamondMeshNode_93.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_92()) {
      isDirty_diamondMeshNode_92 = diamondMeshNode_92.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_91()) {
      isDirty_diamondMeshNode_91 = diamondMeshNode_91.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_90()) {
      isDirty_diamondMeshNode_90 = diamondMeshNode_90.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_89()) {
      isDirty_diamondMeshNode_89 = diamondMeshNode_89.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_88()) {
      isDirty_diamondMeshNode_88 = diamondMeshNode_88.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_87()) {
      isDirty_diamondMeshNode_87 = diamondMeshNode_87.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_86()) {
      isDirty_diamondMeshNode_86 = diamondMeshNode_86.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_85()) {
      isDirty_diamondMeshNode_85 = diamondMeshNode_85.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_84()) {
      isDirty_diamondMeshNode_84 = diamondMeshNode_84.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_83()) {
      isDirty_diamondMeshNode_83 = diamondMeshNode_83.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_82()) {
      isDirty_diamondMeshNode_82 = diamondMeshNode_82.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_81()) {
      isDirty_diamondMeshNode_81 = diamondMeshNode_81.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_80()) {
      isDirty_diamondMeshNode_80 = diamondMeshNode_80.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_79()) {
      isDirty_diamondMeshNode_79 = diamondMeshNode_79.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_78()) {
      isDirty_diamondMeshNode_78 = diamondMeshNode_78.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_77()) {
      isDirty_diamondMeshNode_77 = diamondMeshNode_77.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_76()) {
      isDirty_diamondMeshNode_76 = diamondMeshNode_76.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_75()) {
      isDirty_diamondMeshNode_75 = diamondMeshNode_75.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_74()) {
      isDirty_diamondMeshNode_74 = diamondMeshNode_74.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_73()) {
      isDirty_diamondMeshNode_73 = diamondMeshNode_73.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_72()) {
      isDirty_diamondMeshNode_72 = diamondMeshNode_72.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_71()) {
      isDirty_diamondMeshNode_71 = diamondMeshNode_71.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_70()) {
      isDirty_diamondMeshNode_70 = diamondMeshNode_70.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_69()) {
      isDirty_diamondMeshNode_69 = diamondMeshNode_69.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_68()) {
      isDirty_diamondMeshNode_68 = diamondMeshNode_68.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_67()) {
      isDirty_diamondMeshNode_67 = diamondMeshNode_67.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_66()) {
      isDirty_diamondMeshNode_66 = diamondMeshNode_66.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_65()) {
      isDirty_diamondMeshNode_65 = diamondMeshNode_65.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_64()) {
      isDirty_diamondMeshNode_64 = diamondMeshNode_64.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_63()) {
      isDirty_diamondMeshNode_63 = diamondMeshNode_63.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_62()) {
      isDirty_diamondMeshNode_62 = diamondMeshNode_62.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_61()) {
      isDirty_diamondMeshNode_61 = diamondMeshNode_61.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_60()) {
      isDirty_diamondMeshNode_60 = diamondMeshNode_60.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_59()) {
      isDirty_diamondMeshNode_59 = diamondMeshNode_59.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_58()) {
      isDirty_diamondMeshNode_58 = diamondMeshNode_58.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_57()) {
      isDirty_diamondMeshNode_57 = diamondMeshNode_57.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_56()) {
      isDirty_diamondMeshNode_56 = diamondMeshNode_56.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_55()) {
      isDirty_diamondMeshNode_55 = diamondMeshNode_55.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_54()) {
      isDirty_diamondMeshNode_54 = diamondMeshNode_54.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_53()) {
      isDirty_diamondMeshNode_53 = diamondMeshNode_53.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_52()) {
      isDirty_diamondMeshNode_52 = diamondMeshNode_52.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_51()) {
      isDirty_diamondMeshNode_51 = diamondMeshNode_51.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_50()) {
      isDirty_diamondMeshNode_50 = diamondMeshNode_50.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_49()) {
      isDirty_diamondMeshNode_49 = diamondMeshNode_49.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_48()) {
      isDirty_diamondMeshNode_48 = diamondMeshNode_48.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_47()) {
      isDirty_diamondMeshNode_47 = diamondMeshNode_47.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_46()) {
      isDirty_diamondMeshNode_46 = diamondMeshNode_46.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_45()) {
      isDirty_diamondMeshNode_45 = diamondMeshNode_45.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_44()) {
      isDirty_diamondMeshNode_44 = diamondMeshNode_44.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_43()) {
      isDirty_diamondMeshNode_43 = diamondMeshNode_43.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_42()) {
      isDirty_diamondMeshNode_42 = diamondMeshNode_42.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_41()) {
      isDirty_diamondMeshNode_41 = diamondMeshNode_41.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_40()) {
      isDirty_diamondMeshNode_40 = diamondMeshNode_40.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_39()) {
      isDirty_diamondMeshNode_39 = diamondMeshNode_39.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_38()) {
      isDirty_diamondMeshNode_38 = diamondMeshNode_38.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_37()) {
      isDirty_diamondMeshNode_37 = diamondMeshNode_37.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_36()) {
      isDirty_diamondMeshNode_36 = diamondMeshNode_36.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_35()) {
      isDirty_diamondMeshNode_35 = diamondMeshNode_35.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_34()) {
      isDirty_diamondMeshNode_34 = diamondMeshNode_34.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_33()) {
      isDirty_diamondMeshNode_33 = diamondMeshNode_33.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_32()) {
      isDirty_diamondMeshNode_32 = diamondMeshNode_32.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_31()) {
      isDirty_diamondMeshNode_31 = diamondMeshNode_31.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_30()) {
      isDirty_diamondMeshNode_30 = diamondMeshNode_30.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_29()) {
      isDirty_diamondMeshNode_29 = diamondMeshNode_29.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_28()) {
      isDirty_diamondMeshNode_28 = diamondMeshNode_28.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_27()) {
      isDirty_diamondMeshNode_27 = diamondMeshNode_27.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_26()) {
      isDirty_diamondMeshNode_26 = diamondMeshNode_26.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_25()) {
      isDirty_diamondMeshNode_25 = diamondMeshNode_25.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_24()) {
      isDirty_diamondMeshNode_24 = diamondMeshNode_24.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_23()) {
      isDirty_diamondMeshNode_23 = diamondMeshNode_23.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_22()) {
      isDirty_diamondMeshNode_22 = diamondMeshNode_22.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_21()) {
      isDirty_diamondMeshNode_21 = diamondMeshNode_21.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_20()) {
      isDirty_diamondMeshNode_20 = diamondMeshNode_20.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_19()) {
      isDirty_diamondMeshNode_19 = diamondMeshNode_19.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_18()) {
      isDirty_diamondMeshNode_18 = diamondMeshNode_18.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_17()) {
      isDirty_diamondMeshNode_17 = diamondMeshNode_17.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_16()) {
      isDirty_diamondMeshNode_16 = diamondMeshNode_16.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_15()) {
      isDirty_diamondMeshNode_15 = diamondMeshNode_15.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_14()) {
      isDirty_diamondMeshNode_14 = diamondMeshNode_14.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_13()) {
      isDirty_diamondMeshNode_13 = diamondMeshNode_13.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_12()) {
      isDirty_diamondMeshNode_12 = diamondMeshNode_12.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_11()) {
      isDirty_diamondMeshNode_11 = diamondMeshNode_11.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_10()) {
      isDirty_diamondMeshNode_10 = diamondMeshNode_10.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_9()) {
      isDirty_diamondMeshNode_9 = diamondMeshNode_9.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_8()) {
      isDirty_diamondMeshNode_8 = diamondMeshNode_8.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_7()) {
      isDirty_diamondMeshNode_7 = diamondMeshNode_7.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_6()) {
      isDirty_diamondMeshNode_6 = diamondMeshNode_6.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_5()) {
      isDirty_diamondMeshNode_5 = diamondMeshNode_5.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_4()) {
      isDirty_diamondMeshNode_4 = diamondMeshNode_4.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_3()) {
      isDirty_diamondMeshNode_3 = diamondMeshNode_3.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_2()) {
      isDirty_diamondMeshNode_2 = diamondMeshNode_2.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_1()) {
      isDirty_diamondMeshNode_1 = diamondMeshNode_1.onUpstreamUpdate();
    }
    if (guardCheck_sink()) {
      sink.onUpstreamUpdate();
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
    } else if (event instanceof MarketDataEvent) {
      MarketDataEvent typedEvent = (MarketDataEvent) event;
      auditEvent(typedEvent);
      isDirty_diamondMeshRootNode_101 = diamondMeshRootNode_101.onMarketData(typedEvent);
    }
  }

  public void triggerCalculation() {
    buffering = false;
    String typedEvent = "No event information - buffered dispatch";
    if (guardCheck_diamondMeshNode_100()) {
      isDirty_diamondMeshNode_100 = diamondMeshNode_100.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_99()) {
      isDirty_diamondMeshNode_99 = diamondMeshNode_99.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_98()) {
      isDirty_diamondMeshNode_98 = diamondMeshNode_98.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_97()) {
      isDirty_diamondMeshNode_97 = diamondMeshNode_97.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_96()) {
      isDirty_diamondMeshNode_96 = diamondMeshNode_96.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_95()) {
      isDirty_diamondMeshNode_95 = diamondMeshNode_95.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_94()) {
      isDirty_diamondMeshNode_94 = diamondMeshNode_94.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_93()) {
      isDirty_diamondMeshNode_93 = diamondMeshNode_93.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_92()) {
      isDirty_diamondMeshNode_92 = diamondMeshNode_92.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_91()) {
      isDirty_diamondMeshNode_91 = diamondMeshNode_91.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_90()) {
      isDirty_diamondMeshNode_90 = diamondMeshNode_90.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_89()) {
      isDirty_diamondMeshNode_89 = diamondMeshNode_89.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_88()) {
      isDirty_diamondMeshNode_88 = diamondMeshNode_88.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_87()) {
      isDirty_diamondMeshNode_87 = diamondMeshNode_87.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_86()) {
      isDirty_diamondMeshNode_86 = diamondMeshNode_86.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_85()) {
      isDirty_diamondMeshNode_85 = diamondMeshNode_85.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_84()) {
      isDirty_diamondMeshNode_84 = diamondMeshNode_84.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_83()) {
      isDirty_diamondMeshNode_83 = diamondMeshNode_83.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_82()) {
      isDirty_diamondMeshNode_82 = diamondMeshNode_82.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_81()) {
      isDirty_diamondMeshNode_81 = diamondMeshNode_81.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_80()) {
      isDirty_diamondMeshNode_80 = diamondMeshNode_80.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_79()) {
      isDirty_diamondMeshNode_79 = diamondMeshNode_79.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_78()) {
      isDirty_diamondMeshNode_78 = diamondMeshNode_78.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_77()) {
      isDirty_diamondMeshNode_77 = diamondMeshNode_77.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_76()) {
      isDirty_diamondMeshNode_76 = diamondMeshNode_76.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_75()) {
      isDirty_diamondMeshNode_75 = diamondMeshNode_75.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_74()) {
      isDirty_diamondMeshNode_74 = diamondMeshNode_74.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_73()) {
      isDirty_diamondMeshNode_73 = diamondMeshNode_73.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_72()) {
      isDirty_diamondMeshNode_72 = diamondMeshNode_72.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_71()) {
      isDirty_diamondMeshNode_71 = diamondMeshNode_71.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_70()) {
      isDirty_diamondMeshNode_70 = diamondMeshNode_70.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_69()) {
      isDirty_diamondMeshNode_69 = diamondMeshNode_69.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_68()) {
      isDirty_diamondMeshNode_68 = diamondMeshNode_68.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_67()) {
      isDirty_diamondMeshNode_67 = diamondMeshNode_67.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_66()) {
      isDirty_diamondMeshNode_66 = diamondMeshNode_66.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_65()) {
      isDirty_diamondMeshNode_65 = diamondMeshNode_65.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_64()) {
      isDirty_diamondMeshNode_64 = diamondMeshNode_64.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_63()) {
      isDirty_diamondMeshNode_63 = diamondMeshNode_63.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_62()) {
      isDirty_diamondMeshNode_62 = diamondMeshNode_62.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_61()) {
      isDirty_diamondMeshNode_61 = diamondMeshNode_61.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_60()) {
      isDirty_diamondMeshNode_60 = diamondMeshNode_60.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_59()) {
      isDirty_diamondMeshNode_59 = diamondMeshNode_59.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_58()) {
      isDirty_diamondMeshNode_58 = diamondMeshNode_58.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_57()) {
      isDirty_diamondMeshNode_57 = diamondMeshNode_57.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_56()) {
      isDirty_diamondMeshNode_56 = diamondMeshNode_56.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_55()) {
      isDirty_diamondMeshNode_55 = diamondMeshNode_55.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_54()) {
      isDirty_diamondMeshNode_54 = diamondMeshNode_54.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_53()) {
      isDirty_diamondMeshNode_53 = diamondMeshNode_53.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_52()) {
      isDirty_diamondMeshNode_52 = diamondMeshNode_52.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_51()) {
      isDirty_diamondMeshNode_51 = diamondMeshNode_51.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_50()) {
      isDirty_diamondMeshNode_50 = diamondMeshNode_50.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_49()) {
      isDirty_diamondMeshNode_49 = diamondMeshNode_49.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_48()) {
      isDirty_diamondMeshNode_48 = diamondMeshNode_48.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_47()) {
      isDirty_diamondMeshNode_47 = diamondMeshNode_47.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_46()) {
      isDirty_diamondMeshNode_46 = diamondMeshNode_46.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_45()) {
      isDirty_diamondMeshNode_45 = diamondMeshNode_45.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_44()) {
      isDirty_diamondMeshNode_44 = diamondMeshNode_44.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_43()) {
      isDirty_diamondMeshNode_43 = diamondMeshNode_43.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_42()) {
      isDirty_diamondMeshNode_42 = diamondMeshNode_42.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_41()) {
      isDirty_diamondMeshNode_41 = diamondMeshNode_41.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_40()) {
      isDirty_diamondMeshNode_40 = diamondMeshNode_40.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_39()) {
      isDirty_diamondMeshNode_39 = diamondMeshNode_39.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_38()) {
      isDirty_diamondMeshNode_38 = diamondMeshNode_38.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_37()) {
      isDirty_diamondMeshNode_37 = diamondMeshNode_37.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_36()) {
      isDirty_diamondMeshNode_36 = diamondMeshNode_36.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_35()) {
      isDirty_diamondMeshNode_35 = diamondMeshNode_35.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_34()) {
      isDirty_diamondMeshNode_34 = diamondMeshNode_34.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_33()) {
      isDirty_diamondMeshNode_33 = diamondMeshNode_33.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_32()) {
      isDirty_diamondMeshNode_32 = diamondMeshNode_32.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_31()) {
      isDirty_diamondMeshNode_31 = diamondMeshNode_31.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_30()) {
      isDirty_diamondMeshNode_30 = diamondMeshNode_30.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_29()) {
      isDirty_diamondMeshNode_29 = diamondMeshNode_29.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_28()) {
      isDirty_diamondMeshNode_28 = diamondMeshNode_28.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_27()) {
      isDirty_diamondMeshNode_27 = diamondMeshNode_27.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_26()) {
      isDirty_diamondMeshNode_26 = diamondMeshNode_26.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_25()) {
      isDirty_diamondMeshNode_25 = diamondMeshNode_25.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_24()) {
      isDirty_diamondMeshNode_24 = diamondMeshNode_24.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_23()) {
      isDirty_diamondMeshNode_23 = diamondMeshNode_23.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_22()) {
      isDirty_diamondMeshNode_22 = diamondMeshNode_22.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_21()) {
      isDirty_diamondMeshNode_21 = diamondMeshNode_21.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_20()) {
      isDirty_diamondMeshNode_20 = diamondMeshNode_20.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_19()) {
      isDirty_diamondMeshNode_19 = diamondMeshNode_19.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_18()) {
      isDirty_diamondMeshNode_18 = diamondMeshNode_18.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_17()) {
      isDirty_diamondMeshNode_17 = diamondMeshNode_17.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_16()) {
      isDirty_diamondMeshNode_16 = diamondMeshNode_16.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_15()) {
      isDirty_diamondMeshNode_15 = diamondMeshNode_15.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_14()) {
      isDirty_diamondMeshNode_14 = diamondMeshNode_14.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_13()) {
      isDirty_diamondMeshNode_13 = diamondMeshNode_13.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_12()) {
      isDirty_diamondMeshNode_12 = diamondMeshNode_12.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_11()) {
      isDirty_diamondMeshNode_11 = diamondMeshNode_11.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_10()) {
      isDirty_diamondMeshNode_10 = diamondMeshNode_10.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_9()) {
      isDirty_diamondMeshNode_9 = diamondMeshNode_9.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_8()) {
      isDirty_diamondMeshNode_8 = diamondMeshNode_8.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_7()) {
      isDirty_diamondMeshNode_7 = diamondMeshNode_7.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_6()) {
      isDirty_diamondMeshNode_6 = diamondMeshNode_6.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_5()) {
      isDirty_diamondMeshNode_5 = diamondMeshNode_5.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_4()) {
      isDirty_diamondMeshNode_4 = diamondMeshNode_4.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_3()) {
      isDirty_diamondMeshNode_3 = diamondMeshNode_3.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_2()) {
      isDirty_diamondMeshNode_2 = diamondMeshNode_2.onUpstreamUpdate();
    }
    if (guardCheck_diamondMeshNode_1()) {
      isDirty_diamondMeshNode_1 = diamondMeshNode_1.onUpstreamUpdate();
    }
    if (guardCheck_sink()) {
      sink.onUpstreamUpdate();
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
    auditor.nodeRegistered(diamondMeshNode_1, "diamondMeshNode_1");
    auditor.nodeRegistered(diamondMeshNode_2, "diamondMeshNode_2");
    auditor.nodeRegistered(diamondMeshNode_3, "diamondMeshNode_3");
    auditor.nodeRegistered(diamondMeshNode_4, "diamondMeshNode_4");
    auditor.nodeRegistered(diamondMeshNode_5, "diamondMeshNode_5");
    auditor.nodeRegistered(diamondMeshNode_6, "diamondMeshNode_6");
    auditor.nodeRegistered(diamondMeshNode_7, "diamondMeshNode_7");
    auditor.nodeRegistered(diamondMeshNode_8, "diamondMeshNode_8");
    auditor.nodeRegistered(diamondMeshNode_9, "diamondMeshNode_9");
    auditor.nodeRegistered(diamondMeshNode_10, "diamondMeshNode_10");
    auditor.nodeRegistered(diamondMeshNode_11, "diamondMeshNode_11");
    auditor.nodeRegistered(diamondMeshNode_12, "diamondMeshNode_12");
    auditor.nodeRegistered(diamondMeshNode_13, "diamondMeshNode_13");
    auditor.nodeRegistered(diamondMeshNode_14, "diamondMeshNode_14");
    auditor.nodeRegistered(diamondMeshNode_15, "diamondMeshNode_15");
    auditor.nodeRegistered(diamondMeshNode_16, "diamondMeshNode_16");
    auditor.nodeRegistered(diamondMeshNode_17, "diamondMeshNode_17");
    auditor.nodeRegistered(diamondMeshNode_18, "diamondMeshNode_18");
    auditor.nodeRegistered(diamondMeshNode_19, "diamondMeshNode_19");
    auditor.nodeRegistered(diamondMeshNode_20, "diamondMeshNode_20");
    auditor.nodeRegistered(diamondMeshNode_21, "diamondMeshNode_21");
    auditor.nodeRegistered(diamondMeshNode_22, "diamondMeshNode_22");
    auditor.nodeRegistered(diamondMeshNode_23, "diamondMeshNode_23");
    auditor.nodeRegistered(diamondMeshNode_24, "diamondMeshNode_24");
    auditor.nodeRegistered(diamondMeshNode_25, "diamondMeshNode_25");
    auditor.nodeRegistered(diamondMeshNode_26, "diamondMeshNode_26");
    auditor.nodeRegistered(diamondMeshNode_27, "diamondMeshNode_27");
    auditor.nodeRegistered(diamondMeshNode_28, "diamondMeshNode_28");
    auditor.nodeRegistered(diamondMeshNode_29, "diamondMeshNode_29");
    auditor.nodeRegistered(diamondMeshNode_30, "diamondMeshNode_30");
    auditor.nodeRegistered(diamondMeshNode_31, "diamondMeshNode_31");
    auditor.nodeRegistered(diamondMeshNode_32, "diamondMeshNode_32");
    auditor.nodeRegistered(diamondMeshNode_33, "diamondMeshNode_33");
    auditor.nodeRegistered(diamondMeshNode_34, "diamondMeshNode_34");
    auditor.nodeRegistered(diamondMeshNode_35, "diamondMeshNode_35");
    auditor.nodeRegistered(diamondMeshNode_36, "diamondMeshNode_36");
    auditor.nodeRegistered(diamondMeshNode_37, "diamondMeshNode_37");
    auditor.nodeRegistered(diamondMeshNode_38, "diamondMeshNode_38");
    auditor.nodeRegistered(diamondMeshNode_39, "diamondMeshNode_39");
    auditor.nodeRegistered(diamondMeshNode_40, "diamondMeshNode_40");
    auditor.nodeRegistered(diamondMeshNode_41, "diamondMeshNode_41");
    auditor.nodeRegistered(diamondMeshNode_42, "diamondMeshNode_42");
    auditor.nodeRegistered(diamondMeshNode_43, "diamondMeshNode_43");
    auditor.nodeRegistered(diamondMeshNode_44, "diamondMeshNode_44");
    auditor.nodeRegistered(diamondMeshNode_45, "diamondMeshNode_45");
    auditor.nodeRegistered(diamondMeshNode_46, "diamondMeshNode_46");
    auditor.nodeRegistered(diamondMeshNode_47, "diamondMeshNode_47");
    auditor.nodeRegistered(diamondMeshNode_48, "diamondMeshNode_48");
    auditor.nodeRegistered(diamondMeshNode_49, "diamondMeshNode_49");
    auditor.nodeRegistered(diamondMeshNode_50, "diamondMeshNode_50");
    auditor.nodeRegistered(diamondMeshNode_51, "diamondMeshNode_51");
    auditor.nodeRegistered(diamondMeshNode_52, "diamondMeshNode_52");
    auditor.nodeRegistered(diamondMeshNode_53, "diamondMeshNode_53");
    auditor.nodeRegistered(diamondMeshNode_54, "diamondMeshNode_54");
    auditor.nodeRegistered(diamondMeshNode_55, "diamondMeshNode_55");
    auditor.nodeRegistered(diamondMeshNode_56, "diamondMeshNode_56");
    auditor.nodeRegistered(diamondMeshNode_57, "diamondMeshNode_57");
    auditor.nodeRegistered(diamondMeshNode_58, "diamondMeshNode_58");
    auditor.nodeRegistered(diamondMeshNode_59, "diamondMeshNode_59");
    auditor.nodeRegistered(diamondMeshNode_60, "diamondMeshNode_60");
    auditor.nodeRegistered(diamondMeshNode_61, "diamondMeshNode_61");
    auditor.nodeRegistered(diamondMeshNode_62, "diamondMeshNode_62");
    auditor.nodeRegistered(diamondMeshNode_63, "diamondMeshNode_63");
    auditor.nodeRegistered(diamondMeshNode_64, "diamondMeshNode_64");
    auditor.nodeRegistered(diamondMeshNode_65, "diamondMeshNode_65");
    auditor.nodeRegistered(diamondMeshNode_66, "diamondMeshNode_66");
    auditor.nodeRegistered(diamondMeshNode_67, "diamondMeshNode_67");
    auditor.nodeRegistered(diamondMeshNode_68, "diamondMeshNode_68");
    auditor.nodeRegistered(diamondMeshNode_69, "diamondMeshNode_69");
    auditor.nodeRegistered(diamondMeshNode_70, "diamondMeshNode_70");
    auditor.nodeRegistered(diamondMeshNode_71, "diamondMeshNode_71");
    auditor.nodeRegistered(diamondMeshNode_72, "diamondMeshNode_72");
    auditor.nodeRegistered(diamondMeshNode_73, "diamondMeshNode_73");
    auditor.nodeRegistered(diamondMeshNode_74, "diamondMeshNode_74");
    auditor.nodeRegistered(diamondMeshNode_75, "diamondMeshNode_75");
    auditor.nodeRegistered(diamondMeshNode_76, "diamondMeshNode_76");
    auditor.nodeRegistered(diamondMeshNode_77, "diamondMeshNode_77");
    auditor.nodeRegistered(diamondMeshNode_78, "diamondMeshNode_78");
    auditor.nodeRegistered(diamondMeshNode_79, "diamondMeshNode_79");
    auditor.nodeRegistered(diamondMeshNode_80, "diamondMeshNode_80");
    auditor.nodeRegistered(diamondMeshNode_81, "diamondMeshNode_81");
    auditor.nodeRegistered(diamondMeshNode_82, "diamondMeshNode_82");
    auditor.nodeRegistered(diamondMeshNode_83, "diamondMeshNode_83");
    auditor.nodeRegistered(diamondMeshNode_84, "diamondMeshNode_84");
    auditor.nodeRegistered(diamondMeshNode_85, "diamondMeshNode_85");
    auditor.nodeRegistered(diamondMeshNode_86, "diamondMeshNode_86");
    auditor.nodeRegistered(diamondMeshNode_87, "diamondMeshNode_87");
    auditor.nodeRegistered(diamondMeshNode_88, "diamondMeshNode_88");
    auditor.nodeRegistered(diamondMeshNode_89, "diamondMeshNode_89");
    auditor.nodeRegistered(diamondMeshNode_90, "diamondMeshNode_90");
    auditor.nodeRegistered(diamondMeshNode_91, "diamondMeshNode_91");
    auditor.nodeRegistered(diamondMeshNode_92, "diamondMeshNode_92");
    auditor.nodeRegistered(diamondMeshNode_93, "diamondMeshNode_93");
    auditor.nodeRegistered(diamondMeshNode_94, "diamondMeshNode_94");
    auditor.nodeRegistered(diamondMeshNode_95, "diamondMeshNode_95");
    auditor.nodeRegistered(diamondMeshNode_96, "diamondMeshNode_96");
    auditor.nodeRegistered(diamondMeshNode_97, "diamondMeshNode_97");
    auditor.nodeRegistered(diamondMeshNode_98, "diamondMeshNode_98");
    auditor.nodeRegistered(diamondMeshNode_99, "diamondMeshNode_99");
    auditor.nodeRegistered(diamondMeshNode_100, "diamondMeshNode_100");
    auditor.nodeRegistered(sink, "sink");
    auditor.nodeRegistered(diamondMeshRootNode_101, "diamondMeshRootNode_101");
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
    isDirty_diamondMeshNode_1 = false;
    isDirty_diamondMeshNode_2 = false;
    isDirty_diamondMeshNode_3 = false;
    isDirty_diamondMeshNode_4 = false;
    isDirty_diamondMeshNode_5 = false;
    isDirty_diamondMeshNode_6 = false;
    isDirty_diamondMeshNode_7 = false;
    isDirty_diamondMeshNode_8 = false;
    isDirty_diamondMeshNode_9 = false;
    isDirty_diamondMeshNode_10 = false;
    isDirty_diamondMeshNode_11 = false;
    isDirty_diamondMeshNode_12 = false;
    isDirty_diamondMeshNode_13 = false;
    isDirty_diamondMeshNode_14 = false;
    isDirty_diamondMeshNode_15 = false;
    isDirty_diamondMeshNode_16 = false;
    isDirty_diamondMeshNode_17 = false;
    isDirty_diamondMeshNode_18 = false;
    isDirty_diamondMeshNode_19 = false;
    isDirty_diamondMeshNode_20 = false;
    isDirty_diamondMeshNode_21 = false;
    isDirty_diamondMeshNode_22 = false;
    isDirty_diamondMeshNode_23 = false;
    isDirty_diamondMeshNode_24 = false;
    isDirty_diamondMeshNode_25 = false;
    isDirty_diamondMeshNode_26 = false;
    isDirty_diamondMeshNode_27 = false;
    isDirty_diamondMeshNode_28 = false;
    isDirty_diamondMeshNode_29 = false;
    isDirty_diamondMeshNode_30 = false;
    isDirty_diamondMeshNode_31 = false;
    isDirty_diamondMeshNode_32 = false;
    isDirty_diamondMeshNode_33 = false;
    isDirty_diamondMeshNode_34 = false;
    isDirty_diamondMeshNode_35 = false;
    isDirty_diamondMeshNode_36 = false;
    isDirty_diamondMeshNode_37 = false;
    isDirty_diamondMeshNode_38 = false;
    isDirty_diamondMeshNode_39 = false;
    isDirty_diamondMeshNode_40 = false;
    isDirty_diamondMeshNode_41 = false;
    isDirty_diamondMeshNode_42 = false;
    isDirty_diamondMeshNode_43 = false;
    isDirty_diamondMeshNode_44 = false;
    isDirty_diamondMeshNode_45 = false;
    isDirty_diamondMeshNode_46 = false;
    isDirty_diamondMeshNode_47 = false;
    isDirty_diamondMeshNode_48 = false;
    isDirty_diamondMeshNode_49 = false;
    isDirty_diamondMeshNode_50 = false;
    isDirty_diamondMeshNode_51 = false;
    isDirty_diamondMeshNode_52 = false;
    isDirty_diamondMeshNode_53 = false;
    isDirty_diamondMeshNode_54 = false;
    isDirty_diamondMeshNode_55 = false;
    isDirty_diamondMeshNode_56 = false;
    isDirty_diamondMeshNode_57 = false;
    isDirty_diamondMeshNode_58 = false;
    isDirty_diamondMeshNode_59 = false;
    isDirty_diamondMeshNode_60 = false;
    isDirty_diamondMeshNode_61 = false;
    isDirty_diamondMeshNode_62 = false;
    isDirty_diamondMeshNode_63 = false;
    isDirty_diamondMeshNode_64 = false;
    isDirty_diamondMeshNode_65 = false;
    isDirty_diamondMeshNode_66 = false;
    isDirty_diamondMeshNode_67 = false;
    isDirty_diamondMeshNode_68 = false;
    isDirty_diamondMeshNode_69 = false;
    isDirty_diamondMeshNode_70 = false;
    isDirty_diamondMeshNode_71 = false;
    isDirty_diamondMeshNode_72 = false;
    isDirty_diamondMeshNode_73 = false;
    isDirty_diamondMeshNode_74 = false;
    isDirty_diamondMeshNode_75 = false;
    isDirty_diamondMeshNode_76 = false;
    isDirty_diamondMeshNode_77 = false;
    isDirty_diamondMeshNode_78 = false;
    isDirty_diamondMeshNode_79 = false;
    isDirty_diamondMeshNode_80 = false;
    isDirty_diamondMeshNode_81 = false;
    isDirty_diamondMeshNode_82 = false;
    isDirty_diamondMeshNode_83 = false;
    isDirty_diamondMeshNode_84 = false;
    isDirty_diamondMeshNode_85 = false;
    isDirty_diamondMeshNode_86 = false;
    isDirty_diamondMeshNode_87 = false;
    isDirty_diamondMeshNode_88 = false;
    isDirty_diamondMeshNode_89 = false;
    isDirty_diamondMeshNode_90 = false;
    isDirty_diamondMeshNode_91 = false;
    isDirty_diamondMeshNode_92 = false;
    isDirty_diamondMeshNode_93 = false;
    isDirty_diamondMeshNode_94 = false;
    isDirty_diamondMeshNode_95 = false;
    isDirty_diamondMeshNode_96 = false;
    isDirty_diamondMeshNode_97 = false;
    isDirty_diamondMeshNode_98 = false;
    isDirty_diamondMeshNode_99 = false;
    isDirty_diamondMeshNode_100 = false;
    isDirty_diamondMeshRootNode_101 = false;
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
      dirtyFlagSupplierMap.put(diamondMeshNode_1, () -> isDirty_diamondMeshNode_1);
      dirtyFlagSupplierMap.put(diamondMeshNode_10, () -> isDirty_diamondMeshNode_10);
      dirtyFlagSupplierMap.put(diamondMeshNode_100, () -> isDirty_diamondMeshNode_100);
      dirtyFlagSupplierMap.put(diamondMeshNode_11, () -> isDirty_diamondMeshNode_11);
      dirtyFlagSupplierMap.put(diamondMeshNode_12, () -> isDirty_diamondMeshNode_12);
      dirtyFlagSupplierMap.put(diamondMeshNode_13, () -> isDirty_diamondMeshNode_13);
      dirtyFlagSupplierMap.put(diamondMeshNode_14, () -> isDirty_diamondMeshNode_14);
      dirtyFlagSupplierMap.put(diamondMeshNode_15, () -> isDirty_diamondMeshNode_15);
      dirtyFlagSupplierMap.put(diamondMeshNode_16, () -> isDirty_diamondMeshNode_16);
      dirtyFlagSupplierMap.put(diamondMeshNode_17, () -> isDirty_diamondMeshNode_17);
      dirtyFlagSupplierMap.put(diamondMeshNode_18, () -> isDirty_diamondMeshNode_18);
      dirtyFlagSupplierMap.put(diamondMeshNode_19, () -> isDirty_diamondMeshNode_19);
      dirtyFlagSupplierMap.put(diamondMeshNode_2, () -> isDirty_diamondMeshNode_2);
      dirtyFlagSupplierMap.put(diamondMeshNode_20, () -> isDirty_diamondMeshNode_20);
      dirtyFlagSupplierMap.put(diamondMeshNode_21, () -> isDirty_diamondMeshNode_21);
      dirtyFlagSupplierMap.put(diamondMeshNode_22, () -> isDirty_diamondMeshNode_22);
      dirtyFlagSupplierMap.put(diamondMeshNode_23, () -> isDirty_diamondMeshNode_23);
      dirtyFlagSupplierMap.put(diamondMeshNode_24, () -> isDirty_diamondMeshNode_24);
      dirtyFlagSupplierMap.put(diamondMeshNode_25, () -> isDirty_diamondMeshNode_25);
      dirtyFlagSupplierMap.put(diamondMeshNode_26, () -> isDirty_diamondMeshNode_26);
      dirtyFlagSupplierMap.put(diamondMeshNode_27, () -> isDirty_diamondMeshNode_27);
      dirtyFlagSupplierMap.put(diamondMeshNode_28, () -> isDirty_diamondMeshNode_28);
      dirtyFlagSupplierMap.put(diamondMeshNode_29, () -> isDirty_diamondMeshNode_29);
      dirtyFlagSupplierMap.put(diamondMeshNode_3, () -> isDirty_diamondMeshNode_3);
      dirtyFlagSupplierMap.put(diamondMeshNode_30, () -> isDirty_diamondMeshNode_30);
      dirtyFlagSupplierMap.put(diamondMeshNode_31, () -> isDirty_diamondMeshNode_31);
      dirtyFlagSupplierMap.put(diamondMeshNode_32, () -> isDirty_diamondMeshNode_32);
      dirtyFlagSupplierMap.put(diamondMeshNode_33, () -> isDirty_diamondMeshNode_33);
      dirtyFlagSupplierMap.put(diamondMeshNode_34, () -> isDirty_diamondMeshNode_34);
      dirtyFlagSupplierMap.put(diamondMeshNode_35, () -> isDirty_diamondMeshNode_35);
      dirtyFlagSupplierMap.put(diamondMeshNode_36, () -> isDirty_diamondMeshNode_36);
      dirtyFlagSupplierMap.put(diamondMeshNode_37, () -> isDirty_diamondMeshNode_37);
      dirtyFlagSupplierMap.put(diamondMeshNode_38, () -> isDirty_diamondMeshNode_38);
      dirtyFlagSupplierMap.put(diamondMeshNode_39, () -> isDirty_diamondMeshNode_39);
      dirtyFlagSupplierMap.put(diamondMeshNode_4, () -> isDirty_diamondMeshNode_4);
      dirtyFlagSupplierMap.put(diamondMeshNode_40, () -> isDirty_diamondMeshNode_40);
      dirtyFlagSupplierMap.put(diamondMeshNode_41, () -> isDirty_diamondMeshNode_41);
      dirtyFlagSupplierMap.put(diamondMeshNode_42, () -> isDirty_diamondMeshNode_42);
      dirtyFlagSupplierMap.put(diamondMeshNode_43, () -> isDirty_diamondMeshNode_43);
      dirtyFlagSupplierMap.put(diamondMeshNode_44, () -> isDirty_diamondMeshNode_44);
      dirtyFlagSupplierMap.put(diamondMeshNode_45, () -> isDirty_diamondMeshNode_45);
      dirtyFlagSupplierMap.put(diamondMeshNode_46, () -> isDirty_diamondMeshNode_46);
      dirtyFlagSupplierMap.put(diamondMeshNode_47, () -> isDirty_diamondMeshNode_47);
      dirtyFlagSupplierMap.put(diamondMeshNode_48, () -> isDirty_diamondMeshNode_48);
      dirtyFlagSupplierMap.put(diamondMeshNode_49, () -> isDirty_diamondMeshNode_49);
      dirtyFlagSupplierMap.put(diamondMeshNode_5, () -> isDirty_diamondMeshNode_5);
      dirtyFlagSupplierMap.put(diamondMeshNode_50, () -> isDirty_diamondMeshNode_50);
      dirtyFlagSupplierMap.put(diamondMeshNode_51, () -> isDirty_diamondMeshNode_51);
      dirtyFlagSupplierMap.put(diamondMeshNode_52, () -> isDirty_diamondMeshNode_52);
      dirtyFlagSupplierMap.put(diamondMeshNode_53, () -> isDirty_diamondMeshNode_53);
      dirtyFlagSupplierMap.put(diamondMeshNode_54, () -> isDirty_diamondMeshNode_54);
      dirtyFlagSupplierMap.put(diamondMeshNode_55, () -> isDirty_diamondMeshNode_55);
      dirtyFlagSupplierMap.put(diamondMeshNode_56, () -> isDirty_diamondMeshNode_56);
      dirtyFlagSupplierMap.put(diamondMeshNode_57, () -> isDirty_diamondMeshNode_57);
      dirtyFlagSupplierMap.put(diamondMeshNode_58, () -> isDirty_diamondMeshNode_58);
      dirtyFlagSupplierMap.put(diamondMeshNode_59, () -> isDirty_diamondMeshNode_59);
      dirtyFlagSupplierMap.put(diamondMeshNode_6, () -> isDirty_diamondMeshNode_6);
      dirtyFlagSupplierMap.put(diamondMeshNode_60, () -> isDirty_diamondMeshNode_60);
      dirtyFlagSupplierMap.put(diamondMeshNode_61, () -> isDirty_diamondMeshNode_61);
      dirtyFlagSupplierMap.put(diamondMeshNode_62, () -> isDirty_diamondMeshNode_62);
      dirtyFlagSupplierMap.put(diamondMeshNode_63, () -> isDirty_diamondMeshNode_63);
      dirtyFlagSupplierMap.put(diamondMeshNode_64, () -> isDirty_diamondMeshNode_64);
      dirtyFlagSupplierMap.put(diamondMeshNode_65, () -> isDirty_diamondMeshNode_65);
      dirtyFlagSupplierMap.put(diamondMeshNode_66, () -> isDirty_diamondMeshNode_66);
      dirtyFlagSupplierMap.put(diamondMeshNode_67, () -> isDirty_diamondMeshNode_67);
      dirtyFlagSupplierMap.put(diamondMeshNode_68, () -> isDirty_diamondMeshNode_68);
      dirtyFlagSupplierMap.put(diamondMeshNode_69, () -> isDirty_diamondMeshNode_69);
      dirtyFlagSupplierMap.put(diamondMeshNode_7, () -> isDirty_diamondMeshNode_7);
      dirtyFlagSupplierMap.put(diamondMeshNode_70, () -> isDirty_diamondMeshNode_70);
      dirtyFlagSupplierMap.put(diamondMeshNode_71, () -> isDirty_diamondMeshNode_71);
      dirtyFlagSupplierMap.put(diamondMeshNode_72, () -> isDirty_diamondMeshNode_72);
      dirtyFlagSupplierMap.put(diamondMeshNode_73, () -> isDirty_diamondMeshNode_73);
      dirtyFlagSupplierMap.put(diamondMeshNode_74, () -> isDirty_diamondMeshNode_74);
      dirtyFlagSupplierMap.put(diamondMeshNode_75, () -> isDirty_diamondMeshNode_75);
      dirtyFlagSupplierMap.put(diamondMeshNode_76, () -> isDirty_diamondMeshNode_76);
      dirtyFlagSupplierMap.put(diamondMeshNode_77, () -> isDirty_diamondMeshNode_77);
      dirtyFlagSupplierMap.put(diamondMeshNode_78, () -> isDirty_diamondMeshNode_78);
      dirtyFlagSupplierMap.put(diamondMeshNode_79, () -> isDirty_diamondMeshNode_79);
      dirtyFlagSupplierMap.put(diamondMeshNode_8, () -> isDirty_diamondMeshNode_8);
      dirtyFlagSupplierMap.put(diamondMeshNode_80, () -> isDirty_diamondMeshNode_80);
      dirtyFlagSupplierMap.put(diamondMeshNode_81, () -> isDirty_diamondMeshNode_81);
      dirtyFlagSupplierMap.put(diamondMeshNode_82, () -> isDirty_diamondMeshNode_82);
      dirtyFlagSupplierMap.put(diamondMeshNode_83, () -> isDirty_diamondMeshNode_83);
      dirtyFlagSupplierMap.put(diamondMeshNode_84, () -> isDirty_diamondMeshNode_84);
      dirtyFlagSupplierMap.put(diamondMeshNode_85, () -> isDirty_diamondMeshNode_85);
      dirtyFlagSupplierMap.put(diamondMeshNode_86, () -> isDirty_diamondMeshNode_86);
      dirtyFlagSupplierMap.put(diamondMeshNode_87, () -> isDirty_diamondMeshNode_87);
      dirtyFlagSupplierMap.put(diamondMeshNode_88, () -> isDirty_diamondMeshNode_88);
      dirtyFlagSupplierMap.put(diamondMeshNode_89, () -> isDirty_diamondMeshNode_89);
      dirtyFlagSupplierMap.put(diamondMeshNode_9, () -> isDirty_diamondMeshNode_9);
      dirtyFlagSupplierMap.put(diamondMeshNode_90, () -> isDirty_diamondMeshNode_90);
      dirtyFlagSupplierMap.put(diamondMeshNode_91, () -> isDirty_diamondMeshNode_91);
      dirtyFlagSupplierMap.put(diamondMeshNode_92, () -> isDirty_diamondMeshNode_92);
      dirtyFlagSupplierMap.put(diamondMeshNode_93, () -> isDirty_diamondMeshNode_93);
      dirtyFlagSupplierMap.put(diamondMeshNode_94, () -> isDirty_diamondMeshNode_94);
      dirtyFlagSupplierMap.put(diamondMeshNode_95, () -> isDirty_diamondMeshNode_95);
      dirtyFlagSupplierMap.put(diamondMeshNode_96, () -> isDirty_diamondMeshNode_96);
      dirtyFlagSupplierMap.put(diamondMeshNode_97, () -> isDirty_diamondMeshNode_97);
      dirtyFlagSupplierMap.put(diamondMeshNode_98, () -> isDirty_diamondMeshNode_98);
      dirtyFlagSupplierMap.put(diamondMeshNode_99, () -> isDirty_diamondMeshNode_99);
      dirtyFlagSupplierMap.put(diamondMeshRootNode_101, () -> isDirty_diamondMeshRootNode_101);
    }
    return dirtyFlagSupplierMap.getOrDefault(node, DataFlow.ALWAYS_FALSE);
  }

  @Override
  public void setDirty(Object node, boolean dirtyFlag) {
    if (dirtyFlagUpdateMap.isEmpty()) {
      dirtyFlagUpdateMap.put(diamondMeshNode_1, (b) -> isDirty_diamondMeshNode_1 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_10, (b) -> isDirty_diamondMeshNode_10 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_100, (b) -> isDirty_diamondMeshNode_100 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_11, (b) -> isDirty_diamondMeshNode_11 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_12, (b) -> isDirty_diamondMeshNode_12 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_13, (b) -> isDirty_diamondMeshNode_13 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_14, (b) -> isDirty_diamondMeshNode_14 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_15, (b) -> isDirty_diamondMeshNode_15 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_16, (b) -> isDirty_diamondMeshNode_16 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_17, (b) -> isDirty_diamondMeshNode_17 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_18, (b) -> isDirty_diamondMeshNode_18 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_19, (b) -> isDirty_diamondMeshNode_19 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_2, (b) -> isDirty_diamondMeshNode_2 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_20, (b) -> isDirty_diamondMeshNode_20 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_21, (b) -> isDirty_diamondMeshNode_21 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_22, (b) -> isDirty_diamondMeshNode_22 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_23, (b) -> isDirty_diamondMeshNode_23 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_24, (b) -> isDirty_diamondMeshNode_24 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_25, (b) -> isDirty_diamondMeshNode_25 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_26, (b) -> isDirty_diamondMeshNode_26 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_27, (b) -> isDirty_diamondMeshNode_27 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_28, (b) -> isDirty_diamondMeshNode_28 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_29, (b) -> isDirty_diamondMeshNode_29 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_3, (b) -> isDirty_diamondMeshNode_3 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_30, (b) -> isDirty_diamondMeshNode_30 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_31, (b) -> isDirty_diamondMeshNode_31 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_32, (b) -> isDirty_diamondMeshNode_32 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_33, (b) -> isDirty_diamondMeshNode_33 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_34, (b) -> isDirty_diamondMeshNode_34 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_35, (b) -> isDirty_diamondMeshNode_35 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_36, (b) -> isDirty_diamondMeshNode_36 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_37, (b) -> isDirty_diamondMeshNode_37 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_38, (b) -> isDirty_diamondMeshNode_38 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_39, (b) -> isDirty_diamondMeshNode_39 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_4, (b) -> isDirty_diamondMeshNode_4 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_40, (b) -> isDirty_diamondMeshNode_40 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_41, (b) -> isDirty_diamondMeshNode_41 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_42, (b) -> isDirty_diamondMeshNode_42 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_43, (b) -> isDirty_diamondMeshNode_43 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_44, (b) -> isDirty_diamondMeshNode_44 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_45, (b) -> isDirty_diamondMeshNode_45 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_46, (b) -> isDirty_diamondMeshNode_46 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_47, (b) -> isDirty_diamondMeshNode_47 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_48, (b) -> isDirty_diamondMeshNode_48 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_49, (b) -> isDirty_diamondMeshNode_49 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_5, (b) -> isDirty_diamondMeshNode_5 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_50, (b) -> isDirty_diamondMeshNode_50 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_51, (b) -> isDirty_diamondMeshNode_51 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_52, (b) -> isDirty_diamondMeshNode_52 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_53, (b) -> isDirty_diamondMeshNode_53 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_54, (b) -> isDirty_diamondMeshNode_54 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_55, (b) -> isDirty_diamondMeshNode_55 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_56, (b) -> isDirty_diamondMeshNode_56 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_57, (b) -> isDirty_diamondMeshNode_57 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_58, (b) -> isDirty_diamondMeshNode_58 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_59, (b) -> isDirty_diamondMeshNode_59 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_6, (b) -> isDirty_diamondMeshNode_6 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_60, (b) -> isDirty_diamondMeshNode_60 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_61, (b) -> isDirty_diamondMeshNode_61 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_62, (b) -> isDirty_diamondMeshNode_62 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_63, (b) -> isDirty_diamondMeshNode_63 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_64, (b) -> isDirty_diamondMeshNode_64 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_65, (b) -> isDirty_diamondMeshNode_65 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_66, (b) -> isDirty_diamondMeshNode_66 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_67, (b) -> isDirty_diamondMeshNode_67 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_68, (b) -> isDirty_diamondMeshNode_68 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_69, (b) -> isDirty_diamondMeshNode_69 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_7, (b) -> isDirty_diamondMeshNode_7 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_70, (b) -> isDirty_diamondMeshNode_70 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_71, (b) -> isDirty_diamondMeshNode_71 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_72, (b) -> isDirty_diamondMeshNode_72 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_73, (b) -> isDirty_diamondMeshNode_73 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_74, (b) -> isDirty_diamondMeshNode_74 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_75, (b) -> isDirty_diamondMeshNode_75 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_76, (b) -> isDirty_diamondMeshNode_76 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_77, (b) -> isDirty_diamondMeshNode_77 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_78, (b) -> isDirty_diamondMeshNode_78 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_79, (b) -> isDirty_diamondMeshNode_79 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_8, (b) -> isDirty_diamondMeshNode_8 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_80, (b) -> isDirty_diamondMeshNode_80 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_81, (b) -> isDirty_diamondMeshNode_81 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_82, (b) -> isDirty_diamondMeshNode_82 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_83, (b) -> isDirty_diamondMeshNode_83 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_84, (b) -> isDirty_diamondMeshNode_84 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_85, (b) -> isDirty_diamondMeshNode_85 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_86, (b) -> isDirty_diamondMeshNode_86 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_87, (b) -> isDirty_diamondMeshNode_87 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_88, (b) -> isDirty_diamondMeshNode_88 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_89, (b) -> isDirty_diamondMeshNode_89 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_9, (b) -> isDirty_diamondMeshNode_9 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_90, (b) -> isDirty_diamondMeshNode_90 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_91, (b) -> isDirty_diamondMeshNode_91 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_92, (b) -> isDirty_diamondMeshNode_92 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_93, (b) -> isDirty_diamondMeshNode_93 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_94, (b) -> isDirty_diamondMeshNode_94 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_95, (b) -> isDirty_diamondMeshNode_95 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_96, (b) -> isDirty_diamondMeshNode_96 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_97, (b) -> isDirty_diamondMeshNode_97 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_98, (b) -> isDirty_diamondMeshNode_98 = b);
      dirtyFlagUpdateMap.put(diamondMeshNode_99, (b) -> isDirty_diamondMeshNode_99 = b);
      dirtyFlagUpdateMap.put(diamondMeshRootNode_101, (b) -> isDirty_diamondMeshRootNode_101 = b);
    }
    dirtyFlagUpdateMap.get(node).accept(dirtyFlag);
  }

  private boolean guardCheck_diamondMeshNode_1() {
    return isDirty_diamondMeshNode_2 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_2() {
    return isDirty_diamondMeshNode_3 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_3() {
    return isDirty_diamondMeshNode_4 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_4() {
    return isDirty_diamondMeshNode_5 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_5() {
    return isDirty_diamondMeshNode_6 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_6() {
    return isDirty_diamondMeshNode_7 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_7() {
    return isDirty_diamondMeshNode_8 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_8() {
    return isDirty_diamondMeshNode_9 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_9() {
    return isDirty_diamondMeshNode_10 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_10() {
    return isDirty_diamondMeshNode_11 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_11() {
    return isDirty_diamondMeshNode_12 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_12() {
    return isDirty_diamondMeshNode_13 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_13() {
    return isDirty_diamondMeshNode_14 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_14() {
    return isDirty_diamondMeshNode_15 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_15() {
    return isDirty_diamondMeshNode_16 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_16() {
    return isDirty_diamondMeshNode_17 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_17() {
    return isDirty_diamondMeshNode_18 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_18() {
    return isDirty_diamondMeshNode_19 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_19() {
    return isDirty_diamondMeshNode_20 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_20() {
    return isDirty_diamondMeshNode_21 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_21() {
    return isDirty_diamondMeshNode_22 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_22() {
    return isDirty_diamondMeshNode_23 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_23() {
    return isDirty_diamondMeshNode_24 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_24() {
    return isDirty_diamondMeshNode_25 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_25() {
    return isDirty_diamondMeshNode_26 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_26() {
    return isDirty_diamondMeshNode_27 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_27() {
    return isDirty_diamondMeshNode_28 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_28() {
    return isDirty_diamondMeshNode_29 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_29() {
    return isDirty_diamondMeshNode_30 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_30() {
    return isDirty_diamondMeshNode_31 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_31() {
    return isDirty_diamondMeshNode_32 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_32() {
    return isDirty_diamondMeshNode_33 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_33() {
    return isDirty_diamondMeshNode_34 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_34() {
    return isDirty_diamondMeshNode_35 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_35() {
    return isDirty_diamondMeshNode_36 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_36() {
    return isDirty_diamondMeshNode_37 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_37() {
    return isDirty_diamondMeshNode_38 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_38() {
    return isDirty_diamondMeshNode_39 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_39() {
    return isDirty_diamondMeshNode_40 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_40() {
    return isDirty_diamondMeshNode_41 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_41() {
    return isDirty_diamondMeshNode_42 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_42() {
    return isDirty_diamondMeshNode_43 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_43() {
    return isDirty_diamondMeshNode_44 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_44() {
    return isDirty_diamondMeshNode_45 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_45() {
    return isDirty_diamondMeshNode_46 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_46() {
    return isDirty_diamondMeshNode_47 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_47() {
    return isDirty_diamondMeshNode_48 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_48() {
    return isDirty_diamondMeshNode_49 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_49() {
    return isDirty_diamondMeshNode_50 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_50() {
    return isDirty_diamondMeshNode_51 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_51() {
    return isDirty_diamondMeshNode_52 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_52() {
    return isDirty_diamondMeshNode_53 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_53() {
    return isDirty_diamondMeshNode_54 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_54() {
    return isDirty_diamondMeshNode_55 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_55() {
    return isDirty_diamondMeshNode_56 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_56() {
    return isDirty_diamondMeshNode_57 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_57() {
    return isDirty_diamondMeshNode_58 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_58() {
    return isDirty_diamondMeshNode_59 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_59() {
    return isDirty_diamondMeshNode_60 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_60() {
    return isDirty_diamondMeshNode_61 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_61() {
    return isDirty_diamondMeshNode_62 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_62() {
    return isDirty_diamondMeshNode_63 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_63() {
    return isDirty_diamondMeshNode_64 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_64() {
    return isDirty_diamondMeshNode_65 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_65() {
    return isDirty_diamondMeshNode_66 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_66() {
    return isDirty_diamondMeshNode_67 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_67() {
    return isDirty_diamondMeshNode_68 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_68() {
    return isDirty_diamondMeshNode_69 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_69() {
    return isDirty_diamondMeshNode_70 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_70() {
    return isDirty_diamondMeshNode_71 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_71() {
    return isDirty_diamondMeshNode_72 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_72() {
    return isDirty_diamondMeshNode_73 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_73() {
    return isDirty_diamondMeshNode_74 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_74() {
    return isDirty_diamondMeshNode_75 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_75() {
    return isDirty_diamondMeshNode_76 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_76() {
    return isDirty_diamondMeshNode_77 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_77() {
    return isDirty_diamondMeshNode_78 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_78() {
    return isDirty_diamondMeshNode_79 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_79() {
    return isDirty_diamondMeshNode_80 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_80() {
    return isDirty_diamondMeshNode_81 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_81() {
    return isDirty_diamondMeshNode_82 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_82() {
    return isDirty_diamondMeshNode_83 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_83() {
    return isDirty_diamondMeshNode_84 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_84() {
    return isDirty_diamondMeshNode_85 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_85() {
    return isDirty_diamondMeshNode_86 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_86() {
    return isDirty_diamondMeshNode_87 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_87() {
    return isDirty_diamondMeshNode_88 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_88() {
    return isDirty_diamondMeshNode_89 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_89() {
    return isDirty_diamondMeshNode_90 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_90() {
    return isDirty_diamondMeshNode_91 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_91() {
    return isDirty_diamondMeshNode_92 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_92() {
    return isDirty_diamondMeshNode_93 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_93() {
    return isDirty_diamondMeshNode_94 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_94() {
    return isDirty_diamondMeshNode_95 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_95() {
    return isDirty_diamondMeshNode_96 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_96() {
    return isDirty_diamondMeshNode_97 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_97() {
    return isDirty_diamondMeshNode_98 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_98() {
    return isDirty_diamondMeshNode_99 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_99() {
    return isDirty_diamondMeshNode_100 | isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_diamondMeshNode_100() {
    return isDirty_diamondMeshRootNode_101;
  }

  private boolean guardCheck_sink() {
    return isDirty_diamondMeshNode_1;
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
  public DiamondMesh101Processor newInstance() {
    return new DiamondMesh101Processor();
  }

  @Override
  public DiamondMesh101Processor newInstance(Map<Object, Object> contextMap) {
    return new DiamondMesh101Processor();
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
