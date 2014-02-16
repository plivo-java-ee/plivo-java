package org.plivo.ee.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.plivo.ee.test.call.CallExtensionTest;
import org.plivo.ee.test.call.CallNumberTest;
import org.plivo.ee.test.call.HangupCallTest;
import org.plivo.ee.test.call.RecordCallTest;
import org.plivo.ee.test.call.TransferCallTest;
import org.plivo.ee.test.conference.GetAllConferencesTest;
import org.plivo.ee.test.conference.HangUpConferenceMemberTest;
import org.plivo.ee.test.conference.HangupAllConferencesTest;
import org.plivo.ee.test.conference.HangupConferenceTest;
import org.plivo.ee.test.conference.KickMemberTest;
import org.plivo.ee.test.conference.MakeMemberDeafTest;
import org.plivo.ee.test.conference.MakeMemberUndeafTest;
import org.plivo.ee.test.conference.MuteMemberTest;
import org.plivo.ee.test.conference.PlayMemberTest;
import org.plivo.ee.test.conference.RecordConferenceTest;
import org.plivo.ee.test.conference.RetrieveConferenceDetailsTest;
import org.plivo.ee.test.conference.SpeakToMemberTest;
import org.plivo.ee.test.conference.StopPlayMemberTest;
import org.plivo.ee.test.conference.StopRecordingConferenceTest;
import org.plivo.ee.test.conference.UnmuteMemberTest;
import org.plivo.ee.test.message.MessageTest;
import org.plivo.ee.test.message.SendMessageTest;
import org.plivo.ee.test.number.ListRentedNumberTest;
import org.plivo.ee.test.number.RentNumberTest;
import org.plivo.ee.test.number.RentedNumberDetailsTest;
import org.plivo.ee.test.number.SearchAvailableNumbersTest;
import org.plivo.ee.test.plivoXml.DialXMLTest;
import org.plivo.ee.test.plivoXml.GetDigitsXMLTest;
import org.plivo.ee.test.plivoXml.SpeakXMLTest;


@RunWith(Suite.class)
@SuiteClasses({ MessageTest.class, CallExtensionTest.class,
		CallNumberTest.class, HangupCallTest.class, RecordCallTest.class,
		TransferCallTest.class, GetAllConferencesTest.class,
		HangupAllConferencesTest.class, HangUpConferenceMemberTest.class,
		HangupConferenceTest.class, KickMemberTest.class,
		MakeMemberDeafTest.class, MakeMemberUndeafTest.class,
		MuteMemberTest.class, PlayMemberTest.class, RecordConferenceTest.class,
		RetrieveConferenceDetailsTest.class, SpeakToMemberTest.class,
		StopPlayMemberTest.class, StopRecordingConferenceTest.class,
		UnmuteMemberTest.class,

		SendMessageTest.class, MessageTest.class,

		ListRentedNumberTest.class, RentedNumberDetailsTest.class,
		RentNumberTest.class, SearchAvailableNumbersTest.class,

		DialXMLTest.class, GetDigitsXMLTest.class, SpeakXMLTest.class

})
public class TestSuite {

	@BeforeClass
	public static void setUp() {
		System.out.println("setting up");
	}

	@AfterClass
	public static void tearDown() {
		System.out.println("tearing down");
	}

}