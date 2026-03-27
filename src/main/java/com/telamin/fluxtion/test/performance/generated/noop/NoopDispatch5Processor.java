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
*<pre>
* generation time           : Not available
* api version               : unknown api version
* analyser version          : unknown analyser version
* target generator version  : unknown generator version
*</pre>
* Event classes supported:
* <ul>
*   <li>com.telamin.fluxtion.runtime.time.ClockStrategy.ClockStrategyEvent</li>
*   <li>com.telamin.fluxtion.test.performance.events.MarketDataEvent</li>
* </ul>
* @author Greg Higgins
*/
@SuppressWarnings({"unchecked", "rawtypes"})
public class NoopDispatch5Processor implements
CloneableDataFlow<NoopDispatch5Processor>, 
 /*--- @ExportService start ---*/
 @ExportService ServiceListener,
/*--- @ExportService end ---*/
 DataFlow, InternalEventProcessor, BatchHandler {

//Node declarations
    private transient  final CallbackDispatcherImpl callbackDispatcher = new CallbackDispatcherImpl();
    public transient  final Clock clock = new Clock();
    public transient  final NodeNameAuditor nodeNameLookup = new NodeNameAuditor();
    private transient  final RootNoOpNode rootNoOpNode_6 = new RootNoOpNode();
    private transient  final NoOpNode noOpNode_5 = new NoOpNode();
    private transient  final NoOpNode noOpNode_4 = new NoOpNode();
    private transient  final NoOpNode noOpNode_3 = new NoOpNode();
    private transient  final NoOpNode noOpNode_2 = new NoOpNode();
    private transient  final NoOpNode noOpNode_1 = new NoOpNode();
    public transient  final NoOpPublisherNode sink = new NoOpPublisherNode();
    private transient  final SubscriptionManagerNode subscriptionManager = new SubscriptionManagerNode();
    private transient  final MutableDataFlowContext context =  new com.telamin.fluxtion.runtime.node.MutableDataFlowContext(nodeNameLookup, callbackDispatcher, subscriptionManager, callbackDispatcher);;
    public transient  final ServiceRegistryNode serviceRegistry = new ServiceRegistryNode();
private transient final ExportFunctionAuditEvent functionAudit = new ExportFunctionAuditEvent();
//Dirty flags
private boolean initCalled = false;
private boolean processing = false;
private boolean buffering = false;
private transient final IdentityHashMap<Object, BooleanSupplier> dirtyFlagSupplierMap = new IdentityHashMap<>(0);
private transient final IdentityHashMap<Object, Consumer<Boolean>> dirtyFlagUpdateMap = new IdentityHashMap<>(0);

    
    
//Forked declarations


    //Filter constants
    
    //unknown event handler
    private Consumer unKnownEventHandler = (e) -> {};

    public  NoopDispatch5Processor (Map<Object, Object> contextMap) {
        if(context != null) {
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
    noOpNode_5.setUpstream1(rootNoOpNode_6);
    noOpNode_5.value = 0.0;
    noOpNode_5.upstream1 = rootNoOpNode_6;
    sink.setUpstream1(noOpNode_1);
    sink.upstream1 = noOpNode_1;
    sink.value = 0.0;
    rootNoOpNode_6.value = 0.0;
    	//node auditors
    initialiseAuditor(clock);
    initialiseAuditor(nodeNameLookup);
    initialiseAuditor(serviceRegistry);
        if(subscriptionManager != null){
          subscriptionManager.setSubscribingEventProcessor(this);
        }
        if(context != null) {
          context.setEventProcessorCallback(this);
        }
    }
    public NoopDispatch5Processor () {
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
        if(!initCalled){
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
        if(!initCalled){
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
        if(!initCalled){
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
    public void setContextParameterMap(Map<Object, Object> newContextMapping){
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
        if(buffering){
            triggerCalculation();
        }
        if(processing){
            callbackDispatcher.queueReentrantEvent(event);
        }else{
            processing = true;
            onEventInternal(event);
            callbackDispatcher.dispatchQueuedCallbacks();
            processing = false;
        }
    }

    @Override
    public void onEventInternal(Object event) {
                 if (event instanceof ClockStrategyEvent) {
                ClockStrategyEvent typedEvent = (ClockStrategyEvent)event;
                handleEvent(typedEvent);
            }
     else if (event instanceof MarketDataEvent) {
                MarketDataEvent typedEvent = (MarketDataEvent)event;
                handleEvent(typedEvent);
            }
            else{ 
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
                        rootNoOpNode_6.onMarketData(typedEvent);
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
public void deRegisterService(com.telamin.fluxtion.runtime.service.Service<?> arg0){
beforeServiceCall("@Override\npublic void deRegisterService(com.telamin.fluxtion.runtime.service.Service<?> arg0)");
ExportFunctionAuditEvent typedEvent = functionAudit;
                        serviceRegistry.deRegisterService(arg0);
	afterServiceCall();
}
@Override
public void registerService(com.telamin.fluxtion.runtime.service.Service<?> arg0){
beforeServiceCall("@Override\npublic void registerService(com.telamin.fluxtion.runtime.service.Service<?> arg0)");
ExportFunctionAuditEvent typedEvent = functionAudit;
                        serviceRegistry.registerService(arg0);
	afterServiceCall();
}
//EXPORTED SERVICE FUNCTIONS - END

  //EVENT BUFFERING - START
    public void bufferEvent(Object event){
        buffering = true;
          if (event instanceof ClockStrategyEvent) {
                ClockStrategyEvent typedEvent = (ClockStrategyEvent)event;
auditEvent(typedEvent);
                        clock.setClockStrategy(typedEvent);
            }
     else if (event instanceof MarketDataEvent) {
                MarketDataEvent typedEvent = (MarketDataEvent)event;
auditEvent(typedEvent);
                        rootNoOpNode_6.onMarketData(typedEvent);
            }
    }

    public void triggerCalculation(){
        buffering = false;
        String typedEvent = "No event information - buffered dispatch";
                        noOpNode_5.onUpstreamUpdate();
                        noOpNode_4.onUpstreamUpdate();
                        noOpNode_3.onUpstreamUpdate();
                        noOpNode_2.onUpstreamUpdate();
                        noOpNode_1.onUpstreamUpdate();
                        sink.onUpstreamUpdate();
        afterEvent();

    }
  //EVENT BUFFERING - END

private void auditEvent(Object typedEvent){
        clock.eventReceived(typedEvent);
        nodeNameLookup.eventReceived(typedEvent);
        serviceRegistry.eventReceived(typedEvent);
}
private void auditEvent(Event typedEvent){
        clock.eventReceived(typedEvent);
        nodeNameLookup.eventReceived(typedEvent);
        serviceRegistry.eventReceived(typedEvent);
}
private void initialiseAuditor(Auditor auditor){
	auditor.init();
auditor.nodeRegistered(callbackDispatcher, "callbackDispatcher");auditor.nodeRegistered(subscriptionManager, "subscriptionManager");auditor.nodeRegistered(context, "context");auditor.nodeRegistered(noOpNode_1, "noOpNode_1");auditor.nodeRegistered(noOpNode_2, "noOpNode_2");auditor.nodeRegistered(noOpNode_3, "noOpNode_3");auditor.nodeRegistered(noOpNode_4, "noOpNode_4");auditor.nodeRegistered(noOpNode_5, "noOpNode_5");auditor.nodeRegistered(sink, "sink");auditor.nodeRegistered(rootNoOpNode_6, "rootNoOpNode_6");}


    private void beforeServiceCall(String functionDescription){
        functionAudit.setFunctionDescription(functionDescription);
        auditEvent(functionAudit);
        if (buffering) {
            triggerCalculation();
        }
        processing = true;
    }

    private void afterServiceCall(){
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
        if(dirtyFlagSupplierMap.isEmpty()){
            
        }
        return dirtyFlagSupplierMap.getOrDefault(node, DataFlow.ALWAYS_FALSE);
    }

    @Override
    public void setDirty(Object node, boolean dirtyFlag) {
        if(dirtyFlagUpdateMap.isEmpty()){
         
        }
        dirtyFlagUpdateMap.get(node).accept(dirtyFlag);
    }

    

    @Override
    public<T> T getNodeById(String id) throws NoSuchFieldException {
        return nodeNameLookup.getInstanceById(id);
    }

    @Override
    public <A extends Auditor> A getAuditorById(String id) throws NoSuchFieldException, IllegalAccessException {
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
    public NoopDispatch5Processor newInstance(){
        return new NoopDispatch5Processor();
    }

    @Override
    public NoopDispatch5Processor newInstance(Map<Object, Object> contextMap){
        return new NoopDispatch5Processor();
    }

    

    @Override
    public String getLastAuditLogRecord() {
        try {
            EventLogManager eventLogManager = (EventLogManager) this.getClass().getField(EventLogManager.NODE_NAME).get(this);
            return eventLogManager.lastRecordAsString();
        } catch (Throwable e) {
            return "";
        }
    }

    public void unKnownEventHandler(Object object) {
        unKnownEventHandler.accept(object);
    }

    @Override
    public <T> void setUnKnownEventHandler(Consumer<T> consumer){
        unKnownEventHandler = consumer;
    }

    @Override
    public SubscriptionManager getSubscriptionManager() {
        return subscriptionManager;
    }
}