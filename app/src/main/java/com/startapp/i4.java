package com.startapp;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class i4 extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        try {
            if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR && consoleMessage.message().contains("mraid")) {
                l3 l3Var = new l3(m3.f22275e);
                l3Var.f22228d = "MraidMode.ConsoleError";
                l3Var.f22229e = consoleMessage.message();
                l3Var.a();
            }
        } catch (Throwable th) {
            l3.a(th);
        }
        return super.onConsoleMessage(consoleMessage);
    }
}
