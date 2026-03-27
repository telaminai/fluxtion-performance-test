/*
 * Copyright: © 2025.  Gregory Higgins <greg.higgins@v12technology.com> - All Rights Reserved
 * This source code is protected under international copyright law.  All rights
 * reserved and protected by the copyright holders.
 * This file is confidential and only available to authorized individuals with the
 * permission of the copyright holders.  If you encounter this file and do not have
 * permission, please contact the copyright holders and delete this file.
 */
package com.telamin.fluxtion.test.performance.generated.dirtyfilter;

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
import com.telamin.fluxtion.test.performance.nodes.DirtyFilterBaseNode;
import com.telamin.fluxtion.test.performance.nodes.DirtyFilterControlRootNode;
import com.telamin.fluxtion.test.performance.nodes.DirtyFilterFilteringNode;
import com.telamin.fluxtion.test.performance.nodes.DirtyFilterPublisherNode;
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
 * </ul>
 *
 * @author Greg Higgins
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public class DirtyFilter100Processor
    implements CloneableDataFlow<DirtyFilter100Processor>,
        /*--- @ExportService start ---*/
        @ExportService ServiceListener,
        /*--- @ExportService end ---*/
        DataFlow,
        InternalEventProcessor,
        BatchHandler {

  //Node declarations
  private final transient CallbackDispatcherImpl callbackDispatcher = new CallbackDispatcherImpl();
  public final transient Clock clock = new Clock();
  private final transient DirtyFilterControlRootNode dirtyFilterControlRootNode_101 =
      new DirtyFilterControlRootNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_100 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_99 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_98 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_97 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_96 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_95 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_94 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_93 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_92 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_91 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_90 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_89 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_88 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_87 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_86 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_85 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_84 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_83 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_82 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_81 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_80 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_79 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_78 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_77 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_76 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_75 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_74 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_73 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_72 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_71 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_70 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_69 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_68 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_67 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_66 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_65 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_64 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_63 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_62 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_61 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_60 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_59 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_58 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_57 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_56 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_55 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_54 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_53 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_52 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_51 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_50 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_49 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_48 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_47 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_46 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_45 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_44 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_43 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_42 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_41 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_40 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_39 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_38 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_37 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_36 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_35 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_34 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_33 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_32 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_31 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_30 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_29 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_28 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_27 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_26 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_25 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_24 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_23 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_22 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_21 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_20 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_19 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_18 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_17 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_16 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_15 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_14 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_13 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_12 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_11 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_10 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_9 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_8 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_7 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_6 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_5 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_4 = new DirtyFilterBaseNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_3 = new DirtyFilterBaseNode();
  private final transient DirtyFilterFilteringNode dirtyFilterFilteringNode_2 =
      new DirtyFilterFilteringNode();
  private final transient DirtyFilterBaseNode dirtyFilterBaseNode_1 = new DirtyFilterBaseNode();
  public final transient NodeNameAuditor nodeNameLookup = new NodeNameAuditor();
  public final transient DirtyFilterPublisherNode sink = new DirtyFilterPublisherNode();
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

  private boolean isDirty_dirtyFilterBaseNode_1 = false;
  private boolean isDirty_dirtyFilterBaseNode_3 = false;
  private boolean isDirty_dirtyFilterBaseNode_4 = false;
  private boolean isDirty_dirtyFilterBaseNode_6 = false;
  private boolean isDirty_dirtyFilterBaseNode_7 = false;
  private boolean isDirty_dirtyFilterBaseNode_9 = false;
  private boolean isDirty_dirtyFilterBaseNode_10 = false;
  private boolean isDirty_dirtyFilterBaseNode_12 = false;
  private boolean isDirty_dirtyFilterBaseNode_13 = false;
  private boolean isDirty_dirtyFilterBaseNode_15 = false;
  private boolean isDirty_dirtyFilterBaseNode_16 = false;
  private boolean isDirty_dirtyFilterBaseNode_18 = false;
  private boolean isDirty_dirtyFilterBaseNode_19 = false;
  private boolean isDirty_dirtyFilterBaseNode_21 = false;
  private boolean isDirty_dirtyFilterBaseNode_22 = false;
  private boolean isDirty_dirtyFilterBaseNode_24 = false;
  private boolean isDirty_dirtyFilterBaseNode_25 = false;
  private boolean isDirty_dirtyFilterBaseNode_27 = false;
  private boolean isDirty_dirtyFilterBaseNode_28 = false;
  private boolean isDirty_dirtyFilterBaseNode_30 = false;
  private boolean isDirty_dirtyFilterBaseNode_31 = false;
  private boolean isDirty_dirtyFilterBaseNode_33 = false;
  private boolean isDirty_dirtyFilterBaseNode_34 = false;
  private boolean isDirty_dirtyFilterBaseNode_36 = false;
  private boolean isDirty_dirtyFilterBaseNode_37 = false;
  private boolean isDirty_dirtyFilterBaseNode_39 = false;
  private boolean isDirty_dirtyFilterBaseNode_40 = false;
  private boolean isDirty_dirtyFilterBaseNode_42 = false;
  private boolean isDirty_dirtyFilterBaseNode_43 = false;
  private boolean isDirty_dirtyFilterBaseNode_45 = false;
  private boolean isDirty_dirtyFilterBaseNode_46 = false;
  private boolean isDirty_dirtyFilterBaseNode_48 = false;
  private boolean isDirty_dirtyFilterBaseNode_49 = false;
  private boolean isDirty_dirtyFilterBaseNode_51 = false;
  private boolean isDirty_dirtyFilterBaseNode_52 = false;
  private boolean isDirty_dirtyFilterBaseNode_54 = false;
  private boolean isDirty_dirtyFilterBaseNode_55 = false;
  private boolean isDirty_dirtyFilterBaseNode_57 = false;
  private boolean isDirty_dirtyFilterBaseNode_58 = false;
  private boolean isDirty_dirtyFilterBaseNode_60 = false;
  private boolean isDirty_dirtyFilterBaseNode_61 = false;
  private boolean isDirty_dirtyFilterBaseNode_63 = false;
  private boolean isDirty_dirtyFilterBaseNode_64 = false;
  private boolean isDirty_dirtyFilterBaseNode_66 = false;
  private boolean isDirty_dirtyFilterBaseNode_67 = false;
  private boolean isDirty_dirtyFilterBaseNode_69 = false;
  private boolean isDirty_dirtyFilterBaseNode_70 = false;
  private boolean isDirty_dirtyFilterBaseNode_72 = false;
  private boolean isDirty_dirtyFilterBaseNode_73 = false;
  private boolean isDirty_dirtyFilterBaseNode_75 = false;
  private boolean isDirty_dirtyFilterBaseNode_76 = false;
  private boolean isDirty_dirtyFilterBaseNode_78 = false;
  private boolean isDirty_dirtyFilterBaseNode_79 = false;
  private boolean isDirty_dirtyFilterBaseNode_81 = false;
  private boolean isDirty_dirtyFilterBaseNode_82 = false;
  private boolean isDirty_dirtyFilterBaseNode_84 = false;
  private boolean isDirty_dirtyFilterBaseNode_85 = false;
  private boolean isDirty_dirtyFilterBaseNode_87 = false;
  private boolean isDirty_dirtyFilterBaseNode_88 = false;
  private boolean isDirty_dirtyFilterBaseNode_90 = false;
  private boolean isDirty_dirtyFilterBaseNode_91 = false;
  private boolean isDirty_dirtyFilterBaseNode_93 = false;
  private boolean isDirty_dirtyFilterBaseNode_94 = false;
  private boolean isDirty_dirtyFilterBaseNode_96 = false;
  private boolean isDirty_dirtyFilterBaseNode_97 = false;
  private boolean isDirty_dirtyFilterBaseNode_99 = false;
  private boolean isDirty_dirtyFilterBaseNode_100 = false;
  private boolean isDirty_dirtyFilterControlRootNode_101 = false;
  private boolean isDirty_dirtyFilterFilteringNode_2 = false;
  private boolean isDirty_dirtyFilterFilteringNode_5 = false;
  private boolean isDirty_dirtyFilterFilteringNode_8 = false;
  private boolean isDirty_dirtyFilterFilteringNode_11 = false;
  private boolean isDirty_dirtyFilterFilteringNode_14 = false;
  private boolean isDirty_dirtyFilterFilteringNode_17 = false;
  private boolean isDirty_dirtyFilterFilteringNode_20 = false;
  private boolean isDirty_dirtyFilterFilteringNode_23 = false;
  private boolean isDirty_dirtyFilterFilteringNode_26 = false;
  private boolean isDirty_dirtyFilterFilteringNode_29 = false;
  private boolean isDirty_dirtyFilterFilteringNode_32 = false;
  private boolean isDirty_dirtyFilterFilteringNode_35 = false;
  private boolean isDirty_dirtyFilterFilteringNode_38 = false;
  private boolean isDirty_dirtyFilterFilteringNode_41 = false;
  private boolean isDirty_dirtyFilterFilteringNode_44 = false;
  private boolean isDirty_dirtyFilterFilteringNode_47 = false;
  private boolean isDirty_dirtyFilterFilteringNode_50 = false;
  private boolean isDirty_dirtyFilterFilteringNode_53 = false;
  private boolean isDirty_dirtyFilterFilteringNode_56 = false;
  private boolean isDirty_dirtyFilterFilteringNode_59 = false;
  private boolean isDirty_dirtyFilterFilteringNode_62 = false;
  private boolean isDirty_dirtyFilterFilteringNode_65 = false;
  private boolean isDirty_dirtyFilterFilteringNode_68 = false;
  private boolean isDirty_dirtyFilterFilteringNode_71 = false;
  private boolean isDirty_dirtyFilterFilteringNode_74 = false;
  private boolean isDirty_dirtyFilterFilteringNode_77 = false;
  private boolean isDirty_dirtyFilterFilteringNode_80 = false;
  private boolean isDirty_dirtyFilterFilteringNode_83 = false;
  private boolean isDirty_dirtyFilterFilteringNode_86 = false;
  private boolean isDirty_dirtyFilterFilteringNode_89 = false;
  private boolean isDirty_dirtyFilterFilteringNode_92 = false;
  private boolean isDirty_dirtyFilterFilteringNode_95 = false;
  private boolean isDirty_dirtyFilterFilteringNode_98 = false;

  //Forked declarations

  //Filter constants

  //unknown event handler
  private Consumer unKnownEventHandler = (e) -> {};

  public DirtyFilter100Processor(Map<Object, Object> contextMap) {
    if (context != null) {
      context.replaceMappings(contextMap);
    }
    context.setClock(clock);
    serviceRegistry.setDataFlowContext(context);
    dirtyFilterBaseNode_1.setUpstream1(dirtyFilterFilteringNode_2);
    dirtyFilterBaseNode_1.value = 0.0;
    dirtyFilterBaseNode_1.upstream1 = dirtyFilterFilteringNode_2;
    dirtyFilterBaseNode_3.setUpstream1(dirtyFilterBaseNode_4);
    dirtyFilterBaseNode_3.value = 0.0;
    dirtyFilterBaseNode_3.upstream1 = dirtyFilterBaseNode_4;
    dirtyFilterBaseNode_4.setUpstream1(dirtyFilterFilteringNode_5);
    dirtyFilterBaseNode_4.value = 0.0;
    dirtyFilterBaseNode_4.upstream1 = dirtyFilterFilteringNode_5;
    dirtyFilterBaseNode_6.setUpstream1(dirtyFilterBaseNode_7);
    dirtyFilterBaseNode_6.value = 0.0;
    dirtyFilterBaseNode_6.upstream1 = dirtyFilterBaseNode_7;
    dirtyFilterBaseNode_7.setUpstream1(dirtyFilterFilteringNode_8);
    dirtyFilterBaseNode_7.value = 0.0;
    dirtyFilterBaseNode_7.upstream1 = dirtyFilterFilteringNode_8;
    dirtyFilterBaseNode_9.setUpstream1(dirtyFilterBaseNode_10);
    dirtyFilterBaseNode_9.value = 0.0;
    dirtyFilterBaseNode_9.upstream1 = dirtyFilterBaseNode_10;
    dirtyFilterBaseNode_10.setUpstream1(dirtyFilterFilteringNode_11);
    dirtyFilterBaseNode_10.value = 0.0;
    dirtyFilterBaseNode_10.upstream1 = dirtyFilterFilteringNode_11;
    dirtyFilterBaseNode_12.setUpstream1(dirtyFilterBaseNode_13);
    dirtyFilterBaseNode_12.value = 0.0;
    dirtyFilterBaseNode_12.upstream1 = dirtyFilterBaseNode_13;
    dirtyFilterBaseNode_13.setUpstream1(dirtyFilterFilteringNode_14);
    dirtyFilterBaseNode_13.value = 0.0;
    dirtyFilterBaseNode_13.upstream1 = dirtyFilterFilteringNode_14;
    dirtyFilterBaseNode_15.setUpstream1(dirtyFilterBaseNode_16);
    dirtyFilterBaseNode_15.value = 0.0;
    dirtyFilterBaseNode_15.upstream1 = dirtyFilterBaseNode_16;
    dirtyFilterBaseNode_16.setUpstream1(dirtyFilterFilteringNode_17);
    dirtyFilterBaseNode_16.value = 0.0;
    dirtyFilterBaseNode_16.upstream1 = dirtyFilterFilteringNode_17;
    dirtyFilterBaseNode_18.setUpstream1(dirtyFilterBaseNode_19);
    dirtyFilterBaseNode_18.value = 0.0;
    dirtyFilterBaseNode_18.upstream1 = dirtyFilterBaseNode_19;
    dirtyFilterBaseNode_19.setUpstream1(dirtyFilterFilteringNode_20);
    dirtyFilterBaseNode_19.value = 0.0;
    dirtyFilterBaseNode_19.upstream1 = dirtyFilterFilteringNode_20;
    dirtyFilterBaseNode_21.setUpstream1(dirtyFilterBaseNode_22);
    dirtyFilterBaseNode_21.value = 0.0;
    dirtyFilterBaseNode_21.upstream1 = dirtyFilterBaseNode_22;
    dirtyFilterBaseNode_22.setUpstream1(dirtyFilterFilteringNode_23);
    dirtyFilterBaseNode_22.value = 0.0;
    dirtyFilterBaseNode_22.upstream1 = dirtyFilterFilteringNode_23;
    dirtyFilterBaseNode_24.setUpstream1(dirtyFilterBaseNode_25);
    dirtyFilterBaseNode_24.value = 0.0;
    dirtyFilterBaseNode_24.upstream1 = dirtyFilterBaseNode_25;
    dirtyFilterBaseNode_25.setUpstream1(dirtyFilterFilteringNode_26);
    dirtyFilterBaseNode_25.value = 0.0;
    dirtyFilterBaseNode_25.upstream1 = dirtyFilterFilteringNode_26;
    dirtyFilterBaseNode_27.setUpstream1(dirtyFilterBaseNode_28);
    dirtyFilterBaseNode_27.value = 0.0;
    dirtyFilterBaseNode_27.upstream1 = dirtyFilterBaseNode_28;
    dirtyFilterBaseNode_28.setUpstream1(dirtyFilterFilteringNode_29);
    dirtyFilterBaseNode_28.value = 0.0;
    dirtyFilterBaseNode_28.upstream1 = dirtyFilterFilteringNode_29;
    dirtyFilterBaseNode_30.setUpstream1(dirtyFilterBaseNode_31);
    dirtyFilterBaseNode_30.value = 0.0;
    dirtyFilterBaseNode_30.upstream1 = dirtyFilterBaseNode_31;
    dirtyFilterBaseNode_31.setUpstream1(dirtyFilterFilteringNode_32);
    dirtyFilterBaseNode_31.value = 0.0;
    dirtyFilterBaseNode_31.upstream1 = dirtyFilterFilteringNode_32;
    dirtyFilterBaseNode_33.setUpstream1(dirtyFilterBaseNode_34);
    dirtyFilterBaseNode_33.value = 0.0;
    dirtyFilterBaseNode_33.upstream1 = dirtyFilterBaseNode_34;
    dirtyFilterBaseNode_34.setUpstream1(dirtyFilterFilteringNode_35);
    dirtyFilterBaseNode_34.value = 0.0;
    dirtyFilterBaseNode_34.upstream1 = dirtyFilterFilteringNode_35;
    dirtyFilterBaseNode_36.setUpstream1(dirtyFilterBaseNode_37);
    dirtyFilterBaseNode_36.value = 0.0;
    dirtyFilterBaseNode_36.upstream1 = dirtyFilterBaseNode_37;
    dirtyFilterBaseNode_37.setUpstream1(dirtyFilterFilteringNode_38);
    dirtyFilterBaseNode_37.value = 0.0;
    dirtyFilterBaseNode_37.upstream1 = dirtyFilterFilteringNode_38;
    dirtyFilterBaseNode_39.setUpstream1(dirtyFilterBaseNode_40);
    dirtyFilterBaseNode_39.value = 0.0;
    dirtyFilterBaseNode_39.upstream1 = dirtyFilterBaseNode_40;
    dirtyFilterBaseNode_40.setUpstream1(dirtyFilterFilteringNode_41);
    dirtyFilterBaseNode_40.value = 0.0;
    dirtyFilterBaseNode_40.upstream1 = dirtyFilterFilteringNode_41;
    dirtyFilterBaseNode_42.setUpstream1(dirtyFilterBaseNode_43);
    dirtyFilterBaseNode_42.value = 0.0;
    dirtyFilterBaseNode_42.upstream1 = dirtyFilterBaseNode_43;
    dirtyFilterBaseNode_43.setUpstream1(dirtyFilterFilteringNode_44);
    dirtyFilterBaseNode_43.value = 0.0;
    dirtyFilterBaseNode_43.upstream1 = dirtyFilterFilteringNode_44;
    dirtyFilterBaseNode_45.setUpstream1(dirtyFilterBaseNode_46);
    dirtyFilterBaseNode_45.value = 0.0;
    dirtyFilterBaseNode_45.upstream1 = dirtyFilterBaseNode_46;
    dirtyFilterBaseNode_46.setUpstream1(dirtyFilterFilteringNode_47);
    dirtyFilterBaseNode_46.value = 0.0;
    dirtyFilterBaseNode_46.upstream1 = dirtyFilterFilteringNode_47;
    dirtyFilterBaseNode_48.setUpstream1(dirtyFilterBaseNode_49);
    dirtyFilterBaseNode_48.value = 0.0;
    dirtyFilterBaseNode_48.upstream1 = dirtyFilterBaseNode_49;
    dirtyFilterBaseNode_49.setUpstream1(dirtyFilterFilteringNode_50);
    dirtyFilterBaseNode_49.value = 0.0;
    dirtyFilterBaseNode_49.upstream1 = dirtyFilterFilteringNode_50;
    dirtyFilterBaseNode_51.setUpstream1(dirtyFilterBaseNode_52);
    dirtyFilterBaseNode_51.value = 0.0;
    dirtyFilterBaseNode_51.upstream1 = dirtyFilterBaseNode_52;
    dirtyFilterBaseNode_52.setUpstream1(dirtyFilterFilteringNode_53);
    dirtyFilterBaseNode_52.value = 0.0;
    dirtyFilterBaseNode_52.upstream1 = dirtyFilterFilteringNode_53;
    dirtyFilterBaseNode_54.setUpstream1(dirtyFilterBaseNode_55);
    dirtyFilterBaseNode_54.value = 0.0;
    dirtyFilterBaseNode_54.upstream1 = dirtyFilterBaseNode_55;
    dirtyFilterBaseNode_55.setUpstream1(dirtyFilterFilteringNode_56);
    dirtyFilterBaseNode_55.value = 0.0;
    dirtyFilterBaseNode_55.upstream1 = dirtyFilterFilteringNode_56;
    dirtyFilterBaseNode_57.setUpstream1(dirtyFilterBaseNode_58);
    dirtyFilterBaseNode_57.value = 0.0;
    dirtyFilterBaseNode_57.upstream1 = dirtyFilterBaseNode_58;
    dirtyFilterBaseNode_58.setUpstream1(dirtyFilterFilteringNode_59);
    dirtyFilterBaseNode_58.value = 0.0;
    dirtyFilterBaseNode_58.upstream1 = dirtyFilterFilteringNode_59;
    dirtyFilterBaseNode_60.setUpstream1(dirtyFilterBaseNode_61);
    dirtyFilterBaseNode_60.value = 0.0;
    dirtyFilterBaseNode_60.upstream1 = dirtyFilterBaseNode_61;
    dirtyFilterBaseNode_61.setUpstream1(dirtyFilterFilteringNode_62);
    dirtyFilterBaseNode_61.value = 0.0;
    dirtyFilterBaseNode_61.upstream1 = dirtyFilterFilteringNode_62;
    dirtyFilterBaseNode_63.setUpstream1(dirtyFilterBaseNode_64);
    dirtyFilterBaseNode_63.value = 0.0;
    dirtyFilterBaseNode_63.upstream1 = dirtyFilterBaseNode_64;
    dirtyFilterBaseNode_64.setUpstream1(dirtyFilterFilteringNode_65);
    dirtyFilterBaseNode_64.value = 0.0;
    dirtyFilterBaseNode_64.upstream1 = dirtyFilterFilteringNode_65;
    dirtyFilterBaseNode_66.setUpstream1(dirtyFilterBaseNode_67);
    dirtyFilterBaseNode_66.value = 0.0;
    dirtyFilterBaseNode_66.upstream1 = dirtyFilterBaseNode_67;
    dirtyFilterBaseNode_67.setUpstream1(dirtyFilterFilteringNode_68);
    dirtyFilterBaseNode_67.value = 0.0;
    dirtyFilterBaseNode_67.upstream1 = dirtyFilterFilteringNode_68;
    dirtyFilterBaseNode_69.setUpstream1(dirtyFilterBaseNode_70);
    dirtyFilterBaseNode_69.value = 0.0;
    dirtyFilterBaseNode_69.upstream1 = dirtyFilterBaseNode_70;
    dirtyFilterBaseNode_70.setUpstream1(dirtyFilterFilteringNode_71);
    dirtyFilterBaseNode_70.value = 0.0;
    dirtyFilterBaseNode_70.upstream1 = dirtyFilterFilteringNode_71;
    dirtyFilterBaseNode_72.setUpstream1(dirtyFilterBaseNode_73);
    dirtyFilterBaseNode_72.value = 0.0;
    dirtyFilterBaseNode_72.upstream1 = dirtyFilterBaseNode_73;
    dirtyFilterBaseNode_73.setUpstream1(dirtyFilterFilteringNode_74);
    dirtyFilterBaseNode_73.value = 0.0;
    dirtyFilterBaseNode_73.upstream1 = dirtyFilterFilteringNode_74;
    dirtyFilterBaseNode_75.setUpstream1(dirtyFilterBaseNode_76);
    dirtyFilterBaseNode_75.value = 0.0;
    dirtyFilterBaseNode_75.upstream1 = dirtyFilterBaseNode_76;
    dirtyFilterBaseNode_76.setUpstream1(dirtyFilterFilteringNode_77);
    dirtyFilterBaseNode_76.value = 0.0;
    dirtyFilterBaseNode_76.upstream1 = dirtyFilterFilteringNode_77;
    dirtyFilterBaseNode_78.setUpstream1(dirtyFilterBaseNode_79);
    dirtyFilterBaseNode_78.value = 0.0;
    dirtyFilterBaseNode_78.upstream1 = dirtyFilterBaseNode_79;
    dirtyFilterBaseNode_79.setUpstream1(dirtyFilterFilteringNode_80);
    dirtyFilterBaseNode_79.value = 0.0;
    dirtyFilterBaseNode_79.upstream1 = dirtyFilterFilteringNode_80;
    dirtyFilterBaseNode_81.setUpstream1(dirtyFilterBaseNode_82);
    dirtyFilterBaseNode_81.value = 0.0;
    dirtyFilterBaseNode_81.upstream1 = dirtyFilterBaseNode_82;
    dirtyFilterBaseNode_82.setUpstream1(dirtyFilterFilteringNode_83);
    dirtyFilterBaseNode_82.value = 0.0;
    dirtyFilterBaseNode_82.upstream1 = dirtyFilterFilteringNode_83;
    dirtyFilterBaseNode_84.setUpstream1(dirtyFilterBaseNode_85);
    dirtyFilterBaseNode_84.value = 0.0;
    dirtyFilterBaseNode_84.upstream1 = dirtyFilterBaseNode_85;
    dirtyFilterBaseNode_85.setUpstream1(dirtyFilterFilteringNode_86);
    dirtyFilterBaseNode_85.value = 0.0;
    dirtyFilterBaseNode_85.upstream1 = dirtyFilterFilteringNode_86;
    dirtyFilterBaseNode_87.setUpstream1(dirtyFilterBaseNode_88);
    dirtyFilterBaseNode_87.value = 0.0;
    dirtyFilterBaseNode_87.upstream1 = dirtyFilterBaseNode_88;
    dirtyFilterBaseNode_88.setUpstream1(dirtyFilterFilteringNode_89);
    dirtyFilterBaseNode_88.value = 0.0;
    dirtyFilterBaseNode_88.upstream1 = dirtyFilterFilteringNode_89;
    dirtyFilterBaseNode_90.setUpstream1(dirtyFilterBaseNode_91);
    dirtyFilterBaseNode_90.value = 0.0;
    dirtyFilterBaseNode_90.upstream1 = dirtyFilterBaseNode_91;
    dirtyFilterBaseNode_91.setUpstream1(dirtyFilterFilteringNode_92);
    dirtyFilterBaseNode_91.value = 0.0;
    dirtyFilterBaseNode_91.upstream1 = dirtyFilterFilteringNode_92;
    dirtyFilterBaseNode_93.setUpstream1(dirtyFilterBaseNode_94);
    dirtyFilterBaseNode_93.value = 0.0;
    dirtyFilterBaseNode_93.upstream1 = dirtyFilterBaseNode_94;
    dirtyFilterBaseNode_94.setUpstream1(dirtyFilterFilteringNode_95);
    dirtyFilterBaseNode_94.value = 0.0;
    dirtyFilterBaseNode_94.upstream1 = dirtyFilterFilteringNode_95;
    dirtyFilterBaseNode_96.setUpstream1(dirtyFilterBaseNode_97);
    dirtyFilterBaseNode_96.value = 0.0;
    dirtyFilterBaseNode_96.upstream1 = dirtyFilterBaseNode_97;
    dirtyFilterBaseNode_97.setUpstream1(dirtyFilterFilteringNode_98);
    dirtyFilterBaseNode_97.value = 0.0;
    dirtyFilterBaseNode_97.upstream1 = dirtyFilterFilteringNode_98;
    dirtyFilterBaseNode_99.setUpstream1(dirtyFilterBaseNode_100);
    dirtyFilterBaseNode_99.value = 0.0;
    dirtyFilterBaseNode_99.upstream1 = dirtyFilterBaseNode_100;
    dirtyFilterBaseNode_100.setUpstream1(dirtyFilterControlRootNode_101);
    dirtyFilterBaseNode_100.value = 0.0;
    dirtyFilterBaseNode_100.upstream1 = dirtyFilterControlRootNode_101;
    dirtyFilterControlRootNode_101.value = 0.0;
    dirtyFilterFilteringNode_2.setUpstream1(dirtyFilterBaseNode_3);
    dirtyFilterFilteringNode_2.value = 0.0;
    dirtyFilterFilteringNode_2.upstream1 = dirtyFilterBaseNode_3;
    dirtyFilterFilteringNode_5.setUpstream1(dirtyFilterBaseNode_6);
    dirtyFilterFilteringNode_5.value = 0.0;
    dirtyFilterFilteringNode_5.upstream1 = dirtyFilterBaseNode_6;
    dirtyFilterFilteringNode_8.setUpstream1(dirtyFilterBaseNode_9);
    dirtyFilterFilteringNode_8.value = 0.0;
    dirtyFilterFilteringNode_8.upstream1 = dirtyFilterBaseNode_9;
    dirtyFilterFilteringNode_11.setUpstream1(dirtyFilterBaseNode_12);
    dirtyFilterFilteringNode_11.value = 0.0;
    dirtyFilterFilteringNode_11.upstream1 = dirtyFilterBaseNode_12;
    dirtyFilterFilteringNode_14.setUpstream1(dirtyFilterBaseNode_15);
    dirtyFilterFilteringNode_14.value = 0.0;
    dirtyFilterFilteringNode_14.upstream1 = dirtyFilterBaseNode_15;
    dirtyFilterFilteringNode_17.setUpstream1(dirtyFilterBaseNode_18);
    dirtyFilterFilteringNode_17.value = 0.0;
    dirtyFilterFilteringNode_17.upstream1 = dirtyFilterBaseNode_18;
    dirtyFilterFilteringNode_20.setUpstream1(dirtyFilterBaseNode_21);
    dirtyFilterFilteringNode_20.value = 0.0;
    dirtyFilterFilteringNode_20.upstream1 = dirtyFilterBaseNode_21;
    dirtyFilterFilteringNode_23.setUpstream1(dirtyFilterBaseNode_24);
    dirtyFilterFilteringNode_23.value = 0.0;
    dirtyFilterFilteringNode_23.upstream1 = dirtyFilterBaseNode_24;
    dirtyFilterFilteringNode_26.setUpstream1(dirtyFilterBaseNode_27);
    dirtyFilterFilteringNode_26.value = 0.0;
    dirtyFilterFilteringNode_26.upstream1 = dirtyFilterBaseNode_27;
    dirtyFilterFilteringNode_29.setUpstream1(dirtyFilterBaseNode_30);
    dirtyFilterFilteringNode_29.value = 0.0;
    dirtyFilterFilteringNode_29.upstream1 = dirtyFilterBaseNode_30;
    dirtyFilterFilteringNode_32.setUpstream1(dirtyFilterBaseNode_33);
    dirtyFilterFilteringNode_32.value = 0.0;
    dirtyFilterFilteringNode_32.upstream1 = dirtyFilterBaseNode_33;
    dirtyFilterFilteringNode_35.setUpstream1(dirtyFilterBaseNode_36);
    dirtyFilterFilteringNode_35.value = 0.0;
    dirtyFilterFilteringNode_35.upstream1 = dirtyFilterBaseNode_36;
    dirtyFilterFilteringNode_38.setUpstream1(dirtyFilterBaseNode_39);
    dirtyFilterFilteringNode_38.value = 0.0;
    dirtyFilterFilteringNode_38.upstream1 = dirtyFilterBaseNode_39;
    dirtyFilterFilteringNode_41.setUpstream1(dirtyFilterBaseNode_42);
    dirtyFilterFilteringNode_41.value = 0.0;
    dirtyFilterFilteringNode_41.upstream1 = dirtyFilterBaseNode_42;
    dirtyFilterFilteringNode_44.setUpstream1(dirtyFilterBaseNode_45);
    dirtyFilterFilteringNode_44.value = 0.0;
    dirtyFilterFilteringNode_44.upstream1 = dirtyFilterBaseNode_45;
    dirtyFilterFilteringNode_47.setUpstream1(dirtyFilterBaseNode_48);
    dirtyFilterFilteringNode_47.value = 0.0;
    dirtyFilterFilteringNode_47.upstream1 = dirtyFilterBaseNode_48;
    dirtyFilterFilteringNode_50.setUpstream1(dirtyFilterBaseNode_51);
    dirtyFilterFilteringNode_50.value = 0.0;
    dirtyFilterFilteringNode_50.upstream1 = dirtyFilterBaseNode_51;
    dirtyFilterFilteringNode_53.setUpstream1(dirtyFilterBaseNode_54);
    dirtyFilterFilteringNode_53.value = 0.0;
    dirtyFilterFilteringNode_53.upstream1 = dirtyFilterBaseNode_54;
    dirtyFilterFilteringNode_56.setUpstream1(dirtyFilterBaseNode_57);
    dirtyFilterFilteringNode_56.value = 0.0;
    dirtyFilterFilteringNode_56.upstream1 = dirtyFilterBaseNode_57;
    dirtyFilterFilteringNode_59.setUpstream1(dirtyFilterBaseNode_60);
    dirtyFilterFilteringNode_59.value = 0.0;
    dirtyFilterFilteringNode_59.upstream1 = dirtyFilterBaseNode_60;
    dirtyFilterFilteringNode_62.setUpstream1(dirtyFilterBaseNode_63);
    dirtyFilterFilteringNode_62.value = 0.0;
    dirtyFilterFilteringNode_62.upstream1 = dirtyFilterBaseNode_63;
    dirtyFilterFilteringNode_65.setUpstream1(dirtyFilterBaseNode_66);
    dirtyFilterFilteringNode_65.value = 0.0;
    dirtyFilterFilteringNode_65.upstream1 = dirtyFilterBaseNode_66;
    dirtyFilterFilteringNode_68.setUpstream1(dirtyFilterBaseNode_69);
    dirtyFilterFilteringNode_68.value = 0.0;
    dirtyFilterFilteringNode_68.upstream1 = dirtyFilterBaseNode_69;
    dirtyFilterFilteringNode_71.setUpstream1(dirtyFilterBaseNode_72);
    dirtyFilterFilteringNode_71.value = 0.0;
    dirtyFilterFilteringNode_71.upstream1 = dirtyFilterBaseNode_72;
    dirtyFilterFilteringNode_74.setUpstream1(dirtyFilterBaseNode_75);
    dirtyFilterFilteringNode_74.value = 0.0;
    dirtyFilterFilteringNode_74.upstream1 = dirtyFilterBaseNode_75;
    dirtyFilterFilteringNode_77.setUpstream1(dirtyFilterBaseNode_78);
    dirtyFilterFilteringNode_77.value = 0.0;
    dirtyFilterFilteringNode_77.upstream1 = dirtyFilterBaseNode_78;
    dirtyFilterFilteringNode_80.setUpstream1(dirtyFilterBaseNode_81);
    dirtyFilterFilteringNode_80.value = 0.0;
    dirtyFilterFilteringNode_80.upstream1 = dirtyFilterBaseNode_81;
    dirtyFilterFilteringNode_83.setUpstream1(dirtyFilterBaseNode_84);
    dirtyFilterFilteringNode_83.value = 0.0;
    dirtyFilterFilteringNode_83.upstream1 = dirtyFilterBaseNode_84;
    dirtyFilterFilteringNode_86.setUpstream1(dirtyFilterBaseNode_87);
    dirtyFilterFilteringNode_86.value = 0.0;
    dirtyFilterFilteringNode_86.upstream1 = dirtyFilterBaseNode_87;
    dirtyFilterFilteringNode_89.setUpstream1(dirtyFilterBaseNode_90);
    dirtyFilterFilteringNode_89.value = 0.0;
    dirtyFilterFilteringNode_89.upstream1 = dirtyFilterBaseNode_90;
    dirtyFilterFilteringNode_92.setUpstream1(dirtyFilterBaseNode_93);
    dirtyFilterFilteringNode_92.value = 0.0;
    dirtyFilterFilteringNode_92.upstream1 = dirtyFilterBaseNode_93;
    dirtyFilterFilteringNode_95.setUpstream1(dirtyFilterBaseNode_96);
    dirtyFilterFilteringNode_95.value = 0.0;
    dirtyFilterFilteringNode_95.upstream1 = dirtyFilterBaseNode_96;
    dirtyFilterFilteringNode_98.setUpstream1(dirtyFilterBaseNode_99);
    dirtyFilterFilteringNode_98.value = 0.0;
    dirtyFilterFilteringNode_98.upstream1 = dirtyFilterBaseNode_99;
    sink.setUpstream1(dirtyFilterBaseNode_1);
    sink.upstream1 = dirtyFilterBaseNode_1;
    sink.value = 0.0;
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

  public DirtyFilter100Processor() {
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
    isDirty_dirtyFilterControlRootNode_101 = dirtyFilterControlRootNode_101.onControl(typedEvent);
    if (guardCheck_dirtyFilterBaseNode_100()) {
      isDirty_dirtyFilterBaseNode_100 = dirtyFilterBaseNode_100.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_99()) {
      isDirty_dirtyFilterBaseNode_99 = dirtyFilterBaseNode_99.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_98()) {
      isDirty_dirtyFilterFilteringNode_98 = dirtyFilterFilteringNode_98.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_97()) {
      isDirty_dirtyFilterBaseNode_97 = dirtyFilterBaseNode_97.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_96()) {
      isDirty_dirtyFilterBaseNode_96 = dirtyFilterBaseNode_96.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_95()) {
      isDirty_dirtyFilterFilteringNode_95 = dirtyFilterFilteringNode_95.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_94()) {
      isDirty_dirtyFilterBaseNode_94 = dirtyFilterBaseNode_94.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_93()) {
      isDirty_dirtyFilterBaseNode_93 = dirtyFilterBaseNode_93.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_92()) {
      isDirty_dirtyFilterFilteringNode_92 = dirtyFilterFilteringNode_92.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_91()) {
      isDirty_dirtyFilterBaseNode_91 = dirtyFilterBaseNode_91.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_90()) {
      isDirty_dirtyFilterBaseNode_90 = dirtyFilterBaseNode_90.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_89()) {
      isDirty_dirtyFilterFilteringNode_89 = dirtyFilterFilteringNode_89.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_88()) {
      isDirty_dirtyFilterBaseNode_88 = dirtyFilterBaseNode_88.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_87()) {
      isDirty_dirtyFilterBaseNode_87 = dirtyFilterBaseNode_87.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_86()) {
      isDirty_dirtyFilterFilteringNode_86 = dirtyFilterFilteringNode_86.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_85()) {
      isDirty_dirtyFilterBaseNode_85 = dirtyFilterBaseNode_85.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_84()) {
      isDirty_dirtyFilterBaseNode_84 = dirtyFilterBaseNode_84.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_83()) {
      isDirty_dirtyFilterFilteringNode_83 = dirtyFilterFilteringNode_83.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_82()) {
      isDirty_dirtyFilterBaseNode_82 = dirtyFilterBaseNode_82.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_81()) {
      isDirty_dirtyFilterBaseNode_81 = dirtyFilterBaseNode_81.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_80()) {
      isDirty_dirtyFilterFilteringNode_80 = dirtyFilterFilteringNode_80.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_79()) {
      isDirty_dirtyFilterBaseNode_79 = dirtyFilterBaseNode_79.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_78()) {
      isDirty_dirtyFilterBaseNode_78 = dirtyFilterBaseNode_78.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_77()) {
      isDirty_dirtyFilterFilteringNode_77 = dirtyFilterFilteringNode_77.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_76()) {
      isDirty_dirtyFilterBaseNode_76 = dirtyFilterBaseNode_76.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_75()) {
      isDirty_dirtyFilterBaseNode_75 = dirtyFilterBaseNode_75.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_74()) {
      isDirty_dirtyFilterFilteringNode_74 = dirtyFilterFilteringNode_74.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_73()) {
      isDirty_dirtyFilterBaseNode_73 = dirtyFilterBaseNode_73.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_72()) {
      isDirty_dirtyFilterBaseNode_72 = dirtyFilterBaseNode_72.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_71()) {
      isDirty_dirtyFilterFilteringNode_71 = dirtyFilterFilteringNode_71.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_70()) {
      isDirty_dirtyFilterBaseNode_70 = dirtyFilterBaseNode_70.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_69()) {
      isDirty_dirtyFilterBaseNode_69 = dirtyFilterBaseNode_69.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_68()) {
      isDirty_dirtyFilterFilteringNode_68 = dirtyFilterFilteringNode_68.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_67()) {
      isDirty_dirtyFilterBaseNode_67 = dirtyFilterBaseNode_67.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_66()) {
      isDirty_dirtyFilterBaseNode_66 = dirtyFilterBaseNode_66.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_65()) {
      isDirty_dirtyFilterFilteringNode_65 = dirtyFilterFilteringNode_65.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_64()) {
      isDirty_dirtyFilterBaseNode_64 = dirtyFilterBaseNode_64.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_63()) {
      isDirty_dirtyFilterBaseNode_63 = dirtyFilterBaseNode_63.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_62()) {
      isDirty_dirtyFilterFilteringNode_62 = dirtyFilterFilteringNode_62.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_61()) {
      isDirty_dirtyFilterBaseNode_61 = dirtyFilterBaseNode_61.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_60()) {
      isDirty_dirtyFilterBaseNode_60 = dirtyFilterBaseNode_60.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_59()) {
      isDirty_dirtyFilterFilteringNode_59 = dirtyFilterFilteringNode_59.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_58()) {
      isDirty_dirtyFilterBaseNode_58 = dirtyFilterBaseNode_58.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_57()) {
      isDirty_dirtyFilterBaseNode_57 = dirtyFilterBaseNode_57.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_56()) {
      isDirty_dirtyFilterFilteringNode_56 = dirtyFilterFilteringNode_56.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_55()) {
      isDirty_dirtyFilterBaseNode_55 = dirtyFilterBaseNode_55.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_54()) {
      isDirty_dirtyFilterBaseNode_54 = dirtyFilterBaseNode_54.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_53()) {
      isDirty_dirtyFilterFilteringNode_53 = dirtyFilterFilteringNode_53.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_52()) {
      isDirty_dirtyFilterBaseNode_52 = dirtyFilterBaseNode_52.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_51()) {
      isDirty_dirtyFilterBaseNode_51 = dirtyFilterBaseNode_51.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_50()) {
      isDirty_dirtyFilterFilteringNode_50 = dirtyFilterFilteringNode_50.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_49()) {
      isDirty_dirtyFilterBaseNode_49 = dirtyFilterBaseNode_49.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_48()) {
      isDirty_dirtyFilterBaseNode_48 = dirtyFilterBaseNode_48.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_47()) {
      isDirty_dirtyFilterFilteringNode_47 = dirtyFilterFilteringNode_47.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_46()) {
      isDirty_dirtyFilterBaseNode_46 = dirtyFilterBaseNode_46.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_45()) {
      isDirty_dirtyFilterBaseNode_45 = dirtyFilterBaseNode_45.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_44()) {
      isDirty_dirtyFilterFilteringNode_44 = dirtyFilterFilteringNode_44.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_43()) {
      isDirty_dirtyFilterBaseNode_43 = dirtyFilterBaseNode_43.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_42()) {
      isDirty_dirtyFilterBaseNode_42 = dirtyFilterBaseNode_42.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_41()) {
      isDirty_dirtyFilterFilteringNode_41 = dirtyFilterFilteringNode_41.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_40()) {
      isDirty_dirtyFilterBaseNode_40 = dirtyFilterBaseNode_40.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_39()) {
      isDirty_dirtyFilterBaseNode_39 = dirtyFilterBaseNode_39.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_38()) {
      isDirty_dirtyFilterFilteringNode_38 = dirtyFilterFilteringNode_38.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_37()) {
      isDirty_dirtyFilterBaseNode_37 = dirtyFilterBaseNode_37.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_36()) {
      isDirty_dirtyFilterBaseNode_36 = dirtyFilterBaseNode_36.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_35()) {
      isDirty_dirtyFilterFilteringNode_35 = dirtyFilterFilteringNode_35.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_34()) {
      isDirty_dirtyFilterBaseNode_34 = dirtyFilterBaseNode_34.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_33()) {
      isDirty_dirtyFilterBaseNode_33 = dirtyFilterBaseNode_33.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_32()) {
      isDirty_dirtyFilterFilteringNode_32 = dirtyFilterFilteringNode_32.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_31()) {
      isDirty_dirtyFilterBaseNode_31 = dirtyFilterBaseNode_31.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_30()) {
      isDirty_dirtyFilterBaseNode_30 = dirtyFilterBaseNode_30.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_29()) {
      isDirty_dirtyFilterFilteringNode_29 = dirtyFilterFilteringNode_29.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_28()) {
      isDirty_dirtyFilterBaseNode_28 = dirtyFilterBaseNode_28.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_27()) {
      isDirty_dirtyFilterBaseNode_27 = dirtyFilterBaseNode_27.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_26()) {
      isDirty_dirtyFilterFilteringNode_26 = dirtyFilterFilteringNode_26.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_25()) {
      isDirty_dirtyFilterBaseNode_25 = dirtyFilterBaseNode_25.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_24()) {
      isDirty_dirtyFilterBaseNode_24 = dirtyFilterBaseNode_24.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_23()) {
      isDirty_dirtyFilterFilteringNode_23 = dirtyFilterFilteringNode_23.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_22()) {
      isDirty_dirtyFilterBaseNode_22 = dirtyFilterBaseNode_22.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_21()) {
      isDirty_dirtyFilterBaseNode_21 = dirtyFilterBaseNode_21.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_20()) {
      isDirty_dirtyFilterFilteringNode_20 = dirtyFilterFilteringNode_20.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_19()) {
      isDirty_dirtyFilterBaseNode_19 = dirtyFilterBaseNode_19.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_18()) {
      isDirty_dirtyFilterBaseNode_18 = dirtyFilterBaseNode_18.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_17()) {
      isDirty_dirtyFilterFilteringNode_17 = dirtyFilterFilteringNode_17.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_16()) {
      isDirty_dirtyFilterBaseNode_16 = dirtyFilterBaseNode_16.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_15()) {
      isDirty_dirtyFilterBaseNode_15 = dirtyFilterBaseNode_15.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_14()) {
      isDirty_dirtyFilterFilteringNode_14 = dirtyFilterFilteringNode_14.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_13()) {
      isDirty_dirtyFilterBaseNode_13 = dirtyFilterBaseNode_13.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_12()) {
      isDirty_dirtyFilterBaseNode_12 = dirtyFilterBaseNode_12.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_11()) {
      isDirty_dirtyFilterFilteringNode_11 = dirtyFilterFilteringNode_11.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_10()) {
      isDirty_dirtyFilterBaseNode_10 = dirtyFilterBaseNode_10.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_9()) {
      isDirty_dirtyFilterBaseNode_9 = dirtyFilterBaseNode_9.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_8()) {
      isDirty_dirtyFilterFilteringNode_8 = dirtyFilterFilteringNode_8.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_7()) {
      isDirty_dirtyFilterBaseNode_7 = dirtyFilterBaseNode_7.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_6()) {
      isDirty_dirtyFilterBaseNode_6 = dirtyFilterBaseNode_6.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_5()) {
      isDirty_dirtyFilterFilteringNode_5 = dirtyFilterFilteringNode_5.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_4()) {
      isDirty_dirtyFilterBaseNode_4 = dirtyFilterBaseNode_4.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_3()) {
      isDirty_dirtyFilterBaseNode_3 = dirtyFilterBaseNode_3.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_2()) {
      isDirty_dirtyFilterFilteringNode_2 = dirtyFilterFilteringNode_2.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_1()) {
      isDirty_dirtyFilterBaseNode_1 = dirtyFilterBaseNode_1.onUpstream();
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
    } else if (event instanceof ControlEvent) {
      ControlEvent typedEvent = (ControlEvent) event;
      auditEvent(typedEvent);
      isDirty_dirtyFilterControlRootNode_101 = dirtyFilterControlRootNode_101.onControl(typedEvent);
    }
  }

  public void triggerCalculation() {
    buffering = false;
    String typedEvent = "No event information - buffered dispatch";
    if (guardCheck_dirtyFilterBaseNode_100()) {
      isDirty_dirtyFilterBaseNode_100 = dirtyFilterBaseNode_100.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_99()) {
      isDirty_dirtyFilterBaseNode_99 = dirtyFilterBaseNode_99.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_98()) {
      isDirty_dirtyFilterFilteringNode_98 = dirtyFilterFilteringNode_98.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_97()) {
      isDirty_dirtyFilterBaseNode_97 = dirtyFilterBaseNode_97.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_96()) {
      isDirty_dirtyFilterBaseNode_96 = dirtyFilterBaseNode_96.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_95()) {
      isDirty_dirtyFilterFilteringNode_95 = dirtyFilterFilteringNode_95.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_94()) {
      isDirty_dirtyFilterBaseNode_94 = dirtyFilterBaseNode_94.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_93()) {
      isDirty_dirtyFilterBaseNode_93 = dirtyFilterBaseNode_93.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_92()) {
      isDirty_dirtyFilterFilteringNode_92 = dirtyFilterFilteringNode_92.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_91()) {
      isDirty_dirtyFilterBaseNode_91 = dirtyFilterBaseNode_91.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_90()) {
      isDirty_dirtyFilterBaseNode_90 = dirtyFilterBaseNode_90.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_89()) {
      isDirty_dirtyFilterFilteringNode_89 = dirtyFilterFilteringNode_89.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_88()) {
      isDirty_dirtyFilterBaseNode_88 = dirtyFilterBaseNode_88.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_87()) {
      isDirty_dirtyFilterBaseNode_87 = dirtyFilterBaseNode_87.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_86()) {
      isDirty_dirtyFilterFilteringNode_86 = dirtyFilterFilteringNode_86.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_85()) {
      isDirty_dirtyFilterBaseNode_85 = dirtyFilterBaseNode_85.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_84()) {
      isDirty_dirtyFilterBaseNode_84 = dirtyFilterBaseNode_84.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_83()) {
      isDirty_dirtyFilterFilteringNode_83 = dirtyFilterFilteringNode_83.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_82()) {
      isDirty_dirtyFilterBaseNode_82 = dirtyFilterBaseNode_82.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_81()) {
      isDirty_dirtyFilterBaseNode_81 = dirtyFilterBaseNode_81.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_80()) {
      isDirty_dirtyFilterFilteringNode_80 = dirtyFilterFilteringNode_80.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_79()) {
      isDirty_dirtyFilterBaseNode_79 = dirtyFilterBaseNode_79.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_78()) {
      isDirty_dirtyFilterBaseNode_78 = dirtyFilterBaseNode_78.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_77()) {
      isDirty_dirtyFilterFilteringNode_77 = dirtyFilterFilteringNode_77.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_76()) {
      isDirty_dirtyFilterBaseNode_76 = dirtyFilterBaseNode_76.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_75()) {
      isDirty_dirtyFilterBaseNode_75 = dirtyFilterBaseNode_75.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_74()) {
      isDirty_dirtyFilterFilteringNode_74 = dirtyFilterFilteringNode_74.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_73()) {
      isDirty_dirtyFilterBaseNode_73 = dirtyFilterBaseNode_73.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_72()) {
      isDirty_dirtyFilterBaseNode_72 = dirtyFilterBaseNode_72.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_71()) {
      isDirty_dirtyFilterFilteringNode_71 = dirtyFilterFilteringNode_71.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_70()) {
      isDirty_dirtyFilterBaseNode_70 = dirtyFilterBaseNode_70.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_69()) {
      isDirty_dirtyFilterBaseNode_69 = dirtyFilterBaseNode_69.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_68()) {
      isDirty_dirtyFilterFilteringNode_68 = dirtyFilterFilteringNode_68.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_67()) {
      isDirty_dirtyFilterBaseNode_67 = dirtyFilterBaseNode_67.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_66()) {
      isDirty_dirtyFilterBaseNode_66 = dirtyFilterBaseNode_66.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_65()) {
      isDirty_dirtyFilterFilteringNode_65 = dirtyFilterFilteringNode_65.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_64()) {
      isDirty_dirtyFilterBaseNode_64 = dirtyFilterBaseNode_64.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_63()) {
      isDirty_dirtyFilterBaseNode_63 = dirtyFilterBaseNode_63.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_62()) {
      isDirty_dirtyFilterFilteringNode_62 = dirtyFilterFilteringNode_62.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_61()) {
      isDirty_dirtyFilterBaseNode_61 = dirtyFilterBaseNode_61.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_60()) {
      isDirty_dirtyFilterBaseNode_60 = dirtyFilterBaseNode_60.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_59()) {
      isDirty_dirtyFilterFilteringNode_59 = dirtyFilterFilteringNode_59.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_58()) {
      isDirty_dirtyFilterBaseNode_58 = dirtyFilterBaseNode_58.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_57()) {
      isDirty_dirtyFilterBaseNode_57 = dirtyFilterBaseNode_57.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_56()) {
      isDirty_dirtyFilterFilteringNode_56 = dirtyFilterFilteringNode_56.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_55()) {
      isDirty_dirtyFilterBaseNode_55 = dirtyFilterBaseNode_55.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_54()) {
      isDirty_dirtyFilterBaseNode_54 = dirtyFilterBaseNode_54.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_53()) {
      isDirty_dirtyFilterFilteringNode_53 = dirtyFilterFilteringNode_53.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_52()) {
      isDirty_dirtyFilterBaseNode_52 = dirtyFilterBaseNode_52.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_51()) {
      isDirty_dirtyFilterBaseNode_51 = dirtyFilterBaseNode_51.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_50()) {
      isDirty_dirtyFilterFilteringNode_50 = dirtyFilterFilteringNode_50.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_49()) {
      isDirty_dirtyFilterBaseNode_49 = dirtyFilterBaseNode_49.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_48()) {
      isDirty_dirtyFilterBaseNode_48 = dirtyFilterBaseNode_48.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_47()) {
      isDirty_dirtyFilterFilteringNode_47 = dirtyFilterFilteringNode_47.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_46()) {
      isDirty_dirtyFilterBaseNode_46 = dirtyFilterBaseNode_46.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_45()) {
      isDirty_dirtyFilterBaseNode_45 = dirtyFilterBaseNode_45.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_44()) {
      isDirty_dirtyFilterFilteringNode_44 = dirtyFilterFilteringNode_44.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_43()) {
      isDirty_dirtyFilterBaseNode_43 = dirtyFilterBaseNode_43.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_42()) {
      isDirty_dirtyFilterBaseNode_42 = dirtyFilterBaseNode_42.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_41()) {
      isDirty_dirtyFilterFilteringNode_41 = dirtyFilterFilteringNode_41.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_40()) {
      isDirty_dirtyFilterBaseNode_40 = dirtyFilterBaseNode_40.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_39()) {
      isDirty_dirtyFilterBaseNode_39 = dirtyFilterBaseNode_39.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_38()) {
      isDirty_dirtyFilterFilteringNode_38 = dirtyFilterFilteringNode_38.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_37()) {
      isDirty_dirtyFilterBaseNode_37 = dirtyFilterBaseNode_37.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_36()) {
      isDirty_dirtyFilterBaseNode_36 = dirtyFilterBaseNode_36.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_35()) {
      isDirty_dirtyFilterFilteringNode_35 = dirtyFilterFilteringNode_35.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_34()) {
      isDirty_dirtyFilterBaseNode_34 = dirtyFilterBaseNode_34.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_33()) {
      isDirty_dirtyFilterBaseNode_33 = dirtyFilterBaseNode_33.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_32()) {
      isDirty_dirtyFilterFilteringNode_32 = dirtyFilterFilteringNode_32.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_31()) {
      isDirty_dirtyFilterBaseNode_31 = dirtyFilterBaseNode_31.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_30()) {
      isDirty_dirtyFilterBaseNode_30 = dirtyFilterBaseNode_30.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_29()) {
      isDirty_dirtyFilterFilteringNode_29 = dirtyFilterFilteringNode_29.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_28()) {
      isDirty_dirtyFilterBaseNode_28 = dirtyFilterBaseNode_28.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_27()) {
      isDirty_dirtyFilterBaseNode_27 = dirtyFilterBaseNode_27.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_26()) {
      isDirty_dirtyFilterFilteringNode_26 = dirtyFilterFilteringNode_26.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_25()) {
      isDirty_dirtyFilterBaseNode_25 = dirtyFilterBaseNode_25.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_24()) {
      isDirty_dirtyFilterBaseNode_24 = dirtyFilterBaseNode_24.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_23()) {
      isDirty_dirtyFilterFilteringNode_23 = dirtyFilterFilteringNode_23.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_22()) {
      isDirty_dirtyFilterBaseNode_22 = dirtyFilterBaseNode_22.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_21()) {
      isDirty_dirtyFilterBaseNode_21 = dirtyFilterBaseNode_21.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_20()) {
      isDirty_dirtyFilterFilteringNode_20 = dirtyFilterFilteringNode_20.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_19()) {
      isDirty_dirtyFilterBaseNode_19 = dirtyFilterBaseNode_19.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_18()) {
      isDirty_dirtyFilterBaseNode_18 = dirtyFilterBaseNode_18.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_17()) {
      isDirty_dirtyFilterFilteringNode_17 = dirtyFilterFilteringNode_17.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_16()) {
      isDirty_dirtyFilterBaseNode_16 = dirtyFilterBaseNode_16.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_15()) {
      isDirty_dirtyFilterBaseNode_15 = dirtyFilterBaseNode_15.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_14()) {
      isDirty_dirtyFilterFilteringNode_14 = dirtyFilterFilteringNode_14.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_13()) {
      isDirty_dirtyFilterBaseNode_13 = dirtyFilterBaseNode_13.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_12()) {
      isDirty_dirtyFilterBaseNode_12 = dirtyFilterBaseNode_12.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_11()) {
      isDirty_dirtyFilterFilteringNode_11 = dirtyFilterFilteringNode_11.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_10()) {
      isDirty_dirtyFilterBaseNode_10 = dirtyFilterBaseNode_10.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_9()) {
      isDirty_dirtyFilterBaseNode_9 = dirtyFilterBaseNode_9.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_8()) {
      isDirty_dirtyFilterFilteringNode_8 = dirtyFilterFilteringNode_8.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_7()) {
      isDirty_dirtyFilterBaseNode_7 = dirtyFilterBaseNode_7.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_6()) {
      isDirty_dirtyFilterBaseNode_6 = dirtyFilterBaseNode_6.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_5()) {
      isDirty_dirtyFilterFilteringNode_5 = dirtyFilterFilteringNode_5.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_4()) {
      isDirty_dirtyFilterBaseNode_4 = dirtyFilterBaseNode_4.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_3()) {
      isDirty_dirtyFilterBaseNode_3 = dirtyFilterBaseNode_3.onUpstream();
    }
    if (guardCheck_dirtyFilterFilteringNode_2()) {
      isDirty_dirtyFilterFilteringNode_2 = dirtyFilterFilteringNode_2.onUpstream();
    }
    if (guardCheck_dirtyFilterBaseNode_1()) {
      isDirty_dirtyFilterBaseNode_1 = dirtyFilterBaseNode_1.onUpstream();
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
    auditor.nodeRegistered(dirtyFilterBaseNode_1, "dirtyFilterBaseNode_1");
    auditor.nodeRegistered(dirtyFilterBaseNode_3, "dirtyFilterBaseNode_3");
    auditor.nodeRegistered(dirtyFilterBaseNode_4, "dirtyFilterBaseNode_4");
    auditor.nodeRegistered(dirtyFilterBaseNode_6, "dirtyFilterBaseNode_6");
    auditor.nodeRegistered(dirtyFilterBaseNode_7, "dirtyFilterBaseNode_7");
    auditor.nodeRegistered(dirtyFilterBaseNode_9, "dirtyFilterBaseNode_9");
    auditor.nodeRegistered(dirtyFilterBaseNode_10, "dirtyFilterBaseNode_10");
    auditor.nodeRegistered(dirtyFilterBaseNode_12, "dirtyFilterBaseNode_12");
    auditor.nodeRegistered(dirtyFilterBaseNode_13, "dirtyFilterBaseNode_13");
    auditor.nodeRegistered(dirtyFilterBaseNode_15, "dirtyFilterBaseNode_15");
    auditor.nodeRegistered(dirtyFilterBaseNode_16, "dirtyFilterBaseNode_16");
    auditor.nodeRegistered(dirtyFilterBaseNode_18, "dirtyFilterBaseNode_18");
    auditor.nodeRegistered(dirtyFilterBaseNode_19, "dirtyFilterBaseNode_19");
    auditor.nodeRegistered(dirtyFilterBaseNode_21, "dirtyFilterBaseNode_21");
    auditor.nodeRegistered(dirtyFilterBaseNode_22, "dirtyFilterBaseNode_22");
    auditor.nodeRegistered(dirtyFilterBaseNode_24, "dirtyFilterBaseNode_24");
    auditor.nodeRegistered(dirtyFilterBaseNode_25, "dirtyFilterBaseNode_25");
    auditor.nodeRegistered(dirtyFilterBaseNode_27, "dirtyFilterBaseNode_27");
    auditor.nodeRegistered(dirtyFilterBaseNode_28, "dirtyFilterBaseNode_28");
    auditor.nodeRegistered(dirtyFilterBaseNode_30, "dirtyFilterBaseNode_30");
    auditor.nodeRegistered(dirtyFilterBaseNode_31, "dirtyFilterBaseNode_31");
    auditor.nodeRegistered(dirtyFilterBaseNode_33, "dirtyFilterBaseNode_33");
    auditor.nodeRegistered(dirtyFilterBaseNode_34, "dirtyFilterBaseNode_34");
    auditor.nodeRegistered(dirtyFilterBaseNode_36, "dirtyFilterBaseNode_36");
    auditor.nodeRegistered(dirtyFilterBaseNode_37, "dirtyFilterBaseNode_37");
    auditor.nodeRegistered(dirtyFilterBaseNode_39, "dirtyFilterBaseNode_39");
    auditor.nodeRegistered(dirtyFilterBaseNode_40, "dirtyFilterBaseNode_40");
    auditor.nodeRegistered(dirtyFilterBaseNode_42, "dirtyFilterBaseNode_42");
    auditor.nodeRegistered(dirtyFilterBaseNode_43, "dirtyFilterBaseNode_43");
    auditor.nodeRegistered(dirtyFilterBaseNode_45, "dirtyFilterBaseNode_45");
    auditor.nodeRegistered(dirtyFilterBaseNode_46, "dirtyFilterBaseNode_46");
    auditor.nodeRegistered(dirtyFilterBaseNode_48, "dirtyFilterBaseNode_48");
    auditor.nodeRegistered(dirtyFilterBaseNode_49, "dirtyFilterBaseNode_49");
    auditor.nodeRegistered(dirtyFilterBaseNode_51, "dirtyFilterBaseNode_51");
    auditor.nodeRegistered(dirtyFilterBaseNode_52, "dirtyFilterBaseNode_52");
    auditor.nodeRegistered(dirtyFilterBaseNode_54, "dirtyFilterBaseNode_54");
    auditor.nodeRegistered(dirtyFilterBaseNode_55, "dirtyFilterBaseNode_55");
    auditor.nodeRegistered(dirtyFilterBaseNode_57, "dirtyFilterBaseNode_57");
    auditor.nodeRegistered(dirtyFilterBaseNode_58, "dirtyFilterBaseNode_58");
    auditor.nodeRegistered(dirtyFilterBaseNode_60, "dirtyFilterBaseNode_60");
    auditor.nodeRegistered(dirtyFilterBaseNode_61, "dirtyFilterBaseNode_61");
    auditor.nodeRegistered(dirtyFilterBaseNode_63, "dirtyFilterBaseNode_63");
    auditor.nodeRegistered(dirtyFilterBaseNode_64, "dirtyFilterBaseNode_64");
    auditor.nodeRegistered(dirtyFilterBaseNode_66, "dirtyFilterBaseNode_66");
    auditor.nodeRegistered(dirtyFilterBaseNode_67, "dirtyFilterBaseNode_67");
    auditor.nodeRegistered(dirtyFilterBaseNode_69, "dirtyFilterBaseNode_69");
    auditor.nodeRegistered(dirtyFilterBaseNode_70, "dirtyFilterBaseNode_70");
    auditor.nodeRegistered(dirtyFilterBaseNode_72, "dirtyFilterBaseNode_72");
    auditor.nodeRegistered(dirtyFilterBaseNode_73, "dirtyFilterBaseNode_73");
    auditor.nodeRegistered(dirtyFilterBaseNode_75, "dirtyFilterBaseNode_75");
    auditor.nodeRegistered(dirtyFilterBaseNode_76, "dirtyFilterBaseNode_76");
    auditor.nodeRegistered(dirtyFilterBaseNode_78, "dirtyFilterBaseNode_78");
    auditor.nodeRegistered(dirtyFilterBaseNode_79, "dirtyFilterBaseNode_79");
    auditor.nodeRegistered(dirtyFilterBaseNode_81, "dirtyFilterBaseNode_81");
    auditor.nodeRegistered(dirtyFilterBaseNode_82, "dirtyFilterBaseNode_82");
    auditor.nodeRegistered(dirtyFilterBaseNode_84, "dirtyFilterBaseNode_84");
    auditor.nodeRegistered(dirtyFilterBaseNode_85, "dirtyFilterBaseNode_85");
    auditor.nodeRegistered(dirtyFilterBaseNode_87, "dirtyFilterBaseNode_87");
    auditor.nodeRegistered(dirtyFilterBaseNode_88, "dirtyFilterBaseNode_88");
    auditor.nodeRegistered(dirtyFilterBaseNode_90, "dirtyFilterBaseNode_90");
    auditor.nodeRegistered(dirtyFilterBaseNode_91, "dirtyFilterBaseNode_91");
    auditor.nodeRegistered(dirtyFilterBaseNode_93, "dirtyFilterBaseNode_93");
    auditor.nodeRegistered(dirtyFilterBaseNode_94, "dirtyFilterBaseNode_94");
    auditor.nodeRegistered(dirtyFilterBaseNode_96, "dirtyFilterBaseNode_96");
    auditor.nodeRegistered(dirtyFilterBaseNode_97, "dirtyFilterBaseNode_97");
    auditor.nodeRegistered(dirtyFilterBaseNode_99, "dirtyFilterBaseNode_99");
    auditor.nodeRegistered(dirtyFilterBaseNode_100, "dirtyFilterBaseNode_100");
    auditor.nodeRegistered(dirtyFilterControlRootNode_101, "dirtyFilterControlRootNode_101");
    auditor.nodeRegistered(dirtyFilterFilteringNode_2, "dirtyFilterFilteringNode_2");
    auditor.nodeRegistered(dirtyFilterFilteringNode_5, "dirtyFilterFilteringNode_5");
    auditor.nodeRegistered(dirtyFilterFilteringNode_8, "dirtyFilterFilteringNode_8");
    auditor.nodeRegistered(dirtyFilterFilteringNode_11, "dirtyFilterFilteringNode_11");
    auditor.nodeRegistered(dirtyFilterFilteringNode_14, "dirtyFilterFilteringNode_14");
    auditor.nodeRegistered(dirtyFilterFilteringNode_17, "dirtyFilterFilteringNode_17");
    auditor.nodeRegistered(dirtyFilterFilteringNode_20, "dirtyFilterFilteringNode_20");
    auditor.nodeRegistered(dirtyFilterFilteringNode_23, "dirtyFilterFilteringNode_23");
    auditor.nodeRegistered(dirtyFilterFilteringNode_26, "dirtyFilterFilteringNode_26");
    auditor.nodeRegistered(dirtyFilterFilteringNode_29, "dirtyFilterFilteringNode_29");
    auditor.nodeRegistered(dirtyFilterFilteringNode_32, "dirtyFilterFilteringNode_32");
    auditor.nodeRegistered(dirtyFilterFilteringNode_35, "dirtyFilterFilteringNode_35");
    auditor.nodeRegistered(dirtyFilterFilteringNode_38, "dirtyFilterFilteringNode_38");
    auditor.nodeRegistered(dirtyFilterFilteringNode_41, "dirtyFilterFilteringNode_41");
    auditor.nodeRegistered(dirtyFilterFilteringNode_44, "dirtyFilterFilteringNode_44");
    auditor.nodeRegistered(dirtyFilterFilteringNode_47, "dirtyFilterFilteringNode_47");
    auditor.nodeRegistered(dirtyFilterFilteringNode_50, "dirtyFilterFilteringNode_50");
    auditor.nodeRegistered(dirtyFilterFilteringNode_53, "dirtyFilterFilteringNode_53");
    auditor.nodeRegistered(dirtyFilterFilteringNode_56, "dirtyFilterFilteringNode_56");
    auditor.nodeRegistered(dirtyFilterFilteringNode_59, "dirtyFilterFilteringNode_59");
    auditor.nodeRegistered(dirtyFilterFilteringNode_62, "dirtyFilterFilteringNode_62");
    auditor.nodeRegistered(dirtyFilterFilteringNode_65, "dirtyFilterFilteringNode_65");
    auditor.nodeRegistered(dirtyFilterFilteringNode_68, "dirtyFilterFilteringNode_68");
    auditor.nodeRegistered(dirtyFilterFilteringNode_71, "dirtyFilterFilteringNode_71");
    auditor.nodeRegistered(dirtyFilterFilteringNode_74, "dirtyFilterFilteringNode_74");
    auditor.nodeRegistered(dirtyFilterFilteringNode_77, "dirtyFilterFilteringNode_77");
    auditor.nodeRegistered(dirtyFilterFilteringNode_80, "dirtyFilterFilteringNode_80");
    auditor.nodeRegistered(dirtyFilterFilteringNode_83, "dirtyFilterFilteringNode_83");
    auditor.nodeRegistered(dirtyFilterFilteringNode_86, "dirtyFilterFilteringNode_86");
    auditor.nodeRegistered(dirtyFilterFilteringNode_89, "dirtyFilterFilteringNode_89");
    auditor.nodeRegistered(dirtyFilterFilteringNode_92, "dirtyFilterFilteringNode_92");
    auditor.nodeRegistered(dirtyFilterFilteringNode_95, "dirtyFilterFilteringNode_95");
    auditor.nodeRegistered(dirtyFilterFilteringNode_98, "dirtyFilterFilteringNode_98");
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
    isDirty_dirtyFilterBaseNode_1 = false;
    isDirty_dirtyFilterBaseNode_3 = false;
    isDirty_dirtyFilterBaseNode_4 = false;
    isDirty_dirtyFilterBaseNode_6 = false;
    isDirty_dirtyFilterBaseNode_7 = false;
    isDirty_dirtyFilterBaseNode_9 = false;
    isDirty_dirtyFilterBaseNode_10 = false;
    isDirty_dirtyFilterBaseNode_12 = false;
    isDirty_dirtyFilterBaseNode_13 = false;
    isDirty_dirtyFilterBaseNode_15 = false;
    isDirty_dirtyFilterBaseNode_16 = false;
    isDirty_dirtyFilterBaseNode_18 = false;
    isDirty_dirtyFilterBaseNode_19 = false;
    isDirty_dirtyFilterBaseNode_21 = false;
    isDirty_dirtyFilterBaseNode_22 = false;
    isDirty_dirtyFilterBaseNode_24 = false;
    isDirty_dirtyFilterBaseNode_25 = false;
    isDirty_dirtyFilterBaseNode_27 = false;
    isDirty_dirtyFilterBaseNode_28 = false;
    isDirty_dirtyFilterBaseNode_30 = false;
    isDirty_dirtyFilterBaseNode_31 = false;
    isDirty_dirtyFilterBaseNode_33 = false;
    isDirty_dirtyFilterBaseNode_34 = false;
    isDirty_dirtyFilterBaseNode_36 = false;
    isDirty_dirtyFilterBaseNode_37 = false;
    isDirty_dirtyFilterBaseNode_39 = false;
    isDirty_dirtyFilterBaseNode_40 = false;
    isDirty_dirtyFilterBaseNode_42 = false;
    isDirty_dirtyFilterBaseNode_43 = false;
    isDirty_dirtyFilterBaseNode_45 = false;
    isDirty_dirtyFilterBaseNode_46 = false;
    isDirty_dirtyFilterBaseNode_48 = false;
    isDirty_dirtyFilterBaseNode_49 = false;
    isDirty_dirtyFilterBaseNode_51 = false;
    isDirty_dirtyFilterBaseNode_52 = false;
    isDirty_dirtyFilterBaseNode_54 = false;
    isDirty_dirtyFilterBaseNode_55 = false;
    isDirty_dirtyFilterBaseNode_57 = false;
    isDirty_dirtyFilterBaseNode_58 = false;
    isDirty_dirtyFilterBaseNode_60 = false;
    isDirty_dirtyFilterBaseNode_61 = false;
    isDirty_dirtyFilterBaseNode_63 = false;
    isDirty_dirtyFilterBaseNode_64 = false;
    isDirty_dirtyFilterBaseNode_66 = false;
    isDirty_dirtyFilterBaseNode_67 = false;
    isDirty_dirtyFilterBaseNode_69 = false;
    isDirty_dirtyFilterBaseNode_70 = false;
    isDirty_dirtyFilterBaseNode_72 = false;
    isDirty_dirtyFilterBaseNode_73 = false;
    isDirty_dirtyFilterBaseNode_75 = false;
    isDirty_dirtyFilterBaseNode_76 = false;
    isDirty_dirtyFilterBaseNode_78 = false;
    isDirty_dirtyFilterBaseNode_79 = false;
    isDirty_dirtyFilterBaseNode_81 = false;
    isDirty_dirtyFilterBaseNode_82 = false;
    isDirty_dirtyFilterBaseNode_84 = false;
    isDirty_dirtyFilterBaseNode_85 = false;
    isDirty_dirtyFilterBaseNode_87 = false;
    isDirty_dirtyFilterBaseNode_88 = false;
    isDirty_dirtyFilterBaseNode_90 = false;
    isDirty_dirtyFilterBaseNode_91 = false;
    isDirty_dirtyFilterBaseNode_93 = false;
    isDirty_dirtyFilterBaseNode_94 = false;
    isDirty_dirtyFilterBaseNode_96 = false;
    isDirty_dirtyFilterBaseNode_97 = false;
    isDirty_dirtyFilterBaseNode_99 = false;
    isDirty_dirtyFilterBaseNode_100 = false;
    isDirty_dirtyFilterControlRootNode_101 = false;
    isDirty_dirtyFilterFilteringNode_2 = false;
    isDirty_dirtyFilterFilteringNode_5 = false;
    isDirty_dirtyFilterFilteringNode_8 = false;
    isDirty_dirtyFilterFilteringNode_11 = false;
    isDirty_dirtyFilterFilteringNode_14 = false;
    isDirty_dirtyFilterFilteringNode_17 = false;
    isDirty_dirtyFilterFilteringNode_20 = false;
    isDirty_dirtyFilterFilteringNode_23 = false;
    isDirty_dirtyFilterFilteringNode_26 = false;
    isDirty_dirtyFilterFilteringNode_29 = false;
    isDirty_dirtyFilterFilteringNode_32 = false;
    isDirty_dirtyFilterFilteringNode_35 = false;
    isDirty_dirtyFilterFilteringNode_38 = false;
    isDirty_dirtyFilterFilteringNode_41 = false;
    isDirty_dirtyFilterFilteringNode_44 = false;
    isDirty_dirtyFilterFilteringNode_47 = false;
    isDirty_dirtyFilterFilteringNode_50 = false;
    isDirty_dirtyFilterFilteringNode_53 = false;
    isDirty_dirtyFilterFilteringNode_56 = false;
    isDirty_dirtyFilterFilteringNode_59 = false;
    isDirty_dirtyFilterFilteringNode_62 = false;
    isDirty_dirtyFilterFilteringNode_65 = false;
    isDirty_dirtyFilterFilteringNode_68 = false;
    isDirty_dirtyFilterFilteringNode_71 = false;
    isDirty_dirtyFilterFilteringNode_74 = false;
    isDirty_dirtyFilterFilteringNode_77 = false;
    isDirty_dirtyFilterFilteringNode_80 = false;
    isDirty_dirtyFilterFilteringNode_83 = false;
    isDirty_dirtyFilterFilteringNode_86 = false;
    isDirty_dirtyFilterFilteringNode_89 = false;
    isDirty_dirtyFilterFilteringNode_92 = false;
    isDirty_dirtyFilterFilteringNode_95 = false;
    isDirty_dirtyFilterFilteringNode_98 = false;
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
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_1, () -> isDirty_dirtyFilterBaseNode_1);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_10, () -> isDirty_dirtyFilterBaseNode_10);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_100, () -> isDirty_dirtyFilterBaseNode_100);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_12, () -> isDirty_dirtyFilterBaseNode_12);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_13, () -> isDirty_dirtyFilterBaseNode_13);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_15, () -> isDirty_dirtyFilterBaseNode_15);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_16, () -> isDirty_dirtyFilterBaseNode_16);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_18, () -> isDirty_dirtyFilterBaseNode_18);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_19, () -> isDirty_dirtyFilterBaseNode_19);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_21, () -> isDirty_dirtyFilterBaseNode_21);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_22, () -> isDirty_dirtyFilterBaseNode_22);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_24, () -> isDirty_dirtyFilterBaseNode_24);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_25, () -> isDirty_dirtyFilterBaseNode_25);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_27, () -> isDirty_dirtyFilterBaseNode_27);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_28, () -> isDirty_dirtyFilterBaseNode_28);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_3, () -> isDirty_dirtyFilterBaseNode_3);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_30, () -> isDirty_dirtyFilterBaseNode_30);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_31, () -> isDirty_dirtyFilterBaseNode_31);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_33, () -> isDirty_dirtyFilterBaseNode_33);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_34, () -> isDirty_dirtyFilterBaseNode_34);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_36, () -> isDirty_dirtyFilterBaseNode_36);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_37, () -> isDirty_dirtyFilterBaseNode_37);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_39, () -> isDirty_dirtyFilterBaseNode_39);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_4, () -> isDirty_dirtyFilterBaseNode_4);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_40, () -> isDirty_dirtyFilterBaseNode_40);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_42, () -> isDirty_dirtyFilterBaseNode_42);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_43, () -> isDirty_dirtyFilterBaseNode_43);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_45, () -> isDirty_dirtyFilterBaseNode_45);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_46, () -> isDirty_dirtyFilterBaseNode_46);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_48, () -> isDirty_dirtyFilterBaseNode_48);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_49, () -> isDirty_dirtyFilterBaseNode_49);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_51, () -> isDirty_dirtyFilterBaseNode_51);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_52, () -> isDirty_dirtyFilterBaseNode_52);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_54, () -> isDirty_dirtyFilterBaseNode_54);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_55, () -> isDirty_dirtyFilterBaseNode_55);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_57, () -> isDirty_dirtyFilterBaseNode_57);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_58, () -> isDirty_dirtyFilterBaseNode_58);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_6, () -> isDirty_dirtyFilterBaseNode_6);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_60, () -> isDirty_dirtyFilterBaseNode_60);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_61, () -> isDirty_dirtyFilterBaseNode_61);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_63, () -> isDirty_dirtyFilterBaseNode_63);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_64, () -> isDirty_dirtyFilterBaseNode_64);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_66, () -> isDirty_dirtyFilterBaseNode_66);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_67, () -> isDirty_dirtyFilterBaseNode_67);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_69, () -> isDirty_dirtyFilterBaseNode_69);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_7, () -> isDirty_dirtyFilterBaseNode_7);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_70, () -> isDirty_dirtyFilterBaseNode_70);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_72, () -> isDirty_dirtyFilterBaseNode_72);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_73, () -> isDirty_dirtyFilterBaseNode_73);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_75, () -> isDirty_dirtyFilterBaseNode_75);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_76, () -> isDirty_dirtyFilterBaseNode_76);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_78, () -> isDirty_dirtyFilterBaseNode_78);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_79, () -> isDirty_dirtyFilterBaseNode_79);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_81, () -> isDirty_dirtyFilterBaseNode_81);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_82, () -> isDirty_dirtyFilterBaseNode_82);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_84, () -> isDirty_dirtyFilterBaseNode_84);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_85, () -> isDirty_dirtyFilterBaseNode_85);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_87, () -> isDirty_dirtyFilterBaseNode_87);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_88, () -> isDirty_dirtyFilterBaseNode_88);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_9, () -> isDirty_dirtyFilterBaseNode_9);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_90, () -> isDirty_dirtyFilterBaseNode_90);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_91, () -> isDirty_dirtyFilterBaseNode_91);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_93, () -> isDirty_dirtyFilterBaseNode_93);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_94, () -> isDirty_dirtyFilterBaseNode_94);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_96, () -> isDirty_dirtyFilterBaseNode_96);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_97, () -> isDirty_dirtyFilterBaseNode_97);
      dirtyFlagSupplierMap.put(dirtyFilterBaseNode_99, () -> isDirty_dirtyFilterBaseNode_99);
      dirtyFlagSupplierMap.put(
          dirtyFilterControlRootNode_101, () -> isDirty_dirtyFilterControlRootNode_101);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_11, () -> isDirty_dirtyFilterFilteringNode_11);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_14, () -> isDirty_dirtyFilterFilteringNode_14);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_17, () -> isDirty_dirtyFilterFilteringNode_17);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_2, () -> isDirty_dirtyFilterFilteringNode_2);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_20, () -> isDirty_dirtyFilterFilteringNode_20);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_23, () -> isDirty_dirtyFilterFilteringNode_23);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_26, () -> isDirty_dirtyFilterFilteringNode_26);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_29, () -> isDirty_dirtyFilterFilteringNode_29);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_32, () -> isDirty_dirtyFilterFilteringNode_32);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_35, () -> isDirty_dirtyFilterFilteringNode_35);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_38, () -> isDirty_dirtyFilterFilteringNode_38);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_41, () -> isDirty_dirtyFilterFilteringNode_41);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_44, () -> isDirty_dirtyFilterFilteringNode_44);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_47, () -> isDirty_dirtyFilterFilteringNode_47);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_5, () -> isDirty_dirtyFilterFilteringNode_5);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_50, () -> isDirty_dirtyFilterFilteringNode_50);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_53, () -> isDirty_dirtyFilterFilteringNode_53);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_56, () -> isDirty_dirtyFilterFilteringNode_56);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_59, () -> isDirty_dirtyFilterFilteringNode_59);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_62, () -> isDirty_dirtyFilterFilteringNode_62);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_65, () -> isDirty_dirtyFilterFilteringNode_65);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_68, () -> isDirty_dirtyFilterFilteringNode_68);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_71, () -> isDirty_dirtyFilterFilteringNode_71);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_74, () -> isDirty_dirtyFilterFilteringNode_74);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_77, () -> isDirty_dirtyFilterFilteringNode_77);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_8, () -> isDirty_dirtyFilterFilteringNode_8);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_80, () -> isDirty_dirtyFilterFilteringNode_80);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_83, () -> isDirty_dirtyFilterFilteringNode_83);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_86, () -> isDirty_dirtyFilterFilteringNode_86);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_89, () -> isDirty_dirtyFilterFilteringNode_89);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_92, () -> isDirty_dirtyFilterFilteringNode_92);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_95, () -> isDirty_dirtyFilterFilteringNode_95);
      dirtyFlagSupplierMap.put(
          dirtyFilterFilteringNode_98, () -> isDirty_dirtyFilterFilteringNode_98);
    }
    return dirtyFlagSupplierMap.getOrDefault(node, DataFlow.ALWAYS_FALSE);
  }

  @Override
  public void setDirty(Object node, boolean dirtyFlag) {
    if (dirtyFlagUpdateMap.isEmpty()) {
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_1, (b) -> isDirty_dirtyFilterBaseNode_1 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_10, (b) -> isDirty_dirtyFilterBaseNode_10 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_100, (b) -> isDirty_dirtyFilterBaseNode_100 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_12, (b) -> isDirty_dirtyFilterBaseNode_12 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_13, (b) -> isDirty_dirtyFilterBaseNode_13 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_15, (b) -> isDirty_dirtyFilterBaseNode_15 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_16, (b) -> isDirty_dirtyFilterBaseNode_16 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_18, (b) -> isDirty_dirtyFilterBaseNode_18 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_19, (b) -> isDirty_dirtyFilterBaseNode_19 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_21, (b) -> isDirty_dirtyFilterBaseNode_21 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_22, (b) -> isDirty_dirtyFilterBaseNode_22 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_24, (b) -> isDirty_dirtyFilterBaseNode_24 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_25, (b) -> isDirty_dirtyFilterBaseNode_25 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_27, (b) -> isDirty_dirtyFilterBaseNode_27 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_28, (b) -> isDirty_dirtyFilterBaseNode_28 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_3, (b) -> isDirty_dirtyFilterBaseNode_3 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_30, (b) -> isDirty_dirtyFilterBaseNode_30 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_31, (b) -> isDirty_dirtyFilterBaseNode_31 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_33, (b) -> isDirty_dirtyFilterBaseNode_33 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_34, (b) -> isDirty_dirtyFilterBaseNode_34 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_36, (b) -> isDirty_dirtyFilterBaseNode_36 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_37, (b) -> isDirty_dirtyFilterBaseNode_37 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_39, (b) -> isDirty_dirtyFilterBaseNode_39 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_4, (b) -> isDirty_dirtyFilterBaseNode_4 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_40, (b) -> isDirty_dirtyFilterBaseNode_40 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_42, (b) -> isDirty_dirtyFilterBaseNode_42 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_43, (b) -> isDirty_dirtyFilterBaseNode_43 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_45, (b) -> isDirty_dirtyFilterBaseNode_45 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_46, (b) -> isDirty_dirtyFilterBaseNode_46 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_48, (b) -> isDirty_dirtyFilterBaseNode_48 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_49, (b) -> isDirty_dirtyFilterBaseNode_49 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_51, (b) -> isDirty_dirtyFilterBaseNode_51 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_52, (b) -> isDirty_dirtyFilterBaseNode_52 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_54, (b) -> isDirty_dirtyFilterBaseNode_54 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_55, (b) -> isDirty_dirtyFilterBaseNode_55 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_57, (b) -> isDirty_dirtyFilterBaseNode_57 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_58, (b) -> isDirty_dirtyFilterBaseNode_58 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_6, (b) -> isDirty_dirtyFilterBaseNode_6 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_60, (b) -> isDirty_dirtyFilterBaseNode_60 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_61, (b) -> isDirty_dirtyFilterBaseNode_61 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_63, (b) -> isDirty_dirtyFilterBaseNode_63 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_64, (b) -> isDirty_dirtyFilterBaseNode_64 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_66, (b) -> isDirty_dirtyFilterBaseNode_66 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_67, (b) -> isDirty_dirtyFilterBaseNode_67 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_69, (b) -> isDirty_dirtyFilterBaseNode_69 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_7, (b) -> isDirty_dirtyFilterBaseNode_7 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_70, (b) -> isDirty_dirtyFilterBaseNode_70 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_72, (b) -> isDirty_dirtyFilterBaseNode_72 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_73, (b) -> isDirty_dirtyFilterBaseNode_73 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_75, (b) -> isDirty_dirtyFilterBaseNode_75 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_76, (b) -> isDirty_dirtyFilterBaseNode_76 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_78, (b) -> isDirty_dirtyFilterBaseNode_78 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_79, (b) -> isDirty_dirtyFilterBaseNode_79 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_81, (b) -> isDirty_dirtyFilterBaseNode_81 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_82, (b) -> isDirty_dirtyFilterBaseNode_82 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_84, (b) -> isDirty_dirtyFilterBaseNode_84 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_85, (b) -> isDirty_dirtyFilterBaseNode_85 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_87, (b) -> isDirty_dirtyFilterBaseNode_87 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_88, (b) -> isDirty_dirtyFilterBaseNode_88 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_9, (b) -> isDirty_dirtyFilterBaseNode_9 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_90, (b) -> isDirty_dirtyFilterBaseNode_90 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_91, (b) -> isDirty_dirtyFilterBaseNode_91 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_93, (b) -> isDirty_dirtyFilterBaseNode_93 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_94, (b) -> isDirty_dirtyFilterBaseNode_94 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_96, (b) -> isDirty_dirtyFilterBaseNode_96 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_97, (b) -> isDirty_dirtyFilterBaseNode_97 = b);
      dirtyFlagUpdateMap.put(dirtyFilterBaseNode_99, (b) -> isDirty_dirtyFilterBaseNode_99 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterControlRootNode_101, (b) -> isDirty_dirtyFilterControlRootNode_101 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_11, (b) -> isDirty_dirtyFilterFilteringNode_11 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_14, (b) -> isDirty_dirtyFilterFilteringNode_14 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_17, (b) -> isDirty_dirtyFilterFilteringNode_17 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_2, (b) -> isDirty_dirtyFilterFilteringNode_2 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_20, (b) -> isDirty_dirtyFilterFilteringNode_20 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_23, (b) -> isDirty_dirtyFilterFilteringNode_23 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_26, (b) -> isDirty_dirtyFilterFilteringNode_26 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_29, (b) -> isDirty_dirtyFilterFilteringNode_29 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_32, (b) -> isDirty_dirtyFilterFilteringNode_32 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_35, (b) -> isDirty_dirtyFilterFilteringNode_35 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_38, (b) -> isDirty_dirtyFilterFilteringNode_38 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_41, (b) -> isDirty_dirtyFilterFilteringNode_41 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_44, (b) -> isDirty_dirtyFilterFilteringNode_44 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_47, (b) -> isDirty_dirtyFilterFilteringNode_47 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_5, (b) -> isDirty_dirtyFilterFilteringNode_5 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_50, (b) -> isDirty_dirtyFilterFilteringNode_50 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_53, (b) -> isDirty_dirtyFilterFilteringNode_53 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_56, (b) -> isDirty_dirtyFilterFilteringNode_56 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_59, (b) -> isDirty_dirtyFilterFilteringNode_59 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_62, (b) -> isDirty_dirtyFilterFilteringNode_62 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_65, (b) -> isDirty_dirtyFilterFilteringNode_65 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_68, (b) -> isDirty_dirtyFilterFilteringNode_68 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_71, (b) -> isDirty_dirtyFilterFilteringNode_71 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_74, (b) -> isDirty_dirtyFilterFilteringNode_74 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_77, (b) -> isDirty_dirtyFilterFilteringNode_77 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_8, (b) -> isDirty_dirtyFilterFilteringNode_8 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_80, (b) -> isDirty_dirtyFilterFilteringNode_80 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_83, (b) -> isDirty_dirtyFilterFilteringNode_83 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_86, (b) -> isDirty_dirtyFilterFilteringNode_86 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_89, (b) -> isDirty_dirtyFilterFilteringNode_89 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_92, (b) -> isDirty_dirtyFilterFilteringNode_92 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_95, (b) -> isDirty_dirtyFilterFilteringNode_95 = b);
      dirtyFlagUpdateMap.put(
          dirtyFilterFilteringNode_98, (b) -> isDirty_dirtyFilterFilteringNode_98 = b);
    }
    dirtyFlagUpdateMap.get(node).accept(dirtyFlag);
  }

  private boolean guardCheck_dirtyFilterBaseNode_1() {
    return isDirty_dirtyFilterFilteringNode_2;
  }

  private boolean guardCheck_dirtyFilterBaseNode_3() {
    return isDirty_dirtyFilterBaseNode_4;
  }

  private boolean guardCheck_dirtyFilterBaseNode_4() {
    return isDirty_dirtyFilterFilteringNode_5;
  }

  private boolean guardCheck_dirtyFilterBaseNode_6() {
    return isDirty_dirtyFilterBaseNode_7;
  }

  private boolean guardCheck_dirtyFilterBaseNode_7() {
    return isDirty_dirtyFilterFilteringNode_8;
  }

  private boolean guardCheck_dirtyFilterBaseNode_9() {
    return isDirty_dirtyFilterBaseNode_10;
  }

  private boolean guardCheck_dirtyFilterBaseNode_10() {
    return isDirty_dirtyFilterFilteringNode_11;
  }

  private boolean guardCheck_dirtyFilterBaseNode_12() {
    return isDirty_dirtyFilterBaseNode_13;
  }

  private boolean guardCheck_dirtyFilterBaseNode_13() {
    return isDirty_dirtyFilterFilteringNode_14;
  }

  private boolean guardCheck_dirtyFilterBaseNode_15() {
    return isDirty_dirtyFilterBaseNode_16;
  }

  private boolean guardCheck_dirtyFilterBaseNode_16() {
    return isDirty_dirtyFilterFilteringNode_17;
  }

  private boolean guardCheck_dirtyFilterBaseNode_18() {
    return isDirty_dirtyFilterBaseNode_19;
  }

  private boolean guardCheck_dirtyFilterBaseNode_19() {
    return isDirty_dirtyFilterFilteringNode_20;
  }

  private boolean guardCheck_dirtyFilterBaseNode_21() {
    return isDirty_dirtyFilterBaseNode_22;
  }

  private boolean guardCheck_dirtyFilterBaseNode_22() {
    return isDirty_dirtyFilterFilteringNode_23;
  }

  private boolean guardCheck_dirtyFilterBaseNode_24() {
    return isDirty_dirtyFilterBaseNode_25;
  }

  private boolean guardCheck_dirtyFilterBaseNode_25() {
    return isDirty_dirtyFilterFilteringNode_26;
  }

  private boolean guardCheck_dirtyFilterBaseNode_27() {
    return isDirty_dirtyFilterBaseNode_28;
  }

  private boolean guardCheck_dirtyFilterBaseNode_28() {
    return isDirty_dirtyFilterFilteringNode_29;
  }

  private boolean guardCheck_dirtyFilterBaseNode_30() {
    return isDirty_dirtyFilterBaseNode_31;
  }

  private boolean guardCheck_dirtyFilterBaseNode_31() {
    return isDirty_dirtyFilterFilteringNode_32;
  }

  private boolean guardCheck_dirtyFilterBaseNode_33() {
    return isDirty_dirtyFilterBaseNode_34;
  }

  private boolean guardCheck_dirtyFilterBaseNode_34() {
    return isDirty_dirtyFilterFilteringNode_35;
  }

  private boolean guardCheck_dirtyFilterBaseNode_36() {
    return isDirty_dirtyFilterBaseNode_37;
  }

  private boolean guardCheck_dirtyFilterBaseNode_37() {
    return isDirty_dirtyFilterFilteringNode_38;
  }

  private boolean guardCheck_dirtyFilterBaseNode_39() {
    return isDirty_dirtyFilterBaseNode_40;
  }

  private boolean guardCheck_dirtyFilterBaseNode_40() {
    return isDirty_dirtyFilterFilteringNode_41;
  }

  private boolean guardCheck_dirtyFilterBaseNode_42() {
    return isDirty_dirtyFilterBaseNode_43;
  }

  private boolean guardCheck_dirtyFilterBaseNode_43() {
    return isDirty_dirtyFilterFilteringNode_44;
  }

  private boolean guardCheck_dirtyFilterBaseNode_45() {
    return isDirty_dirtyFilterBaseNode_46;
  }

  private boolean guardCheck_dirtyFilterBaseNode_46() {
    return isDirty_dirtyFilterFilteringNode_47;
  }

  private boolean guardCheck_dirtyFilterBaseNode_48() {
    return isDirty_dirtyFilterBaseNode_49;
  }

  private boolean guardCheck_dirtyFilterBaseNode_49() {
    return isDirty_dirtyFilterFilteringNode_50;
  }

  private boolean guardCheck_dirtyFilterBaseNode_51() {
    return isDirty_dirtyFilterBaseNode_52;
  }

  private boolean guardCheck_dirtyFilterBaseNode_52() {
    return isDirty_dirtyFilterFilteringNode_53;
  }

  private boolean guardCheck_dirtyFilterBaseNode_54() {
    return isDirty_dirtyFilterBaseNode_55;
  }

  private boolean guardCheck_dirtyFilterBaseNode_55() {
    return isDirty_dirtyFilterFilteringNode_56;
  }

  private boolean guardCheck_dirtyFilterBaseNode_57() {
    return isDirty_dirtyFilterBaseNode_58;
  }

  private boolean guardCheck_dirtyFilterBaseNode_58() {
    return isDirty_dirtyFilterFilteringNode_59;
  }

  private boolean guardCheck_dirtyFilterBaseNode_60() {
    return isDirty_dirtyFilterBaseNode_61;
  }

  private boolean guardCheck_dirtyFilterBaseNode_61() {
    return isDirty_dirtyFilterFilteringNode_62;
  }

  private boolean guardCheck_dirtyFilterBaseNode_63() {
    return isDirty_dirtyFilterBaseNode_64;
  }

  private boolean guardCheck_dirtyFilterBaseNode_64() {
    return isDirty_dirtyFilterFilteringNode_65;
  }

  private boolean guardCheck_dirtyFilterBaseNode_66() {
    return isDirty_dirtyFilterBaseNode_67;
  }

  private boolean guardCheck_dirtyFilterBaseNode_67() {
    return isDirty_dirtyFilterFilteringNode_68;
  }

  private boolean guardCheck_dirtyFilterBaseNode_69() {
    return isDirty_dirtyFilterBaseNode_70;
  }

  private boolean guardCheck_dirtyFilterBaseNode_70() {
    return isDirty_dirtyFilterFilteringNode_71;
  }

  private boolean guardCheck_dirtyFilterBaseNode_72() {
    return isDirty_dirtyFilterBaseNode_73;
  }

  private boolean guardCheck_dirtyFilterBaseNode_73() {
    return isDirty_dirtyFilterFilteringNode_74;
  }

  private boolean guardCheck_dirtyFilterBaseNode_75() {
    return isDirty_dirtyFilterBaseNode_76;
  }

  private boolean guardCheck_dirtyFilterBaseNode_76() {
    return isDirty_dirtyFilterFilteringNode_77;
  }

  private boolean guardCheck_dirtyFilterBaseNode_78() {
    return isDirty_dirtyFilterBaseNode_79;
  }

  private boolean guardCheck_dirtyFilterBaseNode_79() {
    return isDirty_dirtyFilterFilteringNode_80;
  }

  private boolean guardCheck_dirtyFilterBaseNode_81() {
    return isDirty_dirtyFilterBaseNode_82;
  }

  private boolean guardCheck_dirtyFilterBaseNode_82() {
    return isDirty_dirtyFilterFilteringNode_83;
  }

  private boolean guardCheck_dirtyFilterBaseNode_84() {
    return isDirty_dirtyFilterBaseNode_85;
  }

  private boolean guardCheck_dirtyFilterBaseNode_85() {
    return isDirty_dirtyFilterFilteringNode_86;
  }

  private boolean guardCheck_dirtyFilterBaseNode_87() {
    return isDirty_dirtyFilterBaseNode_88;
  }

  private boolean guardCheck_dirtyFilterBaseNode_88() {
    return isDirty_dirtyFilterFilteringNode_89;
  }

  private boolean guardCheck_dirtyFilterBaseNode_90() {
    return isDirty_dirtyFilterBaseNode_91;
  }

  private boolean guardCheck_dirtyFilterBaseNode_91() {
    return isDirty_dirtyFilterFilteringNode_92;
  }

  private boolean guardCheck_dirtyFilterBaseNode_93() {
    return isDirty_dirtyFilterBaseNode_94;
  }

  private boolean guardCheck_dirtyFilterBaseNode_94() {
    return isDirty_dirtyFilterFilteringNode_95;
  }

  private boolean guardCheck_dirtyFilterBaseNode_96() {
    return isDirty_dirtyFilterBaseNode_97;
  }

  private boolean guardCheck_dirtyFilterBaseNode_97() {
    return isDirty_dirtyFilterFilteringNode_98;
  }

  private boolean guardCheck_dirtyFilterBaseNode_99() {
    return isDirty_dirtyFilterBaseNode_100;
  }

  private boolean guardCheck_dirtyFilterBaseNode_100() {
    return isDirty_dirtyFilterControlRootNode_101;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_2() {
    return isDirty_dirtyFilterBaseNode_3;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_5() {
    return isDirty_dirtyFilterBaseNode_6;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_8() {
    return isDirty_dirtyFilterBaseNode_9;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_11() {
    return isDirty_dirtyFilterBaseNode_12;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_14() {
    return isDirty_dirtyFilterBaseNode_15;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_17() {
    return isDirty_dirtyFilterBaseNode_18;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_20() {
    return isDirty_dirtyFilterBaseNode_21;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_23() {
    return isDirty_dirtyFilterBaseNode_24;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_26() {
    return isDirty_dirtyFilterBaseNode_27;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_29() {
    return isDirty_dirtyFilterBaseNode_30;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_32() {
    return isDirty_dirtyFilterBaseNode_33;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_35() {
    return isDirty_dirtyFilterBaseNode_36;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_38() {
    return isDirty_dirtyFilterBaseNode_39;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_41() {
    return isDirty_dirtyFilterBaseNode_42;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_44() {
    return isDirty_dirtyFilterBaseNode_45;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_47() {
    return isDirty_dirtyFilterBaseNode_48;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_50() {
    return isDirty_dirtyFilterBaseNode_51;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_53() {
    return isDirty_dirtyFilterBaseNode_54;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_56() {
    return isDirty_dirtyFilterBaseNode_57;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_59() {
    return isDirty_dirtyFilterBaseNode_60;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_62() {
    return isDirty_dirtyFilterBaseNode_63;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_65() {
    return isDirty_dirtyFilterBaseNode_66;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_68() {
    return isDirty_dirtyFilterBaseNode_69;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_71() {
    return isDirty_dirtyFilterBaseNode_72;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_74() {
    return isDirty_dirtyFilterBaseNode_75;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_77() {
    return isDirty_dirtyFilterBaseNode_78;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_80() {
    return isDirty_dirtyFilterBaseNode_81;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_83() {
    return isDirty_dirtyFilterBaseNode_84;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_86() {
    return isDirty_dirtyFilterBaseNode_87;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_89() {
    return isDirty_dirtyFilterBaseNode_90;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_92() {
    return isDirty_dirtyFilterBaseNode_93;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_95() {
    return isDirty_dirtyFilterBaseNode_96;
  }

  private boolean guardCheck_dirtyFilterFilteringNode_98() {
    return isDirty_dirtyFilterBaseNode_99;
  }

  private boolean guardCheck_sink() {
    return isDirty_dirtyFilterBaseNode_1;
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
  public DirtyFilter100Processor newInstance() {
    return new DirtyFilter100Processor();
  }

  @Override
  public DirtyFilter100Processor newInstance(Map<Object, Object> contextMap) {
    return new DirtyFilter100Processor();
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
