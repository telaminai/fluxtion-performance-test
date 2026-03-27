/*
 * Copyright: © 2025.  Gregory Higgins <greg.higgins@v12technology.com> - All Rights Reserved
 * This source code is protected under international copyright law.  All rights
 * reserved and protected by the copyright holders.
 * This file is confidential and only available to authorized individuals with the
 * permission of the copyright holders.  If you encounter this file and do not have
 * permission, please contact the copyright holders and delete this file.
 */
package com.telamin.fluxtion.test.performance.generated.polymorphic;

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
import com.telamin.fluxtion.test.performance.nodes.PolymorphicAccumulatorNode;
import com.telamin.fluxtion.test.performance.nodes.PolymorphicBaseNode;
import com.telamin.fluxtion.test.performance.nodes.PolymorphicPublisherNode;
import com.telamin.fluxtion.test.performance.nodes.PolymorphicRootNode;
import com.telamin.fluxtion.test.performance.nodes.PolymorphicTransformNode;
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
public class Polymorphic100Processor
    implements CloneableDataFlow<Polymorphic100Processor>,
        /*--- @ExportService start ---*/
        @ExportService ServiceListener,
        /*--- @ExportService end ---*/
        DataFlow,
        InternalEventProcessor,
        BatchHandler {

  //Node declarations
  private final transient CallbackDispatcherImpl callbackDispatcher = new CallbackDispatcherImpl();
  public final transient Clock clock = new Clock();
  public final transient NodeNameAuditor nodeNameLookup = new NodeNameAuditor();
  private final transient PolymorphicRootNode polymorphicRootNode_101 = new PolymorphicRootNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_100 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_99 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_98 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_97 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_96 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_95 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_94 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_93 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_92 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_91 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_90 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_89 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_88 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_87 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_86 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_85 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_84 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_83 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_82 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_81 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_80 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_79 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_78 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_77 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_76 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_75 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_74 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_73 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_72 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_71 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_70 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_69 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_68 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_67 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_66 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_65 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_64 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_63 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_62 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_61 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_60 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_59 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_58 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_57 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_56 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_55 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_54 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_53 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_52 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_51 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_50 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_49 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_48 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_47 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_46 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_45 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_44 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_43 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_42 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_41 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_40 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_39 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_38 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_37 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_36 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_35 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_34 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_33 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_32 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_31 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_30 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_29 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_28 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_27 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_26 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_25 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_24 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_23 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_22 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_21 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_20 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_19 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_18 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_17 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_16 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_15 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_14 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_13 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_12 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_11 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_10 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_9 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_8 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_7 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_6 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_5 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_4 =
      new PolymorphicAccumulatorNode();
  private final transient PolymorphicTransformNode polymorphicTransformNode_3 =
      new PolymorphicTransformNode();
  private final transient PolymorphicBaseNode polymorphicBaseNode_2 = new PolymorphicBaseNode();
  private final transient PolymorphicAccumulatorNode polymorphicAccumulatorNode_1 =
      new PolymorphicAccumulatorNode();
  public final transient PolymorphicPublisherNode sink = new PolymorphicPublisherNode();
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

  private boolean isDirty_polymorphicAccumulatorNode_1 = false;
  private boolean isDirty_polymorphicAccumulatorNode_4 = false;
  private boolean isDirty_polymorphicAccumulatorNode_7 = false;
  private boolean isDirty_polymorphicAccumulatorNode_10 = false;
  private boolean isDirty_polymorphicAccumulatorNode_13 = false;
  private boolean isDirty_polymorphicAccumulatorNode_16 = false;
  private boolean isDirty_polymorphicAccumulatorNode_19 = false;
  private boolean isDirty_polymorphicAccumulatorNode_22 = false;
  private boolean isDirty_polymorphicAccumulatorNode_25 = false;
  private boolean isDirty_polymorphicAccumulatorNode_28 = false;
  private boolean isDirty_polymorphicAccumulatorNode_31 = false;
  private boolean isDirty_polymorphicAccumulatorNode_34 = false;
  private boolean isDirty_polymorphicAccumulatorNode_37 = false;
  private boolean isDirty_polymorphicAccumulatorNode_40 = false;
  private boolean isDirty_polymorphicAccumulatorNode_43 = false;
  private boolean isDirty_polymorphicAccumulatorNode_46 = false;
  private boolean isDirty_polymorphicAccumulatorNode_49 = false;
  private boolean isDirty_polymorphicAccumulatorNode_52 = false;
  private boolean isDirty_polymorphicAccumulatorNode_55 = false;
  private boolean isDirty_polymorphicAccumulatorNode_58 = false;
  private boolean isDirty_polymorphicAccumulatorNode_61 = false;
  private boolean isDirty_polymorphicAccumulatorNode_64 = false;
  private boolean isDirty_polymorphicAccumulatorNode_67 = false;
  private boolean isDirty_polymorphicAccumulatorNode_70 = false;
  private boolean isDirty_polymorphicAccumulatorNode_73 = false;
  private boolean isDirty_polymorphicAccumulatorNode_76 = false;
  private boolean isDirty_polymorphicAccumulatorNode_79 = false;
  private boolean isDirty_polymorphicAccumulatorNode_82 = false;
  private boolean isDirty_polymorphicAccumulatorNode_85 = false;
  private boolean isDirty_polymorphicAccumulatorNode_88 = false;
  private boolean isDirty_polymorphicAccumulatorNode_91 = false;
  private boolean isDirty_polymorphicAccumulatorNode_94 = false;
  private boolean isDirty_polymorphicAccumulatorNode_97 = false;
  private boolean isDirty_polymorphicAccumulatorNode_100 = false;
  private boolean isDirty_polymorphicBaseNode_2 = false;
  private boolean isDirty_polymorphicBaseNode_5 = false;
  private boolean isDirty_polymorphicBaseNode_8 = false;
  private boolean isDirty_polymorphicBaseNode_11 = false;
  private boolean isDirty_polymorphicBaseNode_14 = false;
  private boolean isDirty_polymorphicBaseNode_17 = false;
  private boolean isDirty_polymorphicBaseNode_20 = false;
  private boolean isDirty_polymorphicBaseNode_23 = false;
  private boolean isDirty_polymorphicBaseNode_26 = false;
  private boolean isDirty_polymorphicBaseNode_29 = false;
  private boolean isDirty_polymorphicBaseNode_32 = false;
  private boolean isDirty_polymorphicBaseNode_35 = false;
  private boolean isDirty_polymorphicBaseNode_38 = false;
  private boolean isDirty_polymorphicBaseNode_41 = false;
  private boolean isDirty_polymorphicBaseNode_44 = false;
  private boolean isDirty_polymorphicBaseNode_47 = false;
  private boolean isDirty_polymorphicBaseNode_50 = false;
  private boolean isDirty_polymorphicBaseNode_53 = false;
  private boolean isDirty_polymorphicBaseNode_56 = false;
  private boolean isDirty_polymorphicBaseNode_59 = false;
  private boolean isDirty_polymorphicBaseNode_62 = false;
  private boolean isDirty_polymorphicBaseNode_65 = false;
  private boolean isDirty_polymorphicBaseNode_68 = false;
  private boolean isDirty_polymorphicBaseNode_71 = false;
  private boolean isDirty_polymorphicBaseNode_74 = false;
  private boolean isDirty_polymorphicBaseNode_77 = false;
  private boolean isDirty_polymorphicBaseNode_80 = false;
  private boolean isDirty_polymorphicBaseNode_83 = false;
  private boolean isDirty_polymorphicBaseNode_86 = false;
  private boolean isDirty_polymorphicBaseNode_89 = false;
  private boolean isDirty_polymorphicBaseNode_92 = false;
  private boolean isDirty_polymorphicBaseNode_95 = false;
  private boolean isDirty_polymorphicBaseNode_98 = false;
  private boolean isDirty_polymorphicRootNode_101 = false;
  private boolean isDirty_polymorphicTransformNode_3 = false;
  private boolean isDirty_polymorphicTransformNode_6 = false;
  private boolean isDirty_polymorphicTransformNode_9 = false;
  private boolean isDirty_polymorphicTransformNode_12 = false;
  private boolean isDirty_polymorphicTransformNode_15 = false;
  private boolean isDirty_polymorphicTransformNode_18 = false;
  private boolean isDirty_polymorphicTransformNode_21 = false;
  private boolean isDirty_polymorphicTransformNode_24 = false;
  private boolean isDirty_polymorphicTransformNode_27 = false;
  private boolean isDirty_polymorphicTransformNode_30 = false;
  private boolean isDirty_polymorphicTransformNode_33 = false;
  private boolean isDirty_polymorphicTransformNode_36 = false;
  private boolean isDirty_polymorphicTransformNode_39 = false;
  private boolean isDirty_polymorphicTransformNode_42 = false;
  private boolean isDirty_polymorphicTransformNode_45 = false;
  private boolean isDirty_polymorphicTransformNode_48 = false;
  private boolean isDirty_polymorphicTransformNode_51 = false;
  private boolean isDirty_polymorphicTransformNode_54 = false;
  private boolean isDirty_polymorphicTransformNode_57 = false;
  private boolean isDirty_polymorphicTransformNode_60 = false;
  private boolean isDirty_polymorphicTransformNode_63 = false;
  private boolean isDirty_polymorphicTransformNode_66 = false;
  private boolean isDirty_polymorphicTransformNode_69 = false;
  private boolean isDirty_polymorphicTransformNode_72 = false;
  private boolean isDirty_polymorphicTransformNode_75 = false;
  private boolean isDirty_polymorphicTransformNode_78 = false;
  private boolean isDirty_polymorphicTransformNode_81 = false;
  private boolean isDirty_polymorphicTransformNode_84 = false;
  private boolean isDirty_polymorphicTransformNode_87 = false;
  private boolean isDirty_polymorphicTransformNode_90 = false;
  private boolean isDirty_polymorphicTransformNode_93 = false;
  private boolean isDirty_polymorphicTransformNode_96 = false;
  private boolean isDirty_polymorphicTransformNode_99 = false;

  //Forked declarations

  //Filter constants

  //unknown event handler
  private Consumer unKnownEventHandler = (e) -> {};

  public Polymorphic100Processor(Map<Object, Object> contextMap) {
    if (context != null) {
      context.replaceMappings(contextMap);
    }
    context.setClock(clock);
    serviceRegistry.setDataFlowContext(context);
    polymorphicAccumulatorNode_1.setUpstream1(polymorphicBaseNode_2);
    polymorphicAccumulatorNode_1.value = 0.0;
    polymorphicAccumulatorNode_1.upstream1 = polymorphicBaseNode_2;
    polymorphicAccumulatorNode_4.setUpstream1(polymorphicBaseNode_5);
    polymorphicAccumulatorNode_4.value = 0.0;
    polymorphicAccumulatorNode_4.upstream1 = polymorphicBaseNode_5;
    polymorphicAccumulatorNode_7.setUpstream1(polymorphicBaseNode_8);
    polymorphicAccumulatorNode_7.value = 0.0;
    polymorphicAccumulatorNode_7.upstream1 = polymorphicBaseNode_8;
    polymorphicAccumulatorNode_10.setUpstream1(polymorphicBaseNode_11);
    polymorphicAccumulatorNode_10.value = 0.0;
    polymorphicAccumulatorNode_10.upstream1 = polymorphicBaseNode_11;
    polymorphicAccumulatorNode_13.setUpstream1(polymorphicBaseNode_14);
    polymorphicAccumulatorNode_13.value = 0.0;
    polymorphicAccumulatorNode_13.upstream1 = polymorphicBaseNode_14;
    polymorphicAccumulatorNode_16.setUpstream1(polymorphicBaseNode_17);
    polymorphicAccumulatorNode_16.value = 0.0;
    polymorphicAccumulatorNode_16.upstream1 = polymorphicBaseNode_17;
    polymorphicAccumulatorNode_19.setUpstream1(polymorphicBaseNode_20);
    polymorphicAccumulatorNode_19.value = 0.0;
    polymorphicAccumulatorNode_19.upstream1 = polymorphicBaseNode_20;
    polymorphicAccumulatorNode_22.setUpstream1(polymorphicBaseNode_23);
    polymorphicAccumulatorNode_22.value = 0.0;
    polymorphicAccumulatorNode_22.upstream1 = polymorphicBaseNode_23;
    polymorphicAccumulatorNode_25.setUpstream1(polymorphicBaseNode_26);
    polymorphicAccumulatorNode_25.value = 0.0;
    polymorphicAccumulatorNode_25.upstream1 = polymorphicBaseNode_26;
    polymorphicAccumulatorNode_28.setUpstream1(polymorphicBaseNode_29);
    polymorphicAccumulatorNode_28.value = 0.0;
    polymorphicAccumulatorNode_28.upstream1 = polymorphicBaseNode_29;
    polymorphicAccumulatorNode_31.setUpstream1(polymorphicBaseNode_32);
    polymorphicAccumulatorNode_31.value = 0.0;
    polymorphicAccumulatorNode_31.upstream1 = polymorphicBaseNode_32;
    polymorphicAccumulatorNode_34.setUpstream1(polymorphicBaseNode_35);
    polymorphicAccumulatorNode_34.value = 0.0;
    polymorphicAccumulatorNode_34.upstream1 = polymorphicBaseNode_35;
    polymorphicAccumulatorNode_37.setUpstream1(polymorphicBaseNode_38);
    polymorphicAccumulatorNode_37.value = 0.0;
    polymorphicAccumulatorNode_37.upstream1 = polymorphicBaseNode_38;
    polymorphicAccumulatorNode_40.setUpstream1(polymorphicBaseNode_41);
    polymorphicAccumulatorNode_40.value = 0.0;
    polymorphicAccumulatorNode_40.upstream1 = polymorphicBaseNode_41;
    polymorphicAccumulatorNode_43.setUpstream1(polymorphicBaseNode_44);
    polymorphicAccumulatorNode_43.value = 0.0;
    polymorphicAccumulatorNode_43.upstream1 = polymorphicBaseNode_44;
    polymorphicAccumulatorNode_46.setUpstream1(polymorphicBaseNode_47);
    polymorphicAccumulatorNode_46.value = 0.0;
    polymorphicAccumulatorNode_46.upstream1 = polymorphicBaseNode_47;
    polymorphicAccumulatorNode_49.setUpstream1(polymorphicBaseNode_50);
    polymorphicAccumulatorNode_49.value = 0.0;
    polymorphicAccumulatorNode_49.upstream1 = polymorphicBaseNode_50;
    polymorphicAccumulatorNode_52.setUpstream1(polymorphicBaseNode_53);
    polymorphicAccumulatorNode_52.value = 0.0;
    polymorphicAccumulatorNode_52.upstream1 = polymorphicBaseNode_53;
    polymorphicAccumulatorNode_55.setUpstream1(polymorphicBaseNode_56);
    polymorphicAccumulatorNode_55.value = 0.0;
    polymorphicAccumulatorNode_55.upstream1 = polymorphicBaseNode_56;
    polymorphicAccumulatorNode_58.setUpstream1(polymorphicBaseNode_59);
    polymorphicAccumulatorNode_58.value = 0.0;
    polymorphicAccumulatorNode_58.upstream1 = polymorphicBaseNode_59;
    polymorphicAccumulatorNode_61.setUpstream1(polymorphicBaseNode_62);
    polymorphicAccumulatorNode_61.value = 0.0;
    polymorphicAccumulatorNode_61.upstream1 = polymorphicBaseNode_62;
    polymorphicAccumulatorNode_64.setUpstream1(polymorphicBaseNode_65);
    polymorphicAccumulatorNode_64.value = 0.0;
    polymorphicAccumulatorNode_64.upstream1 = polymorphicBaseNode_65;
    polymorphicAccumulatorNode_67.setUpstream1(polymorphicBaseNode_68);
    polymorphicAccumulatorNode_67.value = 0.0;
    polymorphicAccumulatorNode_67.upstream1 = polymorphicBaseNode_68;
    polymorphicAccumulatorNode_70.setUpstream1(polymorphicBaseNode_71);
    polymorphicAccumulatorNode_70.value = 0.0;
    polymorphicAccumulatorNode_70.upstream1 = polymorphicBaseNode_71;
    polymorphicAccumulatorNode_73.setUpstream1(polymorphicBaseNode_74);
    polymorphicAccumulatorNode_73.value = 0.0;
    polymorphicAccumulatorNode_73.upstream1 = polymorphicBaseNode_74;
    polymorphicAccumulatorNode_76.setUpstream1(polymorphicBaseNode_77);
    polymorphicAccumulatorNode_76.value = 0.0;
    polymorphicAccumulatorNode_76.upstream1 = polymorphicBaseNode_77;
    polymorphicAccumulatorNode_79.setUpstream1(polymorphicBaseNode_80);
    polymorphicAccumulatorNode_79.value = 0.0;
    polymorphicAccumulatorNode_79.upstream1 = polymorphicBaseNode_80;
    polymorphicAccumulatorNode_82.setUpstream1(polymorphicBaseNode_83);
    polymorphicAccumulatorNode_82.value = 0.0;
    polymorphicAccumulatorNode_82.upstream1 = polymorphicBaseNode_83;
    polymorphicAccumulatorNode_85.setUpstream1(polymorphicBaseNode_86);
    polymorphicAccumulatorNode_85.value = 0.0;
    polymorphicAccumulatorNode_85.upstream1 = polymorphicBaseNode_86;
    polymorphicAccumulatorNode_88.setUpstream1(polymorphicBaseNode_89);
    polymorphicAccumulatorNode_88.value = 0.0;
    polymorphicAccumulatorNode_88.upstream1 = polymorphicBaseNode_89;
    polymorphicAccumulatorNode_91.setUpstream1(polymorphicBaseNode_92);
    polymorphicAccumulatorNode_91.value = 0.0;
    polymorphicAccumulatorNode_91.upstream1 = polymorphicBaseNode_92;
    polymorphicAccumulatorNode_94.setUpstream1(polymorphicBaseNode_95);
    polymorphicAccumulatorNode_94.value = 0.0;
    polymorphicAccumulatorNode_94.upstream1 = polymorphicBaseNode_95;
    polymorphicAccumulatorNode_97.setUpstream1(polymorphicBaseNode_98);
    polymorphicAccumulatorNode_97.value = 0.0;
    polymorphicAccumulatorNode_97.upstream1 = polymorphicBaseNode_98;
    polymorphicAccumulatorNode_100.setUpstream1(polymorphicRootNode_101);
    polymorphicAccumulatorNode_100.value = 0.0;
    polymorphicAccumulatorNode_100.upstream1 = polymorphicRootNode_101;
    polymorphicBaseNode_2.setUpstream1(polymorphicTransformNode_3);
    polymorphicBaseNode_2.value = 0.0;
    polymorphicBaseNode_2.upstream1 = polymorphicTransformNode_3;
    polymorphicBaseNode_5.setUpstream1(polymorphicTransformNode_6);
    polymorphicBaseNode_5.value = 0.0;
    polymorphicBaseNode_5.upstream1 = polymorphicTransformNode_6;
    polymorphicBaseNode_8.setUpstream1(polymorphicTransformNode_9);
    polymorphicBaseNode_8.value = 0.0;
    polymorphicBaseNode_8.upstream1 = polymorphicTransformNode_9;
    polymorphicBaseNode_11.setUpstream1(polymorphicTransformNode_12);
    polymorphicBaseNode_11.value = 0.0;
    polymorphicBaseNode_11.upstream1 = polymorphicTransformNode_12;
    polymorphicBaseNode_14.setUpstream1(polymorphicTransformNode_15);
    polymorphicBaseNode_14.value = 0.0;
    polymorphicBaseNode_14.upstream1 = polymorphicTransformNode_15;
    polymorphicBaseNode_17.setUpstream1(polymorphicTransformNode_18);
    polymorphicBaseNode_17.value = 0.0;
    polymorphicBaseNode_17.upstream1 = polymorphicTransformNode_18;
    polymorphicBaseNode_20.setUpstream1(polymorphicTransformNode_21);
    polymorphicBaseNode_20.value = 0.0;
    polymorphicBaseNode_20.upstream1 = polymorphicTransformNode_21;
    polymorphicBaseNode_23.setUpstream1(polymorphicTransformNode_24);
    polymorphicBaseNode_23.value = 0.0;
    polymorphicBaseNode_23.upstream1 = polymorphicTransformNode_24;
    polymorphicBaseNode_26.setUpstream1(polymorphicTransformNode_27);
    polymorphicBaseNode_26.value = 0.0;
    polymorphicBaseNode_26.upstream1 = polymorphicTransformNode_27;
    polymorphicBaseNode_29.setUpstream1(polymorphicTransformNode_30);
    polymorphicBaseNode_29.value = 0.0;
    polymorphicBaseNode_29.upstream1 = polymorphicTransformNode_30;
    polymorphicBaseNode_32.setUpstream1(polymorphicTransformNode_33);
    polymorphicBaseNode_32.value = 0.0;
    polymorphicBaseNode_32.upstream1 = polymorphicTransformNode_33;
    polymorphicBaseNode_35.setUpstream1(polymorphicTransformNode_36);
    polymorphicBaseNode_35.value = 0.0;
    polymorphicBaseNode_35.upstream1 = polymorphicTransformNode_36;
    polymorphicBaseNode_38.setUpstream1(polymorphicTransformNode_39);
    polymorphicBaseNode_38.value = 0.0;
    polymorphicBaseNode_38.upstream1 = polymorphicTransformNode_39;
    polymorphicBaseNode_41.setUpstream1(polymorphicTransformNode_42);
    polymorphicBaseNode_41.value = 0.0;
    polymorphicBaseNode_41.upstream1 = polymorphicTransformNode_42;
    polymorphicBaseNode_44.setUpstream1(polymorphicTransformNode_45);
    polymorphicBaseNode_44.value = 0.0;
    polymorphicBaseNode_44.upstream1 = polymorphicTransformNode_45;
    polymorphicBaseNode_47.setUpstream1(polymorphicTransformNode_48);
    polymorphicBaseNode_47.value = 0.0;
    polymorphicBaseNode_47.upstream1 = polymorphicTransformNode_48;
    polymorphicBaseNode_50.setUpstream1(polymorphicTransformNode_51);
    polymorphicBaseNode_50.value = 0.0;
    polymorphicBaseNode_50.upstream1 = polymorphicTransformNode_51;
    polymorphicBaseNode_53.setUpstream1(polymorphicTransformNode_54);
    polymorphicBaseNode_53.value = 0.0;
    polymorphicBaseNode_53.upstream1 = polymorphicTransformNode_54;
    polymorphicBaseNode_56.setUpstream1(polymorphicTransformNode_57);
    polymorphicBaseNode_56.value = 0.0;
    polymorphicBaseNode_56.upstream1 = polymorphicTransformNode_57;
    polymorphicBaseNode_59.setUpstream1(polymorphicTransformNode_60);
    polymorphicBaseNode_59.value = 0.0;
    polymorphicBaseNode_59.upstream1 = polymorphicTransformNode_60;
    polymorphicBaseNode_62.setUpstream1(polymorphicTransformNode_63);
    polymorphicBaseNode_62.value = 0.0;
    polymorphicBaseNode_62.upstream1 = polymorphicTransformNode_63;
    polymorphicBaseNode_65.setUpstream1(polymorphicTransformNode_66);
    polymorphicBaseNode_65.value = 0.0;
    polymorphicBaseNode_65.upstream1 = polymorphicTransformNode_66;
    polymorphicBaseNode_68.setUpstream1(polymorphicTransformNode_69);
    polymorphicBaseNode_68.value = 0.0;
    polymorphicBaseNode_68.upstream1 = polymorphicTransformNode_69;
    polymorphicBaseNode_71.setUpstream1(polymorphicTransformNode_72);
    polymorphicBaseNode_71.value = 0.0;
    polymorphicBaseNode_71.upstream1 = polymorphicTransformNode_72;
    polymorphicBaseNode_74.setUpstream1(polymorphicTransformNode_75);
    polymorphicBaseNode_74.value = 0.0;
    polymorphicBaseNode_74.upstream1 = polymorphicTransformNode_75;
    polymorphicBaseNode_77.setUpstream1(polymorphicTransformNode_78);
    polymorphicBaseNode_77.value = 0.0;
    polymorphicBaseNode_77.upstream1 = polymorphicTransformNode_78;
    polymorphicBaseNode_80.setUpstream1(polymorphicTransformNode_81);
    polymorphicBaseNode_80.value = 0.0;
    polymorphicBaseNode_80.upstream1 = polymorphicTransformNode_81;
    polymorphicBaseNode_83.setUpstream1(polymorphicTransformNode_84);
    polymorphicBaseNode_83.value = 0.0;
    polymorphicBaseNode_83.upstream1 = polymorphicTransformNode_84;
    polymorphicBaseNode_86.setUpstream1(polymorphicTransformNode_87);
    polymorphicBaseNode_86.value = 0.0;
    polymorphicBaseNode_86.upstream1 = polymorphicTransformNode_87;
    polymorphicBaseNode_89.setUpstream1(polymorphicTransformNode_90);
    polymorphicBaseNode_89.value = 0.0;
    polymorphicBaseNode_89.upstream1 = polymorphicTransformNode_90;
    polymorphicBaseNode_92.setUpstream1(polymorphicTransformNode_93);
    polymorphicBaseNode_92.value = 0.0;
    polymorphicBaseNode_92.upstream1 = polymorphicTransformNode_93;
    polymorphicBaseNode_95.setUpstream1(polymorphicTransformNode_96);
    polymorphicBaseNode_95.value = 0.0;
    polymorphicBaseNode_95.upstream1 = polymorphicTransformNode_96;
    polymorphicBaseNode_98.setUpstream1(polymorphicTransformNode_99);
    polymorphicBaseNode_98.value = 0.0;
    polymorphicBaseNode_98.upstream1 = polymorphicTransformNode_99;
    sink.setUpstream1(polymorphicAccumulatorNode_1);
    sink.upstream1 = polymorphicAccumulatorNode_1;
    sink.value = 0.0;
    polymorphicRootNode_101.value = 0.0;
    polymorphicTransformNode_3.setFactor(1.0);
    polymorphicTransformNode_3.setUpstream1(polymorphicAccumulatorNode_4);
    polymorphicTransformNode_3.value = 0.0;
    polymorphicTransformNode_3.upstream1 = polymorphicAccumulatorNode_4;
    polymorphicTransformNode_6.setFactor(1.0);
    polymorphicTransformNode_6.setUpstream1(polymorphicAccumulatorNode_7);
    polymorphicTransformNode_6.value = 0.0;
    polymorphicTransformNode_6.upstream1 = polymorphicAccumulatorNode_7;
    polymorphicTransformNode_9.setFactor(1.0);
    polymorphicTransformNode_9.setUpstream1(polymorphicAccumulatorNode_10);
    polymorphicTransformNode_9.value = 0.0;
    polymorphicTransformNode_9.upstream1 = polymorphicAccumulatorNode_10;
    polymorphicTransformNode_12.setFactor(1.0);
    polymorphicTransformNode_12.setUpstream1(polymorphicAccumulatorNode_13);
    polymorphicTransformNode_12.value = 0.0;
    polymorphicTransformNode_12.upstream1 = polymorphicAccumulatorNode_13;
    polymorphicTransformNode_15.setFactor(1.0);
    polymorphicTransformNode_15.setUpstream1(polymorphicAccumulatorNode_16);
    polymorphicTransformNode_15.value = 0.0;
    polymorphicTransformNode_15.upstream1 = polymorphicAccumulatorNode_16;
    polymorphicTransformNode_18.setFactor(1.0);
    polymorphicTransformNode_18.setUpstream1(polymorphicAccumulatorNode_19);
    polymorphicTransformNode_18.value = 0.0;
    polymorphicTransformNode_18.upstream1 = polymorphicAccumulatorNode_19;
    polymorphicTransformNode_21.setFactor(1.0);
    polymorphicTransformNode_21.setUpstream1(polymorphicAccumulatorNode_22);
    polymorphicTransformNode_21.value = 0.0;
    polymorphicTransformNode_21.upstream1 = polymorphicAccumulatorNode_22;
    polymorphicTransformNode_24.setFactor(1.0);
    polymorphicTransformNode_24.setUpstream1(polymorphicAccumulatorNode_25);
    polymorphicTransformNode_24.value = 0.0;
    polymorphicTransformNode_24.upstream1 = polymorphicAccumulatorNode_25;
    polymorphicTransformNode_27.setFactor(1.0);
    polymorphicTransformNode_27.setUpstream1(polymorphicAccumulatorNode_28);
    polymorphicTransformNode_27.value = 0.0;
    polymorphicTransformNode_27.upstream1 = polymorphicAccumulatorNode_28;
    polymorphicTransformNode_30.setFactor(1.0);
    polymorphicTransformNode_30.setUpstream1(polymorphicAccumulatorNode_31);
    polymorphicTransformNode_30.value = 0.0;
    polymorphicTransformNode_30.upstream1 = polymorphicAccumulatorNode_31;
    polymorphicTransformNode_33.setFactor(1.0);
    polymorphicTransformNode_33.setUpstream1(polymorphicAccumulatorNode_34);
    polymorphicTransformNode_33.value = 0.0;
    polymorphicTransformNode_33.upstream1 = polymorphicAccumulatorNode_34;
    polymorphicTransformNode_36.setFactor(1.0);
    polymorphicTransformNode_36.setUpstream1(polymorphicAccumulatorNode_37);
    polymorphicTransformNode_36.value = 0.0;
    polymorphicTransformNode_36.upstream1 = polymorphicAccumulatorNode_37;
    polymorphicTransformNode_39.setFactor(1.0);
    polymorphicTransformNode_39.setUpstream1(polymorphicAccumulatorNode_40);
    polymorphicTransformNode_39.value = 0.0;
    polymorphicTransformNode_39.upstream1 = polymorphicAccumulatorNode_40;
    polymorphicTransformNode_42.setFactor(1.0);
    polymorphicTransformNode_42.setUpstream1(polymorphicAccumulatorNode_43);
    polymorphicTransformNode_42.value = 0.0;
    polymorphicTransformNode_42.upstream1 = polymorphicAccumulatorNode_43;
    polymorphicTransformNode_45.setFactor(1.0);
    polymorphicTransformNode_45.setUpstream1(polymorphicAccumulatorNode_46);
    polymorphicTransformNode_45.value = 0.0;
    polymorphicTransformNode_45.upstream1 = polymorphicAccumulatorNode_46;
    polymorphicTransformNode_48.setFactor(1.0);
    polymorphicTransformNode_48.setUpstream1(polymorphicAccumulatorNode_49);
    polymorphicTransformNode_48.value = 0.0;
    polymorphicTransformNode_48.upstream1 = polymorphicAccumulatorNode_49;
    polymorphicTransformNode_51.setFactor(1.0);
    polymorphicTransformNode_51.setUpstream1(polymorphicAccumulatorNode_52);
    polymorphicTransformNode_51.value = 0.0;
    polymorphicTransformNode_51.upstream1 = polymorphicAccumulatorNode_52;
    polymorphicTransformNode_54.setFactor(1.0);
    polymorphicTransformNode_54.setUpstream1(polymorphicAccumulatorNode_55);
    polymorphicTransformNode_54.value = 0.0;
    polymorphicTransformNode_54.upstream1 = polymorphicAccumulatorNode_55;
    polymorphicTransformNode_57.setFactor(1.0);
    polymorphicTransformNode_57.setUpstream1(polymorphicAccumulatorNode_58);
    polymorphicTransformNode_57.value = 0.0;
    polymorphicTransformNode_57.upstream1 = polymorphicAccumulatorNode_58;
    polymorphicTransformNode_60.setFactor(1.0);
    polymorphicTransformNode_60.setUpstream1(polymorphicAccumulatorNode_61);
    polymorphicTransformNode_60.value = 0.0;
    polymorphicTransformNode_60.upstream1 = polymorphicAccumulatorNode_61;
    polymorphicTransformNode_63.setFactor(1.0);
    polymorphicTransformNode_63.setUpstream1(polymorphicAccumulatorNode_64);
    polymorphicTransformNode_63.value = 0.0;
    polymorphicTransformNode_63.upstream1 = polymorphicAccumulatorNode_64;
    polymorphicTransformNode_66.setFactor(1.0);
    polymorphicTransformNode_66.setUpstream1(polymorphicAccumulatorNode_67);
    polymorphicTransformNode_66.value = 0.0;
    polymorphicTransformNode_66.upstream1 = polymorphicAccumulatorNode_67;
    polymorphicTransformNode_69.setFactor(1.0);
    polymorphicTransformNode_69.setUpstream1(polymorphicAccumulatorNode_70);
    polymorphicTransformNode_69.value = 0.0;
    polymorphicTransformNode_69.upstream1 = polymorphicAccumulatorNode_70;
    polymorphicTransformNode_72.setFactor(1.0);
    polymorphicTransformNode_72.setUpstream1(polymorphicAccumulatorNode_73);
    polymorphicTransformNode_72.value = 0.0;
    polymorphicTransformNode_72.upstream1 = polymorphicAccumulatorNode_73;
    polymorphicTransformNode_75.setFactor(1.0);
    polymorphicTransformNode_75.setUpstream1(polymorphicAccumulatorNode_76);
    polymorphicTransformNode_75.value = 0.0;
    polymorphicTransformNode_75.upstream1 = polymorphicAccumulatorNode_76;
    polymorphicTransformNode_78.setFactor(1.0);
    polymorphicTransformNode_78.setUpstream1(polymorphicAccumulatorNode_79);
    polymorphicTransformNode_78.value = 0.0;
    polymorphicTransformNode_78.upstream1 = polymorphicAccumulatorNode_79;
    polymorphicTransformNode_81.setFactor(1.0);
    polymorphicTransformNode_81.setUpstream1(polymorphicAccumulatorNode_82);
    polymorphicTransformNode_81.value = 0.0;
    polymorphicTransformNode_81.upstream1 = polymorphicAccumulatorNode_82;
    polymorphicTransformNode_84.setFactor(1.0);
    polymorphicTransformNode_84.setUpstream1(polymorphicAccumulatorNode_85);
    polymorphicTransformNode_84.value = 0.0;
    polymorphicTransformNode_84.upstream1 = polymorphicAccumulatorNode_85;
    polymorphicTransformNode_87.setFactor(1.0);
    polymorphicTransformNode_87.setUpstream1(polymorphicAccumulatorNode_88);
    polymorphicTransformNode_87.value = 0.0;
    polymorphicTransformNode_87.upstream1 = polymorphicAccumulatorNode_88;
    polymorphicTransformNode_90.setFactor(1.0);
    polymorphicTransformNode_90.setUpstream1(polymorphicAccumulatorNode_91);
    polymorphicTransformNode_90.value = 0.0;
    polymorphicTransformNode_90.upstream1 = polymorphicAccumulatorNode_91;
    polymorphicTransformNode_93.setFactor(1.0);
    polymorphicTransformNode_93.setUpstream1(polymorphicAccumulatorNode_94);
    polymorphicTransformNode_93.value = 0.0;
    polymorphicTransformNode_93.upstream1 = polymorphicAccumulatorNode_94;
    polymorphicTransformNode_96.setFactor(1.0);
    polymorphicTransformNode_96.setUpstream1(polymorphicAccumulatorNode_97);
    polymorphicTransformNode_96.value = 0.0;
    polymorphicTransformNode_96.upstream1 = polymorphicAccumulatorNode_97;
    polymorphicTransformNode_99.setFactor(1.0);
    polymorphicTransformNode_99.setUpstream1(polymorphicAccumulatorNode_100);
    polymorphicTransformNode_99.value = 0.0;
    polymorphicTransformNode_99.upstream1 = polymorphicAccumulatorNode_100;
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

  public Polymorphic100Processor() {
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
    isDirty_polymorphicRootNode_101 = polymorphicRootNode_101.onMarketData(typedEvent);
    commonDispatchTail_1(typedEvent);
    afterEvent();
  }

  public void handleEvent(TradeSignalEvent typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    isDirty_polymorphicRootNode_101 = polymorphicRootNode_101.onTradeSignal(typedEvent);
    commonDispatchTail_1(typedEvent);
    afterEvent();
  }
  //EVENT DISPATCH - END

  //MERGED DISPATCH HELPERS - START

  private void commonDispatchTail_1(Object typedEvent) {
    if (guardCheck_polymorphicAccumulatorNode_100()) {
      isDirty_polymorphicAccumulatorNode_100 = polymorphicAccumulatorNode_100.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_99()) {
      isDirty_polymorphicTransformNode_99 = polymorphicTransformNode_99.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_98()) {
      isDirty_polymorphicBaseNode_98 = polymorphicBaseNode_98.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_97()) {
      isDirty_polymorphicAccumulatorNode_97 = polymorphicAccumulatorNode_97.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_96()) {
      isDirty_polymorphicTransformNode_96 = polymorphicTransformNode_96.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_95()) {
      isDirty_polymorphicBaseNode_95 = polymorphicBaseNode_95.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_94()) {
      isDirty_polymorphicAccumulatorNode_94 = polymorphicAccumulatorNode_94.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_93()) {
      isDirty_polymorphicTransformNode_93 = polymorphicTransformNode_93.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_92()) {
      isDirty_polymorphicBaseNode_92 = polymorphicBaseNode_92.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_91()) {
      isDirty_polymorphicAccumulatorNode_91 = polymorphicAccumulatorNode_91.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_90()) {
      isDirty_polymorphicTransformNode_90 = polymorphicTransformNode_90.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_89()) {
      isDirty_polymorphicBaseNode_89 = polymorphicBaseNode_89.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_88()) {
      isDirty_polymorphicAccumulatorNode_88 = polymorphicAccumulatorNode_88.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_87()) {
      isDirty_polymorphicTransformNode_87 = polymorphicTransformNode_87.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_86()) {
      isDirty_polymorphicBaseNode_86 = polymorphicBaseNode_86.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_85()) {
      isDirty_polymorphicAccumulatorNode_85 = polymorphicAccumulatorNode_85.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_84()) {
      isDirty_polymorphicTransformNode_84 = polymorphicTransformNode_84.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_83()) {
      isDirty_polymorphicBaseNode_83 = polymorphicBaseNode_83.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_82()) {
      isDirty_polymorphicAccumulatorNode_82 = polymorphicAccumulatorNode_82.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_81()) {
      isDirty_polymorphicTransformNode_81 = polymorphicTransformNode_81.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_80()) {
      isDirty_polymorphicBaseNode_80 = polymorphicBaseNode_80.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_79()) {
      isDirty_polymorphicAccumulatorNode_79 = polymorphicAccumulatorNode_79.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_78()) {
      isDirty_polymorphicTransformNode_78 = polymorphicTransformNode_78.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_77()) {
      isDirty_polymorphicBaseNode_77 = polymorphicBaseNode_77.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_76()) {
      isDirty_polymorphicAccumulatorNode_76 = polymorphicAccumulatorNode_76.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_75()) {
      isDirty_polymorphicTransformNode_75 = polymorphicTransformNode_75.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_74()) {
      isDirty_polymorphicBaseNode_74 = polymorphicBaseNode_74.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_73()) {
      isDirty_polymorphicAccumulatorNode_73 = polymorphicAccumulatorNode_73.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_72()) {
      isDirty_polymorphicTransformNode_72 = polymorphicTransformNode_72.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_71()) {
      isDirty_polymorphicBaseNode_71 = polymorphicBaseNode_71.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_70()) {
      isDirty_polymorphicAccumulatorNode_70 = polymorphicAccumulatorNode_70.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_69()) {
      isDirty_polymorphicTransformNode_69 = polymorphicTransformNode_69.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_68()) {
      isDirty_polymorphicBaseNode_68 = polymorphicBaseNode_68.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_67()) {
      isDirty_polymorphicAccumulatorNode_67 = polymorphicAccumulatorNode_67.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_66()) {
      isDirty_polymorphicTransformNode_66 = polymorphicTransformNode_66.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_65()) {
      isDirty_polymorphicBaseNode_65 = polymorphicBaseNode_65.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_64()) {
      isDirty_polymorphicAccumulatorNode_64 = polymorphicAccumulatorNode_64.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_63()) {
      isDirty_polymorphicTransformNode_63 = polymorphicTransformNode_63.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_62()) {
      isDirty_polymorphicBaseNode_62 = polymorphicBaseNode_62.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_61()) {
      isDirty_polymorphicAccumulatorNode_61 = polymorphicAccumulatorNode_61.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_60()) {
      isDirty_polymorphicTransformNode_60 = polymorphicTransformNode_60.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_59()) {
      isDirty_polymorphicBaseNode_59 = polymorphicBaseNode_59.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_58()) {
      isDirty_polymorphicAccumulatorNode_58 = polymorphicAccumulatorNode_58.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_57()) {
      isDirty_polymorphicTransformNode_57 = polymorphicTransformNode_57.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_56()) {
      isDirty_polymorphicBaseNode_56 = polymorphicBaseNode_56.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_55()) {
      isDirty_polymorphicAccumulatorNode_55 = polymorphicAccumulatorNode_55.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_54()) {
      isDirty_polymorphicTransformNode_54 = polymorphicTransformNode_54.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_53()) {
      isDirty_polymorphicBaseNode_53 = polymorphicBaseNode_53.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_52()) {
      isDirty_polymorphicAccumulatorNode_52 = polymorphicAccumulatorNode_52.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_51()) {
      isDirty_polymorphicTransformNode_51 = polymorphicTransformNode_51.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_50()) {
      isDirty_polymorphicBaseNode_50 = polymorphicBaseNode_50.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_49()) {
      isDirty_polymorphicAccumulatorNode_49 = polymorphicAccumulatorNode_49.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_48()) {
      isDirty_polymorphicTransformNode_48 = polymorphicTransformNode_48.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_47()) {
      isDirty_polymorphicBaseNode_47 = polymorphicBaseNode_47.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_46()) {
      isDirty_polymorphicAccumulatorNode_46 = polymorphicAccumulatorNode_46.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_45()) {
      isDirty_polymorphicTransformNode_45 = polymorphicTransformNode_45.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_44()) {
      isDirty_polymorphicBaseNode_44 = polymorphicBaseNode_44.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_43()) {
      isDirty_polymorphicAccumulatorNode_43 = polymorphicAccumulatorNode_43.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_42()) {
      isDirty_polymorphicTransformNode_42 = polymorphicTransformNode_42.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_41()) {
      isDirty_polymorphicBaseNode_41 = polymorphicBaseNode_41.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_40()) {
      isDirty_polymorphicAccumulatorNode_40 = polymorphicAccumulatorNode_40.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_39()) {
      isDirty_polymorphicTransformNode_39 = polymorphicTransformNode_39.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_38()) {
      isDirty_polymorphicBaseNode_38 = polymorphicBaseNode_38.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_37()) {
      isDirty_polymorphicAccumulatorNode_37 = polymorphicAccumulatorNode_37.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_36()) {
      isDirty_polymorphicTransformNode_36 = polymorphicTransformNode_36.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_35()) {
      isDirty_polymorphicBaseNode_35 = polymorphicBaseNode_35.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_34()) {
      isDirty_polymorphicAccumulatorNode_34 = polymorphicAccumulatorNode_34.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_33()) {
      isDirty_polymorphicTransformNode_33 = polymorphicTransformNode_33.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_32()) {
      isDirty_polymorphicBaseNode_32 = polymorphicBaseNode_32.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_31()) {
      isDirty_polymorphicAccumulatorNode_31 = polymorphicAccumulatorNode_31.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_30()) {
      isDirty_polymorphicTransformNode_30 = polymorphicTransformNode_30.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_29()) {
      isDirty_polymorphicBaseNode_29 = polymorphicBaseNode_29.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_28()) {
      isDirty_polymorphicAccumulatorNode_28 = polymorphicAccumulatorNode_28.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_27()) {
      isDirty_polymorphicTransformNode_27 = polymorphicTransformNode_27.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_26()) {
      isDirty_polymorphicBaseNode_26 = polymorphicBaseNode_26.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_25()) {
      isDirty_polymorphicAccumulatorNode_25 = polymorphicAccumulatorNode_25.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_24()) {
      isDirty_polymorphicTransformNode_24 = polymorphicTransformNode_24.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_23()) {
      isDirty_polymorphicBaseNode_23 = polymorphicBaseNode_23.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_22()) {
      isDirty_polymorphicAccumulatorNode_22 = polymorphicAccumulatorNode_22.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_21()) {
      isDirty_polymorphicTransformNode_21 = polymorphicTransformNode_21.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_20()) {
      isDirty_polymorphicBaseNode_20 = polymorphicBaseNode_20.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_19()) {
      isDirty_polymorphicAccumulatorNode_19 = polymorphicAccumulatorNode_19.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_18()) {
      isDirty_polymorphicTransformNode_18 = polymorphicTransformNode_18.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_17()) {
      isDirty_polymorphicBaseNode_17 = polymorphicBaseNode_17.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_16()) {
      isDirty_polymorphicAccumulatorNode_16 = polymorphicAccumulatorNode_16.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_15()) {
      isDirty_polymorphicTransformNode_15 = polymorphicTransformNode_15.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_14()) {
      isDirty_polymorphicBaseNode_14 = polymorphicBaseNode_14.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_13()) {
      isDirty_polymorphicAccumulatorNode_13 = polymorphicAccumulatorNode_13.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_12()) {
      isDirty_polymorphicTransformNode_12 = polymorphicTransformNode_12.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_11()) {
      isDirty_polymorphicBaseNode_11 = polymorphicBaseNode_11.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_10()) {
      isDirty_polymorphicAccumulatorNode_10 = polymorphicAccumulatorNode_10.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_9()) {
      isDirty_polymorphicTransformNode_9 = polymorphicTransformNode_9.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_8()) {
      isDirty_polymorphicBaseNode_8 = polymorphicBaseNode_8.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_7()) {
      isDirty_polymorphicAccumulatorNode_7 = polymorphicAccumulatorNode_7.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_6()) {
      isDirty_polymorphicTransformNode_6 = polymorphicTransformNode_6.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_5()) {
      isDirty_polymorphicBaseNode_5 = polymorphicBaseNode_5.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_4()) {
      isDirty_polymorphicAccumulatorNode_4 = polymorphicAccumulatorNode_4.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_3()) {
      isDirty_polymorphicTransformNode_3 = polymorphicTransformNode_3.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_2()) {
      isDirty_polymorphicBaseNode_2 = polymorphicBaseNode_2.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_1()) {
      isDirty_polymorphicAccumulatorNode_1 = polymorphicAccumulatorNode_1.onUpstream();
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
      isDirty_polymorphicRootNode_101 = polymorphicRootNode_101.onMarketData(typedEvent);
    } else if (event instanceof TradeSignalEvent) {
      TradeSignalEvent typedEvent = (TradeSignalEvent) event;
      auditEvent(typedEvent);
      isDirty_polymorphicRootNode_101 = polymorphicRootNode_101.onTradeSignal(typedEvent);
    }
  }

  public void triggerCalculation() {
    buffering = false;
    String typedEvent = "No event information - buffered dispatch";
    if (guardCheck_polymorphicAccumulatorNode_100()) {
      isDirty_polymorphicAccumulatorNode_100 = polymorphicAccumulatorNode_100.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_99()) {
      isDirty_polymorphicTransformNode_99 = polymorphicTransformNode_99.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_98()) {
      isDirty_polymorphicBaseNode_98 = polymorphicBaseNode_98.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_97()) {
      isDirty_polymorphicAccumulatorNode_97 = polymorphicAccumulatorNode_97.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_96()) {
      isDirty_polymorphicTransformNode_96 = polymorphicTransformNode_96.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_95()) {
      isDirty_polymorphicBaseNode_95 = polymorphicBaseNode_95.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_94()) {
      isDirty_polymorphicAccumulatorNode_94 = polymorphicAccumulatorNode_94.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_93()) {
      isDirty_polymorphicTransformNode_93 = polymorphicTransformNode_93.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_92()) {
      isDirty_polymorphicBaseNode_92 = polymorphicBaseNode_92.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_91()) {
      isDirty_polymorphicAccumulatorNode_91 = polymorphicAccumulatorNode_91.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_90()) {
      isDirty_polymorphicTransformNode_90 = polymorphicTransformNode_90.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_89()) {
      isDirty_polymorphicBaseNode_89 = polymorphicBaseNode_89.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_88()) {
      isDirty_polymorphicAccumulatorNode_88 = polymorphicAccumulatorNode_88.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_87()) {
      isDirty_polymorphicTransformNode_87 = polymorphicTransformNode_87.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_86()) {
      isDirty_polymorphicBaseNode_86 = polymorphicBaseNode_86.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_85()) {
      isDirty_polymorphicAccumulatorNode_85 = polymorphicAccumulatorNode_85.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_84()) {
      isDirty_polymorphicTransformNode_84 = polymorphicTransformNode_84.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_83()) {
      isDirty_polymorphicBaseNode_83 = polymorphicBaseNode_83.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_82()) {
      isDirty_polymorphicAccumulatorNode_82 = polymorphicAccumulatorNode_82.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_81()) {
      isDirty_polymorphicTransformNode_81 = polymorphicTransformNode_81.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_80()) {
      isDirty_polymorphicBaseNode_80 = polymorphicBaseNode_80.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_79()) {
      isDirty_polymorphicAccumulatorNode_79 = polymorphicAccumulatorNode_79.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_78()) {
      isDirty_polymorphicTransformNode_78 = polymorphicTransformNode_78.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_77()) {
      isDirty_polymorphicBaseNode_77 = polymorphicBaseNode_77.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_76()) {
      isDirty_polymorphicAccumulatorNode_76 = polymorphicAccumulatorNode_76.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_75()) {
      isDirty_polymorphicTransformNode_75 = polymorphicTransformNode_75.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_74()) {
      isDirty_polymorphicBaseNode_74 = polymorphicBaseNode_74.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_73()) {
      isDirty_polymorphicAccumulatorNode_73 = polymorphicAccumulatorNode_73.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_72()) {
      isDirty_polymorphicTransformNode_72 = polymorphicTransformNode_72.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_71()) {
      isDirty_polymorphicBaseNode_71 = polymorphicBaseNode_71.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_70()) {
      isDirty_polymorphicAccumulatorNode_70 = polymorphicAccumulatorNode_70.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_69()) {
      isDirty_polymorphicTransformNode_69 = polymorphicTransformNode_69.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_68()) {
      isDirty_polymorphicBaseNode_68 = polymorphicBaseNode_68.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_67()) {
      isDirty_polymorphicAccumulatorNode_67 = polymorphicAccumulatorNode_67.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_66()) {
      isDirty_polymorphicTransformNode_66 = polymorphicTransformNode_66.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_65()) {
      isDirty_polymorphicBaseNode_65 = polymorphicBaseNode_65.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_64()) {
      isDirty_polymorphicAccumulatorNode_64 = polymorphicAccumulatorNode_64.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_63()) {
      isDirty_polymorphicTransformNode_63 = polymorphicTransformNode_63.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_62()) {
      isDirty_polymorphicBaseNode_62 = polymorphicBaseNode_62.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_61()) {
      isDirty_polymorphicAccumulatorNode_61 = polymorphicAccumulatorNode_61.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_60()) {
      isDirty_polymorphicTransformNode_60 = polymorphicTransformNode_60.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_59()) {
      isDirty_polymorphicBaseNode_59 = polymorphicBaseNode_59.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_58()) {
      isDirty_polymorphicAccumulatorNode_58 = polymorphicAccumulatorNode_58.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_57()) {
      isDirty_polymorphicTransformNode_57 = polymorphicTransformNode_57.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_56()) {
      isDirty_polymorphicBaseNode_56 = polymorphicBaseNode_56.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_55()) {
      isDirty_polymorphicAccumulatorNode_55 = polymorphicAccumulatorNode_55.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_54()) {
      isDirty_polymorphicTransformNode_54 = polymorphicTransformNode_54.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_53()) {
      isDirty_polymorphicBaseNode_53 = polymorphicBaseNode_53.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_52()) {
      isDirty_polymorphicAccumulatorNode_52 = polymorphicAccumulatorNode_52.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_51()) {
      isDirty_polymorphicTransformNode_51 = polymorphicTransformNode_51.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_50()) {
      isDirty_polymorphicBaseNode_50 = polymorphicBaseNode_50.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_49()) {
      isDirty_polymorphicAccumulatorNode_49 = polymorphicAccumulatorNode_49.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_48()) {
      isDirty_polymorphicTransformNode_48 = polymorphicTransformNode_48.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_47()) {
      isDirty_polymorphicBaseNode_47 = polymorphicBaseNode_47.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_46()) {
      isDirty_polymorphicAccumulatorNode_46 = polymorphicAccumulatorNode_46.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_45()) {
      isDirty_polymorphicTransformNode_45 = polymorphicTransformNode_45.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_44()) {
      isDirty_polymorphicBaseNode_44 = polymorphicBaseNode_44.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_43()) {
      isDirty_polymorphicAccumulatorNode_43 = polymorphicAccumulatorNode_43.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_42()) {
      isDirty_polymorphicTransformNode_42 = polymorphicTransformNode_42.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_41()) {
      isDirty_polymorphicBaseNode_41 = polymorphicBaseNode_41.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_40()) {
      isDirty_polymorphicAccumulatorNode_40 = polymorphicAccumulatorNode_40.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_39()) {
      isDirty_polymorphicTransformNode_39 = polymorphicTransformNode_39.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_38()) {
      isDirty_polymorphicBaseNode_38 = polymorphicBaseNode_38.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_37()) {
      isDirty_polymorphicAccumulatorNode_37 = polymorphicAccumulatorNode_37.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_36()) {
      isDirty_polymorphicTransformNode_36 = polymorphicTransformNode_36.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_35()) {
      isDirty_polymorphicBaseNode_35 = polymorphicBaseNode_35.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_34()) {
      isDirty_polymorphicAccumulatorNode_34 = polymorphicAccumulatorNode_34.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_33()) {
      isDirty_polymorphicTransformNode_33 = polymorphicTransformNode_33.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_32()) {
      isDirty_polymorphicBaseNode_32 = polymorphicBaseNode_32.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_31()) {
      isDirty_polymorphicAccumulatorNode_31 = polymorphicAccumulatorNode_31.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_30()) {
      isDirty_polymorphicTransformNode_30 = polymorphicTransformNode_30.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_29()) {
      isDirty_polymorphicBaseNode_29 = polymorphicBaseNode_29.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_28()) {
      isDirty_polymorphicAccumulatorNode_28 = polymorphicAccumulatorNode_28.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_27()) {
      isDirty_polymorphicTransformNode_27 = polymorphicTransformNode_27.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_26()) {
      isDirty_polymorphicBaseNode_26 = polymorphicBaseNode_26.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_25()) {
      isDirty_polymorphicAccumulatorNode_25 = polymorphicAccumulatorNode_25.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_24()) {
      isDirty_polymorphicTransformNode_24 = polymorphicTransformNode_24.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_23()) {
      isDirty_polymorphicBaseNode_23 = polymorphicBaseNode_23.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_22()) {
      isDirty_polymorphicAccumulatorNode_22 = polymorphicAccumulatorNode_22.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_21()) {
      isDirty_polymorphicTransformNode_21 = polymorphicTransformNode_21.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_20()) {
      isDirty_polymorphicBaseNode_20 = polymorphicBaseNode_20.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_19()) {
      isDirty_polymorphicAccumulatorNode_19 = polymorphicAccumulatorNode_19.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_18()) {
      isDirty_polymorphicTransformNode_18 = polymorphicTransformNode_18.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_17()) {
      isDirty_polymorphicBaseNode_17 = polymorphicBaseNode_17.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_16()) {
      isDirty_polymorphicAccumulatorNode_16 = polymorphicAccumulatorNode_16.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_15()) {
      isDirty_polymorphicTransformNode_15 = polymorphicTransformNode_15.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_14()) {
      isDirty_polymorphicBaseNode_14 = polymorphicBaseNode_14.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_13()) {
      isDirty_polymorphicAccumulatorNode_13 = polymorphicAccumulatorNode_13.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_12()) {
      isDirty_polymorphicTransformNode_12 = polymorphicTransformNode_12.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_11()) {
      isDirty_polymorphicBaseNode_11 = polymorphicBaseNode_11.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_10()) {
      isDirty_polymorphicAccumulatorNode_10 = polymorphicAccumulatorNode_10.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_9()) {
      isDirty_polymorphicTransformNode_9 = polymorphicTransformNode_9.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_8()) {
      isDirty_polymorphicBaseNode_8 = polymorphicBaseNode_8.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_7()) {
      isDirty_polymorphicAccumulatorNode_7 = polymorphicAccumulatorNode_7.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_6()) {
      isDirty_polymorphicTransformNode_6 = polymorphicTransformNode_6.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_5()) {
      isDirty_polymorphicBaseNode_5 = polymorphicBaseNode_5.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_4()) {
      isDirty_polymorphicAccumulatorNode_4 = polymorphicAccumulatorNode_4.onUpstream();
    }
    if (guardCheck_polymorphicTransformNode_3()) {
      isDirty_polymorphicTransformNode_3 = polymorphicTransformNode_3.onUpstream();
    }
    if (guardCheck_polymorphicBaseNode_2()) {
      isDirty_polymorphicBaseNode_2 = polymorphicBaseNode_2.onUpstream();
    }
    if (guardCheck_polymorphicAccumulatorNode_1()) {
      isDirty_polymorphicAccumulatorNode_1 = polymorphicAccumulatorNode_1.onUpstream();
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
    auditor.nodeRegistered(polymorphicAccumulatorNode_1, "polymorphicAccumulatorNode_1");
    auditor.nodeRegistered(polymorphicAccumulatorNode_4, "polymorphicAccumulatorNode_4");
    auditor.nodeRegistered(polymorphicAccumulatorNode_7, "polymorphicAccumulatorNode_7");
    auditor.nodeRegistered(polymorphicAccumulatorNode_10, "polymorphicAccumulatorNode_10");
    auditor.nodeRegistered(polymorphicAccumulatorNode_13, "polymorphicAccumulatorNode_13");
    auditor.nodeRegistered(polymorphicAccumulatorNode_16, "polymorphicAccumulatorNode_16");
    auditor.nodeRegistered(polymorphicAccumulatorNode_19, "polymorphicAccumulatorNode_19");
    auditor.nodeRegistered(polymorphicAccumulatorNode_22, "polymorphicAccumulatorNode_22");
    auditor.nodeRegistered(polymorphicAccumulatorNode_25, "polymorphicAccumulatorNode_25");
    auditor.nodeRegistered(polymorphicAccumulatorNode_28, "polymorphicAccumulatorNode_28");
    auditor.nodeRegistered(polymorphicAccumulatorNode_31, "polymorphicAccumulatorNode_31");
    auditor.nodeRegistered(polymorphicAccumulatorNode_34, "polymorphicAccumulatorNode_34");
    auditor.nodeRegistered(polymorphicAccumulatorNode_37, "polymorphicAccumulatorNode_37");
    auditor.nodeRegistered(polymorphicAccumulatorNode_40, "polymorphicAccumulatorNode_40");
    auditor.nodeRegistered(polymorphicAccumulatorNode_43, "polymorphicAccumulatorNode_43");
    auditor.nodeRegistered(polymorphicAccumulatorNode_46, "polymorphicAccumulatorNode_46");
    auditor.nodeRegistered(polymorphicAccumulatorNode_49, "polymorphicAccumulatorNode_49");
    auditor.nodeRegistered(polymorphicAccumulatorNode_52, "polymorphicAccumulatorNode_52");
    auditor.nodeRegistered(polymorphicAccumulatorNode_55, "polymorphicAccumulatorNode_55");
    auditor.nodeRegistered(polymorphicAccumulatorNode_58, "polymorphicAccumulatorNode_58");
    auditor.nodeRegistered(polymorphicAccumulatorNode_61, "polymorphicAccumulatorNode_61");
    auditor.nodeRegistered(polymorphicAccumulatorNode_64, "polymorphicAccumulatorNode_64");
    auditor.nodeRegistered(polymorphicAccumulatorNode_67, "polymorphicAccumulatorNode_67");
    auditor.nodeRegistered(polymorphicAccumulatorNode_70, "polymorphicAccumulatorNode_70");
    auditor.nodeRegistered(polymorphicAccumulatorNode_73, "polymorphicAccumulatorNode_73");
    auditor.nodeRegistered(polymorphicAccumulatorNode_76, "polymorphicAccumulatorNode_76");
    auditor.nodeRegistered(polymorphicAccumulatorNode_79, "polymorphicAccumulatorNode_79");
    auditor.nodeRegistered(polymorphicAccumulatorNode_82, "polymorphicAccumulatorNode_82");
    auditor.nodeRegistered(polymorphicAccumulatorNode_85, "polymorphicAccumulatorNode_85");
    auditor.nodeRegistered(polymorphicAccumulatorNode_88, "polymorphicAccumulatorNode_88");
    auditor.nodeRegistered(polymorphicAccumulatorNode_91, "polymorphicAccumulatorNode_91");
    auditor.nodeRegistered(polymorphicAccumulatorNode_94, "polymorphicAccumulatorNode_94");
    auditor.nodeRegistered(polymorphicAccumulatorNode_97, "polymorphicAccumulatorNode_97");
    auditor.nodeRegistered(polymorphicAccumulatorNode_100, "polymorphicAccumulatorNode_100");
    auditor.nodeRegistered(polymorphicBaseNode_2, "polymorphicBaseNode_2");
    auditor.nodeRegistered(polymorphicBaseNode_5, "polymorphicBaseNode_5");
    auditor.nodeRegistered(polymorphicBaseNode_8, "polymorphicBaseNode_8");
    auditor.nodeRegistered(polymorphicBaseNode_11, "polymorphicBaseNode_11");
    auditor.nodeRegistered(polymorphicBaseNode_14, "polymorphicBaseNode_14");
    auditor.nodeRegistered(polymorphicBaseNode_17, "polymorphicBaseNode_17");
    auditor.nodeRegistered(polymorphicBaseNode_20, "polymorphicBaseNode_20");
    auditor.nodeRegistered(polymorphicBaseNode_23, "polymorphicBaseNode_23");
    auditor.nodeRegistered(polymorphicBaseNode_26, "polymorphicBaseNode_26");
    auditor.nodeRegistered(polymorphicBaseNode_29, "polymorphicBaseNode_29");
    auditor.nodeRegistered(polymorphicBaseNode_32, "polymorphicBaseNode_32");
    auditor.nodeRegistered(polymorphicBaseNode_35, "polymorphicBaseNode_35");
    auditor.nodeRegistered(polymorphicBaseNode_38, "polymorphicBaseNode_38");
    auditor.nodeRegistered(polymorphicBaseNode_41, "polymorphicBaseNode_41");
    auditor.nodeRegistered(polymorphicBaseNode_44, "polymorphicBaseNode_44");
    auditor.nodeRegistered(polymorphicBaseNode_47, "polymorphicBaseNode_47");
    auditor.nodeRegistered(polymorphicBaseNode_50, "polymorphicBaseNode_50");
    auditor.nodeRegistered(polymorphicBaseNode_53, "polymorphicBaseNode_53");
    auditor.nodeRegistered(polymorphicBaseNode_56, "polymorphicBaseNode_56");
    auditor.nodeRegistered(polymorphicBaseNode_59, "polymorphicBaseNode_59");
    auditor.nodeRegistered(polymorphicBaseNode_62, "polymorphicBaseNode_62");
    auditor.nodeRegistered(polymorphicBaseNode_65, "polymorphicBaseNode_65");
    auditor.nodeRegistered(polymorphicBaseNode_68, "polymorphicBaseNode_68");
    auditor.nodeRegistered(polymorphicBaseNode_71, "polymorphicBaseNode_71");
    auditor.nodeRegistered(polymorphicBaseNode_74, "polymorphicBaseNode_74");
    auditor.nodeRegistered(polymorphicBaseNode_77, "polymorphicBaseNode_77");
    auditor.nodeRegistered(polymorphicBaseNode_80, "polymorphicBaseNode_80");
    auditor.nodeRegistered(polymorphicBaseNode_83, "polymorphicBaseNode_83");
    auditor.nodeRegistered(polymorphicBaseNode_86, "polymorphicBaseNode_86");
    auditor.nodeRegistered(polymorphicBaseNode_89, "polymorphicBaseNode_89");
    auditor.nodeRegistered(polymorphicBaseNode_92, "polymorphicBaseNode_92");
    auditor.nodeRegistered(polymorphicBaseNode_95, "polymorphicBaseNode_95");
    auditor.nodeRegistered(polymorphicBaseNode_98, "polymorphicBaseNode_98");
    auditor.nodeRegistered(sink, "sink");
    auditor.nodeRegistered(polymorphicRootNode_101, "polymorphicRootNode_101");
    auditor.nodeRegistered(polymorphicTransformNode_3, "polymorphicTransformNode_3");
    auditor.nodeRegistered(polymorphicTransformNode_6, "polymorphicTransformNode_6");
    auditor.nodeRegistered(polymorphicTransformNode_9, "polymorphicTransformNode_9");
    auditor.nodeRegistered(polymorphicTransformNode_12, "polymorphicTransformNode_12");
    auditor.nodeRegistered(polymorphicTransformNode_15, "polymorphicTransformNode_15");
    auditor.nodeRegistered(polymorphicTransformNode_18, "polymorphicTransformNode_18");
    auditor.nodeRegistered(polymorphicTransformNode_21, "polymorphicTransformNode_21");
    auditor.nodeRegistered(polymorphicTransformNode_24, "polymorphicTransformNode_24");
    auditor.nodeRegistered(polymorphicTransformNode_27, "polymorphicTransformNode_27");
    auditor.nodeRegistered(polymorphicTransformNode_30, "polymorphicTransformNode_30");
    auditor.nodeRegistered(polymorphicTransformNode_33, "polymorphicTransformNode_33");
    auditor.nodeRegistered(polymorphicTransformNode_36, "polymorphicTransformNode_36");
    auditor.nodeRegistered(polymorphicTransformNode_39, "polymorphicTransformNode_39");
    auditor.nodeRegistered(polymorphicTransformNode_42, "polymorphicTransformNode_42");
    auditor.nodeRegistered(polymorphicTransformNode_45, "polymorphicTransformNode_45");
    auditor.nodeRegistered(polymorphicTransformNode_48, "polymorphicTransformNode_48");
    auditor.nodeRegistered(polymorphicTransformNode_51, "polymorphicTransformNode_51");
    auditor.nodeRegistered(polymorphicTransformNode_54, "polymorphicTransformNode_54");
    auditor.nodeRegistered(polymorphicTransformNode_57, "polymorphicTransformNode_57");
    auditor.nodeRegistered(polymorphicTransformNode_60, "polymorphicTransformNode_60");
    auditor.nodeRegistered(polymorphicTransformNode_63, "polymorphicTransformNode_63");
    auditor.nodeRegistered(polymorphicTransformNode_66, "polymorphicTransformNode_66");
    auditor.nodeRegistered(polymorphicTransformNode_69, "polymorphicTransformNode_69");
    auditor.nodeRegistered(polymorphicTransformNode_72, "polymorphicTransformNode_72");
    auditor.nodeRegistered(polymorphicTransformNode_75, "polymorphicTransformNode_75");
    auditor.nodeRegistered(polymorphicTransformNode_78, "polymorphicTransformNode_78");
    auditor.nodeRegistered(polymorphicTransformNode_81, "polymorphicTransformNode_81");
    auditor.nodeRegistered(polymorphicTransformNode_84, "polymorphicTransformNode_84");
    auditor.nodeRegistered(polymorphicTransformNode_87, "polymorphicTransformNode_87");
    auditor.nodeRegistered(polymorphicTransformNode_90, "polymorphicTransformNode_90");
    auditor.nodeRegistered(polymorphicTransformNode_93, "polymorphicTransformNode_93");
    auditor.nodeRegistered(polymorphicTransformNode_96, "polymorphicTransformNode_96");
    auditor.nodeRegistered(polymorphicTransformNode_99, "polymorphicTransformNode_99");
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
    isDirty_polymorphicAccumulatorNode_1 = false;
    isDirty_polymorphicAccumulatorNode_4 = false;
    isDirty_polymorphicAccumulatorNode_7 = false;
    isDirty_polymorphicAccumulatorNode_10 = false;
    isDirty_polymorphicAccumulatorNode_13 = false;
    isDirty_polymorphicAccumulatorNode_16 = false;
    isDirty_polymorphicAccumulatorNode_19 = false;
    isDirty_polymorphicAccumulatorNode_22 = false;
    isDirty_polymorphicAccumulatorNode_25 = false;
    isDirty_polymorphicAccumulatorNode_28 = false;
    isDirty_polymorphicAccumulatorNode_31 = false;
    isDirty_polymorphicAccumulatorNode_34 = false;
    isDirty_polymorphicAccumulatorNode_37 = false;
    isDirty_polymorphicAccumulatorNode_40 = false;
    isDirty_polymorphicAccumulatorNode_43 = false;
    isDirty_polymorphicAccumulatorNode_46 = false;
    isDirty_polymorphicAccumulatorNode_49 = false;
    isDirty_polymorphicAccumulatorNode_52 = false;
    isDirty_polymorphicAccumulatorNode_55 = false;
    isDirty_polymorphicAccumulatorNode_58 = false;
    isDirty_polymorphicAccumulatorNode_61 = false;
    isDirty_polymorphicAccumulatorNode_64 = false;
    isDirty_polymorphicAccumulatorNode_67 = false;
    isDirty_polymorphicAccumulatorNode_70 = false;
    isDirty_polymorphicAccumulatorNode_73 = false;
    isDirty_polymorphicAccumulatorNode_76 = false;
    isDirty_polymorphicAccumulatorNode_79 = false;
    isDirty_polymorphicAccumulatorNode_82 = false;
    isDirty_polymorphicAccumulatorNode_85 = false;
    isDirty_polymorphicAccumulatorNode_88 = false;
    isDirty_polymorphicAccumulatorNode_91 = false;
    isDirty_polymorphicAccumulatorNode_94 = false;
    isDirty_polymorphicAccumulatorNode_97 = false;
    isDirty_polymorphicAccumulatorNode_100 = false;
    isDirty_polymorphicBaseNode_2 = false;
    isDirty_polymorphicBaseNode_5 = false;
    isDirty_polymorphicBaseNode_8 = false;
    isDirty_polymorphicBaseNode_11 = false;
    isDirty_polymorphicBaseNode_14 = false;
    isDirty_polymorphicBaseNode_17 = false;
    isDirty_polymorphicBaseNode_20 = false;
    isDirty_polymorphicBaseNode_23 = false;
    isDirty_polymorphicBaseNode_26 = false;
    isDirty_polymorphicBaseNode_29 = false;
    isDirty_polymorphicBaseNode_32 = false;
    isDirty_polymorphicBaseNode_35 = false;
    isDirty_polymorphicBaseNode_38 = false;
    isDirty_polymorphicBaseNode_41 = false;
    isDirty_polymorphicBaseNode_44 = false;
    isDirty_polymorphicBaseNode_47 = false;
    isDirty_polymorphicBaseNode_50 = false;
    isDirty_polymorphicBaseNode_53 = false;
    isDirty_polymorphicBaseNode_56 = false;
    isDirty_polymorphicBaseNode_59 = false;
    isDirty_polymorphicBaseNode_62 = false;
    isDirty_polymorphicBaseNode_65 = false;
    isDirty_polymorphicBaseNode_68 = false;
    isDirty_polymorphicBaseNode_71 = false;
    isDirty_polymorphicBaseNode_74 = false;
    isDirty_polymorphicBaseNode_77 = false;
    isDirty_polymorphicBaseNode_80 = false;
    isDirty_polymorphicBaseNode_83 = false;
    isDirty_polymorphicBaseNode_86 = false;
    isDirty_polymorphicBaseNode_89 = false;
    isDirty_polymorphicBaseNode_92 = false;
    isDirty_polymorphicBaseNode_95 = false;
    isDirty_polymorphicBaseNode_98 = false;
    isDirty_polymorphicRootNode_101 = false;
    isDirty_polymorphicTransformNode_3 = false;
    isDirty_polymorphicTransformNode_6 = false;
    isDirty_polymorphicTransformNode_9 = false;
    isDirty_polymorphicTransformNode_12 = false;
    isDirty_polymorphicTransformNode_15 = false;
    isDirty_polymorphicTransformNode_18 = false;
    isDirty_polymorphicTransformNode_21 = false;
    isDirty_polymorphicTransformNode_24 = false;
    isDirty_polymorphicTransformNode_27 = false;
    isDirty_polymorphicTransformNode_30 = false;
    isDirty_polymorphicTransformNode_33 = false;
    isDirty_polymorphicTransformNode_36 = false;
    isDirty_polymorphicTransformNode_39 = false;
    isDirty_polymorphicTransformNode_42 = false;
    isDirty_polymorphicTransformNode_45 = false;
    isDirty_polymorphicTransformNode_48 = false;
    isDirty_polymorphicTransformNode_51 = false;
    isDirty_polymorphicTransformNode_54 = false;
    isDirty_polymorphicTransformNode_57 = false;
    isDirty_polymorphicTransformNode_60 = false;
    isDirty_polymorphicTransformNode_63 = false;
    isDirty_polymorphicTransformNode_66 = false;
    isDirty_polymorphicTransformNode_69 = false;
    isDirty_polymorphicTransformNode_72 = false;
    isDirty_polymorphicTransformNode_75 = false;
    isDirty_polymorphicTransformNode_78 = false;
    isDirty_polymorphicTransformNode_81 = false;
    isDirty_polymorphicTransformNode_84 = false;
    isDirty_polymorphicTransformNode_87 = false;
    isDirty_polymorphicTransformNode_90 = false;
    isDirty_polymorphicTransformNode_93 = false;
    isDirty_polymorphicTransformNode_96 = false;
    isDirty_polymorphicTransformNode_99 = false;
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
          polymorphicAccumulatorNode_1, () -> isDirty_polymorphicAccumulatorNode_1);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_10, () -> isDirty_polymorphicAccumulatorNode_10);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_100, () -> isDirty_polymorphicAccumulatorNode_100);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_13, () -> isDirty_polymorphicAccumulatorNode_13);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_16, () -> isDirty_polymorphicAccumulatorNode_16);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_19, () -> isDirty_polymorphicAccumulatorNode_19);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_22, () -> isDirty_polymorphicAccumulatorNode_22);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_25, () -> isDirty_polymorphicAccumulatorNode_25);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_28, () -> isDirty_polymorphicAccumulatorNode_28);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_31, () -> isDirty_polymorphicAccumulatorNode_31);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_34, () -> isDirty_polymorphicAccumulatorNode_34);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_37, () -> isDirty_polymorphicAccumulatorNode_37);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_4, () -> isDirty_polymorphicAccumulatorNode_4);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_40, () -> isDirty_polymorphicAccumulatorNode_40);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_43, () -> isDirty_polymorphicAccumulatorNode_43);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_46, () -> isDirty_polymorphicAccumulatorNode_46);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_49, () -> isDirty_polymorphicAccumulatorNode_49);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_52, () -> isDirty_polymorphicAccumulatorNode_52);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_55, () -> isDirty_polymorphicAccumulatorNode_55);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_58, () -> isDirty_polymorphicAccumulatorNode_58);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_61, () -> isDirty_polymorphicAccumulatorNode_61);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_64, () -> isDirty_polymorphicAccumulatorNode_64);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_67, () -> isDirty_polymorphicAccumulatorNode_67);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_7, () -> isDirty_polymorphicAccumulatorNode_7);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_70, () -> isDirty_polymorphicAccumulatorNode_70);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_73, () -> isDirty_polymorphicAccumulatorNode_73);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_76, () -> isDirty_polymorphicAccumulatorNode_76);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_79, () -> isDirty_polymorphicAccumulatorNode_79);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_82, () -> isDirty_polymorphicAccumulatorNode_82);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_85, () -> isDirty_polymorphicAccumulatorNode_85);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_88, () -> isDirty_polymorphicAccumulatorNode_88);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_91, () -> isDirty_polymorphicAccumulatorNode_91);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_94, () -> isDirty_polymorphicAccumulatorNode_94);
      dirtyFlagSupplierMap.put(
          polymorphicAccumulatorNode_97, () -> isDirty_polymorphicAccumulatorNode_97);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_11, () -> isDirty_polymorphicBaseNode_11);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_14, () -> isDirty_polymorphicBaseNode_14);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_17, () -> isDirty_polymorphicBaseNode_17);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_2, () -> isDirty_polymorphicBaseNode_2);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_20, () -> isDirty_polymorphicBaseNode_20);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_23, () -> isDirty_polymorphicBaseNode_23);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_26, () -> isDirty_polymorphicBaseNode_26);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_29, () -> isDirty_polymorphicBaseNode_29);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_32, () -> isDirty_polymorphicBaseNode_32);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_35, () -> isDirty_polymorphicBaseNode_35);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_38, () -> isDirty_polymorphicBaseNode_38);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_41, () -> isDirty_polymorphicBaseNode_41);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_44, () -> isDirty_polymorphicBaseNode_44);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_47, () -> isDirty_polymorphicBaseNode_47);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_5, () -> isDirty_polymorphicBaseNode_5);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_50, () -> isDirty_polymorphicBaseNode_50);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_53, () -> isDirty_polymorphicBaseNode_53);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_56, () -> isDirty_polymorphicBaseNode_56);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_59, () -> isDirty_polymorphicBaseNode_59);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_62, () -> isDirty_polymorphicBaseNode_62);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_65, () -> isDirty_polymorphicBaseNode_65);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_68, () -> isDirty_polymorphicBaseNode_68);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_71, () -> isDirty_polymorphicBaseNode_71);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_74, () -> isDirty_polymorphicBaseNode_74);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_77, () -> isDirty_polymorphicBaseNode_77);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_8, () -> isDirty_polymorphicBaseNode_8);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_80, () -> isDirty_polymorphicBaseNode_80);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_83, () -> isDirty_polymorphicBaseNode_83);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_86, () -> isDirty_polymorphicBaseNode_86);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_89, () -> isDirty_polymorphicBaseNode_89);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_92, () -> isDirty_polymorphicBaseNode_92);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_95, () -> isDirty_polymorphicBaseNode_95);
      dirtyFlagSupplierMap.put(polymorphicBaseNode_98, () -> isDirty_polymorphicBaseNode_98);
      dirtyFlagSupplierMap.put(polymorphicRootNode_101, () -> isDirty_polymorphicRootNode_101);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_12, () -> isDirty_polymorphicTransformNode_12);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_15, () -> isDirty_polymorphicTransformNode_15);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_18, () -> isDirty_polymorphicTransformNode_18);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_21, () -> isDirty_polymorphicTransformNode_21);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_24, () -> isDirty_polymorphicTransformNode_24);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_27, () -> isDirty_polymorphicTransformNode_27);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_3, () -> isDirty_polymorphicTransformNode_3);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_30, () -> isDirty_polymorphicTransformNode_30);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_33, () -> isDirty_polymorphicTransformNode_33);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_36, () -> isDirty_polymorphicTransformNode_36);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_39, () -> isDirty_polymorphicTransformNode_39);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_42, () -> isDirty_polymorphicTransformNode_42);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_45, () -> isDirty_polymorphicTransformNode_45);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_48, () -> isDirty_polymorphicTransformNode_48);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_51, () -> isDirty_polymorphicTransformNode_51);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_54, () -> isDirty_polymorphicTransformNode_54);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_57, () -> isDirty_polymorphicTransformNode_57);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_6, () -> isDirty_polymorphicTransformNode_6);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_60, () -> isDirty_polymorphicTransformNode_60);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_63, () -> isDirty_polymorphicTransformNode_63);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_66, () -> isDirty_polymorphicTransformNode_66);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_69, () -> isDirty_polymorphicTransformNode_69);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_72, () -> isDirty_polymorphicTransformNode_72);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_75, () -> isDirty_polymorphicTransformNode_75);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_78, () -> isDirty_polymorphicTransformNode_78);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_81, () -> isDirty_polymorphicTransformNode_81);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_84, () -> isDirty_polymorphicTransformNode_84);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_87, () -> isDirty_polymorphicTransformNode_87);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_9, () -> isDirty_polymorphicTransformNode_9);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_90, () -> isDirty_polymorphicTransformNode_90);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_93, () -> isDirty_polymorphicTransformNode_93);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_96, () -> isDirty_polymorphicTransformNode_96);
      dirtyFlagSupplierMap.put(
          polymorphicTransformNode_99, () -> isDirty_polymorphicTransformNode_99);
    }
    return dirtyFlagSupplierMap.getOrDefault(node, DataFlow.ALWAYS_FALSE);
  }

  @Override
  public void setDirty(Object node, boolean dirtyFlag) {
    if (dirtyFlagUpdateMap.isEmpty()) {
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_1, (b) -> isDirty_polymorphicAccumulatorNode_1 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_10, (b) -> isDirty_polymorphicAccumulatorNode_10 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_100, (b) -> isDirty_polymorphicAccumulatorNode_100 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_13, (b) -> isDirty_polymorphicAccumulatorNode_13 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_16, (b) -> isDirty_polymorphicAccumulatorNode_16 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_19, (b) -> isDirty_polymorphicAccumulatorNode_19 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_22, (b) -> isDirty_polymorphicAccumulatorNode_22 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_25, (b) -> isDirty_polymorphicAccumulatorNode_25 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_28, (b) -> isDirty_polymorphicAccumulatorNode_28 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_31, (b) -> isDirty_polymorphicAccumulatorNode_31 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_34, (b) -> isDirty_polymorphicAccumulatorNode_34 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_37, (b) -> isDirty_polymorphicAccumulatorNode_37 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_4, (b) -> isDirty_polymorphicAccumulatorNode_4 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_40, (b) -> isDirty_polymorphicAccumulatorNode_40 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_43, (b) -> isDirty_polymorphicAccumulatorNode_43 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_46, (b) -> isDirty_polymorphicAccumulatorNode_46 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_49, (b) -> isDirty_polymorphicAccumulatorNode_49 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_52, (b) -> isDirty_polymorphicAccumulatorNode_52 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_55, (b) -> isDirty_polymorphicAccumulatorNode_55 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_58, (b) -> isDirty_polymorphicAccumulatorNode_58 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_61, (b) -> isDirty_polymorphicAccumulatorNode_61 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_64, (b) -> isDirty_polymorphicAccumulatorNode_64 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_67, (b) -> isDirty_polymorphicAccumulatorNode_67 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_7, (b) -> isDirty_polymorphicAccumulatorNode_7 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_70, (b) -> isDirty_polymorphicAccumulatorNode_70 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_73, (b) -> isDirty_polymorphicAccumulatorNode_73 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_76, (b) -> isDirty_polymorphicAccumulatorNode_76 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_79, (b) -> isDirty_polymorphicAccumulatorNode_79 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_82, (b) -> isDirty_polymorphicAccumulatorNode_82 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_85, (b) -> isDirty_polymorphicAccumulatorNode_85 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_88, (b) -> isDirty_polymorphicAccumulatorNode_88 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_91, (b) -> isDirty_polymorphicAccumulatorNode_91 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_94, (b) -> isDirty_polymorphicAccumulatorNode_94 = b);
      dirtyFlagUpdateMap.put(
          polymorphicAccumulatorNode_97, (b) -> isDirty_polymorphicAccumulatorNode_97 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_11, (b) -> isDirty_polymorphicBaseNode_11 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_14, (b) -> isDirty_polymorphicBaseNode_14 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_17, (b) -> isDirty_polymorphicBaseNode_17 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_2, (b) -> isDirty_polymorphicBaseNode_2 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_20, (b) -> isDirty_polymorphicBaseNode_20 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_23, (b) -> isDirty_polymorphicBaseNode_23 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_26, (b) -> isDirty_polymorphicBaseNode_26 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_29, (b) -> isDirty_polymorphicBaseNode_29 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_32, (b) -> isDirty_polymorphicBaseNode_32 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_35, (b) -> isDirty_polymorphicBaseNode_35 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_38, (b) -> isDirty_polymorphicBaseNode_38 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_41, (b) -> isDirty_polymorphicBaseNode_41 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_44, (b) -> isDirty_polymorphicBaseNode_44 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_47, (b) -> isDirty_polymorphicBaseNode_47 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_5, (b) -> isDirty_polymorphicBaseNode_5 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_50, (b) -> isDirty_polymorphicBaseNode_50 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_53, (b) -> isDirty_polymorphicBaseNode_53 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_56, (b) -> isDirty_polymorphicBaseNode_56 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_59, (b) -> isDirty_polymorphicBaseNode_59 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_62, (b) -> isDirty_polymorphicBaseNode_62 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_65, (b) -> isDirty_polymorphicBaseNode_65 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_68, (b) -> isDirty_polymorphicBaseNode_68 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_71, (b) -> isDirty_polymorphicBaseNode_71 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_74, (b) -> isDirty_polymorphicBaseNode_74 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_77, (b) -> isDirty_polymorphicBaseNode_77 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_8, (b) -> isDirty_polymorphicBaseNode_8 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_80, (b) -> isDirty_polymorphicBaseNode_80 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_83, (b) -> isDirty_polymorphicBaseNode_83 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_86, (b) -> isDirty_polymorphicBaseNode_86 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_89, (b) -> isDirty_polymorphicBaseNode_89 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_92, (b) -> isDirty_polymorphicBaseNode_92 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_95, (b) -> isDirty_polymorphicBaseNode_95 = b);
      dirtyFlagUpdateMap.put(polymorphicBaseNode_98, (b) -> isDirty_polymorphicBaseNode_98 = b);
      dirtyFlagUpdateMap.put(polymorphicRootNode_101, (b) -> isDirty_polymorphicRootNode_101 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_12, (b) -> isDirty_polymorphicTransformNode_12 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_15, (b) -> isDirty_polymorphicTransformNode_15 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_18, (b) -> isDirty_polymorphicTransformNode_18 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_21, (b) -> isDirty_polymorphicTransformNode_21 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_24, (b) -> isDirty_polymorphicTransformNode_24 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_27, (b) -> isDirty_polymorphicTransformNode_27 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_3, (b) -> isDirty_polymorphicTransformNode_3 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_30, (b) -> isDirty_polymorphicTransformNode_30 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_33, (b) -> isDirty_polymorphicTransformNode_33 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_36, (b) -> isDirty_polymorphicTransformNode_36 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_39, (b) -> isDirty_polymorphicTransformNode_39 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_42, (b) -> isDirty_polymorphicTransformNode_42 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_45, (b) -> isDirty_polymorphicTransformNode_45 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_48, (b) -> isDirty_polymorphicTransformNode_48 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_51, (b) -> isDirty_polymorphicTransformNode_51 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_54, (b) -> isDirty_polymorphicTransformNode_54 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_57, (b) -> isDirty_polymorphicTransformNode_57 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_6, (b) -> isDirty_polymorphicTransformNode_6 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_60, (b) -> isDirty_polymorphicTransformNode_60 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_63, (b) -> isDirty_polymorphicTransformNode_63 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_66, (b) -> isDirty_polymorphicTransformNode_66 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_69, (b) -> isDirty_polymorphicTransformNode_69 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_72, (b) -> isDirty_polymorphicTransformNode_72 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_75, (b) -> isDirty_polymorphicTransformNode_75 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_78, (b) -> isDirty_polymorphicTransformNode_78 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_81, (b) -> isDirty_polymorphicTransformNode_81 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_84, (b) -> isDirty_polymorphicTransformNode_84 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_87, (b) -> isDirty_polymorphicTransformNode_87 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_9, (b) -> isDirty_polymorphicTransformNode_9 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_90, (b) -> isDirty_polymorphicTransformNode_90 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_93, (b) -> isDirty_polymorphicTransformNode_93 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_96, (b) -> isDirty_polymorphicTransformNode_96 = b);
      dirtyFlagUpdateMap.put(
          polymorphicTransformNode_99, (b) -> isDirty_polymorphicTransformNode_99 = b);
    }
    dirtyFlagUpdateMap.get(node).accept(dirtyFlag);
  }

  private boolean guardCheck_polymorphicAccumulatorNode_1() {
    return isDirty_polymorphicBaseNode_2;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_4() {
    return isDirty_polymorphicBaseNode_5;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_7() {
    return isDirty_polymorphicBaseNode_8;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_10() {
    return isDirty_polymorphicBaseNode_11;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_13() {
    return isDirty_polymorphicBaseNode_14;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_16() {
    return isDirty_polymorphicBaseNode_17;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_19() {
    return isDirty_polymorphicBaseNode_20;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_22() {
    return isDirty_polymorphicBaseNode_23;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_25() {
    return isDirty_polymorphicBaseNode_26;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_28() {
    return isDirty_polymorphicBaseNode_29;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_31() {
    return isDirty_polymorphicBaseNode_32;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_34() {
    return isDirty_polymorphicBaseNode_35;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_37() {
    return isDirty_polymorphicBaseNode_38;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_40() {
    return isDirty_polymorphicBaseNode_41;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_43() {
    return isDirty_polymorphicBaseNode_44;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_46() {
    return isDirty_polymorphicBaseNode_47;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_49() {
    return isDirty_polymorphicBaseNode_50;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_52() {
    return isDirty_polymorphicBaseNode_53;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_55() {
    return isDirty_polymorphicBaseNode_56;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_58() {
    return isDirty_polymorphicBaseNode_59;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_61() {
    return isDirty_polymorphicBaseNode_62;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_64() {
    return isDirty_polymorphicBaseNode_65;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_67() {
    return isDirty_polymorphicBaseNode_68;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_70() {
    return isDirty_polymorphicBaseNode_71;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_73() {
    return isDirty_polymorphicBaseNode_74;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_76() {
    return isDirty_polymorphicBaseNode_77;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_79() {
    return isDirty_polymorphicBaseNode_80;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_82() {
    return isDirty_polymorphicBaseNode_83;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_85() {
    return isDirty_polymorphicBaseNode_86;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_88() {
    return isDirty_polymorphicBaseNode_89;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_91() {
    return isDirty_polymorphicBaseNode_92;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_94() {
    return isDirty_polymorphicBaseNode_95;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_97() {
    return isDirty_polymorphicBaseNode_98;
  }

  private boolean guardCheck_polymorphicAccumulatorNode_100() {
    return isDirty_polymorphicRootNode_101;
  }

  private boolean guardCheck_polymorphicBaseNode_2() {
    return isDirty_polymorphicTransformNode_3;
  }

  private boolean guardCheck_polymorphicBaseNode_5() {
    return isDirty_polymorphicTransformNode_6;
  }

  private boolean guardCheck_polymorphicBaseNode_8() {
    return isDirty_polymorphicTransformNode_9;
  }

  private boolean guardCheck_polymorphicBaseNode_11() {
    return isDirty_polymorphicTransformNode_12;
  }

  private boolean guardCheck_polymorphicBaseNode_14() {
    return isDirty_polymorphicTransformNode_15;
  }

  private boolean guardCheck_polymorphicBaseNode_17() {
    return isDirty_polymorphicTransformNode_18;
  }

  private boolean guardCheck_polymorphicBaseNode_20() {
    return isDirty_polymorphicTransformNode_21;
  }

  private boolean guardCheck_polymorphicBaseNode_23() {
    return isDirty_polymorphicTransformNode_24;
  }

  private boolean guardCheck_polymorphicBaseNode_26() {
    return isDirty_polymorphicTransformNode_27;
  }

  private boolean guardCheck_polymorphicBaseNode_29() {
    return isDirty_polymorphicTransformNode_30;
  }

  private boolean guardCheck_polymorphicBaseNode_32() {
    return isDirty_polymorphicTransformNode_33;
  }

  private boolean guardCheck_polymorphicBaseNode_35() {
    return isDirty_polymorphicTransformNode_36;
  }

  private boolean guardCheck_polymorphicBaseNode_38() {
    return isDirty_polymorphicTransformNode_39;
  }

  private boolean guardCheck_polymorphicBaseNode_41() {
    return isDirty_polymorphicTransformNode_42;
  }

  private boolean guardCheck_polymorphicBaseNode_44() {
    return isDirty_polymorphicTransformNode_45;
  }

  private boolean guardCheck_polymorphicBaseNode_47() {
    return isDirty_polymorphicTransformNode_48;
  }

  private boolean guardCheck_polymorphicBaseNode_50() {
    return isDirty_polymorphicTransformNode_51;
  }

  private boolean guardCheck_polymorphicBaseNode_53() {
    return isDirty_polymorphicTransformNode_54;
  }

  private boolean guardCheck_polymorphicBaseNode_56() {
    return isDirty_polymorphicTransformNode_57;
  }

  private boolean guardCheck_polymorphicBaseNode_59() {
    return isDirty_polymorphicTransformNode_60;
  }

  private boolean guardCheck_polymorphicBaseNode_62() {
    return isDirty_polymorphicTransformNode_63;
  }

  private boolean guardCheck_polymorphicBaseNode_65() {
    return isDirty_polymorphicTransformNode_66;
  }

  private boolean guardCheck_polymorphicBaseNode_68() {
    return isDirty_polymorphicTransformNode_69;
  }

  private boolean guardCheck_polymorphicBaseNode_71() {
    return isDirty_polymorphicTransformNode_72;
  }

  private boolean guardCheck_polymorphicBaseNode_74() {
    return isDirty_polymorphicTransformNode_75;
  }

  private boolean guardCheck_polymorphicBaseNode_77() {
    return isDirty_polymorphicTransformNode_78;
  }

  private boolean guardCheck_polymorphicBaseNode_80() {
    return isDirty_polymorphicTransformNode_81;
  }

  private boolean guardCheck_polymorphicBaseNode_83() {
    return isDirty_polymorphicTransformNode_84;
  }

  private boolean guardCheck_polymorphicBaseNode_86() {
    return isDirty_polymorphicTransformNode_87;
  }

  private boolean guardCheck_polymorphicBaseNode_89() {
    return isDirty_polymorphicTransformNode_90;
  }

  private boolean guardCheck_polymorphicBaseNode_92() {
    return isDirty_polymorphicTransformNode_93;
  }

  private boolean guardCheck_polymorphicBaseNode_95() {
    return isDirty_polymorphicTransformNode_96;
  }

  private boolean guardCheck_polymorphicBaseNode_98() {
    return isDirty_polymorphicTransformNode_99;
  }

  private boolean guardCheck_sink() {
    return isDirty_polymorphicAccumulatorNode_1;
  }

  private boolean guardCheck_polymorphicTransformNode_3() {
    return isDirty_polymorphicAccumulatorNode_4;
  }

  private boolean guardCheck_polymorphicTransformNode_6() {
    return isDirty_polymorphicAccumulatorNode_7;
  }

  private boolean guardCheck_polymorphicTransformNode_9() {
    return isDirty_polymorphicAccumulatorNode_10;
  }

  private boolean guardCheck_polymorphicTransformNode_12() {
    return isDirty_polymorphicAccumulatorNode_13;
  }

  private boolean guardCheck_polymorphicTransformNode_15() {
    return isDirty_polymorphicAccumulatorNode_16;
  }

  private boolean guardCheck_polymorphicTransformNode_18() {
    return isDirty_polymorphicAccumulatorNode_19;
  }

  private boolean guardCheck_polymorphicTransformNode_21() {
    return isDirty_polymorphicAccumulatorNode_22;
  }

  private boolean guardCheck_polymorphicTransformNode_24() {
    return isDirty_polymorphicAccumulatorNode_25;
  }

  private boolean guardCheck_polymorphicTransformNode_27() {
    return isDirty_polymorphicAccumulatorNode_28;
  }

  private boolean guardCheck_polymorphicTransformNode_30() {
    return isDirty_polymorphicAccumulatorNode_31;
  }

  private boolean guardCheck_polymorphicTransformNode_33() {
    return isDirty_polymorphicAccumulatorNode_34;
  }

  private boolean guardCheck_polymorphicTransformNode_36() {
    return isDirty_polymorphicAccumulatorNode_37;
  }

  private boolean guardCheck_polymorphicTransformNode_39() {
    return isDirty_polymorphicAccumulatorNode_40;
  }

  private boolean guardCheck_polymorphicTransformNode_42() {
    return isDirty_polymorphicAccumulatorNode_43;
  }

  private boolean guardCheck_polymorphicTransformNode_45() {
    return isDirty_polymorphicAccumulatorNode_46;
  }

  private boolean guardCheck_polymorphicTransformNode_48() {
    return isDirty_polymorphicAccumulatorNode_49;
  }

  private boolean guardCheck_polymorphicTransformNode_51() {
    return isDirty_polymorphicAccumulatorNode_52;
  }

  private boolean guardCheck_polymorphicTransformNode_54() {
    return isDirty_polymorphicAccumulatorNode_55;
  }

  private boolean guardCheck_polymorphicTransformNode_57() {
    return isDirty_polymorphicAccumulatorNode_58;
  }

  private boolean guardCheck_polymorphicTransformNode_60() {
    return isDirty_polymorphicAccumulatorNode_61;
  }

  private boolean guardCheck_polymorphicTransformNode_63() {
    return isDirty_polymorphicAccumulatorNode_64;
  }

  private boolean guardCheck_polymorphicTransformNode_66() {
    return isDirty_polymorphicAccumulatorNode_67;
  }

  private boolean guardCheck_polymorphicTransformNode_69() {
    return isDirty_polymorphicAccumulatorNode_70;
  }

  private boolean guardCheck_polymorphicTransformNode_72() {
    return isDirty_polymorphicAccumulatorNode_73;
  }

  private boolean guardCheck_polymorphicTransformNode_75() {
    return isDirty_polymorphicAccumulatorNode_76;
  }

  private boolean guardCheck_polymorphicTransformNode_78() {
    return isDirty_polymorphicAccumulatorNode_79;
  }

  private boolean guardCheck_polymorphicTransformNode_81() {
    return isDirty_polymorphicAccumulatorNode_82;
  }

  private boolean guardCheck_polymorphicTransformNode_84() {
    return isDirty_polymorphicAccumulatorNode_85;
  }

  private boolean guardCheck_polymorphicTransformNode_87() {
    return isDirty_polymorphicAccumulatorNode_88;
  }

  private boolean guardCheck_polymorphicTransformNode_90() {
    return isDirty_polymorphicAccumulatorNode_91;
  }

  private boolean guardCheck_polymorphicTransformNode_93() {
    return isDirty_polymorphicAccumulatorNode_94;
  }

  private boolean guardCheck_polymorphicTransformNode_96() {
    return isDirty_polymorphicAccumulatorNode_97;
  }

  private boolean guardCheck_polymorphicTransformNode_99() {
    return isDirty_polymorphicAccumulatorNode_100;
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
  public Polymorphic100Processor newInstance() {
    return new Polymorphic100Processor();
  }

  @Override
  public Polymorphic100Processor newInstance(Map<Object, Object> contextMap) {
    return new Polymorphic100Processor();
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
