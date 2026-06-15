package com.unity3d.ads.core.data.model;

import com.google.protobuf.ByteString;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: SessionChange.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public abstract class SessionChange {

    /* compiled from: SessionChange.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class PrivacyFsmChange extends SessionChange {
        private final ByteString value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PrivacyFsmChange(ByteString value) {
            super(null);
            n.f(value, "value");
            this.value = value;
        }

        public static /* synthetic */ PrivacyFsmChange copy$default(PrivacyFsmChange privacyFsmChange, ByteString byteString, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                byteString = privacyFsmChange.value;
            }
            return privacyFsmChange.copy(byteString);
        }

        public final ByteString component1() {
            return this.value;
        }

        public final PrivacyFsmChange copy(ByteString value) {
            n.f(value, "value");
            return new PrivacyFsmChange(value);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PrivacyFsmChange) && n.a(this.value, ((PrivacyFsmChange) obj).value);
        }

        public final ByteString getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "PrivacyFsmChange(value=" + this.value + ')';
        }
    }

    /* compiled from: SessionChange.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
    public static final class UserConsentChange extends SessionChange {
        private final ByteString value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserConsentChange(ByteString value) {
            super(null);
            n.f(value, "value");
            this.value = value;
        }

        public static /* synthetic */ UserConsentChange copy$default(UserConsentChange userConsentChange, ByteString byteString, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                byteString = userConsentChange.value;
            }
            return userConsentChange.copy(byteString);
        }

        public final ByteString component1() {
            return this.value;
        }

        public final UserConsentChange copy(ByteString value) {
            n.f(value, "value");
            return new UserConsentChange(value);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserConsentChange) && n.a(this.value, ((UserConsentChange) obj).value);
        }

        public final ByteString getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "UserConsentChange(value=" + this.value + ')';
        }
    }

    private SessionChange() {
    }

    public /* synthetic */ SessionChange(h hVar) {
        this();
    }
}
