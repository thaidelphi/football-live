package com.startapp.sdk.adsbase.remoteconfig;

import com.startapp.common.parser.TypeInfo;
import com.startapp.o9;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MetaDataStyle implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final Integer f23187a = 18;

    /* renamed from: b  reason: collision with root package name */
    public static final Integer f23188b = -1;

    /* renamed from: c  reason: collision with root package name */
    public static final HashSet f23189c = new HashSet(Arrays.asList("BOLD"));

    /* renamed from: d  reason: collision with root package name */
    public static final Integer f23190d = 14;

    /* renamed from: e  reason: collision with root package name */
    public static final Integer f23191e = -1;

    /* renamed from: f  reason: collision with root package name */
    public static final HashSet f23192f = new HashSet();
    private static final long serialVersionUID = -8172457405775076403L;
    private String name = "";
    private Integer itemGradientTop = -14014151;
    private Integer itemGradientBottom = -8750199;
    private Integer itemTitleTextSize = f23187a;
    private Integer itemTitleTextColor = f23188b;
    @TypeInfo(type = HashSet.class)
    private Set<String> itemTitleTextDecoration = f23189c;
    private Integer itemDescriptionTextSize = f23190d;
    private Integer itemDescriptionTextColor = f23191e;
    @TypeInfo(type = HashSet.class)
    private Set<String> itemDescriptionTextDecoration = f23192f;

    public final Integer a() {
        return this.itemDescriptionTextColor;
    }

    public final Set<String> b() {
        return this.itemDescriptionTextDecoration;
    }

    public final Integer c() {
        return this.itemDescriptionTextSize;
    }

    public final Integer d() {
        return this.itemGradientBottom;
    }

    public final Integer e() {
        return this.itemGradientTop;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetaDataStyle metaDataStyle = (MetaDataStyle) obj;
        return o9.a(this.name, metaDataStyle.name) && o9.a(this.itemGradientTop, metaDataStyle.itemGradientTop) && o9.a(this.itemGradientBottom, metaDataStyle.itemGradientBottom) && o9.a(this.itemTitleTextSize, metaDataStyle.itemTitleTextSize) && o9.a(this.itemTitleTextColor, metaDataStyle.itemTitleTextColor) && o9.a(this.itemTitleTextDecoration, metaDataStyle.itemTitleTextDecoration) && o9.a(this.itemDescriptionTextSize, metaDataStyle.itemDescriptionTextSize) && o9.a(this.itemDescriptionTextColor, metaDataStyle.itemDescriptionTextColor) && o9.a(this.itemDescriptionTextDecoration, metaDataStyle.itemDescriptionTextDecoration);
    }

    public final Integer f() {
        return this.itemTitleTextColor;
    }

    public final Set<String> g() {
        return this.itemTitleTextDecoration;
    }

    public final Integer h() {
        return this.itemTitleTextSize;
    }

    public final int hashCode() {
        Object[] objArr = {this.name, this.itemGradientTop, this.itemGradientBottom, this.itemTitleTextSize, this.itemTitleTextColor, this.itemTitleTextDecoration, this.itemDescriptionTextSize, this.itemDescriptionTextColor, this.itemDescriptionTextDecoration};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }
}
