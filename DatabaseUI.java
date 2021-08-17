import java.util.*;
import org.eclipse.swt.*; 
import org.eclipse.swt.events.*; 
import org.eclipse.swt.graphics.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;

public class DatabaseUI 
{ 
    private patientComparator pComparator;
	private doctorComparator doComparator;
	private appointmentComparator aComparator;
	private roomComparator rComparator;
	private equipmentComparator eComparator;
	private insuranceCoComparator cComparator;
	private departmentComparator deComparator;
	private insuranceHolComparator hComparator;
	
	private java.util.List patients;
	private java.util.List doctors;
	private java.util.List appointments;
	private java.util.List rooms;
	private java.util.List equipment;
	private java.util.List insuranceCompanies;
	private java.util.List departments;
	private java.util.List insuranceHolders;
  
	private Text patientIDtxt;
	private Text appointmentIDtxt;
	private Text firstNametxt;
	private Text lastNametxt;
	private Text phoneNumbertxt;
	private Text birthdatetxt;
	private Text addresstxt;
	private Text emailtxt;
	private Text insuranceIDtxt;
	private Text holderIDtxt;
	private Text docIDtxt;
	private Text deptIDtxt;
	private Text specialtytxt;
	private Text entryDatetxt;
	private Text exitDatetxt;
	private Text diagnosistxt;
	private Text roomIDtxt;
	private Text coIDtxt;
	private Text bedsAvailtxt;
	private Text numPatstxt;
	private Text insNametxt;
	private Text groNotxt;
	private Text expDatetxt;
	private Text rmstxt;
	private Text rmsAvailtxt;
	private Text flrNotxt;
	private Text equipIDtxt;
	private Text nametxt;
	
	private Label lblPatientID;
	private Label lblAppointmentID;
	private Label lblFirstName;
	private Label lblLastName;
	private Label lblPhoneNumber;
	private Label lblBirthdate;
	private Label lblAddress;
	private Label lblEmail;
	private Label lblInsuranceID;
	private Label lblHolderID;
	private Label lbldocID;
	private Label lbldeptID;
	private Label lblspecialty;
	private Label lblentryDate;
	private Label lblexitDate;
	private Label lbldiagnosis;
	private Label lblroomID;
	private Label lblcoID;
	private Label lblbedsAvail;
	private Label lblnumPats;
	private Label lblinsName;
	private Label lblgroNo;
	private Label lblexpDate;
	private Label lblrms;
	private Label lblrmsAvail;
	private Label lblflrNo;
	private Label lblequipID;
	private Label lblname;

	private String patID = null;
	private String apptID = null;
	private String fName = null;
	private String lName = null;
	private String phoNo = null;
	private String bDay = null;
	private String addy = null;
	private String email = null;
	private String insID = null;
	private String holID = null;
	private String docID = null;
	private String deptID = null;
	private String specialty = null;
	private String entryDate = null;
	private String exitDate = null;
	private String diagnosis = null;
	private String roomID = null;
	private String coID = null;
	private String bedsAvail = null;
	private String numPats = null;
	private String insName = null;
	private String groNo = null;
	private String expDate = null;
	private String rms = null;
	private String rmsAvail = null;
	private String flrNo = null;
	private String equipID = null;
	private String name = null;
	
	protected Shell shlwarning;
	
  // ======================================== 
  // Children shells
  // ======================================== 
  private class deletePatientShell { 
		  
	     public deletePatientShell(Display display) { 
	    	 
	        System.out.println("Creating delete patient portal"); 
    
    // ========================================= 
    // Create a Shell (window) from the Display 
    // ========================================= 
    final Shell shell = new Shell(display, SWT.CLOSE); 

    //shell layout
    shell.setSize(300, 300); 
    
    shell.setText("Hospital Delete Patient Database Interface");
    
    shell.setLayout(new FillLayout(SWT.BOTTOM));
    
    createDeletePatientContents(shell);
    
    // ============================ 
    // Create a Label in the Shell 
    // ============================ 
     
//		        Label aLabel = new Label(shell, SWT.NONE); 
//		        aLabel.setSize(20, 20);
//		        aLabel.setBounds(20, 20, 20, 20);
//		        aLabel.setAlignment(SWT.CENTER);
//		        aLabel.setText("Welcome User"); 
    
    shell.pack();
    shell.open();
//		        shell.layout(true, true);
//		        final Point newSize = shell.computeSize(300, 300, true);  
//		        shell.setSize(newSize);
    shell.setSize(300, 300); 
    centerWindow(shell);
//		        
    // ============================================================= 
    // Register a listener for the Close event on the child Shell. 
    // This disposes the child Shell 
    // ============================================================= 
    shell.addListener(SWT.Close, new Listener() 
    { 
       @Override 
       public void handleEvent(Event event) 
       { 
          System.out.println("Closing delete patient portal"); 
	              shell.dispose(); 
	           } 
	        }); 
	     } 
	  } 
	  
  private class deleteDoctorShell { 
	  
	     public deleteDoctorShell(Display display) { 
	    	 
	        System.out.println("Creating delete doctor portal"); 
    
    // ========================================= 
    // Create a Shell (window) from the Display 
    // ========================================= 
    final Shell shell = new Shell(display, SWT.CLOSE); 

    //shell layout
    shell.setSize(300, 300); 
    
    shell.setText("Hospital Delete Doctor Database Interface");
    
    shell.setLayout(new FillLayout(SWT.BOTTOM));
    
    createDeleteDoctorContents(shell);
    
    // ============================ 
    // Create a Label in the Shell 
    // ============================ 
     
//			        Label aLabel = new Label(shell, SWT.NONE); 
//			        aLabel.setSize(20, 20);
//			        aLabel.setBounds(20, 20, 20, 20);
//			        aLabel.setAlignment(SWT.CENTER);
//			        aLabel.setText("Welcome User"); 
    
    shell.pack();
    shell.open();

    shell.setSize(300, 300); 
    centerWindow(shell);
//			        
    // ============================================================= 
    // Register a listener for the Close event on the child Shell. 
    // This disposes the child Shell 
    // ============================================================= 
    shell.addListener(SWT.Close, new Listener() 
    { 
       @Override 
       public void handleEvent(Event event) 
       { 
          System.out.println("Closing delete doctor portal"); 
	              shell.dispose(); 
	           } 
	        }); 
	     } 
	  } 
  
  private class deleteAppointmentShell { 
	  
	     public deleteAppointmentShell(Display display) { 
	    	 
	        System.out.println("Creating delete appointment portal"); 
    
    // ========================================= 
    // Create a Shell (window) from the Display 
    // ========================================= 
    final Shell shell = new Shell(display, SWT.CLOSE); 

    //shell layout
    shell.setSize(300, 300); 
    
    shell.setText("Hospital Delete Appointment Database Interface");
    
    shell.setLayout(new FillLayout(SWT.BOTTOM));
    
    createDeleteAppointmentContents(shell);
    
    // ============================ 
    // Create a Label in the Shell 
    // ============================ 
     
//			        Label aLabel = new Label(shell, SWT.NONE); 
//			        aLabel.setSize(20, 20);
//			        aLabel.setBounds(20, 20, 20, 20);
//			        aLabel.setAlignment(SWT.CENTER);
//			        aLabel.setText("Welcome User"); 
    
    shell.pack();
    shell.open();

    shell.setSize(300, 300); 
    centerWindow(shell);
//			        
    // ============================================================= 
    // Register a listener for the Close event on the child Shell. 
    // This disposes the child Shell 
    // ============================================================= 
    shell.addListener(SWT.Close, new Listener() 
    { 
       @Override 
       public void handleEvent(Event event) 
       { 
          System.out.println("Closing delete appointment portal"); 
	              shell.dispose(); 
	           } 
	        }); 
	     } 
	  }
  
  private class deleteRoomShell { 
	  
	     public deleteRoomShell(Display display) { 
	    	 
	        System.out.println("Creating delete room portal"); 
    
    // ========================================= 
    // Create a Shell (window) from the Display 
    // ========================================= 
    final Shell shell = new Shell(display, SWT.CLOSE); 

    //shell layout
    shell.setSize(300, 300); 
    
    shell.setText("Hospital Delete Room Database Interface");
    
    shell.setLayout(new FillLayout(SWT.BOTTOM));
    
    createDeleteRoomContents(shell);
    
    // ============================ 
    // Create a Label in the Shell 
    // ============================ 
     
//			        Label aLabel = new Label(shell, SWT.NONE); 
//			        aLabel.setSize(20, 20);
//			        aLabel.setBounds(20, 20, 20, 20);
//			        aLabel.setAlignment(SWT.CENTER);
//			        aLabel.setText("Welcome User"); 
    
    shell.pack();
    shell.open();

    shell.setSize(300, 300); 
    centerWindow(shell);
//			        
    // ============================================================= 
    // Register a listener for the Close event on the child Shell. 
    // This disposes the child Shell 
    // ============================================================= 
    shell.addListener(SWT.Close, new Listener() 
    { 
       @Override 
       public void handleEvent(Event event) 
       { 
          System.out.println("Closing delete room portal"); 
	              shell.dispose(); 
	           } 
	        }); 
	     } 
	  }
  
  private class deleteEquipmentShell { 
	  
	     public deleteEquipmentShell(Display display) { 
	    	 
	        System.out.println("Creating delete equipment portal"); 
    
    // ========================================= 
    // Create a Shell (window) from the Display 
    // ========================================= 
    final Shell shell = new Shell(display, SWT.CLOSE); 

    //shell layout
    shell.setSize(300, 300); 
    
    shell.setText("Hospital Delete Equipment Database Interface");
    
    shell.setLayout(new FillLayout(SWT.BOTTOM));
    
    createDeleteEquipmentContents(shell);
    
    // ============================ 
    // Create a Label in the Shell 
    // ============================ 
     
//			        Label aLabel = new Label(shell, SWT.NONE); 
//			        aLabel.setSize(20, 20);
//			        aLabel.setBounds(20, 20, 20, 20);
//			        aLabel.setAlignment(SWT.CENTER);
//			        aLabel.setText("Welcome User"); 
    
    shell.pack();
    shell.open();

    shell.setSize(300, 300); 
    centerWindow(shell);
//			        
    // ============================================================= 
    // Register a listener for the Close event on the child Shell. 
    // This disposes the child Shell 
    // ============================================================= 
    shell.addListener(SWT.Close, new Listener() 
    { 
       @Override 
       public void handleEvent(Event event) 
       { 
          System.out.println("Closing delete equipment portal"); 
	              shell.dispose(); 
	           } 
	        }); 
	     } 
	  }
  
  private class deleteDepartmentShell { 
	  
	     public deleteDepartmentShell(Display display) { 
	    	 
	        System.out.println("Creating delete department portal"); 
    
    // ========================================= 
    // Create a Shell (window) from the Display 
    // ========================================= 
    final Shell shell = new Shell(display, SWT.CLOSE); 

    //shell layout
    shell.setSize(300, 300); 
    
    shell.setText("Hospital Delete Department Database Interface");
    
    shell.setLayout(new FillLayout(SWT.BOTTOM));
    
    createDeleteDepartmentContents(shell);
    
    // ============================ 
    // Create a Label in the Shell 
    // ============================ 
     
//			        Label aLabel = new Label(shell, SWT.NONE); 
//			        aLabel.setSize(20, 20);
//			        aLabel.setBounds(20, 20, 20, 20);
//			        aLabel.setAlignment(SWT.CENTER);
//			        aLabel.setText("Welcome User"); 
    
    shell.pack();
    shell.open();

    shell.setSize(300, 300); 
    centerWindow(shell);
//			        
    // ============================================================= 
    // Register a listener for the Close event on the child Shell. 
    // This disposes the child Shell 
    // ============================================================= 
    shell.addListener(SWT.Close, new Listener() 
    { 
       @Override 
       public void handleEvent(Event event) 
       { 
          System.out.println("Closing delete department portal"); 
	              shell.dispose(); 
	           } 
	        }); 
	     } 
	  }
  
  private class deleteInsuranceCoShell { 
	  
	     public deleteInsuranceCoShell(Display display) { 
	    	 
	        System.out.println("Creating delete insurance company portal"); 
    
    // ========================================= 
    // Create a Shell (window) from the Display 
    // ========================================= 
    final Shell shell = new Shell(display, SWT.CLOSE); 

    //shell layout
    shell.setSize(300, 300); 
    
    shell.setText("Hospital Delete Insurance Company Database Interface");
    
    shell.setLayout(new FillLayout(SWT.BOTTOM));
    
    createDeleteInsuranceCoContents(shell);
    
    // ============================ 
    // Create a Label in the Shell 
    // ============================ 
     
//			        Label aLabel = new Label(shell, SWT.NONE); 
//			        aLabel.setSize(20, 20);
//			        aLabel.setBounds(20, 20, 20, 20);
//			        aLabel.setAlignment(SWT.CENTER);
//			        aLabel.setText("Welcome User"); 
    
    shell.pack();
    shell.open();

    shell.setSize(300, 300); 
    centerWindow(shell);
//			        
    // ============================================================= 
    // Register a listener for the Close event on the child Shell. 
    // This disposes the child Shell 
    // ============================================================= 
    shell.addListener(SWT.Close, new Listener() 
    { 
       @Override 
       public void handleEvent(Event event) 
       { 
          System.out.println("Closing delete insurance company portal"); 
	              shell.dispose(); 
	           } 
	        }); 
	     } 
	  }
  
  private class deleteInsuranceHolShell { 
			  
	     public deleteInsuranceHolShell(Display display) { 
	    	 
	        System.out.println("Creating delete inusrance holder portal"); 
    
    // ========================================= 
    // Create a Shell (window) from the Display 
    // ========================================= 
    final Shell shell = new Shell(display, SWT.CLOSE); 

    //shell layout
    shell.setSize(300, 300); 
    
    shell.setText("Hospital Delete Insurance Holder Database Interface");
    
    shell.setLayout(new FillLayout(SWT.BOTTOM));
    
    createDeleteInsuranceHolContents(shell);
    
    // ============================ 
    // Create a Label in the Shell 
    // ============================ 
     
//			        Label aLabel = new Label(shell, SWT.NONE); 
//			        aLabel.setSize(20, 20);
//			        aLabel.setBounds(20, 20, 20, 20);
//			        aLabel.setAlignment(SWT.CENTER);
//			        aLabel.setText("Welcome User"); 
    
    shell.pack();
    shell.open();

    shell.setSize(300, 300); 
    centerWindow(shell);
//			        
    // ============================================================= 
    // Register a listener for the Close event on the child Shell. 
    // This disposes the child Shell 
    // ============================================================= 
    shell.addListener(SWT.Close, new Listener() 
    { 
       @Override 
       public void handleEvent(Event event) 
       { 
          System.out.println("Closing delete insurance holder portal"); 
	              shell.dispose(); 
	           } 
	        }); 
	     } 
	  }
		
  private class editPatientShell { 
	  
     public editPatientShell(Display display) { 
    	 
        System.out.println("Creating edit patient portal"); 

// ========================================= 
// Create a Shell (window) from the Display 
// ========================================= 
final Shell shell = new Shell(display, SWT.CLOSE); 

//shell layout
shell.setSize(300, 300); 

shell.setText("Hospital Edit Patient Database Interface");

shell.setLayout(new FillLayout(SWT.BOTTOM));

createEditPatientContents(shell);

// ============================ 
// Create a Label in the Shell 
// ============================ 
 
//	        Label aLabel = new Label(shell, SWT.NONE); 
//	        aLabel.setSize(20, 20);
//	        aLabel.setBounds(20, 20, 20, 20);
//	        aLabel.setAlignment(SWT.CENTER);
//	        aLabel.setText("Welcome User"); 

shell.pack();
shell.open();
//	        shell.layout(true, true);
//	        final Point newSize = shell.computeSize(300, 300, true);  
//	        shell.setSize(newSize);
shell.setSize(300, 300); 
centerWindow(shell);
//	        
// ============================================================= 
// Register a listener for the Close event on the child Shell. 
// This disposes the child Shell 
// ============================================================= 
shell.addListener(SWT.Close, new Listener() 
{ 
   @Override 
   public void handleEvent(Event event) 
   { 
      System.out.println("Closing edit patient portal"); 
              shell.dispose(); 
           } 
        }); 
     } 
  } 
  
  private class editDoctorShell { 
	  
	     public editDoctorShell(Display display) { 
	    	 
	        System.out.println("Creating edit doctor portal"); 
    
    // ========================================= 
    // Create a Shell (window) from the Display 
    // ========================================= 
    final Shell shell = new Shell(display, SWT.CLOSE); 

    //shell layout
    shell.setSize(300, 300); 
    
    shell.setText("Hospital Edit Doctor Database Interface");
    
    shell.setLayout(new FillLayout(SWT.BOTTOM));
    
    createEditDoctorContents(shell);
    
    // ============================ 
    // Create a Label in the Shell 
    // ============================ 
     
//		        Label aLabel = new Label(shell, SWT.NONE); 
//		        aLabel.setSize(20, 20);
//		        aLabel.setBounds(20, 20, 20, 20);
//		        aLabel.setAlignment(SWT.CENTER);
//		        aLabel.setText("Welcome User"); 
    
    shell.pack();
    shell.open();

    shell.setSize(300, 300); 
    centerWindow(shell);
//		        
    // ============================================================= 
    // Register a listener for the Close event on the child Shell. 
    // This disposes the child Shell 
    // ============================================================= 
    shell.addListener(SWT.Close, new Listener() 
    { 
       @Override 
       public void handleEvent(Event event) 
       { 
          System.out.println("Closing edit doctor portal"); 
	              shell.dispose(); 
	           } 
	        }); 
	     } 
	  } 
  
  private class editAppointmentShell { 
	  
	     public editAppointmentShell(Display display) { 
	    	 
	        System.out.println("Creating edit appointment portal"); 
    
    // ========================================= 
    // Create a Shell (window) from the Display 
    // ========================================= 
    final Shell shell = new Shell(display, SWT.CLOSE); 

    //shell layout
    shell.setSize(300, 300); 
    
    shell.setText("Hospital Edit Appointment Database Interface");
    
    shell.setLayout(new FillLayout(SWT.BOTTOM));
    
    createEditAppointmentContents(shell);
    
    // ============================ 
    // Create a Label in the Shell 
    // ============================ 
     
//		        Label aLabel = new Label(shell, SWT.NONE); 
//		        aLabel.setSize(20, 20);
//		        aLabel.setBounds(20, 20, 20, 20);
//		        aLabel.setAlignment(SWT.CENTER);
//		        aLabel.setText("Welcome User"); 
    
    shell.pack();
    shell.open();

    shell.setSize(300, 300); 
    centerWindow(shell);
//		        
    // ============================================================= 
    // Register a listener for the Close event on the child Shell. 
    // This disposes the child Shell 
    // ============================================================= 
    shell.addListener(SWT.Close, new Listener() 
    { 
       @Override 
       public void handleEvent(Event event) 
       { 
          System.out.println("Closing edit appointment portal"); 
	              shell.dispose(); 
	           } 
	        }); 
	     } 
	  }
  
  private class editRoomShell { 
	  
	     public editRoomShell(Display display) { 
	    	 
	        System.out.println("Creating edit room portal"); 
    
    // ========================================= 
    // Create a Shell (window) from the Display 
    // ========================================= 
    final Shell shell = new Shell(display, SWT.CLOSE); 

    //shell layout
    shell.setSize(300, 300); 
    
    shell.setText("Hospital Edit Room Database Interface");
    
    shell.setLayout(new FillLayout(SWT.BOTTOM));
    
    createEditRoomContents(shell);
    
    // ============================ 
    // Create a Label in the Shell 
    // ============================ 
     
//		        Label aLabel = new Label(shell, SWT.NONE); 
//		        aLabel.setSize(20, 20);
//		        aLabel.setBounds(20, 20, 20, 20);
//		        aLabel.setAlignment(SWT.CENTER);
//		        aLabel.setText("Welcome User"); 
    
    shell.pack();
    shell.open();

    shell.setSize(300, 300); 
    centerWindow(shell);
//		        
    // ============================================================= 
    // Register a listener for the Close event on the child Shell. 
    // This disposes the child Shell 
    // ============================================================= 
    shell.addListener(SWT.Close, new Listener() 
    { 
       @Override 
       public void handleEvent(Event event) 
       { 
          System.out.println("Closing edit room portal"); 
	              shell.dispose(); 
	           } 
	        }); 
	     } 
	  }
  
  private class editEquipmentShell { 
	  
	     public editEquipmentShell(Display display) { 
	    	 
	        System.out.println("Creating edit equipment portal"); 
    
    // ========================================= 
    // Create a Shell (window) from the Display 
    // ========================================= 
    final Shell shell = new Shell(display, SWT.CLOSE); 

    //shell layout
    shell.setSize(300, 300); 
    
    shell.setText("Hospital Edit Equipment Database Interface");
    
    shell.setLayout(new FillLayout(SWT.BOTTOM));
    
    createEditEquipmentContents(shell);
    
    // ============================ 
    // Create a Label in the Shell 
    // ============================ 
     
//		        Label aLabel = new Label(shell, SWT.NONE); 
//		        aLabel.setSize(20, 20);
//		        aLabel.setBounds(20, 20, 20, 20);
//		        aLabel.setAlignment(SWT.CENTER);
//		        aLabel.setText("Welcome User"); 
    
    shell.pack();
    shell.open();

    shell.setSize(300, 300); 
    centerWindow(shell);
//		        
    // ============================================================= 
    // Register a listener for the Close event on the child Shell. 
    // This disposes the child Shell 
    // ============================================================= 
    shell.addListener(SWT.Close, new Listener() 
    { 
       @Override 
       public void handleEvent(Event event) 
       { 
          System.out.println("Closing edit equipment portal"); 
	              shell.dispose(); 
	           } 
	        }); 
	     } 
	  }
  
  private class editDepartmentShell { 
	  
	     public editDepartmentShell(Display display) { 
	    	 
	        System.out.println("Creating edit department portal"); 
    
    // ========================================= 
    // Create a Shell (window) from the Display 
    // ========================================= 
    final Shell shell = new Shell(display, SWT.CLOSE); 

    //shell layout
    shell.setSize(300, 300); 
    
    shell.setText("Hospital Edit Department Database Interface");
    
    shell.setLayout(new FillLayout(SWT.BOTTOM));
    
    createEditDepartmentContents(shell);
    
    // ============================ 
    // Create a Label in the Shell 
    // ============================ 
     
//		        Label aLabel = new Label(shell, SWT.NONE); 
//		        aLabel.setSize(20, 20);
//		        aLabel.setBounds(20, 20, 20, 20);
//		        aLabel.setAlignment(SWT.CENTER);
//		        aLabel.setText("Welcome User"); 
    
    shell.pack();
    shell.open();

    shell.setSize(300, 300); 
    centerWindow(shell);
//		        
    // ============================================================= 
    // Register a listener for the Close event on the child Shell. 
    // This disposes the child Shell 
    // ============================================================= 
    shell.addListener(SWT.Close, new Listener() 
    { 
       @Override 
       public void handleEvent(Event event) 
       { 
          System.out.println("Closing edit department portal"); 
	              shell.dispose(); 
	           } 
	        }); 
	     } 
	  }
  
  private class editInsuranceCoShell { 
	  
	     public editInsuranceCoShell(Display display) { 
	    	 
	        System.out.println("Creating edit insurance company portal"); 
    
    // ========================================= 
    // Create a Shell (window) from the Display 
    // ========================================= 
    final Shell shell = new Shell(display, SWT.CLOSE); 

    //shell layout
    shell.setSize(300, 300); 
    
    shell.setText("Hospital Edit Insurance Company Database Interface");
    
    shell.setLayout(new FillLayout(SWT.BOTTOM));
    
    createEditInsuranceCoContents(shell);
    
    // ============================ 
    // Create a Label in the Shell 
    // ============================ 
     
//		        Label aLabel = new Label(shell, SWT.NONE); 
//		        aLabel.setSize(20, 20);
//		        aLabel.setBounds(20, 20, 20, 20);
//		        aLabel.setAlignment(SWT.CENTER);
//		        aLabel.setText("Welcome User"); 
    
    shell.pack();
    shell.open();

    shell.setSize(300, 300); 
    centerWindow(shell);
//		        
    // ============================================================= 
    // Register a listener for the Close event on the child Shell. 
    // This disposes the child Shell 
    // ============================================================= 
    shell.addListener(SWT.Close, new Listener() 
    { 
       @Override 
       public void handleEvent(Event event) 
       { 
          System.out.println("Closing edit insurance company portal"); 
	              shell.dispose(); 
	           } 
	        }); 
	     } 
	  }
  
  private class editInsuranceHolShell { 
		  
		     public editInsuranceHolShell(Display display) { 
		    	 
		        System.out.println("Creating edit inusrance holder portal"); 
        
        // ========================================= 
        // Create a Shell (window) from the Display 
        // ========================================= 
        final Shell shell = new Shell(display, SWT.CLOSE); 

        //shell layout
        shell.setSize(300, 300); 
        
        shell.setText("Hospital Edit Insurance Holder Database Interface");
        
        shell.setLayout(new FillLayout(SWT.BOTTOM));
        
        createEditInsuranceHolContents(shell);
        
        // ============================ 
        // Create a Label in the Shell 
        // ============================ 
         
//		        Label aLabel = new Label(shell, SWT.NONE); 
//		        aLabel.setSize(20, 20);
//		        aLabel.setBounds(20, 20, 20, 20);
//		        aLabel.setAlignment(SWT.CENTER);
//		        aLabel.setText("Welcome User"); 
        
        shell.pack();
        shell.open();

        shell.setSize(300, 300); 
        centerWindow(shell);
//		        
        // ============================================================= 
        // Register a listener for the Close event on the child Shell. 
        // This disposes the child Shell 
        // ============================================================= 
        shell.addListener(SWT.Close, new Listener() 
        { 
           @Override 
           public void handleEvent(Event event) 
           { 
              System.out.println("Closing edit insurance holder portal"); 
		              shell.dispose(); 
		           } 
		        }); 
		     } 
		  }
	
  private class newPatientShell { 
	  
     public newPatientShell(Display display) { 
    	 
        System.out.println("Creating new patient portal"); 

// ========================================= 
// Create a Shell (window) from the Display 
// ========================================= 
final Shell shell = new Shell(display, SWT.CLOSE); 

//shell layout
//shell.setSize(300, 300); 

shell.setText("Hospital New Patient Database Interface");

shell.setLayout(new FillLayout(SWT.BOTTOM));

createNewPatientContents(shell, shell, display);

// ============================ 
// Create a Label in the Shell 
// ============================ 
 
//        Label aLabel = new Label(shell, SWT.NONE); 
//        aLabel.setSize(20, 20);
//        aLabel.setBounds(20, 20, 20, 20);
//        aLabel.setAlignment(SWT.CENTER);
//        aLabel.setText("Welcome User"); 

shell.pack();
shell.open();
//        shell.layout(true, true);
//        final Point newSize = shell.computeSize(300, 300, true);  
//        shell.setSize(newSize);
//shell.setSize(300, 300); 
centerWindow(shell);
//        
// ============================================================= 
// Register a listener for the Close event on the child Shell. 
// This disposes the child Shell 
// ============================================================= 
shell.addListener(SWT.Close, new Listener() 
{ 
   @Override 
   public void handleEvent(Event event) 
   { 
      System.out.println("Closing new patient portal"); 
              shell.dispose(); 
           } 
        }); 
     } 
  } 
  
  private class newDoctorShell { 
	  
	     public newDoctorShell(Display display) { 
	    	 
	        System.out.println("Creating new doctor portal"); 
    
    // ========================================= 
    // Create a Shell (window) from the Display 
    // ========================================= 
    final Shell shell = new Shell(display, SWT.CLOSE); 

    //shell layout
    //shell.setSize(300, 300); 
    
    shell.setText("Hospital New Doctor Database Interface");
    
    shell.setLayout(new FillLayout(SWT.BOTTOM));
    
    createNewDoctorContents(shell, shell, display);
    
    // ============================ 
    // Create a Label in the Shell 
    // ============================ 
     
//	        Label aLabel = new Label(shell, SWT.NONE); 
//	        aLabel.setSize(20, 20);
//	        aLabel.setBounds(20, 20, 20, 20);
//	        aLabel.setAlignment(SWT.CENTER);
//	        aLabel.setText("Welcome User"); 
    
    shell.pack();
    shell.open();

    //shell.setSize(300, 300); 
    centerWindow(shell);
//	        
    // ============================================================= 
    // Register a listener for the Close event on the child Shell. 
    // This disposes the child Shell 
    // ============================================================= 
    shell.addListener(SWT.Close, new Listener() 
    { 
       @Override 
       public void handleEvent(Event event) 
       { 
          System.out.println("Closing new doctor portal"); 
	              shell.dispose(); 
	           } 
	        }); 
	     } 
	  } 
  
  private class newAppointmentShell { 
	  
