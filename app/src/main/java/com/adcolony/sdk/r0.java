package com.adcolony.sdk;

import android.os.Bundle;
import java.util.HashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
class r0 {

    /* renamed from: a  reason: collision with root package name */
    private static int f6231a;

    /* renamed from: b  reason: collision with root package name */
    private static HashMap<String, Integer> f6232b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private static HashMap<String, Integer> f6233c = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(int i10, Bundle bundle) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (i10 == 0) {
            if (currentTimeMillis - f6231a < 5) {
                return true;
            }
            f6231a = currentTimeMillis;
            return false;
        } else if (i10 == 1 && bundle != null) {
            String string = bundle.getString("zone_id");
            if (f6232b.get(string) == null) {
                f6232b.put(string, Integer.valueOf(currentTimeMillis));
            }
            if (f6233c.get(string) == null) {
                f6233c.put(string, 0);
            }
            if (currentTimeMillis - f6232b.get(string).intValue() > 1) {
                f6233c.put(string, 1);
                f6232b.put(string, Integer.valueOf(currentTimeMillis));
                return false;
            }
            int intValue = f6233c.get(string).intValue() + 1;
            f6233c.put(string, Integer.valueOf(intValue));
            return intValue > 3;
        } else {
            return false;
        }
    }
}
