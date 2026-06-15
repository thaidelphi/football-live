package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.o9;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class RscMetadataItem implements Serializable {
    private static final long serialVersionUID = 1691586261519008915L;
    private String config;
    private Integer ief;
    private Integer limit;
    private int noCache;
    private Integer output;
    private Integer ppid;
    private int[] sortBy;
    private int triggers;
    private Integer ttl;

    public final String a() {
        return this.config;
    }

    public final Integer b() {
        return this.ief;
    }

    public final Integer c() {
        return this.limit;
    }

    public final int d() {
        return this.noCache;
    }

    public final Integer e() {
        return this.output;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RscMetadataItem rscMetadataItem = (RscMetadataItem) obj;
        return this.triggers == rscMetadataItem.triggers && this.noCache == rscMetadataItem.noCache && o9.a(this.config, rscMetadataItem.config) && o9.a(this.ttl, rscMetadataItem.ttl) && Arrays.equals(this.sortBy, rscMetadataItem.sortBy) && o9.a(this.limit, rscMetadataItem.limit) && o9.a(this.ppid, rscMetadataItem.ppid) && o9.a(this.output, rscMetadataItem.output) && o9.a(this.ief, rscMetadataItem.ief);
    }

    public final Integer f() {
        return this.ppid;
    }

    public final int[] g() {
        return this.sortBy;
    }

    public final int h() {
        return this.triggers;
    }

    public final int hashCode() {
        Object[] objArr = {this.config, Integer.valueOf(this.triggers), Integer.valueOf(this.noCache), this.ttl, this.sortBy, this.limit, this.ppid, this.output, this.ief};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }

    public final Integer i() {
        return this.ttl;
    }
}
