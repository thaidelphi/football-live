package com.facebook.ads.redexgen.X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.AdSize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
/* renamed from: com.facebook.ads.redexgen.X.42  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class AnonymousClass42 {
    public static AnonymousClass42 A05;
    public static byte[] A06;
    public static final Object A07;
    public final Context A00;
    public final Handler A01;
    public final HashMap<BroadcastReceiver, ArrayList<AnonymousClass41>> A04 = new HashMap<>();
    public final HashMap<String, ArrayList<AnonymousClass41>> A03 = new HashMap<>();
    public final ArrayList<AnonymousClass40> A02 = new ArrayList<>();

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 63);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{11, 11, 109, 66, 71, 95, 78, 89, 11, 79, 66, 79, 11, 69, 68, 95, 11, 70, 74, 95, 72, 67, 17, 11, 95, 95, 57, 22, 19, 11, 26, 13, 95, 18, 30, 11, 28, 23, 26, 27, 94, 95, 95, 18, 30, 11, 28, 23, 66, 79, 7, 42, 101, 108, 42, 99, 100, 126, 111, 100, 126, 42, 37, 118, 102, 109, 96, 104, 96, 37, 86, 116, 99, 126, 120, 121, 55, 123, 126, 100, 99, 45, 55, 84, 119, 123, 121, 116, 90, 106, 119, 121, 124, 123, 121, 107, 108, 85, 121, 118, 121, Byte.MAX_VALUE, 125, 106, 24, 52, 33, 54, 61, 60, 59, 50, 117, 52, 50, 52, 60, 59, 38, 33, 117, 51, 60, 57, 33, 48, 39, 117, 24, 47, 57, 37, 38, 60, 35, 36, 45, 106, 62, 51, 58, 47, 106, 56, 58, 45, 48, 54, 55, 78, 76, 89, 72, 74, 66, 95, 84, 12, 9, 28, 9, 72, 69, 76, 89, 91, 64, 69, 64, 65, 89, 64, 14, 92, 75, 79, 93, 65, 64};
    }

    static {
        A03();
        A07 = new Object();
    }

    public AnonymousClass42(Context context) {
        this.A00 = context;
        final Looper mainLooper = context.getMainLooper();
        this.A01 = new Handler(mainLooper) { // from class: com.facebook.ads.redexgen.X.3z
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                switch (message.what) {
                    case 1:
                        AnonymousClass42.this.A02();
                        return;
                    default:
                        super.handleMessage(message);
                        return;
                }
            }
        };
    }

    public static AnonymousClass42 A00(Context context) {
        AnonymousClass42 anonymousClass42;
        synchronized (A07) {
            if (A05 == null) {
                A05 = new AnonymousClass42(context.getApplicationContext());
            }
            anonymousClass42 = A05;
        }
        return anonymousClass42;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Incorrect condition in loop: B:12:0x001c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A02() {
        /*
            r8 = this;
        L0:
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<com.facebook.ads.redexgen.X.41>> r1 = r8.A04
            monitor-enter(r1)
            java.util.ArrayList<com.facebook.ads.redexgen.X.40> r0 = r8.A02     // Catch: java.lang.Throwable -> L45
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L45
            if (r0 > 0) goto Ld
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L45
            goto L44
        Ld:
            com.facebook.ads.redexgen.X.40[] r7 = new com.facebook.ads.redexgen.X.AnonymousClass40[r0]     // Catch: java.lang.Throwable -> L45
            java.util.ArrayList<com.facebook.ads.redexgen.X.40> r0 = r8.A02     // Catch: java.lang.Throwable -> L45
            r0.toArray(r7)     // Catch: java.lang.Throwable -> L45
            java.util.ArrayList<com.facebook.ads.redexgen.X.40> r0 = r8.A02     // Catch: java.lang.Throwable -> L45
            r0.clear()     // Catch: java.lang.Throwable -> L45
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L45
            r6 = 0
        L1b:
            int r0 = r7.length
            if (r6 >= r0) goto L0
            r5 = r7[r6]
            java.util.ArrayList<com.facebook.ads.redexgen.X.41> r0 = r5.A01
            int r4 = r0.size()
            r3 = 0
        L27:
            if (r3 >= r4) goto L41
            java.util.ArrayList<com.facebook.ads.redexgen.X.41> r0 = r5.A01
            java.lang.Object r1 = r0.get(r3)
            com.facebook.ads.redexgen.X.41 r1 = (com.facebook.ads.redexgen.X.AnonymousClass41) r1
            boolean r0 = r1.A01
            if (r0 != 0) goto L3e
            android.content.BroadcastReceiver r2 = r1.A02
            android.content.Context r1 = r8.A00
            android.content.Intent r0 = r5.A00
            r2.onReceive(r1, r0)
        L3e:
            int r3 = r3 + 1
            goto L27
        L41:
            int r6 = r6 + 1
            goto L1b
        L44:
            return
        L45:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L45
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass42.A02():void");
    }

    public final void A05(BroadcastReceiver broadcastReceiver) {
        synchronized (this.A04) {
            ArrayList<AnonymousClass41> remove = this.A04.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                AnonymousClass41 anonymousClass41 = remove.get(size);
                anonymousClass41.A01 = true;
                for (int j10 = 0; j10 < anonymousClass41.A03.countActions(); j10++) {
                    String action = anonymousClass41.A03.getAction(j10);
                    ArrayList<AnonymousClass41> arrayList = this.A03.get(action);
                    if (arrayList != null) {
                        int i10 = arrayList.size();
                        for (int i11 = i10 - 1; i11 >= 0; i11--) {
                            AnonymousClass41 anonymousClass412 = arrayList.get(i11);
                            if (anonymousClass412.A02 == broadcastReceiver) {
                                anonymousClass412.A01 = true;
                                arrayList.remove(i11);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.A03.remove(action);
                        }
                    }
                }
            }
        }
    }

    public final void A06(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.A04) {
            AnonymousClass41 anonymousClass41 = new AnonymousClass41(intentFilter, broadcastReceiver);
            ArrayList<AnonymousClass41> arrayList = this.A04.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.A04.put(broadcastReceiver, arrayList);
            }
            arrayList.add(anonymousClass41);
            for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                String action = intentFilter.getAction(i10);
                ArrayList<AnonymousClass41> arrayList2 = this.A03.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.A03.put(action, arrayList2);
                }
                arrayList2.add(anonymousClass41);
            }
        }
    }

    public final boolean A07(Intent intent) {
        String A01;
        synchronized (this.A04) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.A00.getContentResolver());
            Uri data = intent.getData();
            String action2 = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean debug = (intent.getFlags() & 8) != 0;
            if (debug) {
                StringBuilder sb = new StringBuilder();
                String type = A01(128, 15, 117);
                StringBuilder append = sb.append(type).append(resolveTypeIfNeeded);
                String type2 = A01(62, 8, 58);
                StringBuilder append2 = append.append(type2).append(action2);
                String type3 = A01(51, 11, 53);
                append2.append(type3).append(intent).toString();
            }
            HashMap<String, ArrayList<AnonymousClass41>> hashMap = this.A03;
            String type4 = intent.getAction();
            ArrayList<AnonymousClass41> arrayList = hashMap.get(type4);
            if (arrayList != null) {
                if (debug) {
                    StringBuilder sb2 = new StringBuilder();
                    String type5 = A01(70, 13, 40);
                    sb2.append(type5).append(arrayList).toString();
                }
                ArrayList arrayList2 = null;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    AnonymousClass41 anonymousClass41 = arrayList.get(i10);
                    if (debug) {
                        StringBuilder sb3 = new StringBuilder();
                        String type6 = A01(104, 24, 106);
                        sb3.append(type6).append(anonymousClass41.A03).toString();
                    }
                    if (!anonymousClass41.A00) {
                        int match = anonymousClass41.A03.match(action, resolveTypeIfNeeded, action2, data, categories, A01(83, 21, 39));
                        if (match >= 0) {
                            if (debug) {
                                String str = A01(24, 27, 64) + Integer.toHexString(match);
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(anonymousClass41);
                            anonymousClass41.A00 = true;
                        } else if (debug) {
                            switch (match) {
                                case -4:
                                    A01 = A01(149, 8, 18);
                                    break;
                                case -3:
                                    A01 = A01(143, 6, 102);
                                    break;
                                case AdSize.AUTO_HEIGHT /* -2 */:
                                    A01 = A01(157, 4, 87);
                                    break;
                                case -1:
                                    A01 = A01(161, 4, 3);
                                    break;
                                default:
                                    A01 = A01(165, 14, 17);
                                    break;
                            }
                            String str2 = A01(0, 24, 20) + A01;
                        }
                    }
                }
                if (arrayList2 != null) {
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        ((AnonymousClass41) arrayList2.get(i11)).A00 = false;
                    }
                    this.A02.add(new AnonymousClass40(intent, arrayList2));
                    if (!this.A01.hasMessages(1)) {
                        this.A01.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }
}
