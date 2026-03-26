/*
 * Copyright: © 2025.  Gregory Higgins <greg.higgins@v12technology.com> - All Rights Reserved
 * This source code is protected under international copyright law.  All rights
 * reserved and protected by the copyright holders.
 * This file is confidential and only available to authorized individuals with the
 * permission of the copyright holders.  If you encounter this file and do not have
 * permission, please contact the copyright holders and delete this file.
 */
package com.telamin.fluxtion.test.performance.generated.noop;

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
import com.telamin.fluxtion.test.performance.nodes.MarketDataRootNode;
import com.telamin.fluxtion.test.performance.nodes.NoOpNode;
import com.telamin.fluxtion.test.performance.nodes.NoOpPublisherNode;
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
public class NoopDispatch100Processor
    implements CloneableDataFlow<NoopDispatch100Processor>,
        /*--- @ExportService start ---*/
        @ExportService ServiceListener,
        /*--- @ExportService end ---*/
        DataFlow,
        InternalEventProcessor,
        BatchHandler {

  //Node declarations
  private final transient CallbackDispatcherImpl callbackDispatcher = new CallbackDispatcherImpl();
  public final transient Clock clock = new Clock();
  private final transient MarketDataRootNode marketDataRootNode_101 = new MarketDataRootNode();
  private final transient NoOpNode noOpNode_100 = new NoOpNode();
  private final transient NoOpNode noOpNode_99 = new NoOpNode();
  private final transient NoOpNode noOpNode_98 = new NoOpNode();
  private final transient NoOpNode noOpNode_97 = new NoOpNode();
  private final transient NoOpNode noOpNode_96 = new NoOpNode();
  private final transient NoOpNode noOpNode_95 = new NoOpNode();
  private final transient NoOpNode noOpNode_94 = new NoOpNode();
  private final transient NoOpNode noOpNode_93 = new NoOpNode();
  private final transient NoOpNode noOpNode_92 = new NoOpNode();
  private final transient NoOpNode noOpNode_91 = new NoOpNode();
  private final transient NoOpNode noOpNode_90 = new NoOpNode();
  private final transient NoOpNode noOpNode_89 = new NoOpNode();
  private final transient NoOpNode noOpNode_88 = new NoOpNode();
  private final transient NoOpNode noOpNode_87 = new NoOpNode();
  private final transient NoOpNode noOpNode_86 = new NoOpNode();
  private final transient NoOpNode noOpNode_85 = new NoOpNode();
  private final transient NoOpNode noOpNode_84 = new NoOpNode();
  private final transient NoOpNode noOpNode_83 = new NoOpNode();
  private final transient NoOpNode noOpNode_82 = new NoOpNode();
  private final transient NoOpNode noOpNode_81 = new NoOpNode();
  private final transient NoOpNode noOpNode_80 = new NoOpNode();
  private final transient NoOpNode noOpNode_79 = new NoOpNode();
  private final transient NoOpNode noOpNode_78 = new NoOpNode();
  private final transient NoOpNode noOpNode_77 = new NoOpNode();
  private final transient NoOpNode noOpNode_76 = new NoOpNode();
  private final transient NoOpNode noOpNode_75 = new NoOpNode();
  private final transient NoOpNode noOpNode_74 = new NoOpNode();
  private final transient NoOpNode noOpNode_73 = new NoOpNode();
  private final transient NoOpNode noOpNode_72 = new NoOpNode();
  private final transient NoOpNode noOpNode_71 = new NoOpNode();
  private final transient NoOpNode noOpNode_70 = new NoOpNode();
  private final transient NoOpNode noOpNode_69 = new NoOpNode();
  private final transient NoOpNode noOpNode_68 = new NoOpNode();
  private final transient NoOpNode noOpNode_67 = new NoOpNode();
  private final transient NoOpNode noOpNode_66 = new NoOpNode();
  private final transient NoOpNode noOpNode_65 = new NoOpNode();
  private final transient NoOpNode noOpNode_64 = new NoOpNode();
  private final transient NoOpNode noOpNode_63 = new NoOpNode();
  private final transient NoOpNode noOpNode_62 = new NoOpNode();
  private final transient NoOpNode noOpNode_61 = new NoOpNode();
  private final transient NoOpNode noOpNode_60 = new NoOpNode();
  private final transient NoOpNode noOpNode_59 = new NoOpNode();
  private final transient NoOpNode noOpNode_58 = new NoOpNode();
  private final transient NoOpNode noOpNode_57 = new NoOpNode();
  private final transient NoOpNode noOpNode_56 = new NoOpNode();
  private final transient NoOpNode noOpNode_55 = new NoOpNode();
  private final transient NoOpNode noOpNode_54 = new NoOpNode();
  private final transient NoOpNode noOpNode_53 = new NoOpNode();
  private final transient NoOpNode noOpNode_52 = new NoOpNode();
  private final transient NoOpNode noOpNode_51 = new NoOpNode();
  private final transient NoOpNode noOpNode_50 = new NoOpNode();
  private final transient NoOpNode noOpNode_49 = new NoOpNode();
  private final transient NoOpNode noOpNode_48 = new NoOpNode();
  private final transient NoOpNode noOpNode_47 = new NoOpNode();
  private final transient NoOpNode noOpNode_46 = new NoOpNode();
  private final transient NoOpNode noOpNode_45 = new NoOpNode();
  private final transient NoOpNode noOpNode_44 = new NoOpNode();
  private final transient NoOpNode noOpNode_43 = new NoOpNode();
  private final transient NoOpNode noOpNode_42 = new NoOpNode();
  private final transient NoOpNode noOpNode_41 = new NoOpNode();
  private final transient NoOpNode noOpNode_40 = new NoOpNode();
  private final transient NoOpNode noOpNode_39 = new NoOpNode();
  private final transient NoOpNode noOpNode_38 = new NoOpNode();
  private final transient NoOpNode noOpNode_37 = new NoOpNode();
  private final transient NoOpNode noOpNode_36 = new NoOpNode();
  private final transient NoOpNode noOpNode_35 = new NoOpNode();
  private final transient NoOpNode noOpNode_34 = new NoOpNode();
  private final transient NoOpNode noOpNode_33 = new NoOpNode();
  private final transient NoOpNode noOpNode_32 = new NoOpNode();
  private final transient NoOpNode noOpNode_31 = new NoOpNode();
  private final transient NoOpNode noOpNode_30 = new NoOpNode();
  private final transient NoOpNode noOpNode_29 = new NoOpNode();
  private final transient NoOpNode noOpNode_28 = new NoOpNode();
  private final transient NoOpNode noOpNode_27 = new NoOpNode();
  private final transient NoOpNode noOpNode_26 = new NoOpNode();
  private final transient NoOpNode noOpNode_25 = new NoOpNode();
  private final transient NoOpNode noOpNode_24 = new NoOpNode();
  private final transient NoOpNode noOpNode_23 = new NoOpNode();
  private final transient NoOpNode noOpNode_22 = new NoOpNode();
  private final transient NoOpNode noOpNode_21 = new NoOpNode();
  private final transient NoOpNode noOpNode_20 = new NoOpNode();
  private final transient NoOpNode noOpNode_19 = new NoOpNode();
  private final transient NoOpNode noOpNode_18 = new NoOpNode();
  private final transient NoOpNode noOpNode_17 = new NoOpNode();
  private final transient NoOpNode noOpNode_16 = new NoOpNode();
  private final transient NoOpNode noOpNode_15 = new NoOpNode();
  private final transient NoOpNode noOpNode_14 = new NoOpNode();
  private final transient NoOpNode noOpNode_13 = new NoOpNode();
  private final transient NoOpNode noOpNode_12 = new NoOpNode();
  private final transient NoOpNode noOpNode_11 = new NoOpNode();
  private final transient NoOpNode noOpNode_10 = new NoOpNode();
  private final transient NoOpNode noOpNode_9 = new NoOpNode();
  private final transient NoOpNode noOpNode_8 = new NoOpNode();
  private final transient NoOpNode noOpNode_7 = new NoOpNode();
  private final transient NoOpNode noOpNode_6 = new NoOpNode();
  private final transient NoOpNode noOpNode_5 = new NoOpNode();
  private final transient NoOpNode noOpNode_4 = new NoOpNode();
  private final transient NoOpNode noOpNode_3 = new NoOpNode();
  private final transient NoOpNode noOpNode_2 = new NoOpNode();
  private final transient NoOpNode noOpNode_1 = new NoOpNode();
  public final transient NodeNameAuditor nodeNameLookup = new NodeNameAuditor();
  public final transient NoOpPublisherNode sink = new NoOpPublisherNode();
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
      new IdentityHashMap<>(0);
  private final transient IdentityHashMap<Object, Consumer<Boolean>> dirtyFlagUpdateMap =
      new IdentityHashMap<>(0);

  //Forked declarations

  //Filter constants

  //unknown event handler
  private Consumer unKnownEventHandler = (e) -> {};

  public NoopDispatch100Processor(Map<Object, Object> contextMap) {
    if (context != null) {
      context.replaceMappings(contextMap);
    }
    context.setClock(clock);
    serviceRegistry.setDataFlowContext(context);
    marketDataRootNode_101.setNodeId("root");
    noOpNode_1.setNodeId("node_100");
    noOpNode_1.setUpstream1(noOpNode_2);
    noOpNode_2.setNodeId("node_99");
    noOpNode_2.setUpstream1(noOpNode_3);
    noOpNode_3.setNodeId("node_98");
    noOpNode_3.setUpstream1(noOpNode_4);
    noOpNode_4.setNodeId("node_97");
    noOpNode_4.setUpstream1(noOpNode_5);
    noOpNode_5.setNodeId("node_96");
    noOpNode_5.setUpstream1(noOpNode_6);
    noOpNode_6.setNodeId("node_95");
    noOpNode_6.setUpstream1(noOpNode_7);
    noOpNode_7.setNodeId("node_94");
    noOpNode_7.setUpstream1(noOpNode_8);
    noOpNode_8.setNodeId("node_93");
    noOpNode_8.setUpstream1(noOpNode_9);
    noOpNode_9.setNodeId("node_92");
    noOpNode_9.setUpstream1(noOpNode_10);
    noOpNode_10.setNodeId("node_91");
    noOpNode_10.setUpstream1(noOpNode_11);
    noOpNode_11.setNodeId("node_90");
    noOpNode_11.setUpstream1(noOpNode_12);
    noOpNode_12.setNodeId("node_89");
    noOpNode_12.setUpstream1(noOpNode_13);
    noOpNode_13.setNodeId("node_88");
    noOpNode_13.setUpstream1(noOpNode_14);
    noOpNode_14.setNodeId("node_87");
    noOpNode_14.setUpstream1(noOpNode_15);
    noOpNode_15.setNodeId("node_86");
    noOpNode_15.setUpstream1(noOpNode_16);
    noOpNode_16.setNodeId("node_85");
    noOpNode_16.setUpstream1(noOpNode_17);
    noOpNode_17.setNodeId("node_84");
    noOpNode_17.setUpstream1(noOpNode_18);
    noOpNode_18.setNodeId("node_83");
    noOpNode_18.setUpstream1(noOpNode_19);
    noOpNode_19.setNodeId("node_82");
    noOpNode_19.setUpstream1(noOpNode_20);
    noOpNode_20.setNodeId("node_81");
    noOpNode_20.setUpstream1(noOpNode_21);
    noOpNode_21.setNodeId("node_80");
    noOpNode_21.setUpstream1(noOpNode_22);
    noOpNode_22.setNodeId("node_79");
    noOpNode_22.setUpstream1(noOpNode_23);
    noOpNode_23.setNodeId("node_78");
    noOpNode_23.setUpstream1(noOpNode_24);
    noOpNode_24.setNodeId("node_77");
    noOpNode_24.setUpstream1(noOpNode_25);
    noOpNode_25.setNodeId("node_76");
    noOpNode_25.setUpstream1(noOpNode_26);
    noOpNode_26.setNodeId("node_75");
    noOpNode_26.setUpstream1(noOpNode_27);
    noOpNode_27.setNodeId("node_74");
    noOpNode_27.setUpstream1(noOpNode_28);
    noOpNode_28.setNodeId("node_73");
    noOpNode_28.setUpstream1(noOpNode_29);
    noOpNode_29.setNodeId("node_72");
    noOpNode_29.setUpstream1(noOpNode_30);
    noOpNode_30.setNodeId("node_71");
    noOpNode_30.setUpstream1(noOpNode_31);
    noOpNode_31.setNodeId("node_70");
    noOpNode_31.setUpstream1(noOpNode_32);
    noOpNode_32.setNodeId("node_69");
    noOpNode_32.setUpstream1(noOpNode_33);
    noOpNode_33.setNodeId("node_68");
    noOpNode_33.setUpstream1(noOpNode_34);
    noOpNode_34.setNodeId("node_67");
    noOpNode_34.setUpstream1(noOpNode_35);
    noOpNode_35.setNodeId("node_66");
    noOpNode_35.setUpstream1(noOpNode_36);
    noOpNode_36.setNodeId("node_65");
    noOpNode_36.setUpstream1(noOpNode_37);
    noOpNode_37.setNodeId("node_64");
    noOpNode_37.setUpstream1(noOpNode_38);
    noOpNode_38.setNodeId("node_63");
    noOpNode_38.setUpstream1(noOpNode_39);
    noOpNode_39.setNodeId("node_62");
    noOpNode_39.setUpstream1(noOpNode_40);
    noOpNode_40.setNodeId("node_61");
    noOpNode_40.setUpstream1(noOpNode_41);
    noOpNode_41.setNodeId("node_60");
    noOpNode_41.setUpstream1(noOpNode_42);
    noOpNode_42.setNodeId("node_59");
    noOpNode_42.setUpstream1(noOpNode_43);
    noOpNode_43.setNodeId("node_58");
    noOpNode_43.setUpstream1(noOpNode_44);
    noOpNode_44.setNodeId("node_57");
    noOpNode_44.setUpstream1(noOpNode_45);
    noOpNode_45.setNodeId("node_56");
    noOpNode_45.setUpstream1(noOpNode_46);
    noOpNode_46.setNodeId("node_55");
    noOpNode_46.setUpstream1(noOpNode_47);
    noOpNode_47.setNodeId("node_54");
    noOpNode_47.setUpstream1(noOpNode_48);
    noOpNode_48.setNodeId("node_53");
    noOpNode_48.setUpstream1(noOpNode_49);
    noOpNode_49.setNodeId("node_52");
    noOpNode_49.setUpstream1(noOpNode_50);
    noOpNode_50.setNodeId("node_51");
    noOpNode_50.setUpstream1(noOpNode_51);
    noOpNode_51.setNodeId("node_50");
    noOpNode_51.setUpstream1(noOpNode_52);
    noOpNode_52.setNodeId("node_49");
    noOpNode_52.setUpstream1(noOpNode_53);
    noOpNode_53.setNodeId("node_48");
    noOpNode_53.setUpstream1(noOpNode_54);
    noOpNode_54.setNodeId("node_47");
    noOpNode_54.setUpstream1(noOpNode_55);
    noOpNode_55.setNodeId("node_46");
    noOpNode_55.setUpstream1(noOpNode_56);
    noOpNode_56.setNodeId("node_45");
    noOpNode_56.setUpstream1(noOpNode_57);
    noOpNode_57.setNodeId("node_44");
    noOpNode_57.setUpstream1(noOpNode_58);
    noOpNode_58.setNodeId("node_43");
    noOpNode_58.setUpstream1(noOpNode_59);
    noOpNode_59.setNodeId("node_42");
    noOpNode_59.setUpstream1(noOpNode_60);
    noOpNode_60.setNodeId("node_41");
    noOpNode_60.setUpstream1(noOpNode_61);
    noOpNode_61.setNodeId("node_40");
    noOpNode_61.setUpstream1(noOpNode_62);
    noOpNode_62.setNodeId("node_39");
    noOpNode_62.setUpstream1(noOpNode_63);
    noOpNode_63.setNodeId("node_38");
    noOpNode_63.setUpstream1(noOpNode_64);
    noOpNode_64.setNodeId("node_37");
    noOpNode_64.setUpstream1(noOpNode_65);
    noOpNode_65.setNodeId("node_36");
    noOpNode_65.setUpstream1(noOpNode_66);
    noOpNode_66.setNodeId("node_35");
    noOpNode_66.setUpstream1(noOpNode_67);
    noOpNode_67.setNodeId("node_34");
    noOpNode_67.setUpstream1(noOpNode_68);
    noOpNode_68.setNodeId("node_33");
    noOpNode_68.setUpstream1(noOpNode_69);
    noOpNode_69.setNodeId("node_32");
    noOpNode_69.setUpstream1(noOpNode_70);
    noOpNode_70.setNodeId("node_31");
    noOpNode_70.setUpstream1(noOpNode_71);
    noOpNode_71.setNodeId("node_30");
    noOpNode_71.setUpstream1(noOpNode_72);
    noOpNode_72.setNodeId("node_29");
    noOpNode_72.setUpstream1(noOpNode_73);
    noOpNode_73.setNodeId("node_28");
    noOpNode_73.setUpstream1(noOpNode_74);
    noOpNode_74.setNodeId("node_27");
    noOpNode_74.setUpstream1(noOpNode_75);
    noOpNode_75.setNodeId("node_26");
    noOpNode_75.setUpstream1(noOpNode_76);
    noOpNode_76.setNodeId("node_25");
    noOpNode_76.setUpstream1(noOpNode_77);
    noOpNode_77.setNodeId("node_24");
    noOpNode_77.setUpstream1(noOpNode_78);
    noOpNode_78.setNodeId("node_23");
    noOpNode_78.setUpstream1(noOpNode_79);
    noOpNode_79.setNodeId("node_22");
    noOpNode_79.setUpstream1(noOpNode_80);
    noOpNode_80.setNodeId("node_21");
    noOpNode_80.setUpstream1(noOpNode_81);
    noOpNode_81.setNodeId("node_20");
    noOpNode_81.setUpstream1(noOpNode_82);
    noOpNode_82.setNodeId("node_19");
    noOpNode_82.setUpstream1(noOpNode_83);
    noOpNode_83.setNodeId("node_18");
    noOpNode_83.setUpstream1(noOpNode_84);
    noOpNode_84.setNodeId("node_17");
    noOpNode_84.setUpstream1(noOpNode_85);
    noOpNode_85.setNodeId("node_16");
    noOpNode_85.setUpstream1(noOpNode_86);
    noOpNode_86.setNodeId("node_15");
    noOpNode_86.setUpstream1(noOpNode_87);
    noOpNode_87.setNodeId("node_14");
    noOpNode_87.setUpstream1(noOpNode_88);
    noOpNode_88.setNodeId("node_13");
    noOpNode_88.setUpstream1(noOpNode_89);
    noOpNode_89.setNodeId("node_12");
    noOpNode_89.setUpstream1(noOpNode_90);
    noOpNode_90.setNodeId("node_11");
    noOpNode_90.setUpstream1(noOpNode_91);
    noOpNode_91.setNodeId("node_10");
    noOpNode_91.setUpstream1(noOpNode_92);
    noOpNode_92.setNodeId("node_9");
    noOpNode_92.setUpstream1(noOpNode_93);
    noOpNode_93.setNodeId("node_8");
    noOpNode_93.setUpstream1(noOpNode_94);
    noOpNode_94.setNodeId("node_7");
    noOpNode_94.setUpstream1(noOpNode_95);
    noOpNode_95.setNodeId("node_6");
    noOpNode_95.setUpstream1(noOpNode_96);
    noOpNode_96.setNodeId("node_5");
    noOpNode_96.setUpstream1(noOpNode_97);
    noOpNode_97.setNodeId("node_4");
    noOpNode_97.setUpstream1(noOpNode_98);
    noOpNode_98.setNodeId("node_3");
    noOpNode_98.setUpstream1(noOpNode_99);
    noOpNode_99.setNodeId("node_2");
    noOpNode_99.setUpstream1(noOpNode_100);
    noOpNode_100.setNodeId("node_1");
    noOpNode_100.setUpstream1(marketDataRootNode_101);
    sink.setNodeId("sink");
    sink.setUpstream1(noOpNode_1);
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

  public NoopDispatch100Processor() {
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
    marketDataRootNode_101.onMarketData(typedEvent);
    noOpNode_100.onUpstreamUpdate();
    noOpNode_99.onUpstreamUpdate();
    noOpNode_98.onUpstreamUpdate();
    noOpNode_97.onUpstreamUpdate();
    noOpNode_96.onUpstreamUpdate();
    noOpNode_95.onUpstreamUpdate();
    noOpNode_94.onUpstreamUpdate();
    noOpNode_93.onUpstreamUpdate();
    noOpNode_92.onUpstreamUpdate();
    noOpNode_91.onUpstreamUpdate();
    noOpNode_90.onUpstreamUpdate();
    noOpNode_89.onUpstreamUpdate();
    noOpNode_88.onUpstreamUpdate();
    noOpNode_87.onUpstreamUpdate();
    noOpNode_86.onUpstreamUpdate();
    noOpNode_85.onUpstreamUpdate();
    noOpNode_84.onUpstreamUpdate();
    noOpNode_83.onUpstreamUpdate();
    noOpNode_82.onUpstreamUpdate();
    noOpNode_81.onUpstreamUpdate();
    noOpNode_80.onUpstreamUpdate();
    noOpNode_79.onUpstreamUpdate();
    noOpNode_78.onUpstreamUpdate();
    noOpNode_77.onUpstreamUpdate();
    noOpNode_76.onUpstreamUpdate();
    noOpNode_75.onUpstreamUpdate();
    noOpNode_74.onUpstreamUpdate();
    noOpNode_73.onUpstreamUpdate();
    noOpNode_72.onUpstreamUpdate();
    noOpNode_71.onUpstreamUpdate();
    noOpNode_70.onUpstreamUpdate();
    noOpNode_69.onUpstreamUpdate();
    noOpNode_68.onUpstreamUpdate();
    noOpNode_67.onUpstreamUpdate();
    noOpNode_66.onUpstreamUpdate();
    noOpNode_65.onUpstreamUpdate();
    noOpNode_64.onUpstreamUpdate();
    noOpNode_63.onUpstreamUpdate();
    noOpNode_62.onUpstreamUpdate();
    noOpNode_61.onUpstreamUpdate();
    noOpNode_60.onUpstreamUpdate();
    noOpNode_59.onUpstreamUpdate();
    noOpNode_58.onUpstreamUpdate();
    noOpNode_57.onUpstreamUpdate();
    noOpNode_56.onUpstreamUpdate();
    noOpNode_55.onUpstreamUpdate();
    noOpNode_54.onUpstreamUpdate();
    noOpNode_53.onUpstreamUpdate();
    noOpNode_52.onUpstreamUpdate();
    noOpNode_51.onUpstreamUpdate();
    noOpNode_50.onUpstreamUpdate();
    noOpNode_49.onUpstreamUpdate();
    noOpNode_48.onUpstreamUpdate();
    noOpNode_47.onUpstreamUpdate();
    noOpNode_46.onUpstreamUpdate();
    noOpNode_45.onUpstreamUpdate();
    noOpNode_44.onUpstreamUpdate();
    noOpNode_43.onUpstreamUpdate();
    noOpNode_42.onUpstreamUpdate();
    noOpNode_41.onUpstreamUpdate();
    noOpNode_40.onUpstreamUpdate();
    noOpNode_39.onUpstreamUpdate();
    noOpNode_38.onUpstreamUpdate();
    noOpNode_37.onUpstreamUpdate();
    noOpNode_36.onUpstreamUpdate();
    noOpNode_35.onUpstreamUpdate();
    noOpNode_34.onUpstreamUpdate();
    noOpNode_33.onUpstreamUpdate();
    noOpNode_32.onUpstreamUpdate();
    noOpNode_31.onUpstreamUpdate();
    noOpNode_30.onUpstreamUpdate();
    noOpNode_29.onUpstreamUpdate();
    noOpNode_28.onUpstreamUpdate();
    noOpNode_27.onUpstreamUpdate();
    noOpNode_26.onUpstreamUpdate();
    noOpNode_25.onUpstreamUpdate();
    noOpNode_24.onUpstreamUpdate();
    noOpNode_23.onUpstreamUpdate();
    noOpNode_22.onUpstreamUpdate();
    noOpNode_21.onUpstreamUpdate();
    noOpNode_20.onUpstreamUpdate();
    noOpNode_19.onUpstreamUpdate();
    noOpNode_18.onUpstreamUpdate();
    noOpNode_17.onUpstreamUpdate();
    noOpNode_16.onUpstreamUpdate();
    noOpNode_15.onUpstreamUpdate();
    noOpNode_14.onUpstreamUpdate();
    noOpNode_13.onUpstreamUpdate();
    noOpNode_12.onUpstreamUpdate();
    noOpNode_11.onUpstreamUpdate();
    noOpNode_10.onUpstreamUpdate();
    noOpNode_9.onUpstreamUpdate();
    noOpNode_8.onUpstreamUpdate();
    noOpNode_7.onUpstreamUpdate();
    noOpNode_6.onUpstreamUpdate();
    noOpNode_5.onUpstreamUpdate();
    noOpNode_4.onUpstreamUpdate();
    noOpNode_3.onUpstreamUpdate();
    noOpNode_2.onUpstreamUpdate();
    noOpNode_1.onUpstreamUpdate();
    sink.onUpstreamUpdate();
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
      marketDataRootNode_101.onMarketData(typedEvent);
    }
  }

  public void triggerCalculation() {
    buffering = false;
    String typedEvent = "No event information - buffered dispatch";
    noOpNode_100.onUpstreamUpdate();
    noOpNode_99.onUpstreamUpdate();
    noOpNode_98.onUpstreamUpdate();
    noOpNode_97.onUpstreamUpdate();
    noOpNode_96.onUpstreamUpdate();
    noOpNode_95.onUpstreamUpdate();
    noOpNode_94.onUpstreamUpdate();
    noOpNode_93.onUpstreamUpdate();
    noOpNode_92.onUpstreamUpdate();
    noOpNode_91.onUpstreamUpdate();
    noOpNode_90.onUpstreamUpdate();
    noOpNode_89.onUpstreamUpdate();
    noOpNode_88.onUpstreamUpdate();
    noOpNode_87.onUpstreamUpdate();
    noOpNode_86.onUpstreamUpdate();
    noOpNode_85.onUpstreamUpdate();
    noOpNode_84.onUpstreamUpdate();
    noOpNode_83.onUpstreamUpdate();
    noOpNode_82.onUpstreamUpdate();
    noOpNode_81.onUpstreamUpdate();
    noOpNode_80.onUpstreamUpdate();
    noOpNode_79.onUpstreamUpdate();
    noOpNode_78.onUpstreamUpdate();
    noOpNode_77.onUpstreamUpdate();
    noOpNode_76.onUpstreamUpdate();
    noOpNode_75.onUpstreamUpdate();
    noOpNode_74.onUpstreamUpdate();
    noOpNode_73.onUpstreamUpdate();
    noOpNode_72.onUpstreamUpdate();
    noOpNode_71.onUpstreamUpdate();
    noOpNode_70.onUpstreamUpdate();
    noOpNode_69.onUpstreamUpdate();
    noOpNode_68.onUpstreamUpdate();
    noOpNode_67.onUpstreamUpdate();
    noOpNode_66.onUpstreamUpdate();
    noOpNode_65.onUpstreamUpdate();
    noOpNode_64.onUpstreamUpdate();
    noOpNode_63.onUpstreamUpdate();
    noOpNode_62.onUpstreamUpdate();
    noOpNode_61.onUpstreamUpdate();
    noOpNode_60.onUpstreamUpdate();
    noOpNode_59.onUpstreamUpdate();
    noOpNode_58.onUpstreamUpdate();
    noOpNode_57.onUpstreamUpdate();
    noOpNode_56.onUpstreamUpdate();
    noOpNode_55.onUpstreamUpdate();
    noOpNode_54.onUpstreamUpdate();
    noOpNode_53.onUpstreamUpdate();
    noOpNode_52.onUpstreamUpdate();
    noOpNode_51.onUpstreamUpdate();
    noOpNode_50.onUpstreamUpdate();
    noOpNode_49.onUpstreamUpdate();
    noOpNode_48.onUpstreamUpdate();
    noOpNode_47.onUpstreamUpdate();
    noOpNode_46.onUpstreamUpdate();
    noOpNode_45.onUpstreamUpdate();
    noOpNode_44.onUpstreamUpdate();
    noOpNode_43.onUpstreamUpdate();
    noOpNode_42.onUpstreamUpdate();
    noOpNode_41.onUpstreamUpdate();
    noOpNode_40.onUpstreamUpdate();
    noOpNode_39.onUpstreamUpdate();
    noOpNode_38.onUpstreamUpdate();
    noOpNode_37.onUpstreamUpdate();
    noOpNode_36.onUpstreamUpdate();
    noOpNode_35.onUpstreamUpdate();
    noOpNode_34.onUpstreamUpdate();
    noOpNode_33.onUpstreamUpdate();
    noOpNode_32.onUpstreamUpdate();
    noOpNode_31.onUpstreamUpdate();
    noOpNode_30.onUpstreamUpdate();
    noOpNode_29.onUpstreamUpdate();
    noOpNode_28.onUpstreamUpdate();
    noOpNode_27.onUpstreamUpdate();
    noOpNode_26.onUpstreamUpdate();
    noOpNode_25.onUpstreamUpdate();
    noOpNode_24.onUpstreamUpdate();
    noOpNode_23.onUpstreamUpdate();
    noOpNode_22.onUpstreamUpdate();
    noOpNode_21.onUpstreamUpdate();
    noOpNode_20.onUpstreamUpdate();
    noOpNode_19.onUpstreamUpdate();
    noOpNode_18.onUpstreamUpdate();
    noOpNode_17.onUpstreamUpdate();
    noOpNode_16.onUpstreamUpdate();
    noOpNode_15.onUpstreamUpdate();
    noOpNode_14.onUpstreamUpdate();
    noOpNode_13.onUpstreamUpdate();
    noOpNode_12.onUpstreamUpdate();
    noOpNode_11.onUpstreamUpdate();
    noOpNode_10.onUpstreamUpdate();
    noOpNode_9.onUpstreamUpdate();
    noOpNode_8.onUpstreamUpdate();
    noOpNode_7.onUpstreamUpdate();
    noOpNode_6.onUpstreamUpdate();
    noOpNode_5.onUpstreamUpdate();
    noOpNode_4.onUpstreamUpdate();
    noOpNode_3.onUpstreamUpdate();
    noOpNode_2.onUpstreamUpdate();
    noOpNode_1.onUpstreamUpdate();
    sink.onUpstreamUpdate();
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
    auditor.nodeRegistered(marketDataRootNode_101, "marketDataRootNode_101");
    auditor.nodeRegistered(noOpNode_1, "noOpNode_1");
    auditor.nodeRegistered(noOpNode_2, "noOpNode_2");
    auditor.nodeRegistered(noOpNode_3, "noOpNode_3");
    auditor.nodeRegistered(noOpNode_4, "noOpNode_4");
    auditor.nodeRegistered(noOpNode_5, "noOpNode_5");
    auditor.nodeRegistered(noOpNode_6, "noOpNode_6");
    auditor.nodeRegistered(noOpNode_7, "noOpNode_7");
    auditor.nodeRegistered(noOpNode_8, "noOpNode_8");
    auditor.nodeRegistered(noOpNode_9, "noOpNode_9");
    auditor.nodeRegistered(noOpNode_10, "noOpNode_10");
    auditor.nodeRegistered(noOpNode_11, "noOpNode_11");
    auditor.nodeRegistered(noOpNode_12, "noOpNode_12");
    auditor.nodeRegistered(noOpNode_13, "noOpNode_13");
    auditor.nodeRegistered(noOpNode_14, "noOpNode_14");
    auditor.nodeRegistered(noOpNode_15, "noOpNode_15");
    auditor.nodeRegistered(noOpNode_16, "noOpNode_16");
    auditor.nodeRegistered(noOpNode_17, "noOpNode_17");
    auditor.nodeRegistered(noOpNode_18, "noOpNode_18");
    auditor.nodeRegistered(noOpNode_19, "noOpNode_19");
    auditor.nodeRegistered(noOpNode_20, "noOpNode_20");
    auditor.nodeRegistered(noOpNode_21, "noOpNode_21");
    auditor.nodeRegistered(noOpNode_22, "noOpNode_22");
    auditor.nodeRegistered(noOpNode_23, "noOpNode_23");
    auditor.nodeRegistered(noOpNode_24, "noOpNode_24");
    auditor.nodeRegistered(noOpNode_25, "noOpNode_25");
    auditor.nodeRegistered(noOpNode_26, "noOpNode_26");
    auditor.nodeRegistered(noOpNode_27, "noOpNode_27");
    auditor.nodeRegistered(noOpNode_28, "noOpNode_28");
    auditor.nodeRegistered(noOpNode_29, "noOpNode_29");
    auditor.nodeRegistered(noOpNode_30, "noOpNode_30");
    auditor.nodeRegistered(noOpNode_31, "noOpNode_31");
    auditor.nodeRegistered(noOpNode_32, "noOpNode_32");
    auditor.nodeRegistered(noOpNode_33, "noOpNode_33");
    auditor.nodeRegistered(noOpNode_34, "noOpNode_34");
    auditor.nodeRegistered(noOpNode_35, "noOpNode_35");
    auditor.nodeRegistered(noOpNode_36, "noOpNode_36");
    auditor.nodeRegistered(noOpNode_37, "noOpNode_37");
    auditor.nodeRegistered(noOpNode_38, "noOpNode_38");
    auditor.nodeRegistered(noOpNode_39, "noOpNode_39");
    auditor.nodeRegistered(noOpNode_40, "noOpNode_40");
    auditor.nodeRegistered(noOpNode_41, "noOpNode_41");
    auditor.nodeRegistered(noOpNode_42, "noOpNode_42");
    auditor.nodeRegistered(noOpNode_43, "noOpNode_43");
    auditor.nodeRegistered(noOpNode_44, "noOpNode_44");
    auditor.nodeRegistered(noOpNode_45, "noOpNode_45");
    auditor.nodeRegistered(noOpNode_46, "noOpNode_46");
    auditor.nodeRegistered(noOpNode_47, "noOpNode_47");
    auditor.nodeRegistered(noOpNode_48, "noOpNode_48");
    auditor.nodeRegistered(noOpNode_49, "noOpNode_49");
    auditor.nodeRegistered(noOpNode_50, "noOpNode_50");
    auditor.nodeRegistered(noOpNode_51, "noOpNode_51");
    auditor.nodeRegistered(noOpNode_52, "noOpNode_52");
    auditor.nodeRegistered(noOpNode_53, "noOpNode_53");
    auditor.nodeRegistered(noOpNode_54, "noOpNode_54");
    auditor.nodeRegistered(noOpNode_55, "noOpNode_55");
    auditor.nodeRegistered(noOpNode_56, "noOpNode_56");
    auditor.nodeRegistered(noOpNode_57, "noOpNode_57");
    auditor.nodeRegistered(noOpNode_58, "noOpNode_58");
    auditor.nodeRegistered(noOpNode_59, "noOpNode_59");
    auditor.nodeRegistered(noOpNode_60, "noOpNode_60");
    auditor.nodeRegistered(noOpNode_61, "noOpNode_61");
    auditor.nodeRegistered(noOpNode_62, "noOpNode_62");
    auditor.nodeRegistered(noOpNode_63, "noOpNode_63");
    auditor.nodeRegistered(noOpNode_64, "noOpNode_64");
    auditor.nodeRegistered(noOpNode_65, "noOpNode_65");
    auditor.nodeRegistered(noOpNode_66, "noOpNode_66");
    auditor.nodeRegistered(noOpNode_67, "noOpNode_67");
    auditor.nodeRegistered(noOpNode_68, "noOpNode_68");
    auditor.nodeRegistered(noOpNode_69, "noOpNode_69");
    auditor.nodeRegistered(noOpNode_70, "noOpNode_70");
    auditor.nodeRegistered(noOpNode_71, "noOpNode_71");
    auditor.nodeRegistered(noOpNode_72, "noOpNode_72");
    auditor.nodeRegistered(noOpNode_73, "noOpNode_73");
    auditor.nodeRegistered(noOpNode_74, "noOpNode_74");
    auditor.nodeRegistered(noOpNode_75, "noOpNode_75");
    auditor.nodeRegistered(noOpNode_76, "noOpNode_76");
    auditor.nodeRegistered(noOpNode_77, "noOpNode_77");
    auditor.nodeRegistered(noOpNode_78, "noOpNode_78");
    auditor.nodeRegistered(noOpNode_79, "noOpNode_79");
    auditor.nodeRegistered(noOpNode_80, "noOpNode_80");
    auditor.nodeRegistered(noOpNode_81, "noOpNode_81");
    auditor.nodeRegistered(noOpNode_82, "noOpNode_82");
    auditor.nodeRegistered(noOpNode_83, "noOpNode_83");
    auditor.nodeRegistered(noOpNode_84, "noOpNode_84");
    auditor.nodeRegistered(noOpNode_85, "noOpNode_85");
    auditor.nodeRegistered(noOpNode_86, "noOpNode_86");
    auditor.nodeRegistered(noOpNode_87, "noOpNode_87");
    auditor.nodeRegistered(noOpNode_88, "noOpNode_88");
    auditor.nodeRegistered(noOpNode_89, "noOpNode_89");
    auditor.nodeRegistered(noOpNode_90, "noOpNode_90");
    auditor.nodeRegistered(noOpNode_91, "noOpNode_91");
    auditor.nodeRegistered(noOpNode_92, "noOpNode_92");
    auditor.nodeRegistered(noOpNode_93, "noOpNode_93");
    auditor.nodeRegistered(noOpNode_94, "noOpNode_94");
    auditor.nodeRegistered(noOpNode_95, "noOpNode_95");
    auditor.nodeRegistered(noOpNode_96, "noOpNode_96");
    auditor.nodeRegistered(noOpNode_97, "noOpNode_97");
    auditor.nodeRegistered(noOpNode_98, "noOpNode_98");
    auditor.nodeRegistered(noOpNode_99, "noOpNode_99");
    auditor.nodeRegistered(noOpNode_100, "noOpNode_100");
    auditor.nodeRegistered(sink, "sink");
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
    if (dirtyFlagSupplierMap.isEmpty()) {}

    return dirtyFlagSupplierMap.getOrDefault(node, DataFlow.ALWAYS_FALSE);
  }

  @Override
  public void setDirty(Object node, boolean dirtyFlag) {
    if (dirtyFlagUpdateMap.isEmpty()) {}

    dirtyFlagUpdateMap.get(node).accept(dirtyFlag);
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
  public NoopDispatch100Processor newInstance() {
    return new NoopDispatch100Processor();
  }

  @Override
  public NoopDispatch100Processor newInstance(Map<Object, Object> contextMap) {
    return new NoopDispatch100Processor();
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
