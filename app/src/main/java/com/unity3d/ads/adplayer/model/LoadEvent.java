package com.unity3d.ads.adplayer.model;

import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: LoadEvent.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class LoadEvent {

    /* compiled from: LoadEvent.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class Completed extends LoadEvent {
        public static final Completed INSTANCE = new Completed();

        private Completed() {
            super(null);
        }
    }

    /* compiled from: LoadEvent.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class Error extends LoadEvent {
        private final int errorCode;
        private final String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String message, int i10) {
            super(null);
            n.f(message, "message");
            this.message = message;
            this.errorCode = i10;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = error.message;
            }
            if ((i11 & 2) != 0) {
                i10 = error.errorCode;
            }
            return error.copy(str, i10);
        }

        public final String component1() {
            return this.message;
        }

        public final int component2() {
            return this.errorCode;
        }

        public final Error copy(String message, int i10) {
            n.f(message, "message");
            return new Error(message, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Error) {
                Error error = (Error) obj;
                return n.a(this.message, error.message) && this.errorCode == error.errorCode;
            }
            return false;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return (this.message.hashCode() * 31) + this.errorCode;
        }

        public String toString() {
            return "Error(message=" + this.message + ", errorCode=" + this.errorCode + ')';
        }
    }

    private LoadEvent() {
    }

    public /* synthetic */ LoadEvent(h hVar) {
        this();
    }
}
