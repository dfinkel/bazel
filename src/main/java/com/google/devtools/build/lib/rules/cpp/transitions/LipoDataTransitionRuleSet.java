// Copyright 2018 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.google.devtools.build.lib.rules.cpp.transitions;

import com.google.common.collect.ImmutableList;
import com.google.devtools.build.lib.analysis.ConfiguredRuleClassProvider;
import com.google.devtools.build.lib.analysis.ConfiguredRuleClassProvider.RuleSet;

/** Rule set to deal with LIPO data transitions */
public final class LipoDataTransitionRuleSet implements RuleSet {
  public static final LipoDataTransitionRuleSet INSTANCE = new LipoDataTransitionRuleSet();

  private LipoDataTransitionRuleSet() {
    // Use the static INSTANCE field instead.
  }

  @Override
  public void init(ConfiguredRuleClassProvider.Builder builder) {
    builder.setLipoDataTransition(DisableLipoTransition.INSTANCE);
  }

  @Override
  public ImmutableList<RuleSet> requires() {
    return ImmutableList.of();
  }
}
