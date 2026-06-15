package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class h {

    /* renamed from: c  reason: collision with root package name */
    public static final int f18815c = -1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f18816d = 0;

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, ArrayList<a>> f18817a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private int f18818b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum a {
        ISAuctionPerformanceDidntAttemptToLoad,
        ISAuctionPerformanceFailedToLoad,
        ISAuctionPerformanceLoadedSuccessfully,
        ISAuctionPerformanceFailedToShow,
        ISAuctionPerformanceShowedSuccessfully,
        ISAuctionPerformanceNotPartOfWaterfall
    }

    public h(List<NetworkSettings> list, int i10) {
        this.f18818b = i10;
        for (NetworkSettings networkSettings : list) {
            this.f18817a.put(networkSettings.getProviderName(), new ArrayList<>());
        }
    }

    public String a(String str) {
        ArrayList<a> arrayList = this.f18817a.get(str);
        String str2 = "";
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<a> it = arrayList.iterator();
            StringBuilder sb = new StringBuilder();
            while (true) {
                sb.append(str2);
                sb.append(it.next().ordinal());
                str2 = sb.toString();
                if (!it.hasNext()) {
                    break;
                }
                str2 = str2 + ",";
                sb = new StringBuilder();
            }
        }
        return str2;
    }

    public void a(ConcurrentHashMap<String, a> concurrentHashMap) {
        if (this.f18818b == 0) {
            return;
        }
        for (String str : this.f18817a.keySet()) {
            a aVar = a.ISAuctionPerformanceNotPartOfWaterfall;
            if (concurrentHashMap.containsKey(str)) {
                aVar = concurrentHashMap.get(str);
            }
            ArrayList<a> arrayList = this.f18817a.get(str);
            if (this.f18818b != -1 && arrayList.size() == this.f18818b) {
                arrayList.remove(0);
            }
            arrayList.add(aVar);
        }
    }
}
