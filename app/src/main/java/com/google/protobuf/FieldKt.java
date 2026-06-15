package com.google.protobuf;

import com.google.protobuf.Field;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;
/* compiled from: FieldKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class FieldKt {
    public static final FieldKt INSTANCE = new FieldKt();

    /* compiled from: FieldKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Field.Builder _builder;

        /* compiled from: FieldKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Field.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        /* compiled from: FieldKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        private Dsl(Field.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(Field.Builder builder, kotlin.jvm.internal.h hVar) {
            this(builder);
        }

        public final /* synthetic */ Field _build() {
            Field build = this._builder.build();
            kotlin.jvm.internal.n.e(build, "_builder.build()");
            return build;
        }

        public final /* synthetic */ void addAllOptions(DslList dslList, Iterable values) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(values, "values");
            this._builder.addAllOptions(values);
        }

        public final /* synthetic */ void addOptions(DslList dslList, Option value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.addOptions(value);
        }

        public final void clearCardinality() {
            this._builder.clearCardinality();
        }

        public final void clearDefaultValue() {
            this._builder.clearDefaultValue();
        }

        public final void clearJsonName() {
            this._builder.clearJsonName();
        }

        public final void clearKind() {
            this._builder.clearKind();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearNumber() {
            this._builder.clearNumber();
        }

        public final void clearOneofIndex() {
            this._builder.clearOneofIndex();
        }

        public final /* synthetic */ void clearOptions(DslList dslList) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            this._builder.clearOptions();
        }

        public final void clearPacked() {
            this._builder.clearPacked();
        }

        public final void clearTypeUrl() {
            this._builder.clearTypeUrl();
        }

        public final Field.Cardinality getCardinality() {
            Field.Cardinality cardinality = this._builder.getCardinality();
            kotlin.jvm.internal.n.e(cardinality, "_builder.getCardinality()");
            return cardinality;
        }

        public final String getDefaultValue() {
            String defaultValue = this._builder.getDefaultValue();
            kotlin.jvm.internal.n.e(defaultValue, "_builder.getDefaultValue()");
            return defaultValue;
        }

        public final String getJsonName() {
            String jsonName = this._builder.getJsonName();
            kotlin.jvm.internal.n.e(jsonName, "_builder.getJsonName()");
            return jsonName;
        }

        public final Field.Kind getKind() {
            Field.Kind kind = this._builder.getKind();
            kotlin.jvm.internal.n.e(kind, "_builder.getKind()");
            return kind;
        }

        public final String getName() {
            String name = this._builder.getName();
            kotlin.jvm.internal.n.e(name, "_builder.getName()");
            return name;
        }

        public final int getNumber() {
            return this._builder.getNumber();
        }

        public final int getOneofIndex() {
            return this._builder.getOneofIndex();
        }

        public final /* synthetic */ DslList getOptions() {
            List<Option> optionsList = this._builder.getOptionsList();
            kotlin.jvm.internal.n.e(optionsList, "_builder.getOptionsList()");
            return new DslList(optionsList);
        }

        public final boolean getPacked() {
            return this._builder.getPacked();
        }

        public final String getTypeUrl() {
            String typeUrl = this._builder.getTypeUrl();
            kotlin.jvm.internal.n.e(typeUrl, "_builder.getTypeUrl()");
            return typeUrl;
        }

        public final /* synthetic */ void plusAssignAllOptions(DslList<Option, OptionsProxy> dslList, Iterable<Option> values) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(values, "values");
            addAllOptions(dslList, values);
        }

        public final /* synthetic */ void plusAssignOptions(DslList<Option, OptionsProxy> dslList, Option value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            addOptions(dslList, value);
        }

        public final void setCardinality(Field.Cardinality value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setCardinality(value);
        }

        public final void setDefaultValue(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setDefaultValue(value);
        }

        public final void setJsonName(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setJsonName(value);
        }

        public final void setKind(Field.Kind value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setKind(value);
        }

        public final void setName(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setName(value);
        }

        public final void setNumber(int i10) {
            this._builder.setNumber(i10);
        }

        public final void setOneofIndex(int i10) {
            this._builder.setOneofIndex(i10);
        }

        public final /* synthetic */ void setOptions(DslList dslList, int i10, Option value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setOptions(i10, value);
        }

        public final void setPacked(boolean z10) {
            this._builder.setPacked(z10);
        }

        public final void setTypeUrl(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setTypeUrl(value);
        }
    }

    private FieldKt() {
    }
}
