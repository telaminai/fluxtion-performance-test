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
public class DeepPath50Processor
    implements CloneableDataFlow<DeepPath50Processor>,
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
  private final transient RootLinearNode rootLinearNode_51 = new RootLinearNode();
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

  public DeepPath50Processor(Map<Object, Object> contextMap) {
    if (context != null) {
      context.replaceMappings(contextMap);
    }
    context.setClock(clock);
    serviceRegistry.setDataFlowContext(context);
    sink.setNodeId("sink");
    sink.setUpstream1(linearNode_1);
    linearNode_1.setNodeId("node_50");
    linearNode_1.setUpstream1(linearNode_2);
    linearNode_1.value = 0.0;
    linearNode_2.setNodeId("node_49");
    linearNode_2.setUpstream1(linearNode_3);
    linearNode_2.value = 0.0;
    linearNode_3.setNodeId("node_48");
    linearNode_3.setUpstream1(linearNode_4);
    linearNode_3.value = 0.0;
    linearNode_4.setNodeId("node_47");
    linearNode_4.setUpstream1(linearNode_5);
    linearNode_4.value = 0.0;
    linearNode_5.setNodeId("node_46");
    linearNode_5.setUpstream1(linearNode_6);
    linearNode_5.value = 0.0;
    linearNode_6.setNodeId("node_45");
    linearNode_6.setUpstream1(linearNode_7);
    linearNode_6.value = 0.0;
    linearNode_7.setNodeId("node_44");
    linearNode_7.setUpstream1(linearNode_8);
    linearNode_7.value = 0.0;
    linearNode_8.setNodeId("node_43");
    linearNode_8.setUpstream1(linearNode_9);
    linearNode_8.value = 0.0;
    linearNode_9.setNodeId("node_42");
    linearNode_9.setUpstream1(linearNode_10);
    linearNode_9.value = 0.0;
    linearNode_10.setNodeId("node_41");
    linearNode_10.setUpstream1(linearNode_11);
    linearNode_10.value = 0.0;
    linearNode_11.setNodeId("node_40");
    linearNode_11.setUpstream1(linearNode_12);
    linearNode_11.value = 0.0;
    linearNode_12.setNodeId("node_39");
    linearNode_12.setUpstream1(linearNode_13);
    linearNode_12.value = 0.0;
    linearNode_13.setNodeId("node_38");
    linearNode_13.setUpstream1(linearNode_14);
    linearNode_13.value = 0.0;
    linearNode_14.setNodeId("node_37");
    linearNode_14.setUpstream1(linearNode_15);
    linearNode_14.value = 0.0;
    linearNode_15.setNodeId("node_36");
    linearNode_15.setUpstream1(linearNode_16);
    linearNode_15.value = 0.0;
    linearNode_16.setNodeId("node_35");
    linearNode_16.setUpstream1(linearNode_17);
    linearNode_16.value = 0.0;
    linearNode_17.setNodeId("node_34");
    linearNode_17.setUpstream1(linearNode_18);
    linearNode_17.value = 0.0;
    linearNode_18.setNodeId("node_33");
    linearNode_18.setUpstream1(linearNode_19);
    linearNode_18.value = 0.0;
    linearNode_19.setNodeId("node_32");
    linearNode_19.setUpstream1(linearNode_20);
    linearNode_19.value = 0.0;
    linearNode_20.setNodeId("node_31");
    linearNode_20.setUpstream1(linearNode_21);
    linearNode_20.value = 0.0;
    linearNode_21.setNodeId("node_30");
    linearNode_21.setUpstream1(linearNode_22);
    linearNode_21.value = 0.0;
    linearNode_22.setNodeId("node_29");
    linearNode_22.setUpstream1(linearNode_23);
    linearNode_22.value = 0.0;
    linearNode_23.setNodeId("node_28");
    linearNode_23.setUpstream1(linearNode_24);
    linearNode_23.value = 0.0;
    linearNode_24.setNodeId("node_27");
    linearNode_24.setUpstream1(linearNode_25);
    linearNode_24.value = 0.0;
    linearNode_25.setNodeId("node_26");
    linearNode_25.setUpstream1(linearNode_26);
    linearNode_25.value = 0.0;
    linearNode_26.setNodeId("node_25");
    linearNode_26.setUpstream1(linearNode_27);
    linearNode_26.value = 0.0;
    linearNode_27.setNodeId("node_24");
    linearNode_27.setUpstream1(linearNode_28);
    linearNode_27.value = 0.0;
    linearNode_28.setNodeId("node_23");
    linearNode_28.setUpstream1(linearNode_29);
    linearNode_28.value = 0.0;
    linearNode_29.setNodeId("node_22");
    linearNode_29.setUpstream1(linearNode_30);
    linearNode_29.value = 0.0;
    linearNode_30.setNodeId("node_21");
    linearNode_30.setUpstream1(linearNode_31);
    linearNode_30.value = 0.0;
    linearNode_31.setNodeId("node_20");
    linearNode_31.setUpstream1(linearNode_32);
    linearNode_31.value = 0.0;
    linearNode_32.setNodeId("node_19");
    linearNode_32.setUpstream1(linearNode_33);
    linearNode_32.value = 0.0;
    linearNode_33.setNodeId("node_18");
    linearNode_33.setUpstream1(linearNode_34);
    linearNode_33.value = 0.0;
    linearNode_34.setNodeId("node_17");
    linearNode_34.setUpstream1(linearNode_35);
    linearNode_34.value = 0.0;
    linearNode_35.setNodeId("node_16");
    linearNode_35.setUpstream1(linearNode_36);
    linearNode_35.value = 0.0;
    linearNode_36.setNodeId("node_15");
    linearNode_36.setUpstream1(linearNode_37);
    linearNode_36.value = 0.0;
    linearNode_37.setNodeId("node_14");
    linearNode_37.setUpstream1(linearNode_38);
    linearNode_37.value = 0.0;
    linearNode_38.setNodeId("node_13");
    linearNode_38.setUpstream1(linearNode_39);
    linearNode_38.value = 0.0;
    linearNode_39.setNodeId("node_12");
    linearNode_39.setUpstream1(linearNode_40);
    linearNode_39.value = 0.0;
    linearNode_40.setNodeId("node_11");
    linearNode_40.setUpstream1(linearNode_41);
    linearNode_40.value = 0.0;
    linearNode_41.setNodeId("node_10");
    linearNode_41.setUpstream1(linearNode_42);
    linearNode_41.value = 0.0;
    linearNode_42.setNodeId("node_9");
    linearNode_42.setUpstream1(linearNode_43);
    linearNode_42.value = 0.0;
    linearNode_43.setNodeId("node_8");
    linearNode_43.setUpstream1(linearNode_44);
    linearNode_43.value = 0.0;
    linearNode_44.setNodeId("node_7");
    linearNode_44.setUpstream1(linearNode_45);
    linearNode_44.value = 0.0;
    linearNode_45.setNodeId("node_6");
    linearNode_45.setUpstream1(linearNode_46);
    linearNode_45.value = 0.0;
    linearNode_46.setNodeId("node_5");
    linearNode_46.setUpstream1(linearNode_47);
    linearNode_46.value = 0.0;
    linearNode_47.setNodeId("node_4");
    linearNode_47.setUpstream1(linearNode_48);
    linearNode_47.value = 0.0;
    linearNode_48.setNodeId("node_3");
    linearNode_48.setUpstream1(linearNode_49);
    linearNode_48.value = 0.0;
    linearNode_49.setNodeId("node_2");
    linearNode_49.setUpstream1(linearNode_50);
    linearNode_49.value = 0.0;
    linearNode_50.setNodeId("node_1");
    linearNode_50.setUpstream1(rootLinearNode_51);
    linearNode_50.value = 0.0;
    rootLinearNode_51.setNodeId("root");
    rootLinearNode_51.value = 0.0;
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

  public DeepPath50Processor() {
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
    rootLinearNode_51.onMarketData(typedEvent);
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
      rootLinearNode_51.onMarketData(typedEvent);
    }
  }

  public void triggerCalculation() {
    buffering = false;
    String typedEvent = "No event information - buffered dispatch";
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
    auditor.nodeRegistered(rootLinearNode_51, "rootLinearNode_51");
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
  public DeepPath50Processor newInstance() {
    return new DeepPath50Processor();
  }

  @Override
  public DeepPath50Processor newInstance(Map<Object, Object> contextMap) {
    return new DeepPath50Processor();
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