	     public newAppointmentShell(Display display) { 
	    	 
	        System.out.println("Creating new appointment portal"); 
    
    // ========================================= 
    // Create a Shell (window) from the Display 
    // ========================================= 
    final Shell shell = new Shell(display, SWT.CLOSE); 

    //shell layout
    
    shell.setText("Hospital New Appointment Database Interface");
    
    shell.setLayout(new FillLayout(SWT.BOTTOM));
    
    createNewAppointmentContents(shell, shell, display);
    
    // ============================ 
    // Create a Label in the Shell 
    // ============================ 
     
//	        Label aLabel = new Label(shell, SWT.NONE); 
//	        aLabel.setSize(20, 20);
//	        aLabel.setBounds(20, 20, 20, 20);
//	        aLabel.setAlignment(SWT.CENTER);
//	        aLabel.setText("Welcome User"); 
    
    shell.pack();
    shell.open();

    centerWindow(shell);
//	        
    // ============================================================= 
    // Register a listener for the Close event on the child Shell. 
    // This disposes the child Shell 
    // ============================================================= 
    shell.addListener(SWT.Close, new Listener() 
    { 
       @Override 
       public void handleEvent(Event event) 
       { 
          System.out.println("Closing new appointment portal"); 
	              shell.dispose(); 
	           } 
	        }); 
	     } 
	  }
  
  private class newRoomShell { 
	  
	     public newRoomShell(Display display) { 
	    	 
	        System.out.println("Creating new room portal"); 
    
    // ========================================= 
    // Create a Shell (window) from the Display 
    // ========================================= 
    final Shell shell = new Shell(display, SWT.CLOSE); 

    //shell layout
    
    shell.setText("Hospital New Room Database Interface");
    
    shell.setLayout(new FillLayout(SWT.BOTTOM));
    
    createNewRoomContents(shell, shell, display);
    
    // ============================ 
    // Create a Label in the Shell 
    // ============================ 
     
//	        Label aLabel = new Label(shell, SWT.NONE); 
//	        aLabel.setSize(20, 20);
//	        aLabel.setBounds(20, 20, 20, 20);
//	        aLabel.setAlignment(SWT.CENTER);
//	        aLabel.setText("Welcome User"); 
    
    shell.pack();
    shell.open();

    centerWindow(shell);
//	        
    // ============================================================= 
    // Register a listener for the Close event on the child Shell. 
    // This disposes the child Shell 
    // ============================================================= 
    shell.addListener(SWT.Close, new Listener() 
    { 
       @Override 
       public void handleEvent(Event event) 
       { 
          System.out.println("Closing new room portal"); 
	              shell.dispose(); 
	           } 
	        }); 
	     } 
	  }
  
  private class newEquipmentShell { 
	  
	     public newEquipmentShell(Display display) { 
	    	 
	        System.out.println("Creating new equipment portal"); 
    
    // ========================================= 
    // Create a Shell (window) from the Display 
    // ========================================= 
    final Shell shell = new Shell(display, SWT.CLOSE); 

    //shell layout
    
    shell.setText("Hospital New Equipment Database Interface");
    
    shell.setLayout(new FillLayout(SWT.BOTTOM));
    
    createNewEquipmentContents(shell, shell, display);
    
    // ============================ 
    // Create a Label in the Shell 
    // ============================ 
     
//	        Label aLabel = new Label(shell, SWT.NONE); 
//	        aLabel.setSize(20, 20);
//	        aLabel.setBounds(20, 20, 20, 20);
//	        aLabel.setAlignment(SWT.CENTER);
//	        aLabel.setText("Welcome User"); 
    
    shell.pack();
    shell.open();

    centerWindow(shell);
//	        
    // ============================================================= 
    // Register a listener for the Close event on the child Shell. 
    // This disposes the child Shell 
    // ============================================================= 
    shell.addListener(SWT.Close, new Listener() 
    { 
       @Override 
       public void handleEvent(Event event) 
       { 
          System.out.println("Closing new equipment portal"); 
	              shell.dispose(); 
	           } 
	        }); 
	     } 
	  }
  
  private class newDepartmentShell { 
	  
	     public newDepartmentShell(Display display) { 
	    	 
	        System.out.println("Creating new department portal"); 
    
    // ========================================= 
    // Create a Shell (window) from the Display 
    // ========================================= 
    final Shell shell = new Shell(display, SWT.CLOSE); 

    //shell layout
    
    shell.setText("Hospital New Department Database Interface");
    
    shell.setLayout(new FillLayout(SWT.BOTTOM));
    
    createNewDepartmentContents(shell, shell, display);
    
    // ============================ 
    // Create a Label in the Shell 
    // ============================ 
     
//	        Label aLabel = new Label(shell, SWT.NONE); 
//	        aLabel.setSize(20, 20);
//	        aLabel.setBounds(20, 20, 20, 20);
//	        aLabel.setAlignment(SWT.CENTER);
//	        aLabel.setText("Welcome User"); 
    
    shell.pack();
    shell.open();

    centerWindow(shell);
//	        
    // ============================================================= 
    // Register a listener for the Close event on the child Shell. 
    // This disposes the child Shell 
    // ============================================================= 
    shell.addListener(SWT.Close, new Listener() 
    { 
       @Override 
       public void handleEvent(Event event) 
       { 
          System.out.println("Closing new department portal"); 
	              shell.dispose(); 
	           } 
	        }); 
	     } 
	  }
  
  private class newInsuranceCoShell { 
	  
	     public newInsuranceCoShell(Display display) { 
	    	 
	        System.out.println("Creating new insurance company portal"); 
    
    // ========================================= 
    // Create a Shell (window) from the Display 
    // ========================================= 
    final Shell shell = new Shell(display, SWT.CLOSE); 

    //shell layout
    
    shell.setText("Hospital New Insurance Company Database Interface");
    
    shell.setLayout(new FillLayout(SWT.BOTTOM));
    
    createNewInsuranceCoContents(shell, shell, display);
    
    // ============================ 
    // Create a Label in the Shell 
    // ============================ 
     
//	        Label aLabel = new Label(shell, SWT.NONE); 
//	        aLabel.setSize(20, 20);
//	        aLabel.setBounds(20, 20, 20, 20);
//	        aLabel.setAlignment(SWT.CENTER);
//	        aLabel.setText("Welcome User"); 
    
    shell.pack();
    shell.open();

    centerWindow(shell);
//	        
    // ============================================================= 
    // Register a listener for the Close event on the child Shell. 
    // This disposes the child Shell 
    // ============================================================= 
    shell.addListener(SWT.Close, new Listener() 
    { 
       @Override 
       public void handleEvent(Event event) 
       { 
          System.out.println("Closing new insurance company portal"); 
	              shell.dispose(); 
	           } 
	        }); 
	     } 
	  }
  
  private class newInsuranceHolShell { 
	  
	     public newInsuranceHolShell(Display display) { 
	    	 
	        System.out.println("Creating new inusrance holder portal"); 
    
    // ========================================= 
    // Create a Shell (window) from the Display 
    // ========================================= 
    final Shell shell = new Shell(display, SWT.CLOSE); 

    //shell layout
    
    shell.setText("Hospital New Insurance Holder Database Interface");
    
    shell.setLayout(new FillLayout(SWT.BOTTOM));
    
    createNewInsuranceHolContents(shell, shell, display);
    
    // ============================ 
    // Create a Label in the Shell 
    // ============================ 
     
//	        Label aLabel = new Label(shell, SWT.NONE); 
//	        aLabel.setSize(20, 20);
//	        aLabel.setBounds(20, 20, 20, 20);
//	        aLabel.setAlignment(SWT.CENTER);
//	        aLabel.setText("Welcome User"); 
    
    shell.pack();
    shell.open();

    centerWindow(shell);
//	        
    // ============================================================= 
    // Register a listener for the Close event on the child Shell. 
    // This disposes the child Shell 
    // ============================================================= 
    shell.addListener(SWT.Close, new Listener() 
    { 
       @Override 
       public void handleEvent(Event event) 
       { 
          System.out.println("Closing new insurance holder portal"); 
	              shell.dispose(); 
	           } 
	        }); 
	     } 
	  }
  
  private class patientShell { 
	  
	     public patientShell(Display display) { 
	    	 
	        System.out.println("Creating patient portal"); 
    
    // ========================================= 
    // Create a Shell (window) from the Display 
    // ========================================= 
    final Shell shell = new Shell(display, SWT.CLOSE); 

    //shell layout
    shell.setText("Hospital Patient Database Interface");
    shell.setSize(50, 50); 
    shell.setLayout(new FillLayout(SWT.BOTTOM));
    createPatientContents(shell);
    
    // ============================ 
    // Create a Label in the Shell 
    // ============================ 
     
//	        Label aLabel = new Label(shell, SWT.NONE); 
//	        aLabel.setSize(20, 20);
//	        aLabel.setBounds(20, 20, 20, 20);
//	        aLabel.setAlignment(SWT.CENTER);
//	        aLabel.setText("Welcome User"); 
    
    shell.pack();
    shell.open();
    centerWindow(shell);
    
    // ============================================================= 
    // Register a listener for the Close event on the child Shell. 
    // This disposes the child Shell 
    // ============================================================= 
    shell.addListener(SWT.Close, new Listener() 
    { 
       @Override 
       public void handleEvent(Event event) 
       { 
          System.out.println("Closing patient portal"); 
	              shell.dispose(); 
	           } 
	        }); 
	     } 
	  } 

  private class doctorShell { 
	  
	     public doctorShell(Display display) { 
	    	 
	        System.out.println("Creating Staff portal"); 
    
    // ========================================= 
    // Create a Shell (window) from the Display 
    // ========================================= 
    final Shell shell = new Shell(display, SWT.CLOSE); 

    //shell layout
    shell.setText("Hospital Staff Database Interface");
    shell.setSize(50, 50); 
    shell.setLayout(new FillLayout(SWT.BOTTOM));
    createDoctorContents(shell);
    
    // ============================ 
    // Create a Label in the Shell 
    // ============================ 
     
//	        Label aLabel = new Label(shell, SWT.NONE); 
//	        aLabel.setSize(20, 20);
//	        aLabel.setBounds(20, 20, 20, 20);
//	        aLabel.setAlignment(SWT.CENTER);
//	        aLabel.setText("Welcome User"); 
    
    shell.pack();
    shell.open();
    centerWindow(shell);
    
    // ============================================================= 
    // Register a listener for the Close event on the child Shell. 
    // This disposes the child Shell 
    // ============================================================= 
    shell.addListener(SWT.Close, new Listener() 
    { 
       @Override 
       public void handleEvent(Event event) 
       { 
          System.out.println("Closing Staff portal"); 
	              shell.dispose(); 
	           } 
	        }); 
	     } 
	  }
  
  private class appointmentShell { 
	  
	     public appointmentShell(Display display) { 
	    	 
	        System.out.println("Creating appointment portal"); 
    
    // ========================================= 
    // Create a Shell (window) from the Display 
    // ========================================= 
    final Shell shell = new Shell(display, SWT.CLOSE); 

    //shell layout
    shell.setText("Hospital Appointment Database Interface");
    shell.setSize(50, 50); 
    shell.setLayout(new FillLayout(SWT.BOTTOM));
    createAppointmentContents(shell);
    
    // ============================ 
    // Create a Label in the Shell 
    // ============================ 
     
//	        Label aLabel = new Label(shell, SWT.NONE); 
//	        aLabel.setSize(20, 20);
//	        aLabel.setBounds(20, 20, 20, 20);
//	        aLabel.setAlignment(SWT.CENTER);
//	        aLabel.setText("Welcome User"); 
    
    shell.pack();
    shell.open();
    centerWindow(shell);
    
    // ============================================================= 
    // Register a listener for the Close event on the child Shell. 
    // This disposes the child Shell 
    // ============================================================= 
    shell.addListener(SWT.Close, new Listener() 
    { 
       @Override 
       public void handleEvent(Event event) 
       { 
          System.out.println("Closing appointment portal"); 
	              shell.dispose(); 
	           } 
	        }); 
	     } 
	  }
  
  private class roomShell { 
	  
	     public roomShell(Display display) { 
	    	 
	        System.out.println("Creating room portal"); 
    
    // ========================================= 
    // Create a Shell (window) from the Display 
    // ========================================= 
    final Shell shell = new Shell(display, SWT.CLOSE); 

    //shell layout
    shell.setText("Hospital Room Database Interface");
    shell.setSize(50, 50); 
    shell.setLayout(new FillLayout(SWT.BOTTOM));
    createRoomContents(shell);
    
    // ============================ 
    // Create a Label in the Shell 
    // ============================ 
     
//	        Label aLabel = new Label(shell, SWT.NONE); 
//	        aLabel.setSize(20, 20);
//	        aLabel.setBounds(20, 20, 20, 20);
//	        aLabel.setAlignment(SWT.CENTER);
//	        aLabel.setText("Welcome User"); 
    
    shell.pack();
    shell.open();
    centerWindow(shell);
    
    // ============================================================= 
    // Register a listener for the Close event on the child Shell. 
    // This disposes the child Shell 
    // ============================================================= 
    shell.addListener(SWT.Close, new Listener() 
    { 
       @Override 
       public void handleEvent(Event event) 
       { 
          System.out.println("Closing room portal"); 
	              shell.dispose(); 
	           } 
	        }); 
	     } 
	  }
  
  private class equipmentShell { 
	  
	     public equipmentShell(Display display) { 
	    	 
	        System.out.println("Creating equipment portal"); 
    
    // ========================================= 
    // Create a Shell (window) from the Display 
    // ========================================= 
    final Shell shell = new Shell(display, SWT.CLOSE); 

    //shell layout
    shell.setText("Hospital Equipment Database Interface");
    shell.setSize(50, 50); 
    shell.setLayout(new FillLayout(SWT.BOTTOM));
    createEquipmentContents(shell);
    
    // ============================ 
    // Create a Label in the Shell 
    // ============================ 
     
//	        Label aLabel = new Label(shell, SWT.NONE); 
//	        aLabel.setSize(20, 20);
//	        aLabel.setBounds(20, 20, 20, 20);
//	        aLabel.setAlignment(SWT.CENTER);
//	        aLabel.setText("Welcome User"); 
    
    shell.pack();
    shell.open();
    centerWindow(shell);
    
    // ============================================================= 
    // Register a listener for the Close event on the child Shell. 
    // This disposes the child Shell 
    // ============================================================= 
    shell.addListener(SWT.Close, new Listener() 
    { 
       @Override 
       public void handleEvent(Event event) 
       { 
          System.out.println("Closing equipment portal"); 
	              shell.dispose(); 
	           } 
	        }); 
	     } 
	  }
  
  private class insuranceCoShell { 
	  
	     public insuranceCoShell(Display display) { 
	    	 
	        System.out.println("Creating insurance company portal"); 
    
    // ========================================= 
    // Create a Shell (window) from the Display 
    // ========================================= 
    final Shell shell = new Shell(display, SWT.CLOSE); 

    //shell layout
    shell.setText("Hospital Insurance Company Database Interface");
    shell.setSize(50, 50); 
    shell.setLayout(new FillLayout(SWT.BOTTOM));
    createInsuranceCoContents(shell);
    
    // ============================ 
    // Create a Label in the Shell 
    // ============================ 
     
//	        Label aLabel = new Label(shell, SWT.NONE); 
//	        aLabel.setSize(20, 20);
//	        aLabel.setBounds(20, 20, 20, 20);
//	        aLabel.setAlignment(SWT.CENTER);
//	        aLabel.setText("Welcome User"); 
    
    shell.pack();
    shell.open();
    centerWindow(shell);
    
    // ============================================================= 
    // Register a listener for the Close event on the child Shell. 
    // This disposes the child Shell 
    // ============================================================= 
    shell.addListener(SWT.Close, new Listener() 
    { 
       @Override 
       public void handleEvent(Event event) 
       { 
          System.out.println("Closing insurance company portal"); 
	              shell.dispose(); 
	           } 
	        }); 
	     } 
	  }
  
  private class departmentShell { 
	  
	     public departmentShell(Display display) { 
	    	 
	        System.out.println("Creating deparment portal"); 
    
    // ========================================= 
    // Create a Shell (window) from the Display 
    // ========================================= 
    final Shell shell = new Shell(display, SWT.CLOSE); 

    //shell layout
    shell.setText("Hospital Department Database Interface");
    shell.setSize(50, 50); 
    shell.setLayout(new FillLayout(SWT.BOTTOM));
    createDepartmentContents(shell);
    
    // ============================ 
    // Create a Label in the Shell 
    // ============================ 
     
//	        Label aLabel = new Label(shell, SWT.NONE); 
//	        aLabel.setSize(20, 20);
//	        aLabel.setBounds(20, 20, 20, 20);
//	        aLabel.setAlignment(SWT.CENTER);
//	        aLabel.setText("Welcome User"); 
    
    shell.pack();
    shell.open();
    centerWindow(shell);
    
    // ============================================================= 
    // Register a listener for the Close event on the child Shell. 
    // This disposes the child Shell 
    // ============================================================= 
    shell.addListener(SWT.Close, new Listener() 
    { 
       @Override 
       public void handleEvent(Event event) 
       { 
          System.out.println("Closing department portal"); 
	              shell.dispose(); 
	           } 
	        }); 
	     } 
	  }
  
  private class insuranceHolShell { 
	  
	     public insuranceHolShell(Display display) { 
	    	 
	        System.out.println("Creating insurance holder portal"); 
    
    // ========================================= 
    // Create a Shell (window) from the Display 
    // ========================================= 
    final Shell shell = new Shell(display, SWT.CLOSE); 

    //shell layout
    shell.setText("Hospital Insurance Holder Database Interface");
    shell.setSize(50, 50); 
    shell.setLayout(new FillLayout(SWT.BOTTOM));
    createInsuranceHolContents(shell);
    
    // ============================ 
    // Create a Label in the Shell 
    // ============================ 
     
//	        Label aLabel = new Label(shell, SWT.NONE); 
//	        aLabel.setSize(20, 20);
//	        aLabel.setBounds(20, 20, 20, 20);
//	        aLabel.setAlignment(SWT.CENTER);
//	        aLabel.setText("Welcome User"); 
    
    shell.pack();
    shell.open();
    centerWindow(shell);
    
    // ============================================================= 
    // Register a listener for the Close event on the child Shell. 
    // This disposes the child Shell 
    // ============================================================= 
    shell.addListener(SWT.Close, new Listener() 
    { 
       @Override 
       public void handleEvent(Event event) 
       { 
          System.out.println("Closing insurance holder portal"); 
	              shell.dispose(); 
	           } 
	        }); 
	     } 
	  }

