import React from 'react';
import { Alert } from '@mui/material';

export default function AlertMessage({ showAlert, alertSeverity, alertMessage, onClose }) {
    return (
        <div>
            {showAlert && (
                <Alert severity={alertSeverity} onClose={onClose}>
                    {alertMessage}
                </Alert>
            )}
        </div>
    );
}