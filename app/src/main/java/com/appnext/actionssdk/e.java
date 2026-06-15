package com.appnext.actionssdk;

import android.content.Intent;
import android.os.ResultReceiver;
import com.appnext.core.o;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class e extends o {
    String acid;
    String bf;
    String bg;
    String bh;
    String bi;
    String bj;
    ResultReceiver bk;
    String guid;
    String name;

    public e() {
    }

    public final void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ResultReceiver resultReceiver) {
        this.bf = str;
        this.bg = str2;
        this.guid = str3;
        this.bh = str4;
        this.bi = str5;
        this.bk = null;
        this.bj = str6;
        this.acid = str7;
        this.name = str8;
    }

    protected final Class<?> x() {
        return ActionService.class;
    }

    public e(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ResultReceiver resultReceiver) {
        this.bf = str;
        this.bg = str2;
        this.guid = str3;
        this.bh = str4;
        this.bi = str5;
        this.bk = resultReceiver;
        this.bj = str6;
        this.acid = str7;
        this.name = str8;
    }

    protected final void a(Intent intent) {
        intent.putExtra("added_info", 8348);
        intent.putExtra("package", this.bf);
        intent.putExtra("link", this.bg);
        intent.putExtra("guid", this.guid);
        intent.putExtra("bannerid", this.bh);
        intent.putExtra("placementid", this.bi);
        intent.putExtra("receiver", this.bk);
        intent.putExtra("vid", this.bj);
        intent.putExtra("acid", this.acid);
        intent.putExtra("name", this.name);
    }
}
