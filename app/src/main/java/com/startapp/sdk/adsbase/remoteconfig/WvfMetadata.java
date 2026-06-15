package com.startapp.sdk.adsbase.remoteconfig;

import android.os.Build;
import com.startapp.common.parser.TypeInfo;
import com.startapp.e4;
import com.startapp.o9;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class WvfMetadata implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f23194a;
    private static final long serialVersionUID = -6304046246407321606L;
    @TypeInfo(complex = true)
    private ComponentInfoEventConfig infoEvents;
    private double legacy;
    @TypeInfo(parser = e4.class)
    private int[] modes = f23194a;
    private double trick = 0.0d;

    static {
        f23194a = Build.VERSION.SDK_INT >= 21 ? new int[]{0, 0, 1} : new int[]{0, 1, 0};
    }

    public final ComponentInfoEventConfig a() {
        return this.infoEvents;
    }

    public final double b() {
        return this.legacy;
    }

    public final int[] c() {
        return this.modes;
    }

    public final double d() {
        return this.trick;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WvfMetadata wvfMetadata = (WvfMetadata) obj;
        return Double.compare(this.legacy, wvfMetadata.legacy) == 0 && Double.compare(this.trick, wvfMetadata.trick) == 0 && o9.a(this.infoEvents, wvfMetadata.infoEvents) && Arrays.equals(this.modes, wvfMetadata.modes);
    }

    public final int hashCode() {
        Object[] objArr = {this.infoEvents, this.modes, Double.valueOf(this.legacy), Double.valueOf(this.trick)};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }
}
