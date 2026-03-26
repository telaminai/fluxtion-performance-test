/*
 * Copyright: © 2025.  Gregory Higgins <greg.higgins@v12technology.com> - All Rights Reserved
 * This source code is protected under international copyright law.  All rights
 * reserved and protected by the copyright holders.
 * This file is confidential and only available to authorized individuals with the
 * permission of the copyright holders.  If you encounter this file and do not have
 * permission, please contact the copyright holders and delete this file.
 */
package com.telamin.fluxtion.test.performance.generated.deep;

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
import com.telamin.fluxtion.test.performance.nodes.LinearNode;
import com.telamin.fluxtion.test.performance.nodes.LinearNodePublisher;
import com.telamin.fluxtion.test.performance.nodes.RootLinearNode;
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
public class DeepPath100Processor
    implements CloneableDataFlow<DeepPath100Processor>,
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
  private final transient RootLinearNode rootLinearNode_101 = new RootLinearNode();
  private final transient LinearNode linearNode_100 = new LinearNode();
  private final transient LinearNode linearNode_99 = new LinearNode();
  private final transient LinearNode linearNode_98 = new LinearNode();
  private final transient LinearNode linearNode_97 = new LinearNode();
  private final transient LinearNode linearNode_96 = new LinearNode();
  private final transient LinearNode linearNode_95 = new LinearNode();
  private final transient LinearNode linearNode_94 = new LinearNode();
  private final transient LinearNode linearNode_93 = new LinearNode();
  private final transient LinearNode linearNode_92 = new LinearNode();
  private final transient LinearNode linearNode_91 = new LinearNode();
  private final transient LinearNode linearNode_90 = new LinearNode();
  private final transient LinearNode linearNode_89 = new LinearNode();
  private final transient LinearNode linearNode_88 = new LinearNode();
  private final transient LinearNode linearNode_87 = new LinearNode();
  private final transient LinearNode linearNode_86 = new LinearNode();
  private final transient LinearNode linearNode_85 = new LinearNode();
  private final transient LinearNode linearNode_84 = new LinearNode();
  private final transient LinearNode linearNode_83 = new LinearNode();
  private final transient LinearNode linearNode_82 = new LinearNode();
  private final transient LinearNode linearNode_81 = new LinearNode();
  private final transient LinearNode linearNode_80 = new LinearNode();
  private final transient LinearNode linearNode_79 = new LinearNode();
  private final transient LinearNode linearNode_78 = new LinearNode();
  private final transient LinearNode linearNode_77 = new LinearNode();
  private final transient LinearNode linearNode_76 = new LinearNode();
  private final transient LinearNode linearNode_75 = new LinearNode();
  private final transient LinearNode linearNode_74 = new LinearNode();
  private final transient LinearNode linearNode_73 = new LinearNode();
  private final transient LinearNode linearNode_72 = new LinearNode();
  private final transient LinearNode linearNode_71 = new LinearNode();
  private final transient LinearNode linearNode_70 = new LinearNode();
  private final transient LinearNode linearNode_69 = new LinearNode();
  private final transient LinearNode linearNode_68 = new LinearNode();
  private final transient LinearNode linearNode_67 = new LinearNode();
  private final transient LinearNode linearNode_66 = new LinearNode();
  private final transient LinearNode linearNode_65 = new LinearNode();
  private final transient LinearNode linearNode_64 = new LinearNode();
  private final transient LinearNode linearNode_63 = new LinearNode();
  private final transient LinearNode linearNode_62 = new LinearNode();
  private final transient LinearNode linearNode_61 = new LinearNode();
  private final transient LinearNode linearNode_60 = new LinearNode();
  private final transient LinearNode linearNode_59 = new LinearNode();
  private final transient LinearNode linearNode_58 = new LinearNode();
  private final transient LinearNode linearNode_57 = new LinearNode();
  private final transient LinearNode linearNode_56 = new LinearNode();
  private final transient LinearNode linearNode_55 = new LinearNode();
  private final transient LinearNode linearNode_54 = new LinearNode();
  private final transient LinearNode linearNode_53 = new LinearNode();
  private final transient LinearNode linearNode_52 = new LinearNode();
  private final transient LinearNode linearNode_51 = new LinearNode();
  private final transient LinearNode linearNode_50 = new LinearNode();
  private final transient LinearNode linearNode_49 = new LinearNode();
  private final transient LinearNode linearNode_48 = new LinearNode();
  private final transient LinearNode linearNode_47 = new LinearNode();
  private final transient LinearNode linearNode_46 = new LinearNode();
  private final transient LinearNode linearNode_45 = new LinearNode();
  private final transient LinearNode linearNode_44 = new LinearNode();
  private final transient LinearNode linearNode_43 = new LinearNode();
  private final transient LinearNode linearNode_42 = new LinearNode();
  private final transient LinearNode linearNode_41 = new LinearNode();
  private final transient LinearNode linearNode_40 = new LinearNode();
  private final transient LinearNode linearNode_39 = new LinearNode();
  private final transient LinearNode linearNode_38 = new LinearNode();
  private final transient LinearNode linearNode_37 = new LinearNode();
  private final transient LinearNode linearNode_36 = new LinearNode();
  private final transient LinearNode linearNode_35 = new LinearNode();
  private final transient LinearNode linearNode_34 = new LinearNode();
  private final transient LinearNode linearNode_33 = new LinearNode();
  private final transient LinearNode linearNode_32 = new LinearNode();
  private final transient LinearNode linearNode_31 = new LinearNode();
  private final transient LinearNode linearNode_30 = new LinearNode();
  private final transient LinearNode linearNode_29 = new LinearNode();
  private final transient LinearNode linearNode_28 = new LinearNode();
  private final transient LinearNode linearNode_27 = new LinearNode();
  private final transient LinearNode linearNode_26 = new LinearNode();
  private final transient LinearNode linearNode_25 = new LinearNode();
  private final transient LinearNode linearNode_24 = new LinearNode();
  private final transient LinearNode linearNode_23 = new LinearNode();
  private final transient LinearNode linearNode_22 = new LinearNode();
  private final transient LinearNode linearNode_21 = new LinearNode();
  private final transient LinearNode linearNode_20 = new LinearNode();
  private final transient LinearNode linearNode_19 = new LinearNode();
  private final transient LinearNode linearNode_18 = new LinearNode();
  private final transient LinearNode linearNode_17 = new LinearNode();
  private final transient LinearNode linearNode_16 = new LinearNode();
  private final transient LinearNode linearNode_15 = new LinearNode();
  private final transient LinearNode linearNode_14 = new LinearNode();
  private final transient LinearNode linearNode_13 = new LinearNode();
  private final transient LinearNode linearNode_12 = new LinearNode();
  private final transient LinearNode linearNode_11 = new LinearNode();
  private final transient LinearNode linearNode_10 = new LinearNode();
  private final transient LinearNode linearNode_9 = new LinearNode();
  private final transient LinearNode linearNode_8 = new LinearNode();
  private final transient LinearNode linearNode_7 = new LinearNode();
  private final transient LinearNode linearNode_6 = new LinearNode();
  private final transient LinearNode linearNode_5 = new LinearNode();
  private final transient LinearNode linearNode_4 = new LinearNode();
  private final transient LinearNode linearNode_3 = new LinearNode();
  private final transient LinearNode linearNode_2 = new LinearNode();
  private final transient LinearNode linearNode_1 = new LinearNode();
  public final transient LinearNodePublisher sink = new LinearNodePublisher();
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

  public DeepPath100Processor(Map<Object, Object> contextMap) {
    if (context != null) {
      context.replaceMappings(contextMap);
    }
    context.setClock(clock);
    serviceRegistry.setDataFlowContext(context);
    sink.setNodeId("sink");
    sink.setUpstream1(linearNode_1);
    linearNode_1.setNodeId("node_100");
    linearNode_1.setUpstream1(linearNode_2);
    linearNode_1.value = 0.0;
    linearNode_2.setNodeId("node_99");
    linearNode_2.setUpstream1(linearNode_3);
    linearNode_2.value = 0.0;
    linearNode_3.setNodeId("node_98");
    linearNode_3.setUpstream1(linearNode_4);
    linearNode_3.value = 0.0;
    linearNode_4.setNodeId("node_97");
    linearNode_4.setUpstream1(linearNode_5);
    linearNode_4.value = 0.0;
    linearNode_5.setNodeId("node_96");
    linearNode_5.setUpstream1(linearNode_6);
    linearNode_5.value = 0.0;
    linearNode_6.setNodeId("node_95");
    linearNode_6.setUpstream1(linearNode_7);
    linearNode_6.value = 0.0;
    linearNode_7.setNodeId("node_94");
    linearNode_7.setUpstream1(linearNode_8);
    linearNode_7.value = 0.0;
    linearNode_8.setNodeId("node_93");
    linearNode_8.setUpstream1(linearNode_9);
    linearNode_8.value = 0.0;
    linearNode_9.setNodeId("node_92");
    linearNode_9.setUpstream1(linearNode_10);
    linearNode_9.value = 0.0;
    linearNode_10.setNodeId("node_91");
    linearNode_10.setUpstream1(linearNode_11);
    linearNode_10.value = 0.0;
    linearNode_11.setNodeId("node_90");
    linearNode_11.setUpstream1(linearNode_12);
    linearNode_11.value = 0.0;
    linearNode_12.setNodeId("node_89");
    linearNode_12.setUpstream1(linearNode_13);
    linearNode_12.value = 0.0;
    linearNode_13.setNodeId("node_88");
    linearNode_13.setUpstream1(linearNode_14);
    linearNode_13.value = 0.0;
    linearNode_14.setNodeId("node_87");
    linearNode_14.setUpstream1(linearNode_15);
    linearNode_14.value = 0.0;
    linearNode_15.setNodeId("node_86");
    linearNode_15.setUpstream1(linearNode_16);
    linearNode_15.value = 0.0;
    linearNode_16.setNodeId("node_85");
    linearNode_16.setUpstream1(linearNode_17);
    linearNode_16.value = 0.0;
    linearNode_17.setNodeId("node_84");
    linearNode_17.setUpstream1(linearNode_18);
    linearNode_17.value = 0.0;
    linearNode_18.setNodeId("node_83");
    linearNode_18.setUpstream1(linearNode_19);
    linearNode_18.value = 0.0;
    linearNode_19.setNodeId("node_82");
    linearNode_19.setUpstream1(linearNode_20);
    linearNode_19.value = 0.0;
    linearNode_20.setNodeId("node_81");
    linearNode_20.setUpstream1(linearNode_21);
    linearNode_20.value = 0.0;
    linearNode_21.setNodeId("node_80");
    linearNode_21.setUpstream1(linearNode_22);
    linearNode_21.value = 0.0;
    linearNode_22.setNodeId("node_79");
    linearNode_22.setUpstream1(linearNode_23);
    linearNode_22.value = 0.0;
    linearNode_23.setNodeId("node_78");
    linearNode_23.setUpstream1(linearNode_24);
    linearNode_23.value = 0.0;
    linearNode_24.setNodeId("node_77");
    linearNode_24.setUpstream1(linearNode_25);
    linearNode_24.value = 0.0;
    linearNode_25.setNodeId("node_76");
    linearNode_25.setUpstream1(linearNode_26);
    linearNode_25.value = 0.0;
    linearNode_26.setNodeId("node_75");
    linearNode_26.setUpstream1(linearNode_27);
    linearNode_26.value = 0.0;
    linearNode_27.setNodeId("node_74");
    linearNode_27.setUpstream1(linearNode_28);
    linearNode_27.value = 0.0;
    linearNode_28.setNodeId("node_73");
    linearNode_28.setUpstream1(linearNode_29);
    linearNode_28.value = 0.0;
    linearNode_29.setNodeId("node_72");
    linearNode_29.setUpstream1(linearNode_30);
    linearNode_29.value = 0.0;
    linearNode_30.setNodeId("node_71");
    linearNode_30.setUpstream1(linearNode_31);
    linearNode_30.value = 0.0;
    linearNode_31.setNodeId("node_70");
    linearNode_31.setUpstream1(linearNode_32);
    linearNode_31.value = 0.0;
    linearNode_32.setNodeId("node_69");
    linearNode_32.setUpstream1(linearNode_33);
    linearNode_32.value = 0.0;
    linearNode_33.setNodeId("node_68");
    linearNode_33.setUpstream1(linearNode_34);
    linearNode_33.value = 0.0;
    linearNode_34.setNodeId("node_67");
    linearNode_34.setUpstream1(linearNode_35);
    linearNode_34.value = 0.0;
    linearNode_35.setNodeId("node_66");
    linearNode_35.setUpstream1(linearNode_36);
    linearNode_35.value = 0.0;
    linearNode_36.setNodeId("node_65");
    linearNode_36.setUpstream1(linearNode_37);
    linearNode_36.value = 0.0;
    linearNode_37.setNodeId("node_64");
    linearNode_37.setUpstream1(linearNode_38);
    linearNode_37.value = 0.0;
    linearNode_38.setNodeId("node_63");
    linearNode_38.setUpstream1(linearNode_39);
    linearNode_38.value = 0.0;
    linearNode_39.setNodeId("node_62");
    linearNode_39.setUpstream1(linearNode_40);
    linearNode_39.value = 0.0;
    linearNode_40.setNodeId("node_61");
    linearNode_40.setUpstream1(linearNode_41);
    linearNode_40.value = 0.0;
    linearNode_41.setNodeId("node_60");
    linearNode_41.setUpstream1(linearNode_42);
    linearNode_41.value = 0.0;
    linearNode_42.setNodeId("node_59");
    linearNode_42.setUpstream1(linearNode_43);
    linearNode_42.value = 0.0;
    linearNode_43.setNodeId("node_58");
    linearNode_43.setUpstream1(linearNode_44);
    linearNode_43.value = 0.0;
    linearNode_44.setNodeId("node_57");
    linearNode_44.setUpstream1(linearNode_45);
    linearNode_44.value = 0.0;
    linearNode_45.setNodeId("node_56");
    linearNode_45.setUpstream1(linearNode_46);
    linearNode_45.value = 0.0;
    linearNode_46.setNodeId("node_55");
    linearNode_46.setUpstream1(linearNode_47);
    linearNode_46.value = 0.0;
    linearNode_47.setNodeId("node_54");
    linearNode_47.setUpstream1(linearNode_48);
    linearNode_47.value = 0.0;
    linearNode_48.setNodeId("node_53");
    linearNode_48.setUpstream1(linearNode_49);
    linearNode_48.value = 0.0;
    linearNode_49.setNodeId("node_52");
    linearNode_49.setUpstream1(linearNode_50);
    linearNode_49.value = 0.0;
    linearNode_50.setNodeId("node_51");
    linearNode_50.setUpstream1(linearNode_51);
    linearNode_50.value = 0.0;
    linearNode_51.setNodeId("node_50");
    linearNode_51.setUpstream1(linearNode_52);
    linearNode_51.value = 0.0;
    linearNode_52.setNodeId("node_49");
    linearNode_52.setUpstream1(linearNode_53);
    linearNode_52.value = 0.0;
    linearNode_53.setNodeId("node_48");
    linearNode_53.setUpstream1(linearNode_54);
    linearNode_53.value = 0.0;
    linearNode_54.setNodeId("node_47");
    linearNode_54.setUpstream1(linearNode_55);
    linearNode_54.value = 0.0;
    linearNode_55.setNodeId("node_46");
    linearNode_55.setUpstream1(linearNode_56);
    linearNode_55.value = 0.0;
    linearNode_56.setNodeId("node_45");
    linearNode_56.setUpstream1(linearNode_57);
    linearNode_56.value = 0.0;
    linearNode_57.setNodeId("node_44");
    linearNode_57.setUpstream1(linearNode_58);
    linearNode_57.value = 0.0;
    linearNode_58.setNodeId("node_43");
    linearNode_58.setUpstream1(linearNode_59);
    linearNode_58.value = 0.0;
    linearNode_59.setNodeId("node_42");
    linearNode_59.setUpstream1(linearNode_60);
    linearNode_59.value = 0.0;
    linearNode_60.setNodeId("node_41");
    linearNode_60.setUpstream1(linearNode_61);
    linearNode_60.value = 0.0;
    linearNode_61.setNodeId("node_40");
    linearNode_61.setUpstream1(linearNode_62);
    linearNode_61.value = 0.0;
    linearNode_62.setNodeId("node_39");
    linearNode_62.setUpstream1(linearNode_63);
    linearNode_62.value = 0.0;
    linearNode_63.setNodeId("node_38");
    linearNode_63.setUpstream1(linearNode_64);
    linearNode_63.value = 0.0;
    linearNode_64.setNodeId("node_37");
    linearNode_64.setUpstream1(linearNode_65);
    linearNode_64.value = 0.0;
    linearNode_65.setNodeId("node_36");
    linearNode_65.setUpstream1(linearNode_66);
    linearNode_65.value = 0.0;
    linearNode_66.setNodeId("node_35");
    linearNode_66.setUpstream1(linearNode_67);
    linearNode_66.value = 0.0;
    linearNode_67.setNodeId("node_34");
    linearNode_67.setUpstream1(linearNode_68);
    linearNode_67.value = 0.0;
    linearNode_68.setNodeId("node_33");
    linearNode_68.setUpstream1(linearNode_69);
    linearNode_68.value = 0.0;
    linearNode_69.setNodeId("node_32");
    linearNode_69.setUpstream1(linearNode_70);
    linearNode_69.value = 0.0;
    linearNode_70.setNodeId("node_31");
    linearNode_70.setUpstream1(linearNode_71);
    linearNode_70.value = 0.0;
    linearNode_71.setNodeId("node_30");
    linearNode_71.setUpstream1(linearNode_72);
    linearNode_71.value = 0.0;
    linearNode_72.setNodeId("node_29");
    linearNode_72.setUpstream1(linearNode_73);
    linearNode_72.value = 0.0;
    linearNode_73.setNodeId("node_28");
    linearNode_73.setUpstream1(linearNode_74);
    linearNode_73.value = 0.0;
    linearNode_74.setNodeId("node_27");
    linearNode_74.setUpstream1(linearNode_75);
    linearNode_74.value = 0.0;
    linearNode_75.setNodeId("node_26");
    linearNode_75.setUpstream1(linearNode_76);
    linearNode_75.value = 0.0;
    linearNode_76.setNodeId("node_25");
    linearNode_76.setUpstream1(linearNode_77);
    linearNode_76.value = 0.0;
    linearNode_77.setNodeId("node_24");
    linearNode_77.setUpstream1(linearNode_78);
    linearNode_77.value = 0.0;
    linearNode_78.setNodeId("node_23");
    linearNode_78.setUpstream1(linearNode_79);
    linearNode_78.value = 0.0;
    linearNode_79.setNodeId("node_22");
    linearNode_79.setUpstream1(linearNode_80);
    linearNode_79.value = 0.0;
    linearNode_80.setNodeId("node_21");
    linearNode_80.setUpstream1(linearNode_81);
    linearNode_80.value = 0.0;
    linearNode_81.setNodeId("node_20");
    linearNode_81.setUpstream1(linearNode_82);
    linearNode_81.value = 0.0;
    linearNode_82.setNodeId("node_19");
    linearNode_82.setUpstream1(linearNode_83);
    linearNode_82.value = 0.0;
    linearNode_83.setNodeId("node_18");
    linearNode_83.setUpstream1(linearNode_84);
    linearNode_83.value = 0.0;
    linearNode_84.setNodeId("node_17");
    linearNode_84.setUpstream1(linearNode_85);
    linearNode_84.value = 0.0;
    linearNode_85.setNodeId("node_16");
    linearNode_85.setUpstream1(linearNode_86);
    linearNode_85.value = 0.0;
    linearNode_86.setNodeId("node_15");
    linearNode_86.setUpstream1(linearNode_87);
    linearNode_86.value = 0.0;
    linearNode_87.setNodeId("node_14");
    linearNode_87.setUpstream1(linearNode_88);
    linearNode_87.value = 0.0;
    linearNode_88.setNodeId("node_13");
    linearNode_88.setUpstream1(linearNode_89);
    linearNode_88.value = 0.0;
    linearNode_89.setNodeId("node_12");
    linearNode_89.setUpstream1(linearNode_90);
    linearNode_89.value = 0.0;
    linearNode_90.setNodeId("node_11");
    linearNode_90.setUpstream1(linearNode_91);
    linearNode_90.value = 0.0;
    linearNode_91.setNodeId("node_10");
    linearNode_91.setUpstream1(linearNode_92);
    linearNode_91.value = 0.0;
    linearNode_92.setNodeId("node_9");
    linearNode_92.setUpstream1(linearNode_93);
    linearNode_92.value = 0.0;
    linearNode_93.setNodeId("node_8");
    linearNode_93.setUpstream1(linearNode_94);
    linearNode_93.value = 0.0;
    linearNode_94.setNodeId("node_7");
    linearNode_94.setUpstream1(linearNode_95);
    linearNode_94.value = 0.0;
    linearNode_95.setNodeId("node_6");
    linearNode_95.setUpstream1(linearNode_96);
    linearNode_95.value = 0.0;
    linearNode_96.setNodeId("node_5");
    linearNode_96.setUpstream1(linearNode_97);
    linearNode_96.value = 0.0;
    linearNode_97.setNodeId("node_4");
    linearNode_97.setUpstream1(linearNode_98);
    linearNode_97.value = 0.0;
    linearNode_98.setNodeId("node_3");
    linearNode_98.setUpstream1(linearNode_99);
    linearNode_98.value = 0.0;
    linearNode_99.setNodeId("node_2");
    linearNode_99.setUpstream1(linearNode_100);
    linearNode_99.value = 0.0;
    linearNode_100.setNodeId("node_1");
    linearNode_100.setUpstream1(rootLinearNode_101);
    linearNode_100.value = 0.0;
    rootLinearNode_101.setNodeId("root");
    rootLinearNode_101.value = 0.0;
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

  public DeepPath100Processor() {
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
    rootLinearNode_101.onMarketData(typedEvent);
    linearNode_100.onUpstreamUpdate();
    linearNode_99.onUpstreamUpdate();
    linearNode_98.onUpstreamUpdate();
    linearNode_97.onUpstreamUpdate();
    linearNode_96.onUpstreamUpdate();
    linearNode_95.onUpstreamUpdate();
    linearNode_94.onUpstreamUpdate();
    linearNode_93.onUpstreamUpdate();
    linearNode_92.onUpstreamUpdate();
    linearNode_91.onUpstreamUpdate();
    linearNode_90.onUpstreamUpdate();
    linearNode_89.onUpstreamUpdate();
    linearNode_88.onUpstreamUpdate();
    linearNode_87.onUpstreamUpdate();
    linearNode_86.onUpstreamUpdate();
    linearNode_85.onUpstreamUpdate();
    linearNode_84.onUpstreamUpdate();
    linearNode_83.onUpstreamUpdate();
    linearNode_82.onUpstreamUpdate();
    linearNode_81.onUpstreamUpdate();
    linearNode_80.onUpstreamUpdate();
    linearNode_79.onUpstreamUpdate();
    linearNode_78.onUpstreamUpdate();
    linearNode_77.onUpstreamUpdate();
    linearNode_76.onUpstreamUpdate();
    linearNode_75.onUpstreamUpdate();
    linearNode_74.onUpstreamUpdate();
    linearNode_73.onUpstreamUpdate();
    linearNode_72.onUpstreamUpdate();
    linearNode_71.onUpstreamUpdate();
    linearNode_70.onUpstreamUpdate();
    linearNode_69.onUpstreamUpdate();
    linearNode_68.onUpstreamUpdate();
    linearNode_67.onUpstreamUpdate();
    linearNode_66.onUpstreamUpdate();
    linearNode_65.onUpstreamUpdate();
    linearNode_64.onUpstreamUpdate();
    linearNode_63.onUpstreamUpdate();
    linearNode_62.onUpstreamUpdate();
    linearNode_61.onUpstreamUpdate();
    linearNode_60.onUpstreamUpdate();
    linearNode_59.onUpstreamUpdate();
    linearNode_58.onUpstreamUpdate();
    linearNode_57.onUpstreamUpdate();
    linearNode_56.onUpstreamUpdate();
    linearNode_55.onUpstreamUpdate();
    linearNode_54.onUpstreamUpdate();
    linearNode_53.onUpstreamUpdate();
    linearNode_52.onUpstreamUpdate();
    linearNode_51.onUpstreamUpdate();
    linearNode_50.onUpstreamUpdate();
    linearNode_49.onUpstreamUpdate();
    linearNode_48.onUpstreamUpdate();
    linearNode_47.onUpstreamUpdate();
    linearNode_46.onUpstreamUpdate();
    linearNode_45.onUpstreamUpdate();
    linearNode_44.onUpstreamUpdate();
    linearNode_43.onUpstreamUpdate();
    linearNode_42.onUpstreamUpdate();
    linearNode_41.onUpstreamUpdate();
    linearNode_40.onUpstreamUpdate();
    linearNode_39.onUpstreamUpdate();
    linearNode_38.onUpstreamUpdate();
    linearNode_37.onUpstreamUpdate();
    linearNode_36.onUpstreamUpdate();
    linearNode_35.onUpstreamUpdate();
    linearNode_34.onUpstreamUpdate();
    linearNode_33.onUpstreamUpdate();
    linearNode_32.onUpstreamUpdate();
    linearNode_31.onUpstreamUpdate();
    linearNode_30.onUpstreamUpdate();
    linearNode_29.onUpstreamUpdate();
    linearNode_28.onUpstreamUpdate();
    linearNode_27.onUpstreamUpdate();
    linearNode_26.onUpstreamUpdate();
    linearNode_25.onUpstreamUpdate();
    linearNode_24.onUpstreamUpdate();
    linearNode_23.onUpstreamUpdate();
    linearNode_22.onUpstreamUpdate();
    linearNode_21.onUpstreamUpdate();
    linearNode_20.onUpstreamUpdate();
    linearNode_19.onUpstreamUpdate();
    linearNode_18.onUpstreamUpdate();
    linearNode_17.onUpstreamUpdate();
    linearNode_16.onUpstreamUpdate();
    linearNode_15.onUpstreamUpdate();
    linearNode_14.onUpstreamUpdate();
    linearNode_13.onUpstreamUpdate();
    linearNode_12.onUpstreamUpdate();
    linearNode_11.onUpstreamUpdate();
    linearNode_10.onUpstreamUpdate();
    linearNode_9.onUpstreamUpdate();
    linearNode_8.onUpstreamUpdate();
    linearNode_7.onUpstreamUpdate();
    linearNode_6.onUpstreamUpdate();
    linearNode_5.onUpstreamUpdate();
    linearNode_4.onUpstreamUpdate();
    linearNode_3.onUpstreamUpdate();
    linearNode_2.onUpstreamUpdate();
    linearNode_1.onUpstreamUpdate();
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
      rootLinearNode_101.onMarketData(typedEvent);
    }
  }

  public void triggerCalculation() {
    buffering = false;
    String typedEvent = "No event information - buffered dispatch";
    linearNode_100.onUpstreamUpdate();
    linearNode_99.onUpstreamUpdate();
    linearNode_98.onUpstreamUpdate();
    linearNode_97.onUpstreamUpdate();
    linearNode_96.onUpstreamUpdate();
    linearNode_95.onUpstreamUpdate();
    linearNode_94.onUpstreamUpdate();
    linearNode_93.onUpstreamUpdate();
    linearNode_92.onUpstreamUpdate();
    linearNode_91.onUpstreamUpdate();
    linearNode_90.onUpstreamUpdate();
    linearNode_89.onUpstreamUpdate();
    linearNode_88.onUpstreamUpdate();
    linearNode_87.onUpstreamUpdate();
    linearNode_86.onUpstreamUpdate();
    linearNode_85.onUpstreamUpdate();
    linearNode_84.onUpstreamUpdate();
    linearNode_83.onUpstreamUpdate();
    linearNode_82.onUpstreamUpdate();
    linearNode_81.onUpstreamUpdate();
    linearNode_80.onUpstreamUpdate();
    linearNode_79.onUpstreamUpdate();
    linearNode_78.onUpstreamUpdate();
    linearNode_77.onUpstreamUpdate();
    linearNode_76.onUpstreamUpdate();
    linearNode_75.onUpstreamUpdate();
    linearNode_74.onUpstreamUpdate();
    linearNode_73.onUpstreamUpdate();
    linearNode_72.onUpstreamUpdate();
    linearNode_71.onUpstreamUpdate();
    linearNode_70.onUpstreamUpdate();
    linearNode_69.onUpstreamUpdate();
    linearNode_68.onUpstreamUpdate();
    linearNode_67.onUpstreamUpdate();
    linearNode_66.onUpstreamUpdate();
    linearNode_65.onUpstreamUpdate();
    linearNode_64.onUpstreamUpdate();
    linearNode_63.onUpstreamUpdate();
    linearNode_62.onUpstreamUpdate();
    linearNode_61.onUpstreamUpdate();
    linearNode_60.onUpstreamUpdate();
    linearNode_59.onUpstreamUpdate();
    linearNode_58.onUpstreamUpdate();
    linearNode_57.onUpstreamUpdate();
    linearNode_56.onUpstreamUpdate();
    linearNode_55.onUpstreamUpdate();
    linearNode_54.onUpstreamUpdate();
    linearNode_53.onUpstreamUpdate();
    linearNode_52.onUpstreamUpdate();
    linearNode_51.onUpstreamUpdate();
    linearNode_50.onUpstreamUpdate();
    linearNode_49.onUpstreamUpdate();
    linearNode_48.onUpstreamUpdate();
    linearNode_47.onUpstreamUpdate();
    linearNode_46.onUpstreamUpdate();
    linearNode_45.onUpstreamUpdate();
    linearNode_44.onUpstreamUpdate();
    linearNode_43.onUpstreamUpdate();
    linearNode_42.onUpstreamUpdate();
    linearNode_41.onUpstreamUpdate();
    linearNode_40.onUpstreamUpdate();
    linearNode_39.onUpstreamUpdate();
    linearNode_38.onUpstreamUpdate();
    linearNode_37.onUpstreamUpdate();
    linearNode_36.onUpstreamUpdate();
    linearNode_35.onUpstreamUpdate();
    linearNode_34.onUpstreamUpdate();
    linearNode_33.onUpstreamUpdate();
    linearNode_32.onUpstreamUpdate();
    linearNode_31.onUpstreamUpdate();
    linearNode_30.onUpstreamUpdate();
    linearNode_29.onUpstreamUpdate();
    linearNode_28.onUpstreamUpdate();
    linearNode_27.onUpstreamUpdate();
    linearNode_26.onUpstreamUpdate();
    linearNode_25.onUpstreamUpdate();
    linearNode_24.onUpstreamUpdate();
    linearNode_23.onUpstreamUpdate();
    linearNode_22.onUpstreamUpdate();
    linearNode_21.onUpstreamUpdate();
    linearNode_20.onUpstreamUpdate();
    linearNode_19.onUpstreamUpdate();
    linearNode_18.onUpstreamUpdate();
    linearNode_17.onUpstreamUpdate();
    linearNode_16.onUpstreamUpdate();
    linearNode_15.onUpstreamUpdate();
    linearNode_14.onUpstreamUpdate();
    linearNode_13.onUpstreamUpdate();
    linearNode_12.onUpstreamUpdate();
    linearNode_11.onUpstreamUpdate();
    linearNode_10.onUpstreamUpdate();
    linearNode_9.onUpstreamUpdate();
    linearNode_8.onUpstreamUpdate();
    linearNode_7.onUpstreamUpdate();
    linearNode_6.onUpstreamUpdate();
    linearNode_5.onUpstreamUpdate();
    linearNode_4.onUpstreamUpdate();
    linearNode_3.onUpstreamUpdate();
    linearNode_2.onUpstreamUpdate();
    linearNode_1.onUpstreamUpdate();
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
    auditor.nodeRegistered(sink, "sink");
    auditor.nodeRegistered(linearNode_1, "linearNode_1");
    auditor.nodeRegistered(linearNode_2, "linearNode_2");
    auditor.nodeRegistered(linearNode_3, "linearNode_3");
    auditor.nodeRegistered(linearNode_4, "linearNode_4");
    auditor.nodeRegistered(linearNode_5, "linearNode_5");
    auditor.nodeRegistered(linearNode_6, "linearNode_6");
    auditor.nodeRegistered(linearNode_7, "linearNode_7");
    auditor.nodeRegistered(linearNode_8, "linearNode_8");
    auditor.nodeRegistered(linearNode_9, "linearNode_9");
    auditor.nodeRegistered(linearNode_10, "linearNode_10");
    auditor.nodeRegistered(linearNode_11, "linearNode_11");
    auditor.nodeRegistered(linearNode_12, "linearNode_12");
    auditor.nodeRegistered(linearNode_13, "linearNode_13");
    auditor.nodeRegistered(linearNode_14, "linearNode_14");
    auditor.nodeRegistered(linearNode_15, "linearNode_15");
    auditor.nodeRegistered(linearNode_16, "linearNode_16");
    auditor.nodeRegistered(linearNode_17, "linearNode_17");
    auditor.nodeRegistered(linearNode_18, "linearNode_18");
    auditor.nodeRegistered(linearNode_19, "linearNode_19");
    auditor.nodeRegistered(linearNode_20, "linearNode_20");
    auditor.nodeRegistered(linearNode_21, "linearNode_21");
    auditor.nodeRegistered(linearNode_22, "linearNode_22");
    auditor.nodeRegistered(linearNode_23, "linearNode_23");
    auditor.nodeRegistered(linearNode_24, "linearNode_24");
    auditor.nodeRegistered(linearNode_25, "linearNode_25");
    auditor.nodeRegistered(linearNode_26, "linearNode_26");
    auditor.nodeRegistered(linearNode_27, "linearNode_27");
    auditor.nodeRegistered(linearNode_28, "linearNode_28");
    auditor.nodeRegistered(linearNode_29, "linearNode_29");
    auditor.nodeRegistered(linearNode_30, "linearNode_30");
    auditor.nodeRegistered(linearNode_31, "linearNode_31");
    auditor.nodeRegistered(linearNode_32, "linearNode_32");
    auditor.nodeRegistered(linearNode_33, "linearNode_33");
    auditor.nodeRegistered(linearNode_34, "linearNode_34");
    auditor.nodeRegistered(linearNode_35, "linearNode_35");
    auditor.nodeRegistered(linearNode_36, "linearNode_36");
    auditor.nodeRegistered(linearNode_37, "linearNode_37");
    auditor.nodeRegistered(linearNode_38, "linearNode_38");
    auditor.nodeRegistered(linearNode_39, "linearNode_39");
    auditor.nodeRegistered(linearNode_40, "linearNode_40");
    auditor.nodeRegistered(linearNode_41, "linearNode_41");
    auditor.nodeRegistered(linearNode_42, "linearNode_42");
    auditor.nodeRegistered(linearNode_43, "linearNode_43");
    auditor.nodeRegistered(linearNode_44, "linearNode_44");
    auditor.nodeRegistered(linearNode_45, "linearNode_45");
    auditor.nodeRegistered(linearNode_46, "linearNode_46");
    auditor.nodeRegistered(linearNode_47, "linearNode_47");
    auditor.nodeRegistered(linearNode_48, "linearNode_48");
    auditor.nodeRegistered(linearNode_49, "linearNode_49");
    auditor.nodeRegistered(linearNode_50, "linearNode_50");
    auditor.nodeRegistered(linearNode_51, "linearNode_51");
    auditor.nodeRegistered(linearNode_52, "linearNode_52");
    auditor.nodeRegistered(linearNode_53, "linearNode_53");
    auditor.nodeRegistered(linearNode_54, "linearNode_54");
    auditor.nodeRegistered(linearNode_55, "linearNode_55");
    auditor.nodeRegistered(linearNode_56, "linearNode_56");
    auditor.nodeRegistered(linearNode_57, "linearNode_57");
    auditor.nodeRegistered(linearNode_58, "linearNode_58");
    auditor.nodeRegistered(linearNode_59, "linearNode_59");
    auditor.nodeRegistered(linearNode_60, "linearNode_60");
    auditor.nodeRegistered(linearNode_61, "linearNode_61");
    auditor.nodeRegistered(linearNode_62, "linearNode_62");
    auditor.nodeRegistered(linearNode_63, "linearNode_63");
    auditor.nodeRegistered(linearNode_64, "linearNode_64");
    auditor.nodeRegistered(linearNode_65, "linearNode_65");
    auditor.nodeRegistered(linearNode_66, "linearNode_66");
    auditor.nodeRegistered(linearNode_67, "linearNode_67");
    auditor.nodeRegistered(linearNode_68, "linearNode_68");
    auditor.nodeRegistered(linearNode_69, "linearNode_69");
    auditor.nodeRegistered(linearNode_70, "linearNode_70");
    auditor.nodeRegistered(linearNode_71, "linearNode_71");
    auditor.nodeRegistered(linearNode_72, "linearNode_72");
    auditor.nodeRegistered(linearNode_73, "linearNode_73");
    auditor.nodeRegistered(linearNode_74, "linearNode_74");
    auditor.nodeRegistered(linearNode_75, "linearNode_75");
    auditor.nodeRegistered(linearNode_76, "linearNode_76");
    auditor.nodeRegistered(linearNode_77, "linearNode_77");
    auditor.nodeRegistered(linearNode_78, "linearNode_78");
    auditor.nodeRegistered(linearNode_79, "linearNode_79");
    auditor.nodeRegistered(linearNode_80, "linearNode_80");
    auditor.nodeRegistered(linearNode_81, "linearNode_81");
    auditor.nodeRegistered(linearNode_82, "linearNode_82");
    auditor.nodeRegistered(linearNode_83, "linearNode_83");
    auditor.nodeRegistered(linearNode_84, "linearNode_84");
    auditor.nodeRegistered(linearNode_85, "linearNode_85");
    auditor.nodeRegistered(linearNode_86, "linearNode_86");
    auditor.nodeRegistered(linearNode_87, "linearNode_87");
    auditor.nodeRegistered(linearNode_88, "linearNode_88");
    auditor.nodeRegistered(linearNode_89, "linearNode_89");
    auditor.nodeRegistered(linearNode_90, "linearNode_90");
    auditor.nodeRegistered(linearNode_91, "linearNode_91");
    auditor.nodeRegistered(linearNode_92, "linearNode_92");
    auditor.nodeRegistered(linearNode_93, "linearNode_93");
    auditor.nodeRegistered(linearNode_94, "linearNode_94");
    auditor.nodeRegistered(linearNode_95, "linearNode_95");
    auditor.nodeRegistered(linearNode_96, "linearNode_96");
    auditor.nodeRegistered(linearNode_97, "linearNode_97");
    auditor.nodeRegistered(linearNode_98, "linearNode_98");
    auditor.nodeRegistered(linearNode_99, "linearNode_99");
    auditor.nodeRegistered(linearNode_100, "linearNode_100");
    auditor.nodeRegistered(rootLinearNode_101, "rootLinearNode_101");
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
  public DeepPath100Processor newInstance() {
    return new DeepPath100Processor();
  }

  @Override
  public DeepPath100Processor newInstance(Map<Object, Object> contextMap) {
    return new DeepPath100Processor();
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
