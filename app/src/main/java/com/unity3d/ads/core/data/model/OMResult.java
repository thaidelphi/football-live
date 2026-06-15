package com.unity3d.ads.core.data.model;

import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: OMResult.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class OMResult {

    /* compiled from: OMResult.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Failure extends OMResult {
        private final String reason;
        private final String reasonDebug;

        public /* synthetic */ Failure(String str, String str2, int i10, h hVar) {
            this(str, (i10 & 2) != 0 ? null : str2);
        }

        public static /* synthetic */ Failure copy$default(Failure failure, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = failure.reason;
            }
            if ((i10 & 2) != 0) {
                str2 = failure.reasonDebug;
            }
            return failure.copy(str, str2);
        }

        public final String component1() {
            return this.reason;
        }

        public final String component2() {
            return this.reasonDebug;
        }

        public final Failure copy(String reason, String str) {
            n.f(reason, "reason");
            return new Failure(reason, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Failure) {
                Failure failure = (Failure) obj;
                return n.a(this.reason, failure.reason) && n.a(this.reasonDebug, failure.reasonDebug);
            }
            return false;
        }

        public final String getReason() {
            return this.reason;
        }

        public final String getReasonDebug() {
            return this.reasonDebug;
        }

        public int hashCode() {
            int hashCode = this.reason.hashCode() * 31;
            String str = this.reasonDebug;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Failure(reason=" + this.reason + ", reasonDebug=" + this.reasonDebug + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(String reason, String str) {
            super(null);
            n.f(reason, "reason");
            this.reason = reason;
            this.reasonDebug = str;
        }
    }

    /* compiled from: OMResult.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class Success extends OMResult {
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }
    }

    private OMResult() {
    }

    public /* synthetic */ OMResult(h hVar) {
        this();
    }
}
