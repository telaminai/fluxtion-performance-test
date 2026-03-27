/*
 * Copyright: © 2025.  Gregory Higgins <greg.higgins@v12technology.com> - All Rights Reserved
 * This source code is protected under international copyright law.  All rights
 * reserved and protected by the copyright holders.
 * This file is confidential and only available to authorized individuals with the
 * permission of the copyright holders.  If you encounter this file and do not have
 * permission, please contact the copyright holders and delete this file.
 */
package com.telamin.fluxtion.test.performance.generated.hotpath;

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
import com.telamin.fluxtion.test.performance.nodes.HotPathAccumulatorNode;
import com.telamin.fluxtion.test.performance.nodes.HotPathFilteringNode;
import com.telamin.fluxtion.test.performance.nodes.HotPathPublisherNode;
import com.telamin.fluxtion.test.performance.nodes.HotPathRootNode;
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
public class HotPath32Processor
    implements CloneableDataFlow<HotPath32Processor>,
        /*--- @ExportService start ---*/
        @ExportService ServiceListener,
        /*--- @ExportService end ---*/
        DataFlow,
        InternalEventProcessor,
        BatchHandler {

  //Node declarations
  private final transient CallbackDispatcherImpl callbackDispatcher = new CallbackDispatcherImpl();
  public final transient Clock clock = new Clock();
  private final transient HotPathRootNode hotPathRootNode_34 = new HotPathRootNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_33 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_32 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_35 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_1 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_36 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_2 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_37 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_3 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_38 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_4 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_39 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_5 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_40 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_6 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_41 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_7 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_42 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_8 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_43 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_9 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_44 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_10 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_45 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_11 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_46 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_12 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_47 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_13 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_48 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_14 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_49 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_15 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_50 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_16 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_51 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_17 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_52 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_18 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_53 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_19 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_54 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_20 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_55 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_21 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_56 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_22 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_57 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_23 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_58 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_24 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_59 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_25 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_60 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_26 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_61 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_27 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_62 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_28 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_63 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_29 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_64 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_30 =
      new HotPathAccumulatorNode();
  private final transient HotPathFilteringNode hotPathFilteringNode_65 = new HotPathFilteringNode();
  private final transient HotPathAccumulatorNode hotPathAccumulatorNode_31 =
      new HotPathAccumulatorNode();
  public final transient NodeNameAuditor nodeNameLookup = new NodeNameAuditor();
  public final transient HotPathPublisherNode sink = new HotPathPublisherNode();
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
      new IdentityHashMap<>(34);
  private final transient IdentityHashMap<Object, Consumer<Boolean>> dirtyFlagUpdateMap =
      new IdentityHashMap<>(34);

  private boolean isDirty_hotPathAccumulatorNode_32 = false;
  private boolean isDirty_hotPathFilteringNode_33 = false;
  private boolean isDirty_hotPathFilteringNode_35 = false;
  private boolean isDirty_hotPathFilteringNode_36 = false;
  private boolean isDirty_hotPathFilteringNode_37 = false;
  private boolean isDirty_hotPathFilteringNode_38 = false;
  private boolean isDirty_hotPathFilteringNode_39 = false;
  private boolean isDirty_hotPathFilteringNode_40 = false;
  private boolean isDirty_hotPathFilteringNode_41 = false;
  private boolean isDirty_hotPathFilteringNode_42 = false;
  private boolean isDirty_hotPathFilteringNode_43 = false;
  private boolean isDirty_hotPathFilteringNode_44 = false;
  private boolean isDirty_hotPathFilteringNode_45 = false;
  private boolean isDirty_hotPathFilteringNode_46 = false;
  private boolean isDirty_hotPathFilteringNode_47 = false;
  private boolean isDirty_hotPathFilteringNode_48 = false;
  private boolean isDirty_hotPathFilteringNode_49 = false;
  private boolean isDirty_hotPathFilteringNode_50 = false;
  private boolean isDirty_hotPathFilteringNode_51 = false;
  private boolean isDirty_hotPathFilteringNode_52 = false;
  private boolean isDirty_hotPathFilteringNode_53 = false;
  private boolean isDirty_hotPathFilteringNode_54 = false;
  private boolean isDirty_hotPathFilteringNode_55 = false;
  private boolean isDirty_hotPathFilteringNode_56 = false;
  private boolean isDirty_hotPathFilteringNode_57 = false;
  private boolean isDirty_hotPathFilteringNode_58 = false;
  private boolean isDirty_hotPathFilteringNode_59 = false;
  private boolean isDirty_hotPathFilteringNode_60 = false;
  private boolean isDirty_hotPathFilteringNode_61 = false;
  private boolean isDirty_hotPathFilteringNode_62 = false;
  private boolean isDirty_hotPathFilteringNode_63 = false;
  private boolean isDirty_hotPathFilteringNode_64 = false;
  private boolean isDirty_hotPathFilteringNode_65 = false;
  private boolean isDirty_hotPathRootNode_34 = false;

  //Forked declarations

  //Filter constants

  //unknown event handler
  private Consumer unKnownEventHandler = (e) -> {};

  public HotPath32Processor(Map<Object, Object> contextMap) {
    if (context != null) {
      context.replaceMappings(contextMap);
    }
    context.setClock(clock);
    serviceRegistry.setDataFlowContext(context);
    hotPathAccumulatorNode_1.setUpstream1(hotPathFilteringNode_35);
    hotPathAccumulatorNode_1.value = 0.0;
    hotPathAccumulatorNode_1.upstream1 = hotPathFilteringNode_35;
    hotPathAccumulatorNode_2.setUpstream1(hotPathFilteringNode_36);
    hotPathAccumulatorNode_2.value = 0.0;
    hotPathAccumulatorNode_2.upstream1 = hotPathFilteringNode_36;
    hotPathAccumulatorNode_3.setUpstream1(hotPathFilteringNode_37);
    hotPathAccumulatorNode_3.value = 0.0;
    hotPathAccumulatorNode_3.upstream1 = hotPathFilteringNode_37;
    hotPathAccumulatorNode_4.setUpstream1(hotPathFilteringNode_38);
    hotPathAccumulatorNode_4.value = 0.0;
    hotPathAccumulatorNode_4.upstream1 = hotPathFilteringNode_38;
    hotPathAccumulatorNode_5.setUpstream1(hotPathFilteringNode_39);
    hotPathAccumulatorNode_5.value = 0.0;
    hotPathAccumulatorNode_5.upstream1 = hotPathFilteringNode_39;
    hotPathAccumulatorNode_6.setUpstream1(hotPathFilteringNode_40);
    hotPathAccumulatorNode_6.value = 0.0;
    hotPathAccumulatorNode_6.upstream1 = hotPathFilteringNode_40;
    hotPathAccumulatorNode_7.setUpstream1(hotPathFilteringNode_41);
    hotPathAccumulatorNode_7.value = 0.0;
    hotPathAccumulatorNode_7.upstream1 = hotPathFilteringNode_41;
    hotPathAccumulatorNode_8.setUpstream1(hotPathFilteringNode_42);
    hotPathAccumulatorNode_8.value = 0.0;
    hotPathAccumulatorNode_8.upstream1 = hotPathFilteringNode_42;
    hotPathAccumulatorNode_9.setUpstream1(hotPathFilteringNode_43);
    hotPathAccumulatorNode_9.value = 0.0;
    hotPathAccumulatorNode_9.upstream1 = hotPathFilteringNode_43;
    hotPathAccumulatorNode_10.setUpstream1(hotPathFilteringNode_44);
    hotPathAccumulatorNode_10.value = 0.0;
    hotPathAccumulatorNode_10.upstream1 = hotPathFilteringNode_44;
    hotPathAccumulatorNode_11.setUpstream1(hotPathFilteringNode_45);
    hotPathAccumulatorNode_11.value = 0.0;
    hotPathAccumulatorNode_11.upstream1 = hotPathFilteringNode_45;
    hotPathAccumulatorNode_12.setUpstream1(hotPathFilteringNode_46);
    hotPathAccumulatorNode_12.value = 0.0;
    hotPathAccumulatorNode_12.upstream1 = hotPathFilteringNode_46;
    hotPathAccumulatorNode_13.setUpstream1(hotPathFilteringNode_47);
    hotPathAccumulatorNode_13.value = 0.0;
    hotPathAccumulatorNode_13.upstream1 = hotPathFilteringNode_47;
    hotPathAccumulatorNode_14.setUpstream1(hotPathFilteringNode_48);
    hotPathAccumulatorNode_14.value = 0.0;
    hotPathAccumulatorNode_14.upstream1 = hotPathFilteringNode_48;
    hotPathAccumulatorNode_15.setUpstream1(hotPathFilteringNode_49);
    hotPathAccumulatorNode_15.value = 0.0;
    hotPathAccumulatorNode_15.upstream1 = hotPathFilteringNode_49;
    hotPathAccumulatorNode_16.setUpstream1(hotPathFilteringNode_50);
    hotPathAccumulatorNode_16.value = 0.0;
    hotPathAccumulatorNode_16.upstream1 = hotPathFilteringNode_50;
    hotPathAccumulatorNode_17.setUpstream1(hotPathFilteringNode_51);
    hotPathAccumulatorNode_17.value = 0.0;
    hotPathAccumulatorNode_17.upstream1 = hotPathFilteringNode_51;
    hotPathAccumulatorNode_18.setUpstream1(hotPathFilteringNode_52);
    hotPathAccumulatorNode_18.value = 0.0;
    hotPathAccumulatorNode_18.upstream1 = hotPathFilteringNode_52;
    hotPathAccumulatorNode_19.setUpstream1(hotPathFilteringNode_53);
    hotPathAccumulatorNode_19.value = 0.0;
    hotPathAccumulatorNode_19.upstream1 = hotPathFilteringNode_53;
    hotPathAccumulatorNode_20.setUpstream1(hotPathFilteringNode_54);
    hotPathAccumulatorNode_20.value = 0.0;
    hotPathAccumulatorNode_20.upstream1 = hotPathFilteringNode_54;
    hotPathAccumulatorNode_21.setUpstream1(hotPathFilteringNode_55);
    hotPathAccumulatorNode_21.value = 0.0;
    hotPathAccumulatorNode_21.upstream1 = hotPathFilteringNode_55;
    hotPathAccumulatorNode_22.setUpstream1(hotPathFilteringNode_56);
    hotPathAccumulatorNode_22.value = 0.0;
    hotPathAccumulatorNode_22.upstream1 = hotPathFilteringNode_56;
    hotPathAccumulatorNode_23.setUpstream1(hotPathFilteringNode_57);
    hotPathAccumulatorNode_23.value = 0.0;
    hotPathAccumulatorNode_23.upstream1 = hotPathFilteringNode_57;
    hotPathAccumulatorNode_24.setUpstream1(hotPathFilteringNode_58);
    hotPathAccumulatorNode_24.value = 0.0;
    hotPathAccumulatorNode_24.upstream1 = hotPathFilteringNode_58;
    hotPathAccumulatorNode_25.setUpstream1(hotPathFilteringNode_59);
    hotPathAccumulatorNode_25.value = 0.0;
    hotPathAccumulatorNode_25.upstream1 = hotPathFilteringNode_59;
    hotPathAccumulatorNode_26.setUpstream1(hotPathFilteringNode_60);
    hotPathAccumulatorNode_26.value = 0.0;
    hotPathAccumulatorNode_26.upstream1 = hotPathFilteringNode_60;
    hotPathAccumulatorNode_27.setUpstream1(hotPathFilteringNode_61);
    hotPathAccumulatorNode_27.value = 0.0;
    hotPathAccumulatorNode_27.upstream1 = hotPathFilteringNode_61;
    hotPathAccumulatorNode_28.setUpstream1(hotPathFilteringNode_62);
    hotPathAccumulatorNode_28.value = 0.0;
    hotPathAccumulatorNode_28.upstream1 = hotPathFilteringNode_62;
    hotPathAccumulatorNode_29.setUpstream1(hotPathFilteringNode_63);
    hotPathAccumulatorNode_29.value = 0.0;
    hotPathAccumulatorNode_29.upstream1 = hotPathFilteringNode_63;
    hotPathAccumulatorNode_30.setUpstream1(hotPathFilteringNode_64);
    hotPathAccumulatorNode_30.value = 0.0;
    hotPathAccumulatorNode_30.upstream1 = hotPathFilteringNode_64;
    hotPathAccumulatorNode_31.setUpstream1(hotPathFilteringNode_65);
    hotPathAccumulatorNode_31.value = 0.0;
    hotPathAccumulatorNode_31.upstream1 = hotPathFilteringNode_65;
    hotPathAccumulatorNode_32.setUpstream1(hotPathFilteringNode_33);
    hotPathAccumulatorNode_32.value = 0.0;
    hotPathAccumulatorNode_32.upstream1 = hotPathFilteringNode_33;
    hotPathFilteringNode_33.setUpstream1(hotPathRootNode_34);
    hotPathFilteringNode_33.value = 0.0;
    hotPathFilteringNode_33.upstream1 = hotPathRootNode_34;
    hotPathFilteringNode_35.setUpstream1(hotPathRootNode_34);
    hotPathFilteringNode_35.value = 0.0;
    hotPathFilteringNode_35.upstream1 = hotPathRootNode_34;
    hotPathFilteringNode_36.setUpstream1(hotPathRootNode_34);
    hotPathFilteringNode_36.value = 0.0;
    hotPathFilteringNode_36.upstream1 = hotPathRootNode_34;
    hotPathFilteringNode_37.setUpstream1(hotPathRootNode_34);
    hotPathFilteringNode_37.value = 0.0;
    hotPathFilteringNode_37.upstream1 = hotPathRootNode_34;
    hotPathFilteringNode_38.setUpstream1(hotPathRootNode_34);
    hotPathFilteringNode_38.value = 0.0;
    hotPathFilteringNode_38.upstream1 = hotPathRootNode_34;
    hotPathFilteringNode_39.setUpstream1(hotPathRootNode_34);
    hotPathFilteringNode_39.value = 0.0;
    hotPathFilteringNode_39.upstream1 = hotPathRootNode_34;
    hotPathFilteringNode_40.setUpstream1(hotPathRootNode_34);
    hotPathFilteringNode_40.value = 0.0;
    hotPathFilteringNode_40.upstream1 = hotPathRootNode_34;
    hotPathFilteringNode_41.setUpstream1(hotPathRootNode_34);
    hotPathFilteringNode_41.value = 0.0;
    hotPathFilteringNode_41.upstream1 = hotPathRootNode_34;
    hotPathFilteringNode_42.setUpstream1(hotPathRootNode_34);
    hotPathFilteringNode_42.value = 0.0;
    hotPathFilteringNode_42.upstream1 = hotPathRootNode_34;
    hotPathFilteringNode_43.setUpstream1(hotPathRootNode_34);
    hotPathFilteringNode_43.value = 0.0;
    hotPathFilteringNode_43.upstream1 = hotPathRootNode_34;
    hotPathFilteringNode_44.setUpstream1(hotPathRootNode_34);
    hotPathFilteringNode_44.value = 0.0;
    hotPathFilteringNode_44.upstream1 = hotPathRootNode_34;
    hotPathFilteringNode_45.setUpstream1(hotPathRootNode_34);
    hotPathFilteringNode_45.value = 0.0;
    hotPathFilteringNode_45.upstream1 = hotPathRootNode_34;
    hotPathFilteringNode_46.setUpstream1(hotPathRootNode_34);
    hotPathFilteringNode_46.value = 0.0;
    hotPathFilteringNode_46.upstream1 = hotPathRootNode_34;
    hotPathFilteringNode_47.setUpstream1(hotPathRootNode_34);
    hotPathFilteringNode_47.value = 0.0;
    hotPathFilteringNode_47.upstream1 = hotPathRootNode_34;
    hotPathFilteringNode_48.setUpstream1(hotPathRootNode_34);
    hotPathFilteringNode_48.value = 0.0;
    hotPathFilteringNode_48.upstream1 = hotPathRootNode_34;
    hotPathFilteringNode_49.setUpstream1(hotPathRootNode_34);
    hotPathFilteringNode_49.value = 0.0;
    hotPathFilteringNode_49.upstream1 = hotPathRootNode_34;
    hotPathFilteringNode_50.setUpstream1(hotPathRootNode_34);
    hotPathFilteringNode_50.value = 0.0;
    hotPathFilteringNode_50.upstream1 = hotPathRootNode_34;
    hotPathFilteringNode_51.setUpstream1(hotPathRootNode_34);
    hotPathFilteringNode_51.value = 0.0;
    hotPathFilteringNode_51.upstream1 = hotPathRootNode_34;
    hotPathFilteringNode_52.setUpstream1(hotPathRootNode_34);
    hotPathFilteringNode_52.value = 0.0;
    hotPathFilteringNode_52.upstream1 = hotPathRootNode_34;
    hotPathFilteringNode_53.setUpstream1(hotPathRootNode_34);
    hotPathFilteringNode_53.value = 0.0;
    hotPathFilteringNode_53.upstream1 = hotPathRootNode_34;
    hotPathFilteringNode_54.setUpstream1(hotPathRootNode_34);
    hotPathFilteringNode_54.value = 0.0;
    hotPathFilteringNode_54.upstream1 = hotPathRootNode_34;
    hotPathFilteringNode_55.setUpstream1(hotPathRootNode_34);
    hotPathFilteringNode_55.value = 0.0;
    hotPathFilteringNode_55.upstream1 = hotPathRootNode_34;
    hotPathFilteringNode_56.setUpstream1(hotPathRootNode_34);
    hotPathFilteringNode_56.value = 0.0;
    hotPathFilteringNode_56.upstream1 = hotPathRootNode_34;
    hotPathFilteringNode_57.setUpstream1(hotPathRootNode_34);
    hotPathFilteringNode_57.value = 0.0;
    hotPathFilteringNode_57.upstream1 = hotPathRootNode_34;
    hotPathFilteringNode_58.setUpstream1(hotPathRootNode_34);
    hotPathFilteringNode_58.value = 0.0;
    hotPathFilteringNode_58.upstream1 = hotPathRootNode_34;
    hotPathFilteringNode_59.setUpstream1(hotPathRootNode_34);
    hotPathFilteringNode_59.value = 0.0;
    hotPathFilteringNode_59.upstream1 = hotPathRootNode_34;
    hotPathFilteringNode_60.setUpstream1(hotPathRootNode_34);
    hotPathFilteringNode_60.value = 0.0;
    hotPathFilteringNode_60.upstream1 = hotPathRootNode_34;
    hotPathFilteringNode_61.setUpstream1(hotPathRootNode_34);
    hotPathFilteringNode_61.value = 0.0;
    hotPathFilteringNode_61.upstream1 = hotPathRootNode_34;
    hotPathFilteringNode_62.setUpstream1(hotPathRootNode_34);
    hotPathFilteringNode_62.value = 0.0;
    hotPathFilteringNode_62.upstream1 = hotPathRootNode_34;
    hotPathFilteringNode_63.setUpstream1(hotPathRootNode_34);
    hotPathFilteringNode_63.value = 0.0;
    hotPathFilteringNode_63.upstream1 = hotPathRootNode_34;
    hotPathFilteringNode_64.setUpstream1(hotPathRootNode_34);
    hotPathFilteringNode_64.value = 0.0;
    hotPathFilteringNode_64.upstream1 = hotPathRootNode_34;
    hotPathFilteringNode_65.setUpstream1(hotPathRootNode_34);
    hotPathFilteringNode_65.value = 0.0;
    hotPathFilteringNode_65.upstream1 = hotPathRootNode_34;
    sink.setUpstream1(hotPathAccumulatorNode_32);
    sink.upstream1 = hotPathAccumulatorNode_32;
    sink.value = 0.0;
    hotPathRootNode_34.value = 0.0;
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

  public HotPath32Processor() {
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
    isDirty_hotPathRootNode_34 = hotPathRootNode_34.onMarketData(typedEvent);
    if (guardCheck_hotPathFilteringNode_33()) {
      isDirty_hotPathFilteringNode_33 = hotPathFilteringNode_33.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_32()) {
      isDirty_hotPathAccumulatorNode_32 = hotPathAccumulatorNode_32.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_35()) {
      isDirty_hotPathFilteringNode_35 = hotPathFilteringNode_35.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_1()) {
      hotPathAccumulatorNode_1.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_36()) {
      isDirty_hotPathFilteringNode_36 = hotPathFilteringNode_36.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_2()) {
      hotPathAccumulatorNode_2.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_37()) {
      isDirty_hotPathFilteringNode_37 = hotPathFilteringNode_37.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_3()) {
      hotPathAccumulatorNode_3.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_38()) {
      isDirty_hotPathFilteringNode_38 = hotPathFilteringNode_38.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_4()) {
      hotPathAccumulatorNode_4.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_39()) {
      isDirty_hotPathFilteringNode_39 = hotPathFilteringNode_39.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_5()) {
      hotPathAccumulatorNode_5.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_40()) {
      isDirty_hotPathFilteringNode_40 = hotPathFilteringNode_40.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_6()) {
      hotPathAccumulatorNode_6.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_41()) {
      isDirty_hotPathFilteringNode_41 = hotPathFilteringNode_41.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_7()) {
      hotPathAccumulatorNode_7.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_42()) {
      isDirty_hotPathFilteringNode_42 = hotPathFilteringNode_42.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_8()) {
      hotPathAccumulatorNode_8.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_43()) {
      isDirty_hotPathFilteringNode_43 = hotPathFilteringNode_43.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_9()) {
      hotPathAccumulatorNode_9.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_44()) {
      isDirty_hotPathFilteringNode_44 = hotPathFilteringNode_44.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_10()) {
      hotPathAccumulatorNode_10.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_45()) {
      isDirty_hotPathFilteringNode_45 = hotPathFilteringNode_45.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_11()) {
      hotPathAccumulatorNode_11.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_46()) {
      isDirty_hotPathFilteringNode_46 = hotPathFilteringNode_46.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_12()) {
      hotPathAccumulatorNode_12.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_47()) {
      isDirty_hotPathFilteringNode_47 = hotPathFilteringNode_47.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_13()) {
      hotPathAccumulatorNode_13.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_48()) {
      isDirty_hotPathFilteringNode_48 = hotPathFilteringNode_48.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_14()) {
      hotPathAccumulatorNode_14.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_49()) {
      isDirty_hotPathFilteringNode_49 = hotPathFilteringNode_49.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_15()) {
      hotPathAccumulatorNode_15.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_50()) {
      isDirty_hotPathFilteringNode_50 = hotPathFilteringNode_50.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_16()) {
      hotPathAccumulatorNode_16.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_51()) {
      isDirty_hotPathFilteringNode_51 = hotPathFilteringNode_51.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_17()) {
      hotPathAccumulatorNode_17.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_52()) {
      isDirty_hotPathFilteringNode_52 = hotPathFilteringNode_52.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_18()) {
      hotPathAccumulatorNode_18.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_53()) {
      isDirty_hotPathFilteringNode_53 = hotPathFilteringNode_53.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_19()) {
      hotPathAccumulatorNode_19.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_54()) {
      isDirty_hotPathFilteringNode_54 = hotPathFilteringNode_54.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_20()) {
      hotPathAccumulatorNode_20.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_55()) {
      isDirty_hotPathFilteringNode_55 = hotPathFilteringNode_55.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_21()) {
      hotPathAccumulatorNode_21.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_56()) {
      isDirty_hotPathFilteringNode_56 = hotPathFilteringNode_56.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_22()) {
      hotPathAccumulatorNode_22.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_57()) {
      isDirty_hotPathFilteringNode_57 = hotPathFilteringNode_57.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_23()) {
      hotPathAccumulatorNode_23.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_58()) {
      isDirty_hotPathFilteringNode_58 = hotPathFilteringNode_58.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_24()) {
      hotPathAccumulatorNode_24.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_59()) {
      isDirty_hotPathFilteringNode_59 = hotPathFilteringNode_59.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_25()) {
      hotPathAccumulatorNode_25.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_60()) {
      isDirty_hotPathFilteringNode_60 = hotPathFilteringNode_60.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_26()) {
      hotPathAccumulatorNode_26.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_61()) {
      isDirty_hotPathFilteringNode_61 = hotPathFilteringNode_61.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_27()) {
      hotPathAccumulatorNode_27.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_62()) {
      isDirty_hotPathFilteringNode_62 = hotPathFilteringNode_62.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_28()) {
      hotPathAccumulatorNode_28.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_63()) {
      isDirty_hotPathFilteringNode_63 = hotPathFilteringNode_63.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_29()) {
      hotPathAccumulatorNode_29.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_64()) {
      isDirty_hotPathFilteringNode_64 = hotPathFilteringNode_64.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_30()) {
      hotPathAccumulatorNode_30.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_65()) {
      isDirty_hotPathFilteringNode_65 = hotPathFilteringNode_65.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_31()) {
      hotPathAccumulatorNode_31.onUpstream();
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
    } else if (event instanceof MarketDataEvent) {
      MarketDataEvent typedEvent = (MarketDataEvent) event;
      auditEvent(typedEvent);
      isDirty_hotPathRootNode_34 = hotPathRootNode_34.onMarketData(typedEvent);
    }
  }

  public void triggerCalculation() {
    buffering = false;
    String typedEvent = "No event information - buffered dispatch";
    if (guardCheck_hotPathFilteringNode_33()) {
      isDirty_hotPathFilteringNode_33 = hotPathFilteringNode_33.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_32()) {
      isDirty_hotPathAccumulatorNode_32 = hotPathAccumulatorNode_32.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_35()) {
      isDirty_hotPathFilteringNode_35 = hotPathFilteringNode_35.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_1()) {
      hotPathAccumulatorNode_1.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_36()) {
      isDirty_hotPathFilteringNode_36 = hotPathFilteringNode_36.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_2()) {
      hotPathAccumulatorNode_2.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_37()) {
      isDirty_hotPathFilteringNode_37 = hotPathFilteringNode_37.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_3()) {
      hotPathAccumulatorNode_3.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_38()) {
      isDirty_hotPathFilteringNode_38 = hotPathFilteringNode_38.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_4()) {
      hotPathAccumulatorNode_4.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_39()) {
      isDirty_hotPathFilteringNode_39 = hotPathFilteringNode_39.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_5()) {
      hotPathAccumulatorNode_5.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_40()) {
      isDirty_hotPathFilteringNode_40 = hotPathFilteringNode_40.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_6()) {
      hotPathAccumulatorNode_6.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_41()) {
      isDirty_hotPathFilteringNode_41 = hotPathFilteringNode_41.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_7()) {
      hotPathAccumulatorNode_7.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_42()) {
      isDirty_hotPathFilteringNode_42 = hotPathFilteringNode_42.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_8()) {
      hotPathAccumulatorNode_8.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_43()) {
      isDirty_hotPathFilteringNode_43 = hotPathFilteringNode_43.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_9()) {
      hotPathAccumulatorNode_9.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_44()) {
      isDirty_hotPathFilteringNode_44 = hotPathFilteringNode_44.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_10()) {
      hotPathAccumulatorNode_10.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_45()) {
      isDirty_hotPathFilteringNode_45 = hotPathFilteringNode_45.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_11()) {
      hotPathAccumulatorNode_11.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_46()) {
      isDirty_hotPathFilteringNode_46 = hotPathFilteringNode_46.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_12()) {
      hotPathAccumulatorNode_12.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_47()) {
      isDirty_hotPathFilteringNode_47 = hotPathFilteringNode_47.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_13()) {
      hotPathAccumulatorNode_13.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_48()) {
      isDirty_hotPathFilteringNode_48 = hotPathFilteringNode_48.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_14()) {
      hotPathAccumulatorNode_14.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_49()) {
      isDirty_hotPathFilteringNode_49 = hotPathFilteringNode_49.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_15()) {
      hotPathAccumulatorNode_15.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_50()) {
      isDirty_hotPathFilteringNode_50 = hotPathFilteringNode_50.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_16()) {
      hotPathAccumulatorNode_16.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_51()) {
      isDirty_hotPathFilteringNode_51 = hotPathFilteringNode_51.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_17()) {
      hotPathAccumulatorNode_17.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_52()) {
      isDirty_hotPathFilteringNode_52 = hotPathFilteringNode_52.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_18()) {
      hotPathAccumulatorNode_18.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_53()) {
      isDirty_hotPathFilteringNode_53 = hotPathFilteringNode_53.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_19()) {
      hotPathAccumulatorNode_19.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_54()) {
      isDirty_hotPathFilteringNode_54 = hotPathFilteringNode_54.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_20()) {
      hotPathAccumulatorNode_20.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_55()) {
      isDirty_hotPathFilteringNode_55 = hotPathFilteringNode_55.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_21()) {
      hotPathAccumulatorNode_21.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_56()) {
      isDirty_hotPathFilteringNode_56 = hotPathFilteringNode_56.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_22()) {
      hotPathAccumulatorNode_22.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_57()) {
      isDirty_hotPathFilteringNode_57 = hotPathFilteringNode_57.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_23()) {
      hotPathAccumulatorNode_23.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_58()) {
      isDirty_hotPathFilteringNode_58 = hotPathFilteringNode_58.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_24()) {
      hotPathAccumulatorNode_24.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_59()) {
      isDirty_hotPathFilteringNode_59 = hotPathFilteringNode_59.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_25()) {
      hotPathAccumulatorNode_25.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_60()) {
      isDirty_hotPathFilteringNode_60 = hotPathFilteringNode_60.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_26()) {
      hotPathAccumulatorNode_26.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_61()) {
      isDirty_hotPathFilteringNode_61 = hotPathFilteringNode_61.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_27()) {
      hotPathAccumulatorNode_27.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_62()) {
      isDirty_hotPathFilteringNode_62 = hotPathFilteringNode_62.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_28()) {
      hotPathAccumulatorNode_28.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_63()) {
      isDirty_hotPathFilteringNode_63 = hotPathFilteringNode_63.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_29()) {
      hotPathAccumulatorNode_29.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_64()) {
      isDirty_hotPathFilteringNode_64 = hotPathFilteringNode_64.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_30()) {
      hotPathAccumulatorNode_30.onUpstream();
    }
    if (guardCheck_hotPathFilteringNode_65()) {
      isDirty_hotPathFilteringNode_65 = hotPathFilteringNode_65.onUpstream();
    }
    if (guardCheck_hotPathAccumulatorNode_31()) {
      hotPathAccumulatorNode_31.onUpstream();
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
    auditor.nodeRegistered(hotPathAccumulatorNode_1, "hotPathAccumulatorNode_1");
    auditor.nodeRegistered(hotPathAccumulatorNode_2, "hotPathAccumulatorNode_2");
    auditor.nodeRegistered(hotPathAccumulatorNode_3, "hotPathAccumulatorNode_3");
    auditor.nodeRegistered(hotPathAccumulatorNode_4, "hotPathAccumulatorNode_4");
    auditor.nodeRegistered(hotPathAccumulatorNode_5, "hotPathAccumulatorNode_5");
    auditor.nodeRegistered(hotPathAccumulatorNode_6, "hotPathAccumulatorNode_6");
    auditor.nodeRegistered(hotPathAccumulatorNode_7, "hotPathAccumulatorNode_7");
    auditor.nodeRegistered(hotPathAccumulatorNode_8, "hotPathAccumulatorNode_8");
    auditor.nodeRegistered(hotPathAccumulatorNode_9, "hotPathAccumulatorNode_9");
    auditor.nodeRegistered(hotPathAccumulatorNode_10, "hotPathAccumulatorNode_10");
    auditor.nodeRegistered(hotPathAccumulatorNode_11, "hotPathAccumulatorNode_11");
    auditor.nodeRegistered(hotPathAccumulatorNode_12, "hotPathAccumulatorNode_12");
    auditor.nodeRegistered(hotPathAccumulatorNode_13, "hotPathAccumulatorNode_13");
    auditor.nodeRegistered(hotPathAccumulatorNode_14, "hotPathAccumulatorNode_14");
    auditor.nodeRegistered(hotPathAccumulatorNode_15, "hotPathAccumulatorNode_15");
    auditor.nodeRegistered(hotPathAccumulatorNode_16, "hotPathAccumulatorNode_16");
    auditor.nodeRegistered(hotPathAccumulatorNode_17, "hotPathAccumulatorNode_17");
    auditor.nodeRegistered(hotPathAccumulatorNode_18, "hotPathAccumulatorNode_18");
    auditor.nodeRegistered(hotPathAccumulatorNode_19, "hotPathAccumulatorNode_19");
    auditor.nodeRegistered(hotPathAccumulatorNode_20, "hotPathAccumulatorNode_20");
    auditor.nodeRegistered(hotPathAccumulatorNode_21, "hotPathAccumulatorNode_21");
    auditor.nodeRegistered(hotPathAccumulatorNode_22, "hotPathAccumulatorNode_22");
    auditor.nodeRegistered(hotPathAccumulatorNode_23, "hotPathAccumulatorNode_23");
    auditor.nodeRegistered(hotPathAccumulatorNode_24, "hotPathAccumulatorNode_24");
    auditor.nodeRegistered(hotPathAccumulatorNode_25, "hotPathAccumulatorNode_25");
    auditor.nodeRegistered(hotPathAccumulatorNode_26, "hotPathAccumulatorNode_26");
    auditor.nodeRegistered(hotPathAccumulatorNode_27, "hotPathAccumulatorNode_27");
    auditor.nodeRegistered(hotPathAccumulatorNode_28, "hotPathAccumulatorNode_28");
    auditor.nodeRegistered(hotPathAccumulatorNode_29, "hotPathAccumulatorNode_29");
    auditor.nodeRegistered(hotPathAccumulatorNode_30, "hotPathAccumulatorNode_30");
    auditor.nodeRegistered(hotPathAccumulatorNode_31, "hotPathAccumulatorNode_31");
    auditor.nodeRegistered(hotPathAccumulatorNode_32, "hotPathAccumulatorNode_32");
    auditor.nodeRegistered(hotPathFilteringNode_33, "hotPathFilteringNode_33");
    auditor.nodeRegistered(hotPathFilteringNode_35, "hotPathFilteringNode_35");
    auditor.nodeRegistered(hotPathFilteringNode_36, "hotPathFilteringNode_36");
    auditor.nodeRegistered(hotPathFilteringNode_37, "hotPathFilteringNode_37");
    auditor.nodeRegistered(hotPathFilteringNode_38, "hotPathFilteringNode_38");
    auditor.nodeRegistered(hotPathFilteringNode_39, "hotPathFilteringNode_39");
    auditor.nodeRegistered(hotPathFilteringNode_40, "hotPathFilteringNode_40");
    auditor.nodeRegistered(hotPathFilteringNode_41, "hotPathFilteringNode_41");
    auditor.nodeRegistered(hotPathFilteringNode_42, "hotPathFilteringNode_42");
    auditor.nodeRegistered(hotPathFilteringNode_43, "hotPathFilteringNode_43");
    auditor.nodeRegistered(hotPathFilteringNode_44, "hotPathFilteringNode_44");
    auditor.nodeRegistered(hotPathFilteringNode_45, "hotPathFilteringNode_45");
    auditor.nodeRegistered(hotPathFilteringNode_46, "hotPathFilteringNode_46");
    auditor.nodeRegistered(hotPathFilteringNode_47, "hotPathFilteringNode_47");
    auditor.nodeRegistered(hotPathFilteringNode_48, "hotPathFilteringNode_48");
    auditor.nodeRegistered(hotPathFilteringNode_49, "hotPathFilteringNode_49");
    auditor.nodeRegistered(hotPathFilteringNode_50, "hotPathFilteringNode_50");
    auditor.nodeRegistered(hotPathFilteringNode_51, "hotPathFilteringNode_51");
    auditor.nodeRegistered(hotPathFilteringNode_52, "hotPathFilteringNode_52");
    auditor.nodeRegistered(hotPathFilteringNode_53, "hotPathFilteringNode_53");
    auditor.nodeRegistered(hotPathFilteringNode_54, "hotPathFilteringNode_54");
    auditor.nodeRegistered(hotPathFilteringNode_55, "hotPathFilteringNode_55");
    auditor.nodeRegistered(hotPathFilteringNode_56, "hotPathFilteringNode_56");
    auditor.nodeRegistered(hotPathFilteringNode_57, "hotPathFilteringNode_57");
    auditor.nodeRegistered(hotPathFilteringNode_58, "hotPathFilteringNode_58");
    auditor.nodeRegistered(hotPathFilteringNode_59, "hotPathFilteringNode_59");
    auditor.nodeRegistered(hotPathFilteringNode_60, "hotPathFilteringNode_60");
    auditor.nodeRegistered(hotPathFilteringNode_61, "hotPathFilteringNode_61");
    auditor.nodeRegistered(hotPathFilteringNode_62, "hotPathFilteringNode_62");
    auditor.nodeRegistered(hotPathFilteringNode_63, "hotPathFilteringNode_63");
    auditor.nodeRegistered(hotPathFilteringNode_64, "hotPathFilteringNode_64");
    auditor.nodeRegistered(hotPathFilteringNode_65, "hotPathFilteringNode_65");
    auditor.nodeRegistered(sink, "sink");
    auditor.nodeRegistered(hotPathRootNode_34, "hotPathRootNode_34");
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
    isDirty_hotPathAccumulatorNode_32 = false;
    isDirty_hotPathFilteringNode_33 = false;
    isDirty_hotPathFilteringNode_35 = false;
    isDirty_hotPathFilteringNode_36 = false;
    isDirty_hotPathFilteringNode_37 = false;
    isDirty_hotPathFilteringNode_38 = false;
    isDirty_hotPathFilteringNode_39 = false;
    isDirty_hotPathFilteringNode_40 = false;
    isDirty_hotPathFilteringNode_41 = false;
    isDirty_hotPathFilteringNode_42 = false;
    isDirty_hotPathFilteringNode_43 = false;
    isDirty_hotPathFilteringNode_44 = false;
    isDirty_hotPathFilteringNode_45 = false;
    isDirty_hotPathFilteringNode_46 = false;
    isDirty_hotPathFilteringNode_47 = false;
    isDirty_hotPathFilteringNode_48 = false;
    isDirty_hotPathFilteringNode_49 = false;
    isDirty_hotPathFilteringNode_50 = false;
    isDirty_hotPathFilteringNode_51 = false;
    isDirty_hotPathFilteringNode_52 = false;
    isDirty_hotPathFilteringNode_53 = false;
    isDirty_hotPathFilteringNode_54 = false;
    isDirty_hotPathFilteringNode_55 = false;
    isDirty_hotPathFilteringNode_56 = false;
    isDirty_hotPathFilteringNode_57 = false;
    isDirty_hotPathFilteringNode_58 = false;
    isDirty_hotPathFilteringNode_59 = false;
    isDirty_hotPathFilteringNode_60 = false;
    isDirty_hotPathFilteringNode_61 = false;
    isDirty_hotPathFilteringNode_62 = false;
    isDirty_hotPathFilteringNode_63 = false;
    isDirty_hotPathFilteringNode_64 = false;
    isDirty_hotPathFilteringNode_65 = false;
    isDirty_hotPathRootNode_34 = false;
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
      dirtyFlagSupplierMap.put(hotPathAccumulatorNode_32, () -> isDirty_hotPathAccumulatorNode_32);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_33, () -> isDirty_hotPathFilteringNode_33);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_35, () -> isDirty_hotPathFilteringNode_35);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_36, () -> isDirty_hotPathFilteringNode_36);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_37, () -> isDirty_hotPathFilteringNode_37);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_38, () -> isDirty_hotPathFilteringNode_38);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_39, () -> isDirty_hotPathFilteringNode_39);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_40, () -> isDirty_hotPathFilteringNode_40);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_41, () -> isDirty_hotPathFilteringNode_41);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_42, () -> isDirty_hotPathFilteringNode_42);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_43, () -> isDirty_hotPathFilteringNode_43);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_44, () -> isDirty_hotPathFilteringNode_44);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_45, () -> isDirty_hotPathFilteringNode_45);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_46, () -> isDirty_hotPathFilteringNode_46);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_47, () -> isDirty_hotPathFilteringNode_47);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_48, () -> isDirty_hotPathFilteringNode_48);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_49, () -> isDirty_hotPathFilteringNode_49);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_50, () -> isDirty_hotPathFilteringNode_50);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_51, () -> isDirty_hotPathFilteringNode_51);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_52, () -> isDirty_hotPathFilteringNode_52);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_53, () -> isDirty_hotPathFilteringNode_53);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_54, () -> isDirty_hotPathFilteringNode_54);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_55, () -> isDirty_hotPathFilteringNode_55);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_56, () -> isDirty_hotPathFilteringNode_56);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_57, () -> isDirty_hotPathFilteringNode_57);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_58, () -> isDirty_hotPathFilteringNode_58);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_59, () -> isDirty_hotPathFilteringNode_59);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_60, () -> isDirty_hotPathFilteringNode_60);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_61, () -> isDirty_hotPathFilteringNode_61);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_62, () -> isDirty_hotPathFilteringNode_62);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_63, () -> isDirty_hotPathFilteringNode_63);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_64, () -> isDirty_hotPathFilteringNode_64);
      dirtyFlagSupplierMap.put(hotPathFilteringNode_65, () -> isDirty_hotPathFilteringNode_65);
      dirtyFlagSupplierMap.put(hotPathRootNode_34, () -> isDirty_hotPathRootNode_34);
    }
    return dirtyFlagSupplierMap.getOrDefault(node, DataFlow.ALWAYS_FALSE);
  }

  @Override
  public void setDirty(Object node, boolean dirtyFlag) {
    if (dirtyFlagUpdateMap.isEmpty()) {
      dirtyFlagUpdateMap.put(
          hotPathAccumulatorNode_32, (b) -> isDirty_hotPathAccumulatorNode_32 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_33, (b) -> isDirty_hotPathFilteringNode_33 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_35, (b) -> isDirty_hotPathFilteringNode_35 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_36, (b) -> isDirty_hotPathFilteringNode_36 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_37, (b) -> isDirty_hotPathFilteringNode_37 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_38, (b) -> isDirty_hotPathFilteringNode_38 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_39, (b) -> isDirty_hotPathFilteringNode_39 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_40, (b) -> isDirty_hotPathFilteringNode_40 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_41, (b) -> isDirty_hotPathFilteringNode_41 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_42, (b) -> isDirty_hotPathFilteringNode_42 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_43, (b) -> isDirty_hotPathFilteringNode_43 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_44, (b) -> isDirty_hotPathFilteringNode_44 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_45, (b) -> isDirty_hotPathFilteringNode_45 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_46, (b) -> isDirty_hotPathFilteringNode_46 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_47, (b) -> isDirty_hotPathFilteringNode_47 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_48, (b) -> isDirty_hotPathFilteringNode_48 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_49, (b) -> isDirty_hotPathFilteringNode_49 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_50, (b) -> isDirty_hotPathFilteringNode_50 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_51, (b) -> isDirty_hotPathFilteringNode_51 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_52, (b) -> isDirty_hotPathFilteringNode_52 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_53, (b) -> isDirty_hotPathFilteringNode_53 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_54, (b) -> isDirty_hotPathFilteringNode_54 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_55, (b) -> isDirty_hotPathFilteringNode_55 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_56, (b) -> isDirty_hotPathFilteringNode_56 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_57, (b) -> isDirty_hotPathFilteringNode_57 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_58, (b) -> isDirty_hotPathFilteringNode_58 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_59, (b) -> isDirty_hotPathFilteringNode_59 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_60, (b) -> isDirty_hotPathFilteringNode_60 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_61, (b) -> isDirty_hotPathFilteringNode_61 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_62, (b) -> isDirty_hotPathFilteringNode_62 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_63, (b) -> isDirty_hotPathFilteringNode_63 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_64, (b) -> isDirty_hotPathFilteringNode_64 = b);
      dirtyFlagUpdateMap.put(hotPathFilteringNode_65, (b) -> isDirty_hotPathFilteringNode_65 = b);
      dirtyFlagUpdateMap.put(hotPathRootNode_34, (b) -> isDirty_hotPathRootNode_34 = b);
    }
    dirtyFlagUpdateMap.get(node).accept(dirtyFlag);
  }

  private boolean guardCheck_hotPathAccumulatorNode_1() {
    return isDirty_hotPathFilteringNode_35;
  }

  private boolean guardCheck_hotPathAccumulatorNode_2() {
    return isDirty_hotPathFilteringNode_36;
  }

  private boolean guardCheck_hotPathAccumulatorNode_3() {
    return isDirty_hotPathFilteringNode_37;
  }

  private boolean guardCheck_hotPathAccumulatorNode_4() {
    return isDirty_hotPathFilteringNode_38;
  }

  private boolean guardCheck_hotPathAccumulatorNode_5() {
    return isDirty_hotPathFilteringNode_39;
  }

  private boolean guardCheck_hotPathAccumulatorNode_6() {
    return isDirty_hotPathFilteringNode_40;
  }

  private boolean guardCheck_hotPathAccumulatorNode_7() {
    return isDirty_hotPathFilteringNode_41;
  }

  private boolean guardCheck_hotPathAccumulatorNode_8() {
    return isDirty_hotPathFilteringNode_42;
  }

  private boolean guardCheck_hotPathAccumulatorNode_9() {
    return isDirty_hotPathFilteringNode_43;
  }

  private boolean guardCheck_hotPathAccumulatorNode_10() {
    return isDirty_hotPathFilteringNode_44;
  }

  private boolean guardCheck_hotPathAccumulatorNode_11() {
    return isDirty_hotPathFilteringNode_45;
  }

  private boolean guardCheck_hotPathAccumulatorNode_12() {
    return isDirty_hotPathFilteringNode_46;
  }

  private boolean guardCheck_hotPathAccumulatorNode_13() {
    return isDirty_hotPathFilteringNode_47;
  }

  private boolean guardCheck_hotPathAccumulatorNode_14() {
    return isDirty_hotPathFilteringNode_48;
  }

  private boolean guardCheck_hotPathAccumulatorNode_15() {
    return isDirty_hotPathFilteringNode_49;
  }

  private boolean guardCheck_hotPathAccumulatorNode_16() {
    return isDirty_hotPathFilteringNode_50;
  }

  private boolean guardCheck_hotPathAccumulatorNode_17() {
    return isDirty_hotPathFilteringNode_51;
  }

  private boolean guardCheck_hotPathAccumulatorNode_18() {
    return isDirty_hotPathFilteringNode_52;
  }

  private boolean guardCheck_hotPathAccumulatorNode_19() {
    return isDirty_hotPathFilteringNode_53;
  }

  private boolean guardCheck_hotPathAccumulatorNode_20() {
    return isDirty_hotPathFilteringNode_54;
  }

  private boolean guardCheck_hotPathAccumulatorNode_21() {
    return isDirty_hotPathFilteringNode_55;
  }

  private boolean guardCheck_hotPathAccumulatorNode_22() {
    return isDirty_hotPathFilteringNode_56;
  }

  private boolean guardCheck_hotPathAccumulatorNode_23() {
    return isDirty_hotPathFilteringNode_57;
  }

  private boolean guardCheck_hotPathAccumulatorNode_24() {
    return isDirty_hotPathFilteringNode_58;
  }

  private boolean guardCheck_hotPathAccumulatorNode_25() {
    return isDirty_hotPathFilteringNode_59;
  }

  private boolean guardCheck_hotPathAccumulatorNode_26() {
    return isDirty_hotPathFilteringNode_60;
  }

  private boolean guardCheck_hotPathAccumulatorNode_27() {
    return isDirty_hotPathFilteringNode_61;
  }

  private boolean guardCheck_hotPathAccumulatorNode_28() {
    return isDirty_hotPathFilteringNode_62;
  }

  private boolean guardCheck_hotPathAccumulatorNode_29() {
    return isDirty_hotPathFilteringNode_63;
  }

  private boolean guardCheck_hotPathAccumulatorNode_30() {
    return isDirty_hotPathFilteringNode_64;
  }

  private boolean guardCheck_hotPathAccumulatorNode_31() {
    return isDirty_hotPathFilteringNode_65;
  }

  private boolean guardCheck_hotPathAccumulatorNode_32() {
    return isDirty_hotPathFilteringNode_33;
  }

  private boolean guardCheck_hotPathFilteringNode_33() {
    return isDirty_hotPathRootNode_34;
  }

  private boolean guardCheck_hotPathFilteringNode_35() {
    return isDirty_hotPathRootNode_34;
  }

  private boolean guardCheck_hotPathFilteringNode_36() {
    return isDirty_hotPathRootNode_34;
  }

  private boolean guardCheck_hotPathFilteringNode_37() {
    return isDirty_hotPathRootNode_34;
  }

  private boolean guardCheck_hotPathFilteringNode_38() {
    return isDirty_hotPathRootNode_34;
  }

  private boolean guardCheck_hotPathFilteringNode_39() {
    return isDirty_hotPathRootNode_34;
  }

  private boolean guardCheck_hotPathFilteringNode_40() {
    return isDirty_hotPathRootNode_34;
  }

  private boolean guardCheck_hotPathFilteringNode_41() {
    return isDirty_hotPathRootNode_34;
  }

  private boolean guardCheck_hotPathFilteringNode_42() {
    return isDirty_hotPathRootNode_34;
  }

  private boolean guardCheck_hotPathFilteringNode_43() {
    return isDirty_hotPathRootNode_34;
  }

  private boolean guardCheck_hotPathFilteringNode_44() {
    return isDirty_hotPathRootNode_34;
  }

  private boolean guardCheck_hotPathFilteringNode_45() {
    return isDirty_hotPathRootNode_34;
  }

  private boolean guardCheck_hotPathFilteringNode_46() {
    return isDirty_hotPathRootNode_34;
  }

  private boolean guardCheck_hotPathFilteringNode_47() {
    return isDirty_hotPathRootNode_34;
  }

  private boolean guardCheck_hotPathFilteringNode_48() {
    return isDirty_hotPathRootNode_34;
  }

  private boolean guardCheck_hotPathFilteringNode_49() {
    return isDirty_hotPathRootNode_34;
  }

  private boolean guardCheck_hotPathFilteringNode_50() {
    return isDirty_hotPathRootNode_34;
  }

  private boolean guardCheck_hotPathFilteringNode_51() {
    return isDirty_hotPathRootNode_34;
  }

  private boolean guardCheck_hotPathFilteringNode_52() {
    return isDirty_hotPathRootNode_34;
  }

  private boolean guardCheck_hotPathFilteringNode_53() {
    return isDirty_hotPathRootNode_34;
  }

  private boolean guardCheck_hotPathFilteringNode_54() {
    return isDirty_hotPathRootNode_34;
  }

  private boolean guardCheck_hotPathFilteringNode_55() {
    return isDirty_hotPathRootNode_34;
  }

  private boolean guardCheck_hotPathFilteringNode_56() {
    return isDirty_hotPathRootNode_34;
  }

  private boolean guardCheck_hotPathFilteringNode_57() {
    return isDirty_hotPathRootNode_34;
  }

  private boolean guardCheck_hotPathFilteringNode_58() {
    return isDirty_hotPathRootNode_34;
  }

  private boolean guardCheck_hotPathFilteringNode_59() {
    return isDirty_hotPathRootNode_34;
  }

  private boolean guardCheck_hotPathFilteringNode_60() {
    return isDirty_hotPathRootNode_34;
  }

  private boolean guardCheck_hotPathFilteringNode_61() {
    return isDirty_hotPathRootNode_34;
  }

  private boolean guardCheck_hotPathFilteringNode_62() {
    return isDirty_hotPathRootNode_34;
  }

  private boolean guardCheck_hotPathFilteringNode_63() {
    return isDirty_hotPathRootNode_34;
  }

  private boolean guardCheck_hotPathFilteringNode_64() {
    return isDirty_hotPathRootNode_34;
  }

  private boolean guardCheck_hotPathFilteringNode_65() {
    return isDirty_hotPathRootNode_34;
  }

  private boolean guardCheck_sink() {
    return isDirty_hotPathAccumulatorNode_32;
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
  public HotPath32Processor newInstance() {
    return new HotPath32Processor();
  }

  @Override
  public HotPath32Processor newInstance(Map<Object, Object> contextMap) {
    return new HotPath32Processor();
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
