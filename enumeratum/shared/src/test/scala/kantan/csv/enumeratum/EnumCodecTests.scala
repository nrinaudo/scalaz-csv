/*
 * Copyright 2015 Nicolas Rinaudo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package kantan.csv.enumeratum

import kantan.codecs.enumeratum.laws.discipline.Enumerated
import kantan.csv.enumeratum.arbitrary._
import kantan.csv.laws.discipline.CellCodecTests
import kantan.csv.laws.discipline.DisciplineSuite
import kantan.csv.laws.discipline.RowCodecTests

class EnumCodecTests extends DisciplineSuite {

  checkAll("CellCodec[Enumerated]", CellCodecTests[Enumerated].codec[String, Float])
  checkAll("RowCodec[Enumerated]", RowCodecTests[Enumerated].codec[String, Float])

}
