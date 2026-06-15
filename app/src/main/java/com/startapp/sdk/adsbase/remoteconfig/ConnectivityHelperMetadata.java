package com.startapp.sdk.adsbase.remoteconfig;

import com.google.android.gms.common.api.Api;
import com.startapp.common.parser.TypeInfo;
import com.startapp.f4;
import com.startapp.o9;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ConnectivityHelperMetadata implements Serializable {
    private static final long serialVersionUID = -3942031112402817295L;
    @TypeInfo(complex = true)
    private Transport transport = new Transport();

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class Transport implements Serializable {
        private static final long serialVersionUID = 9037003673849815220L;
        @TypeInfo(parser = f4.class)
        private int[][] active;
        @TypeInfo(parser = f4.class)
        private int[][] all = {new int[]{21, Api.BaseClientBuilder.API_PRIORITY_OTHER}};

        public final int[][] a() {
            return this.active;
        }

        public final int[][] b() {
            return this.all;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Transport transport = (Transport) obj;
            return Arrays.deepEquals(this.all, transport.all) && Arrays.deepEquals(this.active, transport.active);
        }

        public final int hashCode() {
            Object[] objArr = {this.all, this.active};
            WeakHashMap weakHashMap = o9.f22359a;
            return Arrays.deepHashCode(objArr);
        }
    }

    public final Transport a() {
        return this.transport;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return o9.a(this.transport, ((ConnectivityHelperMetadata) obj).transport);
    }

    public final int hashCode() {
        Object[] objArr = {this.transport};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }
}
