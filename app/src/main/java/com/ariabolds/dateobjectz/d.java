package com.ariabolds.dateobjectz;
/* compiled from: Vpn.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class d {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[Catch: SocketException -> 0x003e, TryCatch #0 {SocketException -> 0x003e, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0015, B:9:0x0021, B:10:0x0025, B:12:0x002d, B:14:0x0035), top: B:19:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a() {
        /*
            r0 = 0
            java.util.Enumeration r1 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.net.SocketException -> L3e
            java.util.ArrayList r1 = java.util.Collections.list(r1)     // Catch: java.net.SocketException -> L3e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.net.SocketException -> L3e
            java.lang.String r2 = ""
        Lf:
            boolean r3 = r1.hasNext()     // Catch: java.net.SocketException -> L3e
            if (r3 == 0) goto L3e
            java.lang.Object r3 = r1.next()     // Catch: java.net.SocketException -> L3e
            java.net.NetworkInterface r3 = (java.net.NetworkInterface) r3     // Catch: java.net.SocketException -> L3e
            boolean r4 = r3.isUp()     // Catch: java.net.SocketException -> L3e
            if (r4 == 0) goto L25
            java.lang.String r2 = r3.getName()     // Catch: java.net.SocketException -> L3e
        L25:
            java.lang.String r3 = "tun"
            boolean r3 = r2.contains(r3)     // Catch: java.net.SocketException -> L3e
            if (r3 != 0) goto L3d
            java.lang.String r3 = "ppp"
            boolean r3 = r2.contains(r3)     // Catch: java.net.SocketException -> L3e
            if (r3 != 0) goto L3d
            java.lang.String r3 = "pptp"
            boolean r3 = r2.contains(r3)     // Catch: java.net.SocketException -> L3e
            if (r3 == 0) goto Lf
        L3d:
            r0 = 1
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ariabolds.dateobjectz.d.a():boolean");
    }
}
