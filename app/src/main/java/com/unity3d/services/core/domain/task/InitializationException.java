package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import kotlin.jvm.internal.n;
/* compiled from: InitializationException.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class InitializationException extends Exception {
    private final Configuration config;
    private final ErrorState errorState;
    private final Exception originalException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializationException(ErrorState errorState, Exception originalException, Configuration config) {
        super(originalException);
        n.f(errorState, "errorState");
        n.f(originalException, "originalException");
        n.f(config, "config");
        this.errorState = errorState;
        this.originalException = originalException;
        this.config = config;
    }

    public static /* synthetic */ InitializationException copy$default(InitializationException initializationException, ErrorState errorState, Exception exc, Configuration configuration, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            errorState = initializationException.errorState;
        }
        if ((i10 & 2) != 0) {
            exc = initializationException.originalException;
        }
        if ((i10 & 4) != 0) {
            configuration = initializationException.config;
        }
        return initializationException.copy(errorState, exc, configuration);
    }

    public final ErrorState component1() {
        return this.errorState;
    }

    public final Exception component2() {
        return this.originalException;
    }

    public final Configuration component3() {
        return this.config;
    }

    public final InitializationException copy(ErrorState errorState, Exception originalException, Configuration config) {
        n.f(errorState, "errorState");
        n.f(originalException, "originalException");
        n.f(config, "config");
        return new InitializationException(errorState, originalException, config);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InitializationException) {
            InitializationException initializationException = (InitializationException) obj;
            return this.errorState == initializationException.errorState && n.a(this.originalException, initializationException.originalException) && n.a(this.config, initializationException.config);
        }
        return false;
    }

    public final Configuration getConfig() {
        return this.config;
    }

    public final ErrorState getErrorState() {
        return this.errorState;
    }

    public final Exception getOriginalException() {
        return this.originalException;
    }

    public int hashCode() {
        return (((this.errorState.hashCode() * 31) + this.originalException.hashCode()) * 31) + this.config.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "InitializationException(errorState=" + this.errorState + ", originalException=" + this.originalException + ", config=" + this.config + ')';
    }
}
