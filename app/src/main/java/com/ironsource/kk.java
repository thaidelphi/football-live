package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.webkit.WebView;
import com.ironsource.vk;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class kk extends WebView implements wk {

    /* renamed from: a  reason: collision with root package name */
    private vk f18091a;

    /* renamed from: b  reason: collision with root package name */
    private so f18092b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk(Context context) {
        super(context);
        kotlin.jvm.internal.n.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk(Context context, AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk(Context context, AttributeSet attrs, int i10) {
        super(context, attrs, i10);
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(attrs, "attrs");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kk(Context context, vk javascriptEngine) {
        this(context);
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(javascriptEngine, "javascriptEngine");
        this.f18091a = javascriptEngine;
    }

    public /* synthetic */ kk(Context context, vk vkVar, int i10, kotlin.jvm.internal.h hVar) {
        this(context, (i10 & 2) != 0 ? new vk.a(0, 1, null) : vkVar);
    }

    public final void a() {
        this.f18092b = null;
    }

    public final void a(so soVar) {
        this.f18092b = soVar;
    }

    @Override // com.ironsource.wk
    public void a(String script) {
        kotlin.jvm.internal.n.f(script, "script");
        vk vkVar = this.f18091a;
        vk vkVar2 = null;
        if (vkVar == null) {
            kotlin.jvm.internal.n.u("javascriptEngine");
            vkVar = null;
        }
        if (!vkVar.a()) {
            vk vkVar3 = this.f18091a;
            if (vkVar3 == null) {
                kotlin.jvm.internal.n.u("javascriptEngine");
                vkVar3 = null;
            }
            vkVar3.a(this);
        }
        vk vkVar4 = this.f18091a;
        if (vkVar4 == null) {
            kotlin.jvm.internal.n.u("javascriptEngine");
        } else {
            vkVar2 = vkVar4;
        }
        vkVar2.a(script);
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent event) {
        kotlin.jvm.internal.n.f(event, "event");
        if (i10 == 4) {
            so soVar = this.f18092b;
            if (soVar != null && soVar.onBackButtonPressed()) {
                return true;
            }
        }
        return super.onKeyDown(i10, event);
    }
}
