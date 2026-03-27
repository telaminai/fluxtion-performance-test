/*
 * Copyright: © 2025.  Gregory Higgins <greg.higgins@v12technology.com> - All Rights Reserved
 * This source code is protected under international copyright law.  All rights
 * reserved and protected by the copyright holders.
 * This file is confidential and only available to authorized individuals with the
 * permission of the copyright holders.  If you encounter this file and do not have
 * permission, please contact the copyright holders and delete this file.
 */
package com.telamin.fluxtion.test.performance.generated.multievent;

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
import com.telamin.fluxtion.test.performance.events.ControlEvent;
import com.telamin.fluxtion.test.performance.events.MarketDataEvent;
import com.telamin.fluxtion.test.performance.events.TradeSignalEvent;
import com.telamin.fluxtion.test.performance.nodes.MultiEventPathNode;
import com.telamin.fluxtion.test.performance.nodes.MultiEventPathPublisherNode;
import com.telamin.fluxtion.test.performance.nodes.MultiEventPathRootNode;
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
 *   <li>com.telamin.fluxtion.test.performance.events.ControlEvent
 *   <li>com.telamin.fluxtion.test.performance.events.MarketDataEvent
 *   <li>com.telamin.fluxtion.test.performance.events.TradeSignalEvent
 * </ul>
 *
 * @author Greg Higgins
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public class MultiEventPath100Processor
    implements CloneableDataFlow<MultiEventPath100Processor>,
        /*--- @ExportService start ---*/
        @ExportService ServiceListener,
        /*--- @ExportService end ---*/
        DataFlow,
        InternalEventProcessor,
        BatchHandler {

  //Node declarations
  private final transient CallbackDispatcherImpl callbackDispatcher = new CallbackDispatcherImpl();
  public final transient Clock clock = new Clock();
  private final transient MultiEventPathRootNode multiEventPathRootNode_101 =
      new MultiEventPathRootNode();
  private final transient MultiEventPathNode multiEventPathNode_100 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_99 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_98 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_97 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_96 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_95 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_94 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_93 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_92 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_91 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_90 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_89 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_88 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_87 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_86 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_85 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_84 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_83 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_82 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_81 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_80 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_79 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_78 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_77 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_76 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_75 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_74 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_73 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_72 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_71 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_70 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_69 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_68 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_67 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_66 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_65 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_64 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_63 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_62 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_61 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_60 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_59 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_58 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_57 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_56 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_55 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_54 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_53 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_52 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_51 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_50 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_49 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_48 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_47 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_46 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_45 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_44 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_43 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_42 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_41 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_40 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_39 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_38 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_37 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_36 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_35 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_34 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_33 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_32 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_31 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_30 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_29 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_28 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_27 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_26 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_25 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_24 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_23 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_22 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_21 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_20 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_19 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_18 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_17 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_16 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_15 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_14 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_13 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_12 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_11 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_10 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_9 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_8 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_7 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_6 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_5 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_4 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_3 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_2 = new MultiEventPathNode();
  private final transient MultiEventPathNode multiEventPathNode_1 = new MultiEventPathNode();
  public final transient NodeNameAuditor nodeNameLookup = new NodeNameAuditor();
  public final transient MultiEventPathPublisherNode sink = new MultiEventPathPublisherNode();
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

  private boolean isDirty_multiEventPathNode_1 = false;
  private boolean isDirty_multiEventPathNode_2 = false;
  private boolean isDirty_multiEventPathNode_3 = false;
  private boolean isDirty_multiEventPathNode_4 = false;
  private boolean isDirty_multiEventPathNode_5 = false;
  private boolean isDirty_multiEventPathNode_6 = false;
  private boolean isDirty_multiEventPathNode_7 = false;
  private boolean isDirty_multiEventPathNode_8 = false;
  private boolean isDirty_multiEventPathNode_9 = false;
  private boolean isDirty_multiEventPathNode_10 = false;
  private boolean isDirty_multiEventPathNode_11 = false;
  private boolean isDirty_multiEventPathNode_12 = false;
  private boolean isDirty_multiEventPathNode_13 = false;
  private boolean isDirty_multiEventPathNode_14 = false;
  private boolean isDirty_multiEventPathNode_15 = false;
  private boolean isDirty_multiEventPathNode_16 = false;
  private boolean isDirty_multiEventPathNode_17 = false;
  private boolean isDirty_multiEventPathNode_18 = false;
  private boolean isDirty_multiEventPathNode_19 = false;
  private boolean isDirty_multiEventPathNode_20 = false;
  private boolean isDirty_multiEventPathNode_21 = false;
  private boolean isDirty_multiEventPathNode_22 = false;
  private boolean isDirty_multiEventPathNode_23 = false;
  private boolean isDirty_multiEventPathNode_24 = false;
  private boolean isDirty_multiEventPathNode_25 = false;
  private boolean isDirty_multiEventPathNode_26 = false;
  private boolean isDirty_multiEventPathNode_27 = false;
  private boolean isDirty_multiEventPathNode_28 = false;
  private boolean isDirty_multiEventPathNode_29 = false;
  private boolean isDirty_multiEventPathNode_30 = false;
  private boolean isDirty_multiEventPathNode_31 = false;
  private boolean isDirty_multiEventPathNode_32 = false;
  private boolean isDirty_multiEventPathNode_33 = false;
  private boolean isDirty_multiEventPathNode_34 = false;
  private boolean isDirty_multiEventPathNode_35 = false;
  private boolean isDirty_multiEventPathNode_36 = false;
  private boolean isDirty_multiEventPathNode_37 = false;
  private boolean isDirty_multiEventPathNode_38 = false;
  private boolean isDirty_multiEventPathNode_39 = false;
  private boolean isDirty_multiEventPathNode_40 = false;
  private boolean isDirty_multiEventPathNode_41 = false;
  private boolean isDirty_multiEventPathNode_42 = false;
  private boolean isDirty_multiEventPathNode_43 = false;
  private boolean isDirty_multiEventPathNode_44 = false;
  private boolean isDirty_multiEventPathNode_45 = false;
  private boolean isDirty_multiEventPathNode_46 = false;
  private boolean isDirty_multiEventPathNode_47 = false;
  private boolean isDirty_multiEventPathNode_48 = false;
  private boolean isDirty_multiEventPathNode_49 = false;
  private boolean isDirty_multiEventPathNode_50 = false;
  private boolean isDirty_multiEventPathNode_51 = false;
  private boolean isDirty_multiEventPathNode_52 = false;
  private boolean isDirty_multiEventPathNode_53 = false;
  private boolean isDirty_multiEventPathNode_54 = false;
  private boolean isDirty_multiEventPathNode_55 = false;
  private boolean isDirty_multiEventPathNode_56 = false;
  private boolean isDirty_multiEventPathNode_57 = false;
  private boolean isDirty_multiEventPathNode_58 = false;
  private boolean isDirty_multiEventPathNode_59 = false;
  private boolean isDirty_multiEventPathNode_60 = false;
  private boolean isDirty_multiEventPathNode_61 = false;
  private boolean isDirty_multiEventPathNode_62 = false;
  private boolean isDirty_multiEventPathNode_63 = false;
  private boolean isDirty_multiEventPathNode_64 = false;
  private boolean isDirty_multiEventPathNode_65 = false;
  private boolean isDirty_multiEventPathNode_66 = false;
  private boolean isDirty_multiEventPathNode_67 = false;
  private boolean isDirty_multiEventPathNode_68 = false;
  private boolean isDirty_multiEventPathNode_69 = false;
  private boolean isDirty_multiEventPathNode_70 = false;
  private boolean isDirty_multiEventPathNode_71 = false;
  private boolean isDirty_multiEventPathNode_72 = false;
  private boolean isDirty_multiEventPathNode_73 = false;
  private boolean isDirty_multiEventPathNode_74 = false;
  private boolean isDirty_multiEventPathNode_75 = false;
  private boolean isDirty_multiEventPathNode_76 = false;
  private boolean isDirty_multiEventPathNode_77 = false;
  private boolean isDirty_multiEventPathNode_78 = false;
  private boolean isDirty_multiEventPathNode_79 = false;
  private boolean isDirty_multiEventPathNode_80 = false;
  private boolean isDirty_multiEventPathNode_81 = false;
  private boolean isDirty_multiEventPathNode_82 = false;
  private boolean isDirty_multiEventPathNode_83 = false;
  private boolean isDirty_multiEventPathNode_84 = false;
  private boolean isDirty_multiEventPathNode_85 = false;
  private boolean isDirty_multiEventPathNode_86 = false;
  private boolean isDirty_multiEventPathNode_87 = false;
  private boolean isDirty_multiEventPathNode_88 = false;
  private boolean isDirty_multiEventPathNode_89 = false;
  private boolean isDirty_multiEventPathNode_90 = false;
  private boolean isDirty_multiEventPathNode_91 = false;
  private boolean isDirty_multiEventPathNode_92 = false;
  private boolean isDirty_multiEventPathNode_93 = false;
  private boolean isDirty_multiEventPathNode_94 = false;
  private boolean isDirty_multiEventPathNode_95 = false;
  private boolean isDirty_multiEventPathNode_96 = false;
  private boolean isDirty_multiEventPathNode_97 = false;
  private boolean isDirty_multiEventPathNode_98 = false;
  private boolean isDirty_multiEventPathNode_99 = false;
  private boolean isDirty_multiEventPathNode_100 = false;
  private boolean isDirty_multiEventPathRootNode_101 = false;

  //Forked declarations

  //Filter constants

  //unknown event handler
  private Consumer unKnownEventHandler = (e) -> {};

  public MultiEventPath100Processor(Map<Object, Object> contextMap) {
    if (context != null) {
      context.replaceMappings(contextMap);
    }
    context.setClock(clock);
    serviceRegistry.setDataFlowContext(context);
    multiEventPathNode_1.setUpstream1(multiEventPathNode_2);
    multiEventPathNode_1.value = 0.0;
    multiEventPathNode_1.upstream1 = multiEventPathNode_2;
    multiEventPathNode_2.setUpstream1(multiEventPathNode_3);
    multiEventPathNode_2.value = 0.0;
    multiEventPathNode_2.upstream1 = multiEventPathNode_3;
    multiEventPathNode_3.setUpstream1(multiEventPathNode_4);
    multiEventPathNode_3.value = 0.0;
    multiEventPathNode_3.upstream1 = multiEventPathNode_4;
    multiEventPathNode_4.setUpstream1(multiEventPathNode_5);
    multiEventPathNode_4.value = 0.0;
    multiEventPathNode_4.upstream1 = multiEventPathNode_5;
    multiEventPathNode_5.setUpstream1(multiEventPathNode_6);
    multiEventPathNode_5.value = 0.0;
    multiEventPathNode_5.upstream1 = multiEventPathNode_6;
    multiEventPathNode_6.setUpstream1(multiEventPathNode_7);
    multiEventPathNode_6.value = 0.0;
    multiEventPathNode_6.upstream1 = multiEventPathNode_7;
    multiEventPathNode_7.setUpstream1(multiEventPathNode_8);
    multiEventPathNode_7.value = 0.0;
    multiEventPathNode_7.upstream1 = multiEventPathNode_8;
    multiEventPathNode_8.setUpstream1(multiEventPathNode_9);
    multiEventPathNode_8.value = 0.0;
    multiEventPathNode_8.upstream1 = multiEventPathNode_9;
    multiEventPathNode_9.setUpstream1(multiEventPathNode_10);
    multiEventPathNode_9.value = 0.0;
    multiEventPathNode_9.upstream1 = multiEventPathNode_10;
    multiEventPathNode_10.setUpstream1(multiEventPathNode_11);
    multiEventPathNode_10.value = 0.0;
    multiEventPathNode_10.upstream1 = multiEventPathNode_11;
    multiEventPathNode_11.setUpstream1(multiEventPathNode_12);
    multiEventPathNode_11.value = 0.0;
    multiEventPathNode_11.upstream1 = multiEventPathNode_12;
    multiEventPathNode_12.setUpstream1(multiEventPathNode_13);
    multiEventPathNode_12.value = 0.0;
    multiEventPathNode_12.upstream1 = multiEventPathNode_13;
    multiEventPathNode_13.setUpstream1(multiEventPathNode_14);
    multiEventPathNode_13.value = 0.0;
    multiEventPathNode_13.upstream1 = multiEventPathNode_14;
    multiEventPathNode_14.setUpstream1(multiEventPathNode_15);
    multiEventPathNode_14.value = 0.0;
    multiEventPathNode_14.upstream1 = multiEventPathNode_15;
    multiEventPathNode_15.setUpstream1(multiEventPathNode_16);
    multiEventPathNode_15.value = 0.0;
    multiEventPathNode_15.upstream1 = multiEventPathNode_16;
    multiEventPathNode_16.setUpstream1(multiEventPathNode_17);
    multiEventPathNode_16.value = 0.0;
    multiEventPathNode_16.upstream1 = multiEventPathNode_17;
    multiEventPathNode_17.setUpstream1(multiEventPathNode_18);
    multiEventPathNode_17.value = 0.0;
    multiEventPathNode_17.upstream1 = multiEventPathNode_18;
    multiEventPathNode_18.setUpstream1(multiEventPathNode_19);
    multiEventPathNode_18.value = 0.0;
    multiEventPathNode_18.upstream1 = multiEventPathNode_19;
    multiEventPathNode_19.setUpstream1(multiEventPathNode_20);
    multiEventPathNode_19.value = 0.0;
    multiEventPathNode_19.upstream1 = multiEventPathNode_20;
    multiEventPathNode_20.setUpstream1(multiEventPathNode_21);
    multiEventPathNode_20.value = 0.0;
    multiEventPathNode_20.upstream1 = multiEventPathNode_21;
    multiEventPathNode_21.setUpstream1(multiEventPathNode_22);
    multiEventPathNode_21.value = 0.0;
    multiEventPathNode_21.upstream1 = multiEventPathNode_22;
    multiEventPathNode_22.setUpstream1(multiEventPathNode_23);
    multiEventPathNode_22.value = 0.0;
    multiEventPathNode_22.upstream1 = multiEventPathNode_23;
    multiEventPathNode_23.setUpstream1(multiEventPathNode_24);
    multiEventPathNode_23.value = 0.0;
    multiEventPathNode_23.upstream1 = multiEventPathNode_24;
    multiEventPathNode_24.setUpstream1(multiEventPathNode_25);
    multiEventPathNode_24.value = 0.0;
    multiEventPathNode_24.upstream1 = multiEventPathNode_25;
    multiEventPathNode_25.setUpstream1(multiEventPathNode_26);
    multiEventPathNode_25.value = 0.0;
    multiEventPathNode_25.upstream1 = multiEventPathNode_26;
    multiEventPathNode_26.setUpstream1(multiEventPathNode_27);
    multiEventPathNode_26.value = 0.0;
    multiEventPathNode_26.upstream1 = multiEventPathNode_27;
    multiEventPathNode_27.setUpstream1(multiEventPathNode_28);
    multiEventPathNode_27.value = 0.0;
    multiEventPathNode_27.upstream1 = multiEventPathNode_28;
    multiEventPathNode_28.setUpstream1(multiEventPathNode_29);
    multiEventPathNode_28.value = 0.0;
    multiEventPathNode_28.upstream1 = multiEventPathNode_29;
    multiEventPathNode_29.setUpstream1(multiEventPathNode_30);
    multiEventPathNode_29.value = 0.0;
    multiEventPathNode_29.upstream1 = multiEventPathNode_30;
    multiEventPathNode_30.setUpstream1(multiEventPathNode_31);
    multiEventPathNode_30.value = 0.0;
    multiEventPathNode_30.upstream1 = multiEventPathNode_31;
    multiEventPathNode_31.setUpstream1(multiEventPathNode_32);
    multiEventPathNode_31.value = 0.0;
    multiEventPathNode_31.upstream1 = multiEventPathNode_32;
    multiEventPathNode_32.setUpstream1(multiEventPathNode_33);
    multiEventPathNode_32.value = 0.0;
    multiEventPathNode_32.upstream1 = multiEventPathNode_33;
    multiEventPathNode_33.setUpstream1(multiEventPathNode_34);
    multiEventPathNode_33.value = 0.0;
    multiEventPathNode_33.upstream1 = multiEventPathNode_34;
    multiEventPathNode_34.setUpstream1(multiEventPathNode_35);
    multiEventPathNode_34.value = 0.0;
    multiEventPathNode_34.upstream1 = multiEventPathNode_35;
    multiEventPathNode_35.setUpstream1(multiEventPathNode_36);
    multiEventPathNode_35.value = 0.0;
    multiEventPathNode_35.upstream1 = multiEventPathNode_36;
    multiEventPathNode_36.setUpstream1(multiEventPathNode_37);
    multiEventPathNode_36.value = 0.0;
    multiEventPathNode_36.upstream1 = multiEventPathNode_37;
    multiEventPathNode_37.setUpstream1(multiEventPathNode_38);
    multiEventPathNode_37.value = 0.0;
    multiEventPathNode_37.upstream1 = multiEventPathNode_38;
    multiEventPathNode_38.setUpstream1(multiEventPathNode_39);
    multiEventPathNode_38.value = 0.0;
    multiEventPathNode_38.upstream1 = multiEventPathNode_39;
    multiEventPathNode_39.setUpstream1(multiEventPathNode_40);
    multiEventPathNode_39.value = 0.0;
    multiEventPathNode_39.upstream1 = multiEventPathNode_40;
    multiEventPathNode_40.setUpstream1(multiEventPathNode_41);
    multiEventPathNode_40.value = 0.0;
    multiEventPathNode_40.upstream1 = multiEventPathNode_41;
    multiEventPathNode_41.setUpstream1(multiEventPathNode_42);
    multiEventPathNode_41.value = 0.0;
    multiEventPathNode_41.upstream1 = multiEventPathNode_42;
    multiEventPathNode_42.setUpstream1(multiEventPathNode_43);
    multiEventPathNode_42.value = 0.0;
    multiEventPathNode_42.upstream1 = multiEventPathNode_43;
    multiEventPathNode_43.setUpstream1(multiEventPathNode_44);
    multiEventPathNode_43.value = 0.0;
    multiEventPathNode_43.upstream1 = multiEventPathNode_44;
    multiEventPathNode_44.setUpstream1(multiEventPathNode_45);
    multiEventPathNode_44.value = 0.0;
    multiEventPathNode_44.upstream1 = multiEventPathNode_45;
    multiEventPathNode_45.setUpstream1(multiEventPathNode_46);
    multiEventPathNode_45.value = 0.0;
    multiEventPathNode_45.upstream1 = multiEventPathNode_46;
    multiEventPathNode_46.setUpstream1(multiEventPathNode_47);
    multiEventPathNode_46.value = 0.0;
    multiEventPathNode_46.upstream1 = multiEventPathNode_47;
    multiEventPathNode_47.setUpstream1(multiEventPathNode_48);
    multiEventPathNode_47.value = 0.0;
    multiEventPathNode_47.upstream1 = multiEventPathNode_48;
    multiEventPathNode_48.setUpstream1(multiEventPathNode_49);
    multiEventPathNode_48.value = 0.0;
    multiEventPathNode_48.upstream1 = multiEventPathNode_49;
    multiEventPathNode_49.setUpstream1(multiEventPathNode_50);
    multiEventPathNode_49.value = 0.0;
    multiEventPathNode_49.upstream1 = multiEventPathNode_50;
    multiEventPathNode_50.setUpstream1(multiEventPathNode_51);
    multiEventPathNode_50.value = 0.0;
    multiEventPathNode_50.upstream1 = multiEventPathNode_51;
    multiEventPathNode_51.setUpstream1(multiEventPathNode_52);
    multiEventPathNode_51.value = 0.0;
    multiEventPathNode_51.upstream1 = multiEventPathNode_52;
    multiEventPathNode_52.setUpstream1(multiEventPathNode_53);
    multiEventPathNode_52.value = 0.0;
    multiEventPathNode_52.upstream1 = multiEventPathNode_53;
    multiEventPathNode_53.setUpstream1(multiEventPathNode_54);
    multiEventPathNode_53.value = 0.0;
    multiEventPathNode_53.upstream1 = multiEventPathNode_54;
    multiEventPathNode_54.setUpstream1(multiEventPathNode_55);
    multiEventPathNode_54.value = 0.0;
    multiEventPathNode_54.upstream1 = multiEventPathNode_55;
    multiEventPathNode_55.setUpstream1(multiEventPathNode_56);
    multiEventPathNode_55.value = 0.0;
    multiEventPathNode_55.upstream1 = multiEventPathNode_56;
    multiEventPathNode_56.setUpstream1(multiEventPathNode_57);
    multiEventPathNode_56.value = 0.0;
    multiEventPathNode_56.upstream1 = multiEventPathNode_57;
    multiEventPathNode_57.setUpstream1(multiEventPathNode_58);
    multiEventPathNode_57.value = 0.0;
    multiEventPathNode_57.upstream1 = multiEventPathNode_58;
    multiEventPathNode_58.setUpstream1(multiEventPathNode_59);
    multiEventPathNode_58.value = 0.0;
    multiEventPathNode_58.upstream1 = multiEventPathNode_59;
    multiEventPathNode_59.setUpstream1(multiEventPathNode_60);
    multiEventPathNode_59.value = 0.0;
    multiEventPathNode_59.upstream1 = multiEventPathNode_60;
    multiEventPathNode_60.setUpstream1(multiEventPathNode_61);
    multiEventPathNode_60.value = 0.0;
    multiEventPathNode_60.upstream1 = multiEventPathNode_61;
    multiEventPathNode_61.setUpstream1(multiEventPathNode_62);
    multiEventPathNode_61.value = 0.0;
    multiEventPathNode_61.upstream1 = multiEventPathNode_62;
    multiEventPathNode_62.setUpstream1(multiEventPathNode_63);
    multiEventPathNode_62.value = 0.0;
    multiEventPathNode_62.upstream1 = multiEventPathNode_63;
    multiEventPathNode_63.setUpstream1(multiEventPathNode_64);
    multiEventPathNode_63.value = 0.0;
    multiEventPathNode_63.upstream1 = multiEventPathNode_64;
    multiEventPathNode_64.setUpstream1(multiEventPathNode_65);
    multiEventPathNode_64.value = 0.0;
    multiEventPathNode_64.upstream1 = multiEventPathNode_65;
    multiEventPathNode_65.setUpstream1(multiEventPathNode_66);
    multiEventPathNode_65.value = 0.0;
    multiEventPathNode_65.upstream1 = multiEventPathNode_66;
    multiEventPathNode_66.setUpstream1(multiEventPathNode_67);
    multiEventPathNode_66.value = 0.0;
    multiEventPathNode_66.upstream1 = multiEventPathNode_67;
    multiEventPathNode_67.setUpstream1(multiEventPathNode_68);
    multiEventPathNode_67.value = 0.0;
    multiEventPathNode_67.upstream1 = multiEventPathNode_68;
    multiEventPathNode_68.setUpstream1(multiEventPathNode_69);
    multiEventPathNode_68.value = 0.0;
    multiEventPathNode_68.upstream1 = multiEventPathNode_69;
    multiEventPathNode_69.setUpstream1(multiEventPathNode_70);
    multiEventPathNode_69.value = 0.0;
    multiEventPathNode_69.upstream1 = multiEventPathNode_70;
    multiEventPathNode_70.setUpstream1(multiEventPathNode_71);
    multiEventPathNode_70.value = 0.0;
    multiEventPathNode_70.upstream1 = multiEventPathNode_71;
    multiEventPathNode_71.setUpstream1(multiEventPathNode_72);
    multiEventPathNode_71.value = 0.0;
    multiEventPathNode_71.upstream1 = multiEventPathNode_72;
    multiEventPathNode_72.setUpstream1(multiEventPathNode_73);
    multiEventPathNode_72.value = 0.0;
    multiEventPathNode_72.upstream1 = multiEventPathNode_73;
    multiEventPathNode_73.setUpstream1(multiEventPathNode_74);
    multiEventPathNode_73.value = 0.0;
    multiEventPathNode_73.upstream1 = multiEventPathNode_74;
    multiEventPathNode_74.setUpstream1(multiEventPathNode_75);
    multiEventPathNode_74.value = 0.0;
    multiEventPathNode_74.upstream1 = multiEventPathNode_75;
    multiEventPathNode_75.setUpstream1(multiEventPathNode_76);
    multiEventPathNode_75.value = 0.0;
    multiEventPathNode_75.upstream1 = multiEventPathNode_76;
    multiEventPathNode_76.setUpstream1(multiEventPathNode_77);
    multiEventPathNode_76.value = 0.0;
    multiEventPathNode_76.upstream1 = multiEventPathNode_77;
    multiEventPathNode_77.setUpstream1(multiEventPathNode_78);
    multiEventPathNode_77.value = 0.0;
    multiEventPathNode_77.upstream1 = multiEventPathNode_78;
    multiEventPathNode_78.setUpstream1(multiEventPathNode_79);
    multiEventPathNode_78.value = 0.0;
    multiEventPathNode_78.upstream1 = multiEventPathNode_79;
    multiEventPathNode_79.setUpstream1(multiEventPathNode_80);
    multiEventPathNode_79.value = 0.0;
    multiEventPathNode_79.upstream1 = multiEventPathNode_80;
    multiEventPathNode_80.setUpstream1(multiEventPathNode_81);
    multiEventPathNode_80.value = 0.0;
    multiEventPathNode_80.upstream1 = multiEventPathNode_81;
    multiEventPathNode_81.setUpstream1(multiEventPathNode_82);
    multiEventPathNode_81.value = 0.0;
    multiEventPathNode_81.upstream1 = multiEventPathNode_82;
    multiEventPathNode_82.setUpstream1(multiEventPathNode_83);
    multiEventPathNode_82.value = 0.0;
    multiEventPathNode_82.upstream1 = multiEventPathNode_83;
    multiEventPathNode_83.setUpstream1(multiEventPathNode_84);
    multiEventPathNode_83.value = 0.0;
    multiEventPathNode_83.upstream1 = multiEventPathNode_84;
    multiEventPathNode_84.setUpstream1(multiEventPathNode_85);
    multiEventPathNode_84.value = 0.0;
    multiEventPathNode_84.upstream1 = multiEventPathNode_85;
    multiEventPathNode_85.setUpstream1(multiEventPathNode_86);
    multiEventPathNode_85.value = 0.0;
    multiEventPathNode_85.upstream1 = multiEventPathNode_86;
    multiEventPathNode_86.setUpstream1(multiEventPathNode_87);
    multiEventPathNode_86.value = 0.0;
    multiEventPathNode_86.upstream1 = multiEventPathNode_87;
    multiEventPathNode_87.setUpstream1(multiEventPathNode_88);
    multiEventPathNode_87.value = 0.0;
    multiEventPathNode_87.upstream1 = multiEventPathNode_88;
    multiEventPathNode_88.setUpstream1(multiEventPathNode_89);
    multiEventPathNode_88.value = 0.0;
    multiEventPathNode_88.upstream1 = multiEventPathNode_89;
    multiEventPathNode_89.setUpstream1(multiEventPathNode_90);
    multiEventPathNode_89.value = 0.0;
    multiEventPathNode_89.upstream1 = multiEventPathNode_90;
    multiEventPathNode_90.setUpstream1(multiEventPathNode_91);
    multiEventPathNode_90.value = 0.0;
    multiEventPathNode_90.upstream1 = multiEventPathNode_91;
    multiEventPathNode_91.setUpstream1(multiEventPathNode_92);
    multiEventPathNode_91.value = 0.0;
    multiEventPathNode_91.upstream1 = multiEventPathNode_92;
    multiEventPathNode_92.setUpstream1(multiEventPathNode_93);
    multiEventPathNode_92.value = 0.0;
    multiEventPathNode_92.upstream1 = multiEventPathNode_93;
    multiEventPathNode_93.setUpstream1(multiEventPathNode_94);
    multiEventPathNode_93.value = 0.0;
    multiEventPathNode_93.upstream1 = multiEventPathNode_94;
    multiEventPathNode_94.setUpstream1(multiEventPathNode_95);
    multiEventPathNode_94.value = 0.0;
    multiEventPathNode_94.upstream1 = multiEventPathNode_95;
    multiEventPathNode_95.setUpstream1(multiEventPathNode_96);
    multiEventPathNode_95.value = 0.0;
    multiEventPathNode_95.upstream1 = multiEventPathNode_96;
    multiEventPathNode_96.setUpstream1(multiEventPathNode_97);
    multiEventPathNode_96.value = 0.0;
    multiEventPathNode_96.upstream1 = multiEventPathNode_97;
    multiEventPathNode_97.setUpstream1(multiEventPathNode_98);
    multiEventPathNode_97.value = 0.0;
    multiEventPathNode_97.upstream1 = multiEventPathNode_98;
    multiEventPathNode_98.setUpstream1(multiEventPathNode_99);
    multiEventPathNode_98.value = 0.0;
    multiEventPathNode_98.upstream1 = multiEventPathNode_99;
    multiEventPathNode_99.setUpstream1(multiEventPathNode_100);
    multiEventPathNode_99.value = 0.0;
    multiEventPathNode_99.upstream1 = multiEventPathNode_100;
    multiEventPathNode_100.setUpstream1(multiEventPathRootNode_101);
    multiEventPathNode_100.value = 0.0;
    multiEventPathNode_100.upstream1 = multiEventPathRootNode_101;
    sink.setUpstream1(multiEventPathNode_1);
    sink.upstream1 = multiEventPathNode_1;
    sink.value = 0.0;
    multiEventPathRootNode_101.value = 0.0;
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

  public MultiEventPath100Processor() {
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
    } else if (event instanceof ControlEvent) {
      ControlEvent typedEvent = (ControlEvent) event;
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

  public void handleEvent(ControlEvent typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    isDirty_multiEventPathRootNode_101 = multiEventPathRootNode_101.onControl(typedEvent);
    commonDispatchTail_1(typedEvent);
    afterEvent();
  }

  public void handleEvent(MarketDataEvent typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    isDirty_multiEventPathRootNode_101 = multiEventPathRootNode_101.onMarketData(typedEvent);
    commonDispatchTail_1(typedEvent);
    afterEvent();
  }

  public void handleEvent(TradeSignalEvent typedEvent) {
    auditEvent(typedEvent);
    //Default, no filter methods
    isDirty_multiEventPathRootNode_101 = multiEventPathRootNode_101.onTradeSignal(typedEvent);
    commonDispatchTail_1(typedEvent);
    afterEvent();
  }
  //EVENT DISPATCH - END

  //MERGED DISPATCH HELPERS - START

  private void commonDispatchTail_1(Object typedEvent) {
    if (guardCheck_multiEventPathNode_100()) {
      isDirty_multiEventPathNode_100 = multiEventPathNode_100.onUpstream();
    }
    if (guardCheck_multiEventPathNode_99()) {
      isDirty_multiEventPathNode_99 = multiEventPathNode_99.onUpstream();
    }
    if (guardCheck_multiEventPathNode_98()) {
      isDirty_multiEventPathNode_98 = multiEventPathNode_98.onUpstream();
    }
    if (guardCheck_multiEventPathNode_97()) {
      isDirty_multiEventPathNode_97 = multiEventPathNode_97.onUpstream();
    }
    if (guardCheck_multiEventPathNode_96()) {
      isDirty_multiEventPathNode_96 = multiEventPathNode_96.onUpstream();
    }
    if (guardCheck_multiEventPathNode_95()) {
      isDirty_multiEventPathNode_95 = multiEventPathNode_95.onUpstream();
    }
    if (guardCheck_multiEventPathNode_94()) {
      isDirty_multiEventPathNode_94 = multiEventPathNode_94.onUpstream();
    }
    if (guardCheck_multiEventPathNode_93()) {
      isDirty_multiEventPathNode_93 = multiEventPathNode_93.onUpstream();
    }
    if (guardCheck_multiEventPathNode_92()) {
      isDirty_multiEventPathNode_92 = multiEventPathNode_92.onUpstream();
    }
    if (guardCheck_multiEventPathNode_91()) {
      isDirty_multiEventPathNode_91 = multiEventPathNode_91.onUpstream();
    }
    if (guardCheck_multiEventPathNode_90()) {
      isDirty_multiEventPathNode_90 = multiEventPathNode_90.onUpstream();
    }
    if (guardCheck_multiEventPathNode_89()) {
      isDirty_multiEventPathNode_89 = multiEventPathNode_89.onUpstream();
    }
    if (guardCheck_multiEventPathNode_88()) {
      isDirty_multiEventPathNode_88 = multiEventPathNode_88.onUpstream();
    }
    if (guardCheck_multiEventPathNode_87()) {
      isDirty_multiEventPathNode_87 = multiEventPathNode_87.onUpstream();
    }
    if (guardCheck_multiEventPathNode_86()) {
      isDirty_multiEventPathNode_86 = multiEventPathNode_86.onUpstream();
    }
    if (guardCheck_multiEventPathNode_85()) {
      isDirty_multiEventPathNode_85 = multiEventPathNode_85.onUpstream();
    }
    if (guardCheck_multiEventPathNode_84()) {
      isDirty_multiEventPathNode_84 = multiEventPathNode_84.onUpstream();
    }
    if (guardCheck_multiEventPathNode_83()) {
      isDirty_multiEventPathNode_83 = multiEventPathNode_83.onUpstream();
    }
    if (guardCheck_multiEventPathNode_82()) {
      isDirty_multiEventPathNode_82 = multiEventPathNode_82.onUpstream();
    }
    if (guardCheck_multiEventPathNode_81()) {
      isDirty_multiEventPathNode_81 = multiEventPathNode_81.onUpstream();
    }
    if (guardCheck_multiEventPathNode_80()) {
      isDirty_multiEventPathNode_80 = multiEventPathNode_80.onUpstream();
    }
    if (guardCheck_multiEventPathNode_79()) {
      isDirty_multiEventPathNode_79 = multiEventPathNode_79.onUpstream();
    }
    if (guardCheck_multiEventPathNode_78()) {
      isDirty_multiEventPathNode_78 = multiEventPathNode_78.onUpstream();
    }
    if (guardCheck_multiEventPathNode_77()) {
      isDirty_multiEventPathNode_77 = multiEventPathNode_77.onUpstream();
    }
    if (guardCheck_multiEventPathNode_76()) {
      isDirty_multiEventPathNode_76 = multiEventPathNode_76.onUpstream();
    }
    if (guardCheck_multiEventPathNode_75()) {
      isDirty_multiEventPathNode_75 = multiEventPathNode_75.onUpstream();
    }
    if (guardCheck_multiEventPathNode_74()) {
      isDirty_multiEventPathNode_74 = multiEventPathNode_74.onUpstream();
    }
    if (guardCheck_multiEventPathNode_73()) {
      isDirty_multiEventPathNode_73 = multiEventPathNode_73.onUpstream();
    }
    if (guardCheck_multiEventPathNode_72()) {
      isDirty_multiEventPathNode_72 = multiEventPathNode_72.onUpstream();
    }
    if (guardCheck_multiEventPathNode_71()) {
      isDirty_multiEventPathNode_71 = multiEventPathNode_71.onUpstream();
    }
    if (guardCheck_multiEventPathNode_70()) {
      isDirty_multiEventPathNode_70 = multiEventPathNode_70.onUpstream();
    }
    if (guardCheck_multiEventPathNode_69()) {
      isDirty_multiEventPathNode_69 = multiEventPathNode_69.onUpstream();
    }
    if (guardCheck_multiEventPathNode_68()) {
      isDirty_multiEventPathNode_68 = multiEventPathNode_68.onUpstream();
    }
    if (guardCheck_multiEventPathNode_67()) {
      isDirty_multiEventPathNode_67 = multiEventPathNode_67.onUpstream();
    }
    if (guardCheck_multiEventPathNode_66()) {
      isDirty_multiEventPathNode_66 = multiEventPathNode_66.onUpstream();
    }
    if (guardCheck_multiEventPathNode_65()) {
      isDirty_multiEventPathNode_65 = multiEventPathNode_65.onUpstream();
    }
    if (guardCheck_multiEventPathNode_64()) {
      isDirty_multiEventPathNode_64 = multiEventPathNode_64.onUpstream();
    }
    if (guardCheck_multiEventPathNode_63()) {
      isDirty_multiEventPathNode_63 = multiEventPathNode_63.onUpstream();
    }
    if (guardCheck_multiEventPathNode_62()) {
      isDirty_multiEventPathNode_62 = multiEventPathNode_62.onUpstream();
    }
    if (guardCheck_multiEventPathNode_61()) {
      isDirty_multiEventPathNode_61 = multiEventPathNode_61.onUpstream();
    }
    if (guardCheck_multiEventPathNode_60()) {
      isDirty_multiEventPathNode_60 = multiEventPathNode_60.onUpstream();
    }
    if (guardCheck_multiEventPathNode_59()) {
      isDirty_multiEventPathNode_59 = multiEventPathNode_59.onUpstream();
    }
    if (guardCheck_multiEventPathNode_58()) {
      isDirty_multiEventPathNode_58 = multiEventPathNode_58.onUpstream();
    }
    if (guardCheck_multiEventPathNode_57()) {
      isDirty_multiEventPathNode_57 = multiEventPathNode_57.onUpstream();
    }
    if (guardCheck_multiEventPathNode_56()) {
      isDirty_multiEventPathNode_56 = multiEventPathNode_56.onUpstream();
    }
    if (guardCheck_multiEventPathNode_55()) {
      isDirty_multiEventPathNode_55 = multiEventPathNode_55.onUpstream();
    }
    if (guardCheck_multiEventPathNode_54()) {
      isDirty_multiEventPathNode_54 = multiEventPathNode_54.onUpstream();
    }
    if (guardCheck_multiEventPathNode_53()) {
      isDirty_multiEventPathNode_53 = multiEventPathNode_53.onUpstream();
    }
    if (guardCheck_multiEventPathNode_52()) {
      isDirty_multiEventPathNode_52 = multiEventPathNode_52.onUpstream();
    }
    if (guardCheck_multiEventPathNode_51()) {
      isDirty_multiEventPathNode_51 = multiEventPathNode_51.onUpstream();
    }
    if (guardCheck_multiEventPathNode_50()) {
      isDirty_multiEventPathNode_50 = multiEventPathNode_50.onUpstream();
    }
    if (guardCheck_multiEventPathNode_49()) {
      isDirty_multiEventPathNode_49 = multiEventPathNode_49.onUpstream();
    }
    if (guardCheck_multiEventPathNode_48()) {
      isDirty_multiEventPathNode_48 = multiEventPathNode_48.onUpstream();
    }
    if (guardCheck_multiEventPathNode_47()) {
      isDirty_multiEventPathNode_47 = multiEventPathNode_47.onUpstream();
    }
    if (guardCheck_multiEventPathNode_46()) {
      isDirty_multiEventPathNode_46 = multiEventPathNode_46.onUpstream();
    }
    if (guardCheck_multiEventPathNode_45()) {
      isDirty_multiEventPathNode_45 = multiEventPathNode_45.onUpstream();
    }
    if (guardCheck_multiEventPathNode_44()) {
      isDirty_multiEventPathNode_44 = multiEventPathNode_44.onUpstream();
    }
    if (guardCheck_multiEventPathNode_43()) {
      isDirty_multiEventPathNode_43 = multiEventPathNode_43.onUpstream();
    }
    if (guardCheck_multiEventPathNode_42()) {
      isDirty_multiEventPathNode_42 = multiEventPathNode_42.onUpstream();
    }
    if (guardCheck_multiEventPathNode_41()) {
      isDirty_multiEventPathNode_41 = multiEventPathNode_41.onUpstream();
    }
    if (guardCheck_multiEventPathNode_40()) {
      isDirty_multiEventPathNode_40 = multiEventPathNode_40.onUpstream();
    }
    if (guardCheck_multiEventPathNode_39()) {
      isDirty_multiEventPathNode_39 = multiEventPathNode_39.onUpstream();
    }
    if (guardCheck_multiEventPathNode_38()) {
      isDirty_multiEventPathNode_38 = multiEventPathNode_38.onUpstream();
    }
    if (guardCheck_multiEventPathNode_37()) {
      isDirty_multiEventPathNode_37 = multiEventPathNode_37.onUpstream();
    }
    if (guardCheck_multiEventPathNode_36()) {
      isDirty_multiEventPathNode_36 = multiEventPathNode_36.onUpstream();
    }
    if (guardCheck_multiEventPathNode_35()) {
      isDirty_multiEventPathNode_35 = multiEventPathNode_35.onUpstream();
    }
    if (guardCheck_multiEventPathNode_34()) {
      isDirty_multiEventPathNode_34 = multiEventPathNode_34.onUpstream();
    }
    if (guardCheck_multiEventPathNode_33()) {
      isDirty_multiEventPathNode_33 = multiEventPathNode_33.onUpstream();
    }
    if (guardCheck_multiEventPathNode_32()) {
      isDirty_multiEventPathNode_32 = multiEventPathNode_32.onUpstream();
    }
    if (guardCheck_multiEventPathNode_31()) {
      isDirty_multiEventPathNode_31 = multiEventPathNode_31.onUpstream();
    }
    if (guardCheck_multiEventPathNode_30()) {
      isDirty_multiEventPathNode_30 = multiEventPathNode_30.onUpstream();
    }
    if (guardCheck_multiEventPathNode_29()) {
      isDirty_multiEventPathNode_29 = multiEventPathNode_29.onUpstream();
    }
    if (guardCheck_multiEventPathNode_28()) {
      isDirty_multiEventPathNode_28 = multiEventPathNode_28.onUpstream();
    }
    if (guardCheck_multiEventPathNode_27()) {
      isDirty_multiEventPathNode_27 = multiEventPathNode_27.onUpstream();
    }
    if (guardCheck_multiEventPathNode_26()) {
      isDirty_multiEventPathNode_26 = multiEventPathNode_26.onUpstream();
    }
    if (guardCheck_multiEventPathNode_25()) {
      isDirty_multiEventPathNode_25 = multiEventPathNode_25.onUpstream();
    }
    if (guardCheck_multiEventPathNode_24()) {
      isDirty_multiEventPathNode_24 = multiEventPathNode_24.onUpstream();
    }
    if (guardCheck_multiEventPathNode_23()) {
      isDirty_multiEventPathNode_23 = multiEventPathNode_23.onUpstream();
    }
    if (guardCheck_multiEventPathNode_22()) {
      isDirty_multiEventPathNode_22 = multiEventPathNode_22.onUpstream();
    }
    if (guardCheck_multiEventPathNode_21()) {
      isDirty_multiEventPathNode_21 = multiEventPathNode_21.onUpstream();
    }
    if (guardCheck_multiEventPathNode_20()) {
      isDirty_multiEventPathNode_20 = multiEventPathNode_20.onUpstream();
    }
    if (guardCheck_multiEventPathNode_19()) {
      isDirty_multiEventPathNode_19 = multiEventPathNode_19.onUpstream();
    }
    if (guardCheck_multiEventPathNode_18()) {
      isDirty_multiEventPathNode_18 = multiEventPathNode_18.onUpstream();
    }
    if (guardCheck_multiEventPathNode_17()) {
      isDirty_multiEventPathNode_17 = multiEventPathNode_17.onUpstream();
    }
    if (guardCheck_multiEventPathNode_16()) {
      isDirty_multiEventPathNode_16 = multiEventPathNode_16.onUpstream();
    }
    if (guardCheck_multiEventPathNode_15()) {
      isDirty_multiEventPathNode_15 = multiEventPathNode_15.onUpstream();
    }
    if (guardCheck_multiEventPathNode_14()) {
      isDirty_multiEventPathNode_14 = multiEventPathNode_14.onUpstream();
    }
    if (guardCheck_multiEventPathNode_13()) {
      isDirty_multiEventPathNode_13 = multiEventPathNode_13.onUpstream();
    }
    if (guardCheck_multiEventPathNode_12()) {
      isDirty_multiEventPathNode_12 = multiEventPathNode_12.onUpstream();
    }
    if (guardCheck_multiEventPathNode_11()) {
      isDirty_multiEventPathNode_11 = multiEventPathNode_11.onUpstream();
    }
    if (guardCheck_multiEventPathNode_10()) {
      isDirty_multiEventPathNode_10 = multiEventPathNode_10.onUpstream();
    }
    if (guardCheck_multiEventPathNode_9()) {
      isDirty_multiEventPathNode_9 = multiEventPathNode_9.onUpstream();
    }
    if (guardCheck_multiEventPathNode_8()) {
      isDirty_multiEventPathNode_8 = multiEventPathNode_8.onUpstream();
    }
    if (guardCheck_multiEventPathNode_7()) {
      isDirty_multiEventPathNode_7 = multiEventPathNode_7.onUpstream();
    }
    if (guardCheck_multiEventPathNode_6()) {
      isDirty_multiEventPathNode_6 = multiEventPathNode_6.onUpstream();
    }
    if (guardCheck_multiEventPathNode_5()) {
      isDirty_multiEventPathNode_5 = multiEventPathNode_5.onUpstream();
    }
    if (guardCheck_multiEventPathNode_4()) {
      isDirty_multiEventPathNode_4 = multiEventPathNode_4.onUpstream();
    }
    if (guardCheck_multiEventPathNode_3()) {
      isDirty_multiEventPathNode_3 = multiEventPathNode_3.onUpstream();
    }
    if (guardCheck_multiEventPathNode_2()) {
      isDirty_multiEventPathNode_2 = multiEventPathNode_2.onUpstream();
    }
    if (guardCheck_multiEventPathNode_1()) {
      isDirty_multiEventPathNode_1 = multiEventPathNode_1.onUpstream();
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
    } else if (event instanceof ControlEvent) {
      ControlEvent typedEvent = (ControlEvent) event;
      auditEvent(typedEvent);
      isDirty_multiEventPathRootNode_101 = multiEventPathRootNode_101.onControl(typedEvent);
    } else if (event instanceof MarketDataEvent) {
      MarketDataEvent typedEvent = (MarketDataEvent) event;
      auditEvent(typedEvent);
      isDirty_multiEventPathRootNode_101 = multiEventPathRootNode_101.onMarketData(typedEvent);
    } else if (event instanceof TradeSignalEvent) {
      TradeSignalEvent typedEvent = (TradeSignalEvent) event;
      auditEvent(typedEvent);
      isDirty_multiEventPathRootNode_101 = multiEventPathRootNode_101.onTradeSignal(typedEvent);
    }
  }

  public void triggerCalculation() {
    buffering = false;
    String typedEvent = "No event information - buffered dispatch";
    if (guardCheck_multiEventPathNode_100()) {
      isDirty_multiEventPathNode_100 = multiEventPathNode_100.onUpstream();
    }
    if (guardCheck_multiEventPathNode_99()) {
      isDirty_multiEventPathNode_99 = multiEventPathNode_99.onUpstream();
    }
    if (guardCheck_multiEventPathNode_98()) {
      isDirty_multiEventPathNode_98 = multiEventPathNode_98.onUpstream();
    }
    if (guardCheck_multiEventPathNode_97()) {
      isDirty_multiEventPathNode_97 = multiEventPathNode_97.onUpstream();
    }
    if (guardCheck_multiEventPathNode_96()) {
      isDirty_multiEventPathNode_96 = multiEventPathNode_96.onUpstream();
    }
    if (guardCheck_multiEventPathNode_95()) {
      isDirty_multiEventPathNode_95 = multiEventPathNode_95.onUpstream();
    }
    if (guardCheck_multiEventPathNode_94()) {
      isDirty_multiEventPathNode_94 = multiEventPathNode_94.onUpstream();
    }
    if (guardCheck_multiEventPathNode_93()) {
      isDirty_multiEventPathNode_93 = multiEventPathNode_93.onUpstream();
    }
    if (guardCheck_multiEventPathNode_92()) {
      isDirty_multiEventPathNode_92 = multiEventPathNode_92.onUpstream();
    }
    if (guardCheck_multiEventPathNode_91()) {
      isDirty_multiEventPathNode_91 = multiEventPathNode_91.onUpstream();
    }
    if (guardCheck_multiEventPathNode_90()) {
      isDirty_multiEventPathNode_90 = multiEventPathNode_90.onUpstream();
    }
    if (guardCheck_multiEventPathNode_89()) {
      isDirty_multiEventPathNode_89 = multiEventPathNode_89.onUpstream();
    }
    if (guardCheck_multiEventPathNode_88()) {
      isDirty_multiEventPathNode_88 = multiEventPathNode_88.onUpstream();
    }
    if (guardCheck_multiEventPathNode_87()) {
      isDirty_multiEventPathNode_87 = multiEventPathNode_87.onUpstream();
    }
    if (guardCheck_multiEventPathNode_86()) {
      isDirty_multiEventPathNode_86 = multiEventPathNode_86.onUpstream();
    }
    if (guardCheck_multiEventPathNode_85()) {
      isDirty_multiEventPathNode_85 = multiEventPathNode_85.onUpstream();
    }
    if (guardCheck_multiEventPathNode_84()) {
      isDirty_multiEventPathNode_84 = multiEventPathNode_84.onUpstream();
    }
    if (guardCheck_multiEventPathNode_83()) {
      isDirty_multiEventPathNode_83 = multiEventPathNode_83.onUpstream();
    }
    if (guardCheck_multiEventPathNode_82()) {
      isDirty_multiEventPathNode_82 = multiEventPathNode_82.onUpstream();
    }
    if (guardCheck_multiEventPathNode_81()) {
      isDirty_multiEventPathNode_81 = multiEventPathNode_81.onUpstream();
    }
    if (guardCheck_multiEventPathNode_80()) {
      isDirty_multiEventPathNode_80 = multiEventPathNode_80.onUpstream();
    }
    if (guardCheck_multiEventPathNode_79()) {
      isDirty_multiEventPathNode_79 = multiEventPathNode_79.onUpstream();
    }
    if (guardCheck_multiEventPathNode_78()) {
      isDirty_multiEventPathNode_78 = multiEventPathNode_78.onUpstream();
    }
    if (guardCheck_multiEventPathNode_77()) {
      isDirty_multiEventPathNode_77 = multiEventPathNode_77.onUpstream();
    }
    if (guardCheck_multiEventPathNode_76()) {
      isDirty_multiEventPathNode_76 = multiEventPathNode_76.onUpstream();
    }
    if (guardCheck_multiEventPathNode_75()) {
      isDirty_multiEventPathNode_75 = multiEventPathNode_75.onUpstream();
    }
    if (guardCheck_multiEventPathNode_74()) {
      isDirty_multiEventPathNode_74 = multiEventPathNode_74.onUpstream();
    }
    if (guardCheck_multiEventPathNode_73()) {
      isDirty_multiEventPathNode_73 = multiEventPathNode_73.onUpstream();
    }
    if (guardCheck_multiEventPathNode_72()) {
      isDirty_multiEventPathNode_72 = multiEventPathNode_72.onUpstream();
    }
    if (guardCheck_multiEventPathNode_71()) {
      isDirty_multiEventPathNode_71 = multiEventPathNode_71.onUpstream();
    }
    if (guardCheck_multiEventPathNode_70()) {
      isDirty_multiEventPathNode_70 = multiEventPathNode_70.onUpstream();
    }
    if (guardCheck_multiEventPathNode_69()) {
      isDirty_multiEventPathNode_69 = multiEventPathNode_69.onUpstream();
    }
    if (guardCheck_multiEventPathNode_68()) {
      isDirty_multiEventPathNode_68 = multiEventPathNode_68.onUpstream();
    }
    if (guardCheck_multiEventPathNode_67()) {
      isDirty_multiEventPathNode_67 = multiEventPathNode_67.onUpstream();
    }
    if (guardCheck_multiEventPathNode_66()) {
      isDirty_multiEventPathNode_66 = multiEventPathNode_66.onUpstream();
    }
    if (guardCheck_multiEventPathNode_65()) {
      isDirty_multiEventPathNode_65 = multiEventPathNode_65.onUpstream();
    }
    if (guardCheck_multiEventPathNode_64()) {
      isDirty_multiEventPathNode_64 = multiEventPathNode_64.onUpstream();
    }
    if (guardCheck_multiEventPathNode_63()) {
      isDirty_multiEventPathNode_63 = multiEventPathNode_63.onUpstream();
    }
    if (guardCheck_multiEventPathNode_62()) {
      isDirty_multiEventPathNode_62 = multiEventPathNode_62.onUpstream();
    }
    if (guardCheck_multiEventPathNode_61()) {
      isDirty_multiEventPathNode_61 = multiEventPathNode_61.onUpstream();
    }
    if (guardCheck_multiEventPathNode_60()) {
      isDirty_multiEventPathNode_60 = multiEventPathNode_60.onUpstream();
    }
    if (guardCheck_multiEventPathNode_59()) {
      isDirty_multiEventPathNode_59 = multiEventPathNode_59.onUpstream();
    }
    if (guardCheck_multiEventPathNode_58()) {
      isDirty_multiEventPathNode_58 = multiEventPathNode_58.onUpstream();
    }
    if (guardCheck_multiEventPathNode_57()) {
      isDirty_multiEventPathNode_57 = multiEventPathNode_57.onUpstream();
    }
    if (guardCheck_multiEventPathNode_56()) {
      isDirty_multiEventPathNode_56 = multiEventPathNode_56.onUpstream();
    }
    if (guardCheck_multiEventPathNode_55()) {
      isDirty_multiEventPathNode_55 = multiEventPathNode_55.onUpstream();
    }
    if (guardCheck_multiEventPathNode_54()) {
      isDirty_multiEventPathNode_54 = multiEventPathNode_54.onUpstream();
    }
    if (guardCheck_multiEventPathNode_53()) {
      isDirty_multiEventPathNode_53 = multiEventPathNode_53.onUpstream();
    }
    if (guardCheck_multiEventPathNode_52()) {
      isDirty_multiEventPathNode_52 = multiEventPathNode_52.onUpstream();
    }
    if (guardCheck_multiEventPathNode_51()) {
      isDirty_multiEventPathNode_51 = multiEventPathNode_51.onUpstream();
    }
    if (guardCheck_multiEventPathNode_50()) {
      isDirty_multiEventPathNode_50 = multiEventPathNode_50.onUpstream();
    }
    if (guardCheck_multiEventPathNode_49()) {
      isDirty_multiEventPathNode_49 = multiEventPathNode_49.onUpstream();
    }
    if (guardCheck_multiEventPathNode_48()) {
      isDirty_multiEventPathNode_48 = multiEventPathNode_48.onUpstream();
    }
    if (guardCheck_multiEventPathNode_47()) {
      isDirty_multiEventPathNode_47 = multiEventPathNode_47.onUpstream();
    }
    if (guardCheck_multiEventPathNode_46()) {
      isDirty_multiEventPathNode_46 = multiEventPathNode_46.onUpstream();
    }
    if (guardCheck_multiEventPathNode_45()) {
      isDirty_multiEventPathNode_45 = multiEventPathNode_45.onUpstream();
    }
    if (guardCheck_multiEventPathNode_44()) {
      isDirty_multiEventPathNode_44 = multiEventPathNode_44.onUpstream();
    }
    if (guardCheck_multiEventPathNode_43()) {
      isDirty_multiEventPathNode_43 = multiEventPathNode_43.onUpstream();
    }
    if (guardCheck_multiEventPathNode_42()) {
      isDirty_multiEventPathNode_42 = multiEventPathNode_42.onUpstream();
    }
    if (guardCheck_multiEventPathNode_41()) {
      isDirty_multiEventPathNode_41 = multiEventPathNode_41.onUpstream();
    }
    if (guardCheck_multiEventPathNode_40()) {
      isDirty_multiEventPathNode_40 = multiEventPathNode_40.onUpstream();
    }
    if (guardCheck_multiEventPathNode_39()) {
      isDirty_multiEventPathNode_39 = multiEventPathNode_39.onUpstream();
    }
    if (guardCheck_multiEventPathNode_38()) {
      isDirty_multiEventPathNode_38 = multiEventPathNode_38.onUpstream();
    }
    if (guardCheck_multiEventPathNode_37()) {
      isDirty_multiEventPathNode_37 = multiEventPathNode_37.onUpstream();
    }
    if (guardCheck_multiEventPathNode_36()) {
      isDirty_multiEventPathNode_36 = multiEventPathNode_36.onUpstream();
    }
    if (guardCheck_multiEventPathNode_35()) {
      isDirty_multiEventPathNode_35 = multiEventPathNode_35.onUpstream();
    }
    if (guardCheck_multiEventPathNode_34()) {
      isDirty_multiEventPathNode_34 = multiEventPathNode_34.onUpstream();
    }
    if (guardCheck_multiEventPathNode_33()) {
      isDirty_multiEventPathNode_33 = multiEventPathNode_33.onUpstream();
    }
    if (guardCheck_multiEventPathNode_32()) {
      isDirty_multiEventPathNode_32 = multiEventPathNode_32.onUpstream();
    }
    if (guardCheck_multiEventPathNode_31()) {
      isDirty_multiEventPathNode_31 = multiEventPathNode_31.onUpstream();
    }
    if (guardCheck_multiEventPathNode_30()) {
      isDirty_multiEventPathNode_30 = multiEventPathNode_30.onUpstream();
    }
    if (guardCheck_multiEventPathNode_29()) {
      isDirty_multiEventPathNode_29 = multiEventPathNode_29.onUpstream();
    }
    if (guardCheck_multiEventPathNode_28()) {
      isDirty_multiEventPathNode_28 = multiEventPathNode_28.onUpstream();
    }
    if (guardCheck_multiEventPathNode_27()) {
      isDirty_multiEventPathNode_27 = multiEventPathNode_27.onUpstream();
    }
    if (guardCheck_multiEventPathNode_26()) {
      isDirty_multiEventPathNode_26 = multiEventPathNode_26.onUpstream();
    }
    if (guardCheck_multiEventPathNode_25()) {
      isDirty_multiEventPathNode_25 = multiEventPathNode_25.onUpstream();
    }
    if (guardCheck_multiEventPathNode_24()) {
      isDirty_multiEventPathNode_24 = multiEventPathNode_24.onUpstream();
    }
    if (guardCheck_multiEventPathNode_23()) {
      isDirty_multiEventPathNode_23 = multiEventPathNode_23.onUpstream();
    }
    if (guardCheck_multiEventPathNode_22()) {
      isDirty_multiEventPathNode_22 = multiEventPathNode_22.onUpstream();
    }
    if (guardCheck_multiEventPathNode_21()) {
      isDirty_multiEventPathNode_21 = multiEventPathNode_21.onUpstream();
    }
    if (guardCheck_multiEventPathNode_20()) {
      isDirty_multiEventPathNode_20 = multiEventPathNode_20.onUpstream();
    }
    if (guardCheck_multiEventPathNode_19()) {
      isDirty_multiEventPathNode_19 = multiEventPathNode_19.onUpstream();
    }
    if (guardCheck_multiEventPathNode_18()) {
      isDirty_multiEventPathNode_18 = multiEventPathNode_18.onUpstream();
    }
    if (guardCheck_multiEventPathNode_17()) {
      isDirty_multiEventPathNode_17 = multiEventPathNode_17.onUpstream();
    }
    if (guardCheck_multiEventPathNode_16()) {
      isDirty_multiEventPathNode_16 = multiEventPathNode_16.onUpstream();
    }
    if (guardCheck_multiEventPathNode_15()) {
      isDirty_multiEventPathNode_15 = multiEventPathNode_15.onUpstream();
    }
    if (guardCheck_multiEventPathNode_14()) {
      isDirty_multiEventPathNode_14 = multiEventPathNode_14.onUpstream();
    }
    if (guardCheck_multiEventPathNode_13()) {
      isDirty_multiEventPathNode_13 = multiEventPathNode_13.onUpstream();
    }
    if (guardCheck_multiEventPathNode_12()) {
      isDirty_multiEventPathNode_12 = multiEventPathNode_12.onUpstream();
    }
    if (guardCheck_multiEventPathNode_11()) {
      isDirty_multiEventPathNode_11 = multiEventPathNode_11.onUpstream();
    }
    if (guardCheck_multiEventPathNode_10()) {
      isDirty_multiEventPathNode_10 = multiEventPathNode_10.onUpstream();
    }
    if (guardCheck_multiEventPathNode_9()) {
      isDirty_multiEventPathNode_9 = multiEventPathNode_9.onUpstream();
    }
    if (guardCheck_multiEventPathNode_8()) {
      isDirty_multiEventPathNode_8 = multiEventPathNode_8.onUpstream();
    }
    if (guardCheck_multiEventPathNode_7()) {
      isDirty_multiEventPathNode_7 = multiEventPathNode_7.onUpstream();
    }
    if (guardCheck_multiEventPathNode_6()) {
      isDirty_multiEventPathNode_6 = multiEventPathNode_6.onUpstream();
    }
    if (guardCheck_multiEventPathNode_5()) {
      isDirty_multiEventPathNode_5 = multiEventPathNode_5.onUpstream();
    }
    if (guardCheck_multiEventPathNode_4()) {
      isDirty_multiEventPathNode_4 = multiEventPathNode_4.onUpstream();
    }
    if (guardCheck_multiEventPathNode_3()) {
      isDirty_multiEventPathNode_3 = multiEventPathNode_3.onUpstream();
    }
    if (guardCheck_multiEventPathNode_2()) {
      isDirty_multiEventPathNode_2 = multiEventPathNode_2.onUpstream();
    }
    if (guardCheck_multiEventPathNode_1()) {
      isDirty_multiEventPathNode_1 = multiEventPathNode_1.onUpstream();
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
    auditor.nodeRegistered(multiEventPathNode_1, "multiEventPathNode_1");
    auditor.nodeRegistered(multiEventPathNode_2, "multiEventPathNode_2");
    auditor.nodeRegistered(multiEventPathNode_3, "multiEventPathNode_3");
    auditor.nodeRegistered(multiEventPathNode_4, "multiEventPathNode_4");
    auditor.nodeRegistered(multiEventPathNode_5, "multiEventPathNode_5");
    auditor.nodeRegistered(multiEventPathNode_6, "multiEventPathNode_6");
    auditor.nodeRegistered(multiEventPathNode_7, "multiEventPathNode_7");
    auditor.nodeRegistered(multiEventPathNode_8, "multiEventPathNode_8");
    auditor.nodeRegistered(multiEventPathNode_9, "multiEventPathNode_9");
    auditor.nodeRegistered(multiEventPathNode_10, "multiEventPathNode_10");
    auditor.nodeRegistered(multiEventPathNode_11, "multiEventPathNode_11");
    auditor.nodeRegistered(multiEventPathNode_12, "multiEventPathNode_12");
    auditor.nodeRegistered(multiEventPathNode_13, "multiEventPathNode_13");
    auditor.nodeRegistered(multiEventPathNode_14, "multiEventPathNode_14");
    auditor.nodeRegistered(multiEventPathNode_15, "multiEventPathNode_15");
    auditor.nodeRegistered(multiEventPathNode_16, "multiEventPathNode_16");
    auditor.nodeRegistered(multiEventPathNode_17, "multiEventPathNode_17");
    auditor.nodeRegistered(multiEventPathNode_18, "multiEventPathNode_18");
    auditor.nodeRegistered(multiEventPathNode_19, "multiEventPathNode_19");
    auditor.nodeRegistered(multiEventPathNode_20, "multiEventPathNode_20");
    auditor.nodeRegistered(multiEventPathNode_21, "multiEventPathNode_21");
    auditor.nodeRegistered(multiEventPathNode_22, "multiEventPathNode_22");
    auditor.nodeRegistered(multiEventPathNode_23, "multiEventPathNode_23");
    auditor.nodeRegistered(multiEventPathNode_24, "multiEventPathNode_24");
    auditor.nodeRegistered(multiEventPathNode_25, "multiEventPathNode_25");
    auditor.nodeRegistered(multiEventPathNode_26, "multiEventPathNode_26");
    auditor.nodeRegistered(multiEventPathNode_27, "multiEventPathNode_27");
    auditor.nodeRegistered(multiEventPathNode_28, "multiEventPathNode_28");
    auditor.nodeRegistered(multiEventPathNode_29, "multiEventPathNode_29");
    auditor.nodeRegistered(multiEventPathNode_30, "multiEventPathNode_30");
    auditor.nodeRegistered(multiEventPathNode_31, "multiEventPathNode_31");
    auditor.nodeRegistered(multiEventPathNode_32, "multiEventPathNode_32");
    auditor.nodeRegistered(multiEventPathNode_33, "multiEventPathNode_33");
    auditor.nodeRegistered(multiEventPathNode_34, "multiEventPathNode_34");
    auditor.nodeRegistered(multiEventPathNode_35, "multiEventPathNode_35");
    auditor.nodeRegistered(multiEventPathNode_36, "multiEventPathNode_36");
    auditor.nodeRegistered(multiEventPathNode_37, "multiEventPathNode_37");
    auditor.nodeRegistered(multiEventPathNode_38, "multiEventPathNode_38");
    auditor.nodeRegistered(multiEventPathNode_39, "multiEventPathNode_39");
    auditor.nodeRegistered(multiEventPathNode_40, "multiEventPathNode_40");
    auditor.nodeRegistered(multiEventPathNode_41, "multiEventPathNode_41");
    auditor.nodeRegistered(multiEventPathNode_42, "multiEventPathNode_42");
    auditor.nodeRegistered(multiEventPathNode_43, "multiEventPathNode_43");
    auditor.nodeRegistered(multiEventPathNode_44, "multiEventPathNode_44");
    auditor.nodeRegistered(multiEventPathNode_45, "multiEventPathNode_45");
    auditor.nodeRegistered(multiEventPathNode_46, "multiEventPathNode_46");
    auditor.nodeRegistered(multiEventPathNode_47, "multiEventPathNode_47");
    auditor.nodeRegistered(multiEventPathNode_48, "multiEventPathNode_48");
    auditor.nodeRegistered(multiEventPathNode_49, "multiEventPathNode_49");
    auditor.nodeRegistered(multiEventPathNode_50, "multiEventPathNode_50");
    auditor.nodeRegistered(multiEventPathNode_51, "multiEventPathNode_51");
    auditor.nodeRegistered(multiEventPathNode_52, "multiEventPathNode_52");
    auditor.nodeRegistered(multiEventPathNode_53, "multiEventPathNode_53");
    auditor.nodeRegistered(multiEventPathNode_54, "multiEventPathNode_54");
    auditor.nodeRegistered(multiEventPathNode_55, "multiEventPathNode_55");
    auditor.nodeRegistered(multiEventPathNode_56, "multiEventPathNode_56");
    auditor.nodeRegistered(multiEventPathNode_57, "multiEventPathNode_57");
    auditor.nodeRegistered(multiEventPathNode_58, "multiEventPathNode_58");
    auditor.nodeRegistered(multiEventPathNode_59, "multiEventPathNode_59");
    auditor.nodeRegistered(multiEventPathNode_60, "multiEventPathNode_60");
    auditor.nodeRegistered(multiEventPathNode_61, "multiEventPathNode_61");
    auditor.nodeRegistered(multiEventPathNode_62, "multiEventPathNode_62");
    auditor.nodeRegistered(multiEventPathNode_63, "multiEventPathNode_63");
    auditor.nodeRegistered(multiEventPathNode_64, "multiEventPathNode_64");
    auditor.nodeRegistered(multiEventPathNode_65, "multiEventPathNode_65");
    auditor.nodeRegistered(multiEventPathNode_66, "multiEventPathNode_66");
    auditor.nodeRegistered(multiEventPathNode_67, "multiEventPathNode_67");
    auditor.nodeRegistered(multiEventPathNode_68, "multiEventPathNode_68");
    auditor.nodeRegistered(multiEventPathNode_69, "multiEventPathNode_69");
    auditor.nodeRegistered(multiEventPathNode_70, "multiEventPathNode_70");
    auditor.nodeRegistered(multiEventPathNode_71, "multiEventPathNode_71");
    auditor.nodeRegistered(multiEventPathNode_72, "multiEventPathNode_72");
    auditor.nodeRegistered(multiEventPathNode_73, "multiEventPathNode_73");
    auditor.nodeRegistered(multiEventPathNode_74, "multiEventPathNode_74");
    auditor.nodeRegistered(multiEventPathNode_75, "multiEventPathNode_75");
    auditor.nodeRegistered(multiEventPathNode_76, "multiEventPathNode_76");
    auditor.nodeRegistered(multiEventPathNode_77, "multiEventPathNode_77");
    auditor.nodeRegistered(multiEventPathNode_78, "multiEventPathNode_78");
    auditor.nodeRegistered(multiEventPathNode_79, "multiEventPathNode_79");
    auditor.nodeRegistered(multiEventPathNode_80, "multiEventPathNode_80");
    auditor.nodeRegistered(multiEventPathNode_81, "multiEventPathNode_81");
    auditor.nodeRegistered(multiEventPathNode_82, "multiEventPathNode_82");
    auditor.nodeRegistered(multiEventPathNode_83, "multiEventPathNode_83");
    auditor.nodeRegistered(multiEventPathNode_84, "multiEventPathNode_84");
    auditor.nodeRegistered(multiEventPathNode_85, "multiEventPathNode_85");
    auditor.nodeRegistered(multiEventPathNode_86, "multiEventPathNode_86");
    auditor.nodeRegistered(multiEventPathNode_87, "multiEventPathNode_87");
    auditor.nodeRegistered(multiEventPathNode_88, "multiEventPathNode_88");
    auditor.nodeRegistered(multiEventPathNode_89, "multiEventPathNode_89");
    auditor.nodeRegistered(multiEventPathNode_90, "multiEventPathNode_90");
    auditor.nodeRegistered(multiEventPathNode_91, "multiEventPathNode_91");
    auditor.nodeRegistered(multiEventPathNode_92, "multiEventPathNode_92");
    auditor.nodeRegistered(multiEventPathNode_93, "multiEventPathNode_93");
    auditor.nodeRegistered(multiEventPathNode_94, "multiEventPathNode_94");
    auditor.nodeRegistered(multiEventPathNode_95, "multiEventPathNode_95");
    auditor.nodeRegistered(multiEventPathNode_96, "multiEventPathNode_96");
    auditor.nodeRegistered(multiEventPathNode_97, "multiEventPathNode_97");
    auditor.nodeRegistered(multiEventPathNode_98, "multiEventPathNode_98");
    auditor.nodeRegistered(multiEventPathNode_99, "multiEventPathNode_99");
    auditor.nodeRegistered(multiEventPathNode_100, "multiEventPathNode_100");
    auditor.nodeRegistered(sink, "sink");
    auditor.nodeRegistered(multiEventPathRootNode_101, "multiEventPathRootNode_101");
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
    isDirty_multiEventPathNode_1 = false;
    isDirty_multiEventPathNode_2 = false;
    isDirty_multiEventPathNode_3 = false;
    isDirty_multiEventPathNode_4 = false;
    isDirty_multiEventPathNode_5 = false;
    isDirty_multiEventPathNode_6 = false;
    isDirty_multiEventPathNode_7 = false;
    isDirty_multiEventPathNode_8 = false;
    isDirty_multiEventPathNode_9 = false;
    isDirty_multiEventPathNode_10 = false;
    isDirty_multiEventPathNode_11 = false;
    isDirty_multiEventPathNode_12 = false;
    isDirty_multiEventPathNode_13 = false;
    isDirty_multiEventPathNode_14 = false;
    isDirty_multiEventPathNode_15 = false;
    isDirty_multiEventPathNode_16 = false;
    isDirty_multiEventPathNode_17 = false;
    isDirty_multiEventPathNode_18 = false;
    isDirty_multiEventPathNode_19 = false;
    isDirty_multiEventPathNode_20 = false;
    isDirty_multiEventPathNode_21 = false;
    isDirty_multiEventPathNode_22 = false;
    isDirty_multiEventPathNode_23 = false;
    isDirty_multiEventPathNode_24 = false;
    isDirty_multiEventPathNode_25 = false;
    isDirty_multiEventPathNode_26 = false;
    isDirty_multiEventPathNode_27 = false;
    isDirty_multiEventPathNode_28 = false;
    isDirty_multiEventPathNode_29 = false;
    isDirty_multiEventPathNode_30 = false;
    isDirty_multiEventPathNode_31 = false;
    isDirty_multiEventPathNode_32 = false;
    isDirty_multiEventPathNode_33 = false;
    isDirty_multiEventPathNode_34 = false;
    isDirty_multiEventPathNode_35 = false;
    isDirty_multiEventPathNode_36 = false;
    isDirty_multiEventPathNode_37 = false;
    isDirty_multiEventPathNode_38 = false;
    isDirty_multiEventPathNode_39 = false;
    isDirty_multiEventPathNode_40 = false;
    isDirty_multiEventPathNode_41 = false;
    isDirty_multiEventPathNode_42 = false;
    isDirty_multiEventPathNode_43 = false;
    isDirty_multiEventPathNode_44 = false;
    isDirty_multiEventPathNode_45 = false;
    isDirty_multiEventPathNode_46 = false;
    isDirty_multiEventPathNode_47 = false;
    isDirty_multiEventPathNode_48 = false;
    isDirty_multiEventPathNode_49 = false;
    isDirty_multiEventPathNode_50 = false;
    isDirty_multiEventPathNode_51 = false;
    isDirty_multiEventPathNode_52 = false;
    isDirty_multiEventPathNode_53 = false;
    isDirty_multiEventPathNode_54 = false;
    isDirty_multiEventPathNode_55 = false;
    isDirty_multiEventPathNode_56 = false;
    isDirty_multiEventPathNode_57 = false;
    isDirty_multiEventPathNode_58 = false;
    isDirty_multiEventPathNode_59 = false;
    isDirty_multiEventPathNode_60 = false;
    isDirty_multiEventPathNode_61 = false;
    isDirty_multiEventPathNode_62 = false;
    isDirty_multiEventPathNode_63 = false;
    isDirty_multiEventPathNode_64 = false;
    isDirty_multiEventPathNode_65 = false;
    isDirty_multiEventPathNode_66 = false;
    isDirty_multiEventPathNode_67 = false;
    isDirty_multiEventPathNode_68 = false;
    isDirty_multiEventPathNode_69 = false;
    isDirty_multiEventPathNode_70 = false;
    isDirty_multiEventPathNode_71 = false;
    isDirty_multiEventPathNode_72 = false;
    isDirty_multiEventPathNode_73 = false;
    isDirty_multiEventPathNode_74 = false;
    isDirty_multiEventPathNode_75 = false;
    isDirty_multiEventPathNode_76 = false;
    isDirty_multiEventPathNode_77 = false;
    isDirty_multiEventPathNode_78 = false;
    isDirty_multiEventPathNode_79 = false;
    isDirty_multiEventPathNode_80 = false;
    isDirty_multiEventPathNode_81 = false;
    isDirty_multiEventPathNode_82 = false;
    isDirty_multiEventPathNode_83 = false;
    isDirty_multiEventPathNode_84 = false;
    isDirty_multiEventPathNode_85 = false;
    isDirty_multiEventPathNode_86 = false;
    isDirty_multiEventPathNode_87 = false;
    isDirty_multiEventPathNode_88 = false;
    isDirty_multiEventPathNode_89 = false;
    isDirty_multiEventPathNode_90 = false;
    isDirty_multiEventPathNode_91 = false;
    isDirty_multiEventPathNode_92 = false;
    isDirty_multiEventPathNode_93 = false;
    isDirty_multiEventPathNode_94 = false;
    isDirty_multiEventPathNode_95 = false;
    isDirty_multiEventPathNode_96 = false;
    isDirty_multiEventPathNode_97 = false;
    isDirty_multiEventPathNode_98 = false;
    isDirty_multiEventPathNode_99 = false;
    isDirty_multiEventPathNode_100 = false;
    isDirty_multiEventPathRootNode_101 = false;
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
      dirtyFlagSupplierMap.put(multiEventPathNode_1, () -> isDirty_multiEventPathNode_1);
      dirtyFlagSupplierMap.put(multiEventPathNode_10, () -> isDirty_multiEventPathNode_10);
      dirtyFlagSupplierMap.put(multiEventPathNode_100, () -> isDirty_multiEventPathNode_100);
      dirtyFlagSupplierMap.put(multiEventPathNode_11, () -> isDirty_multiEventPathNode_11);
      dirtyFlagSupplierMap.put(multiEventPathNode_12, () -> isDirty_multiEventPathNode_12);
      dirtyFlagSupplierMap.put(multiEventPathNode_13, () -> isDirty_multiEventPathNode_13);
      dirtyFlagSupplierMap.put(multiEventPathNode_14, () -> isDirty_multiEventPathNode_14);
      dirtyFlagSupplierMap.put(multiEventPathNode_15, () -> isDirty_multiEventPathNode_15);
      dirtyFlagSupplierMap.put(multiEventPathNode_16, () -> isDirty_multiEventPathNode_16);
      dirtyFlagSupplierMap.put(multiEventPathNode_17, () -> isDirty_multiEventPathNode_17);
      dirtyFlagSupplierMap.put(multiEventPathNode_18, () -> isDirty_multiEventPathNode_18);
      dirtyFlagSupplierMap.put(multiEventPathNode_19, () -> isDirty_multiEventPathNode_19);
      dirtyFlagSupplierMap.put(multiEventPathNode_2, () -> isDirty_multiEventPathNode_2);
      dirtyFlagSupplierMap.put(multiEventPathNode_20, () -> isDirty_multiEventPathNode_20);
      dirtyFlagSupplierMap.put(multiEventPathNode_21, () -> isDirty_multiEventPathNode_21);
      dirtyFlagSupplierMap.put(multiEventPathNode_22, () -> isDirty_multiEventPathNode_22);
      dirtyFlagSupplierMap.put(multiEventPathNode_23, () -> isDirty_multiEventPathNode_23);
      dirtyFlagSupplierMap.put(multiEventPathNode_24, () -> isDirty_multiEventPathNode_24);
      dirtyFlagSupplierMap.put(multiEventPathNode_25, () -> isDirty_multiEventPathNode_25);
      dirtyFlagSupplierMap.put(multiEventPathNode_26, () -> isDirty_multiEventPathNode_26);
      dirtyFlagSupplierMap.put(multiEventPathNode_27, () -> isDirty_multiEventPathNode_27);
      dirtyFlagSupplierMap.put(multiEventPathNode_28, () -> isDirty_multiEventPathNode_28);
      dirtyFlagSupplierMap.put(multiEventPathNode_29, () -> isDirty_multiEventPathNode_29);
      dirtyFlagSupplierMap.put(multiEventPathNode_3, () -> isDirty_multiEventPathNode_3);
      dirtyFlagSupplierMap.put(multiEventPathNode_30, () -> isDirty_multiEventPathNode_30);
      dirtyFlagSupplierMap.put(multiEventPathNode_31, () -> isDirty_multiEventPathNode_31);
      dirtyFlagSupplierMap.put(multiEventPathNode_32, () -> isDirty_multiEventPathNode_32);
      dirtyFlagSupplierMap.put(multiEventPathNode_33, () -> isDirty_multiEventPathNode_33);
      dirtyFlagSupplierMap.put(multiEventPathNode_34, () -> isDirty_multiEventPathNode_34);
      dirtyFlagSupplierMap.put(multiEventPathNode_35, () -> isDirty_multiEventPathNode_35);
      dirtyFlagSupplierMap.put(multiEventPathNode_36, () -> isDirty_multiEventPathNode_36);
      dirtyFlagSupplierMap.put(multiEventPathNode_37, () -> isDirty_multiEventPathNode_37);
      dirtyFlagSupplierMap.put(multiEventPathNode_38, () -> isDirty_multiEventPathNode_38);
      dirtyFlagSupplierMap.put(multiEventPathNode_39, () -> isDirty_multiEventPathNode_39);
      dirtyFlagSupplierMap.put(multiEventPathNode_4, () -> isDirty_multiEventPathNode_4);
      dirtyFlagSupplierMap.put(multiEventPathNode_40, () -> isDirty_multiEventPathNode_40);
      dirtyFlagSupplierMap.put(multiEventPathNode_41, () -> isDirty_multiEventPathNode_41);
      dirtyFlagSupplierMap.put(multiEventPathNode_42, () -> isDirty_multiEventPathNode_42);
      dirtyFlagSupplierMap.put(multiEventPathNode_43, () -> isDirty_multiEventPathNode_43);
      dirtyFlagSupplierMap.put(multiEventPathNode_44, () -> isDirty_multiEventPathNode_44);
      dirtyFlagSupplierMap.put(multiEventPathNode_45, () -> isDirty_multiEventPathNode_45);
      dirtyFlagSupplierMap.put(multiEventPathNode_46, () -> isDirty_multiEventPathNode_46);
      dirtyFlagSupplierMap.put(multiEventPathNode_47, () -> isDirty_multiEventPathNode_47);
      dirtyFlagSupplierMap.put(multiEventPathNode_48, () -> isDirty_multiEventPathNode_48);
      dirtyFlagSupplierMap.put(multiEventPathNode_49, () -> isDirty_multiEventPathNode_49);
      dirtyFlagSupplierMap.put(multiEventPathNode_5, () -> isDirty_multiEventPathNode_5);
      dirtyFlagSupplierMap.put(multiEventPathNode_50, () -> isDirty_multiEventPathNode_50);
      dirtyFlagSupplierMap.put(multiEventPathNode_51, () -> isDirty_multiEventPathNode_51);
      dirtyFlagSupplierMap.put(multiEventPathNode_52, () -> isDirty_multiEventPathNode_52);
      dirtyFlagSupplierMap.put(multiEventPathNode_53, () -> isDirty_multiEventPathNode_53);
      dirtyFlagSupplierMap.put(multiEventPathNode_54, () -> isDirty_multiEventPathNode_54);
      dirtyFlagSupplierMap.put(multiEventPathNode_55, () -> isDirty_multiEventPathNode_55);
      dirtyFlagSupplierMap.put(multiEventPathNode_56, () -> isDirty_multiEventPathNode_56);
      dirtyFlagSupplierMap.put(multiEventPathNode_57, () -> isDirty_multiEventPathNode_57);
      dirtyFlagSupplierMap.put(multiEventPathNode_58, () -> isDirty_multiEventPathNode_58);
      dirtyFlagSupplierMap.put(multiEventPathNode_59, () -> isDirty_multiEventPathNode_59);
      dirtyFlagSupplierMap.put(multiEventPathNode_6, () -> isDirty_multiEventPathNode_6);
      dirtyFlagSupplierMap.put(multiEventPathNode_60, () -> isDirty_multiEventPathNode_60);
      dirtyFlagSupplierMap.put(multiEventPathNode_61, () -> isDirty_multiEventPathNode_61);
      dirtyFlagSupplierMap.put(multiEventPathNode_62, () -> isDirty_multiEventPathNode_62);
      dirtyFlagSupplierMap.put(multiEventPathNode_63, () -> isDirty_multiEventPathNode_63);
      dirtyFlagSupplierMap.put(multiEventPathNode_64, () -> isDirty_multiEventPathNode_64);
      dirtyFlagSupplierMap.put(multiEventPathNode_65, () -> isDirty_multiEventPathNode_65);
      dirtyFlagSupplierMap.put(multiEventPathNode_66, () -> isDirty_multiEventPathNode_66);
      dirtyFlagSupplierMap.put(multiEventPathNode_67, () -> isDirty_multiEventPathNode_67);
      dirtyFlagSupplierMap.put(multiEventPathNode_68, () -> isDirty_multiEventPathNode_68);
      dirtyFlagSupplierMap.put(multiEventPathNode_69, () -> isDirty_multiEventPathNode_69);
      dirtyFlagSupplierMap.put(multiEventPathNode_7, () -> isDirty_multiEventPathNode_7);
      dirtyFlagSupplierMap.put(multiEventPathNode_70, () -> isDirty_multiEventPathNode_70);
      dirtyFlagSupplierMap.put(multiEventPathNode_71, () -> isDirty_multiEventPathNode_71);
      dirtyFlagSupplierMap.put(multiEventPathNode_72, () -> isDirty_multiEventPathNode_72);
      dirtyFlagSupplierMap.put(multiEventPathNode_73, () -> isDirty_multiEventPathNode_73);
      dirtyFlagSupplierMap.put(multiEventPathNode_74, () -> isDirty_multiEventPathNode_74);
      dirtyFlagSupplierMap.put(multiEventPathNode_75, () -> isDirty_multiEventPathNode_75);
      dirtyFlagSupplierMap.put(multiEventPathNode_76, () -> isDirty_multiEventPathNode_76);
      dirtyFlagSupplierMap.put(multiEventPathNode_77, () -> isDirty_multiEventPathNode_77);
      dirtyFlagSupplierMap.put(multiEventPathNode_78, () -> isDirty_multiEventPathNode_78);
      dirtyFlagSupplierMap.put(multiEventPathNode_79, () -> isDirty_multiEventPathNode_79);
      dirtyFlagSupplierMap.put(multiEventPathNode_8, () -> isDirty_multiEventPathNode_8);
      dirtyFlagSupplierMap.put(multiEventPathNode_80, () -> isDirty_multiEventPathNode_80);
      dirtyFlagSupplierMap.put(multiEventPathNode_81, () -> isDirty_multiEventPathNode_81);
      dirtyFlagSupplierMap.put(multiEventPathNode_82, () -> isDirty_multiEventPathNode_82);
      dirtyFlagSupplierMap.put(multiEventPathNode_83, () -> isDirty_multiEventPathNode_83);
      dirtyFlagSupplierMap.put(multiEventPathNode_84, () -> isDirty_multiEventPathNode_84);
      dirtyFlagSupplierMap.put(multiEventPathNode_85, () -> isDirty_multiEventPathNode_85);
      dirtyFlagSupplierMap.put(multiEventPathNode_86, () -> isDirty_multiEventPathNode_86);
      dirtyFlagSupplierMap.put(multiEventPathNode_87, () -> isDirty_multiEventPathNode_87);
      dirtyFlagSupplierMap.put(multiEventPathNode_88, () -> isDirty_multiEventPathNode_88);
      dirtyFlagSupplierMap.put(multiEventPathNode_89, () -> isDirty_multiEventPathNode_89);
      dirtyFlagSupplierMap.put(multiEventPathNode_9, () -> isDirty_multiEventPathNode_9);
      dirtyFlagSupplierMap.put(multiEventPathNode_90, () -> isDirty_multiEventPathNode_90);
      dirtyFlagSupplierMap.put(multiEventPathNode_91, () -> isDirty_multiEventPathNode_91);
      dirtyFlagSupplierMap.put(multiEventPathNode_92, () -> isDirty_multiEventPathNode_92);
      dirtyFlagSupplierMap.put(multiEventPathNode_93, () -> isDirty_multiEventPathNode_93);
      dirtyFlagSupplierMap.put(multiEventPathNode_94, () -> isDirty_multiEventPathNode_94);
      dirtyFlagSupplierMap.put(multiEventPathNode_95, () -> isDirty_multiEventPathNode_95);
      dirtyFlagSupplierMap.put(multiEventPathNode_96, () -> isDirty_multiEventPathNode_96);
      dirtyFlagSupplierMap.put(multiEventPathNode_97, () -> isDirty_multiEventPathNode_97);
      dirtyFlagSupplierMap.put(multiEventPathNode_98, () -> isDirty_multiEventPathNode_98);
      dirtyFlagSupplierMap.put(multiEventPathNode_99, () -> isDirty_multiEventPathNode_99);
      dirtyFlagSupplierMap.put(
          multiEventPathRootNode_101, () -> isDirty_multiEventPathRootNode_101);
    }
    return dirtyFlagSupplierMap.getOrDefault(node, DataFlow.ALWAYS_FALSE);
  }

  @Override
  public void setDirty(Object node, boolean dirtyFlag) {
    if (dirtyFlagUpdateMap.isEmpty()) {
      dirtyFlagUpdateMap.put(multiEventPathNode_1, (b) -> isDirty_multiEventPathNode_1 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_10, (b) -> isDirty_multiEventPathNode_10 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_100, (b) -> isDirty_multiEventPathNode_100 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_11, (b) -> isDirty_multiEventPathNode_11 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_12, (b) -> isDirty_multiEventPathNode_12 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_13, (b) -> isDirty_multiEventPathNode_13 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_14, (b) -> isDirty_multiEventPathNode_14 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_15, (b) -> isDirty_multiEventPathNode_15 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_16, (b) -> isDirty_multiEventPathNode_16 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_17, (b) -> isDirty_multiEventPathNode_17 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_18, (b) -> isDirty_multiEventPathNode_18 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_19, (b) -> isDirty_multiEventPathNode_19 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_2, (b) -> isDirty_multiEventPathNode_2 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_20, (b) -> isDirty_multiEventPathNode_20 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_21, (b) -> isDirty_multiEventPathNode_21 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_22, (b) -> isDirty_multiEventPathNode_22 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_23, (b) -> isDirty_multiEventPathNode_23 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_24, (b) -> isDirty_multiEventPathNode_24 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_25, (b) -> isDirty_multiEventPathNode_25 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_26, (b) -> isDirty_multiEventPathNode_26 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_27, (b) -> isDirty_multiEventPathNode_27 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_28, (b) -> isDirty_multiEventPathNode_28 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_29, (b) -> isDirty_multiEventPathNode_29 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_3, (b) -> isDirty_multiEventPathNode_3 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_30, (b) -> isDirty_multiEventPathNode_30 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_31, (b) -> isDirty_multiEventPathNode_31 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_32, (b) -> isDirty_multiEventPathNode_32 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_33, (b) -> isDirty_multiEventPathNode_33 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_34, (b) -> isDirty_multiEventPathNode_34 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_35, (b) -> isDirty_multiEventPathNode_35 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_36, (b) -> isDirty_multiEventPathNode_36 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_37, (b) -> isDirty_multiEventPathNode_37 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_38, (b) -> isDirty_multiEventPathNode_38 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_39, (b) -> isDirty_multiEventPathNode_39 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_4, (b) -> isDirty_multiEventPathNode_4 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_40, (b) -> isDirty_multiEventPathNode_40 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_41, (b) -> isDirty_multiEventPathNode_41 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_42, (b) -> isDirty_multiEventPathNode_42 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_43, (b) -> isDirty_multiEventPathNode_43 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_44, (b) -> isDirty_multiEventPathNode_44 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_45, (b) -> isDirty_multiEventPathNode_45 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_46, (b) -> isDirty_multiEventPathNode_46 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_47, (b) -> isDirty_multiEventPathNode_47 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_48, (b) -> isDirty_multiEventPathNode_48 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_49, (b) -> isDirty_multiEventPathNode_49 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_5, (b) -> isDirty_multiEventPathNode_5 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_50, (b) -> isDirty_multiEventPathNode_50 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_51, (b) -> isDirty_multiEventPathNode_51 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_52, (b) -> isDirty_multiEventPathNode_52 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_53, (b) -> isDirty_multiEventPathNode_53 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_54, (b) -> isDirty_multiEventPathNode_54 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_55, (b) -> isDirty_multiEventPathNode_55 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_56, (b) -> isDirty_multiEventPathNode_56 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_57, (b) -> isDirty_multiEventPathNode_57 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_58, (b) -> isDirty_multiEventPathNode_58 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_59, (b) -> isDirty_multiEventPathNode_59 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_6, (b) -> isDirty_multiEventPathNode_6 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_60, (b) -> isDirty_multiEventPathNode_60 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_61, (b) -> isDirty_multiEventPathNode_61 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_62, (b) -> isDirty_multiEventPathNode_62 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_63, (b) -> isDirty_multiEventPathNode_63 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_64, (b) -> isDirty_multiEventPathNode_64 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_65, (b) -> isDirty_multiEventPathNode_65 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_66, (b) -> isDirty_multiEventPathNode_66 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_67, (b) -> isDirty_multiEventPathNode_67 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_68, (b) -> isDirty_multiEventPathNode_68 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_69, (b) -> isDirty_multiEventPathNode_69 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_7, (b) -> isDirty_multiEventPathNode_7 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_70, (b) -> isDirty_multiEventPathNode_70 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_71, (b) -> isDirty_multiEventPathNode_71 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_72, (b) -> isDirty_multiEventPathNode_72 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_73, (b) -> isDirty_multiEventPathNode_73 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_74, (b) -> isDirty_multiEventPathNode_74 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_75, (b) -> isDirty_multiEventPathNode_75 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_76, (b) -> isDirty_multiEventPathNode_76 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_77, (b) -> isDirty_multiEventPathNode_77 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_78, (b) -> isDirty_multiEventPathNode_78 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_79, (b) -> isDirty_multiEventPathNode_79 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_8, (b) -> isDirty_multiEventPathNode_8 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_80, (b) -> isDirty_multiEventPathNode_80 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_81, (b) -> isDirty_multiEventPathNode_81 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_82, (b) -> isDirty_multiEventPathNode_82 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_83, (b) -> isDirty_multiEventPathNode_83 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_84, (b) -> isDirty_multiEventPathNode_84 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_85, (b) -> isDirty_multiEventPathNode_85 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_86, (b) -> isDirty_multiEventPathNode_86 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_87, (b) -> isDirty_multiEventPathNode_87 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_88, (b) -> isDirty_multiEventPathNode_88 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_89, (b) -> isDirty_multiEventPathNode_89 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_9, (b) -> isDirty_multiEventPathNode_9 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_90, (b) -> isDirty_multiEventPathNode_90 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_91, (b) -> isDirty_multiEventPathNode_91 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_92, (b) -> isDirty_multiEventPathNode_92 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_93, (b) -> isDirty_multiEventPathNode_93 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_94, (b) -> isDirty_multiEventPathNode_94 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_95, (b) -> isDirty_multiEventPathNode_95 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_96, (b) -> isDirty_multiEventPathNode_96 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_97, (b) -> isDirty_multiEventPathNode_97 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_98, (b) -> isDirty_multiEventPathNode_98 = b);
      dirtyFlagUpdateMap.put(multiEventPathNode_99, (b) -> isDirty_multiEventPathNode_99 = b);
      dirtyFlagUpdateMap.put(
          multiEventPathRootNode_101, (b) -> isDirty_multiEventPathRootNode_101 = b);
    }
    dirtyFlagUpdateMap.get(node).accept(dirtyFlag);
  }

  private boolean guardCheck_multiEventPathNode_1() {
    return isDirty_multiEventPathNode_2;
  }

  private boolean guardCheck_multiEventPathNode_2() {
    return isDirty_multiEventPathNode_3;
  }

  private boolean guardCheck_multiEventPathNode_3() {
    return isDirty_multiEventPathNode_4;
  }

  private boolean guardCheck_multiEventPathNode_4() {
    return isDirty_multiEventPathNode_5;
  }

  private boolean guardCheck_multiEventPathNode_5() {
    return isDirty_multiEventPathNode_6;
  }

  private boolean guardCheck_multiEventPathNode_6() {
    return isDirty_multiEventPathNode_7;
  }

  private boolean guardCheck_multiEventPathNode_7() {
    return isDirty_multiEventPathNode_8;
  }

  private boolean guardCheck_multiEventPathNode_8() {
    return isDirty_multiEventPathNode_9;
  }

  private boolean guardCheck_multiEventPathNode_9() {
    return isDirty_multiEventPathNode_10;
  }

  private boolean guardCheck_multiEventPathNode_10() {
    return isDirty_multiEventPathNode_11;
  }

  private boolean guardCheck_multiEventPathNode_11() {
    return isDirty_multiEventPathNode_12;
  }

  private boolean guardCheck_multiEventPathNode_12() {
    return isDirty_multiEventPathNode_13;
  }

  private boolean guardCheck_multiEventPathNode_13() {
    return isDirty_multiEventPathNode_14;
  }

  private boolean guardCheck_multiEventPathNode_14() {
    return isDirty_multiEventPathNode_15;
  }

  private boolean guardCheck_multiEventPathNode_15() {
    return isDirty_multiEventPathNode_16;
  }

  private boolean guardCheck_multiEventPathNode_16() {
    return isDirty_multiEventPathNode_17;
  }

  private boolean guardCheck_multiEventPathNode_17() {
    return isDirty_multiEventPathNode_18;
  }

  private boolean guardCheck_multiEventPathNode_18() {
    return isDirty_multiEventPathNode_19;
  }

  private boolean guardCheck_multiEventPathNode_19() {
    return isDirty_multiEventPathNode_20;
  }

  private boolean guardCheck_multiEventPathNode_20() {
    return isDirty_multiEventPathNode_21;
  }

  private boolean guardCheck_multiEventPathNode_21() {
    return isDirty_multiEventPathNode_22;
  }

  private boolean guardCheck_multiEventPathNode_22() {
    return isDirty_multiEventPathNode_23;
  }

  private boolean guardCheck_multiEventPathNode_23() {
    return isDirty_multiEventPathNode_24;
  }

  private boolean guardCheck_multiEventPathNode_24() {
    return isDirty_multiEventPathNode_25;
  }

  private boolean guardCheck_multiEventPathNode_25() {
    return isDirty_multiEventPathNode_26;
  }

  private boolean guardCheck_multiEventPathNode_26() {
    return isDirty_multiEventPathNode_27;
  }

  private boolean guardCheck_multiEventPathNode_27() {
    return isDirty_multiEventPathNode_28;
  }

  private boolean guardCheck_multiEventPathNode_28() {
    return isDirty_multiEventPathNode_29;
  }

  private boolean guardCheck_multiEventPathNode_29() {
    return isDirty_multiEventPathNode_30;
  }

  private boolean guardCheck_multiEventPathNode_30() {
    return isDirty_multiEventPathNode_31;
  }

  private boolean guardCheck_multiEventPathNode_31() {
    return isDirty_multiEventPathNode_32;
  }

  private boolean guardCheck_multiEventPathNode_32() {
    return isDirty_multiEventPathNode_33;
  }

  private boolean guardCheck_multiEventPathNode_33() {
    return isDirty_multiEventPathNode_34;
  }

  private boolean guardCheck_multiEventPathNode_34() {
    return isDirty_multiEventPathNode_35;
  }

  private boolean guardCheck_multiEventPathNode_35() {
    return isDirty_multiEventPathNode_36;
  }

  private boolean guardCheck_multiEventPathNode_36() {
    return isDirty_multiEventPathNode_37;
  }

  private boolean guardCheck_multiEventPathNode_37() {
    return isDirty_multiEventPathNode_38;
  }

  private boolean guardCheck_multiEventPathNode_38() {
    return isDirty_multiEventPathNode_39;
  }

  private boolean guardCheck_multiEventPathNode_39() {
    return isDirty_multiEventPathNode_40;
  }

  private boolean guardCheck_multiEventPathNode_40() {
    return isDirty_multiEventPathNode_41;
  }

  private boolean guardCheck_multiEventPathNode_41() {
    return isDirty_multiEventPathNode_42;
  }

  private boolean guardCheck_multiEventPathNode_42() {
    return isDirty_multiEventPathNode_43;
  }

  private boolean guardCheck_multiEventPathNode_43() {
    return isDirty_multiEventPathNode_44;
  }

  private boolean guardCheck_multiEventPathNode_44() {
    return isDirty_multiEventPathNode_45;
  }

  private boolean guardCheck_multiEventPathNode_45() {
    return isDirty_multiEventPathNode_46;
  }

  private boolean guardCheck_multiEventPathNode_46() {
    return isDirty_multiEventPathNode_47;
  }

  private boolean guardCheck_multiEventPathNode_47() {
    return isDirty_multiEventPathNode_48;
  }

  private boolean guardCheck_multiEventPathNode_48() {
    return isDirty_multiEventPathNode_49;
  }

  private boolean guardCheck_multiEventPathNode_49() {
    return isDirty_multiEventPathNode_50;
  }

  private boolean guardCheck_multiEventPathNode_50() {
    return isDirty_multiEventPathNode_51;
  }

  private boolean guardCheck_multiEventPathNode_51() {
    return isDirty_multiEventPathNode_52;
  }

  private boolean guardCheck_multiEventPathNode_52() {
    return isDirty_multiEventPathNode_53;
  }

  private boolean guardCheck_multiEventPathNode_53() {
    return isDirty_multiEventPathNode_54;
  }

  private boolean guardCheck_multiEventPathNode_54() {
    return isDirty_multiEventPathNode_55;
  }

  private boolean guardCheck_multiEventPathNode_55() {
    return isDirty_multiEventPathNode_56;
  }

  private boolean guardCheck_multiEventPathNode_56() {
    return isDirty_multiEventPathNode_57;
  }

  private boolean guardCheck_multiEventPathNode_57() {
    return isDirty_multiEventPathNode_58;
  }

  private boolean guardCheck_multiEventPathNode_58() {
    return isDirty_multiEventPathNode_59;
  }

  private boolean guardCheck_multiEventPathNode_59() {
    return isDirty_multiEventPathNode_60;
  }

  private boolean guardCheck_multiEventPathNode_60() {
    return isDirty_multiEventPathNode_61;
  }

  private boolean guardCheck_multiEventPathNode_61() {
    return isDirty_multiEventPathNode_62;
  }

  private boolean guardCheck_multiEventPathNode_62() {
    return isDirty_multiEventPathNode_63;
  }

  private boolean guardCheck_multiEventPathNode_63() {
    return isDirty_multiEventPathNode_64;
  }

  private boolean guardCheck_multiEventPathNode_64() {
    return isDirty_multiEventPathNode_65;
  }

  private boolean guardCheck_multiEventPathNode_65() {
    return isDirty_multiEventPathNode_66;
  }

  private boolean guardCheck_multiEventPathNode_66() {
    return isDirty_multiEventPathNode_67;
  }

  private boolean guardCheck_multiEventPathNode_67() {
    return isDirty_multiEventPathNode_68;
  }

  private boolean guardCheck_multiEventPathNode_68() {
    return isDirty_multiEventPathNode_69;
  }

  private boolean guardCheck_multiEventPathNode_69() {
    return isDirty_multiEventPathNode_70;
  }

  private boolean guardCheck_multiEventPathNode_70() {
    return isDirty_multiEventPathNode_71;
  }

  private boolean guardCheck_multiEventPathNode_71() {
    return isDirty_multiEventPathNode_72;
  }

  private boolean guardCheck_multiEventPathNode_72() {
    return isDirty_multiEventPathNode_73;
  }

  private boolean guardCheck_multiEventPathNode_73() {
    return isDirty_multiEventPathNode_74;
  }

  private boolean guardCheck_multiEventPathNode_74() {
    return isDirty_multiEventPathNode_75;
  }

  private boolean guardCheck_multiEventPathNode_75() {
    return isDirty_multiEventPathNode_76;
  }

  private boolean guardCheck_multiEventPathNode_76() {
    return isDirty_multiEventPathNode_77;
  }

  private boolean guardCheck_multiEventPathNode_77() {
    return isDirty_multiEventPathNode_78;
  }

  private boolean guardCheck_multiEventPathNode_78() {
    return isDirty_multiEventPathNode_79;
  }

  private boolean guardCheck_multiEventPathNode_79() {
    return isDirty_multiEventPathNode_80;
  }

  private boolean guardCheck_multiEventPathNode_80() {
    return isDirty_multiEventPathNode_81;
  }

  private boolean guardCheck_multiEventPathNode_81() {
    return isDirty_multiEventPathNode_82;
  }

  private boolean guardCheck_multiEventPathNode_82() {
    return isDirty_multiEventPathNode_83;
  }

  private boolean guardCheck_multiEventPathNode_83() {
    return isDirty_multiEventPathNode_84;
  }

  private boolean guardCheck_multiEventPathNode_84() {
    return isDirty_multiEventPathNode_85;
  }

  private boolean guardCheck_multiEventPathNode_85() {
    return isDirty_multiEventPathNode_86;
  }

  private boolean guardCheck_multiEventPathNode_86() {
    return isDirty_multiEventPathNode_87;
  }

  private boolean guardCheck_multiEventPathNode_87() {
    return isDirty_multiEventPathNode_88;
  }

  private boolean guardCheck_multiEventPathNode_88() {
    return isDirty_multiEventPathNode_89;
  }

  private boolean guardCheck_multiEventPathNode_89() {
    return isDirty_multiEventPathNode_90;
  }

  private boolean guardCheck_multiEventPathNode_90() {
    return isDirty_multiEventPathNode_91;
  }

  private boolean guardCheck_multiEventPathNode_91() {
    return isDirty_multiEventPathNode_92;
  }

  private boolean guardCheck_multiEventPathNode_92() {
    return isDirty_multiEventPathNode_93;
  }

  private boolean guardCheck_multiEventPathNode_93() {
    return isDirty_multiEventPathNode_94;
  }

  private boolean guardCheck_multiEventPathNode_94() {
    return isDirty_multiEventPathNode_95;
  }

  private boolean guardCheck_multiEventPathNode_95() {
    return isDirty_multiEventPathNode_96;
  }

  private boolean guardCheck_multiEventPathNode_96() {
    return isDirty_multiEventPathNode_97;
  }

  private boolean guardCheck_multiEventPathNode_97() {
    return isDirty_multiEventPathNode_98;
  }

  private boolean guardCheck_multiEventPathNode_98() {
    return isDirty_multiEventPathNode_99;
  }

  private boolean guardCheck_multiEventPathNode_99() {
    return isDirty_multiEventPathNode_100;
  }

  private boolean guardCheck_multiEventPathNode_100() {
    return isDirty_multiEventPathRootNode_101;
  }

  private boolean guardCheck_sink() {
    return isDirty_multiEventPathNode_1;
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
  public MultiEventPath100Processor newInstance() {
    return new MultiEventPath100Processor();
  }

  @Override
  public MultiEventPath100Processor newInstance(Map<Object, Object> contextMap) {
    return new MultiEventPath100Processor();
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
