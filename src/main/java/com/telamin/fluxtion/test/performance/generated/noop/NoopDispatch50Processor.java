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
import com.telamin.fluxtion.test.performance.nodes.NoOpNode;
import com.telamin.fluxtion.test.performance.nodes.NoOpPublisherNode;
import com.telamin.fluxtion.test.performance.nodes.RootNoOpNode;
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
public class NoopDispatch50Processor
    implements CloneableDataFlow<NoopDispatch50Processor>,
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
  private final transient RootNoOpNode rootNoOpNode_51 = new RootNoOpNode();
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

  public NoopDispatch50Processor(Map<Object, Object> contextMap) {
    if (context != null) {
      context.replaceMappings(contextMap);
    }
    context.setClock(clock);
    serviceRegistry.setDataFlowContext(context);
    noOpNode_1.setUpstream1(noOpNode_2);
    noOpNode_1.value = 0.0;
    noOpNode_1.upstream1 = noOpNode_2;
    noOpNode_2.setUpstream1(noOpNode_3);
    noOpNode_2.value = 0.0;
    noOpNode_2.upstream1 = noOpNode_3;
    noOpNode_3.setUpstream1(noOpNode_4);
    noOpNode_3.value = 0.0;
    noOpNode_3.upstream1 = noOpNode_4;
    noOpNode_4.setUpstream1(noOpNode_5);
    noOpNode_4.value = 0.0;
    noOpNode_4.upstream1 = noOpNode_5;
    noOpNode_5.setUpstream1(noOpNode_6);
    noOpNode_5.value = 0.0;
    noOpNode_5.upstream1 = noOpNode_6;
    noOpNode_6.setUpstream1(noOpNode_7);
    noOpNode_6.value = 0.0;
    noOpNode_6.upstream1 = noOpNode_7;
    noOpNode_7.setUpstream1(noOpNode_8);
    noOpNode_7.value = 0.0;
    noOpNode_7.upstream1 = noOpNode_8;
    noOpNode_8.setUpstream1(noOpNode_9);
    noOpNode_8.value = 0.0;
    noOpNode_8.upstream1 = noOpNode_9;
    noOpNode_9.setUpstream1(noOpNode_10);
    noOpNode_9.value = 0.0;
    noOpNode_9.upstream1 = noOpNode_10;
    noOpNode_10.setUpstream1(noOpNode_11);
    noOpNode_10.value = 0.0;
    noOpNode_10.upstream1 = noOpNode_11;
    noOpNode_11.setUpstream1(noOpNode_12);
    noOpNode_11.value = 0.0;
    noOpNode_11.upstream1 = noOpNode_12;
    noOpNode_12.setUpstream1(noOpNode_13);
    noOpNode_12.value = 0.0;
    noOpNode_12.upstream1 = noOpNode_13;
    noOpNode_13.setUpstream1(noOpNode_14);
    noOpNode_13.value = 0.0;
    noOpNode_13.upstream1 = noOpNode_14;
    noOpNode_14.setUpstream1(noOpNode_15);
    noOpNode_14.value = 0.0;
    noOpNode_14.upstream1 = noOpNode_15;
    noOpNode_15.setUpstream1(noOpNode_16);
    noOpNode_15.value = 0.0;
    noOpNode_15.upstream1 = noOpNode_16;
    noOpNode_16.setUpstream1(noOpNode_17);
    noOpNode_16.value = 0.0;
    noOpNode_16.upstream1 = noOpNode_17;
    noOpNode_17.setUpstream1(noOpNode_18);
    noOpNode_17.value = 0.0;
    noOpNode_17.upstream1 = noOpNode_18;
    noOpNode_18.setUpstream1(noOpNode_19);
    noOpNode_18.value = 0.0;
    noOpNode_18.upstream1 = noOpNode_19;
    noOpNode_19.setUpstream1(noOpNode_20);
    noOpNode_19.value = 0.0;
    noOpNode_19.upstream1 = noOpNode_20;
    noOpNode_20.setUpstream1(noOpNode_21);
    noOpNode_20.value = 0.0;
    noOpNode_20.upstream1 = noOpNode_21;
    noOpNode_21.setUpstream1(noOpNode_22);
    noOpNode_21.value = 0.0;
    noOpNode_21.upstream1 = noOpNode_22;
    noOpNode_22.setUpstream1(noOpNode_23);
    noOpNode_22.value = 0.0;
    noOpNode_22.upstream1 = noOpNode_23;
    noOpNode_23.setUpstream1(noOpNode_24);
    noOpNode_23.value = 0.0;
    noOpNode_23.upstream1 = noOpNode_24;
    noOpNode_24.setUpstream1(noOpNode_25);
    noOpNode_24.value = 0.0;
    noOpNode_24.upstream1 = noOpNode_25;
    noOpNode_25.setUpstream1(noOpNode_26);
    noOpNode_25.value = 0.0;
    noOpNode_25.upstream1 = noOpNode_26;
    noOpNode_26.setUpstream1(noOpNode_27);
    noOpNode_26.value = 0.0;
    noOpNode_26.upstream1 = noOpNode_27;
    noOpNode_27.setUpstream1(noOpNode_28);
    noOpNode_27.value = 0.0;
    noOpNode_27.upstream1 = noOpNode_28;
    noOpNode_28.setUpstream1(noOpNode_29);
    noOpNode_28.value = 0.0;
    noOpNode_28.upstream1 = noOpNode_29;
    noOpNode_29.setUpstream1(noOpNode_30);
    noOpNode_29.value = 0.0;
    noOpNode_29.upstream1 = noOpNode_30;
    noOpNode_30.setUpstream1(noOpNode_31);
    noOpNode_30.value = 0.0;
    noOpNode_30.upstream1 = noOpNode_31;
    noOpNode_31.setUpstream1(noOpNode_32);
    noOpNode_31.value = 0.0;
    noOpNode_31.upstream1 = noOpNode_32;
    noOpNode_32.setUpstream1(noOpNode_33);
    noOpNode_32.value = 0.0;
    noOpNode_32.upstream1 = noOpNode_33;
    noOpNode_33.setUpstream1(noOpNode_34);
    noOpNode_33.value = 0.0;
    noOpNode_33.upstream1 = noOpNode_34;
    noOpNode_34.setUpstream1(noOpNode_35);
    noOpNode_34.value = 0.0;
    noOpNode_34.upstream1 = noOpNode_35;
    noOpNode_35.setUpstream1(noOpNode_36);
    noOpNode_35.value = 0.0;
    noOpNode_35.upstream1 = noOpNode_36;
    noOpNode_36.setUpstream1(noOpNode_37);
    noOpNode_36.value = 0.0;
    noOpNode_36.upstream1 = noOpNode_37;
    noOpNode_37.setUpstream1(noOpNode_38);
    noOpNode_37.value = 0.0;
    noOpNode_37.upstream1 = noOpNode_38;
    noOpNode_38.setUpstream1(noOpNode_39);
    noOpNode_38.value = 0.0;
    noOpNode_38.upstream1 = noOpNode_39;
    noOpNode_39.setUpstream1(noOpNode_40);
    noOpNode_39.value = 0.0;
    noOpNode_39.upstream1 = noOpNode_40;
    noOpNode_40.setUpstream1(noOpNode_41);
    noOpNode_40.value = 0.0;
    noOpNode_40.upstream1 = noOpNode_41;
    noOpNode_41.setUpstream1(noOpNode_42);
    noOpNode_41.value = 0.0;
    noOpNode_41.upstream1 = noOpNode_42;
    noOpNode_42.setUpstream1(noOpNode_43);
    noOpNode_42.value = 0.0;
    noOpNode_42.upstream1 = noOpNode_43;
    noOpNode_43.setUpstream1(noOpNode_44);
    noOpNode_43.value = 0.0;
    noOpNode_43.upstream1 = noOpNode_44;
    noOpNode_44.setUpstream1(noOpNode_45);
    noOpNode_44.value = 0.0;
    noOpNode_44.upstream1 = noOpNode_45;
    noOpNode_45.setUpstream1(noOpNode_46);
    noOpNode_45.value = 0.0;
    noOpNode_45.upstream1 = noOpNode_46;
    noOpNode_46.setUpstream1(noOpNode_47);
    noOpNode_46.value = 0.0;
    noOpNode_46.upstream1 = noOpNode_47;
    noOpNode_47.setUpstream1(noOpNode_48);
    noOpNode_47.value = 0.0;
    noOpNode_47.upstream1 = noOpNode_48;
    noOpNode_48.setUpstream1(noOpNode_49);
    noOpNode_48.value = 0.0;
    noOpNode_48.upstream1 = noOpNode_49;
    noOpNode_49.setUpstream1(noOpNode_50);
    noOpNode_49.value = 0.0;
    noOpNode_49.upstream1 = noOpNode_50;
    noOpNode_50.setUpstream1(rootNoOpNode_51);
    noOpNode_50.value = 0.0;
    noOpNode_50.upstream1 = rootNoOpNode_51;
    sink.setUpstream1(noOpNode_1);
    sink.upstream1 = noOpNode_1;
    sink.value = 0.0;
    rootNoOpNode_51.value = 0.0;
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

  public NoopDispatch50Processor() {
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
    rootNoOpNode_51.onMarketData(typedEvent);
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
      rootNoOpNode_51.onMarketData(typedEvent);
    }
  }

  public void triggerCalculation() {
    buffering = false;
    String typedEvent = "No event information - buffered dispatch";
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
    auditor.nodeRegistered(sink, "sink");
    auditor.nodeRegistered(rootNoOpNode_51, "rootNoOpNode_51");
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
  public NoopDispatch50Processor newInstance() {
    return new NoopDispatch50Processor();
  }

  @Override
  public NoopDispatch50Processor newInstance(Map<Object, Object> contextMap) {
    return new NoopDispatch50Processor();
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
