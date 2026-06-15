package com.unity3d.ads.core.data.datasource;

import android.database.ContentObserver;
import android.provider.Settings;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import com.unity3d.mediation.LevelPlayAdError;
import f9.j;
import f9.r;
import i8.w;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.x;
import kotlin.jvm.internal.y;
import m8.d;
import t8.a;
import t8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidDynamicDeviceInfoDataSource.kt */
@f(c = "com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1", f = "AndroidDynamicDeviceInfoDataSource.kt", l = {LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED}, m = "invokeSuspend")
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1 extends l implements p<r<? super VolumeSettingsChange>, d<? super w>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidDynamicDeviceInfoDataSource this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidDynamicDeviceInfoDataSource.kt */
    /* renamed from: com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$1  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class AnonymousClass1 extends o implements a<w> {
        final /* synthetic */ AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1 $contentObserver;
        final /* synthetic */ AndroidDynamicDeviceInfoDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource, AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1 androidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1) {
            super(0);
            this.this$0 = androidDynamicDeviceInfoDataSource;
            this.$contentObserver = androidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1;
        }

        @Override // t8.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f26638a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.getContext().getContentResolver().unregisterContentObserver(this.$contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource, d<? super AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1> dVar) {
        super(2, dVar);
        this.this$0 = androidDynamicDeviceInfoDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<w> create(Object obj, d<?> dVar) {
        AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1 androidDynamicDeviceInfoDataSource$volumeSettingsChange$1 = new AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(this.this$0, dVar);
        androidDynamicDeviceInfoDataSource$volumeSettingsChange$1.L$0 = obj;
        return androidDynamicDeviceInfoDataSource$volumeSettingsChange$1;
    }

    @Override // t8.p
    public final Object invoke(r<? super VolumeSettingsChange> rVar, d<? super w> dVar) {
        return ((AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1) create(rVar, dVar)).invokeSuspend(w.f26638a);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1, android.database.ContentObserver] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object c10;
        double streamVolume;
        c10 = n8.d.c();
        int i10 = this.label;
        if (i10 == 0) {
            i8.p.b(obj);
            final r rVar = (r) this.L$0;
            final x xVar = new x();
            streamVolume = this.this$0.getStreamVolume(3);
            xVar.f27382a = streamVolume;
            j.b(rVar, new VolumeSettingsChange.VolumeChange(streamVolume));
            final y yVar = new y();
            int ringerMode = this.this$0.getRingerMode();
            yVar.f27383a = ringerMode;
            j.b(rVar, new VolumeSettingsChange.MuteChange(ringerMode == 0));
            final AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource = this.this$0;
            ?? r42 = new ContentObserver() { // from class: com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(null);
                }

                @Override // android.database.ContentObserver
                public void onChange(boolean z10) {
                    double streamVolume2;
                    super.onChange(z10);
                    streamVolume2 = AndroidDynamicDeviceInfoDataSource.this.getStreamVolume(3);
                    x xVar2 = xVar;
                    if (!(streamVolume2 == xVar2.f27382a)) {
                        xVar2.f27382a = streamVolume2;
                        j.b(rVar, new VolumeSettingsChange.VolumeChange(streamVolume2));
                    }
                    int ringerMode2 = AndroidDynamicDeviceInfoDataSource.this.getRingerMode();
                    y yVar2 = yVar;
                    if (ringerMode2 != yVar2.f27383a) {
                        yVar2.f27383a = ringerMode2;
                        j.b(rVar, new VolumeSettingsChange.MuteChange(ringerMode2 == 0));
                    }
                }
            };
            this.this$0.getContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, r42);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, r42);
            this.label = 1;
            if (f9.p.a(rVar, anonymousClass1, this) == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            i8.p.b(obj);
        }
        return w.f26638a;
    }
}
