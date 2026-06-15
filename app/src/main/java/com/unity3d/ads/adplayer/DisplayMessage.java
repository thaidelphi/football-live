package com.unity3d.ads.adplayer;

import android.webkit.WebView;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.n;
/* compiled from: DisplayMessage.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public abstract class DisplayMessage {
    private final String opportunityId;

    /* compiled from: DisplayMessage.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class DisplayDestroyed extends DisplayMessage {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayDestroyed(String opportunityId) {
            super(opportunityId, null);
            n.f(opportunityId, "opportunityId");
        }
    }

    /* compiled from: DisplayMessage.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class DisplayError extends DisplayMessage {
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayError(String opportunityId, String reason) {
            super(opportunityId, null);
            n.f(opportunityId, "opportunityId");
            n.f(reason, "reason");
            this.reason = reason;
        }

        public final String getReason() {
            return this.reason;
        }
    }

    /* compiled from: DisplayMessage.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class DisplayFinishRequest extends DisplayMessage {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayFinishRequest(String opportunityId) {
            super(opportunityId, null);
            n.f(opportunityId, "opportunityId");
        }
    }

    /* compiled from: DisplayMessage.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class DisplayReady extends DisplayMessage {
        private final Map<String, Object> showOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayReady(String opportunityId, Map<String, ? extends Object> map) {
            super(opportunityId, null);
            n.f(opportunityId, "opportunityId");
            this.showOptions = map;
        }

        public final Map<String, Object> getShowOptions() {
            return this.showOptions;
        }

        public /* synthetic */ DisplayReady(String str, Map map, int i10, h hVar) {
            this(str, (i10 & 2) != 0 ? null : map);
        }
    }

    /* compiled from: DisplayMessage.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class FocusChanged extends DisplayMessage {
        private final boolean isFocused;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FocusChanged(String opportunityId, boolean z10) {
            super(opportunityId, null);
            n.f(opportunityId, "opportunityId");
            this.isFocused = z10;
        }

        public final boolean isFocused() {
            return this.isFocused;
        }
    }

    /* compiled from: DisplayMessage.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class SetOrientation extends DisplayMessage {
        private final int orientation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetOrientation(String opportunityId, int i10) {
            super(opportunityId, null);
            n.f(opportunityId, "opportunityId");
            this.orientation = i10;
        }

        public final int getOrientation() {
            return this.orientation;
        }
    }

    /* compiled from: DisplayMessage.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class VisibilityChanged extends DisplayMessage {
        private final boolean isVisible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VisibilityChanged(String opportunityId, boolean z10) {
            super(opportunityId, null);
            n.f(opportunityId, "opportunityId");
            this.isVisible = z10;
        }

        public final boolean isVisible() {
            return this.isVisible;
        }
    }

    /* compiled from: DisplayMessage.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class WebViewInstanceRequest extends DisplayMessage {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebViewInstanceRequest(String opportunityId) {
            super(opportunityId, null);
            n.f(opportunityId, "opportunityId");
        }
    }

    /* compiled from: DisplayMessage.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class WebViewInstanceResponse extends DisplayMessage {
        private final WebView webView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebViewInstanceResponse(String opportunityId, WebView webView) {
            super(opportunityId, null);
            n.f(opportunityId, "opportunityId");
            n.f(webView, "webView");
            this.webView = webView;
        }

        public final WebView getWebView() {
            return this.webView;
        }
    }

    private DisplayMessage(String str) {
        this.opportunityId = str;
    }

    public /* synthetic */ DisplayMessage(String str, h hVar) {
        this(str);
    }

    public final String getOpportunityId() {
        return this.opportunityId;
    }
}