  public DatabaseUI() {
	  
	  pComparator = new patientComparator();
	  pComparator.setColumn(patientComparator.PAT_ID);
	  pComparator.setDirection(patientComparator.ASCENDING);
	  
	  doComparator = new doctorComparator();
	  doComparator.setColumn(doctorComparator.DOC_ID);
	  doComparator.setDirection(doctorComparator.ASCENDING);
	  
	  aComparator = new appointmentComparator();
	  aComparator.setColumn(appointmentComparator.APPT_ID);
	  aComparator.setDirection(appointmentComparator.ASCENDING);
	  
	  rComparator = new roomComparator();
	  rComparator.setColumn(roomComparator.ROOM_ID);
	  rComparator.setDirection(roomComparator.ASCENDING);
	  
	  eComparator = new equipmentComparator();
	  eComparator.setColumn(equipmentComparator.EQUIPMENT_ID);
	  eComparator.setDirection(equipmentComparator.ASCENDING);
	  
	  cComparator = new insuranceCoComparator();
	  cComparator.setColumn(insuranceCoComparator.CO_ID);
	  cComparator.setDirection(insuranceCoComparator.ASCENDING);
	  
	  deComparator = new departmentComparator();
	  deComparator.setColumn(departmentComparator.DEPT_ID);
	  deComparator.setDirection(departmentComparator.ASCENDING);
	  
	  hComparator = new insuranceHolComparator();
	  hComparator.setColumn(insuranceHolComparator.HOLDER_ID);
	  hComparator.setDirection(insuranceHolComparator.ASCENDING);

	  patients = new ArrayList();
	  patients.add(new patient(10001, 1215842, "Noehly", "Rios", 11241995, "123 Easy Street, Boredom, MD", "nrios@bozo.net", 9758538, 12431, 12431));
  
	  doctors = new ArrayList();
	  doctors.add(new doctor(34835, "John", "Dorian", "General", 3, 9750431, "jdorian@sacredheart.net"));
	  
	  appointments = new ArrayList();
	  appointments.add(new appointment(1215842, 07112015, 07132015, "Mild concussion", 212, 34835));
	 
	  rooms = new ArrayList();
	  rooms.add(new room(201, 2, 1, 3));
	  rooms.add(new room(202, 3, 0, 3));	  
	  rooms.add(new room(203, 2, 1, 3));
	  rooms.add(new room(204, 3, 0, 3));
	  rooms.add(new room(205, 2, 1, 3));
	  rooms.add(new room(211, 3, 0, 3));
	  rooms.add(new room(212, 2, 1, 3));
	  rooms.add(new room(213, 3, 0, 3));
	  rooms.add(new room(214, 2, 1, 3));
	  rooms.add(new room(215, 3, 0, 3));
	
	  equipment = new ArrayList();
	  equipment.add(new equipment(48931, 212, "bed"));
	  equipment.add(new equipment(48932, 212, "table"));
	  equipment.add(new equipment(48933, 212, "tv"));
	  equipment.add(new equipment(48934, 212, "chair"));
	  
	  insuranceCompanies = new ArrayList();
	  insuranceCompanies.add(new insuranceCompany(473834823, "Aflack", "512 Insurance Avenue, Honolulu, HI", 7547343));
	
	  departments = new ArrayList();
	  departments.add(new department(1, 9, 10, 1));
	  departments.add(new department(2, 8, 10, 1));
	  departments.add(new department(3, 9, 10, 2));
	  departments.add(new department(4, 10, 10, 2));
	  departments.add(new department(5, 9, 10, 3));
	  departments.add(new department(6, 7, 10, 3));
	
	  insuranceHolders = new ArrayList();
	  insuranceHolders.add(new insuranceHolder(12431, "Nohely", "Rios", 473834823, 85483453, 12312015));
	
	    
	 // ====================================================== 
	 // Create the main Display object that represents the UI 
	 // subsystem and contains the single UI handling thread 
	 // ====================================================== 
	 final Display display = Display.getDefault(); 
	
	 // ==================================================== 
	 // create a shell for the main window from the Display 
	 // ==================================================== 
	 final Shell mainWindowShell = new Shell(display, SWT.CLOSE); 
	
	 // ===================== 
	 // Set the Window Title 
	 // ===================== 
	 mainWindowShell.setText("Database Portal"); 
	
	 // ========================================= 
	 // Create a button that spawns child Shells 
	 // ========================================= 
	 Button pat = new Button(mainWindowShell, SWT.PUSH); 
	 pat.setText("Display Patients"); 
	 pat.setBounds(10, 31, 200, 30);
	 pat.setAlignment(SWT.CENTER);
	 pat.addSelectionListener(new SelectionListener() 
	 { 
	    @Override 
	    public void widgetSelected(SelectionEvent e) 
	    { 
	       System.out.println("Creating database portal"); 
	       new patientShell(display); 
	    } 
	
	    @Override 
	    public void widgetDefaultSelected(SelectionEvent e) 
	    { 
	       widgetSelected(e); 
	    } 
	 }); 
	 
	 Button doc = new Button(mainWindowShell, SWT.PUSH); 
	 doc.setText("Display Staff"); 
	 doc.setBounds(227, 31, 200, 30);
	 doc.setAlignment(SWT.CENTER);
	 doc.addSelectionListener(new SelectionListener() 
	 { 
	    @Override 
	    public void widgetSelected(SelectionEvent e) 
	    { 
	       // ===================================================== 
	   // on button press, create a child Shell object passing 
	   // the main Display. The child could also access the 
	   // display itself by calling Display.getDefault() 
	   // ===================================================== 
	   System.out.println("Creating database portal"); 
	       new doctorShell(display); 
	    } 
	
	    @Override 
	    public void widgetDefaultSelected(SelectionEvent e) 
	    { 
	       widgetSelected(e); 
	    } 
	 }); 
	
	 Button appt = new Button(mainWindowShell, SWT.PUSH); 
	 appt.setText("Display Appointments"); 
	 appt.setBounds(670, 31, 200, 30);
	 appt.setAlignment(SWT.CENTER);
	 appt.addSelectionListener(new SelectionListener() 
	 { 
	    @Override 
	    public void widgetSelected(SelectionEvent e) 
	    { 
	       // ===================================================== 
	   // on button press, create a child Shell object passing 
	   // the main Display. The child could also access the 
	   // display itself by calling Display.getDefault() 
	   // ===================================================== 
	   System.out.println("Creating database portal"); 
	       new appointmentShell(display); 
	    } 
	
	    @Override 
	    public void widgetDefaultSelected(SelectionEvent e) 
	    { 
	       widgetSelected(e); 
	    } 
	 });
	 
	 Button room = new Button(mainWindowShell, SWT.PUSH); 
	 room.setText("Display Rooms"); 
	 room.setBounds(10, 208, 200, 30);
	 room.setAlignment(SWT.CENTER);
	 room.addSelectionListener(new SelectionListener() 
	 { 
	    @Override 
	    public void widgetSelected(SelectionEvent e) 
	    { 
	       // ===================================================== 
	   // on button press, create a child Shell object passing 
	   // the main Display. The child could also access the 
	   // display itself by calling Display.getDefault() 
	   // ===================================================== 
	   System.out.println("Creating database portal"); 
	       new roomShell(display); 
	    } 
	
	    @Override 
	    public void widgetDefaultSelected(SelectionEvent e) 
	    { 
	       widgetSelected(e); 
	    } 
	 });
	 
	 Button equip = new Button(mainWindowShell, SWT.PUSH); 
	 equip.setText("Display Equipment"); 
	 equip.setBounds(447, 208, 200, 30);
	 equip.setAlignment(SWT.CENTER);
	 equip.addSelectionListener(new SelectionListener() 
	 { 
	    @Override 
	    public void widgetSelected(SelectionEvent e) 
	    { 
	       // ===================================================== 
	   // on button press, create a child Shell object passing 
	   // the main Display. The child could also access the 
	   // display itself by calling Display.getDefault() 
	   // ===================================================== 
	   System.out.println("Creating database portal"); 
	       new equipmentShell(display); 
	    } 
	
	    @Override 
	    public void widgetDefaultSelected(SelectionEvent e) 
	    { 
	       widgetSelected(e); 
	    } 
	 });
	 
	 Button insco = new Button(mainWindowShell, SWT.PUSH); 
	 insco.setText("Display Insurance Companies"); 
	 insco.setBounds(447, 31, 200, 30);
	 insco.setAlignment(SWT.CENTER);
	 insco.addSelectionListener(new SelectionListener() 
	 { 
	    @Override 
	    public void widgetSelected(SelectionEvent e) 
	    { 
	       // ===================================================== 
	   // on button press, create a child Shell object passing 
	   // the main Display. The child could also access the 
	   // display itself by calling Display.getDefault() 
	   // ===================================================== 
	   System.out.println("Creating database portal"); 
	       new insuranceCoShell(display); 
	    } 
	
	    @Override 
	    public void widgetDefaultSelected(SelectionEvent e) 
	    { 
	       widgetSelected(e); 
	    } 
	 });
	 
	 Button dept = new Button(mainWindowShell, SWT.PUSH); 
	 dept.setText("Display Departments"); 
	 dept.setBounds(227, 208, 200, 30);
	 dept.setAlignment(SWT.CENTER);
	 dept.addSelectionListener(new SelectionListener() 
	 { 
	    @Override 
	    public void widgetSelected(SelectionEvent e) 
	    { 
	       // ===================================================== 
	   // on button press, create a child Shell object passing 
	   // the main Display. The child could also access the 
	   // display itself by calling Display.getDefault() 
	   // ===================================================== 
	   System.out.println("Creating database portal"); 
	       new departmentShell(display); 
	    } 
	
	    @Override 
	    public void widgetDefaultSelected(SelectionEvent e) 
	    { 
	       widgetSelected(e); 
	    } 
	 });
	 
	 Button inshol = new Button(mainWindowShell, SWT.PUSH); 
	 inshol.setText("Display Insurance Holders"); 
	 inshol.setBounds(670, 208, 200, 30);
	 inshol.setAlignment(SWT.CENTER);
	 inshol.addSelectionListener(new SelectionListener() 
	 { 
	    @Override 
	    public void widgetSelected(SelectionEvent e) 
	    { 
	       // ===================================================== 
	   // on button press, create a child Shell object passing 
	   // the main Display. The child could also access the 
	   // display itself by calling Display.getDefault() 
	   // ===================================================== 
	   System.out.println("Creating database portal"); 
	       new insuranceHolShell(display); 
	    } 
	
	    @Override 
	    public void widgetDefaultSelected(SelectionEvent e) 
	    { 
	       widgetSelected(e); 
	    } 
	 });
	 
	 Button newpat = new Button(mainWindowShell, SWT.PUSH); 
	 newpat.setText("New Patient"); 
	 newpat.setBounds(10, 67, 200, 30);
	 newpat.setAlignment(SWT.CENTER);
	 newpat.addSelectionListener(new SelectionListener() 
	 { 
	    @Override 
	    public void widgetSelected(SelectionEvent e) 
	    { 
	       // ===================================================== 
	   // on button press, create a child Shell object passing 
	   // the main Display. The child could also access the 
	   // display itself by calling Display.getDefault() 
	   // ===================================================== 
	   System.out.println("Creating database portal"); 
	       new newPatientShell(display); 
	    } 
	
	    @Override 
	    public void widgetDefaultSelected(SelectionEvent e) 
	    { 
	       widgetSelected(e); 
	    } 
	 });
	 
	 Button newdoc = new Button(mainWindowShell, SWT.PUSH); 
	 newdoc.setBounds(227, 67, 200, 30);
	 newdoc.setText("New Staff Member");
	 newdoc.setAlignment(SWT.CENTER);
	 newdoc.addSelectionListener(new SelectionListener() 
	 { 
	    @Override 
	    public void widgetSelected(SelectionEvent e) 
	    { 
	       // ===================================================== 
	   // on button press, create a child Shell object passing 
	   // the main Display. The child could also access the 
	   // display itself by calling Display.getDefault() 
	   // ===================================================== 
	   System.out.println("Creating database portal"); 
	       new newDoctorShell(display); 
	    } 
	
	    @Override 
	    public void widgetDefaultSelected(SelectionEvent e) 
	    { 
	       widgetSelected(e); 
	    } 
	 });
	 
	 Button newappt = new Button(mainWindowShell, SWT.PUSH); 
	 newappt.setText("New Appointment"); 
	 newappt.setBounds(670, 67, 200, 30);
	 newappt.setAlignment(SWT.CENTER);
	 newappt.addSelectionListener(new SelectionListener() 
	 { 
	    @Override 
	    public void widgetSelected(SelectionEvent e) 
	    { 
	       // ===================================================== 
	   // on button press, create a child Shell object passing 
	   // the main Display. The child could also access the 
	   // display itself by calling Display.getDefault() 
	   // ===================================================== 
	   System.out.println("Creating database portal"); 
	       new newAppointmentShell(display); 
	    } 
	
	    @Override 
	    public void widgetDefaultSelected(SelectionEvent e) 
	    { 
	       widgetSelected(e); 
	    } 
	 });
	 
	 Button newequip = new Button(mainWindowShell, SWT.PUSH); 
	 newequip.setText("New Equipment"); 
	 newequip.setBounds(447, 244, 200, 30);
	 newequip.setAlignment(SWT.CENTER);
	 newequip.addSelectionListener(new SelectionListener() 
	 { 
	    @Override 
	    public void widgetSelected(SelectionEvent e) 
	    { 
	       // ===================================================== 
	   // on button press, create a child Shell object passing 
	   // the main Display. The child could also access the 
	   // display itself by calling Display.getDefault() 
	   // ===================================================== 
	   System.out.println("Creating database portal"); 
	       new newEquipmentShell(display); 
	    } 
	
	    @Override 
	    public void widgetDefaultSelected(SelectionEvent e) 
	    { 
	       widgetSelected(e); 
	    } 
	 });
	 
	 Button newdept = new Button(mainWindowShell, SWT.PUSH); 
	 newdept.setText("New Department"); 
	 newdept.setBounds(227, 244, 200, 30);
	 newdept.setAlignment(SWT.CENTER);
	 newdept.addSelectionListener(new SelectionListener() 
	 { 
	    @Override 
	    public void widgetSelected(SelectionEvent e) 
	    { 
	       // ===================================================== 
	   // on button press, create a child Shell object passing 
	   // the main Display. The child could also access the 
	   // display itself by calling Display.getDefault() 
	   // ===================================================== 
	   System.out.println("Creating database portal"); 
	       new newDepartmentShell(display); 
	    } 
	
	    @Override 
	    public void widgetDefaultSelected(SelectionEvent e) 
	    { 
	       widgetSelected(e); 
	    } 
	 });
	 
	 Button newroom = new Button(mainWindowShell, SWT.PUSH); 
	 newroom.setText("New Room"); 
	 newroom.setBounds(10, 244, 200, 30);
	 newroom.setAlignment(SWT.CENTER);
	 newroom.addSelectionListener(new SelectionListener() 
	 { 
	    @Override 
	    public void widgetSelected(SelectionEvent e) 
	    { 
	       // ===================================================== 
	   // on button press, create a child Shell object passing 
	   // the main Display. The child could also access the 
	   // display itself by calling Display.getDefault() 
	   // ===================================================== 
	   System.out.println("Creating database portal"); 
	       new newRoomShell(display); 
	    } 
	
	    @Override 
	    public void widgetDefaultSelected(SelectionEvent e) 
	    { 
	       widgetSelected(e); 
	    } 
	 });
	 
	 Button newinsco = new Button(mainWindowShell, SWT.PUSH); 
	 newinsco.setText("New Insurance Company"); 
	 newinsco.setBounds(447, 67, 200, 30);
	 newinsco.setAlignment(SWT.CENTER);
	 newinsco.addSelectionListener(new SelectionListener() 
	 { 
	    @Override 
	    public void widgetSelected(SelectionEvent e) 
	    { 
	       // ===================================================== 
	   // on button press, create a child Shell object passing 
	   // the main Display. The child could also access the 
	   // display itself by calling Display.getDefault() 
	   // ===================================================== 
	   System.out.println("Creating database portal"); 
	       new newInsuranceCoShell(display); 
	    } 
	
	    @Override 
	    public void widgetDefaultSelected(SelectionEvent e) 
	    { 
	       widgetSelected(e); 
	    } 
	 });
	 
	 Button newinshol = new Button(mainWindowShell, SWT.PUSH); 
	 newinshol.setText("New Insurance Holder"); 
	 newinshol.setBounds(670, 244, 200, 30);
	 newinshol.setAlignment(SWT.CENTER);
	 newinshol.addSelectionListener(new SelectionListener() 
	 { 
	    @Override 
	    public void widgetSelected(SelectionEvent e) 
	    { 
	       // ===================================================== 
	   // on button press, create a child Shell object passing 
	   // the main Display. The child could also access the 
	   // display itself by calling Display.getDefault() 
	   // ===================================================== 
	   System.out.println("Creating database portal"); 
	       new newInsuranceHolShell(display); 
	    } 
	
	    @Override 
	    public void widgetDefaultSelected(SelectionEvent e) 
	    { 
	       widgetSelected(e); 
	    } 
	 });
	 
	 Button editpat = new Button(mainWindowShell, SWT.PUSH); 
	 editpat.setText("Edit Patient"); 
	 editpat.setBounds(10, 139, 200, 30);
	 editpat.setAlignment(SWT.CENTER);
	 editpat.addSelectionListener(new SelectionListener() 
	 { 
	    @Override 
	    public void widgetSelected(SelectionEvent e) 
	    { 
	       // ===================================================== 
	   // on button press, create a child Shell object passing 
	   // the main Display. The child could also access the 
	   // display itself by calling Display.getDefault() 
	   // ===================================================== 
	   System.out.println("Creating database portal"); 
	       new editPatientShell(display); 
	    } 
	
	    @Override 
	    public void widgetDefaultSelected(SelectionEvent e) 
	    { 
	       widgetSelected(e); 
	    } 
	 });
	 
	 Button editdoc = new Button(mainWindowShell, SWT.PUSH); 
	 editdoc.setBounds(227, 139, 200, 30);
	 editdoc.setText("Edit Staff Member");
	 editdoc.setAlignment(SWT.CENTER);
	 editdoc.addSelectionListener(new SelectionListener() 
	 { 
	    @Override 
	    public void widgetSelected(SelectionEvent e) 
	    { 
	       // ===================================================== 
	   // on button press, create a child Shell object passing 
	   // the main Display. The child could also access the 
	   // display itself by calling Display.getDefault() 
	   // ===================================================== 
	   System.out.println("Creating database portal"); 
	       new editDoctorShell(display); 
	    } 
	
	    @Override 
	    public void widgetDefaultSelected(SelectionEvent e) 
	    { 
	       widgetSelected(e); 
	    } 
	 });
	 
	 Button editappt = new Button(mainWindowShell, SWT.PUSH); 
	 editappt.setText("Edit Appointment"); 
	 editappt.setBounds(670, 139, 200, 30);
	 editappt.setAlignment(SWT.CENTER);
	 editappt.addSelectionListener(new SelectionListener() 
	 { 
	    @Override 
	    public void widgetSelected(SelectionEvent e) 
	    { 
	       // ===================================================== 
	   // on button press, create a child Shell object passing 
	   // the main Display. The child could also access the 
	   // display itself by calling Display.getDefault() 
	   // ===================================================== 
	   System.out.println("Creating database portal"); 
	       new editAppointmentShell(display); 
	    } 
	
	    @Override 
	    public void widgetDefaultSelected(SelectionEvent e) 
	    { 
	       widgetSelected(e); 
	    } 
	 });
	 
	 Button editequip = new Button(mainWindowShell, SWT.PUSH); 
	 editequip.setText("Edit Equipment"); 
	 editequip.setBounds(447, 316, 200, 30);
	 editequip.setAlignment(SWT.CENTER);
	 editequip.addSelectionListener(new SelectionListener() 
	 { 
	    @Override 
	    public void widgetSelected(SelectionEvent e) 
	    { 
	       // ===================================================== 
	   // on button press, create a child Shell object passing 
	   // the main Display. The child could also access the 
	   // display itself by calling Display.getDefault() 
	   // ===================================================== 
	   System.out.println("Creating database portal"); 
	       new editEquipmentShell(display); 
	    } 
	
	    @Override 
	    public void widgetDefaultSelected(SelectionEvent e) 
	    { 
	       widgetSelected(e); 
	    } 
	 });
	 
	 Button editdept = new Button(mainWindowShell, SWT.PUSH); 
	 editdept.setText("Edit Department"); 
	 editdept.setBounds(227, 316, 200, 30);
	 editdept.setAlignment(SWT.CENTER);
	 editdept.addSelectionListener(new SelectionListener() 
	 { 
	    @Override 
	    public void widgetSelected(SelectionEvent e) 
	    { 
	       // ===================================================== 
	   // on button press, create a child Shell object passing 
	   // the main Display. The child could also access the 
	   // display itself by calling Display.getDefault() 
	   // ===================================================== 
	   System.out.println("Creating database portal"); 
	       new editDepartmentShell(display); 
	    } 
	
	    @Override 
	    public void widgetDefaultSelected(SelectionEvent e) 
	    { 
	       widgetSelected(e); 
	    } 
	 });
	 
	 Button editroom = new Button(mainWindowShell, SWT.PUSH); 
	 editroom.setText("Edit Room"); 
	 editroom.setBounds(10, 316, 200, 30);
	 editroom.setAlignment(SWT.CENTER);
	 editroom.addSelectionListener(new SelectionListener() 
	 { 
	    @Override 
	    public void widgetSelected(SelectionEvent e) 
	    { 
	       // ===================================================== 
	   // on button press, create a child Shell object passing 
	   // the main Display. The child could also access the 
	   // display itself by calling Display.getDefault() 
	   // ===================================================== 
	   System.out.println("Creating database portal"); 
	       new editRoomShell(display); 
	    } 
	
	    @Override 
	    public void widgetDefaultSelected(SelectionEvent e) 
	    { 
	       widgetSelected(e); 
	    } 
	 });
	 
	 Button editinsco = new Button(mainWindowShell, SWT.PUSH); 
	 editinsco.setText("Edit Insurance Company"); 
	 editinsco.setBounds(447, 139, 200, 30);
	 editinsco.setAlignment(SWT.CENTER);
	 editinsco.addSelectionListener(new SelectionListener() 
	 { 
	    @Override 
	    public void widgetSelected(SelectionEvent e) 
	    { 
	       // ===================================================== 
	   // on button press, create a child Shell object passing 
	   // the main Display. The child could also access the 
	   // display itself by calling Display.getDefault() 
	   // ===================================================== 
	   System.out.println("Creating database portal"); 
	       new editInsuranceCoShell(display); 
	    } 
	
	    @Override 
	    public void widgetDefaultSelected(SelectionEvent e) 
	    { 
	       widgetSelected(e); 
	    } 
	 });
	 
	 Button editinshol = new Button(mainWindowShell, SWT.PUSH); 
	 editinshol.setText("Edit Insurance Holder"); 
	 editinshol.setBounds(670, 316, 200, 30);
	 editinshol.setAlignment(SWT.CENTER);
	 editinshol.addSelectionListener(new SelectionListener() 
	 { 
	    @Override 
	    public void widgetSelected(SelectionEvent e) 
	    { 
	       // ===================================================== 
	   // on button press, create a child Shell object passing 
	   // the main Display. The child could also access the 
	   // display itself by calling Display.getDefault() 
	   // ===================================================== 
	   System.out.println("Creating database portal"); 
	       new editInsuranceHolShell(display); 
	    } 
	
	    @Override 
	    public void widgetDefaultSelected(SelectionEvent e) 
	    { 
	       widgetSelected(e); 
	    } 
	 });
	 
	 Button delpat = new Button(mainWindowShell, SWT.PUSH); 
	 delpat.setText("Delete Patient"); 
	 delpat.setBounds(10, 103, 200, 30);
	 delpat.setAlignment(SWT.CENTER);
	 delpat.addSelectionListener(new SelectionListener() 
	 { 
	    @Override 
	    public void widgetSelected(SelectionEvent e) 
	    { 
	       // ===================================================== 
	   // on button press, create a child Shell object passing 
	   // the main Display. The child could also access the 
	   // display itself by calling Display.getDefault() 
	   // ===================================================== 
	   System.out.println("Creating database portal"); 
	       new deletePatientShell(display); 
	    } 
	
	    @Override 
	    public void widgetDefaultSelected(SelectionEvent e) 
	    { 
	       widgetSelected(e); 
	    } 
	 });
	 
	 Button deldoc = new Button(mainWindowShell, SWT.PUSH); 
	 deldoc.setBounds(227, 103, 200, 30);
	 deldoc.setText("Delete Staff Member");
	 deldoc.setAlignment(SWT.CENTER);
	 deldoc.addSelectionListener(new SelectionListener() 
	 { 
	    @Override 
	    public void widgetSelected(SelectionEvent e) 
	    { 
	       // ===================================================== 
	   // on button press, create a child Shell object passing 
	   // the main Display. The child could also access the 
	   // display itself by calling Display.getDefault() 
	   // ===================================================== 
	   System.out.println("Creating database portal"); 
	       new deleteDoctorShell(display); 
	    } 
	
	    @Override 
	    public void widgetDefaultSelected(SelectionEvent e) 
	    { 
	       widgetSelected(e); 
	    } 
	 });
	 
	 Button delappt = new Button(mainWindowShell, SWT.PUSH); 
	 delappt.setText("Delete Appointment"); 
	 delappt.setBounds(670, 103, 200, 30);
	 delappt.setAlignment(SWT.CENTER);
	 delappt.addSelectionListener(new SelectionListener() 
	 { 
	    @Override 
	    public void widgetSelected(SelectionEvent e) 
	    { 
	       // ===================================================== 
	   // on button press, create a child Shell object passing 
	   // the main Display. The child could also access the 
	   // display itself by calling Display.getDefault() 
	   // ===================================================== 
	   System.out.println("Creating database portal"); 
	       new deleteAppointmentShell(display); 
	    } 
	
	    @Override 
	    public void widgetDefaultSelected(SelectionEvent e) 
	    { 
	       widgetSelected(e); 
	    } 
	 });
	 
	 Button delequip = new Button(mainWindowShell, SWT.PUSH); 
	 delequip.setText("Delete Equipment"); 
	 delequip.setBounds(447, 280, 200, 30);
	 delequip.setAlignment(SWT.CENTER);
	 delequip.addSelectionListener(new SelectionListener() 
	 { 
	    @Override 
	    public void widgetSelected(SelectionEvent e) 
	    { 
	       // ===================================================== 
	   // on button press, create a child Shell object passing 
	   // the main Display. The child could also access the 
	   // display itself by calling Display.getDefault() 
	   // ===================================================== 
	   System.out.println("Creating database portal"); 
	       new deleteEquipmentShell(display); 
	    } 
	
	    @Override 
	    public void widgetDefaultSelected(SelectionEvent e) 
	    { 
	       widgetSelected(e); 
	    } 
	 });
	 
	 Button deldept = new Button(mainWindowShell, SWT.PUSH); 
	 deldept.setText("Delete Department"); 
	 deldept.setBounds(227, 280, 200, 30);
	 deldept.setAlignment(SWT.CENTER);
	 deldept.addSelectionListener(new SelectionListener() 
	 { 
	    @Override 
	    public void widgetSelected(SelectionEvent e) 
	    { 
	       // ===================================================== 
	   // on button press, create a child Shell object passing 
	   // the main Display. The child could also access the 
	   // display itself by calling Display.getDefault() 
	   // ===================================================== 
	   System.out.println("Creating database portal"); 
	       new deleteDepartmentShell(display); 
	    } 
	
	    @Override 
	    public void widgetDefaultSelected(SelectionEvent e) 
	    { 
	       widgetSelected(e); 
	    } 
	 });
	 
	 Button delroom = new Button(mainWindowShell, SWT.PUSH); 
	 delroom.setText("Delete Room"); 
	 delroom.setBounds(10, 280, 200, 30);
	 delroom.setAlignment(SWT.CENTER);
	 delroom.addSelectionListener(new SelectionListener() 
	 { 
	    @Override 
	    public void widgetSelected(SelectionEvent e) 
	    { 
	       // ===================================================== 
	   // on button press, create a child Shell object passing 
	   // the main Display. The child could also access the 
	   // display itself by calling Display.getDefault() 
	   // ===================================================== 
	   System.out.println("Creating database portal"); 
	       new deleteRoomShell(display); 
	    } 
	
	    @Override 
	    public void widgetDefaultSelected(SelectionEvent e) 
	    { 
	       widgetSelected(e); 
	    } 
	 });
	 
	 Button delinsco = new Button(mainWindowShell, SWT.PUSH); 
	 delinsco.setText("Delete Insurance Company"); 
	 delinsco.setBounds(447, 103, 200, 30);
	 delinsco.setAlignment(SWT.CENTER);
	 delinsco.addSelectionListener(new SelectionListener() 
	 { 
	    @Override 
	    public void widgetSelected(SelectionEvent e) 
	    { 
	       // ===================================================== 
	   // on button press, create a child Shell object passing 
	   // the main Display. The child could also access the 
	   // display itself by calling Display.getDefault() 
	   // ===================================================== 
	   System.out.println("Creating database portal"); 
	       new deleteInsuranceCoShell(display); 
	    } 
	
	    @Override 
	    public void widgetDefaultSelected(SelectionEvent e) 
	    { 
	       widgetSelected(e); 
	    } 
	 });
	 
	 Button delinshol = new Button(mainWindowShell, SWT.PUSH); 
	 delinshol.setText("Delete Insurance Holder"); 
	 delinshol.setBounds(670, 280, 200, 30);
	 delinshol.setAlignment(SWT.CENTER);
	 delinshol.addSelectionListener(new SelectionListener() 
	 { 
	    @Override 
	    public void widgetSelected(SelectionEvent e) 
	    { 
	       // ===================================================== 
	   // on button press, create a child Shell object passing 
	   // the main Display. The child could also access the 
	   // display itself by calling Display.getDefault() 
	   // ===================================================== 
	   System.out.println("Creating database portal"); 
	       new deleteInsuranceHolShell(display); 
	    } 
	
	    @Override 
	    public void widgetDefaultSelected(SelectionEvent e) 
	    { 
	       widgetSelected(e); 
	    } 
	 });
	 
	 // ============================================================= 
	 // Register a listener for the Close event on the main Shell. 
	 // This disposes the Display which will cause the entire child 
	 // tree to dispose 
	 // ============================================================= 
	 mainWindowShell.addListener(SWT.Close, new Listener() 
	 { 
	    @Override 
	    public void handleEvent(Event event) 
	    { 
	       System.out.println("Closing database portal"); 
	       display.dispose(); 
	    } 
	 }); 
	
	 // ================================ 
	 // Set size on main Shell and open 
	 // ================================ 
	 mainWindowShell.setSize(892, 386); 
	 mainWindowShell.open(); 
	
	 // center main shell
	 centerWindow(mainWindowShell);
	 
	 Label lblPatients = new Label(mainWindowShell, SWT.NONE);
	 lblPatients.setAlignment(SWT.CENTER);
	 lblPatients.setBounds(85, 10, 55, 15);
	 lblPatients.setText("Patients");
	 
	 Label label = new Label(mainWindowShell, SWT.SEPARATOR | SWT.HORIZONTAL);
	 label.setBounds(14, 10, 74, 15);
	 
	 Label label_1 = new Label(mainWindowShell, SWT.SEPARATOR | SWT.HORIZONTAL);
	 label_1.setBounds(146, 10, 64, 15);
	 
	 Label label_2 = new Label(mainWindowShell, SWT.SEPARATOR | SWT.HORIZONTAL);
	 label_2.setBounds(231, 10, 74, 15);
	 
	 Label lblStaff = new Label(mainWindowShell, SWT.NONE);
	 lblStaff.setAlignment(SWT.CENTER);
	 lblStaff.setText("Staff");
	 lblStaff.setBounds(302, 10, 55, 15);
	 
	 Label label_4 = new Label(mainWindowShell, SWT.SEPARATOR | SWT.HORIZONTAL);
	 label_4.setBounds(363, 10, 64, 15);
	 
	 Label label_3 = new Label(mainWindowShell, SWT.SEPARATOR | SWT.HORIZONTAL);
	 label_3.setBounds(606, 10, 41, 15);
	 
	 Label lblInsurance = new Label(mainWindowShell, SWT.NONE);
	 lblInsurance.setText("Insurance Companies");
	 lblInsurance.setAlignment(SWT.CENTER);
	 lblInsurance.setBounds(486, 10, 124, 15);
	 
	 Label label_6 = new Label(mainWindowShell, SWT.SEPARATOR | SWT.HORIZONTAL);
	 label_6.setBounds(447, 10, 41, 15);
	 
	 Label label_5 = new Label(mainWindowShell, SWT.SEPARATOR | SWT.VERTICAL);
	 label_5.setBounds(218, 24, 5, 330);
	 
	 Label label_7 = new Label(mainWindowShell, SWT.SEPARATOR);
	 label_7.setBounds(435, 24, 6, 330);
	 
	 Label label_8 = new Label(mainWindowShell, SWT.SEPARATOR);
	 label_8.setBounds(657, 24, 5, 330);
	 
	 Label label_9 = new Label(mainWindowShell, SWT.SEPARATOR | SWT.HORIZONTAL);
	 label_9.setBounds(665, 10, 55, 15);
	 
	 Label lblAppointments = new Label(mainWindowShell, SWT.NONE);
	 lblAppointments.setText("Appointments");
	 lblAppointments.setAlignment(SWT.CENTER);
	 lblAppointments.setBounds(724, 10, 93, 15);
	 
	 Label label_11 = new Label(mainWindowShell, SWT.SEPARATOR | SWT.HORIZONTAL);
	 label_11.setBounds(810, 10, 55, 15);
	 
	 Label label_10 = new Label(mainWindowShell, SWT.SEPARATOR | SWT.HORIZONTAL);
	 label_10.setBounds(146, 187, 64, 15);
	 
	 Label lblRooms = new Label(mainWindowShell, SWT.NONE);
	 lblRooms.setText("Rooms");
	 lblRooms.setAlignment(SWT.CENTER);
	 lblRooms.setBounds(85, 187, 55, 15);
	 
	 Label label_13 = new Label(mainWindowShell, SWT.SEPARATOR | SWT.HORIZONTAL);
	 label_13.setBounds(14, 187, 74, 15);
	 
	 Label label_14 = new Label(mainWindowShell, SWT.SEPARATOR | SWT.HORIZONTAL);
	 label_14.setBounds(359, 187, 64, 15);
	 
	 Label lblDepartments = new Label(mainWindowShell, SWT.NONE);
	 lblDepartments.setText("Departments");
	 lblDepartments.setAlignment(SWT.CENTER);
	 lblDepartments.setBounds(286, 187, 74, 15);
	 
	 Label label_16 = new Label(mainWindowShell, SWT.SEPARATOR | SWT.HORIZONTAL);
	 label_16.setBounds(227, 187, 55, 15);
	 
	 Label label_17 = new Label(mainWindowShell, SWT.SEPARATOR | SWT.HORIZONTAL);
	 label_17.setBounds(583, 187, 64, 15);
	 
	 Label lblEquipment = new Label(mainWindowShell, SWT.NONE);
	 lblEquipment.setText("Equipment");
	 lblEquipment.setAlignment(SWT.CENTER);
	 lblEquipment.setBounds(513, 187, 64, 15);
	 
	 Label label_19 = new Label(mainWindowShell, SWT.SEPARATOR | SWT.HORIZONTAL);
	 label_19.setBounds(451, 187, 55, 15);
	 
	 Label lblInsuranceHolders = new Label(mainWindowShell, SWT.NONE);
	 lblInsuranceHolders.setText("Insurance Holders");
	 lblInsuranceHolders.setAlignment(SWT.CENTER);
	 lblInsuranceHolders.setBounds(709, 187, 124, 15);
	 
	 Label label_15 = new Label(mainWindowShell, SWT.SEPARATOR | SWT.HORIZONTAL);
	 label_15.setBounds(670, 187, 41, 15);
	 
	 Label label_18 = new Label(mainWindowShell, SWT.SEPARATOR | SWT.HORIZONTAL);
	 label_18.setBounds(829, 187, 41, 15);
	
	 // ===================================== 
	 // Main UI event dispatch loop 
	 // that handles all UI events from all 
	 // SWT components created as children of 
	 // the main Display object 
	 // ===================================== 
	 while (!display.isDisposed()) 
	 { 
	    // =================================================== 
	// Wrap each event dispatch in an exception handler 
	// so that if any event causes an exception it does 
	// not break the main UI loop 
	// =================================================== 
	    try 
	    { 
	       if (!display.readAndDispatch()) 
	       { 
	          display.sleep(); 
	       } 
	    } 
	    catch (Exception e) 
	    { 
	       e.printStackTrace(); 
	    } 
	 } 
	
	 System.out.println("Closing database"); 
  } 

  public static void main(String[] args) 
  { 
     new DatabaseUI(); 
  } 
  
  private void centerWindow(Shell shell) {

      Rectangle bds = shell.getDisplay().getBounds();

      Point p = shell.getSize();

      int nLeft = (bds.width - p.x) / 2;
      int nTop = (bds.height - p.y) / 2;

      shell.setBounds(nLeft, nTop, p.x, p.y);
  }
  
  class doctor {
	  
	  private String first_name;
	  private String last_name;
	  private Integer doc_ID;
	  private String specialty;
	  private Integer dept_ID;
	  private Integer phone_no;
	  private String email;
	  
	  public doctor (Integer doc_ID, String first_name, String last_name, String specialty,
			  Integer dept_ID, Integer phone_no, String email){
		  
		  this.doc_ID = doc_ID;
		  this.first_name = first_name;
		  this.last_name = last_name;
		  this.specialty = specialty;
		  this.dept_ID = dept_ID;
		  this.phone_no = phone_no;
		  this.email = email;
	  }
  
	  public Integer getDocID() {
		  return doc_ID;
	  }
	  public String getFirstName() {
		  return first_name;
	  }
	  public String getLastName() {
		  return last_name;
	  }
	  public String getSpecialty() {
		  return specialty;
	  }
	  public Integer getDeptID() {
		  return dept_ID;
	  }
	  public Integer getPhoneNo() {
		  return phone_no;
	  }
	  public String getEmail() {
		  return email;
	  }
  }
  
  class patient {
		
		private Integer pat_id;
		private Integer appt_id;
		private String first_name;
		private String last_name;
		private Integer birthdate;
		private String address;
		private String email;
		private Integer phone_no;
		private Integer ins_id;
		private Integer holder_id;
		
		public patient (Integer pat_id, Integer appt_id, String first_name,
		String last_name, Integer birthdate, String address, String email,
		Integer phone_no, Integer ins_id, Integer holder_id) {
			this.pat_id = pat_id;
			this.appt_id = appt_id;
			this.first_name = first_name;
			this.last_name = last_name;
			this.birthdate = birthdate;
			this.address = address;
			this.email = email;
			this.phone_no = phone_no;
			this.ins_id = ins_id;
			this.holder_id = holder_id;
		}
		
		public Integer getPatID(){
			return pat_id;
		}
		public Integer getApptID(){
			return appt_id;
		}
		public String getFirstName(){
			return first_name;
		}
		public String getLastName(){
			return last_name;
		}
		public Integer getBirthdate(){
			return birthdate;
		}
		public String getAddress(){
			return address;
		}
		public String getEmail(){
			return email;
		}
		public Integer getPhoneNo(){
			return phone_no;
		}
		public Integer getInsID(){
			return ins_id;
		}
		public Integer getHolderID(){
			return holder_id;
		}
	}
  
  class appointment {
		
		private Integer appt_id;
		private Integer entry_date;
		private Integer exit_date;
		private String diagnosis;
		private Integer room_id;
		private Integer doc_id;
		
		public appointment (Integer appt_id, Integer entry_date, Integer exit_date,
		String diagnosis, Integer room_id, Integer doc_id) {
			this.appt_id = appt_id;
			this.entry_date = entry_date;
			this.exit_date = exit_date;
			this.diagnosis = diagnosis;
			this.room_id = room_id;
			this.doc_id = doc_id;
		}
		
		public Integer getApptID(){
			return appt_id;
		}
		public Integer getEntryDate(){
			return entry_date;
		}
		public Integer getExitDate(){
			return exit_date;
		}
		public String getDiagnosis(){
			return diagnosis;
		}
		public Integer getRoomID(){
			return room_id;
		}
		public Integer getDocID(){
			return doc_id;
		}
	}
  
  class room {
		
		private Integer room_id;
		private Integer beds_available;
		private Integer num_patients;
		private Integer dept_id;
		
		public room (Integer room_id, Integer beds_available, Integer num_patients, Integer dept_id) {
			this.room_id = room_id;
			this.beds_available = beds_available;
			this.num_patients = num_patients;
			this.dept_id = dept_id;
		}
		
