package com.rapidftr.controllers;

import org.junit.Before;
import org.junit.Test;

import com.rapidftr.model.Child;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class DispatcherTests {

	private HomeScreenController homeScreenController;
	private LoginController loginController;
	private ViewChildrenController viewChildrenController;
	private ViewChildController viewChildController;
	private SynchronizeFormsController synchronizeFormsController;
	private Dispatcher dispatcher;
	private NewChildController newChildController;
	private UploadChildRecordsController uploadChildRecordsController;

	@Before
	public void setUp() {
		homeScreenController = mock(HomeScreenController.class);
		loginController = mock(LoginController.class);
		viewChildrenController = mock(ViewChildrenController.class);
		viewChildController = mock(ViewChildController.class);
		synchronizeFormsController = mock(SynchronizeFormsController.class);
		newChildController = mock(NewChildController.class);
		uploadChildRecordsController = mock(UploadChildRecordsController.class);
		dispatcher = new Dispatcher(homeScreenController, loginController,
				viewChildrenController, viewChildController,
				synchronizeFormsController, newChildController,uploadChildRecordsController);

	}

	@Test
	public void shouldShowHomeScrenn() {

		dispatcher.homeScreen();
		verify(homeScreenController).show();
	}

	@Test
	public void shouldShowLoginScreen() {
		dispatcher.login();
		verify(loginController).show();
	}

	@Test
	public void shouldShowViewChildernScreen() {
		dispatcher.viewChildern();
		verify(viewChildrenController).show();
	}

	@Test
	public void shouldShowViewChildScreen() {
		Child child = mock(Child.class);
		dispatcher.viewChild(child);
		verify(viewChildController).show(child);
	}

	@Test
	public void shouldShowNewChildScreen() {
		dispatcher.newChild();
		verify(newChildController).show();
	}

}
