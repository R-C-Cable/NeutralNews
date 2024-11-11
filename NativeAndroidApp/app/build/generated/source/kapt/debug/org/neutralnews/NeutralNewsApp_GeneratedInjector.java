package org.neutralnews;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = NeutralNewsApp.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface NeutralNewsApp_GeneratedInjector {
  void injectNeutralNewsApp(NeutralNewsApp neutralNewsApp);
}
