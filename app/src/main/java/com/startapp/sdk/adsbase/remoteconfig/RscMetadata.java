package com.startapp.sdk.adsbase.remoteconfig;

import androidx.annotation.Keep;
import com.startapp.common.parser.TypeInfo;
import com.startapp.l9;
import com.startapp.o9;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class RscMetadata implements Serializable {
    private static final long serialVersionUID = -5424519918396264553L;
    private boolean enabled;
    private int ief;
    @TypeInfo(parser = ItemsParser.class, type = ArrayList.class, value = RscMetadataItem.class)
    private List<RscMetadataItem> items;
    private String triggers;

    /* compiled from: Sta */
    @Keep
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class ItemsParser extends l9<RscMetadataItem> {
        public ItemsParser() {
            super(RscMetadataItem.class);
        }
    }

    public final int a() {
        return this.ief;
    }

    public final List<RscMetadataItem> b() {
        return this.items;
    }

    public final String c() {
        return this.triggers;
    }

    public final boolean d() {
        return this.enabled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RscMetadata rscMetadata = (RscMetadata) obj;
        return this.enabled == rscMetadata.enabled && this.ief == rscMetadata.ief && o9.a(this.triggers, rscMetadata.triggers) && o9.a(this.items, rscMetadata.items);
    }

    public final int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), this.triggers, this.items, Integer.valueOf(this.ief)};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }

    public final int a(RscMetadataItem rscMetadataItem) {
        return rscMetadataItem.b() != null ? rscMetadataItem.b().intValue() : this.ief;
    }
}