		public Integer getRoomID(){
			return room_id;
		}
		public Integer getBedsAvailable(){
			return beds_available;
		}
		public Integer getNumPatients(){
			return num_patients;
		}
		public Integer getDeptID(){
			return dept_id;
		}
	}
  
  class equipment {
		
		private Integer equipment_id;
		private Integer room_id;
		private String name;
		
		public equipment (Integer equipment_id, Integer room_id, String name) {
			this.equipment_id = equipment_id;
			this.room_id = room_id;
			this.name = name;
		}
		
		public Integer getEquipmentID(){
			return equipment_id;
		}
		public Integer getRoomID(){
			return room_id;
		}
		public String getName(){
			return name;
		}
	}
  
  class insuranceCompany {
		
		private Integer co_id;
		private String ins_name;
		private String address;
		private Integer phone_no;
		
		public insuranceCompany (Integer co_id, String ins_name, String address, Integer phone_no) {
			this.co_id = co_id;
			this.ins_name = ins_name;
			this.address = address;
			this.phone_no = phone_no;
		}
		
		public Integer getCompanyID(){
			return co_id;
		}
		public String getInsName(){
			return ins_name;
		}
		public String getAddress(){
			return address;
		}
		public Integer getPhoneNumber(){
			return phone_no;
		}
  }
  
  class department {
		
		private Integer dept_id;
		private Integer rooms_available;
		private Integer rooms;
		private Integer floor_no;
		
		public department (Integer dept_id, Integer rooms_available, Integer rooms, Integer floor_no) {
			this.dept_id = dept_id;
			this.rooms_available = rooms_available;
			this.floor_no = floor_no;
			this.rooms = rooms;
		}
		
		public Integer getDeptID(){
			return dept_id;
		}
		public Integer getRoomsAvailable(){
			return rooms_available;
		}
		public Integer getFloorNo(){
			return floor_no;
		}
		public Integer getRooms(){
			return rooms;
		}
	}
  
  class insuranceHolder {
		
		private Integer holder_id;
		private String first_name;
		private String last_name;
		private Integer co_id;
		private Integer group_no;
		private Integer exp_date;
		
		public insuranceHolder (Integer holder_id, String first_name, String last_name,
				Integer co_id, Integer group_no, Integer exp_date) {
			
			this.holder_id = holder_id;
			this.first_name = first_name;
			this.last_name = last_name;
			this.co_id = co_id;
			this.group_no = group_no;
			this.exp_date = exp_date;
		}
		
		public Integer getHolderID(){
			return holder_id;
		}
		public String getFirstName(){
			return first_name;
		}
		public String getLastName(){
			return last_name;
		}
		public Integer getCoID(){
			return co_id;
		}
		public Integer getGroupNo(){
			return group_no;
		}
		public Integer getExpDate(){
			return exp_date;
		}
	}
  
