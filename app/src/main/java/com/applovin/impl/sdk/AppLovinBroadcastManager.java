package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AppLovinBroadcastManager {

    /* renamed from: a  reason: collision with root package name */
    private static final Map f8664a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final Map f8665b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final ArrayList f8666c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private static final Handler f8667d = new a(Looper.getMainLooper());

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface Receiver {
        void onReceive(Intent intent, Map<String, Object> map);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                AppLovinBroadcastManager.b();
            } else {
                super.handleMessage(message);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final Intent f8668a;

        /* renamed from: b  reason: collision with root package name */
        final Map f8669b;

        /* renamed from: c  reason: collision with root package name */
        final List f8670c;

        b(Intent intent, Map map, List list) {
            this.f8668a = intent;
            this.f8669b = map;
            this.f8670c = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final IntentFilter f8671a;

        /* renamed from: b  reason: collision with root package name */
        final Receiver f8672b;

        /* renamed from: c  reason: collision with root package name */
        boolean f8673c;

        /* renamed from: d  reason: collision with root package name */
        boolean f8674d;

        c(IntentFilter intentFilter, Receiver receiver) {
            this.f8671a = intentFilter;
            this.f8672b = receiver;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (f8664a) {
                ArrayList arrayList = f8666c;
                size = arrayList.size();
                if (size <= 0) {
                    return;
                }
                bVarArr = new b[size];
                arrayList.toArray(bVarArr);
                arrayList.clear();
            }
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = bVarArr[i10];
                if (bVar != null) {
                    for (c cVar : bVar.f8670c) {
                        if (cVar != null && !cVar.f8674d) {
                            cVar.f8672b.onReceive(bVar.f8668a, bVar.f8669b);
                        }
                    }
                }
            }
        }
    }

    public static void registerReceiver(Receiver receiver, IntentFilter intentFilter) {
        Map map = f8664a;
        synchronized (map) {
            c cVar = new c(intentFilter, receiver);
            ArrayList arrayList = (ArrayList) map.get(receiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                map.put(receiver, arrayList);
            }
            arrayList.add(cVar);
            Iterator<String> actionsIterator = intentFilter.actionsIterator();
            while (actionsIterator.hasNext()) {
                String next = actionsIterator.next();
                Map map2 = f8665b;
                ArrayList arrayList2 = (ArrayList) map2.get(next);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    map2.put(next, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    public static boolean sendBroadcast(Intent intent, Map<String, Object> map) {
        synchronized (f8664a) {
            List a10 = a(intent);
            if (a10 == null) {
                return false;
            }
            f8666c.add(new b(intent, map, a10));
            Handler handler = f8667d;
            if (!handler.hasMessages(1)) {
                handler.sendEmptyMessage(1);
            }
            return true;
        }
    }

    public static void sendBroadcastSync(Intent intent, Map<String, Object> map) {
        List<c> a10 = a(intent);
        if (a10 == null) {
            return;
        }
        for (c cVar : a10) {
            if (!cVar.f8674d) {
                cVar.f8672b.onReceive(intent, map);
            }
        }
    }

    public static void sendBroadcastSyncWithPendingBroadcasts(Intent intent, Map<String, Object> map) {
        if (sendBroadcast(intent, map)) {
            b();
        }
    }

    public static boolean sendBroadcastWithAdObject(String str, Object obj) {
        HashMap hashMap = new HashMap(1);
        hashMap.put("ad", obj);
        return sendBroadcast(new Intent(str), hashMap);
    }

    public static void unregisterReceiver(Receiver receiver) {
        Map map = f8664a;
        synchronized (map) {
            List<c> list = (List) map.remove(receiver);
            if (list == null) {
                return;
            }
            for (c cVar : list) {
                cVar.f8674d = true;
                Iterator<String> actionsIterator = cVar.f8671a.actionsIterator();
                while (actionsIterator.hasNext()) {
                    String next = actionsIterator.next();
                    List list2 = (List) f8665b.get(next);
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (((c) it.next()).f8672b == receiver) {
                                cVar.f8674d = true;
                                it.remove();
                            }
                        }
                        if (list2.size() <= 0) {
                            f8665b.remove(next);
                        }
                    }
                }
            }
        }
    }

    private static List a(Intent intent) {
        synchronized (f8664a) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            List<c> list = (List) f8665b.get(action);
            if (list == null) {
                return null;
            }
            ArrayList<c> arrayList = null;
            for (c cVar : list) {
                if (!cVar.f8673c && cVar.f8671a.match(action, null, scheme, data, categories, "AppLovinBroadcastManager") >= 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(cVar);
                    cVar.f8673c = true;
                }
            }
            if (arrayList == null) {
                return null;
            }
            for (c cVar2 : arrayList) {
                cVar2.f8673c = false;
            }
            return arrayList;
        }
    }
}
