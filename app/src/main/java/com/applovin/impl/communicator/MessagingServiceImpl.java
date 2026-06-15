package com.applovin.impl.communicator;

import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorMessagingService;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MessagingServiceImpl implements AppLovinCommunicatorMessagingService {

    /* renamed from: a  reason: collision with root package name */
    private ScheduledThreadPoolExecutor f6777a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f6778b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final Map f6779c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Object f6780d = new Object();

    private Queue a(String str) {
        LinkedList linkedList;
        synchronized (this.f6780d) {
            Queue queue = (Queue) this.f6779c.get(str);
            if (queue != null) {
                linkedList = new LinkedList(queue);
            } else {
                linkedList = new LinkedList();
            }
        }
        return linkedList;
    }

    private void b(CommunicatorMessageImpl communicatorMessageImpl) {
        if (communicatorMessageImpl.sticky) {
            synchronized (this.f6780d) {
                Queue queue = (Queue) this.f6779c.get(communicatorMessageImpl.getTopic());
                if (queue != null) {
                    queue.add(communicatorMessageImpl);
                    if (queue.size() > 10) {
                        queue.remove();
                    }
                } else {
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(communicatorMessageImpl);
                    this.f6779c.put(communicatorMessageImpl.getTopic(), linkedList);
                }
            }
        }
    }

    private void c(final CommunicatorMessageImpl communicatorMessageImpl) {
        ScheduledThreadPoolExecutor a10 = a();
        this.f6777a = a10;
        a10.execute(new Runnable() { // from class: com.applovin.impl.communicator.a
            @Override // java.lang.Runnable
            public final void run() {
                AppLovinBroadcastManager.sendBroadcastSync(CommunicatorMessageImpl.this, null);
            }
        });
    }

    public void maybeSendStickyMessages(String str) {
        for (CommunicatorMessageImpl communicatorMessageImpl : a(str)) {
            c(communicatorMessageImpl);
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorMessagingService
    public void publish(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        c(appLovinCommunicatorMessage);
        b(appLovinCommunicatorMessage);
    }

    public String toString() {
        return "MessagingServiceImpl{}";
    }

    private ScheduledThreadPoolExecutor a() {
        synchronized (this.f6778b) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f6777a;
            if (scheduledThreadPoolExecutor != null) {
                return scheduledThreadPoolExecutor;
            }
            return new ScheduledThreadPoolExecutor(1, new ThreadFactory() { // from class: com.applovin.impl.communicator.b
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread a10;
                    a10 = MessagingServiceImpl.a(runnable);
                    return a10;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread a(Runnable runnable) {
        Thread thread = new Thread(runnable, "AppLovinSdk:communicator");
        thread.setPriority(1);
        thread.setDaemon(true);
        return thread;
    }
}
