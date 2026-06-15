package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.HandlerExecutor;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepForSdk
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class ListenerHolder<L> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f12131a;

    /* renamed from: b  reason: collision with root package name */
    private volatile L f12132b;

    /* renamed from: c  reason: collision with root package name */
    private volatile ListenerKey<L> f12133c;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static final class ListenerKey<L> {

        /* renamed from: a  reason: collision with root package name */
        private final L f12134a;

        /* renamed from: b  reason: collision with root package name */
        private final String f12135b;

        @KeepForSdk
        ListenerKey(L l10, String str) {
            this.f12134a = l10;
            this.f12135b = str;
        }

        @KeepForSdk
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ListenerKey) {
                ListenerKey listenerKey = (ListenerKey) obj;
                return this.f12134a == listenerKey.f12134a && this.f12135b.equals(listenerKey.f12135b);
            }
            return false;
        }

        @KeepForSdk
        public int hashCode() {
            return (System.identityHashCode(this.f12134a) * 31) + this.f12135b.hashCode();
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface Notifier<L> {
        @KeepForSdk
        void a(L l10);

        @KeepForSdk
        void b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @KeepForSdk
    public ListenerHolder(Looper looper, L l10, String str) {
        this.f12131a = new HandlerExecutor(looper);
        this.f12132b = (L) Preconditions.n(l10, "Listener must not be null");
        this.f12133c = new ListenerKey<>(l10, Preconditions.g(str));
    }

    @KeepForSdk
    public void a() {
        this.f12132b = null;
        this.f12133c = null;
    }

    @KeepForSdk
    public ListenerKey<L> b() {
        return this.f12133c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Notifier<? super L> notifier) {
        Object obj = (L) this.f12132b;
        if (obj == null) {
            notifier.b();
            return;
        }
        try {
            notifier.a(obj);
        } catch (RuntimeException e8) {
            notifier.b();
            throw e8;
        }
    }
}
