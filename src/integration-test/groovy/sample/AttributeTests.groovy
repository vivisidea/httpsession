/*
 * Copyright 2002-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package sample

import geb.spock.*
import sample.pages.HomePage;
import spock.lang.Stepwise
import pages.*

/**
 * Tests the CAS sample application using service tickets.
 *
 * @author Rob Winch
 */
@Stepwise
class AttributeTests extends GebReportingSpec {
	def 'first visit no attributes'() {
		when:
		to HomePage
		then:
		attributes.empty
	}

	def 'create attribute'() {
		when:
		createAttribute('a','b')
		then:
		attributes.size() == 1
		attributes[0].name == 'a'
		attributes[0].value == 'b'
	}
}