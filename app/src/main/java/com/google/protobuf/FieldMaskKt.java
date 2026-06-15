package com.google.protobuf;

import com.google.protobuf.FieldMask;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;
/* compiled from: FieldMaskKt.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class FieldMaskKt {
    public static final FieldMaskKt INSTANCE = new FieldMaskKt();

    /* compiled from: FieldMaskKt.kt */
    @ProtoDslMarker
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final FieldMask.Builder _builder;

        /* compiled from: FieldMaskKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.h hVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(FieldMask.Builder builder) {
                kotlin.jvm.internal.n.f(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        /* compiled from: FieldMaskKt.kt */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
        public static final class PathsProxy extends DslProxy {
            private PathsProxy() {
            }
        }

        private Dsl(FieldMask.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(FieldMask.Builder builder, kotlin.jvm.internal.h hVar) {
            this(builder);
        }

        public final /* synthetic */ FieldMask _build() {
            FieldMask build = this._builder.build();
            kotlin.jvm.internal.n.e(build, "_builder.build()");
            return build;
        }

        public final /* synthetic */ void addAllPaths(DslList dslList, Iterable values) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(values, "values");
            this._builder.addAllPaths(values);
        }

        public final /* synthetic */ void addPaths(DslList dslList, String value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.addPaths(value);
        }

        public final /* synthetic */ void clearPaths(DslList dslList) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            this._builder.clearPaths();
        }

        public final DslList<String, PathsProxy> getPaths() {
            List<String> pathsList = this._builder.getPathsList();
            kotlin.jvm.internal.n.e(pathsList, "_builder.getPathsList()");
            return new DslList<>(pathsList);
        }

        public final /* synthetic */ void plusAssignAllPaths(DslList<String, PathsProxy> dslList, Iterable<String> values) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(values, "values");
            addAllPaths(dslList, values);
        }

        public final /* synthetic */ void plusAssignPaths(DslList<String, PathsProxy> dslList, String value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            addPaths(dslList, value);
        }

        public final /* synthetic */ void setPaths(DslList dslList, int i10, String value) {
            kotlin.jvm.internal.n.f(dslList, "<this>");
            kotlin.jvm.internal.n.f(value, "value");
            this._builder.setPaths(i10, value);
        }
    }

    private FieldMaskKt() {
    }
}
