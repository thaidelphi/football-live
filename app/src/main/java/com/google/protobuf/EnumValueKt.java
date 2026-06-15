package com.google.protobuf;

import com.google.protobuf.EnumValue;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;
/* compiled from: EnumValueKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class EnumValueKt {
    public static final EnumValueKt INSTANCE = new EnumValueKt();

    /* compiled from: EnumValueKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final EnumValue.Builder _builder;

        /* compiled from: EnumValueKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(EnumValue.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        /* compiled from: EnumValueKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        private Dsl(EnumValue.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(EnumValue.Builder builder, kotlin.jvm.internal.h hVar) {
            this(builder);
        }

        public final /* synthetic */ EnumValue _build() {
            EnumValue build = this._builder.build();
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

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearNumber() {
            this._builder.clearNumber();
        }

        public final /* synthetic */ void clearOptions(DslList dslList) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            this._builder.clearOptions();
        }

        public final String getName() {
            String name = this._builder.getName();
            kotlin.jvm.internal.n.e(name, "_builder.getName()");
            return name;
        }

        public final int getNumber() {
            return this._builder.getNumber();
        }

        public final /* synthetic */ DslList getOptions() {
            List<Option> optionsList = this._builder.getOptionsList();
            kotlin.jvm.internal.n.e(optionsList, "_builder.getOptionsList()");
            return new DslList(optionsList);
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

        public final void setName(String value) {
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setName(value);
        }

        public final void setNumber(int i10) {
            this._builder.setNumber(i10);
        }

        public final /* synthetic */ void setOptions(DslList dslList, int i10, Option value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setOptions(i10, value);
        }
    }

    private EnumValueKt() {
    }
}