	private void createEditPatientContents(Composite composite) {

		patientIDtxt = new Text(composite, SWT.BORDER);
		patientIDtxt.setBounds(10, 13, 50, 21);

		lblPatientID = new Label(composite, SWT.CENTER);
		lblPatientID.setText("Patient ID");
		lblPatientID.setBounds(10, 13, 55, 15);

		appointmentIDtxt = new Text(composite, SWT.BORDER);
		appointmentIDtxt.setBounds(110, 37, 50, 21);

		lblAppointmentID = new Label(composite, SWT.CENTER);
		lblAppointmentID.setText("Appointment ID");
		lblAppointmentID.setBounds(10, 40, 92, 15);

		firstNametxt = new Text(composite, SWT.BORDER);
		firstNametxt.setBounds(110, 64, 50, 21);

		lblFirstName = new Label(composite, SWT.CENTER);
		lblFirstName.setText("First Name");
		lblFirstName.setBounds(10, 67, 65, 15);

		lastNametxt = new Text(composite, SWT.BORDER);
		lastNametxt.setBounds(110, 91, 50, 21);

		lblLastName = new Label(composite, SWT.CENTER);
		lblLastName.setText("Last Name");
		lblLastName.setBounds(10, 94, 65, 15);

		phoneNumbertxt = new Text(composite, SWT.BORDER);
		phoneNumbertxt.setBounds(110, 118, 50, 21);

		lblBirthdate = new Label(composite, SWT.CENTER);
		lblBirthdate.setText("Birthdate");
		lblBirthdate.setBounds(10, 121, 55, 15);

		birthdatetxt = new Text(composite, SWT.BORDER);
		birthdatetxt.setBounds(110, 145, 50, 21);

		lblAddress = new Label(composite, SWT.CENTER);
		lblAddress.setText("Address");
		lblAddress.setBounds(10, 148, 55, 15);

		addresstxt = new Text(composite, SWT.BORDER);
		addresstxt.setBounds(110, 172, 50, 21);

		lblEmail = new Label(composite, SWT.CENTER);
		lblEmail.setText("E-Mail");
		lblEmail.setBounds(10, 175, 55, 15);

		emailtxt = new Text(composite, SWT.BORDER);
		emailtxt.setBounds(110, 199, 50, 21);

		lblPhoneNumber = new Label(composite, SWT.CENTER);
		lblPhoneNumber.setText("Phone Number");
		lblPhoneNumber.setBounds(10, 202, 92, 15);

		insuranceIDtxt = new Text(composite, SWT.BORDER);
		insuranceIDtxt.setBounds(110, 226, 50, 21);

		lblInsuranceID = new Label(composite, SWT.CENTER);
		lblInsuranceID.setText("Insurance ID");
		lblInsuranceID.setBounds(10, 229, 76, 15);

		holderIDtxt = new Text(composite, SWT.BORDER);
		holderIDtxt.setBounds(110, 253, 50, 21);

		lblHolderID = new Label(composite, SWT.CENTER);
		lblHolderID.setText("Holder ID");
		lblHolderID.setBounds(10, 256, 55, 15);

		Button enter = new Button(composite, SWT.PUSH);
		enter.setText("Enter");
		enter.setAlignment(SWT.CENTER);
		enter.setBounds(36, 290, 150, 20);
		enter.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {

				patID = patientIDtxt.getText();
				apptID = appointmentIDtxt.getText();
				fName = firstNametxt.getText();
				lName = lastNametxt.getText();
				bDay = birthdatetxt.getText();
				addy = addresstxt.getText();
				email = emailtxt.getText();
				phoNo = phoneNumbertxt.getText();
				insID = insuranceIDtxt.getText();
				holID = holderIDtxt.getText();

				if (patID.isEmpty() || apptID.isEmpty() || fName.isEmpty() || lName.isEmpty() || bDay.isEmpty()
						|| addy.isEmpty() || email.isEmpty() || phoNo.isEmpty() || insID.isEmpty() || holID.isEmpty()) {
					System.out.println("There is an empty data field.");
				} else {
					System.out.println("\npatID: " + patID);
					System.out.println("apptID: " + apptID);
					System.out.println("fName : " + fName);
					System.out.println("lName : " + lName);
					System.out.println("bDay : " + bDay);
					System.out.println("addy : " + addy);
					System.out.println("email : " + email);
					System.out.println("phoNo : " + phoNo);
					System.out.println("insID : " + insID);
					System.out.println("holID : " + holID);
				}
			}
		});
	}

	private void createEditDoctorContents(Composite composite) {

		patientIDtxt = new Text(composite, SWT.BORDER);
		patientIDtxt.setBounds(10, 13, 50, 21);

		lblPatientID = new Label(composite, SWT.CENTER);
		lblPatientID.setText("Patient ID");
		lblPatientID.setBounds(10, 13, 55, 15);

		appointmentIDtxt = new Text(composite, SWT.BORDER);
		appointmentIDtxt.setBounds(110, 37, 50, 21);

		lblAppointmentID = new Label(composite, SWT.CENTER);
		lblAppointmentID.setText("Appointment ID");
		lblAppointmentID.setBounds(10, 40, 92, 15);

		firstNametxt = new Text(composite, SWT.BORDER);
		firstNametxt.setBounds(110, 64, 50, 21);

		lblFirstName = new Label(composite, SWT.CENTER);
		lblFirstName.setText("First Name");
		lblFirstName.setBounds(10, 67, 65, 15);

		lastNametxt = new Text(composite, SWT.BORDER);
		lastNametxt.setBounds(110, 91, 50, 21);

		lblLastName = new Label(composite, SWT.CENTER);
		lblLastName.setText("Last Name");
		lblLastName.setBounds(10, 94, 65, 15);

		phoneNumbertxt = new Text(composite, SWT.BORDER);
		phoneNumbertxt.setBounds(110, 118, 50, 21);

		lblBirthdate = new Label(composite, SWT.CENTER);
		lblBirthdate.setText("Birthdate");
		lblBirthdate.setBounds(10, 121, 55, 15);

		birthdatetxt = new Text(composite, SWT.BORDER);
		birthdatetxt.setBounds(110, 145, 50, 21);

		lblAddress = new Label(composite, SWT.CENTER);
		lblAddress.setText("Address");
		lblAddress.setBounds(10, 148, 55, 15);

		addresstxt = new Text(composite, SWT.BORDER);
		addresstxt.setBounds(110, 172, 50, 21);

		lblEmail = new Label(composite, SWT.CENTER);
		lblEmail.setText("E-Mail");
		lblEmail.setBounds(10, 175, 55, 15);

		emailtxt = new Text(composite, SWT.BORDER);
		emailtxt.setBounds(110, 199, 50, 21);

		lblPhoneNumber = new Label(composite, SWT.CENTER);
		lblPhoneNumber.setText("Phone Number");
		lblPhoneNumber.setBounds(10, 202, 92, 15);

		insuranceIDtxt = new Text(composite, SWT.BORDER);
		insuranceIDtxt.setBounds(110, 226, 50, 21);

		lblInsuranceID = new Label(composite, SWT.CENTER);
		lblInsuranceID.setText("Insurance ID");
		lblInsuranceID.setBounds(10, 229, 76, 15);

		holderIDtxt = new Text(composite, SWT.BORDER);
		holderIDtxt.setBounds(110, 253, 50, 21);

		lblHolderID = new Label(composite, SWT.CENTER);
		lblHolderID.setText("Holder ID");
		lblHolderID.setBounds(10, 256, 55, 15);

		Button enter = new Button(composite, SWT.PUSH);
		enter.setText("Enter");
		enter.setAlignment(SWT.CENTER);
		enter.setBounds(36, 290, 150, 20);
		enter.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {

				patID = patientIDtxt.getText();
				apptID = appointmentIDtxt.getText();
				fName = firstNametxt.getText();
				lName = lastNametxt.getText();
				bDay = birthdatetxt.getText();
				addy = addresstxt.getText();
				email = emailtxt.getText();
				phoNo = phoneNumbertxt.getText();
				insID = insuranceIDtxt.getText();
				holID = holderIDtxt.getText();

				if (patID.isEmpty() || apptID.isEmpty() || fName.isEmpty() || lName.isEmpty() || bDay.isEmpty()
						|| addy.isEmpty() || email.isEmpty() || phoNo.isEmpty() || insID.isEmpty() || holID.isEmpty()) {
					System.out.println("There is an empty data field.");
				} else {
					System.out.println("\npatID: " + patID);
					System.out.println("apptID: " + apptID);
					System.out.println("fName : " + fName);
					System.out.println("lName : " + lName);
					System.out.println("bDay : " + bDay);
					System.out.println("addy : " + addy);
					System.out.println("email : " + email);
					System.out.println("phoNo : " + phoNo);
					System.out.println("insID : " + insID);
					System.out.println("holID : " + holID);
				}
			}
		});
	}

	private void createEditRoomContents(Composite composite) {

		patientIDtxt = new Text(composite, SWT.BORDER);
		patientIDtxt.setBounds(10, 13, 50, 21);

		lblPatientID = new Label(composite, SWT.CENTER);
		lblPatientID.setText("Patient ID");
		lblPatientID.setBounds(10, 13, 55, 15);

		appointmentIDtxt = new Text(composite, SWT.BORDER);
		appointmentIDtxt.setBounds(110, 37, 50, 21);

		lblAppointmentID = new Label(composite, SWT.CENTER);
		lblAppointmentID.setText("Appointment ID");
		lblAppointmentID.setBounds(10, 40, 92, 15);

		firstNametxt = new Text(composite, SWT.BORDER);
		firstNametxt.setBounds(110, 64, 50, 21);

		lblFirstName = new Label(composite, SWT.CENTER);
		lblFirstName.setText("First Name");
		lblFirstName.setBounds(10, 67, 65, 15);

		lastNametxt = new Text(composite, SWT.BORDER);
		lastNametxt.setBounds(110, 91, 50, 21);

		lblLastName = new Label(composite, SWT.CENTER);
		lblLastName.setText("Last Name");
		lblLastName.setBounds(10, 94, 65, 15);

		phoneNumbertxt = new Text(composite, SWT.BORDER);
		phoneNumbertxt.setBounds(110, 118, 50, 21);

		lblBirthdate = new Label(composite, SWT.CENTER);
		lblBirthdate.setText("Birthdate");
		lblBirthdate.setBounds(10, 121, 55, 15);

		birthdatetxt = new Text(composite, SWT.BORDER);
		birthdatetxt.setBounds(110, 145, 50, 21);

		lblAddress = new Label(composite, SWT.CENTER);
		lblAddress.setText("Address");
		lblAddress.setBounds(10, 148, 55, 15);

		addresstxt = new Text(composite, SWT.BORDER);
		addresstxt.setBounds(110, 172, 50, 21);

		lblEmail = new Label(composite, SWT.CENTER);
		lblEmail.setText("E-Mail");
		lblEmail.setBounds(10, 175, 55, 15);

		emailtxt = new Text(composite, SWT.BORDER);
		emailtxt.setBounds(110, 199, 50, 21);

		lblPhoneNumber = new Label(composite, SWT.CENTER);
		lblPhoneNumber.setText("Phone Number");
		lblPhoneNumber.setBounds(10, 202, 92, 15);

		insuranceIDtxt = new Text(composite, SWT.BORDER);
		insuranceIDtxt.setBounds(110, 226, 50, 21);

		lblInsuranceID = new Label(composite, SWT.CENTER);
		lblInsuranceID.setText("Insurance ID");
		lblInsuranceID.setBounds(10, 229, 76, 15);

		holderIDtxt = new Text(composite, SWT.BORDER);
		holderIDtxt.setBounds(110, 253, 50, 21);

		lblHolderID = new Label(composite, SWT.CENTER);
		lblHolderID.setText("Holder ID");
		lblHolderID.setBounds(10, 256, 55, 15);

		Button enter = new Button(composite, SWT.PUSH);
		enter.setText("Enter");
		enter.setAlignment(SWT.CENTER);
		enter.setBounds(36, 290, 150, 20);
		enter.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {

				patID = patientIDtxt.getText();
				apptID = appointmentIDtxt.getText();
				fName = firstNametxt.getText();
				lName = lastNametxt.getText();
				bDay = birthdatetxt.getText();
				addy = addresstxt.getText();
				email = emailtxt.getText();
				phoNo = phoneNumbertxt.getText();
				insID = insuranceIDtxt.getText();
				holID = holderIDtxt.getText();

				if (patID.isEmpty() || apptID.isEmpty() || fName.isEmpty() || lName.isEmpty() || bDay.isEmpty()
						|| addy.isEmpty() || email.isEmpty() || phoNo.isEmpty() || insID.isEmpty() || holID.isEmpty()) {
					System.out.println("There is an empty data field.");
				} else {
					System.out.println("\npatID: " + patID);
					System.out.println("apptID: " + apptID);
					System.out.println("fName : " + fName);
					System.out.println("lName : " + lName);
					System.out.println("bDay : " + bDay);
					System.out.println("addy : " + addy);
					System.out.println("email : " + email);
					System.out.println("phoNo : " + phoNo);
					System.out.println("insID : " + insID);
					System.out.println("holID : " + holID);
				}
			}
		});
	}

	private void createEditEquipmentContents(Composite composite) {

		patientIDtxt = new Text(composite, SWT.BORDER);
		patientIDtxt.setBounds(10, 13, 50, 21);

		lblPatientID = new Label(composite, SWT.CENTER);
		lblPatientID.setText("Patient ID");
		lblPatientID.setBounds(10, 13, 55, 15);

		appointmentIDtxt = new Text(composite, SWT.BORDER);
		appointmentIDtxt.setBounds(110, 37, 50, 21);

		lblAppointmentID = new Label(composite, SWT.CENTER);
		lblAppointmentID.setText("Appointment ID");
		lblAppointmentID.setBounds(10, 40, 92, 15);

		firstNametxt = new Text(composite, SWT.BORDER);
		firstNametxt.setBounds(110, 64, 50, 21);

		lblFirstName = new Label(composite, SWT.CENTER);
		lblFirstName.setText("First Name");
		lblFirstName.setBounds(10, 67, 65, 15);

		lastNametxt = new Text(composite, SWT.BORDER);
		lastNametxt.setBounds(110, 91, 50, 21);

		lblLastName = new Label(composite, SWT.CENTER);
		lblLastName.setText("Last Name");
		lblLastName.setBounds(10, 94, 65, 15);

		phoneNumbertxt = new Text(composite, SWT.BORDER);
		phoneNumbertxt.setBounds(110, 118, 50, 21);

		lblBirthdate = new Label(composite, SWT.CENTER);
		lblBirthdate.setText("Birthdate");
		lblBirthdate.setBounds(10, 121, 55, 15);

		birthdatetxt = new Text(composite, SWT.BORDER);
		birthdatetxt.setBounds(110, 145, 50, 21);

		lblAddress = new Label(composite, SWT.CENTER);
		lblAddress.setText("Address");
		lblAddress.setBounds(10, 148, 55, 15);

		addresstxt = new Text(composite, SWT.BORDER);
		addresstxt.setBounds(110, 172, 50, 21);

		lblEmail = new Label(composite, SWT.CENTER);
		lblEmail.setText("E-Mail");
		lblEmail.setBounds(10, 175, 55, 15);

		emailtxt = new Text(composite, SWT.BORDER);
		emailtxt.setBounds(110, 199, 50, 21);

		lblPhoneNumber = new Label(composite, SWT.CENTER);
		lblPhoneNumber.setText("Phone Number");
		lblPhoneNumber.setBounds(10, 202, 92, 15);

		insuranceIDtxt = new Text(composite, SWT.BORDER);
		insuranceIDtxt.setBounds(110, 226, 50, 21);

		lblInsuranceID = new Label(composite, SWT.CENTER);
		lblInsuranceID.setText("Insurance ID");
		lblInsuranceID.setBounds(10, 229, 76, 15);

		holderIDtxt = new Text(composite, SWT.BORDER);
		holderIDtxt.setBounds(110, 253, 50, 21);

		lblHolderID = new Label(composite, SWT.CENTER);
		lblHolderID.setText("Holder ID");
		lblHolderID.setBounds(10, 256, 55, 15);

		Button enter = new Button(composite, SWT.PUSH);
		enter.setText("Enter");
		enter.setAlignment(SWT.CENTER);
		enter.setBounds(36, 290, 150, 20);
		enter.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {

				patID = patientIDtxt.getText();
				apptID = appointmentIDtxt.getText();
				fName = firstNametxt.getText();
				lName = lastNametxt.getText();
				bDay = birthdatetxt.getText();
				addy = addresstxt.getText();
				email = emailtxt.getText();
				phoNo = phoneNumbertxt.getText();
				insID = insuranceIDtxt.getText();
				holID = holderIDtxt.getText();

				if (patID.isEmpty() || apptID.isEmpty() || fName.isEmpty() || lName.isEmpty() || bDay.isEmpty()
						|| addy.isEmpty() || email.isEmpty() || phoNo.isEmpty() || insID.isEmpty() || holID.isEmpty()) {
					System.out.println("There is an empty data field.");
				} else {
					System.out.println("\npatID: " + patID);
					System.out.println("apptID: " + apptID);
					System.out.println("fName : " + fName);
					System.out.println("lName : " + lName);
					System.out.println("bDay : " + bDay);
					System.out.println("addy : " + addy);
					System.out.println("email : " + email);
					System.out.println("phoNo : " + phoNo);
					System.out.println("insID : " + insID);
					System.out.println("holID : " + holID);
				}
			}
		});
	}

	private void createEditDepartmentContents(Composite composite) {

		patientIDtxt = new Text(composite, SWT.BORDER);
		patientIDtxt.setBounds(10, 13, 50, 21);

		lblPatientID = new Label(composite, SWT.CENTER);
		lblPatientID.setText("Patient ID");
		lblPatientID.setBounds(10, 13, 55, 15);

		appointmentIDtxt = new Text(composite, SWT.BORDER);
		appointmentIDtxt.setBounds(110, 37, 50, 21);

		lblAppointmentID = new Label(composite, SWT.CENTER);
		lblAppointmentID.setText("Appointment ID");
		lblAppointmentID.setBounds(10, 40, 92, 15);

		firstNametxt = new Text(composite, SWT.BORDER);
		firstNametxt.setBounds(110, 64, 50, 21);

		lblFirstName = new Label(composite, SWT.CENTER);
		lblFirstName.setText("First Name");
		lblFirstName.setBounds(10, 67, 65, 15);

		lastNametxt = new Text(composite, SWT.BORDER);
		lastNametxt.setBounds(110, 91, 50, 21);

		lblLastName = new Label(composite, SWT.CENTER);
		lblLastName.setText("Last Name");
		lblLastName.setBounds(10, 94, 65, 15);

		phoneNumbertxt = new Text(composite, SWT.BORDER);
		phoneNumbertxt.setBounds(110, 118, 50, 21);

		lblBirthdate = new Label(composite, SWT.CENTER);
		lblBirthdate.setText("Birthdate");
		lblBirthdate.setBounds(10, 121, 55, 15);

		birthdatetxt = new Text(composite, SWT.BORDER);
		birthdatetxt.setBounds(110, 145, 50, 21);

		lblAddress = new Label(composite, SWT.CENTER);
		lblAddress.setText("Address");
		lblAddress.setBounds(10, 148, 55, 15);

		addresstxt = new Text(composite, SWT.BORDER);
		addresstxt.setBounds(110, 172, 50, 21);

		lblEmail = new Label(composite, SWT.CENTER);
		lblEmail.setText("E-Mail");
		lblEmail.setBounds(10, 175, 55, 15);

		emailtxt = new Text(composite, SWT.BORDER);
		emailtxt.setBounds(110, 199, 50, 21);

		lblPhoneNumber = new Label(composite, SWT.CENTER);
		lblPhoneNumber.setText("Phone Number");
		lblPhoneNumber.setBounds(10, 202, 92, 15);

		insuranceIDtxt = new Text(composite, SWT.BORDER);
		insuranceIDtxt.setBounds(110, 226, 50, 21);

		lblInsuranceID = new Label(composite, SWT.CENTER);
		lblInsuranceID.setText("Insurance ID");
		lblInsuranceID.setBounds(10, 229, 76, 15);

		holderIDtxt = new Text(composite, SWT.BORDER);
		holderIDtxt.setBounds(110, 253, 50, 21);

		lblHolderID = new Label(composite, SWT.CENTER);
		lblHolderID.setText("Holder ID");
		lblHolderID.setBounds(10, 256, 55, 15);

		Button enter = new Button(composite, SWT.PUSH);
		enter.setText("Enter");
		enter.setAlignment(SWT.CENTER);
		enter.setBounds(36, 290, 150, 20);
		enter.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {

				patID = patientIDtxt.getText();
				apptID = appointmentIDtxt.getText();
				fName = firstNametxt.getText();
				lName = lastNametxt.getText();
				bDay = birthdatetxt.getText();
				addy = addresstxt.getText();
				email = emailtxt.getText();
				phoNo = phoneNumbertxt.getText();
				insID = insuranceIDtxt.getText();
				holID = holderIDtxt.getText();

				if (patID.isEmpty() || apptID.isEmpty() || fName.isEmpty() || lName.isEmpty() || bDay.isEmpty()
						|| addy.isEmpty() || email.isEmpty() || phoNo.isEmpty() || insID.isEmpty() || holID.isEmpty()) {
					System.out.println("There is an empty data field.");
				} else {
					System.out.println("\npatID: " + patID);
					System.out.println("apptID: " + apptID);
					System.out.println("fName : " + fName);
					System.out.println("lName : " + lName);
					System.out.println("bDay : " + bDay);
					System.out.println("addy : " + addy);
					System.out.println("email : " + email);
					System.out.println("phoNo : " + phoNo);
					System.out.println("insID : " + insID);
					System.out.println("holID : " + holID);
				}
			}
		});
	}

	private void createEditAppointmentContents(Composite composite) {

		patientIDtxt = new Text(composite, SWT.BORDER);
		patientIDtxt.setBounds(10, 13, 50, 21);

		lblPatientID = new Label(composite, SWT.CENTER);
		lblPatientID.setText("Patient ID");
		lblPatientID.setBounds(10, 13, 55, 15);

		appointmentIDtxt = new Text(composite, SWT.BORDER);
		appointmentIDtxt.setBounds(110, 37, 50, 21);

		lblAppointmentID = new Label(composite, SWT.CENTER);
		lblAppointmentID.setText("Appointment ID");
		lblAppointmentID.setBounds(10, 40, 92, 15);

		firstNametxt = new Text(composite, SWT.BORDER);
		firstNametxt.setBounds(110, 64, 50, 21);

		lblFirstName = new Label(composite, SWT.CENTER);
		lblFirstName.setText("First Name");
		lblFirstName.setBounds(10, 67, 65, 15);

		lastNametxt = new Text(composite, SWT.BORDER);
		lastNametxt.setBounds(110, 91, 50, 21);

		lblLastName = new Label(composite, SWT.CENTER);
		lblLastName.setText("Last Name");
		lblLastName.setBounds(10, 94, 65, 15);

		phoneNumbertxt = new Text(composite, SWT.BORDER);
		phoneNumbertxt.setBounds(110, 118, 50, 21);

		lblBirthdate = new Label(composite, SWT.CENTER);
		lblBirthdate.setText("Birthdate");
		lblBirthdate.setBounds(10, 121, 55, 15);

		birthdatetxt = new Text(composite, SWT.BORDER);
		birthdatetxt.setBounds(110, 145, 50, 21);

		lblAddress = new Label(composite, SWT.CENTER);
		lblAddress.setText("Address");
		lblAddress.setBounds(10, 148, 55, 15);

		addresstxt = new Text(composite, SWT.BORDER);
		addresstxt.setBounds(110, 172, 50, 21);

		lblEmail = new Label(composite, SWT.CENTER);
		lblEmail.setText("E-Mail");
		lblEmail.setBounds(10, 175, 55, 15);

		emailtxt = new Text(composite, SWT.BORDER);
		emailtxt.setBounds(110, 199, 50, 21);

		lblPhoneNumber = new Label(composite, SWT.CENTER);
		lblPhoneNumber.setText("Phone Number");
		lblPhoneNumber.setBounds(10, 202, 92, 15);

		insuranceIDtxt = new Text(composite, SWT.BORDER);
		insuranceIDtxt.setBounds(110, 226, 50, 21);

		lblInsuranceID = new Label(composite, SWT.CENTER);
		lblInsuranceID.setText("Insurance ID");
		lblInsuranceID.setBounds(10, 229, 76, 15);

		holderIDtxt = new Text(composite, SWT.BORDER);
		holderIDtxt.setBounds(110, 253, 50, 21);

		lblHolderID = new Label(composite, SWT.CENTER);
		lblHolderID.setText("Holder ID");
		lblHolderID.setBounds(10, 256, 55, 15);

		Button enter = new Button(composite, SWT.PUSH);
		enter.setText("Enter");
		enter.setAlignment(SWT.CENTER);
		enter.setBounds(36, 290, 150, 20);
		enter.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {

				patID = patientIDtxt.getText();
				apptID = appointmentIDtxt.getText();
				fName = firstNametxt.getText();
				lName = lastNametxt.getText();
				bDay = birthdatetxt.getText();
				addy = addresstxt.getText();
				email = emailtxt.getText();
				phoNo = phoneNumbertxt.getText();
				insID = insuranceIDtxt.getText();
				holID = holderIDtxt.getText();

				if (patID.isEmpty() || apptID.isEmpty() || fName.isEmpty() || lName.isEmpty() || bDay.isEmpty()
						|| addy.isEmpty() || email.isEmpty() || phoNo.isEmpty() || insID.isEmpty() || holID.isEmpty()) {
					System.out.println("There is an empty data field.");
				} else {
					System.out.println("\npatID: " + patID);
					System.out.println("apptID: " + apptID);
					System.out.println("fName : " + fName);
					System.out.println("lName : " + lName);
					System.out.println("bDay : " + bDay);
					System.out.println("addy : " + addy);
					System.out.println("email : " + email);
					System.out.println("phoNo : " + phoNo);
					System.out.println("insID : " + insID);
					System.out.println("holID : " + holID);
				}
			}
		});
	}

	private void createEditInsuranceCoContents(Composite composite) {

		patientIDtxt = new Text(composite, SWT.BORDER);
		patientIDtxt.setBounds(10, 13, 50, 21);

		lblPatientID = new Label(composite, SWT.CENTER);
		lblPatientID.setText("Patient ID");
		lblPatientID.setBounds(10, 13, 55, 15);

		appointmentIDtxt = new Text(composite, SWT.BORDER);
		appointmentIDtxt.setBounds(110, 37, 50, 21);

		lblAppointmentID = new Label(composite, SWT.CENTER);
		lblAppointmentID.setText("Appointment ID");
		lblAppointmentID.setBounds(10, 40, 92, 15);

		firstNametxt = new Text(composite, SWT.BORDER);
		firstNametxt.setBounds(110, 64, 50, 21);

		lblFirstName = new Label(composite, SWT.CENTER);
		lblFirstName.setText("First Name");
		lblFirstName.setBounds(10, 67, 65, 15);

		lastNametxt = new Text(composite, SWT.BORDER);
		lastNametxt.setBounds(110, 91, 50, 21);

		lblLastName = new Label(composite, SWT.CENTER);
		lblLastName.setText("Last Name");
		lblLastName.setBounds(10, 94, 65, 15);

		phoneNumbertxt = new Text(composite, SWT.BORDER);
		phoneNumbertxt.setBounds(110, 118, 50, 21);

		lblBirthdate = new Label(composite, SWT.CENTER);
		lblBirthdate.setText("Birthdate");
		lblBirthdate.setBounds(10, 121, 55, 15);

		birthdatetxt = new Text(composite, SWT.BORDER);
		birthdatetxt.setBounds(110, 145, 50, 21);

		lblAddress = new Label(composite, SWT.CENTER);
		lblAddress.setText("Address");
		lblAddress.setBounds(10, 148, 55, 15);

		addresstxt = new Text(composite, SWT.BORDER);
		addresstxt.setBounds(110, 172, 50, 21);

		lblEmail = new Label(composite, SWT.CENTER);
		lblEmail.setText("E-Mail");
		lblEmail.setBounds(10, 175, 55, 15);

		emailtxt = new Text(composite, SWT.BORDER);
		emailtxt.setBounds(110, 199, 50, 21);

		lblPhoneNumber = new Label(composite, SWT.CENTER);
		lblPhoneNumber.setText("Phone Number");
		lblPhoneNumber.setBounds(10, 202, 92, 15);

		insuranceIDtxt = new Text(composite, SWT.BORDER);
		insuranceIDtxt.setBounds(110, 226, 50, 21);

		lblInsuranceID = new Label(composite, SWT.CENTER);
		lblInsuranceID.setText("Insurance ID");
		lblInsuranceID.setBounds(10, 229, 76, 15);

		holderIDtxt = new Text(composite, SWT.BORDER);
		holderIDtxt.setBounds(110, 253, 50, 21);

		lblHolderID = new Label(composite, SWT.CENTER);
		lblHolderID.setText("Holder ID");
		lblHolderID.setBounds(10, 256, 55, 15);

		Button enter = new Button(composite, SWT.PUSH);
		enter.setText("Enter");
		enter.setAlignment(SWT.CENTER);
		enter.setBounds(36, 290, 150, 20);
		enter.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {

				patID = patientIDtxt.getText();
				apptID = appointmentIDtxt.getText();
				fName = firstNametxt.getText();
				lName = lastNametxt.getText();
				bDay = birthdatetxt.getText();
				addy = addresstxt.getText();
				email = emailtxt.getText();
				phoNo = phoneNumbertxt.getText();
				insID = insuranceIDtxt.getText();
				holID = holderIDtxt.getText();

				if (patID.isEmpty() || apptID.isEmpty() || fName.isEmpty() || lName.isEmpty() || bDay.isEmpty()
						|| addy.isEmpty() || email.isEmpty() || phoNo.isEmpty() || insID.isEmpty() || holID.isEmpty()) {
					System.out.println("There is an empty data field.");
				} else {
					System.out.println("\npatID: " + patID);
					System.out.println("apptID: " + apptID);
					System.out.println("fName : " + fName);
					System.out.println("lName : " + lName);
					System.out.println("bDay : " + bDay);
					System.out.println("addy : " + addy);
					System.out.println("email : " + email);
					System.out.println("phoNo : " + phoNo);
					System.out.println("insID : " + insID);
					System.out.println("holID : " + holID);
				}
			}
		});
	}

	private void createEditInsuranceHolContents(Composite composite) {

		patientIDtxt = new Text(composite, SWT.BORDER);
		patientIDtxt.setBounds(10, 13, 50, 21);

		lblPatientID = new Label(composite, SWT.CENTER);
		lblPatientID.setText("Patient ID");
		lblPatientID.setBounds(10, 13, 55, 15);

		appointmentIDtxt = new Text(composite, SWT.BORDER);
		appointmentIDtxt.setBounds(110, 37, 50, 21);

		lblAppointmentID = new Label(composite, SWT.CENTER);
		lblAppointmentID.setText("Appointment ID");
		lblAppointmentID.setBounds(10, 40, 92, 15);

		firstNametxt = new Text(composite, SWT.BORDER);
		firstNametxt.setBounds(110, 64, 50, 21);

		lblFirstName = new Label(composite, SWT.CENTER);
		lblFirstName.setText("First Name");
		lblFirstName.setBounds(10, 67, 65, 15);

		lastNametxt = new Text(composite, SWT.BORDER);
		lastNametxt.setBounds(110, 91, 50, 21);

		lblLastName = new Label(composite, SWT.CENTER);
		lblLastName.setText("Last Name");
		lblLastName.setBounds(10, 94, 65, 15);

		phoneNumbertxt = new Text(composite, SWT.BORDER);
		phoneNumbertxt.setBounds(110, 118, 50, 21);

		lblBirthdate = new Label(composite, SWT.CENTER);
		lblBirthdate.setText("Birthdate");
		lblBirthdate.setBounds(10, 121, 55, 15);

		birthdatetxt = new Text(composite, SWT.BORDER);
		birthdatetxt.setBounds(110, 145, 50, 21);

		lblAddress = new Label(composite, SWT.CENTER);
		lblAddress.setText("Address");
		lblAddress.setBounds(10, 148, 55, 15);

		addresstxt = new Text(composite, SWT.BORDER);
		addresstxt.setBounds(110, 172, 50, 21);

		lblEmail = new Label(composite, SWT.CENTER);
		lblEmail.setText("E-Mail");
		lblEmail.setBounds(10, 175, 55, 15);

		emailtxt = new Text(composite, SWT.BORDER);
		emailtxt.setBounds(110, 199, 50, 21);

		lblPhoneNumber = new Label(composite, SWT.CENTER);
		lblPhoneNumber.setText("Phone Number");
		lblPhoneNumber.setBounds(10, 202, 92, 15);

		insuranceIDtxt = new Text(composite, SWT.BORDER);
		insuranceIDtxt.setBounds(110, 226, 50, 21);

		lblInsuranceID = new Label(composite, SWT.CENTER);
		lblInsuranceID.setText("Insurance ID");
		lblInsuranceID.setBounds(10, 229, 76, 15);

		holderIDtxt = new Text(composite, SWT.BORDER);
		holderIDtxt.setBounds(110, 253, 50, 21);

		lblHolderID = new Label(composite, SWT.CENTER);
		lblHolderID.setText("Holder ID");
		lblHolderID.setBounds(10, 256, 55, 15);

		Button enter = new Button(composite, SWT.PUSH);
		enter.setText("Enter");
		enter.setAlignment(SWT.CENTER);
		enter.setBounds(36, 290, 150, 20);
		enter.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {

				patID = patientIDtxt.getText();
				apptID = appointmentIDtxt.getText();
				fName = firstNametxt.getText();
				lName = lastNametxt.getText();
				bDay = birthdatetxt.getText();
				addy = addresstxt.getText();
				email = emailtxt.getText();
				phoNo = phoneNumbertxt.getText();
				insID = insuranceIDtxt.getText();
				holID = holderIDtxt.getText();

				if (patID.isEmpty() || apptID.isEmpty() || fName.isEmpty() || lName.isEmpty() || bDay.isEmpty()
						|| addy.isEmpty() || email.isEmpty() || phoNo.isEmpty() || insID.isEmpty() || holID.isEmpty()) {
					System.out.println("There is an empty data field.");
				} else {
					System.out.println("\npatID: " + patID);
					System.out.println("apptID: " + apptID);
					System.out.println("fName : " + fName);
					System.out.println("lName : " + lName);
					System.out.println("bDay : " + bDay);
					System.out.println("addy : " + addy);
					System.out.println("email : " + email);
					System.out.println("phoNo : " + phoNo);
					System.out.println("insID : " + insID);
					System.out.println("holID : " + holID);
				}
			}
		});
	}

	private void createDeletePatientContents(Composite composite) {

		patientIDtxt = new Text(composite, SWT.BORDER);
		patientIDtxt.setBounds(10, 13, 50, 21);

		lblPatientID = new Label(composite, SWT.CENTER);
		lblPatientID.setText("Patient ID");
		lblPatientID.setBounds(10, 13, 55, 15);

		appointmentIDtxt = new Text(composite, SWT.BORDER);
		appointmentIDtxt.setBounds(110, 37, 50, 21);

		lblAppointmentID = new Label(composite, SWT.CENTER);
		lblAppointmentID.setText("Appointment ID");
		lblAppointmentID.setBounds(10, 40, 92, 15);

		firstNametxt = new Text(composite, SWT.BORDER);
		firstNametxt.setBounds(110, 64, 50, 21);

		lblFirstName = new Label(composite, SWT.CENTER);
		lblFirstName.setText("First Name");
		lblFirstName.setBounds(10, 67, 65, 15);

		lastNametxt = new Text(composite, SWT.BORDER);
		lastNametxt.setBounds(110, 91, 50, 21);

		lblLastName = new Label(composite, SWT.CENTER);
		lblLastName.setText("Last Name");
		lblLastName.setBounds(10, 94, 65, 15);

		phoneNumbertxt = new Text(composite, SWT.BORDER);
		phoneNumbertxt.setBounds(110, 118, 50, 21);

		lblBirthdate = new Label(composite, SWT.CENTER);
		lblBirthdate.setText("Birthdate");
		lblBirthdate.setBounds(10, 121, 55, 15);

		birthdatetxt = new Text(composite, SWT.BORDER);
		birthdatetxt.setBounds(110, 145, 50, 21);

		lblAddress = new Label(composite, SWT.CENTER);
		lblAddress.setText("Address");
		lblAddress.setBounds(10, 148, 55, 15);

		addresstxt = new Text(composite, SWT.BORDER);
		addresstxt.setBounds(110, 172, 50, 21);

		lblEmail = new Label(composite, SWT.CENTER);
		lblEmail.setText("E-Mail");
		lblEmail.setBounds(10, 175, 55, 15);

		emailtxt = new Text(composite, SWT.BORDER);
		emailtxt.setBounds(110, 199, 50, 21);

		lblPhoneNumber = new Label(composite, SWT.CENTER);
		lblPhoneNumber.setText("Phone Number");
		lblPhoneNumber.setBounds(10, 202, 92, 15);

		insuranceIDtxt = new Text(composite, SWT.BORDER);
		insuranceIDtxt.setBounds(110, 226, 50, 21);

		lblInsuranceID = new Label(composite, SWT.CENTER);
		lblInsuranceID.setText("Insurance ID");
		lblInsuranceID.setBounds(10, 229, 76, 15);

		holderIDtxt = new Text(composite, SWT.BORDER);
		holderIDtxt.setBounds(110, 253, 50, 21);

		lblHolderID = new Label(composite, SWT.CENTER);
		lblHolderID.setText("Holder ID");
		lblHolderID.setBounds(10, 256, 55, 15);

		Button enter = new Button(composite, SWT.PUSH);
		enter.setText("Enter");
		enter.setAlignment(SWT.CENTER);
		enter.setBounds(36, 290, 150, 20);
		enter.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {

				patID = patientIDtxt.getText();
				apptID = appointmentIDtxt.getText();
				fName = firstNametxt.getText();
				lName = lastNametxt.getText();
				bDay = birthdatetxt.getText();
				addy = addresstxt.getText();
				email = emailtxt.getText();
				phoNo = phoneNumbertxt.getText();
				insID = insuranceIDtxt.getText();
				holID = holderIDtxt.getText();

				if (patID.isEmpty() || apptID.isEmpty() || fName.isEmpty() || lName.isEmpty() || bDay.isEmpty()
						|| addy.isEmpty() || email.isEmpty() || phoNo.isEmpty() || insID.isEmpty() || holID.isEmpty()) {
					System.out.println("There is an empty data field.");
				} else {
					System.out.println("\npatID: " + patID);
					System.out.println("apptID: " + apptID);
					System.out.println("fName : " + fName);
					System.out.println("lName : " + lName);
					System.out.println("bDay : " + bDay);
					System.out.println("addy : " + addy);
					System.out.println("email : " + email);
					System.out.println("phoNo : " + phoNo);
					System.out.println("insID : " + insID);
					System.out.println("holID : " + holID);
				}
			}
		});
	}

	private void createDeleteDoctorContents(Composite composite) {

		patientIDtxt = new Text(composite, SWT.BORDER);
		patientIDtxt.setBounds(10, 13, 50, 21);

		lblPatientID = new Label(composite, SWT.CENTER);
		lblPatientID.setText("Patient ID");
		lblPatientID.setBounds(10, 13, 55, 15);

		appointmentIDtxt = new Text(composite, SWT.BORDER);
		appointmentIDtxt.setBounds(110, 37, 50, 21);

		lblAppointmentID = new Label(composite, SWT.CENTER);
		lblAppointmentID.setText("Appointment ID");
		lblAppointmentID.setBounds(10, 40, 92, 15);

		firstNametxt = new Text(composite, SWT.BORDER);
		firstNametxt.setBounds(110, 64, 50, 21);

		lblFirstName = new Label(composite, SWT.CENTER);
		lblFirstName.setText("First Name");
		lblFirstName.setBounds(10, 67, 65, 15);

		lastNametxt = new Text(composite, SWT.BORDER);
		lastNametxt.setBounds(110, 91, 50, 21);

		lblLastName = new Label(composite, SWT.CENTER);
		lblLastName.setText("Last Name");
		lblLastName.setBounds(10, 94, 65, 15);

		phoneNumbertxt = new Text(composite, SWT.BORDER);
		phoneNumbertxt.setBounds(110, 118, 50, 21);

		lblBirthdate = new Label(composite, SWT.CENTER);
		lblBirthdate.setText("Birthdate");
		lblBirthdate.setBounds(10, 121, 55, 15);

		birthdatetxt = new Text(composite, SWT.BORDER);
		birthdatetxt.setBounds(110, 145, 50, 21);

		lblAddress = new Label(composite, SWT.CENTER);
		lblAddress.setText("Address");
		lblAddress.setBounds(10, 148, 55, 15);

		addresstxt = new Text(composite, SWT.BORDER);
		addresstxt.setBounds(110, 172, 50, 21);

		lblEmail = new Label(composite, SWT.CENTER);
		lblEmail.setText("E-Mail");
		lblEmail.setBounds(10, 175, 55, 15);

		emailtxt = new Text(composite, SWT.BORDER);
		emailtxt.setBounds(110, 199, 50, 21);

		lblPhoneNumber = new Label(composite, SWT.CENTER);
		lblPhoneNumber.setText("Phone Number");
		lblPhoneNumber.setBounds(10, 202, 92, 15);

		insuranceIDtxt = new Text(composite, SWT.BORDER);
		insuranceIDtxt.setBounds(110, 226, 50, 21);

		lblInsuranceID = new Label(composite, SWT.CENTER);
		lblInsuranceID.setText("Insurance ID");
		lblInsuranceID.setBounds(10, 229, 76, 15);

		holderIDtxt = new Text(composite, SWT.BORDER);
		holderIDtxt.setBounds(110, 253, 50, 21);

		lblHolderID = new Label(composite, SWT.CENTER);
		lblHolderID.setText("Holder ID");
		lblHolderID.setBounds(10, 256, 55, 15);

		Button enter = new Button(composite, SWT.PUSH);
		enter.setText("Enter");
		enter.setAlignment(SWT.CENTER);
		enter.setBounds(36, 290, 150, 20);
		enter.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {

				patID = patientIDtxt.getText();
				apptID = appointmentIDtxt.getText();
				fName = firstNametxt.getText();
				lName = lastNametxt.getText();
				bDay = birthdatetxt.getText();
				addy = addresstxt.getText();
				email = emailtxt.getText();
				phoNo = phoneNumbertxt.getText();
				insID = insuranceIDtxt.getText();
				holID = holderIDtxt.getText();

				if (patID.isEmpty() || apptID.isEmpty() || fName.isEmpty() || lName.isEmpty() || bDay.isEmpty()
						|| addy.isEmpty() || email.isEmpty() || phoNo.isEmpty() || insID.isEmpty() || holID.isEmpty()) {
					System.out.println("There is an empty data field.");
				} else {
					System.out.println("\npatID: " + patID);
					System.out.println("apptID: " + apptID);
					System.out.println("fName : " + fName);
					System.out.println("lName : " + lName);
					System.out.println("bDay : " + bDay);
					System.out.println("addy : " + addy);
					System.out.println("email : " + email);
					System.out.println("phoNo : " + phoNo);
					System.out.println("insID : " + insID);
					System.out.println("holID : " + holID);
				}
			}
		});
	}

	private void createDeleteRoomContents(Composite composite) {

		patientIDtxt = new Text(composite, SWT.BORDER);
		patientIDtxt.setBounds(10, 13, 50, 21);

		lblPatientID = new Label(composite, SWT.CENTER);
		lblPatientID.setText("Patient ID");
		lblPatientID.setBounds(10, 13, 55, 15);

		appointmentIDtxt = new Text(composite, SWT.BORDER);
		appointmentIDtxt.setBounds(110, 37, 50, 21);

		lblAppointmentID = new Label(composite, SWT.CENTER);
		lblAppointmentID.setText("Appointment ID");
		lblAppointmentID.setBounds(10, 40, 92, 15);

		firstNametxt = new Text(composite, SWT.BORDER);
		firstNametxt.setBounds(110, 64, 50, 21);

		lblFirstName = new Label(composite, SWT.CENTER);
		lblFirstName.setText("First Name");
		lblFirstName.setBounds(10, 67, 65, 15);

		lastNametxt = new Text(composite, SWT.BORDER);
		lastNametxt.setBounds(110, 91, 50, 21);

		lblLastName = new Label(composite, SWT.CENTER);
		lblLastName.setText("Last Name");
		lblLastName.setBounds(10, 94, 65, 15);

		phoneNumbertxt = new Text(composite, SWT.BORDER);
		phoneNumbertxt.setBounds(110, 118, 50, 21);

		lblBirthdate = new Label(composite, SWT.CENTER);
		lblBirthdate.setText("Birthdate");
		lblBirthdate.setBounds(10, 121, 55, 15);

		birthdatetxt = new Text(composite, SWT.BORDER);
		birthdatetxt.setBounds(110, 145, 50, 21);

		lblAddress = new Label(composite, SWT.CENTER);
		lblAddress.setText("Address");
		lblAddress.setBounds(10, 148, 55, 15);

		addresstxt = new Text(composite, SWT.BORDER);
		addresstxt.setBounds(110, 172, 50, 21);

		lblEmail = new Label(composite, SWT.CENTER);
		lblEmail.setText("E-Mail");
		lblEmail.setBounds(10, 175, 55, 15);

		emailtxt = new Text(composite, SWT.BORDER);
		emailtxt.setBounds(110, 199, 50, 21);

		lblPhoneNumber = new Label(composite, SWT.CENTER);
		lblPhoneNumber.setText("Phone Number");
		lblPhoneNumber.setBounds(10, 202, 92, 15);

		insuranceIDtxt = new Text(composite, SWT.BORDER);
		insuranceIDtxt.setBounds(110, 226, 50, 21);

		lblInsuranceID = new Label(composite, SWT.CENTER);
		lblInsuranceID.setText("Insurance ID");
		lblInsuranceID.setBounds(10, 229, 76, 15);

		holderIDtxt = new Text(composite, SWT.BORDER);
		holderIDtxt.setBounds(110, 253, 50, 21);

		lblHolderID = new Label(composite, SWT.CENTER);
		lblHolderID.setText("Holder ID");
		lblHolderID.setBounds(10, 256, 55, 15);

		Button enter = new Button(composite, SWT.PUSH);
		enter.setText("Enter");
		enter.setAlignment(SWT.CENTER);
		enter.setBounds(36, 290, 150, 20);
		enter.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {

				patID = patientIDtxt.getText();
				apptID = appointmentIDtxt.getText();
				fName = firstNametxt.getText();
				lName = lastNametxt.getText();
				bDay = birthdatetxt.getText();
				addy = addresstxt.getText();
				email = emailtxt.getText();
				phoNo = phoneNumbertxt.getText();
				insID = insuranceIDtxt.getText();
				holID = holderIDtxt.getText();

				if (patID.isEmpty() || apptID.isEmpty() || fName.isEmpty() || lName.isEmpty() || bDay.isEmpty()
						|| addy.isEmpty() || email.isEmpty() || phoNo.isEmpty() || insID.isEmpty() || holID.isEmpty()) {
					System.out.println("There is an empty data field.");
				} else {
					System.out.println("\npatID: " + patID);
					System.out.println("apptID: " + apptID);
					System.out.println("fName : " + fName);
					System.out.println("lName : " + lName);
					System.out.println("bDay : " + bDay);
					System.out.println("addy : " + addy);
					System.out.println("email : " + email);
					System.out.println("phoNo : " + phoNo);
					System.out.println("insID : " + insID);
					System.out.println("holID : " + holID);
				}
			}
		});
	}

	private void createDeleteEquipmentContents(Composite composite) {

		patientIDtxt = new Text(composite, SWT.BORDER);
		patientIDtxt.setBounds(10, 13, 50, 21);

		lblPatientID = new Label(composite, SWT.CENTER);
		lblPatientID.setText("Patient ID");
		lblPatientID.setBounds(10, 13, 55, 15);

		appointmentIDtxt = new Text(composite, SWT.BORDER);
		appointmentIDtxt.setBounds(110, 37, 50, 21);

		lblAppointmentID = new Label(composite, SWT.CENTER);
		lblAppointmentID.setText("Appointment ID");
		lblAppointmentID.setBounds(10, 40, 92, 15);

		firstNametxt = new Text(composite, SWT.BORDER);
		firstNametxt.setBounds(110, 64, 50, 21);

		lblFirstName = new Label(composite, SWT.CENTER);
		lblFirstName.setText("First Name");
		lblFirstName.setBounds(10, 67, 65, 15);

		lastNametxt = new Text(composite, SWT.BORDER);
		lastNametxt.setBounds(110, 91, 50, 21);

		lblLastName = new Label(composite, SWT.CENTER);
		lblLastName.setText("Last Name");
		lblLastName.setBounds(10, 94, 65, 15);

		phoneNumbertxt = new Text(composite, SWT.BORDER);
		phoneNumbertxt.setBounds(110, 118, 50, 21);

		lblBirthdate = new Label(composite, SWT.CENTER);
		lblBirthdate.setText("Birthdate");
		lblBirthdate.setBounds(10, 121, 55, 15);

		birthdatetxt = new Text(composite, SWT.BORDER);
		birthdatetxt.setBounds(110, 145, 50, 21);

		lblAddress = new Label(composite, SWT.CENTER);
		lblAddress.setText("Address");
		lblAddress.setBounds(10, 148, 55, 15);

		addresstxt = new Text(composite, SWT.BORDER);
		addresstxt.setBounds(110, 172, 50, 21);

		lblEmail = new Label(composite, SWT.CENTER);
		lblEmail.setText("E-Mail");
		lblEmail.setBounds(10, 175, 55, 15);

		emailtxt = new Text(composite, SWT.BORDER);
		emailtxt.setBounds(110, 199, 50, 21);

		lblPhoneNumber = new Label(composite, SWT.CENTER);
		lblPhoneNumber.setText("Phone Number");
		lblPhoneNumber.setBounds(10, 202, 92, 15);

		insuranceIDtxt = new Text(composite, SWT.BORDER);
		insuranceIDtxt.setBounds(110, 226, 50, 21);

		lblInsuranceID = new Label(composite, SWT.CENTER);
		lblInsuranceID.setText("Insurance ID");
		lblInsuranceID.setBounds(10, 229, 76, 15);

		holderIDtxt = new Text(composite, SWT.BORDER);
		holderIDtxt.setBounds(110, 253, 50, 21);

		lblHolderID = new Label(composite, SWT.CENTER);
		lblHolderID.setText("Holder ID");
		lblHolderID.setBounds(10, 256, 55, 15);

		Button enter = new Button(composite, SWT.PUSH);
		enter.setText("Enter");
		enter.setAlignment(SWT.CENTER);
		enter.setBounds(36, 290, 150, 20);
		enter.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {

				patID = patientIDtxt.getText();
				apptID = appointmentIDtxt.getText();
				fName = firstNametxt.getText();
				lName = lastNametxt.getText();
				bDay = birthdatetxt.getText();
				addy = addresstxt.getText();
				email = emailtxt.getText();
				phoNo = phoneNumbertxt.getText();
				insID = insuranceIDtxt.getText();
				holID = holderIDtxt.getText();

				if (patID.isEmpty() || apptID.isEmpty() || fName.isEmpty() || lName.isEmpty() || bDay.isEmpty()
						|| addy.isEmpty() || email.isEmpty() || phoNo.isEmpty() || insID.isEmpty() || holID.isEmpty()) {
					System.out.println("There is an empty data field.");
				} else {
					System.out.println("\npatID: " + patID);
					System.out.println("apptID: " + apptID);
					System.out.println("fName : " + fName);
					System.out.println("lName : " + lName);
					System.out.println("bDay : " + bDay);
					System.out.println("addy : " + addy);
					System.out.println("email : " + email);
					System.out.println("phoNo : " + phoNo);
					System.out.println("insID : " + insID);
					System.out.println("holID : " + holID);
				}
			}
		});
	}

	private void createDeleteDepartmentContents(Composite composite) {

		patientIDtxt = new Text(composite, SWT.BORDER);
		patientIDtxt.setBounds(10, 13, 50, 21);

		lblPatientID = new Label(composite, SWT.CENTER);
		lblPatientID.setText("Patient ID");
		lblPatientID.setBounds(10, 13, 55, 15);

		appointmentIDtxt = new Text(composite, SWT.BORDER);
		appointmentIDtxt.setBounds(110, 37, 50, 21);

		lblAppointmentID = new Label(composite, SWT.CENTER);
		lblAppointmentID.setText("Appointment ID");
		lblAppointmentID.setBounds(10, 40, 92, 15);

		firstNametxt = new Text(composite, SWT.BORDER);
		firstNametxt.setBounds(110, 64, 50, 21);

		lblFirstName = new Label(composite, SWT.CENTER);
		lblFirstName.setText("First Name");
		lblFirstName.setBounds(10, 67, 65, 15);

		lastNametxt = new Text(composite, SWT.BORDER);
		lastNametxt.setBounds(110, 91, 50, 21);

		lblLastName = new Label(composite, SWT.CENTER);
		lblLastName.setText("Last Name");
		lblLastName.setBounds(10, 94, 65, 15);

		phoneNumbertxt = new Text(composite, SWT.BORDER);
		phoneNumbertxt.setBounds(110, 118, 50, 21);

		lblBirthdate = new Label(composite, SWT.CENTER);
		lblBirthdate.setText("Birthdate");
		lblBirthdate.setBounds(10, 121, 55, 15);

		birthdatetxt = new Text(composite, SWT.BORDER);
		birthdatetxt.setBounds(110, 145, 50, 21);

		lblAddress = new Label(composite, SWT.CENTER);
		lblAddress.setText("Address");
		lblAddress.setBounds(10, 148, 55, 15);

		addresstxt = new Text(composite, SWT.BORDER);
		addresstxt.setBounds(110, 172, 50, 21);

		lblEmail = new Label(composite, SWT.CENTER);
		lblEmail.setText("E-Mail");
		lblEmail.setBounds(10, 175, 55, 15);

		emailtxt = new Text(composite, SWT.BORDER);
		emailtxt.setBounds(110, 199, 50, 21);

		lblPhoneNumber = new Label(composite, SWT.CENTER);
		lblPhoneNumber.setText("Phone Number");
		lblPhoneNumber.setBounds(10, 202, 92, 15);

		insuranceIDtxt = new Text(composite, SWT.BORDER);
		insuranceIDtxt.setBounds(110, 226, 50, 21);

		lblInsuranceID = new Label(composite, SWT.CENTER);
		lblInsuranceID.setText("Insurance ID");
		lblInsuranceID.setBounds(10, 229, 76, 15);

		holderIDtxt = new Text(composite, SWT.BORDER);
		holderIDtxt.setBounds(110, 253, 50, 21);

		lblHolderID = new Label(composite, SWT.CENTER);
		lblHolderID.setText("Holder ID");
		lblHolderID.setBounds(10, 256, 55, 15);

		Button enter = new Button(composite, SWT.PUSH);
		enter.setText("Enter");
		enter.setAlignment(SWT.CENTER);
		enter.setBounds(36, 290, 150, 20);
		enter.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {

				patID = patientIDtxt.getText();
				apptID = appointmentIDtxt.getText();
				fName = firstNametxt.getText();
				lName = lastNametxt.getText();
				bDay = birthdatetxt.getText();
				addy = addresstxt.getText();
				email = emailtxt.getText();
				phoNo = phoneNumbertxt.getText();
				insID = insuranceIDtxt.getText();
				holID = holderIDtxt.getText();

				if (patID.isEmpty() || apptID.isEmpty() || fName.isEmpty() || lName.isEmpty() || bDay.isEmpty()
						|| addy.isEmpty() || email.isEmpty() || phoNo.isEmpty() || insID.isEmpty() || holID.isEmpty()) {
					System.out.println("There is an empty data field.");
				} else {
					System.out.println("\npatID: " + patID);
					System.out.println("apptID: " + apptID);
					System.out.println("fName : " + fName);
					System.out.println("lName : " + lName);
					System.out.println("bDay : " + bDay);
					System.out.println("addy : " + addy);
					System.out.println("email : " + email);
					System.out.println("phoNo : " + phoNo);
					System.out.println("insID : " + insID);
					System.out.println("holID : " + holID);
				}
			}
		});
	}

	private void createDeleteAppointmentContents(Composite composite) {

		patientIDtxt = new Text(composite, SWT.BORDER);
		patientIDtxt.setBounds(10, 13, 50, 21);

		lblPatientID = new Label(composite, SWT.CENTER);
		lblPatientID.setText("Patient ID");
		lblPatientID.setBounds(10, 13, 55, 15);

		appointmentIDtxt = new Text(composite, SWT.BORDER);
		appointmentIDtxt.setBounds(110, 37, 50, 21);

		lblAppointmentID = new Label(composite, SWT.CENTER);
		lblAppointmentID.setText("Appointment ID");
		lblAppointmentID.setBounds(10, 40, 92, 15);

		firstNametxt = new Text(composite, SWT.BORDER);
		firstNametxt.setBounds(110, 64, 50, 21);

		lblFirstName = new Label(composite, SWT.CENTER);
		lblFirstName.setText("First Name");
		lblFirstName.setBounds(10, 67, 65, 15);

		lastNametxt = new Text(composite, SWT.BORDER);
		lastNametxt.setBounds(110, 91, 50, 21);

		lblLastName = new Label(composite, SWT.CENTER);
		lblLastName.setText("Last Name");
		lblLastName.setBounds(10, 94, 65, 15);

		phoneNumbertxt = new Text(composite, SWT.BORDER);
		phoneNumbertxt.setBounds(110, 118, 50, 21);

		lblBirthdate = new Label(composite, SWT.CENTER);
		lblBirthdate.setText("Birthdate");
		lblBirthdate.setBounds(10, 121, 55, 15);

		birthdatetxt = new Text(composite, SWT.BORDER);
		birthdatetxt.setBounds(110, 145, 50, 21);

		lblAddress = new Label(composite, SWT.CENTER);
		lblAddress.setText("Address");
		lblAddress.setBounds(10, 148, 55, 15);

		addresstxt = new Text(composite, SWT.BORDER);
		addresstxt.setBounds(110, 172, 50, 21);

		lblEmail = new Label(composite, SWT.CENTER);
		lblEmail.setText("E-Mail");
		lblEmail.setBounds(10, 175, 55, 15);

		emailtxt = new Text(composite, SWT.BORDER);
		emailtxt.setBounds(110, 199, 50, 21);

		lblPhoneNumber = new Label(composite, SWT.CENTER);
		lblPhoneNumber.setText("Phone Number");
		lblPhoneNumber.setBounds(10, 202, 92, 15);

		insuranceIDtxt = new Text(composite, SWT.BORDER);
		insuranceIDtxt.setBounds(110, 226, 50, 21);

		lblInsuranceID = new Label(composite, SWT.CENTER);
		lblInsuranceID.setText("Insurance ID");
		lblInsuranceID.setBounds(10, 229, 76, 15);

		holderIDtxt = new Text(composite, SWT.BORDER);
		holderIDtxt.setBounds(110, 253, 50, 21);

		lblHolderID = new Label(composite, SWT.CENTER);
		lblHolderID.setText("Holder ID");
		lblHolderID.setBounds(10, 256, 55, 15);

		Button enter = new Button(composite, SWT.PUSH);
		enter.setText("Enter");
		enter.setAlignment(SWT.CENTER);
		enter.setBounds(36, 290, 150, 20);
		enter.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {

				patID = patientIDtxt.getText();
				apptID = appointmentIDtxt.getText();
				fName = firstNametxt.getText();
				lName = lastNametxt.getText();
				bDay = birthdatetxt.getText();
				addy = addresstxt.getText();
				email = emailtxt.getText();
				phoNo = phoneNumbertxt.getText();
				insID = insuranceIDtxt.getText();
				holID = holderIDtxt.getText();

				if (patID.isEmpty() || apptID.isEmpty() || fName.isEmpty() || lName.isEmpty() || bDay.isEmpty()
						|| addy.isEmpty() || email.isEmpty() || phoNo.isEmpty() || insID.isEmpty() || holID.isEmpty()) {
					System.out.println("There is an empty data field.");
				} else {
					System.out.println("\npatID: " + patID);
					System.out.println("apptID: " + apptID);
					System.out.println("fName : " + fName);
					System.out.println("lName : " + lName);
					System.out.println("bDay : " + bDay);
					System.out.println("addy : " + addy);
					System.out.println("email : " + email);
					System.out.println("phoNo : " + phoNo);
					System.out.println("insID : " + insID);
					System.out.println("holID : " + holID);
				}
			}
		});
	}

	private void createDeleteInsuranceCoContents(Composite composite) {

		patientIDtxt = new Text(composite, SWT.BORDER);
		patientIDtxt.setBounds(10, 13, 50, 21);

		lblPatientID = new Label(composite, SWT.CENTER);
		lblPatientID.setText("Patient ID");
		lblPatientID.setBounds(10, 13, 55, 15);

		appointmentIDtxt = new Text(composite, SWT.BORDER);
		appointmentIDtxt.setBounds(110, 37, 50, 21);

		lblAppointmentID = new Label(composite, SWT.CENTER);
		lblAppointmentID.setText("Appointment ID");
		lblAppointmentID.setBounds(10, 40, 92, 15);

		firstNametxt = new Text(composite, SWT.BORDER);
		firstNametxt.setBounds(110, 64, 50, 21);

		lblFirstName = new Label(composite, SWT.CENTER);
		lblFirstName.setText("First Name");
		lblFirstName.setBounds(10, 67, 65, 15);

		lastNametxt = new Text(composite, SWT.BORDER);
		lastNametxt.setBounds(110, 91, 50, 21);

		lblLastName = new Label(composite, SWT.CENTER);
		lblLastName.setText("Last Name");
		lblLastName.setBounds(10, 94, 65, 15);

		phoneNumbertxt = new Text(composite, SWT.BORDER);
		phoneNumbertxt.setBounds(110, 118, 50, 21);

		lblBirthdate = new Label(composite, SWT.CENTER);
		lblBirthdate.setText("Birthdate");
		lblBirthdate.setBounds(10, 121, 55, 15);

		birthdatetxt = new Text(composite, SWT.BORDER);
		birthdatetxt.setBounds(110, 145, 50, 21);

		lblAddress = new Label(composite, SWT.CENTER);
		lblAddress.setText("Address");
		lblAddress.setBounds(10, 148, 55, 15);

		addresstxt = new Text(composite, SWT.BORDER);
		addresstxt.setBounds(110, 172, 50, 21);

		lblEmail = new Label(composite, SWT.CENTER);
		lblEmail.setText("E-Mail");
		lblEmail.setBounds(10, 175, 55, 15);

		emailtxt = new Text(composite, SWT.BORDER);
		emailtxt.setBounds(110, 199, 50, 21);

		lblPhoneNumber = new Label(composite, SWT.CENTER);
		lblPhoneNumber.setText("Phone Number");
		lblPhoneNumber.setBounds(10, 202, 92, 15);

		insuranceIDtxt = new Text(composite, SWT.BORDER);
		insuranceIDtxt.setBounds(110, 226, 50, 21);

		lblInsuranceID = new Label(composite, SWT.CENTER);
		lblInsuranceID.setText("Insurance ID");
		lblInsuranceID.setBounds(10, 229, 76, 15);

		holderIDtxt = new Text(composite, SWT.BORDER);
		holderIDtxt.setBounds(110, 253, 50, 21);

		lblHolderID = new Label(composite, SWT.CENTER);
		lblHolderID.setText("Holder ID");
		lblHolderID.setBounds(10, 256, 55, 15);

		Button enter = new Button(composite, SWT.PUSH);
		enter.setText("Enter");
		enter.setAlignment(SWT.CENTER);
		enter.setBounds(36, 290, 150, 20);
		enter.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {

				patID = patientIDtxt.getText();
				apptID = appointmentIDtxt.getText();
				fName = firstNametxt.getText();
				lName = lastNametxt.getText();
				bDay = birthdatetxt.getText();
				addy = addresstxt.getText();
				email = emailtxt.getText();
				phoNo = phoneNumbertxt.getText();
				insID = insuranceIDtxt.getText();
				holID = holderIDtxt.getText();

				if (patID.isEmpty() || apptID.isEmpty() || fName.isEmpty() || lName.isEmpty() || bDay.isEmpty()
						|| addy.isEmpty() || email.isEmpty() || phoNo.isEmpty() || insID.isEmpty() || holID.isEmpty()) {
					System.out.println("There is an empty data field.");
				} else {
					System.out.println("\npatID: " + patID);
					System.out.println("apptID: " + apptID);
					System.out.println("fName : " + fName);
					System.out.println("lName : " + lName);
					System.out.println("bDay : " + bDay);
					System.out.println("addy : " + addy);
					System.out.println("email : " + email);
					System.out.println("phoNo : " + phoNo);
					System.out.println("insID : " + insID);
					System.out.println("holID : " + holID);
				}
			}
		});
	}

	private void createDeleteInsuranceHolContents(Composite composite) {

		patientIDtxt = new Text(composite, SWT.BORDER);
		patientIDtxt.setBounds(10, 13, 50, 21);

		lblPatientID = new Label(composite, SWT.CENTER);
		lblPatientID.setText("Patient ID");
		lblPatientID.setBounds(10, 13, 55, 15);

		appointmentIDtxt = new Text(composite, SWT.BORDER);
		appointmentIDtxt.setBounds(110, 37, 50, 21);

		lblAppointmentID = new Label(composite, SWT.CENTER);
		lblAppointmentID.setText("Appointment ID");
		lblAppointmentID.setBounds(10, 40, 92, 15);

		firstNametxt = new Text(composite, SWT.BORDER);
		firstNametxt.setBounds(110, 64, 50, 21);

		lblFirstName = new Label(composite, SWT.CENTER);
		lblFirstName.setText("First Name");
		lblFirstName.setBounds(10, 67, 65, 15);

		lastNametxt = new Text(composite, SWT.BORDER);
		lastNametxt.setBounds(110, 91, 50, 21);

		lblLastName = new Label(composite, SWT.CENTER);
		lblLastName.setText("Last Name");
		lblLastName.setBounds(10, 94, 65, 15);

		phoneNumbertxt = new Text(composite, SWT.BORDER);
		phoneNumbertxt.setBounds(110, 118, 50, 21);

		lblBirthdate = new Label(composite, SWT.CENTER);
		lblBirthdate.setText("Birthdate");
		lblBirthdate.setBounds(10, 121, 55, 15);

		birthdatetxt = new Text(composite, SWT.BORDER);
		birthdatetxt.setBounds(110, 145, 50, 21);

		lblAddress = new Label(composite, SWT.CENTER);
		lblAddress.setText("Address");
		lblAddress.setBounds(10, 148, 55, 15);

		addresstxt = new Text(composite, SWT.BORDER);
		addresstxt.setBounds(110, 172, 50, 21);

		lblEmail = new Label(composite, SWT.CENTER);
		lblEmail.setText("E-Mail");
		lblEmail.setBounds(10, 175, 55, 15);

		emailtxt = new Text(composite, SWT.BORDER);
		emailtxt.setBounds(110, 199, 50, 21);

		lblPhoneNumber = new Label(composite, SWT.CENTER);
		lblPhoneNumber.setText("Phone Number");
		lblPhoneNumber.setBounds(10, 202, 92, 15);

		insuranceIDtxt = new Text(composite, SWT.BORDER);
		insuranceIDtxt.setBounds(110, 226, 50, 21);

		lblInsuranceID = new Label(composite, SWT.CENTER);
		lblInsuranceID.setText("Insurance ID");
		lblInsuranceID.setBounds(10, 229, 76, 15);

		holderIDtxt = new Text(composite, SWT.BORDER);
		holderIDtxt.setBounds(110, 253, 50, 21);

		lblHolderID = new Label(composite, SWT.CENTER);
		lblHolderID.setText("Holder ID");
		lblHolderID.setBounds(10, 256, 55, 15);

		Button enter = new Button(composite, SWT.PUSH);
		enter.setText("Enter");
		enter.setAlignment(SWT.CENTER);
		enter.setBounds(36, 290, 150, 20);
		enter.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {

				patID = patientIDtxt.getText();
				apptID = appointmentIDtxt.getText();
				fName = firstNametxt.getText();
				lName = lastNametxt.getText();
				bDay = birthdatetxt.getText();
				addy = addresstxt.getText();
				email = emailtxt.getText();
				phoNo = phoneNumbertxt.getText();
				insID = insuranceIDtxt.getText();
				holID = holderIDtxt.getText();

				if (patID.isEmpty() || apptID.isEmpty() || fName.isEmpty() || lName.isEmpty() || bDay.isEmpty()
						|| addy.isEmpty() || email.isEmpty() || phoNo.isEmpty() || insID.isEmpty() || holID.isEmpty()) {
					System.out.println("There is an empty data field.");
				} else {
					System.out.println("\npatID: " + patID);
					System.out.println("apptID: " + apptID);
					System.out.println("fName : " + fName);
					System.out.println("lName : " + lName);
					System.out.println("bDay : " + bDay);
					System.out.println("addy : " + addy);
					System.out.println("email : " + email);
					System.out.println("phoNo : " + phoNo);
					System.out.println("insID : " + insID);
					System.out.println("holID : " + holID);
				}
			}
		});
	}

	private void createNewPatientContents(Composite composite, Shell shell, Display display) {
		
		composite.setLayout(new GridLayout(2, true));
		composite.setSize(250, 500);
		
		lblPatientID = new Label(composite, SWT.CENTER);
		lblPatientID.setText("Patient ID");
		lblPatientID.setBounds(10, 13, 55, 15);
		patientIDtxt = new Text(composite, SWT.BORDER);
		patientIDtxt.setBounds(110, 10, 76, 21);
		
		lblAppointmentID = new Label(composite, SWT.CENTER);
		lblAppointmentID.setText("Appointment ID");
		lblAppointmentID.setBounds(10, 40, 92, 15);
		appointmentIDtxt = new Text(composite, SWT.BORDER);
		appointmentIDtxt.setBounds(110, 37, 76, 21);

		lblFirstName = new Label(composite, SWT.CENTER);
		lblFirstName.setText("First Name");
		lblFirstName.setBounds(10, 67, 65, 15);
		firstNametxt = new Text(composite, SWT.BORDER);
		firstNametxt.setBounds(110, 64, 76, 21);

		lblLastName = new Label(composite, SWT.CENTER);
		lblLastName.setText("Last Name");
		lblLastName.setBounds(10, 94, 65, 15);
		lastNametxt = new Text(composite, SWT.BORDER);
		lastNametxt.setBounds(110, 91, 76, 21);

		lblPhoneNumber = new Label(composite, SWT.CENTER);
		lblPhoneNumber.setText("Phone Number");
		lblPhoneNumber.setBounds(10, 202, 92, 15);
		phoneNumbertxt = new Text(composite, SWT.BORDER);
		phoneNumbertxt.setBounds(110, 118, 76, 21);

		lblBirthdate = new Label(composite, SWT.CENTER);
		lblBirthdate.setText("Birthdate");
		lblBirthdate.setBounds(10, 121, 55, 15);
		birthdatetxt = new Text(composite, SWT.BORDER);
		birthdatetxt.setBounds(110, 145, 76, 21);

		lblAddress = new Label(composite, SWT.CENTER);
		lblAddress.setText("Address");
		lblAddress.setBounds(10, 148, 55, 15);
		addresstxt = new Text(composite, SWT.BORDER);
		addresstxt.setBounds(110, 172, 76, 21);

		lblEmail = new Label(composite, SWT.CENTER);
		lblEmail.setText("E-Mail");
		lblEmail.setBounds(10, 175, 55, 15);
		emailtxt = new Text(composite, SWT.BORDER);
		emailtxt.setBounds(110, 199, 76, 21);

		lblInsuranceID = new Label(composite, SWT.CENTER);
		lblInsuranceID.setText("Insurance ID");
		lblInsuranceID.setBounds(10, 229, 76, 15);
		insuranceIDtxt = new Text(composite, SWT.BORDER);
		insuranceIDtxt.setBounds(110, 226, 76, 21);
		
		lblHolderID = new Label(composite, SWT.CENTER);
		lblHolderID.setText("Holder ID");
		lblHolderID.setBounds(10, 256, 55, 15);
		holderIDtxt = new Text(composite, SWT.BORDER);
		holderIDtxt.setBounds(110, 253, 76, 21);

		Button enter = new Button(composite, SWT.PUSH);
		enter.setText("Enter");
		enter.setAlignment(SWT.CENTER);
		enter.setBounds(110, 290, 20, 20);
		enter.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {

				patID = patientIDtxt.getText();
				apptID = appointmentIDtxt.getText();
				fName = firstNametxt.getText();
				lName = lastNametxt.getText();
				bDay = birthdatetxt.getText();
				addy = addresstxt.getText();
				email = emailtxt.getText();
				phoNo = phoneNumbertxt.getText();
				insID = insuranceIDtxt.getText();
				holID = holderIDtxt.getText();

				if (patID.isEmpty() || apptID.isEmpty() || fName.isEmpty() || 
						lName.isEmpty() || bDay.isEmpty() || addy.isEmpty() || 
						email.isEmpty() || phoNo.isEmpty() || insID.isEmpty() || 
						holID.isEmpty()) {
					
					System.out.println("There is an empty data field.");
					
					shlwarning = new Shell();
					shlwarning.setSize(179, 110);
					shlwarning.setText("Warning");
					centerWindow(shlwarning);
					
					Button ok = new Button(shlwarning, SWT.PUSH);
					ok.setText("OK");
					ok.setAlignment(SWT.CENTER);
					ok.setBounds(48, 41, 72, 20);
					ok.addSelectionListener(new SelectionListener() 
					 { 
					    @Override 
					    public void widgetSelected(SelectionEvent e) 
					    { 
					       shlwarning.close(); 
					    } 
					
					    @Override 
					    public void widgetDefaultSelected(SelectionEvent e) 
					    { 
					       widgetSelected(e); 
					    } 
					 }); 
					
					Label lblNewLabel = new Label(shlwarning, SWT.NONE);
					lblNewLabel.setBounds(10, 10, 156, 15);
					lblNewLabel.setText("There is an empty data field.");
					
					 shlwarning.open();
					 shlwarning.layout();
					 while (!shlwarning.isDisposed()) {
						 if (!display.readAndDispatch()) {
							display.sleep();
						}
					 }
					
				} else {
					
					System.out.println("patID: " + patID);
					System.out.println("apptID: " + apptID);
					System.out.println("fName : " + fName);
					System.out.println("lName : " + lName);
					System.out.println("bDay : " + bDay);
					System.out.println("addy : " + addy);
					System.out.println("email : " + email);
					System.out.println("phoNo : " + phoNo);
					System.out.println("insID : " + insID);
					System.out.println("holID : " + holID);
					Integer patTemp = Integer.parseInt(patID);
					Integer apptTemp = Integer.parseInt(apptID);
					Integer bdayTemp = Integer.parseInt(bDay);
					Integer phoTemp = Integer.parseInt(phoNo);
					Integer insTemp = Integer.parseInt(insID);
					Integer holTemp = Integer.parseInt(holID);
					patients.add(new patient(patTemp, apptTemp, fName,
							lName, bdayTemp, addy, email,
							phoTemp, insTemp, holTemp));
				
					patID = null;
					apptID = null;
					fName = null;
					lName = null;
					bDay = null;
					addy = null;
					email = null;
					phoNo = null;
					insID = null;
					holID = null;
					
					shell.close();
				}
			}
		});
	}

	private void createNewDoctorContents(Composite composite, Shell shell, Display display) {
		
		composite.setLayout(new GridLayout(2, true));
		composite.setSize(250, 400);
		
		lbldocID = new Label(composite, SWT.CENTER);
		lbldocID.setText("Doc ID");
		lbldocID.setBounds(0, 0, 55, 15);
		docIDtxt = new Text(composite, SWT.BORDER);
		docIDtxt.setBounds(0, 10, 50, 21);

		lblFirstName = new Label(composite, SWT.CENTER);
		lblFirstName.setText("First Name");
		lblFirstName.setBounds(10, 40, 92, 15);
		firstNametxt = new Text(composite, SWT.BORDER);
		firstNametxt.setBounds(0, 10, 30, 20);

		lblLastName = new Label(composite, SWT.CENTER);
		lblLastName.setText("Last Name");
		lblLastName.setBounds(10, 94, 65, 15);
		lastNametxt = new Text(composite, SWT.BORDER);
		lastNametxt.setBounds(110, 91, 50, 21);

		lblspecialty = new Label(composite, SWT.CENTER);
		lblspecialty.setText("Specialty");
		lblspecialty.setBounds(10, 121, 55, 15);
		specialtytxt = new Text(composite, SWT.BORDER);
		specialtytxt.setBounds(110, 118, 50, 21);

		lbldeptID = new Label(composite, SWT.CENTER);
		lbldeptID.setText("Department ID");
		lbldeptID.setBounds(10, 148, 55, 15);
		deptIDtxt = new Text(composite, SWT.BORDER);
		deptIDtxt.setBounds(110, 145, 50, 21);

		lblPhoneNumber = new Label(composite, SWT.CENTER);
		lblPhoneNumber.setText("Phone Number");
		lblPhoneNumber.setBounds(10, 202, 92, 15);
		phoneNumbertxt = new Text(composite, SWT.BORDER);
		phoneNumbertxt.setBounds(110, 199, 50, 21);

		lblEmail = new Label(composite, SWT.CENTER);
		lblEmail.setText("Email");
		lblEmail.setBounds(10, 229, 76, 15);
		emailtxt = new Text(composite, SWT.BORDER);
		emailtxt.setBounds(110, 226, 50, 21);

		Button enter = new Button(composite, SWT.PUSH);
		enter.setText("Enter");
		enter.setAlignment(SWT.CENTER);
		enter.setBounds(36, 290, 150, 20);
		enter.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {

				docID = docIDtxt.getText();
				specialty = specialtytxt.getText();
				fName = firstNametxt.getText();
				lName = lastNametxt.getText();
				email = emailtxt.getText();
				phoNo = phoneNumbertxt.getText();
				deptID = deptIDtxt.getText();

				if (docID.isEmpty() || specialty.isEmpty() || fName.isEmpty() || lName.isEmpty() || email.isEmpty()
						|| phoNo.isEmpty() || deptID.isEmpty()) {
					
					System.out.println("There is an empty data field.");
					
					shlwarning = new Shell();
					shlwarning.setSize(179, 110);
					shlwarning.setText("Warning");
					centerWindow(shlwarning);
					
					Button ok = new Button(shlwarning, SWT.PUSH);
					ok.setText("OK");
					ok.setAlignment(SWT.CENTER);
					ok.setBounds(48, 41, 72, 20);
					ok.addSelectionListener(new SelectionListener() 
					 { 
					    @Override 
					    public void widgetSelected(SelectionEvent e) 
					    { 
					       shlwarning.close(); 
					    } 
					
					    @Override 
					    public void widgetDefaultSelected(SelectionEvent e) 
					    { 
					       widgetSelected(e); 
					    } 
					 }); 
					
					Label lblNewLabel = new Label(shlwarning, SWT.NONE);
					lblNewLabel.setBounds(10, 10, 156, 15);
					lblNewLabel.setText("There is an empty data field.");
					
					 shlwarning.open();
					 shlwarning.layout();
					 while (!shlwarning.isDisposed()) {
						 if (!display.readAndDispatch()) {
							display.sleep();
						}
					 }
					
				} else {
					System.out.println("\n");
					System.out.println("docID: " + docID);
					System.out.println("specialty: " + specialty);
					System.out.println("fName : " + fName);
					System.out.println("lName : " + lName);
					System.out.println("email : " + email);
					System.out.println("phoNo : " + phoNo);
					System.out.println("deptID : " + deptID);
					
					Integer docTemp = Integer.parseInt(docID);
					Integer phoTemp = Integer.parseInt(phoNo);
					Integer deptTemp = Integer.parseInt(deptID);
					
					doctors.add(new doctor(docTemp, fName, lName, 
							specialty, deptTemp, phoTemp, email));
					
					docID = null;
					specialty = null;
					fName = null;
					lName = null;
					email = null;
					phoNo = null;
					deptID = null;
					
					shell.close();
				}
			}
		});
	}

	private void createNewAppointmentContents(Composite composite, Shell shell, Display display) {

		composite.setLayout(new GridLayout(2, true));
		composite.setSize(250, 500);
		
		lblAppointmentID = new Label(composite, SWT.CENTER);
		lblAppointmentID.setText("Appointment ID");
		lblAppointmentID.setBounds(10, 40, 92, 15);
		appointmentIDtxt = new Text(composite, SWT.BORDER);
		appointmentIDtxt.setBounds(110, 37, 76, 21);

		lblentryDate = new Label(composite, SWT.CENTER);
		lblentryDate.setText("Entry Date");
		lblentryDate.setBounds(10, 67, 65, 15);
		entryDatetxt = new Text(composite, SWT.BORDER);
		entryDatetxt.setBounds(110, 64, 76, 21);

		lblexitDate = new Label(composite, SWT.CENTER);
		lblexitDate.setText("Exit Date");
		lblexitDate.setBounds(10, 94, 65, 15);
		exitDatetxt = new Text(composite, SWT.BORDER);
		exitDatetxt.setBounds(110, 91, 76, 21);

		lbldiagnosis = new Label(composite, SWT.CENTER);
		lbldiagnosis.setText("Diagnosis");
		lbldiagnosis.setBounds(10, 202, 92, 15);
		diagnosistxt = new Text(composite, SWT.BORDER);
		diagnosistxt.setBounds(110, 118, 76, 21);

		lblroomID = new Label(composite, SWT.CENTER);
		lblroomID.setText("Room ID");
		lblroomID.setBounds(10, 229, 76, 15);
		roomIDtxt = new Text(composite, SWT.BORDER);
		roomIDtxt.setBounds(110, 226, 76, 21);
		
		lbldocID = new Label(composite, SWT.CENTER);
		lbldocID.setText("Doc ID");
		lbldocID.setBounds(10, 256, 55, 15);
		docIDtxt = new Text(composite, SWT.BORDER);
		docIDtxt.setBounds(110, 253, 76, 21);

		Button enter = new Button(composite, SWT.PUSH);
		enter.setText("Enter");
		enter.setAlignment(SWT.CENTER);
		enter.setBounds(110, 290, 20, 20);
		enter.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {

				apptID = appointmentIDtxt.getText();
				entryDate = entryDatetxt.getText();
				exitDate = exitDatetxt.getText();
				diagnosis = diagnosistxt.getText();
				roomID = roomIDtxt.getText();
				docID = docIDtxt.getText();

				if (apptID.isEmpty() || entryDate.isEmpty() || exitDate.isEmpty() || 
						diagnosis.isEmpty() || roomID.isEmpty() || docID.isEmpty()) {
					
					System.out.println("There is an empty data field.");
					
					shlwarning = new Shell();
					shlwarning.setSize(179, 110);
					shlwarning.setText("Warning");
					centerWindow(shlwarning);
					
					Button ok = new Button(shlwarning, SWT.PUSH);
					ok.setText("OK");
					ok.setAlignment(SWT.CENTER);
					ok.setBounds(48, 41, 72, 20);
					ok.addSelectionListener(new SelectionListener() 
					 { 
					    @Override 
					    public void widgetSelected(SelectionEvent e) 
					    { 
					       shlwarning.close(); 
					    } 
					
					    @Override 
					    public void widgetDefaultSelected(SelectionEvent e) 
					    { 
					       widgetSelected(e); 
					    } 
					 }); 
					
					Label lblNewLabel = new Label(shlwarning, SWT.NONE);
					lblNewLabel.setBounds(10, 10, 156, 15);
					lblNewLabel.setText("There is an empty data field.");
					
					 shlwarning.open();
					 shlwarning.layout();
					 while (!shlwarning.isDisposed()) {
						 if (!display.readAndDispatch()) {
							display.sleep();
						}
					 }
					
				} else {
					System.out.println("\n");
					System.out.println("apptID: " + apptID);
					System.out.println("entryDate: " + entryDate);
					System.out.println("exitDate : " + exitDate);
					System.out.println("diagnosis : " + diagnosis);
					System.out.println("roomID : " + roomID);
					System.out.println("docID : " + docID);
					
					Integer apptTemp = Integer.parseInt(apptID);
					Integer entTemp = Integer.parseInt(entryDate);
					Integer exitTemp = Integer.parseInt(exitDate);
					Integer roomTemp = Integer.parseInt(roomID);
					Integer docTemp = Integer.parseInt(docID);
					
					appointments.add(new appointment(apptTemp, entTemp, exitTemp, 
							diagnosis, roomTemp, docTemp));
					
					apptID = null;
					entryDate = null;
					exitDate = null;
					diagnosis = null;
					roomID = null;
					docID = null;
					
					shell.close();
				}

				
			}
		});
	}

	private void createNewEquipmentContents(Composite composite,Shell shell, Display display) {

		composite.setLayout(new GridLayout(2, true));
		composite.setSize(250, 500);
		
		lblequipID = new Label(composite, SWT.CENTER);
		lblequipID.setText("Equipment ID");
		lblequipID.setBounds(10, 40, 92, 15);
		equipIDtxt = new Text(composite, SWT.BORDER);
		equipIDtxt.setBounds(110, 37, 76, 21);

		lblroomID = new Label(composite, SWT.CENTER);
		lblroomID.setText("Room ID");
		lblroomID.setBounds(10, 67, 65, 15);
		roomIDtxt = new Text(composite, SWT.BORDER);
		roomIDtxt.setBounds(110, 64, 76, 21);

		lblname = new Label(composite, SWT.CENTER);
		lblname.setText("Item Name");
		lblname.setBounds(10, 94, 65, 15);
		nametxt = new Text(composite, SWT.BORDER);
		nametxt.setBounds(110, 91, 76, 21);
		
		Button enter = new Button(composite, SWT.PUSH);
		enter.setText("Enter");
		enter.setAlignment(SWT.CENTER);
		enter.setBounds(110, 290, 20, 20);
		enter.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {

				equipID = equipIDtxt.getText();
				roomID = roomIDtxt.getText();
				name = nametxt.getText();

				if (equipID.isEmpty() || roomID.isEmpty() || name.isEmpty()) {
					
					System.out.println("There is an empty data field.");
					
					shlwarning = new Shell();
					shlwarning.setSize(179, 110);
					shlwarning.setText("Warning");
					centerWindow(shlwarning);
					
					Button ok = new Button(shlwarning, SWT.PUSH);
					ok.setText("OK");
					ok.setAlignment(SWT.CENTER);
					ok.setBounds(48, 41, 72, 20);
					ok.addSelectionListener(new SelectionListener() 
					 { 
					    @Override 
					    public void widgetSelected(SelectionEvent e) 
					    { 
					       shlwarning.close(); 
					    } 
					
					    @Override 
					    public void widgetDefaultSelected(SelectionEvent e) 
					    { 
					       widgetSelected(e); 
					    } 
					 }); 
					
					Label lblNewLabel = new Label(shlwarning, SWT.NONE);
					lblNewLabel.setBounds(10, 10, 156, 15);
					lblNewLabel.setText("There is an empty data field.");
					
					 shlwarning.open();
					 shlwarning.layout();
					 while (!shlwarning.isDisposed()) {
						 if (!display.readAndDispatch()) {
							display.sleep();
						}
					 }
					
				} else {
					System.out.println("\n");
					System.out.println("equipID: " + equipID);
					System.out.println("roomID: " + roomID);
					System.out.println("name: " + name);
					
					Integer equipTemp = Integer.parseInt(equipID);
					Integer roomTemp = Integer.parseInt(roomID);
					equipment.add(new equipment(equipTemp, roomTemp, name));
				
					equipID = null;
					roomID = null;
					name = null;
					
					shell.close();
				}
			}
		});
	}

	private void createNewDepartmentContents(Composite composite, Shell shell, Display display) {

		composite.setLayout(new GridLayout(2, true));
		composite.setSize(250, 500);
		
		lbldeptID = new Label(composite, SWT.CENTER);
		lbldeptID.setText("Department ID");
		lbldeptID.setBounds(10, 40, 92, 15);
		deptIDtxt = new Text(composite, SWT.BORDER);
		deptIDtxt.setBounds(110, 37, 76, 21);

		lblrmsAvail = new Label(composite, SWT.CENTER);
		lblrmsAvail.setText("Rooms Available");
		lblrmsAvail.setBounds(10, 67, 65, 15);
		rmsAvailtxt = new Text(composite, SWT.BORDER);
		rmsAvailtxt.setBounds(110, 64, 76, 21);

		lblrms= new Label(composite, SWT.CENTER);
		lblrms.setText("Total Rooms");
		lblrms.setBounds(10, 94, 65, 15);
		rmstxt = new Text(composite, SWT.BORDER);
		rmstxt.setBounds(110, 91, 76, 21);
		
		lblflrNo = new Label(composite, SWT.CENTER);
		lblflrNo.setText("Floor Number");
		lblflrNo.setBounds(10, 94, 65, 15);
		flrNotxt = new Text(composite, SWT.BORDER);
		flrNotxt.setBounds(110, 91, 76, 21);
		
		Button enter = new Button(composite, SWT.PUSH);
		enter.setText("Enter");
		enter.setAlignment(SWT.CENTER);
		enter.setBounds(110, 290, 20, 20);
		enter.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {

				deptID = deptIDtxt.getText();
				rmsAvail = rmsAvailtxt.getText();
				rms = rmstxt.getText();
				flrNo = flrNotxt.getText();

				if (deptID.isEmpty() || rmsAvail.isEmpty() || 
						rms.isEmpty() || flrNo.isEmpty()) {
					
					System.out.println("There is an empty data field.");
					
					shlwarning = new Shell();
					shlwarning.setSize(179, 110);
					shlwarning.setText("Warning");
					centerWindow(shlwarning);
					
					Button ok = new Button(shlwarning, SWT.PUSH);
					ok.setText("OK");
					ok.setAlignment(SWT.CENTER);
					ok.setBounds(48, 41, 72, 20);
					ok.addSelectionListener(new SelectionListener() 
					 { 
					    @Override 
					    public void widgetSelected(SelectionEvent e) 
					    { 
					       shlwarning.close(); 
					    } 
					
					    @Override 
					    public void widgetDefaultSelected(SelectionEvent e) 
					    { 
					       widgetSelected(e); 
					    } 
					 }); 
					
					Label lblNewLabel = new Label(shlwarning, SWT.NONE);
					lblNewLabel.setBounds(10, 10, 156, 15);
					lblNewLabel.setText("There is an empty data field.");
					
					 shlwarning.open();
					 shlwarning.layout();
					 while (!shlwarning.isDisposed()) {
						 if (!display.readAndDispatch()) {
							display.sleep();
						}
					 }
					
				} else {
					System.out.println("\n");
					System.out.println("deptID: " + deptID);
					System.out.println("rmsAvail: " + rmsAvail);
					System.out.println("rms : " + rms);
					System.out.println("flrNo : " + flrNo);
					
					Integer deptTemp = Integer.parseInt(deptID);
					Integer rmAvTemp = Integer.parseInt(rmsAvail);
					Integer rmTemp = Integer.parseInt(rms);
					Integer flrTemp = Integer.parseInt(flrNo);
					
					departments.add(new department(deptTemp, rmAvTemp, rmTemp, flrTemp));
					
					deptID = null;
					rmsAvail = null;
					rms = null;
					flrNo = null;
					
					shell.close();
				}
			}
		});
	}

	private void createNewRoomContents(Composite composite, Shell shell, Display display) {

		composite.setLayout(new GridLayout(2, true));
		composite.setSize(250, 500);
		
		lblroomID = new Label(composite, SWT.CENTER);
		lblroomID.setText("Room ID");
		lblroomID.setBounds(10, 40, 92, 15);
		roomIDtxt = new Text(composite, SWT.BORDER);
		roomIDtxt.setBounds(110, 37, 76, 21);

		lblbedsAvail = new Label(composite, SWT.CENTER);
		lblbedsAvail.setText("Beds Available");
		lblbedsAvail.setBounds(10, 67, 65, 15);
		bedsAvailtxt = new Text(composite, SWT.BORDER);
		bedsAvailtxt.setBounds(110, 64, 76, 21);

		lblnumPats = new Label(composite, SWT.CENTER);
		lblnumPats.setText("Number of Patients");
		lblnumPats.setBounds(10, 94, 65, 15);
		numPatstxt = new Text(composite, SWT.BORDER);
		numPatstxt.setBounds(110, 91, 76, 21);
		
		lbldeptID = new Label(composite, SWT.CENTER);
		lbldeptID.setText("Department ID");
		lbldeptID.setBounds(10, 94, 65, 15);
		deptIDtxt = new Text(composite, SWT.BORDER);
		deptIDtxt.setBounds(110, 91, 76, 21);
		
		Button enter = new Button(composite, SWT.PUSH);
		enter.setText("Enter");
		enter.setAlignment(SWT.CENTER);
		enter.setBounds(110, 290, 20, 20);
		enter.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {

				roomID = roomIDtxt.getText();
				bedsAvail = bedsAvailtxt.getText();
				numPats = numPatstxt.getText();
				deptID = deptIDtxt.getText();

				if (deptID.isEmpty() || numPats.isEmpty() || 
						bedsAvail.isEmpty() || roomID.isEmpty()) {
					
					System.out.println("There is an empty data field.");
					
					shlwarning = new Shell();
					shlwarning.setSize(179, 110);
					shlwarning.setText("Warning");
					centerWindow(shlwarning);
					
					Button ok = new Button(shlwarning, SWT.PUSH);
					ok.setText("OK");
					ok.setAlignment(SWT.CENTER);
					ok.setBounds(48, 41, 72, 20);
					ok.addSelectionListener(new SelectionListener() 
					 { 
					    @Override 
					    public void widgetSelected(SelectionEvent e) 
					    { 
					       shlwarning.close(); 
					    } 
					
					    @Override 
					    public void widgetDefaultSelected(SelectionEvent e) 
					    { 
					       widgetSelected(e); 
					    } 
					 }); 
					
					Label lblNewLabel = new Label(shlwarning, SWT.NONE);
					lblNewLabel.setBounds(10, 10, 156, 15);
					lblNewLabel.setText("There is an empty data field.");
					
					 shlwarning.open();
					 shlwarning.layout();
					 while (!shlwarning.isDisposed()) {
						 if (!display.readAndDispatch()) {
							display.sleep();
						}
					 }
					
				} else {
					System.out.println("\n");
					System.out.println("roomID: " + roomID);
					System.out.println("bedsAvail: " + bedsAvail);
					System.out.println("numPats : " + numPats);
					System.out.println("deptID : " + deptID);

					Integer rmTemp = Integer.parseInt(roomID);
					Integer bedTemp = Integer.parseInt(bedsAvail);
					Integer numTemp = Integer.parseInt(numPats);
					Integer deptTemp = Integer.parseInt(deptID);
					
					rooms.add(new room(rmTemp, bedTemp, numTemp, deptTemp));
					
					roomID = null;
					bedsAvail = null;
					numPats = null;
					deptID = null;
					
					shell.close();
				}
			}
		});
	}

	private void createNewInsuranceCoContents(Composite composite, Shell shell, Display display) {

		composite.setLayout(new GridLayout(2, true));
		composite.setSize(250, 500);
		
		lblcoID = new Label(composite, SWT.CENTER);
		lblcoID.setText("Company ID");
		lblcoID.setBounds(10, 40, 92, 15);
		coIDtxt = new Text(composite, SWT.BORDER);
		coIDtxt.setBounds(110, 37, 76, 21);

		lblinsName = new Label(composite, SWT.CENTER);
		lblinsName.setText("Insurance Company Name");
		lblinsName.setBounds(10, 67, 65, 15);
		insNametxt = new Text(composite, SWT.BORDER);
		insNametxt.setBounds(110, 64, 76, 21);

		lblAddress = new Label(composite, SWT.CENTER);
		lblAddress.setText("Address");
		lblAddress.setBounds(10, 94, 65, 15);
		addresstxt = new Text(composite, SWT.BORDER);
		addresstxt.setBounds(110, 91, 76, 21);
		
		lblPhoneNumber = new Label(composite, SWT.CENTER);
		lblPhoneNumber.setText("Phone Number");
		lblPhoneNumber.setBounds(10, 94, 65, 15);
		phoneNumbertxt = new Text(composite, SWT.BORDER);
		phoneNumbertxt.setBounds(110, 91, 76, 21);
		
		Button enter = new Button(composite, SWT.PUSH);
		enter.setText("Enter");
		enter.setAlignment(SWT.CENTER);
		enter.setBounds(110, 290, 20, 20);
		enter.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {

				coID = coIDtxt.getText();
				insName = insNametxt.getText();
				addy = addresstxt.getText();
				phoNo = phoneNumbertxt.getText();

				if (coID.isEmpty() || insName.isEmpty() || 
						addy.isEmpty() || phoNo.isEmpty()) {
					
					System.out.println("There is an empty data field.");
					
					shlwarning = new Shell();
					shlwarning.setSize(179, 110);
					shlwarning.setText("Warning");
					centerWindow(shlwarning);
					
					Button ok = new Button(shlwarning, SWT.PUSH);
					ok.setText("OK");
					ok.setAlignment(SWT.CENTER);
					ok.setBounds(48, 41, 72, 20);
					ok.addSelectionListener(new SelectionListener() 
					 { 
					    @Override 
					    public void widgetSelected(SelectionEvent e) 
					    { 
					       shlwarning.close(); 
					    } 
					
					    @Override 
					    public void widgetDefaultSelected(SelectionEvent e) 
					    { 
					       widgetSelected(e); 
					    } 
					 }); 
					
					Label lblNewLabel = new Label(shlwarning, SWT.NONE);
					lblNewLabel.setBounds(10, 10, 156, 15);
					lblNewLabel.setText("There is an empty data field.");
					
					 shlwarning.open();
					 shlwarning.layout();
					 while (!shlwarning.isDisposed()) {
						 if (!display.readAndDispatch()) {
							display.sleep();
						}
					 }
					
				} else {
					System.out.println("\n");
					System.out.println("coID: " + coID);
					System.out.println("insName: " + insName);
					System.out.println("addy : " + addy);
					System.out.println("phoNo : " + phoNo);
					
					Integer coTemp = Integer.parseInt(coID);
					Integer phoTemp = Integer.parseInt(phoNo);
					
					insuranceCompanies.add(new insuranceCompany(coTemp, insName, addy, phoTemp));

					coID = null;
					insName = null;
					addy = null;
					phoNo = null;
					
					shell.close();
				}
			}
		});
	}

	private void createNewInsuranceHolContents(Composite composite, Shell shell, Display display) {

		composite.setLayout(new GridLayout(2, true));
		composite.setSize(250, 500);
		
		lblHolderID = new Label(composite, SWT.CENTER);
		lblHolderID.setText("Holder ID");
		lblHolderID.setBounds(10, 40, 92, 15);
		holderIDtxt = new Text(composite, SWT.BORDER);
		holderIDtxt.setBounds(110, 37, 76, 21);

		lblFirstName = new Label(composite, SWT.CENTER);
		lblFirstName.setText("First Name");
		lblFirstName.setBounds(10, 67, 65, 15);
		firstNametxt = new Text(composite, SWT.BORDER);
		firstNametxt.setBounds(110, 64, 76, 21);

		lblLastName = new Label(composite, SWT.CENTER);
		lblLastName.setText("Last Name");
		lblLastName.setBounds(10, 94, 65, 15);
		lastNametxt = new Text(composite, SWT.BORDER);
		lastNametxt.setBounds(110, 91, 76, 21);

		lblcoID = new Label(composite, SWT.CENTER);
		lblcoID.setText("Company ID");
		lblcoID.setBounds(10, 40, 92, 15);
		coIDtxt = new Text(composite, SWT.BORDER);
		coIDtxt.setBounds(110, 37, 76, 21);

		lblgroNo = new Label(composite, SWT.CENTER);
		lblgroNo.setText("Group Number");
		lblgroNo.setBounds(10, 229, 76, 15);
		groNotxt = new Text(composite, SWT.BORDER);
		groNotxt.setBounds(110, 226, 76, 21);
		
		lblexpDate = new Label(composite, SWT.CENTER);
		lblexpDate.setText("Expiration Date");
		lblexpDate.setBounds(10, 256, 55, 15);
		expDatetxt = new Text(composite, SWT.BORDER);
		expDatetxt.setBounds(110, 253, 76, 21);

		Button enter = new Button(composite, SWT.PUSH);
		enter.setText("Enter");
		enter.setAlignment(SWT.CENTER);
		enter.setBounds(110, 290, 20, 20);
		enter.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {

				holID = holderIDtxt.getText();
				fName = firstNametxt.getText();
				lName = lastNametxt.getText();
				coID = coIDtxt.getText();
				groNo = groNotxt.getText();
				expDate = expDatetxt.getText();

				if (holID.isEmpty() || fName.isEmpty() || lName.isEmpty() || 
						coID.isEmpty() || groNo.isEmpty() || expDate.isEmpty()) {
					
					System.out.println("There is an empty data field.");
					
					shlwarning = new Shell();
					shlwarning.setSize(179, 110);
					shlwarning.setText("Warning");
					centerWindow(shlwarning);
					
					Button ok = new Button(shlwarning, SWT.PUSH);
					ok.setText("OK");
					ok.setAlignment(SWT.CENTER);
					ok.setBounds(48, 41, 72, 20);
					ok.addSelectionListener(new SelectionListener() 
					 { 
					    @Override 
					    public void widgetSelected(SelectionEvent e) 
					    { 
					       shlwarning.close(); 
					    } 
					
					    @Override 
					    public void widgetDefaultSelected(SelectionEvent e) 
					    { 
					       widgetSelected(e); 
					    } 
					 }); 
					
					Label lblNewLabel = new Label(shlwarning, SWT.NONE);
					lblNewLabel.setBounds(10, 10, 156, 15);
					lblNewLabel.setText("There is an empty data field.");
					
					 shlwarning.open();
					 shlwarning.layout();
					 while (!shlwarning.isDisposed()) {
						 if (!display.readAndDispatch()) {
							display.sleep();
						}
					 }
					
				} else {
					System.out.println("\n");
					System.out.println("holID: " + holID);
					System.out.println("fName: " + fName);
					System.out.println("lName: " + lName);
					System.out.println("coID: " + coID);
					System.out.println("groNo: " + groNo);
					System.out.println("expDate: " + expDate);
					

					Integer holTemp = Integer.parseInt(holID);
					Integer coTemp = Integer.parseInt(coID);
					Integer groTemp = Integer.parseInt(groNo);
					Integer expTemp = Integer.parseInt(expDate);
					
					insuranceHolders.add(new insuranceHolder(coTemp, fName, lName, coTemp, groTemp, expTemp));
					
					holID = null;
					fName = null;
					lName = null;
					coID = null;
					groNo = null;
					expDate = null;
					
					shell.close();
				}
			}
		});
	}

	private void createPatientContents(Composite composite) {
		
		composite.setLayout(new FillLayout());

		// Create the table
		final Table table = new Table(composite, SWT.NONE);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		// Create each of the columns, adding an event
		// listener that will set the appropriate fields
		// into the comparator and then call the fillTable
		// helper method

		TableColumn[] columns = new TableColumn[10];
		columns[0] = new TableColumn(table, SWT.NONE);
		columns[0].setText("Patient ID");
		columns[0].addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				pComparator.setColumn(patientComparator.PAT_ID);
				pComparator.reverseDirection();
				fillPatientTable(table);
			}
		});

		columns[1] = new TableColumn(table, SWT.RIGHT);
		columns[1].setText("Appointment ID");
		columns[1].addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				pComparator.setColumn(patientComparator.APPT_ID);
				pComparator.reverseDirection();
				fillPatientTable(table);
			}
		});

		columns[2] = new TableColumn(table, SWT.NONE);
		columns[2].setText("First Name");
		columns[2].addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				pComparator.setColumn(patientComparator.FIRST_NAME);
				pComparator.reverseDirection();
				fillPatientTable(table);
			}
		});

		columns[3] = new TableColumn(table, SWT.NONE);
		columns[3].setText("Last Name");
		columns[3].addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				pComparator.setColumn(patientComparator.LAST_NAME);
				pComparator.reverseDirection();
				fillPatientTable(table);
			}
		});

		columns[4] = new TableColumn(table, SWT.RIGHT);
		columns[4].setText("Birthdate");
		columns[4].addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				pComparator.setColumn(patientComparator.BIRTHDATE);
				pComparator.reverseDirection();
				fillPatientTable(table);
			}
		});

		columns[5] = new TableColumn(table, SWT.RIGHT);
		columns[5].setText("Address");
		columns[5].addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				pComparator.setColumn(patientComparator.ADDRESS);
				pComparator.reverseDirection();
				fillPatientTable(table);
			}
		});

		columns[6] = new TableColumn(table, SWT.RIGHT);
		columns[6].setText("Email");
		columns[6].addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				pComparator.setColumn(patientComparator.EMAIL);
				pComparator.reverseDirection();
				fillPatientTable(table);
			}
		});

		columns[7] = new TableColumn(table, SWT.RIGHT);
		columns[7].setText("Phone Number");
		columns[7].addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				pComparator.setColumn(patientComparator.PHONE_NO);
				pComparator.reverseDirection();
				fillPatientTable(table);
			}
		});

		columns[8] = new TableColumn(table, SWT.RIGHT);
		columns[8].setText("Insurance ID");
		columns[8].addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				pComparator.setColumn(patientComparator.INS_ID);
				pComparator.reverseDirection();
				fillPatientTable(table);
			}
		});

		columns[9] = new TableColumn(table, SWT.RIGHT);
		columns[9].setText("Holder ID");
		columns[9].addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				pComparator.setColumn(patientComparator.HOLDER_ID);
				pComparator.reverseDirection();
				fillPatientTable(table);
			}
		});

		// Do the initial fill of the table
		fillPatientTable(table);

		// Pack each column so inital display is good
		for (int i = 0, n = columns.length; i < n; i++) {
			columns[i].pack();
		}
	}

	private void createDoctorContents(Composite composite) {
		composite.setLayout(new FillLayout());

		// Create the table
		final Table table = new Table(composite, SWT.NONE);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		// Create each of the columns, adding an event
		// listener that will set the appropriate fields
		// into the comparator and then call the fillTable
		// helper method

		TableColumn[] columns = new TableColumn[7];
		columns[0] = new TableColumn(table, SWT.NONE);
		columns[0].setText("Doc ID");
		columns[0].addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				doComparator.setColumn(doctorComparator.DOC_ID);
				doComparator.reverseDirection();
				fillDoctorTable(table);
			}
		});

		columns[1] = new TableColumn(table, SWT.RIGHT);
		columns[1].setText("First Name");
		columns[1].addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				doComparator.setColumn(doctorComparator.FIRST_NAME);
				doComparator.reverseDirection();
				fillDoctorTable(table);
			}
		});

		columns[2] = new TableColumn(table, SWT.NONE);
		columns[2].setText("Last Name");
		columns[2].addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				doComparator.setColumn(doctorComparator.LAST_NAME);
				doComparator.reverseDirection();
				fillDoctorTable(table);
			}
		});

		columns[3] = new TableColumn(table, SWT.NONE);
		columns[3].setText("Specialty");
		columns[3].addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				doComparator.setColumn(doctorComparator.SPECIALTY);
				doComparator.reverseDirection();
				fillDoctorTable(table);
			}
		});

		columns[4] = new TableColumn(table, SWT.RIGHT);
		columns[4].setText("Department ID");
		columns[4].addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				doComparator.setColumn(doctorComparator.DEPT_ID);
				doComparator.reverseDirection();
				fillDoctorTable(table);
			}
		});

		columns[5] = new TableColumn(table, SWT.RIGHT);
		columns[5].setText("Phone Number");
		columns[5].addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				doComparator.setColumn(doctorComparator.PHONE_NO);
				doComparator.reverseDirection();
				fillDoctorTable(table);
			}
		});

		columns[6] = new TableColumn(table, SWT.RIGHT);
		columns[6].setText("Email");
		columns[6].addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				doComparator.setColumn(doctorComparator.EMAIL);
				doComparator.reverseDirection();
				fillDoctorTable(table);
			}
		});

		// Do the initial fill of the table
		fillDoctorTable(table);

		// Pack each column so inital display is good
		for (int i = 0, n = columns.length; i < n; i++) {
			columns[i].pack();
		}
	}

	private void createAppointmentContents(Composite composite) {
		composite.setLayout(new FillLayout());

		// Create the table
		final Table table = new Table(composite, SWT.NONE);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		// Create each of the columns, adding an event
		// listener that will set the appropriate fields
		// into the comparator and then call the fillTable
		// helper method

		TableColumn[] columns = new TableColumn[6];
		columns[0] = new TableColumn(table, SWT.NONE);
		columns[0].setText("Appointment ID");
		columns[0].addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				aComparator.setColumn(appointmentComparator.APPT_ID);
				aComparator.reverseDirection();
				fillAppointmentTable(table);
			}
		});

		columns[1] = new TableColumn(table, SWT.RIGHT);
		columns[1].setText("Entry Date");
		columns[1].addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				aComparator.setColumn(appointmentComparator.ENTRY_DATE);
				aComparator.reverseDirection();
				fillAppointmentTable(table);
			}
		});

		columns[2] = new TableColumn(table, SWT.NONE);
		columns[2].setText("Exit Date");
		columns[2].addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				aComparator.setColumn(appointmentComparator.EXIT_DATE);
				aComparator.reverseDirection();
				fillAppointmentTable(table);
			}
		});

		columns[3] = new TableColumn(table, SWT.NONE);
		columns[3].setText("Diagnosis");
		columns[3].addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				aComparator.setColumn(appointmentComparator.DIAGNOSIS);
				aComparator.reverseDirection();
				fillAppointmentTable(table);
			}
		});

		columns[4] = new TableColumn(table, SWT.RIGHT);
		columns[4].setText("Room ID");
		columns[4].addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				aComparator.setColumn(appointmentComparator.ROOM_ID);
				aComparator.reverseDirection();
				fillAppointmentTable(table);
			}
		});

		columns[5] = new TableColumn(table, SWT.RIGHT);
		columns[5].setText("Doctor ID");
		columns[5].addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				aComparator.setColumn(appointmentComparator.DOC_ID);
				aComparator.reverseDirection();
				fillAppointmentTable(table);
			}
		});

		// Do the initial fill of the table
		fillAppointmentTable(table);

		// Pack each column so inital display is good
		for (int i = 0, n = columns.length; i < n; i++) {
			columns[i].pack();
		}
	}

	private void createRoomContents(Composite composite) {
		composite.setLayout(new FillLayout());

		// Create the table
		final Table table = new Table(composite, SWT.NONE);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		// Create each of the columns, adding an event
		// listener that will set the appropriate fields
		// into the comparator and then call the fillTable
		// helper method

		TableColumn[] columns = new TableColumn[4];
		columns[0] = new TableColumn(table, SWT.NONE);
		columns[0].setText("Room ID");
		columns[0].addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				rComparator.setColumn(roomComparator.ROOM_ID);
				rComparator.reverseDirection();
				fillRoomTable(table);
			}
		});

		columns[1] = new TableColumn(table, SWT.RIGHT);
		columns[1].setText("Beds Available");
		columns[1].addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				rComparator.setColumn(roomComparator.BEDS_AVAILABLE);
				rComparator.reverseDirection();
				fillRoomTable(table);
			}
		});

		columns[2] = new TableColumn(table, SWT.NONE);
		columns[2].setText("Number of Patients");
		columns[2].addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				rComparator.setColumn(roomComparator.NUM_PATIENTS);
				rComparator.reverseDirection();
				fillRoomTable(table);
			}
		});

		columns[3] = new TableColumn(table, SWT.NONE);
		columns[3].setText("Department ID");
		columns[3].addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				rComparator.setColumn(roomComparator.DEPT_ID);
				rComparator.reverseDirection();
				fillRoomTable(table);
			}
		});

		// Do the initial fill of the table
		fillRoomTable(table);

		// Pack each column so inital display is good
		for (int i = 0, n = columns.length; i < n; i++) {
			columns[i].pack();
		}
	}

	private void createEquipmentContents(Composite composite) {
		composite.setLayout(new FillLayout());

		// Create the table
		final Table table = new Table(composite, SWT.NONE);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		// Create each of the columns, adding an event
		// listener that will set the appropriate fields
		// into the comparator and then call the fillTable
		// helper method

		TableColumn[] columns = new TableColumn[3];
		columns[0] = new TableColumn(table, SWT.NONE);
		columns[0].setText("Equipment ID");
		columns[0].addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				eComparator.setColumn(equipmentComparator.EQUIPMENT_ID);
				eComparator.reverseDirection();
				fillEquipmentTable(table);
			}
		});

		columns[1] = new TableColumn(table, SWT.RIGHT);
		columns[1].setText("Room ID");
		columns[1].addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				eComparator.setColumn(equipmentComparator.ROOM_ID);
				eComparator.reverseDirection();
				fillEquipmentTable(table);
			}
		});

		columns[2] = new TableColumn(table, SWT.NONE);
		columns[2].setText("Item Name");
		columns[2].addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				eComparator.setColumn(equipmentComparator.NAME);
				eComparator.reverseDirection();
				fillEquipmentTable(table);
			}
		});

		// Do the initial fill of the table
		fillEquipmentTable(table);

		// Pack each column so inital display is good
		for (int i = 0, n = columns.length; i < n; i++) {
			columns[i].pack();
		}
	}

	private void createInsuranceCoContents(Composite composite) {
		composite.setLayout(new FillLayout());

		// Create the table
		final Table table = new Table(composite, SWT.NONE);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		// Create each of the columns, adding an event
				// listener that will set the appropriate fields
				// into the comparator and then call the fillTable
				// helper method

				TableColumn[] columns = new TableColumn[4];
				columns[0] = new TableColumn(table, SWT.NONE);
				columns[0].setText("Company ID");
				columns[0].addSelectionListener(new SelectionAdapter() {
					public void widgetSelected(SelectionEvent event) {
						cComparator.setColumn(insuranceCoComparator.CO_ID);
						cComparator.reverseDirection();
						fillInsuranceCoTable(table);
					}
				});

				columns[1] = new TableColumn(table, SWT.RIGHT);
				columns[1].setText("Insurance Company Name");
				columns[1].addSelectionListener(new SelectionAdapter() {
					public void widgetSelected(SelectionEvent event) {
						cComparator.setColumn(insuranceCoComparator.INS_NAME);
						cComparator.reverseDirection();
						fillInsuranceCoTable(table);
					}
				});

				columns[2] = new TableColumn(table, SWT.NONE);
				columns[2].setText("Address");
				columns[2].addSelectionListener(new SelectionAdapter() {
					public void widgetSelected(SelectionEvent event) {
						cComparator.setColumn(insuranceCoComparator.ADDRESS);
						cComparator.reverseDirection();
						fillInsuranceCoTable(table);
					}
				});

				columns[3] = new TableColumn(table, SWT.NONE);
				columns[3].setText("Phone Number");
				columns[3].addSelectionListener(new SelectionAdapter() {
					public void widgetSelected(SelectionEvent event) {
						cComparator.setColumn(insuranceCoComparator.PHONE_NO);
						cComparator.reverseDirection();
						fillInsuranceCoTable(table);
					}
				});

				// Do the initial fill of the table
				fillInsuranceCoTable(table);

				// Pack each column so inital display is good
				for (int i = 0, n = columns.length; i < n; i++) {
					columns[i].pack();
				}
			}

			private void createDepartmentContents(Composite composite) {
				composite.setLayout(new FillLayout());

				// Create the table
				final Table table = new Table(composite, SWT.NONE);
				table.setHeaderVisible(true);
				table.setLinesVisible(true);

				// Create each of the columns, adding an event
				// listener that will set the appropriate fields
				// into the comparator and then call the fillTable
				// helper method

				TableColumn[] columns = new TableColumn[4];
				columns[0] = new TableColumn(table, SWT.NONE);
				columns[0].setText("Department ID");
				columns[0].addSelectionListener(new SelectionAdapter() {
					public void widgetSelected(SelectionEvent event) {
						deComparator.setColumn(departmentComparator.DEPT_ID);
						deComparator.reverseDirection();
						fillDepartmentTable(table);
					}
				});

				columns[1] = new TableColumn(table, SWT.RIGHT);
				columns[1].setText("Rooms Available");
				columns[1].addSelectionListener(new SelectionAdapter() {
					public void widgetSelected(SelectionEvent event) {
						deComparator.setColumn(departmentComparator.ROOMS_AVAILABLE);
						deComparator.reverseDirection();
						fillDepartmentTable(table);
					}
				});

				columns[2] = new TableColumn(table, SWT.NONE);
				columns[2].setText("Total Rooms");
				columns[2].addSelectionListener(new SelectionAdapter() {
					public void widgetSelected(SelectionEvent event) {
						deComparator.setColumn(departmentComparator.ROOMS);
						deComparator.reverseDirection();
						fillDepartmentTable(table);
					}
				});

				columns[3] = new TableColumn(table, SWT.NONE);
				columns[3].setText("Floor Number");
				columns[3].addSelectionListener(new SelectionAdapter() {
					public void widgetSelected(SelectionEvent event) {
						deComparator.setColumn(departmentComparator.FLOOR_NO);
						deComparator.reverseDirection();
						fillDepartmentTable(table);
					}
				});

				// Do the initial fill of the table
				fillDepartmentTable(table);

				// Pack each column so initial display is good
				for (int i = 0, n = columns.length; i < n; i++) {
					columns[i].pack();
				}
			}

			private void createInsuranceHolContents(Composite composite) {
				composite.setLayout(new FillLayout());

				// Create the table
				final Table table = new Table(composite, SWT.NONE);
				table.setHeaderVisible(true);
				table.setLinesVisible(true);

				// Create each of the columns, adding an event
				// listener that will set the appropriate fields
				// into the comparator and then call the fillTable
				// helper method

				TableColumn[] columns = new TableColumn[6];
				columns[0] = new TableColumn(table, SWT.NONE);
				columns[0].setText("Holder ID");
				columns[0].addSelectionListener(new SelectionAdapter() {
					public void widgetSelected(SelectionEvent event) {
						hComparator.setColumn(insuranceHolComparator.HOLDER_ID);
						hComparator.reverseDirection();
						fillInsuranceHolTable(table);
					}
				});

				columns[1] = new TableColumn(table, SWT.RIGHT);
				columns[1].setText("First Name");
				columns[1].addSelectionListener(new SelectionAdapter() {
					public void widgetSelected(SelectionEvent event) {
						hComparator.setColumn(insuranceHolComparator.FIRST_NAME);
						hComparator.reverseDirection();
						fillInsuranceHolTable(table);
					}
				});

				columns[2] = new TableColumn(table, SWT.NONE);
				columns[2].setText("Last Name");
				columns[2].addSelectionListener(new SelectionAdapter() {
					public void widgetSelected(SelectionEvent event) {
						hComparator.setColumn(insuranceHolComparator.LAST_NAME);
						hComparator.reverseDirection();
						fillInsuranceHolTable(table);
					}
				});

				columns[3] = new TableColumn(table, SWT.NONE);
				columns[3].setText("Company ID");
				columns[3].addSelectionListener(new SelectionAdapter() {
					public void widgetSelected(SelectionEvent event) {
						hComparator.setColumn(insuranceHolComparator.CO_ID);
						hComparator.reverseDirection();
						fillInsuranceHolTable(table);
					}
				});

				columns[4] = new TableColumn(table, SWT.RIGHT);
				columns[4].setText("Group Number");
				columns[4].addSelectionListener(new SelectionAdapter() {
					public void widgetSelected(SelectionEvent event) {
						hComparator.setColumn(insuranceHolComparator.GROUP_NO);
						hComparator.reverseDirection();
						fillInsuranceHolTable(table);
					}
				});

				columns[5] = new TableColumn(table, SWT.RIGHT);
				columns[5].setText("Expiration Date");
				columns[5].addSelectionListener(new SelectionAdapter() {
					public void widgetSelected(SelectionEvent event) {
						hComparator.setColumn(insuranceHolComparator.EXP_DATE);
						hComparator.reverseDirection();
						fillInsuranceHolTable(table);
					}
				});

				// Do the initial fill of the table
				fillInsuranceHolTable(table);

				// Pack each column so inital display is good
				for (int i = 0, n = columns.length; i < n; i++) {
					columns[i].pack();
				}
			}

			private void fillPatientTable(Table table) {
				// Turn off drawing to avoid flicker
				table.setRedraw(false);

				// We remove all the table entries, sort our
				// rows, then add the entries
				table.removeAll();
				Collections.sort(patients, pComparator);
				for (Iterator itr = patients.iterator(); itr.hasNext();) {
					patient pat = (patient) itr.next();
					TableItem item = new TableItem(table, SWT.NONE);
					int c = 0;
					item.setText(c++, String.valueOf(pat.getPatID()));
					item.setText(c++, String.valueOf(pat.getApptID()));
					item.setText(c++, pat.getFirstName());
					item.setText(c++, pat.getLastName());
					item.setText(c++, String.valueOf(pat.getBirthdate()));
					item.setText(c++, pat.getAddress());
					item.setText(c++, pat.getEmail());
					item.setText(c++, String.valueOf(pat.getPhoneNo()));
					item.setText(c++, String.valueOf(pat.getInsID()));
					item.setText(c++, String.valueOf(pat.getHolderID()));
				}

				// Turn drawing back on
				table.setRedraw(true);
			}

			private void fillDoctorTable(Table table) {
				// Turn off drawing to avoid flicker
				table.setRedraw(false);

				// We remove all the table entries, sort our
				// rows, then add the entries
				table.removeAll();
				Collections.sort(doctors, doComparator);
				for (Iterator itr = doctors.iterator(); itr.hasNext();) {

					doctor doc = (doctor) itr.next();
					TableItem item = new TableItem(table, SWT.NONE);
					int c = 0;
					item.setText(c++, String.valueOf(doc.getDocID()));
					item.setText(c++, doc.getFirstName());
					item.setText(c++, doc.getLastName());
					item.setText(c++, doc.getSpecialty());
					item.setText(c++, String.valueOf(doc.getDeptID()));
					item.setText(c++, String.valueOf(doc.getPhoneNo()));
					item.setText(c++, doc.getEmail());
				}

				// Turn drawing back on
				table.setRedraw(true);
			}

			private void fillAppointmentTable(Table table) {
				// Turn off drawing to avoid flicker
				table.setRedraw(false);

				// We remove all the table entries, sort our
				// rows, then add the entries
				table.removeAll();
				Collections.sort(appointments, aComparator);
				for (Iterator itr = appointments.iterator(); itr.hasNext();) {

					appointment appt = (appointment) itr.next();
					TableItem item = new TableItem(table, SWT.NONE);
					int c = 0;
					item.setText(c++, String.valueOf(appt.getApptID()));
					item.setText(c++, String.valueOf(appt.getEntryDate()));
					item.setText(c++, String.valueOf(appt.getExitDate()));
					item.setText(c++, appt.getDiagnosis());
					item.setText(c++, String.valueOf(appt.getRoomID()));
					item.setText(c++, String.valueOf(appt.getDocID()));
				}

				// Turn drawing back on
				table.setRedraw(true);
			}

			private void fillRoomTable(Table table) {
				// Turn off drawing to avoid flicker
				table.setRedraw(false);

				// We remove all the table entries, sort our
				// rows, then add the entries
				table.removeAll();
				Collections.sort(rooms, rComparator);
				for (Iterator itr = rooms.iterator(); itr.hasNext();) {

					room rm = (room) itr.next();
					TableItem item = new TableItem(table, SWT.NONE);
					int c = 0;
					item.setText(c++, String.valueOf(rm.getRoomID()));
					item.setText(c++, String.valueOf(rm.getBedsAvailable()));
					item.setText(c++, String.valueOf(rm.getNumPatients()));
					item.setText(c++, String.valueOf(rm.getDeptID()));
				}

				// Turn drawing back on
				table.setRedraw(true);
			}

			private void fillInsuranceCoTable(Table table) {
				// Turn off drawing to avoid flicker
				table.setRedraw(false);

				// We remove all the table entries, sort our
				// rows, then add the entries
				table.removeAll();
				Collections.sort(insuranceCompanies, cComparator);
				for (Iterator itr = insuranceCompanies.iterator(); itr.hasNext();) {

					insuranceCompany insco = (insuranceCompany) itr.next();
					TableItem item = new TableItem(table, SWT.NONE);
					int c = 0;
					item.setText(c++, String.valueOf(insco.getCompanyID()));
					item.setText(c++, insco.getInsName());
					item.setText(c++, insco.getAddress());
					item.setText(c++, String.valueOf(insco.getPhoneNumber()));
				}

				// Turn drawing back on
				table.setRedraw(true);
			}

			private void fillEquipmentTable(Table table) {
				// Turn off drawing to avoid flicker
				table.setRedraw(false);

				// We remove all the table entries, sort our
				// rows, then add the entries
				table.removeAll();
				Collections.sort(equipment, eComparator);
				for (Iterator itr = equipment.iterator(); itr.hasNext();) {

					equipment equip = (equipment) itr.next();
					TableItem item = new TableItem(table, SWT.NONE);
					int c = 0;
					item.setText(c++, String.valueOf(equip.getEquipmentID()));
					item.setText(c++, String.valueOf(equip.getRoomID()));
					item.setText(c++, equip.getName());
				}

				// Turn drawing back on
				table.setRedraw(true);
			}

			private void fillDepartmentTable(Table table) {
				// Turn off drawing to avoid flicker
				table.setRedraw(false);

				// We remove all the table entries, sort our
				// rows, then add the entries
				table.removeAll();
				Collections.sort(departments, deComparator);
				for (Iterator itr = departments.iterator(); itr.hasNext();) {

					department dept = (department) itr.next();
					TableItem item = new TableItem(table, SWT.NONE);
					int c = 0;
					item.setText(c++, String.valueOf(dept.getDeptID()));
					item.setText(c++, String.valueOf(dept.getRoomsAvailable()));
					item.setText(c++, String.valueOf(dept.getRooms()));
					item.setText(c++, String.valueOf(dept.getFloorNo()));
				}

				// Turn drawing back on
				table.setRedraw(true);
			}

			private void fillInsuranceHolTable(Table table) {
				// Turn off drawing to avoid flicker
				table.setRedraw(false);

				// We remove all the table entries, sort our
				// rows, then add the entries
				table.removeAll();
				Collections.sort(insuranceHolders, hComparator);
				for (Iterator itr = insuranceHolders.iterator(); itr.hasNext();) {

					insuranceHolder inshol = (insuranceHolder) itr.next();
					TableItem item = new TableItem(table, SWT.NONE);
					int c = 0;
					item.setText(c++, String.valueOf(inshol.getHolderID()));
					item.setText(c++, inshol.getFirstName());
					item.setText(c++, inshol.getLastName());
					item.setText(c++, String.valueOf(inshol.getCoID()));
					item.setText(c++, String.valueOf(inshol.getGroupNo()));
					item.setText(c++, String.valueOf(inshol.getExpDate()));
				}

				// Turn drawing back on
				table.setRedraw(true);
			}
			
			class patientComparator implements Comparator {

				public static final int PAT_ID = 0;
				public static final int APPT_ID = 1;
				public static final int FIRST_NAME = 2;
				public static final int LAST_NAME = 3;
				public static final int BIRTHDATE = 4;
				public static final int ADDRESS = 5;
				public static final int EMAIL = 6;
				public static final int PHONE_NO = 7;
				public static final int INS_ID = 8;
				public static final int HOLDER_ID = 9;

				/** Constant for ascending */
				public static final int ASCENDING = 0;

				/** Constant for descending */
				public static final int DESCENDING = 1;

				private int column;
				private int direction;

				/**
				 * Compares two Player objects
				 * 
				 * @param obj1
				 *            the first Player
				 * @param obj2
				 *            the second Player
				 * @return int
				 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
				 */
				public int compare(Object obj1, Object obj2) {
					int rc = 0;
					patient p1 = (patient) obj1;
					patient p2 = (patient) obj2;

					// Determine which field to sort on, then sort
					// on that field
					switch (column) {
					case PAT_ID:
						rc = (p1.getPatID() < p2.getPatID()) ? -1 : 1;
						break;
					case APPT_ID:
						rc = (p1.getApptID() < p2.getApptID()) ? -1 : 1;
						break;
					case FIRST_NAME:
						rc = p1.getFirstName().compareTo(p2.getFirstName());
						break;
					case LAST_NAME:
						rc = p1.getLastName().compareTo(p2.getLastName());
						break;
					case BIRTHDATE:
						rc = (p1.getBirthdate() < p2.getBirthdate()) ? -1 : 1;
						break;
					case ADDRESS:
						rc = p1.getAddress().compareTo(p2.getAddress());
						break;
					case EMAIL:
						rc = p1.getEmail().compareTo(p2.getEmail());
						break;
					case PHONE_NO:
						rc = (p1.getPhoneNo() < p2.getPhoneNo()) ? -1 : 1;
						break;
					case INS_ID:
						rc = (p1.getInsID() < p2.getInsID()) ? -1 : 1;
						break;
					case HOLDER_ID:
						rc = (p1.getHolderID() < p2.getHolderID()) ? -1 : 1;
						break;
					}

					// Check the direction for sort and flip the sign
					// if appropriate
					if (direction == DESCENDING) {
						rc = -rc;
					}
					return rc;
				}

				/**
				 * Sets the column for sorting
				 * 
				 * @param column
				 *            the column
				 */
				public void setColumn(int column) {
					this.column = column;
				}

				/**
				 * Sets the direction for sorting
				 * 
				 * @param direction
				 *            the direction
				 */
				public void setDirection(int direction) {
					this.direction = direction;
				}

				/**
				 * Reverses the direction
				 */
				public void reverseDirection() {
					direction = 1 - direction;
				}
			}
			
			class doctorComparator implements Comparator {

				public static final int DOC_ID = 0;
				public static final int FIRST_NAME = 1;
				public static final int LAST_NAME = 2;
				public static final int SPECIALTY = 3;
				public static final int DEPT_ID = 4;
				public static final int PHONE_NO = 5;
				public static final int EMAIL = 6;

				/** Constant for ascending */
				public static final int ASCENDING = 0;

				/** Constant for descending */
				public static final int DESCENDING = 1;

				private int column;
				private int direction;

				/**
				 * Compares two Player objects
				 * 
				 * @param obj1
				 *            the first Player
				 * @param obj2
				 *            the second Player
				 * @return int
				 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
				 */
				public int compare(Object obj1, Object obj2) {
					int rc = 0;
					doctor d1 = (doctor) obj1;
					doctor d2 = (doctor) obj2;

					// Determine which field to sort on, then sort
					// on that field
					switch (column) {
					case DOC_ID:
						rc = (d1.getDocID() < d2.getDocID()) ? -1 : 1;
						break;
					case FIRST_NAME:
						rc = d1.getFirstName().compareTo(d2.getFirstName());
						break;
					case LAST_NAME:
						rc = d1.getLastName().compareTo(d2.getLastName());
						break;
					case SPECIALTY:
						rc = d1.getSpecialty().compareTo(d2.getSpecialty());
						break;
					case DEPT_ID:
						rc = (d1.getDeptID() < d2.getDeptID()) ? -1 : 1;
						break;
					case PHONE_NO:
						rc = (d1.getPhoneNo() < d2.getPhoneNo()) ? -1 : 1;
						break;
					case EMAIL:
						rc = d1.getEmail().compareTo(d2.getEmail());
						break;
					}

					// Check the direction for sort and flip the sign
					// if appropriate
					if (direction == DESCENDING) {
						rc = -rc;
					}
					return rc;
				}

				/**
				 * Sets the column for sorting
				 * 
				 * @param column
				 *            the column
				 */
				public void setColumn(int column) {
					this.column = column;
				}

				/**
				 * Sets the direction for sorting
				 * 
				 * @param direction
				 *            the direction
				 */
				public void setDirection(int direction) {
					this.direction = direction;
				}

				/**
				 * Reverses the direction
				 */
				public void reverseDirection() {
					direction = 1 - direction;
				}
			}

			class appointmentComparator implements Comparator {

				public static final int APPT_ID = 0;
				public static final int ENTRY_DATE = 1;
				public static final int EXIT_DATE = 2;
				public static final int DIAGNOSIS = 3;
				public static final int ROOM_ID = 4;
				public static final int DOC_ID = 5;

				/** Constant for ascending */
				public static final int ASCENDING = 0;

				/** Constant for descending */
				public static final int DESCENDING = 1;

				private int column;
				private int direction;

				/**
				 * Compares two Player objects
				 * 
				 * @param obj1
				 *            the first Player
				 * @param obj2
				 *            the second Player
				 * @return int
				 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
				 */
				public int compare(Object obj1, Object obj2) {
					int rc = 0;
					appointment a1 = (appointment) obj1;
					appointment a2 = (appointment) obj2;

					// Determine which field to sort on, then sort
					// on that field
					switch (column) {
					case APPT_ID:
						rc = (a1.getApptID() < a2.getApptID()) ? -1 : 1;
						break;
					case ENTRY_DATE:
						rc = (a1.getEntryDate() < a2.getEntryDate()) ? -1 : 1;
						break;
					case EXIT_DATE:
						rc = (a1.getExitDate() < a2.getExitDate()) ? -1 : 1;
						break;
					case DIAGNOSIS:
						rc = a1.getDiagnosis().compareTo(a2.getDiagnosis());
						break;
					case ROOM_ID:
						rc = (a1.getRoomID() < a2.getRoomID()) ? -1 : 1;
						break;
					case DOC_ID:
						rc = (a1.getDocID() < a2.getDocID()) ? -1 : 1;
						break;
					}

					// Check the direction for sort and flip the sign
					// if appropriate
					if (direction == DESCENDING) {
						rc = -rc;
					}
					return rc;
				}

				/**
				 * Sets the column for sorting
				 * 
				 * @param column
				 *            the column
				 */
				public void setColumn(int column) {
					this.column = column;
				}

				/**
				 * Sets the direction for sorting
				 * 
				 * @param direction
				 *            the direction
				 */
				public void setDirection(int direction) {
					this.direction = direction;
				}

				/**
				 * Reverses the direction
				 */
				public void reverseDirection() {
					direction = 1 - direction;
				}
			}

			class roomComparator implements Comparator {

				public static final int ROOM_ID = 0;
				public static final int BEDS_AVAILABLE = 1;
				public static final int NUM_PATIENTS = 2;
				public static final int DEPT_ID = 3;

				/** Constant for ascending */
				public static final int ASCENDING = 0;

				/** Constant for descending */
				public static final int DESCENDING = 1;

				private int column;
				private int direction;

				/**
				 * Compares two Player objects
				 * 
				 * @param obj1
				 *            the first Player
				 * @param obj2
				 *            the second Player
				 * @return int
				 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
				 */
				public int compare(Object obj1, Object obj2) {
					int rc = 0;
					room r1 = (room) obj1;
					room r2 = (room) obj2;

					// Determine which field to sort on, then sort
					// on that field
					switch (column) {
					case ROOM_ID:
						rc = (r1.getRoomID() < r2.getRoomID()) ? -1 : 1;
						break;
					case BEDS_AVAILABLE:
						rc = (r1.getBedsAvailable() < r2.getBedsAvailable()) ? -1 : 1;
						break;
					case NUM_PATIENTS:
						rc = (r1.getNumPatients() < r2.getNumPatients()) ? -1 : 1;
						break;
					case DEPT_ID:
						rc = (r1.getDeptID() < r2.getDeptID()) ? -1 : 1;
						break;
					}

					// Check the direction for sort and flip the sign
					// if appropriate
					if (direction == DESCENDING) {
						rc = -rc;
					}
					return rc;
				}

				/**
				 * Sets the column for sorting
				 * 
				 * @param column
				 *            the column
				 */
				public void setColumn(int column) {
					this.column = column;
				}

				/**
				 * Sets the direction for sorting
				 * 
				 * @param direction
				 *            the direction
				 */
				public void setDirection(int direction) {
					this.direction = direction;
				}

				/**
				 * Reverses the direction
				 */
				public void reverseDirection() {
					direction = 1 - direction;
				}
			}

			class equipmentComparator implements Comparator {

				public static final int EQUIPMENT_ID = 0;
				public static final int ROOM_ID = 1;
				public static final int NAME = 2;

				/** Constant for ascending */
				public static final int ASCENDING = 0;

				/** Constant for descending */
				public static final int DESCENDING = 1;

				private int column;
				private int direction;

				/**
				 * Compares two Player objects
				 * 
				 * @param obj1
				 *            the first Player
				 * @param obj2
				 *            the second Player
				 * @return int
				 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
				 */
				public int compare(Object obj1, Object obj2) {
					int rc = 0;
					equipment e1 = (equipment) obj1;
					equipment e2 = (equipment) obj2;

					// Determine which field to sort on, then sort
					// on that field
					switch (column) {
					case EQUIPMENT_ID:
						rc = (e1.getEquipmentID() < e2.getEquipmentID()) ? -1 : 1;
						break;
					case ROOM_ID:
						rc = (e1.getRoomID() < e2.getRoomID()) ? -1 : 1;
						break;
					case NAME:
						rc = e1.getName().compareTo(e2.getName());
						break;
					}

					// Check the direction for sort and flip the sign
					// if appropriate
					if (direction == DESCENDING) {
						rc = -rc;
					}
					return rc;
				}

				/**
				 * Sets the column for sorting
				 * 
				 * @param column
				 *            the column
				 */
				public void setColumn(int column) {
					this.column = column;
				}

				/**
				 * Sets the direction for sorting
				 * 
				 * @param direction
				 *            the direction
				 */
				public void setDirection(int direction) {
					this.direction = direction;
				}

				/**
				 * Reverses the direction
				 */
				public void reverseDirection() {
					direction = 1 - direction;
				}
			}

			class insuranceCoComparator implements Comparator {

				public static final int CO_ID = 0;
				public static final int INS_NAME = 1;
				public static final int ADDRESS = 2;
				public static final int PHONE_NO = 3;

				/** Constant for ascending */
				public static final int ASCENDING = 0;

				/** Constant for descending */
				public static final int DESCENDING = 1;

				private int column;
				private int direction;

				/**
				 * Compares two Player objects
				 * 
				 * @param obj1
				 *            the first Player
				 * @param obj2
				 *            the second Player
				 * @return int
				 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
				 */
				public int compare(Object obj1, Object obj2) {
					int rc = 0;
					insuranceCompany i1 = (insuranceCompany) obj1;
					insuranceCompany i2 = (insuranceCompany) obj2;

					// Determine which field to sort on, then sort
					// on that field
					switch (column) {
					case CO_ID:
						rc = (i1.getCompanyID() < i2.getCompanyID()) ? -1 : 1;
						break;
					case INS_NAME:
						rc = i1.getInsName().compareTo(i2.getInsName());
						break;
					case ADDRESS:
						rc = i1.getAddress().compareTo(i2.getAddress());
						break;
					case PHONE_NO:
						rc = (i1.getPhoneNumber() < i2.getPhoneNumber()) ? -1 : 1;
						break;
					}

					// Check the direction for sort and flip the sign
					// if appropriate
					if (direction == DESCENDING) {
						rc = -rc;
					}
					return rc;
				}

				/**
				 * Sets the column for sorting
				 * 
				 * @param column
				 *            the column
				 */
				public void setColumn(int column) {
					this.column = column;
				}

				/**
				 * Sets the direction for sorting
				 * 
				 * @param direction
				 *            the direction
				 */
				public void setDirection(int direction) {
					this.direction = direction;
				}

				/**
				 * Reverses the direction
				 */
				public void reverseDirection() {
					direction = 1 - direction;
				}
			}

			class departmentComparator implements Comparator {

				public static final int DEPT_ID = 0;
				public static final int ROOMS_AVAILABLE = 1;
				public static final int ROOMS = 2;
				public static final int FLOOR_NO = 3;

				/** Constant for ascending */
				public static final int ASCENDING = 0;

				/** Constant for descending */
				public static final int DESCENDING = 1;

				private int column;
				private int direction;

				/**
				 * Compares two Player objects
				 * 
				 * @param obj1
				 *            the first Player
				 * @param obj2
				 *            the second Player
				 * @return int
				 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
				 */
				public int compare(Object obj1, Object obj2) {
					int rc = 0;
					department d1 = (department) obj1;
					department d2 = (department) obj2;

					// Determine which field to sort on, then sort
					// on that field
					switch (column) {
					case DEPT_ID:
						rc = (d1.getDeptID() < d2.getDeptID()) ? -1 : 1;
						break;
					case ROOMS_AVAILABLE:
						rc = (d1.getRoomsAvailable() < d2.getRoomsAvailable()) ? -1 : 1;
						break;
					case ROOMS:
						rc = (d1.getRooms() < d2.getRooms()) ? -1 : 1;
						break;
					case FLOOR_NO:
						rc = (d1.getFloorNo() < d2.getFloorNo()) ? -1 : 1;
						break;
					}

					// Check the direction for sort and flip the sign
					// if appropriate
					if (direction == DESCENDING) {
						rc = -rc;
					}
					return rc;
				}

				/**
				 * Sets the column for sorting
				 * 
				 * @param column
				 *            the column
				 */
				public void setColumn(int column) {
					this.column = column;
				}

				/**
				 * Sets the direction for sorting
				 * 
				 * @param direction
				 *            the direction
				 */
				public void setDirection(int direction) {
					this.direction = direction;
				}

				/**
				 * Reverses the direction
				 */
				public void reverseDirection() {
					direction = 1 - direction;
				}
			}

			class insuranceHolComparator implements Comparator {

				public static final int HOLDER_ID = 0;
				public static final int FIRST_NAME = 1;
				public static final int LAST_NAME = 2;
				public static final int CO_ID = 3;
				public static final int GROUP_NO = 4;
				public static final int EXP_DATE = 5;

				/** Constant for ascending */
				public static final int ASCENDING = 0;

				/** Constant for descending */
				public static final int DESCENDING = 1;

				private int column;
				private int direction;

				/**
				 * Compares two Player objects
				 * 
				 * @param obj1
				 *            the first Player
				 * @param obj2
				 *            the second Player
				 * @return int
				 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
				 */
				public int compare(Object obj1, Object obj2) {
					int rc = 0;
					insuranceHolder h1 = (insuranceHolder) obj1;
					insuranceHolder h2 = (insuranceHolder) obj2;

					// Determine which field to sort on, then sort
					// on that field
					switch (column) {
					case HOLDER_ID:
						rc = (h1.getHolderID() < h2.getHolderID()) ? -1 : 1;
						break;
					case FIRST_NAME:
						rc = h1.getFirstName().compareTo(h2.getFirstName());
						break;
					case LAST_NAME:
						rc = h1.getLastName().compareTo(h2.getLastName());
						break;
					case CO_ID:
						rc = (h1.getCoID() < h2.getCoID()) ? -1 : 1;
						break;
					case GROUP_NO:
						rc = (h1.getGroupNo() < h2.getGroupNo()) ? -1 : 1;
						break;
					case EXP_DATE:
						rc = (h1.getExpDate() < h2.getExpDate()) ? -1 : 1;
						break;
					}

					// Check the direction for sort and flip the sign
					// if appropriate
					if (direction == DESCENDING) {
						rc = -rc;
					}
					return rc;
				}

				/**
				 * Sets the column for sorting
				 * 
				 * @param column
				 *            the column
				 */
				public void setColumn(int column) {
					this.column = column;
				}

				/**
				 * Sets the direction for sorting
				 * 
				 * @param direction
				 *            the direction
				 */
				public void setDirection(int direction) {
					this.direction = direction;
				}

				/**
				 * Reverses the direction
				 */
				public void reverseDirection() {
					direction = 1 - direction;
				}
			}

		}