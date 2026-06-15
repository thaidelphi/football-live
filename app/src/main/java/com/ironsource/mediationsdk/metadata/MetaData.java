package com.ironsource.mediationsdk.metadata;

import java.util.ArrayList;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MetaData {

    /* renamed from: a  reason: collision with root package name */
    private String f18914a;

    /* renamed from: b  reason: collision with root package name */
    private List<String> f18915b;

    /* renamed from: c  reason: collision with root package name */
    private List<MetaDataValueTypes> f18916c;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum MetaDataValueTypes {
        META_DATA_VALUE_STRING,
        META_DATA_VALUE_BOOLEAN,
        META_DATA_VALUE_INT,
        META_DATA_VALUE_LONG,
        META_DATA_VALUE_DOUBLE,
        META_DATA_VALUE_FLOAT
    }

    public MetaData(String str, List<String> list) {
        this.f18914a = str;
        this.f18915b = list;
        this.f18916c = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f18916c.add(MetaDataValueTypes.META_DATA_VALUE_STRING);
        }
    }

    public MetaData(String str, List<String> list, List<MetaDataValueTypes> list2) {
        this.f18914a = str;
        this.f18915b = list;
        this.f18916c = list2;
    }

    public String getMetaDataKey() {
        return this.f18914a;
    }

    public List<String> getMetaDataValue() {
        return this.f18915b;
    }

    public List<MetaDataValueTypes> getMetaDataValueType() {
        return this.f18916c;
    }
}
