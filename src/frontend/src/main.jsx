import React,{useState} from "react";
import {createRoot} from "react-dom/client";
import "./style.css";

function App(){
  const [study,setStudy]=useState(3);
  const [attendance,setAttendance]=useState(82);
  const [assignments,setAssignments]=useState(80);
  const prediction=Math.min(100,Math.round(0.28*study*10+0.3*attendance+0.2*assignments+8));
  const risk=prediction>=75?"Low":prediction>=60?"Medium":"High";
  return <main>
    <header><div><span>AI DIGITAL TWIN</span><h1>Student Performance Dashboard</h1><p>Adaptive academic intelligence based on your latest learning behavior.</p></div><div className="badge">LIVE TWIN</div></header>
    <section className="grid">
      <div className="card hero"><small>PREDICTED PERFORMANCE</small><strong>{prediction}%</strong><p>Updated from current student behavior</p></div>
      <div className="card"><small>RISK LEVEL</small><strong>{risk}</strong><p>Based on current indicators</p></div>
      <div className="card"><small>ATTENDANCE</small><strong>{attendance}%</strong><p>Target: 85%</p></div>
      <div className="card"><small>STUDY HOURS</small><strong>{study}h</strong><p>Daily average</p></div>
    </section>
    <section className="layout">
      <div className="card">
        <h2>Digital Twin State</h2>
        <div className="meter"><div style={{width:`${prediction}%`}}></div></div>
        <p>Your Digital Twin adapts when study behavior, attendance and academic activity change.</p>
      </div>
      <div className="card">
        <h2>AI Recommendations</h2>
        <ul><li>Maintain attendance above 85%.</li><li>Increase focused study time when preparing for assessments.</li><li>Complete pending assignments consistently.</li></ul>
      </div>
    </section>
    <section className="card">
      <h2>What-If Analysis</h2>
      <label>Study Hours: {study}h</label><input type="range" min="1" max="8" step=".5" value={study} onChange={e=>setStudy(+e.target.value)}/>
      <label>Attendance: {attendance}%</label><input type="range" min="50" max="100" value={attendance} onChange={e=>setAttendance(+e.target.value)}/>
      <label>Assignment Completion: {assignments}%</label><input type="range" min="0" max="100" value={assignments} onChange={e=>setAssignments(+e.target.value)}/>
      <div className="whatif">Projected Score <b>{prediction}%</b></div>
    </section>
  </main>
}
createRoot(document.getElementById("root")).render(<App/>);
