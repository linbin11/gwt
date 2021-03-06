/*
 * Copyright 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.uibinder.test.client;

import com.google.gwt.uibinder.client.UiConstructor;
import com.google.gwt.user.client.ui.Label;

/**
 * A widget with a UiConstructor annotation that it doesn't need,
 * to confirm these work.
 */
public class NeedlesslyAnnotatedLabel extends Label {
  @UiConstructor public NeedlesslyAnnotatedLabel() {
  }
}
